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

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


/**
 * SncSwitch
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen",
                            date = "2016-08-12T10:40:00.335+08:00")
public class SncSwitch {

  @SerializedName("snc-id")
  private String sncId = null;

  @SerializedName("layer-rate")
  private Integer layerRate = null;

  @SerializedName("linear-protection-type")
  private Integer linearProtectionType = null;

  @SerializedName("linear-protection-protocol")
  private Integer linearProtectionProtocol = null;

  @SerializedName("switch-mode")
  private Integer switchMode = null;

  @SerializedName("revertive-mode")
  private Integer revertiveMode = null;

  @SerializedName("wtr")
  private Integer wtr = 300;

  @SerializedName("hold-off-time")
  private Integer holdOffTime = 0;

  @SerializedName("reroute-revertive-mode")
  private Integer rerouteRevertiveMode = 0;

  @SerializedName("reroute-wtr")
  private Integer rerouteWtr = 50;

  public SncSwitch sncId(String sncId) {
    this.sncId = sncId;
    return this;
  }

  /**
   * UUID of tunnel or UUID of Eline
   *
   * @return sncId
   */
  @ApiModelProperty(example = "null", required = true, value = "UUID of tunnel or UUID of Eline")
  public String getSncId() {
    return sncId;
  }

  public void setSncId(String sncId) {
    this.sncId = sncId;
  }

  public SncSwitch layerRate(Integer layerRate) {
    this.layerRate = layerRate;
    return this;
  }

  /**
   * Rate of the connection, including 0(LSP), 1(PW)
   *
   * @return layerRate
   */
  @ApiModelProperty(example = "null", required = true,
                    value = "Rate of the connection, including 0(LSP), 1(PW)")
  public Integer getLayerRate() {
    return layerRate;
  }

  public void setLayerRate(Integer layerRate) {
    this.layerRate = layerRate;
  }

  public SncSwitch linearProtectionType(Integer linearProtectionType) {
    this.linearProtectionType = linearProtectionType;
    return this;
  }

  /**
   * Linear protection type, including 0(unprotected), 1(path-protection-1-to-1),
   * 2(path-protection-1-plus-1), 3(unprotected-with-recovery), 4(with-recovery-1-to-1),
   * 5(with-recovery-1-plus-1), 6(permanent-1-plus-1-protection)
   *
   * @return linearProtectionType
   */
  @ApiModelProperty(example = "null", required = true,
                    value = "Linear protection type, including 0(unprotected), 1(path-protection-1-to-1), 2(path-protection-1-plus-1), 3(unprotected-with-recovery), 4(with-recovery-1-to-1), 5(with-recovery-1-plus-1), 6(permanent-1-plus-1-protection)")
  public Integer getLinearProtectionType() {
    return linearProtectionType;
  }

  public void setLinearProtectionType(Integer linearProtectionType) {
    this.linearProtectionType = linearProtectionType;
  }

  public SncSwitch linearProtectionProtocol(Integer linearProtectionProtocol) {
    this.linearProtectionProtocol = linearProtectionProtocol;
    return this;
  }

  /**
   * Linear protection protocol, including 0(APS), 1(PSC)
   *
   * @return linearProtectionProtocol
   */
  @ApiModelProperty(example = "null",
                    value = "Linear protection protocol, including 0(APS), 1(PSC)")
  public Integer getLinearProtectionProtocol() {
    return linearProtectionProtocol;
  }

  public void setLinearProtectionProtocol(Integer linearProtectionProtocol) {
    this.linearProtectionProtocol = linearProtectionProtocol;
  }

  public SncSwitch switchMode(Integer switchMode) {
    this.switchMode = switchMode;
    return this;
  }

  /**
   * Switch mode, including 0(single-ended-switch), 1(double-end-switch)
   *
   * @return switchMode
   */
  @ApiModelProperty(example = "null",
                    value = "Switch mode, including 0(single-ended-switch), 1(double-end-switch)")
  public Integer getSwitchMode() {
    return switchMode;
  }

  public void setSwitchMode(Integer switchMode) {
    this.switchMode = switchMode;
  }

  public SncSwitch revertiveMode(Integer revertiveMode) {
    this.revertiveMode = revertiveMode;
    return this;
  }

  /**
   * Revertive mode, including 0(no-revertive), 1(revertive)
   *
   * @return revertiveMode
   */
  @ApiModelProperty(example = "null",
                    value = "Revertive mode, including 0(no-revertive), 1(revertive)")
  public Integer getRevertiveMode() {
    return revertiveMode;
  }

  public void setRevertiveMode(Integer revertiveMode) {
    this.revertiveMode = revertiveMode;
  }

  public SncSwitch wtr(Integer wtr) {
    this.wtr = wtr;
    return this;
  }

  /**
   * wait time in seconds minimum: 0.0
   *
   * @return wtr
   */
  @ApiModelProperty(example = "null", value = "wait time in seconds")
  public Integer getWtr() {
    return wtr;
  }

  public void setWtr(Integer wtr) {
    this.wtr = wtr;
  }

  public SncSwitch holdOffTime(Integer holdOffTime) {
    this.holdOffTime = holdOffTime;
    return this;
  }

  /**
   * hode off time in ms minimum: 0.0 maximum: 10000.0
   *
   * @return holdOffTime
   */
  @ApiModelProperty(example = "null", value = "hode off time in ms")
  public Integer getHoldOffTime() {
    return holdOffTime;
  }

  public void setHoldOffTime(Integer holdOffTime) {
    this.holdOffTime = holdOffTime;
  }

  public SncSwitch rerouteRevertiveMode(Integer rerouteRevertiveMode) {
    this.rerouteRevertiveMode = rerouteRevertiveMode;
    return this;
  }

  /**
   * Reroute revertive mode, including 0(no-revertive), 1(revertive)
   *
   * @return rerouteRevertiveMode
   */
  @ApiModelProperty(example = "null",
                    value = "Reroute revertive mode, including 0(no-revertive), 1(revertive)")
  public Integer getRerouteRevertiveMode() {
    return rerouteRevertiveMode;
  }

  public void setRerouteRevertiveMode(Integer rerouteRevertiveMode) {
    this.rerouteRevertiveMode = rerouteRevertiveMode;
  }

  public SncSwitch rerouteWtr(Integer rerouteWtr) {
    this.rerouteWtr = rerouteWtr;
    return this;
  }

  /**
   * wait time for reroute in seconds
   *
   * @return rerouteWtr
   */
  @ApiModelProperty(example = "null", value = "wait time for reroute in seconds")
  public Integer getRerouteWtr() {
    return rerouteWtr;
  }

  public void setRerouteWtr(Integer rerouteWtr) {
    this.rerouteWtr = rerouteWtr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SncSwitch sncSwitch = (SncSwitch) o;
    return Objects.equals(this.sncId, sncSwitch.sncId) &&
           Objects.equals(this.layerRate, sncSwitch.layerRate) &&
           Objects.equals(this.linearProtectionType, sncSwitch.linearProtectionType) &&
           Objects.equals(this.linearProtectionProtocol, sncSwitch.linearProtectionProtocol) &&
           Objects.equals(this.switchMode, sncSwitch.switchMode) &&
           Objects.equals(this.revertiveMode, sncSwitch.revertiveMode) &&
           Objects.equals(this.wtr, sncSwitch.wtr) &&
           Objects.equals(this.holdOffTime, sncSwitch.holdOffTime) &&
           Objects.equals(this.rerouteRevertiveMode, sncSwitch.rerouteRevertiveMode) &&
           Objects.equals(this.rerouteWtr, sncSwitch.rerouteWtr);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(sncId, layerRate, linearProtectionType, linearProtectionProtocol, switchMode,
              revertiveMode, wtr, holdOffTime, rerouteRevertiveMode, rerouteWtr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SncSwitch {\n");

    sb.append("    sncId: ").append(toIndentedString(sncId)).append("\n");
    sb.append("    layerRate: ").append(toIndentedString(layerRate)).append("\n");
    sb.append("    linearProtectionType: ").append(toIndentedString(linearProtectionType))
        .append("\n");
    sb.append("    linearProtectionProtocol: ").append(toIndentedString(linearProtectionProtocol))
        .append("\n");
    sb.append("    switchMode: ").append(toIndentedString(switchMode)).append("\n");
    sb.append("    revertiveMode: ").append(toIndentedString(revertiveMode)).append("\n");
    sb.append("    wtr: ").append(toIndentedString(wtr)).append("\n");
    sb.append("    holdOffTime: ").append(toIndentedString(holdOffTime)).append("\n");
    sb.append("    rerouteRevertiveMode: ").append(toIndentedString(rerouteRevertiveMode))
        .append("\n");
    sb.append("    rerouteWtr: ").append(toIndentedString(rerouteWtr)).append("\n");
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

