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
package org.terasology.scenario.components;

import org.terasology.entitySystem.Component;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.network.FieldReplicateType;
import org.terasology.network.Replicate;

/**
 * Component that lets the client know that the scenario entity was updated and therefore it should redraw on the next update
 */
public class ScenarioHubToolUpdateComponent implements Component {
    @Replicate(FieldReplicateType.SERVER_TO_CLIENT)
    public boolean dirtyLogic = true;

    @Replicate(FieldReplicateType.SERVER_TO_CLIENT)
    public boolean dirtyRegions = true;

    @Replicate(FieldReplicateType.SERVER_TO_CLIENT)
    public EntityRef addedEntity;
}