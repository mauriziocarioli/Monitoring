/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License">;
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.batigerteam.tracing;

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
                "Process <<"+
                        event.getProcessInstance().getProcessName()+
                        ">>-<"+
                        event.getProcessInstance().getId()+
                        "> is about to start."
        );
    }

    
    /** 
     * @param event
     */
    public void afterProcessStarted(ProcessStartedEvent event) {
        System.out.println(
                "Process <<"+
                        event.getProcessInstance().getProcessName()+
                        ">>-<"+
                        event.getProcessInstance().getId()+
                        "> has started."
        );
    }

    
    /** 
     * @param event
     */
    public void beforeProcessCompleted(ProcessCompletedEvent event) {
        System.out.println(
                "Process <<"+
                        event.getProcessInstance().getProcessName()+
                        ">>-<"+
                        event.getProcessInstance().getId()+
                        "> is about to complete."
        );
    }

    
    /** 
     * @param event
     */
    public void afterProcessCompleted(ProcessCompletedEvent event) {
        System.out.println(
                "Process <<"+
                        event.getProcessInstance().getProcessName()+
                        ">>-<"+
                        event.getProcessInstance().getId()+
                        "> has completed."
        );
    }

    
    /** 
     * @param event
     */
    public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
        System.out.println(
                "Process <<"+
                    event.getProcessInstance().getProcessName()+
                    ">>-<"+
                    event.getProcessInstance().getId()+
                    "> ->Node <<"+
                            event.getNodeInstance().getNodeName()+">>-<"+
                            event.getNodeInstance().getNodeId()+">-<"+
                            event.getNodeInstance().getId()+
                            "> is about to be triggered."
        );
    }

    
    /** 
     * @param event
     */
    public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
        System.out.println(
                "Process <<"+
                        event.getProcessInstance().getProcessName()+
                        ">>-<"+
                        event.getProcessInstance().getId()+
                        "> ->Node <<"+
                                event.getNodeInstance().getNodeName()+">>-<"+
                                event.getNodeInstance().getNodeId()+">-<"+
                                event.getNodeInstance().getId()+
                                "> has been triggered."
        );
    }

    
    /** 
     * @param event
     */
    public void beforeNodeLeft(ProcessNodeLeftEvent event) {
        System.out.println(
                "Process <<"+
                        event.getProcessInstance().getProcessName()+
                        ">>-<"+
                        event.getProcessInstance().getId()+
                        "> ->Node <<"+
                                event.getNodeInstance().getNodeName()+">>-<"+
                                event.getNodeInstance().getNodeId()+">-<"+
                                event.getNodeInstance().getId()+
                                "> is about to be left."
        );
    }

    
    /** 
     * @param event
     */
    public void afterNodeLeft(ProcessNodeLeftEvent event) {
        System.out.println(
                "Process <<"+
                        event.getProcessInstance().getProcessName()+
                        ">>-<"+
                        event.getProcessInstance().getId()+
                        "> ->Node <<"+
                                event.getNodeInstance().getNodeName()+">>-<"+
                                event.getNodeInstance().getNodeId()+">-<"+
                                event.getNodeInstance().getId()+
                                "> has been left."
        );
    }

    
    /** 
     * @param event
     */
    public void beforeVariableChanged(ProcessVariableChangedEvent event) {
        System.out.println(
                "Process <<"+
                        event.getProcessInstance().getProcessName()+
                        ">>-<"+
                        event.getProcessInstance().getId()+
                        "> ->Variable <"+
                                event.getVariableId()+">-<"+
                                event.getVariableInstanceId()+"> is about to be changed."
        );
    }

    
    /** 
     * @param event
     */
    public void afterVariableChanged(ProcessVariableChangedEvent event) {
        System.out.println(
                "Process <<"+
                        event.getProcessInstance().getProcessName()+
                        ">>-<"+
                        event.getProcessInstance().getId()+
                        ">> ->Variable <"+
                                event.getVariableId()+">-<"+
                                event.getVariableInstanceId()+
                                "> has been changed."
        );
    }

    
    /** 
     * @param event
     */
    public void beforeSLAViolated(SLAViolatedEvent event) {
        System.out.println(
                "Process <<"+
                        event.getProcessInstance().getProcessName()+
                        ">>-<"+
                        event.getProcessInstance().getId()+
                        "> ->SLA <<"+
                                event.getNodeInstance().getNodeName()+">>-<"+
                                event.getNodeInstance().getNodeId()+">-<"+
                                event.getNodeInstance().getId()+
                                "> SLA is about to be violated."
        );
    }

    
    /** 
     * @param event
     */
    public void afterSLAViolated(SLAViolatedEvent event) {
        System.out.println(
                "Process <<"+
                        event.getProcessInstance().getProcessName()+
                        ">>-<"+
                        event.getProcessInstance().getId()+
                    "> ->SLA <<"+
                            event.getNodeInstance().getNodeName()+">>-<"+
                            event.getNodeInstance().getNodeId()+">-<"+
                            event.getNodeInstance().getId()+
                            "> SLA has been violated."
        );
    }

}
