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
 * a list of L3 Loopback Interface.
 */
@ApiModel(description = "a list of L3 Loopback Interface.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen",
                            date = "2016-08-12T11:26:39.981+08:00")
public class L3LoopbackIfs {

  @SerializedName("loopback")
  private List<L3LoopbackIf> loopback = new ArrayList<L3LoopbackIf>();

  public L3LoopbackIfs loopback(List<L3LoopbackIf> loopback) {
    this.loopback = loopback;
    return this;
  }

  /**
   * Get loopback
   *
   * @return loopback
   */
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<L3LoopbackIf> getLoopback() {
    return loopback;
  }

  public void setLoopback(List<L3LoopbackIf> loopback) {
    this.loopback = loopback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L3LoopbackIfs l3LoopbackIfs = (L3LoopbackIfs) o;
    return Objects.equals(this.loopback, l3LoopbackIfs.loopback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loopback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L3LoopbackIfs {\n");

    sb.append("    loopback: ").append(toIndentedString(loopback)).append("\n");
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

