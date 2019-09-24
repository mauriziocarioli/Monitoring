package com.redhat.batigerteam.monitoring;

import org.kie.api.event.process.*;

public abstract class CustomProcessEventListener implements ProcessEventListener {

    
    /** 
     * @param event
     * @return 
     */
    public CustomProcessEventListener() {}

    
    /** 
     * @param event
     */
    public void beforeProcessStarted(ProcessStartedEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] (("+
                        event.getProcessInstance().getId()+
                        ") is about to start."
        );
    }

    
    /** 
     * @param event
     */
    public void afterProcessStarted(ProcessStartedEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] (("+
                        event.getProcessInstance().getId()+
                        ") has started."
        );
    }

    
    /** 
     * @param event
     */
    public void beforeProcessCompleted(ProcessCompletedEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] (("+
                        event.getProcessInstance().getId()+
                        ") is about to complete."
        );
    }

    
    /** 
     * @param event
     */
    public void afterProcessCompleted(ProcessCompletedEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] (("+
                        event.getProcessInstance().getId()+
                        ") has completed.");
    }

    
    /** 
     * @param event
     */
    public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
        System.out.println(
                "Process ["+
                    event.getProcessInstance().getProcessName()+
                    "] ("+
                    event.getProcessInstance().getId()+
                    "] ->Node ["+
                            event.getNodeInstance().getNodeName()+"] ("+
                            event.getNodeInstance().getNodeId()+") (("+
                            event.getNodeInstance().getId()+
                            ")) is about to be triggered.")
        ;
    }

    
    /** 
     * @param event
     */
    public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] ("+
                        event.getProcessInstance().getId()+
                        "] ->Node ["+
                                event.getNodeInstance().getNodeName()+"] ("+
                                event.getNodeInstance().getNodeId()+") (("+
                                event.getNodeInstance().getId()+
                                ")) has been triggered."
        );
    }

    
    /** 
     * @param event
     */
    public void beforeNodeLeft(ProcessNodeLeftEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] ("+
                        event.getProcessInstance().getId()+
                        "] ->Node ["+
                                event.getNodeInstance().getNodeName()+
                                "] ("+
                                event.getNodeInstance().getNodeId()+") (("+
                                event.getNodeInstance().getId()+
                                ")) is about to be left."
        );
    }

    
    /** 
     * @param event
     */
    public void afterNodeLeft(ProcessNodeLeftEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] ("+
                        event.getProcessInstance().getId()+
                        "] ->Node ["+
                                event.getNodeInstance().getNodeName()+
                                "] ("+
                                event.getNodeInstance().getNodeId()+
                                ") (("+
                                event.getNodeInstance().getId()+
                                ")) has been left."
        );
    }

    
    /** 
     * @param event
     */
    public void beforeVariableChanged(ProcessVariableChangedEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] ("+
                        event.getProcessInstance().getId()+
                        "] ->Node ("+
                                event.getVariableId()+
                                ") (("+
                                event.getVariableInstanceId()+
                                ")) is about to be changed."
        );
    }

    
    /** 
     * @param event
     */
    public void afterVariableChanged(ProcessVariableChangedEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] ("+
                        event.getProcessInstance().getId()+
                        "] ->Node ("+
                                event.getVariableId()+
                                ") (("+
                                event.getVariableInstanceId()+
                                ")) has been changed."
        );
    }

    
    /** 
     * @param event
     */
    public void beforeSLAViolated(SLAViolatedEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] ("+
                        event.getProcessInstance().getId()+
                        "] ->Node ["+
                                event.getNodeInstance().getNodeName()+
                                "] ("+
                                event.getNodeInstance().getNodeId()+
                                ") (("+
                                event.getNodeInstance().getId()+
                                ")) SLA is about to be violated."
        );
    }

    
    /** 
     * @param event
     */
    public void afterSLAViolated(SLAViolatedEvent event) {
        System.out.println(
                "Process ["+
                        event.getProcessInstance().getProcessName()+
                        "] ("+
                        event.getProcessInstance().getId()+
                    "] ->Node ["+
                            event.getNodeInstance().getNodeName()+
                            "] ("+
                            event.getNodeInstance().getNodeId()+
                            ") (("+
                            event.getNodeInstance().getId()+
                            ")) SLA has been violated."
        );
    }

}
