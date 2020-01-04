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

import org.jbpm.executor.AsynchronousJobListener;
import org.jbpm.executor.AsynchronousJobEvent;

public abstract class CustomAsynchronousJobListener implements AsynchronousJobListener {

    
    /** 
     * @param event
     */
    public void beforeJobScheduled(AsynchronousJobEvent event) {
        System.out.println("Job <<"+event.getJob().getId()+">> is about to be scheduled.");
    }

    
    /** 
     * @param event
     */
    public void afterJobScheduled(AsynchronousJobEvent event) {
        System.out.println("Job <<"+event.getJob().getId()+">> has been scheduled.");
    }

    
    /** 
     * @param event
     */
    public void beforeJobExecuted(AsynchronousJobEvent event) {
        System.out.println("Job <<"+event.getJob().getId()+">> is about to be executed.");
    }

    
    /** 
     * @param event
     */
    public void afterJobExecuted(AsynchronousJobEvent event) {
        System.out.println("Job <<"+event.getJob().getId()+">> has been executed.");
    }

    
    /** 
     * @param event
     */
    public void beforeJobCanceled(AsynchronousJobEvent event) {
        System.out.println("Job <<"+event.getJob().getId()+">> is about to be canceled.");
    }

    
    /** 
     * @param event
     */
    public void afterJobCanceled(AsynchronousJobEvent event) {
        System.out.println("Job <<"+event.getJob().getId()+">> has been canceled.");
    }

}
