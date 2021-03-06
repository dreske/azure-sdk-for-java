/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The base definition of a linked integration runtime.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authorizationType", defaultImpl = LinkedIntegrationRuntimeType.class)
@JsonTypeName("LinkedIntegrationRuntimeType")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Key", value = LinkedIntegrationRuntimeKeyAuthorization.class),
    @JsonSubTypes.Type(name = "RBAC", value = LinkedIntegrationRuntimeRbacAuthorization.class)
})
public class LinkedIntegrationRuntimeType {
}
