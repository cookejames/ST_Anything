/**
 *  Child Power Sensor
 *
 *  Copyright 2017 James Cooke
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 *  Change History:
 *
 *    Date        Who            What
 *    ----        ---            ----
 *    2017-06-08  James Cooke  Original Creation
 *
 *
 */
metadata {
	definition (name: "Child Power Sensor", namespace: "ogiewon", author: "James Cooke") {
		capability "Energy Meter"
		capability "Power Meter"
	}

	tiles(scale: 2) {
		multiAttributeTile(name: "power", type: "generic", width: 6, height: 4, canChangeIcon: true) {
			tileAttribute("device.power", key: "PRIMARY_CONTROL") {
                attributeState("power", label:'${currentValue}W', unit:"W", defaultState: true)
    		}
		}
	}
}
