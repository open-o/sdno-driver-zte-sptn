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
 * bandwidth related QoS parameters
 */
@ApiModel(description = "bandwidth related QoS parameters")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen",
                            date = "2016-08-12T11:26:39.981+08:00")
public class QosIfCar {

  @SerializedName("enable")
  private Boolean enable = null;

  @SerializedName("cir")
  private Integer cir = null;

  @SerializedName("pir")
  private Integer pir = null;

  @SerializedName("cbs")
  private Integer cbs = null;

  @SerializedName("pbs")
  private Integer pbs = null;

  public QosIfCar enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Whether to enable car configuration (true, false)
   *
   * @return enable
   */
  @ApiModelProperty(example = "null", required = true,
                    value = "Whether to enable car configuration (true, false)")
  public Boolean getEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public QosIfCar cir(Integer cir) {
    this.cir = cir;
    return this;
  }

  /**
   * Committed speed in kbps
   *
   * @return cir
   */
  @ApiModelProperty(example = "null", required = true, value = "Committed speed in kbps")
  public Integer getCir() {
    return cir;
  }

  public void setCir(Integer cir) {
    this.cir = cir;
  }

  public QosIfCar pir(Integer pir) {
    this.pir = pir;
    return this;
  }

  /**
   * Peak speed in kbps
   *
   * @return pir
   */
  @ApiModelProperty(example = "null", required = true, value = "Peak speed in kbps")
  public Integer getPir() {
    return pir;
  }

  public void setPir(Integer pir) {
    this.pir = pir;
  }

  public QosIfCar cbs(Integer cbs) {
    this.cbs = cbs;
    return this;
  }

  /**
   * Committed burst Size in bytes
   *
   * @return cbs
   */
  @ApiModelProperty(example = "null", value = "Committed burst Size in bytes")
  public Integer getCbs() {
    return cbs;
  }

  public void setCbs(Integer cbs) {
    this.cbs = cbs;
  }

  public QosIfCar pbs(Integer pbs) {
    this.pbs = pbs;
    return this;
  }

  /**
   * Peak burst Size in bytes
   *
   * @return pbs
   */
  @ApiModelProperty(example = "null", value = "Peak burst Size in bytes")
  public Integer getPbs() {
    return pbs;
  }

  public void setPbs(Integer pbs) {
    this.pbs = pbs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosIfCar qosIfCar = (QosIfCar) o;
    return Objects.equals(this.enable, qosIfCar.enable) &&
           Objects.equals(this.cir, qosIfCar.cir) &&
           Objects.equals(this.pir, qosIfCar.pir) &&
           Objects.equals(this.cbs, qosIfCar.cbs) &&
           Objects.equals(this.pbs, qosIfCar.pbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, cir, pir, cbs, pbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosIfCar {\n");

    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    cir: ").append(toIndentedString(cir)).append("\n");
    sb.append("    pir: ").append(toIndentedString(pir)).append("\n");
    sb.append("    cbs: ").append(toIndentedString(cbs)).append("\n");
    sb.append("    pbs: ").append(toIndentedString(pbs)).append("\n");
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

