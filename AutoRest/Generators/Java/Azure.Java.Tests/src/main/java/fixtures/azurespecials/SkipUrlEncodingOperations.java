/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in SkipUrlEncodingOperations.
 */
public interface SkipUrlEncodingOperations {
    /**
     * The interface defining all the services for SkipUrlEncodingOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SkipUrlEncodingService {
        @GET("/azurespecials/skipUrlEncoding/method/path/valid/{unencodedPathParam}")
        Call<ResponseBody> getMethodPathValid(@Path("unencodedPathParam") String unencodedPathParam, @Header("accept-language") String acceptLanguage);

        @GET("/azurespecials/skipUrlEncoding/path/path/valid/{unencodedPathParam}")
        Call<ResponseBody> getPathPathValid(@Path("unencodedPathParam") String unencodedPathParam, @Header("accept-language") String acceptLanguage);

        @GET("/azurespecials/skipUrlEncoding/swagger/path/valid/{unencodedPathParam}")
        Call<ResponseBody> getSwaggerPathValid(@Path("unencodedPathParam") String unencodedPathParam, @Header("accept-language") String acceptLanguage);

        @GET("/azurespecials/skipUrlEncoding/method/query/valid")
        Call<ResponseBody> getMethodQueryValid(@Query("q1") String q1, @Header("accept-language") String acceptLanguage);

        @GET("/azurespecials/skipUrlEncoding/method/query/null")
        Call<ResponseBody> getMethodQueryNull(@Query("q1") String q1, @Header("accept-language") String acceptLanguage);

        @GET("/azurespecials/skipUrlEncoding/path/query/valid")
        Call<ResponseBody> getPathQueryValid(@Query("q1") String q1, @Header("accept-language") String acceptLanguage);

        @GET("/azurespecials/skipUrlEncoding/swagger/query/valid")
        Call<ResponseBody> getSwaggerQueryValid(@Query("q1") String q1, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> getMethodPathValid(String unencodedPathParam) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMethodPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> getPathPathValid(String unencodedPathParam) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getPathPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam An unencoded path parameter with value 'path1/path2/path3'. Possible values for this parameter include: 'path1/path2/path3'
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> getSwaggerPathValid(String unencodedPathParam) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam An unencoded path parameter with value 'path1/path2/path3'. Possible values for this parameter include: 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSwaggerPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> getMethodQueryValid(String q1) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMethodQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param q1 Unencoded query parameter with value null
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> getMethodQueryNull(String q1) throws ServiceException, IOException;

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param q1 Unencoded query parameter with value null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMethodQueryNullAsync(String q1, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> getPathQueryValid(String q1) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getPathQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 An unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'. Possible values for this parameter include: 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> getSwaggerQueryValid(String q1) throws ServiceException, IOException;

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 An unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'. Possible values for this parameter include: 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSwaggerQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback);

}
