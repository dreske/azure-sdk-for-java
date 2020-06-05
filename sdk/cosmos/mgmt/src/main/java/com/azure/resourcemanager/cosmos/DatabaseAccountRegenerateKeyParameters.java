// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DatabaseAccountRegenerateKeyParameters model. */
@Fluent
public final class DatabaseAccountRegenerateKeyParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseAccountRegenerateKeyParameters.class);

    /*
     * The access key to regenerate.
     */
    @JsonProperty(value = "keyKind", required = true)
    private KeyKind keyKind;

    /**
     * Get the keyKind property: The access key to regenerate.
     *
     * @return the keyKind value.
     */
    public KeyKind keyKind() {
        return this.keyKind;
    }

    /**
     * Set the keyKind property: The access key to regenerate.
     *
     * @param keyKind the keyKind value to set.
     * @return the DatabaseAccountRegenerateKeyParameters object itself.
     */
    public DatabaseAccountRegenerateKeyParameters withKeyKind(KeyKind keyKind) {
        this.keyKind = keyKind;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyKind() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyKind in model DatabaseAccountRegenerateKeyParameters"));
        }
    }
}