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

package org.openo.sdno.sptndriver.services;


import org.openo.sdno.sptndriver.models.south.brs.SME;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface ISNEService {

  @GET("restconf/data/sptn-resources-module:resources/nes/ne-list/ne={id}")
  Call<SME> getNeByID(@Path("id") String neid);
}
