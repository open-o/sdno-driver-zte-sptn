/**
 * L3VpnService Sbi Adapter Interface
 * Orchestrator SDN-O SBI Reference V1.0-L3VPN
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


package openo.sdno.driver.zte.sptn.models.north;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * L3 Loopback Interface
 */
@ApiModel(description = "L3 Loopback Interface")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen",
                            date = "2016-08-12T11:26:39.981+08:00")
public class L3LoopbackIf {

  @SerializedName("id")
  private String id = null;

  @SerializedName("neId")
  private String neId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("ipv4Address")
  private String ipv4Address = null;

  public L3LoopbackIf id(String id) {
    this.id = id;
    return this;
  }

  /**
   * This is a UUID of the L3LoopbackIf instance, which is allocated by the orchestrator
   *
   * @return id
   */
  @ApiModelProperty(example = "null", required = true,
                    value = "This is a UUID of the L3LoopbackIf instance, which is allocated by the orchestrator")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public L3LoopbackIf neId(String neId) {
    this.neId = neId;
    return this;
  }

  /**
   * Network Element device id
   *
   * @return neId
   */
  @ApiModelProperty(example = "null", required = true, value = "Network Element device id")
  public String getNeId() {
    return neId;
  }

  public void setNeId(String neId) {
    this.neId = neId;
  }

  public L3LoopbackIf description(String description) {
    this.description = description;
    return this;
  }

  /**
   * This is the description of the L3LoopbackIf instance.
   *
   * @return description
   */
  @ApiModelProperty(example = "null",
                    value = "This is the description of the L3LoopbackIf instance.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public L3LoopbackIf ipv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }

  /**
   * ipv4 address of loopback interface
   *
   * @return ipv4Address
   */
  @ApiModelProperty(example = "null", required = true, value = "ipv4 address of loopback interface")
  public String getIpv4Address() {
    return ipv4Address;
  }

  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L3LoopbackIf l3LoopbackIf = (L3LoopbackIf) o;
    return Objects.equals(this.id, l3LoopbackIf.id) &&
           Objects.equals(this.neId, l3LoopbackIf.neId) &&
           Objects.equals(this.description, l3LoopbackIf.description) &&
           Objects.equals(this.ipv4Address, l3LoopbackIf.ipv4Address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, neId, description, ipv4Address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L3LoopbackIf {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    neId: ").append(toIndentedString(neId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
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

