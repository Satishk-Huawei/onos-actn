/*
 * Copyright 2016-present Open Networking Laboratory
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

package org.onosproject.bmv2.api.model;

import com.google.common.base.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;

/**
 * Representation of a BMv2 model's header field instance.
 */
public final class Bmv2ModelField {

    private final Bmv2ModelHeader header;
    private final Bmv2ModelFieldType type;

    protected Bmv2ModelField(Bmv2ModelHeader header, Bmv2ModelFieldType type) {
        this.header = header;
        this.type = type;
    }

    /**
     * Returns the header instance of this field instance.
     *
     * @return a header instance
     */
    public Bmv2ModelHeader header() {
        return header;
    }

    /**
     * Returns the type of this field instance.
     *
     * @return a field type value
     */
    public Bmv2ModelFieldType type() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(header, type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Bmv2ModelField other = (Bmv2ModelField) obj;
        return Objects.equal(this.header, other.header)
                && Objects.equal(this.type, other.type);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("header", header)
                .add("type", type)
                .toString();
    }
}
