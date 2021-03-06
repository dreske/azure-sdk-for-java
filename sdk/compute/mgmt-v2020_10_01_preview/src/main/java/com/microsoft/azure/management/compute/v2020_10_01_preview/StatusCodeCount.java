/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StatusCodeCount model.
 */
public class StatusCodeCount {
    /**
     * The instance view status code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Number of instances having this status code.
     */
    @JsonProperty(value = "count", access = JsonProperty.Access.WRITE_ONLY)
    private Integer count;

    /**
     * Get the instance view status code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get number of instances having this status code.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

}
