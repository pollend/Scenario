/*
 * Copyright 2017 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.scenario.internal.events.evaluationEvents;

import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.Event;
import org.terasology.scenario.components.information.ScenarioValueComparatorComponent;
import org.terasology.scenario.internal.systems.ScenarioRootManagementSystem;

/**
 * Event utilized by {@link ScenarioRootManagementSystem} in order to request
 * a value or expression logic entity to be evaluated into a comparator comparison value
 */
public class EvaluateComparatorEvent implements Event {
    private ScenarioValueComparatorComponent.comparison result;
    private EntityRef passedEntity;

    public EvaluateComparatorEvent(EntityRef passed) {
        this.passedEntity = passed;
    }

    public void setResult(ScenarioValueComparatorComponent.comparison result) {
        this.result = result;
    }

    public ScenarioValueComparatorComponent.comparison getResult() {
        return result;
    }

    public void setPassedEntity(EntityRef entity) {
        this.passedEntity = entity;
    }

    public EntityRef getPassedEntity() {
        return passedEntity;
    }
}
