/*
 * Copyright 2018 Michael Fox
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

package com.streamsets.el.math;

import com.streamsets.pipeline.api.ElDef;
import com.streamsets.pipeline.api.ElFunction;
import com.streamsets.pipeline.api.ElParam;

/**
 * MathAtan.java - Streamsets expression language function for java math atan2 method
 * @author Michael Fox
 * @version 1.1.0
 */

@ElDef
public class MathAtan2 {

    /**
     *
     * @param x The ordinate
     * @param y The abscissa
     * @return The the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta)
     */
    @ElFunction(
            prefix = "math",
            name = "atan2",
            description = "Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta)"
    )
    public static double atan2(
            @ElParam("x") String x,  @ElParam("y") String y
    ) {
        try {
                return Math.atan2(Double.parseDouble(x), Double.parseDouble(y));
        } catch (Exception e) {
            return -999999999;
        }
    }
}
