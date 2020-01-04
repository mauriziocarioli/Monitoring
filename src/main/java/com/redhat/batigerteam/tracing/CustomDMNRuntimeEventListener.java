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

import org.kie.dmn.api.core.event.*;

public abstract class CustomDMNRuntimeEventListener implements DMNRuntimeEventListener {

    
    /** 
     * @param event
     */
    public void beforeEvaluateDecision(BeforeEvaluateDecisionEvent event) {
        System.out.println("Decision <<"+event.getDecision().getName()+">> in Model <<"+event.getDecision().getModelName()+">> is about to be evaluated.");
    }

    
    /** 
     * @param event
     */
    public void afterEvaluateDecision(AfterEvaluateDecisionEvent event) {
        System.out.println("Decision <<"+event.getDecision().getName()+">> in Model <<"+event.getDecision().getModelName()+">> has been evaluated.");
    }

    
    /** 
     * @param event
     */
    public void beforeEvaluateBKM(BeforeEvaluateBKMEvent event) {
        System.out.println("Decision <<"+event.getBusinessKnowledgeModel().getName()+">> in Model <<"+event.getBusinessKnowledgeModel().getModelName()+">> is about to be evaluated.");
    }

    
    /** 
     * @param event
     */
    public void afterEvaluateBKM(AfterEvaluateBKMEvent event) {
        System.out.println("Business Knowledge Model <<"+event.getBusinessKnowledgeModel().getName()+">> in Model <<"+event.getBusinessKnowledgeModel().getModelName()+">> has been evaluated.");
    }

    
    /** 
     * @param event
     */
    public void beforeEvaluateContextEntry(BeforeEvaluateContextEntryEvent event) {
        System.out.println("Variable <<"+event.getVariableName()+">> in Node <<"+event.getNodeName()+">> is about to be evaluated.");
    }

    
    /** 
     * @param event
     */
    public void afterEvaluateContextEntry(AfterEvaluateContextEntryEvent event) {
        System.out.println("Variable <<"+event.getVariableName()+">> in Node <<"+event.getNodeName()+">> has been evaluated.");
    }

    
    /** 
     * @param event
     */
    public void beforeEvaluateDecisionTable(BeforeEvaluateDecisionTableEvent event) {
        System.out.println("Decision Table <<"+event.getDecisionTableName()+">> in Node <<"+event.getNodeName()+">> is about to be evaluated.");
    }

    
    /** 
     * @param event
     */
    public void afterEvaluateDecisionTable(AfterEvaluateDecisionTableEvent event) {
        System.out.println("Decision Table <<"+event.getDecisionTableName()+">> in Node <<"+event.getNodeName()+">> has been evaluated.");
    }

    
    /** 
     * @param event
     */
    public void beforeEvaluateDecisionService(BeforeEvaluateDecisionServiceEvent event) {
        System.out.println("Decision Service <<"+event.getDecisionService().getName()+">> in Model <<"+event.getDecisionService().getModelName()+">> is about to be evaluated.");
    }

    
    /** 
     * @param event
     */
    public void afterEvaluateDecisionService(AfterEvaluateDecisionServiceEvent event) {
        System.out.println("Decision Service <<"+event.getDecisionService().getName()+">> in Model <<"+event.getDecisionService().getModelName()+">> has been evaluated.");
    }

}
