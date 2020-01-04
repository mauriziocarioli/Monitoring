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

import org.kie.api.event.rule.*;

public abstract class CustomAgendaEventListener implements AgendaEventListener {
    
    /** 
     * @param event
     * @return 
     */
    public CustomAgendaEventListener() {}

    //****************/
    //* Match Events */
    //****************/

    /** 
     * @param event
     */
    public void matchCreated(MatchCreatedEvent event) {
        System.out.println(
                "Match with Rule <<"+
                        event.getMatch().getRule().getName()+
                        ">> was created."
        );
    }
    
    /** 
     * @param event
     */
    public void matchCancelled(MatchCancelledEvent event) {
        System.out.println(
                "Match with Rule <<"+
                        event.getMatch().getRule().getName()+
                        ">> was cancelled."
        );
    }
    
    /** 
     * @param event
     */
    public void beforeMatchFired(BeforeMatchFiredEvent event) {
        System.out.println(
                "Match with Rule <<"+
                        event.getMatch().getRule().getName()+
                        ">> is about to fire."
        );
    }
    
    /** 
     * @param event
     */
    public void afterMatchFired(AfterMatchFiredEvent event) {
        System.out.println("Match with Rule <<"+
                event.getMatch().getRule().getName()+
                ">> has fired."
        );
    }

    //***********************/
    //* Agenda Group Events */
    //***********************/

    /** 
     * @param event
     */
    public void agendaGroupPopped(AgendaGroupPoppedEvent event) {
        System.out.println(
                "Agenda Group <<"+
                        event.getAgendaGroup().getName()+
                        ">> has been popped."
        );
    }
    
    /** 
     * @param event
     */
    public void agendaGroupPushed(AgendaGroupPushedEvent event) {
        System.out.println("Agenda Group <<"+
                event.getAgendaGroup().getName()+
                ">> has been pushed."
        );
    }

    //**************************/
    //* Rule Flow Group Events */
    //**************************/

    /** 
     * @param event
     */
    public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        System.out.println(
                "Rule Flow Group <<"+
                        event.getRuleFlowGroup().getName()+
                        ">> is about to be activated."
        );
    }
    
    /** 
     * @param event
     */
    public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        System.out.println(
                "Rule Flow Group <<"+
                        event.getRuleFlowGroup().getName()+
                        ">> has been activated."
        );
    }
    
    /** 
     * @param event
     */
    public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        System.out.println(
                "Rule Flow Group <<"+
                        event.getRuleFlowGroup().getName()+
                        ">> is about to be deactivated."
        );
    }
    
    /** 
     * @param event
     */
    public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        System.out.println(
                "Rule Flow Group <<"+
                        event.getRuleFlowGroup().getName()+
                        ">> has been deactivated."
        );
    }

}
