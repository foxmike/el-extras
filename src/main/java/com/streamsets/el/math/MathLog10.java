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
 * MathLog10.java - Streamsets expression language function for java math log10 method
 * @author Michael Fox
 * @version 1.1.0
 */

@ElDef
public class MathLog10 {

    /**
     *
     * @param inString The original number
     * @return The base 10 logarithm of the number
     */
    @ElFunction(
            prefix = "math",
            name = "log10",
            description = "Returns the base 10 logarithm of a number"
    )
    public static double log10(
            @ElParam("inString") String inString
    ) {
        try {
                return Math.log10(Double.parseDouble(inString));
        } catch (Exception e) {
            return -999999999;
        }
    }
}
