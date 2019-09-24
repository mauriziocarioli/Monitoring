package com.redhat.batigerteam.monitoring;

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
                "Rule ["+
                        //event.getRule().getName()+
                        "] has caused Object ("+
                        //event.getObject().toString()+
                        ") of class ["+
                        //event.getObject().getClass().getName()+
                        "] to be inserted."
        );
    }

    
    /** 
     * @param event
     */
    public void objectUpdated(ObjectUpdatedEvent event) {
        System.out.println(
                "Rule ["+
                        //event.getRule().getName()+
                        "] has caused Object ("+
                        //event.getObject().toString()+
                        ") of class ["+
                        //event.getObject().getClass().getName()+
                        "] to be updated."
        );
    }

    
    /** 
     * @param event
     */
    public void objectDeleted(ObjectDeletedEvent event) {
        System.out.println(
                "Rule ["+
                        event.getRule().getName()+
                        "] has caused Object ("+
                        //event.getOldObject().toString()+
                        ") of class ["+
                        //event.getOldObject().getClass().getName()+
                        "] to be deleted."
        );
    }

}
