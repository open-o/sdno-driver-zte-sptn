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
 * List of Bgp Route
 */
@ApiModel(description = "List of Bgp Route")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen",
                            date = "2016-08-12T11:26:39.981+08:00")
public class BgpRoutes {

  @SerializedName("bgpRoute")
  private List<BgpRoute> bgpRoute = new ArrayList<BgpRoute>();

  public BgpRoutes bgpRoute(List<BgpRoute> bgpRoute) {
    this.bgpRoute = bgpRoute;
    return this;
  }

  /**
   * Get bgpRoute
   *
   * @return bgpRoute
   */
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<BgpRoute> getBgpRoute() {
    return bgpRoute;
  }

  public void setBgpRoute(List<BgpRoute> bgpRoute) {
    this.bgpRoute = bgpRoute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpRoutes bgpRoutes = (BgpRoutes) o;
    return Objects.equals(this.bgpRoute, bgpRoutes.bgpRoute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgpRoute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpRoutes {\n");

    sb.append("    bgpRoute: ").append(toIndentedString(bgpRoute)).append("\n");
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

