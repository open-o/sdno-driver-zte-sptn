/*
 * Copyright 2016 ZTE Corporation.
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

package org.openo.sdno.sptndriver.utils;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
    @Test
    public void ceil() throws Exception {
        Assert.assertEquals(1, MathUtil.ceil(6, 6));
        Assert.assertEquals(2, MathUtil.ceil(7, 6));
        Assert.assertEquals(0, MathUtil.ceil(0, 6));
    }

}