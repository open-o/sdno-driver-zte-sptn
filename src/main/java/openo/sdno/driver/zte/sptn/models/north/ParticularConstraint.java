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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * particular constraint
 */
@ApiModel(description = "particular constraint")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen",
                            date = "2016-08-12T11:26:39.981+08:00")
public class ParticularConstraint {

  @SerializedName("ingressNe")
  private String ingressNe = null;

  @SerializedName("egressNe")
  private String egressNe = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("bindingTunnel")
  private List<String> bindingTunnel = new ArrayList<String>();

  @SerializedName("mplsTe")
  private MplsTePolicy mplsTe = null;

  public ParticularConstraint ingressNe(String ingressNe) {
    this.ingressNe = ingressNe;
    return this;
  }

  /**
   * Ingress node of tunnel
   *
   * @return ingressNe
   */
  @ApiModelProperty(example = "null", required = true, value = "Ingress node of tunnel")
  public String getIngressNe() {
    return ingressNe;
  }

  public void setIngressNe(String ingressNe) {
    this.ingressNe = ingressNe;
  }

  public ParticularConstraint egressNe(String egressNe) {
    this.egressNe = egressNe;
    return this;
  }

  /**
   * Egress node of tunnel
   *
   * @return egressNe
   */
  @ApiModelProperty(example = "null", required = true, value = "Egress node of tunnel")
  public String getEgressNe() {
    return egressNe;
  }

  public void setEgressNe(String egressNe) {
    this.egressNe = egressNe;
  }

  public ParticularConstraint type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of tunnel constraint (binding, particular-mpls-te-tunnel)
   *
   * @return type
   */
  @ApiModelProperty(example = "null", required = true,
                    value = "Type of tunnel constraint (binding, particular-mpls-te-tunnel)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ParticularConstraint bindingTunnel(List<String> bindingTunnel) {
    this.bindingTunnel = bindingTunnel;
    return this;
  }

  /**
   * List of binding tunnel
   *
   * @return bindingTunnel
   */
  @ApiModelProperty(example = "null", value = "List of binding tunnel")
  public List<String> getBindingTunnel() {
    return bindingTunnel;
  }

  public void setBindingTunnel(List<String> bindingTunnel) {
    this.bindingTunnel = bindingTunnel;
  }

  public ParticularConstraint mplsTe(MplsTePolicy mplsTe) {
    this.mplsTe = mplsTe;
    return this;
  }

  /**
   * Get mplsTe
   *
   * @return mplsTe
   */
  @ApiModelProperty(example = "null", value = "")
  public MplsTePolicy getMplsTe() {
    return mplsTe;
  }

  public void setMplsTe(MplsTePolicy mplsTe) {
    this.mplsTe = mplsTe;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticularConstraint particularConstraint = (ParticularConstraint) o;
    return Objects.equals(this.ingressNe, particularConstraint.ingressNe) &&
           Objects.equals(this.egressNe, particularConstraint.egressNe) &&
           Objects.equals(this.type, particularConstraint.type) &&
           Objects.equals(this.bindingTunnel, particularConstraint.bindingTunnel) &&
           Objects.equals(this.mplsTe, particularConstraint.mplsTe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingressNe, egressNe, type, bindingTunnel, mplsTe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticularConstraint {\n");

    sb.append("    ingressNe: ").append(toIndentedString(ingressNe)).append("\n");
    sb.append("    egressNe: ").append(toIndentedString(egressNe)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bindingTunnel: ").append(toIndentedString(bindingTunnel)).append("\n");
    sb.append("    mplsTe: ").append(toIndentedString(mplsTe)).append("\n");
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

