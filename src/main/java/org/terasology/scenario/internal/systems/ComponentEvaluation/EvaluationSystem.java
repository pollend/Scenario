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
package org.terasology.scenario.internal.systems.ComponentEvaluation;

import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.ReceiveEvent;
import org.terasology.entitySystem.systems.BaseComponentSystem;
import org.terasology.entitySystem.systems.RegisterMode;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.scenario.components.information.ConstIntegerComponent;
import org.terasology.scenario.components.information.ConstStringComponent;
import org.terasology.scenario.internal.events.evaluationEvents.EvaluateIntEvent;
import org.terasology.scenario.internal.events.evaluationEvents.EvaluateStringEvent;

/**
 * Currently just 1 system, will be split up if there becomes too many events that warrant seperation by type
 */
@RegisterSystem(RegisterMode.AUTHORITY)
public class EvaluationSystem extends BaseComponentSystem {

    @ReceiveEvent
    public void onEvaluateIntEvent(EvaluateIntEvent event, EntityRef entity, ConstIntegerComponent component) {
        event.setResult(component.value);
    }

    @ReceiveEvent
    public void onEvaluateStringEvent(EvaluateStringEvent event, EntityRef entity, ConstStringComponent component) {
        event.setResult(component.string);
    }
}