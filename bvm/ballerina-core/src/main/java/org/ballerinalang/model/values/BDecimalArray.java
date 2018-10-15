/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */


// TODO: YET TO IMPLEMENT

package org.ballerinalang.model.values;

import org.ballerinalang.model.types.BArrayType;
import org.ballerinalang.model.types.BTypes;
import org.wso2.ballerinalang.compiler.semantics.model.types.util.Decimal;

/**
 * The {@code BDecimalArray} represents a decimal array in Ballerina.
 *
 * @since 0.981.2
 */
public class BDecimalArray extends BNewArray {

    private Decimal[] values;

    public BDecimalArray(Decimal[] values) {
        this.values = values;
        this.size = values.length;
        super.arrayType = new BArrayType(BTypes.typeDecimal);
    }

    public BDecimalArray() {
        values = (Decimal[]) newArrayInstance(Decimal.class);
        super.arrayType = new BArrayType(BTypes.typeDecimal);
    }

    public BDecimalArray(int size) {
        if (size != -1) {
            this.size = maxArraySize = size;
        }
        values = (Decimal[]) newArrayInstance(Decimal.class);
        super.arrayType = new BArrayType(BTypes.typeDecimal, size);
    }

    public void add(long index, Decimal value) {
        prepareForAdd(index, values.length);
        values[(int) index] = value;
    }

    public Decimal get(long index) {
        rangeCheckForGet(index, size);
        return values[(int) index];
    }

    @Override
    public void grow(int newLength) {

    }

    @Override
    public BValue getBValue(long index) {
        return null;
    }

    @Override
    public BValue copy() {
        return null;
    }
}
