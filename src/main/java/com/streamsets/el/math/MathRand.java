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

import java.util.Random;

/**
 * MathRand.java - Streamsets expression language function generating random numbers
 * @author Michael Fox
 * @version 1.1.0
 */

@ElDef
public class MathRand {

    /**
     *
     * @param min minimum value
     * @param max maximum value
     * @return The random number
     */
    @ElFunction(
            prefix = "math",
            name = "rand",
            description = "Returns a random number between 2 integers inclusive"
    )
    public static int rand(
            @ElParam("min") String min, @ElParam("max") String max
    ) {
        try {
                Random rand = new Random();
                return rand.nextInt((int)Double.parseDouble(max)-(int)Double.parseDouble(min)+1)+(int)Double.parseDouble(min);
        } catch (Exception e) {
            return -999999999;
        }
    }
}
