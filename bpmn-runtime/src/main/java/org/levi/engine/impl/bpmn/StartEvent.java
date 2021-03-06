package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.Event;
import org.levi.engine.db.DBManager;
import org.levi.engine.impl.db.DBManagerImpl;
import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.LeviUtils;
import org.omg.spec.bpmn.x20100524.model.TStartEvent;

/**
 * @author Ishan Jayawardena
 */
public class StartEvent extends Event {
    private final ProcessInstance processInstance;
    private final TStartEvent startEvent;
    private final boolean hasInputForm;

    public static class Builder {
        private ProcessInstance process;
        private TStartEvent se;

        public Builder(TStartEvent startEvent) {
            this.se = startEvent;
        }

        public Builder processInstance(ProcessInstance process) {
            this.process = process;
            return this;
        }

        public StartEvent build() {
            return new StartEvent(this);
        }
    }

    private StartEvent(Builder builder) {
        this.startEvent = builder.se;
        this.processInstance = builder.process;
        hasInputForm = startEvent.getInputForm() != null;
        // todo check and write the input form data
        if (hasInputForm()) {
            persistStartEvent(this);
        }
    }

    private void persistStartEvent(StartEvent startEvent) {
        //TODO rename this to Persist()
        DBManager manager = new DBManagerImpl();
        manager.persistStartEvent(this);
    }


    public String getId() {
        return LeviUtils.combineTaskId(processInstance.getProcessId(), startEvent.getId());
    }

    public String getName() {
        return startEvent.getName();
    }

    public TStartEvent getTStartEvent() {
        return startEvent;
    }

    public ProcessInstance getProcessInstance() {
        return processInstance;
    }

    public void run() {
        // todo see if a form is present and pause accordingly
        processInstance.run(this.getId());
        if (hasInputForm()) {
            processInstance.pause(this.getId());
        } else {
            resumeTask();
        }
        //processInstance.run(getTaskId());
        //resumeTask();
    }

    public void resumeTask() {
        instance(processInstance.executeNext(this));
        processInstance.complete(getId());
    }

    public boolean hasInputForm() {
        return hasInputForm;
    }

    public String toString() {
        String out = "{";
        out += "startEvent: " + startEvent;
        out += "}";
        return out;
    }
}