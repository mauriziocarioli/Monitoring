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

import org.optaplanner.core.impl.phase.event.PhaseLifecycleListener;
import org.optaplanner.core.impl.phase.scope.AbstractPhaseScope;
import org.optaplanner.core.impl.phase.scope.AbstractStepScope;
import org.optaplanner.core.impl.solver.scope.DefaultSolverScope;

public abstract class CustomPhaseLifecycleListener implements PhaseLifecycleListener {

    
    /** 
     * @param solverScope
     */
    public void solvingStarted(DefaultSolverScope solverScope) {
        System.out.println("Solving started.");
    }

    
    /** 
     * @param solverScope
     */
    public void solvingEnded(DefaultSolverScope solverScope) {
        System.out.println("Solving ended.");
    }

    
    /** 
     * @param phaseScope
     */
    public void phaseStarted(AbstractPhaseScope phaseScope) {
        System.out.println("Phase started.");
    }

    
    /** 
     * @param phaseScope
     */
    public void phaseEnded(AbstractPhaseScope phaseScope) {
        System.out.println("Phase ended.");
    }

    
    /** 
     * @param stepScope
     */
    public void stepStarted(AbstractStepScope stepScope) {
        System.out.println("Step "+stepScope.getStepIndex()+" started.");
    }

    
    /** 
     * @param stepScope
     */
    public void stepEnded(AbstractStepScope stepScope) {
        System.out.println("Step "+stepScope.getStepIndex()+" ended.");
    }
}
