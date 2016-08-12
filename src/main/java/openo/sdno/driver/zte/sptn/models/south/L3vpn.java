/**
 * SDN-O SPTN Controller Driver SBI Interface
 * SDN-O SPTN Controller Driver SBI Interface
 *
 * OpenAPI spec version: 0.1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package openo.sdno.driver.zte.sptn.models.south;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


/**
 * L3vpn
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen",
                            date = "2016-08-12T10:40:00.335+08:00")
public class L3vpn {

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("user-label")
  private String userLabel = null;

  @SerializedName("parent-ncd-id")
  private String parentNcdId = null;

  @SerializedName("admin-status")
  private AdminStatus adminStatus = null;

  @SerializedName("operate-status")
  private OperateStatus operateStatus = null;

  @SerializedName("ac-list")
  private List<L3ac> acList = new ArrayList<L3ac>();

  @SerializedName("bind-relation-list")
  private List<L3BindRelation> bindRelationList = new ArrayList<L3BindRelation>();

  @SerializedName("static-route-list")
  private List<StaticRoute> staticRouteList = new ArrayList<StaticRoute>();

  @SerializedName("traffic-class")
  private Integer trafficClass = null;

  public L3vpn id(String id) {
    this.id = id;
    return this;
  }

  /**
   * L3vpn UUID
   *
   * @return id
   */
  @ApiModelProperty(example = "null", value = "L3vpn UUID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public L3vpn name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Only used withen domain
   *
   * @return name
   */
  @ApiModelProperty(example = "null", value = "Only used withen domain")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public L3vpn userLabel(String userLabel) {
    this.userLabel = userLabel;
    return this;
  }

  /**
   * User Label of L3vpn
   *
   * @return userLabel
   */
  @ApiModelProperty(example = "null", value = "User Label of L3vpn")
  public String getUserLabel() {
    return userLabel;
  }

  public void setUserLabel(String userLabel) {
    this.userLabel = userLabel;
  }

  public L3vpn parentNcdId(String parentNcdId) {
    this.parentNcdId = parentNcdId;
    return this;
  }

  /**
   * UUID of parent ncd, is empty for driver
   *
   * @return parentNcdId
   */
  @ApiModelProperty(example = "null", value = "UUID of parent ncd, is empty for driver")
  public String getParentNcdId() {
    return parentNcdId;
  }

  public void setParentNcdId(String parentNcdId) {
    this.parentNcdId = parentNcdId;
  }

  public L3vpn adminStatus(AdminStatus adminStatus) {
    this.adminStatus = adminStatus;
    return this;
  }

  /**
   * Get adminStatus
   *
   * @return adminStatus
   */
  @ApiModelProperty(example = "null", value = "")
  public AdminStatus getAdminStatus() {
    return adminStatus;
  }

  public void setAdminStatus(AdminStatus adminStatus) {
    this.adminStatus = adminStatus;
  }

  public L3vpn operateStatus(OperateStatus operateStatus) {
    this.operateStatus = operateStatus;
    return this;
  }

  /**
   * Get operateStatus
   *
   * @return operateStatus
   */
  @ApiModelProperty(example = "null", value = "")
  public OperateStatus getOperateStatus() {
    return operateStatus;
  }

  public void setOperateStatus(OperateStatus operateStatus) {
    this.operateStatus = operateStatus;
  }

  public L3vpn acList(List<L3ac> acList) {
    this.acList = acList;
    return this;
  }

  /**
   * Get acList
   *
   * @return acList
   */
  @ApiModelProperty(example = "null", value = "")
  public List<L3ac> getAcList() {
    return acList;
  }

  public void setAcList(List<L3ac> acList) {
    this.acList = acList;
  }

  public L3vpn bindRelationList(List<L3BindRelation> bindRelationList) {
    this.bindRelationList = bindRelationList;
    return this;
  }

  /**
   * Get bindRelationList
   *
   * @return bindRelationList
   */
  @ApiModelProperty(example = "null", value = "")
  public List<L3BindRelation> getBindRelationList() {
    return bindRelationList;
  }

  public void setBindRelationList(List<L3BindRelation> bindRelationList) {
    this.bindRelationList = bindRelationList;
  }

  public L3vpn staticRouteList(List<StaticRoute> staticRouteList) {
    this.staticRouteList = staticRouteList;
    return this;
  }

  /**
   * Get staticRouteList
   *
   * @return staticRouteList
   */
  @ApiModelProperty(example = "null", value = "")
  public List<StaticRoute> getStaticRouteList() {
    return staticRouteList;
  }

  public void setStaticRouteList(List<StaticRoute> staticRouteList) {
    this.staticRouteList = staticRouteList;
  }

  public L3vpn trafficClass(Integer trafficClass) {
    this.trafficClass = trafficClass;
    return this;
  }

  /**
   * The traffic class, including 0(BE), 1(AF1), 2(AF2), 3(AF3), 4(AF4), 5(AF5), 6(CS6), 7(CS7)
   *
   * @return trafficClass
   */
  @ApiModelProperty(example = "null",
                    value = "The traffic class, including 0(BE), 1(AF1), 2(AF2), 3(AF3), 4(AF4), 5(AF5), 6(CS6), 7(CS7)")
  public Integer getTrafficClass() {
    return trafficClass;
  }

  public void setTrafficClass(Integer trafficClass) {
    this.trafficClass = trafficClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L3vpn l3vpn = (L3vpn) o;
    return Objects.equals(this.id, l3vpn.id) &&
           Objects.equals(this.name, l3vpn.name) &&
           Objects.equals(this.userLabel, l3vpn.userLabel) &&
           Objects.equals(this.parentNcdId, l3vpn.parentNcdId) &&
           Objects.equals(this.adminStatus, l3vpn.adminStatus) &&
           Objects.equals(this.operateStatus, l3vpn.operateStatus) &&
           Objects.equals(this.acList, l3vpn.acList) &&
           Objects.equals(this.bindRelationList, l3vpn.bindRelationList) &&
           Objects.equals(this.staticRouteList, l3vpn.staticRouteList) &&
           Objects.equals(this.trafficClass, l3vpn.trafficClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, userLabel, parentNcdId, adminStatus, operateStatus, acList,
                        bindRelationList, staticRouteList, trafficClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L3vpn {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userLabel: ").append(toIndentedString(userLabel)).append("\n");
    sb.append("    parentNcdId: ").append(toIndentedString(parentNcdId)).append("\n");
    sb.append("    adminStatus: ").append(toIndentedString(adminStatus)).append("\n");
    sb.append("    operateStatus: ").append(toIndentedString(operateStatus)).append("\n");
    sb.append("    acList: ").append(toIndentedString(acList)).append("\n");
    sb.append("    bindRelationList: ").append(toIndentedString(bindRelationList)).append("\n");
    sb.append("    staticRouteList: ").append(toIndentedString(staticRouteList)).append("\n");
    sb.append("    trafficClass: ").append(toIndentedString(trafficClass)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first
   * line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

