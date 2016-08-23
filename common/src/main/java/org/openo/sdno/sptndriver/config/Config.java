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

package org.openo.sdno.sptndriver.config;


import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.validator.constraints.NotEmpty;

import io.dropwizard.Configuration;

public class Config extends Configuration {

  @JsonProperty
  @NotEmpty
  private String controllerUrl;

  public String getControllerUrl() {
    return controllerUrl;
  }
}