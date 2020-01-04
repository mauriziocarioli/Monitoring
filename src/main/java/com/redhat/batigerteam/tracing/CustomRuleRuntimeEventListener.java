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

public abstract class CustomRuleRuntimeEventListener implements RuleRuntimeEventListener {

    
    /** 
     * @param event
     * @return 
     */
    public CustomRuleRuntimeEventListener() {}

    
    /** 
     * @param event
     */
    public void objectInserted(ObjectInsertedEvent event) {
        System.out.println(
                "Rule <<"+
                        //event.getRule().getName()+
                        ">> has caused Object ("+
                        //event.getObject().toString()+
                        ") of class <<"+
                        //event.getObject().getClass().getName()+
                        ">> to be inserted."
        );
    }

    
    /** 
     * @param event
     */
    public void objectUpdated(ObjectUpdatedEvent event) {
        System.out.println(
                "Rule <<"+
                        //event.getRule().getName()+
                        ">> has caused Object ("+
                        //event.getObject().toString()+
                        ") of class <<"+
                        //event.getObject().getClass().getName()+
                        ">> to be updated."
        );
    }

    
    /** 
     * @param event
     */
    public void objectDeleted(ObjectDeletedEvent event) {
        System.out.println(
                "Rule <<"+
                        event.getRule().getName()+
                        ">> has caused Object ("+
                        //event.getOldObject().toString()+
                        ") of class <<"+
                        //event.getOldObject().getClass().getName()+
                        ">> to be deleted."
        );
    }

}
