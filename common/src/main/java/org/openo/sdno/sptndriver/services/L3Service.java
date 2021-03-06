/*
 * Copyright 2016-2017 ZTE Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openo.sdno.sptndriver.services;

import com.google.gson.Gson;

import org.openo.sdno.sptndriver.exception.ServerException;
import org.openo.sdno.sptndriver.exception.ServerIoException;
import org.openo.sdno.sptndriver.models.south.SCmdResultAndNcdResRelations;
import org.openo.sdno.sptndriver.models.south.SCommandResultOutput;
import org.openo.sdno.sptndriver.models.south.SL3vpnCreateInput;
import org.openo.sdno.sptndriver.utils.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * L3vpn service CRUD.
 */
public class L3Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(L3Service.class);

    private String baseUrl;

    public L3Service(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * Send REST to controller to create L3vpn.
     *
     * @param l3vpn L3vpn information
     */
    public String createL3vpn(SL3vpnCreateInput l3vpn)
        throws ServerException {
        String printText = "Create l3vpn " + l3vpn.getSncL3vpn().getId();
        LOGGER.debug(printText + " begin. ");
        Gson gson = new Gson();
        LOGGER.debug("Send to controller: " + gson.toJson(l3vpn));
        Retrofit retrofit = ServiceUtil.initRetrofit(baseUrl);
        L3ServiceInterface service = retrofit.create(L3ServiceInterface.class);
        Call<SCmdResultAndNcdResRelations> cmdCall = service.createL3vpn(l3vpn);
        Response<SCmdResultAndNcdResRelations> response;
        try {
            response = cmdCall.execute();
        } catch (IOException ex) {
            throw new ServerIoException(ex);
        }
        ServiceUtil.parseCmdResultAndNcdResRelations(response, LOGGER, printText);
        LOGGER.debug(printText + " end. ");
        return response.body().getCommandResult().getSuccessResources()
            .getSuccessResourceList().get(0).getResouceId();
    }

    /**
     * Send REST to controller to delete L3vpn..
     *
     * @param l3vpnId L3vpn UUID
     */
    public void deleteL3vpn(String l3vpnId)
        throws ServerException {
        String printText = "Delete L3vpn " + l3vpnId;
        LOGGER.debug(printText + " begin. ");
        Retrofit retrofit = ServiceUtil.initRetrofit(baseUrl);
        L3ServiceInterface service = retrofit.create(L3ServiceInterface.class);
        Call<SCommandResultOutput> cmdCall = service.deleteL3vpn(l3vpnId);
        Response<SCommandResultOutput> response;
        try {
            response = cmdCall.execute();
        } catch (IOException ex) {
            throw new ServerIoException(ex);
        }
        ServiceUtil.parseRpcResult(response, LOGGER, printText);
        LOGGER.debug(printText + " end. ");
    }
}
