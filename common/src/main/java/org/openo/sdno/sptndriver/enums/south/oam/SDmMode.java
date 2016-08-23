/*
 * Copyright (C) 2016 ZTE, Inc. and others. All rights reserved. (ZTE)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.openo.sdno.sptndriver.enums.south.oam;

public enum SDmMode {
  disable(0),
  preactive(1),
  on_demand(2);
  private Integer value;

  SDmMode(Integer value) {
    this.value = value;
  }

  public String toString() {
    return String.valueOf(value);
  }
}