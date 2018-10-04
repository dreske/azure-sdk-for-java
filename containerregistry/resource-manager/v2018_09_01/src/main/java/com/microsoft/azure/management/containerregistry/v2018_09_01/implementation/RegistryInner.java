/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01.implementation;

import com.microsoft.azure.management.containerregistry.v2018_09_01.Sku;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2018_09_01.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2018_09_01.Status;
import com.microsoft.azure.management.containerregistry.v2018_09_01.StorageAccountProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * An object that represents a container registry.
 */
@JsonFlatten
public class RegistryInner extends Resource {
    /**
     * The SKU of the container registry.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /**
     * The URL that can be used to log into the container registry.
     */
    @JsonProperty(value = "properties.loginServer", access = JsonProperty.Access.WRITE_ONLY)
    private String loginServer;

    /**
     * The creation date of the container registry in ISO8601 format.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * The provisioning state of the container registry at the time the
     * operation was called. Possible values include: 'Creating', 'Updating',
     * 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The status of the container registry at the time the operation was
     * called.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private Status status;

    /**
     * The value that indicates whether the admin user is enabled.
     */
    @JsonProperty(value = "properties.adminUserEnabled")
    private Boolean adminUserEnabled;

    /**
     * The properties of the storage account for the container registry. Only
     * applicable to Classic SKU.
     */
    @JsonProperty(value = "properties.storageAccount")
    private StorageAccountProperties storageAccount;

    /**
     * Get the SKU of the container registry.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the SKU of the container registry.
     *
     * @param sku the sku value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the URL that can be used to log into the container registry.
     *
     * @return the loginServer value
     */
    public String loginServer() {
        return this.loginServer;
    }

    /**
     * Get the creation date of the container registry in ISO8601 format.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the provisioning state of the container registry at the time the operation was called. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status of the container registry at the time the operation was called.
     *
     * @return the status value
     */
    public Status status() {
        return this.status;
    }

    /**
     * Get the value that indicates whether the admin user is enabled.
     *
     * @return the adminUserEnabled value
     */
    public Boolean adminUserEnabled() {
        return this.adminUserEnabled;
    }

    /**
     * Set the value that indicates whether the admin user is enabled.
     *
     * @param adminUserEnabled the adminUserEnabled value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withAdminUserEnabled(Boolean adminUserEnabled) {
        this.adminUserEnabled = adminUserEnabled;
        return this;
    }

    /**
     * Get the properties of the storage account for the container registry. Only applicable to Classic SKU.
     *
     * @return the storageAccount value
     */
    public StorageAccountProperties storageAccount() {
        return this.storageAccount;
    }

    /**
     * Set the properties of the storage account for the container registry. Only applicable to Classic SKU.
     *
     * @param storageAccount the storageAccount value to set
     * @return the RegistryInner object itself.
     */
    public RegistryInner withStorageAccount(StorageAccountProperties storageAccount) {
        this.storageAccount = storageAccount;
        return this;
    }

}
