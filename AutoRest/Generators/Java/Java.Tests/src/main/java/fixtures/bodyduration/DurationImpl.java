/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodyduration.models.Error;
import java.io.IOException;
import org.joda.time.Period;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in Duration.
 */
public class DurationImpl implements Duration {
    /** The Retrofit service to perform REST calls. */
    private DurationService service;
    /** The service client containing this operation class. */
    private AutoRestDurationTestService client;

    /**
     * Initializes an instance of Duration.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DurationImpl(Retrofit retrofit, AutoRestDurationTestService client) {
        this.service = retrofit.create(DurationService.class);
        this.client = client;
    }

    /**
     * Get null duration value.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Period object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Period> getNull() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute(), null);
    }

    /**
     * Get null duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getNullAsync(final ServiceCallback<Period> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        call.enqueue(new ServiceResponseCallback<Period>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getNullDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Period> getNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Period>()
                .register(200, new TypeToken<Period>() { }.getType())
                .registerError(new TypeToken<Error>() { }.getType())
                .build(response, retrofit);
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putPositiveDuration(Period durationBody) throws ServiceException, IOException, IllegalArgumentException {
        if (durationBody == null) {
            throw new IllegalArgumentException("Parameter durationBody is required and cannot be null.");
        }
        Call<ResponseBody> call = service.putPositiveDuration(durationBody);
        return putPositiveDurationDelegate(call.execute(), null);
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putPositiveDurationAsync(Period durationBody, final ServiceCallback<Void> serviceCallback) {
        if (durationBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter durationBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putPositiveDuration(durationBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putPositiveDurationDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putPositiveDurationDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(new TypeToken<Error>() { }.getType())
                .build(response, retrofit);
    }

    /**
     * Get a positive duration value.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Period object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Period> getPositiveDuration() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getPositiveDuration();
        return getPositiveDurationDelegate(call.execute(), null);
    }

    /**
     * Get a positive duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getPositiveDurationAsync(final ServiceCallback<Period> serviceCallback) {
        Call<ResponseBody> call = service.getPositiveDuration();
        call.enqueue(new ServiceResponseCallback<Period>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getPositiveDurationDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Period> getPositiveDurationDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Period>()
                .register(200, new TypeToken<Period>() { }.getType())
                .registerError(new TypeToken<Error>() { }.getType())
                .build(response, retrofit);
    }

    /**
     * Get an invalid duration value.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Period object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Period> getInvalid() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getInvalid();
        return getInvalidDelegate(call.execute(), null);
    }

    /**
     * Get an invalid duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getInvalidAsync(final ServiceCallback<Period> serviceCallback) {
        Call<ResponseBody> call = service.getInvalid();
        call.enqueue(new ServiceResponseCallback<Period>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getInvalidDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Period> getInvalidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Period>()
                .register(200, new TypeToken<Period>() { }.getType())
                .registerError(new TypeToken<Error>() { }.getType())
                .build(response, retrofit);
    }

}
