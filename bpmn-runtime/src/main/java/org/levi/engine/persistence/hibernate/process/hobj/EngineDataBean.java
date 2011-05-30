package org.levi.engine.persistence.hibernate.process.hobj;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CollectionOfElements;
import org.levi.engine.Deployment;
import org.levi.engine.persistence.hibernate.HObject;
import org.levi.engine.runtime.ProcessInstance;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: May 27, 2011
 * Time: 12:53:22 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "enginedata")
public class EngineDataBean extends HObject {

    private String id;
    private Map<String, Deployment> deployments;
    private int nDeployments;
    private List<String> deploymentPIds;
    private int nDeploymentPIds;
    private Map<String, ProcessInstance>  runningProcesses;
    private int nRunningProcesses;
    private Map<String, ProcessInstance> stoppedProcesses;
    private Map<String, ProcessInstance> pausedProcesses;
    private List<String> runningProcessIds;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @OneToMany(targetEntity = DeploymentBean.class)
	@JoinTable( name="deploymentdata",joinColumns={ @JoinColumn(name="id")})
    public Map<String, Deployment> getDeployments() {
        return deployments;
    }

    public void setDeployments(Map<String, Deployment> deployments) {
        this.deployments = deployments;
    }

    public int getnDeployments() {
        return nDeployments;
    }

    public void setnDeployments(int nDeployments) {
        this.nDeployments = nDeployments;
    }

    @CollectionOfElements
	@Cascade({org.hibernate.annotations.CascadeType.ALL, org.hibernate.annotations.CascadeType.DELETE_ORPHAN})
	@JoinTable( name="deploymentpids",joinColumns={ @JoinColumn(name="id")})
    public List<String> getDeploymentPIds() {
        return deploymentPIds;
    }

    public void setDeploymentPIds(List<String> deploymentPIds) {
        this.deploymentPIds = deploymentPIds;
    }

    public int getnDeploymentPIds() {
        return nDeploymentPIds;
    }

    public void setnDeploymentPIds(int nDeploymentPIds) {
        this.nDeploymentPIds = nDeploymentPIds;
    }

    public int getnRunningProcesses() {
        return nRunningProcesses;
    }

    public void setnRunningProcesses(int nRunningProcesses) {
        this.nRunningProcesses = nRunningProcesses;
    }

    @OneToMany(targetEntity = ProcessInstanceBean.class)
	@JoinTable( name="processinstancedata",joinColumns={ @JoinColumn(name="id")})
    public Map<String, ProcessInstance> getRunningProcesses() {
        return runningProcesses;
    }

    public void setRunningProcesses(Map<String, ProcessInstance> runningProcesses) {
        this.runningProcesses = runningProcesses;
    }

    @OneToMany(targetEntity = ProcessInstanceBean.class)
	@JoinTable( name="stoppedprocessinstancedata",joinColumns={ @JoinColumn(name="id")})
    public Map<String, ProcessInstance> getStoppedProcesses() {
        return stoppedProcesses;
    }

    public void setStoppedProcesses(Map<String, ProcessInstance> stoppedProcesses) {
        this.stoppedProcesses = stoppedProcesses;
    }

    @OneToMany(targetEntity = ProcessInstanceBean.class)
	@JoinTable( name="pausedprocessinstancedata",joinColumns={ @JoinColumn(name="id")})
    public Map<String, ProcessInstance> getPausedProcesses() {
        return pausedProcesses;
    }

    public void setPausedProcesses(Map<String, ProcessInstance> pausedProcesses) {
        this.pausedProcesses = pausedProcesses;
    }

    @Transient
    public List<String> getRunningProcessIds() {
        return runningProcessIds;
    }

    public void setRunningProcessIds(List<String> runningProcessIds) {
        this.runningProcessIds = runningProcessIds;
    }
}