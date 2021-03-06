// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the AzureCommunicationChatService type. */
public final class AzureCommunicationChatServiceImpl {
    /** The endpoint of the Azure Communication resource. */
    private final String endpoint;

    /**
     * Gets The endpoint of the Azure Communication resource.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The ChatThreadsImpl object to access its operations. */
    private final ChatThreadImpl chatThreadClient;

    /**
     * Gets the ChatThreadsImpl object to access its operations.
     *
     * @return the ChatThreadsImpl object.
     */
    public ChatThreadImpl getChatThreadClient() {
        return this.chatThreadClient;
    }

    /** The ChatsImpl object to access its operations. */
    private final ChatImpl chatClient;

    /**
     * Gets the ChatsImpl object to access its operations.
     *
     * @return the ChatsImpl object.
     */
    public ChatImpl getChatClient() {
        return this.chatClient;
    }

    /**
     * Initializes an instance of AzureCommunicationChatService client.
     *
     * @param endpoint The endpoint of the Azure Communication resource.
     */
    AzureCommunicationChatServiceImpl(String endpoint) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint);
    }

    /**
     * Initializes an instance of AzureCommunicationChatService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The endpoint of the Azure Communication resource.
     */
    AzureCommunicationChatServiceImpl(HttpPipeline httpPipeline, String endpoint) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint);
    }

    /**
     * Initializes an instance of AzureCommunicationChatService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The endpoint of the Azure Communication resource.
     */
    AzureCommunicationChatServiceImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.apiVersion = "2020-11-01-preview3";
        this.chatThreadClient = new ChatThreadImpl(this);
        this.chatClient = new ChatImpl(this);
    }
}
