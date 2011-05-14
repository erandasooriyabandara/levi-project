package org.levi.engine.impl.bpmn;


import org.levi.engine.bpmn.RunnableFlowNode;
import org.levi.engine.runtime.ProcessInstance;
import org.omg.spec.bpmn.x20100524.model.TUserTask;

/**
 * @author Ishan Jayawardena
 */
public class UserTask extends RunnableFlowNode {
    private final TUserTask task;
    private final ProcessInstance processInstance;

    public static class Builder {
        private FlowNodeFactory flowNodeFac;
        private TUserTask task;
        private ProcessInstance process;

        public Builder(TUserTask task) {
            this.task = task;
        }
        public Builder processInstance(ProcessInstance process) {
            this.process = process;
            return this;
        }
        public UserTask build() {
            return new UserTask(this);
        }
    }
    private UserTask(Builder builder) {
        this.task = builder.task;
        this.processInstance = builder.process;
    }

    public void run() {
        processInstance.addRunning(getId());
        // get the details
        System.out.println("UserTask run(): Getting the task details.");
        // write them to the db
        System.out.println("UserTask run(): Wrote details to the db.");
        // see if a form is there
        System.out.println("UserTask run(): Checking for an input form.");
        // if yes then create a waitedtask and wait for it
        System.out.println("UserTask run(): Creating the waited task for the form.");
        System.out.println("UserTask run(): Waiting for the form reply...");
        //WaitedTaskChannel channel = newChannel(WaitedTaskChannel.class, "channel");
        //WaitedTask task = new WaitedTask(channel);
        //processInstance.addWaitedTask(getId(), task);
        //instance(task);
        // todo:
        if (true) {
            processInstance.pause(getId());
        } else {
            resumeTask();
        }
        /*
        object(new WaitedTaskChannelListener(channel) {
            @Override
            public void resume(Map<String, Object> vars) {
                System.out.println("UserTask run(). done." + vars.toString());
                System.out.println("UserTask run(). saving the variables.");
                processInstance.getVariables().putAll(vars);
                resumeTask();
            }
        }); */


    }

    public String getId() {
        return task.getId();
    }

    public void resumeTask() {
        // todo this is what must happen when
        // processInstance.getVariables().putAll(vars);
        System.out.println("Resuming user task id " + getId());
        instance(processInstance.executeNext(this));
        processInstance.addCompleted(getId());
    }
}
