/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package groovy.lang;

/**
 * Represents a list of 1 typed Object.
 *
 * @since 2.5.0
 */
public class Tuple1<T1> extends Tuple {
    private final T1 first;

    public Tuple1(T1 first) {
        super(first);

        this.first = first;
    }

    @Override
    public Object get(int index) {
        switch (index) {
            case 0:
                return first;
            default:
                throw new IndexOutOfBoundsException("index: " + index);
        }
    }

    @Override
    public int size() {
        return 1;
    }

    public T1 getFirst() {
        return first;
    }
}
