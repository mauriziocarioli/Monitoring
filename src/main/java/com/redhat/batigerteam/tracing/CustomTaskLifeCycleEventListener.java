/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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

import org.kie.api.task.TaskLifeCycleEventListener;
import org.kie.api.task.TaskEvent;

public abstract class CustomTaskLifeCycleEventListener implements TaskLifeCycleEventListener
{

    
    /** 
     * @param event
     * @return 
     */
    public CustomTaskLifeCycleEventListener() {}

    //****************************/
    //** TASK ACTIVATION EVENTS **/
    //****************************/

    /** 
     * @param event
     */
    public void beforeTaskActivatedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to be activated.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskActivatedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has been activated.");
    }

    //****************************/
    //** TASK ASSIGNMENT EVENTS **/
    //****************************/

    /** 
     * @param event
     */
    public void beforeTaskClaimedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to be claimed.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskClaimedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has been claimed.");
    }

    
    /** 
     * @param event
     */
    public void beforeTaskReleasedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to be released.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskReleasedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has been released.");
    }

    
    /** 
     * @param event
     */
    public void beforeTaskReassignedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to be reassigned.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskReassignedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has been reassigned.");
    }

    
    /** 
     * @param event
     */
    public void beforeTaskForwardedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to be forwarded.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskForwardedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has been forwarded.");
    }

    
    /** 
     * @param event
     */
    public void beforeTaskDelegatedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to be delegated.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskDelegatedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has been delegated.");
    }

    
    /** 
     * @param event
     */
    public void beforeTaskNominatedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to be nominated.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskNominatedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has been nominated.");
    }

    //***************************/
    //** TASK EXECUTION EVENTS **/
    //***************************/

    /** 
     * @param event
     */
    public void beforeTaskStartedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to start.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskStartedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has started.");
    }

    
    /** 
     * @param event
     */
    public void beforeTaskCompletedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to complete.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskCompletedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has completed.");
    }

    
    /** 
     * @param event
     */
    public void beforeTaskExitedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to exit.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskExitedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has exited.");
    }

    
    /** 
     * @param event
     */
    public void beforeTaskSuspendedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to be suspended.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskSuspendedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has been suspended.");
    }

    
    /** 
     * @param event
     */
    public void beforeTaskResumedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to resume.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskResumedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has resumed.");
    }

    
    /** 
     * @param event
     */
    public void beforeTaskStoppedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about stop.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskStoppedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") has stopped.");
    }

    
    /** 
     * @param event
     */
    public void beforeTaskSkippedEvent(TaskEvent event) {
        System.out.println("Human Task <<"+event.getTask().getName()+">>-("+event.getTask().getId()+") is about to be skipped.");
    }

    
    /** 
     * @param event
     */
    public void afterTaskSkippedEvent(TaskEvent event) {
        System.out.println(
                "Human Task <<"+
                        event.getTask().getName()+
                        ">>-("
                        +event.getTask().getId()+
                        ") has been skipped."
        );
    }

    
    /** 
     * @param event
     */
    public void beforeTaskFailedEvent(TaskEvent event) {
        System.out.println(
                "Human Task <<"+
                        event.getTask().getName()+
                        ">>-("+
                        event.getTask().getId()+
                        ") is about to fail."
        );
    }

    
    /** 
     * @param event
     */
    public void afterTaskFailedEvent(TaskEvent event) {
        System.out.println(
                "Human Task <<"
                        +event.getTask().getName()+
                        ">>-("
                        +event.getTask().getId()+
                        ") has failed."
        );
    }

    //*************************/
    //** NOTIFICATION EVENTS **/
    //*************************/

    /** 
     * @param event
     */
    public void beforeTaskNotificationEvent(TaskEvent event) {
        System.out.println(
                "Human Task <<"+
                        event.getTask().getName()+
                        ">>-("+
                        event.getTask().getId()+
                        ") is about to be notified."
        );
    }

    
    /** 
     * @param event
     */
    public void afterTaskNotificationEvent(TaskEvent event) {
        System.out.println(
                "Human Task <<"+
                        event.getTask().getName()+
                        ">>-("
                        +event.getTask().getId()+
                        ") has been notified."
        );
    }

    //********************/
    //** EDITING EVENTS **/
    //********************/

    /** 
     * @param event
     */
    public void beforeTaskUpdatedEvent(TaskEvent event)
    {
        System.out.println(
                "Human Task <<"+
                        event.getTask().getName()+
                        ">>-("+
                        event.getTask().getId()+
                        ") is about to be updated."
        );
    }

    
    /** 
     * @param event
     */
    public void afterTaskUpdatedEvent(TaskEvent event)
    {
        System.out.println(
                "Human Task <<"+
                        event.getTask().getName()+
                        ">>-("+
                        event.getTask().getId()+
                        ") has been updated.");
    }

    
    /** 
     * @param event
     */
    public void beforeTaskAddedEvent(TaskEvent event) {
        System.out.println(
                "Human Task <<"+
                        event.getTask().getName()+
                        ">>-("+
                        event.getTask().getId()+
                        ") is about to be added."
        );
    }

    
    /** 
     * @param event
     */
    public void afterTaskAddedEvent(TaskEvent event) {
        System.out.println(
                "Human Task <<"+
                        event.getTask().getName()+
                        ">>-("+
                        event.getTask().getId()+
                        ") has been added."
        );
    }

}
