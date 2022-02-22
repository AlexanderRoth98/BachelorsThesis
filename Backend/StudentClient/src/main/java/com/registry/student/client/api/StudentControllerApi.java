package com.registry.student.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import com.registry.student.client.invoker.ApiClient;
import com.registry.student.client.model.Student;

@Component("com.registry.student.client.api.StudentControllerApi")

public class StudentControllerApi {
	private ApiClient apiClient;

	public StudentControllerApi() {
		this(new ApiClient());
	}

	@Autowired
	public StudentControllerApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * countStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @return Long
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Long countStudentsUsingDELETE() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/countStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Long> returnType = new ParameterizedTypeReference<Long>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * countStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @return Long
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Long countStudentsUsingGET() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/countStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Long> returnType = new ParameterizedTypeReference<Long>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * countStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @return Long
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Long countStudentsUsingHEAD() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/countStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Long> returnType = new ParameterizedTypeReference<Long>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.HEAD, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * countStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @return Long
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Long countStudentsUsingOPTIONS() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/countStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Long> returnType = new ParameterizedTypeReference<Long>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.OPTIONS, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * countStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @return Long
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Long countStudentsUsingPATCH() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/countStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Long> returnType = new ParameterizedTypeReference<Long>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * countStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @return Long
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Long countStudentsUsingPOST() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/countStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Long> returnType = new ParameterizedTypeReference<Long>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * countStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @return Long
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Long countStudentsUsingPUT() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/countStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Long> returnType = new ParameterizedTypeReference<Long>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * createStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param student student
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String createStudentUsingDELETE(Student student) throws RestClientException {
		Object postBody = student;

		// verify the required parameter 'student' is set
		if (student == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'student' when calling createStudentUsingDELETE");
		}

		String path = UriComponentsBuilder.fromPath("/createStudent").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * createStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param student student
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String createStudentUsingGET(Student student) throws RestClientException {
		Object postBody = student;

		// verify the required parameter 'student' is set
		if (student == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'student' when calling createStudentUsingGET");
		}

		String path = UriComponentsBuilder.fromPath("/createStudent").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * createStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param student student
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String createStudentUsingHEAD(Student student) throws RestClientException {
		Object postBody = student;

		// verify the required parameter 'student' is set
		if (student == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'student' when calling createStudentUsingHEAD");
		}

		String path = UriComponentsBuilder.fromPath("/createStudent").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.HEAD, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * createStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param student student
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String createStudentUsingOPTIONS(Student student) throws RestClientException {
		Object postBody = student;

		// verify the required parameter 'student' is set
		if (student == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'student' when calling createStudentUsingOPTIONS");
		}

		String path = UriComponentsBuilder.fromPath("/createStudent").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.OPTIONS, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * createStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param student student
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String createStudentUsingPATCH(Student student) throws RestClientException {
		Object postBody = student;

		// verify the required parameter 'student' is set
		if (student == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'student' when calling createStudentUsingPATCH");
		}

		String path = UriComponentsBuilder.fromPath("/createStudent").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * createStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param student student
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String createStudentUsingPOST(Student student) throws RestClientException {
		Object postBody = student;

		// verify the required parameter 'student' is set
		if (student == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'student' when calling createStudentUsingPOST");
		}

		String path = UriComponentsBuilder.fromPath("/createStudent").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * createStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param student student
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String createStudentUsingPUT(Student student) throws RestClientException {
		Object postBody = student;

		// verify the required parameter 'student' is set
		if (student == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'student' when calling createStudentUsingPUT");
		}

		String path = UriComponentsBuilder.fromPath("/createStudent").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * deleteStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param registrationNumber registrationNumber
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String deleteStudentUsingDELETE(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling deleteStudentUsingDELETE");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/deleteStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * deleteStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param registrationNumber registrationNumber
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String deleteStudentUsingGET(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling deleteStudentUsingGET");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/deleteStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * deleteStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param registrationNumber registrationNumber
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String deleteStudentUsingHEAD(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling deleteStudentUsingHEAD");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/deleteStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.HEAD, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * deleteStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param registrationNumber registrationNumber
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String deleteStudentUsingOPTIONS(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling deleteStudentUsingOPTIONS");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/deleteStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.OPTIONS, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * deleteStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param registrationNumber registrationNumber
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String deleteStudentUsingPATCH(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling deleteStudentUsingPATCH");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/deleteStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * deleteStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param registrationNumber registrationNumber
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String deleteStudentUsingPOST(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling deleteStudentUsingPOST");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/deleteStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * deleteStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param registrationNumber registrationNumber
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String deleteStudentUsingPUT(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling deleteStudentUsingPUT");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/deleteStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findBySemester
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param semester semester
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> findBySemesterUsingDELETE(Integer semester) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'semester' is set
		if (semester == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'semester' when calling findBySemesterUsingDELETE");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("semester", semester);
		String path = UriComponentsBuilder.fromPath("/findBySemester{semester}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findBySemester
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param semester semester
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> findBySemesterUsingGET(Integer semester) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'semester' is set
		if (semester == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'semester' when calling findBySemesterUsingGET");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("semester", semester);
		String path = UriComponentsBuilder.fromPath("/findBySemester{semester}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findBySemester
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param semester semester
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> findBySemesterUsingHEAD(Integer semester) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'semester' is set
		if (semester == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'semester' when calling findBySemesterUsingHEAD");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("semester", semester);
		String path = UriComponentsBuilder.fromPath("/findBySemester{semester}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.HEAD, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findBySemester
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param semester semester
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> findBySemesterUsingOPTIONS(Integer semester) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'semester' is set
		if (semester == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'semester' when calling findBySemesterUsingOPTIONS");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("semester", semester);
		String path = UriComponentsBuilder.fromPath("/findBySemester{semester}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.OPTIONS, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findBySemester
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param semester semester
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> findBySemesterUsingPATCH(Integer semester) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'semester' is set
		if (semester == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'semester' when calling findBySemesterUsingPATCH");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("semester", semester);
		String path = UriComponentsBuilder.fromPath("/findBySemester{semester}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findBySemester
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param semester semester
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> findBySemesterUsingPOST(Integer semester) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'semester' is set
		if (semester == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'semester' when calling findBySemesterUsingPOST");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("semester", semester);
		String path = UriComponentsBuilder.fromPath("/findBySemester{semester}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findBySemester
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param semester semester
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> findBySemesterUsingPUT(Integer semester) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'semester' is set
		if (semester == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'semester' when calling findBySemesterUsingPUT");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("semester", semester);
		String path = UriComponentsBuilder.fromPath("/findBySemester{semester}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findStudentById
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param registrationNumber registrationNumber
	 * @return Student
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Student findStudentByIdUsingDELETE(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling findStudentByIdUsingDELETE");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/findByRegistrationNumber{registrationNumber}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Student> returnType = new ParameterizedTypeReference<Student>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findStudentById
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param registrationNumber registrationNumber
	 * @return Student
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Student findStudentByIdUsingGET(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling findStudentByIdUsingGET");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/findByRegistrationNumber{registrationNumber}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Student> returnType = new ParameterizedTypeReference<Student>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findStudentById
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param registrationNumber registrationNumber
	 * @return Student
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Student findStudentByIdUsingHEAD(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling findStudentByIdUsingHEAD");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/findByRegistrationNumber{registrationNumber}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Student> returnType = new ParameterizedTypeReference<Student>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.HEAD, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findStudentById
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param registrationNumber registrationNumber
	 * @return Student
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Student findStudentByIdUsingOPTIONS(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling findStudentByIdUsingOPTIONS");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/findByRegistrationNumber{registrationNumber}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Student> returnType = new ParameterizedTypeReference<Student>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.OPTIONS, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findStudentById
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param registrationNumber registrationNumber
	 * @return Student
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Student findStudentByIdUsingPATCH(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling findStudentByIdUsingPATCH");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/findByRegistrationNumber{registrationNumber}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Student> returnType = new ParameterizedTypeReference<Student>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findStudentById
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param registrationNumber registrationNumber
	 * @return Student
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Student findStudentByIdUsingPOST(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling findStudentByIdUsingPOST");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/findByRegistrationNumber{registrationNumber}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Student> returnType = new ParameterizedTypeReference<Student>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * findStudentById
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param registrationNumber registrationNumber
	 * @return Student
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public Student findStudentByIdUsingPUT(String registrationNumber) throws RestClientException {
		Object postBody = null;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling findStudentByIdUsingPUT");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/findByRegistrationNumber{registrationNumber}")
				.buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<Student> returnType = new ParameterizedTypeReference<Student>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * readStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> readStudentsUsingDELETE() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/readStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * readStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> readStudentsUsingGET() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/readStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * readStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> readStudentsUsingHEAD() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/readStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.HEAD, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * readStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> readStudentsUsingOPTIONS() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/readStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.OPTIONS, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * readStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> readStudentsUsingPATCH() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/readStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * readStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> readStudentsUsingPOST() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/readStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * readStudents
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @return List&lt;Student&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<Student> readStudentsUsingPUT() throws RestClientException {
		Object postBody = null;

		String path = UriComponentsBuilder.fromPath("/readStudents").build().toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * updateStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param registrationNumber registrationNumber
	 * @param updateStudent      updateStudent
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String updateStudentUsingDELETE(String registrationNumber, Student updateStudent)
			throws RestClientException {
		Object postBody = updateStudent;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling updateStudentUsingDELETE");
		}

		// verify the required parameter 'updateStudent' is set
		if (updateStudent == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'updateStudent' when calling updateStudentUsingDELETE");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/updateStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * updateStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param registrationNumber registrationNumber
	 * @param updateStudent      updateStudent
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String updateStudentUsingGET(String registrationNumber, Student updateStudent) throws RestClientException {
		Object postBody = updateStudent;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling updateStudentUsingGET");
		}

		// verify the required parameter 'updateStudent' is set
		if (updateStudent == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'updateStudent' when calling updateStudentUsingGET");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/updateStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = {};
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * updateStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param registrationNumber registrationNumber
	 * @param updateStudent      updateStudent
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String updateStudentUsingHEAD(String registrationNumber, Student updateStudent) throws RestClientException {
		Object postBody = updateStudent;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling updateStudentUsingHEAD");
		}

		// verify the required parameter 'updateStudent' is set
		if (updateStudent == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'updateStudent' when calling updateStudentUsingHEAD");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/updateStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.HEAD, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * updateStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param registrationNumber registrationNumber
	 * @param updateStudent      updateStudent
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String updateStudentUsingOPTIONS(String registrationNumber, Student updateStudent)
			throws RestClientException {
		Object postBody = updateStudent;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling updateStudentUsingOPTIONS");
		}

		// verify the required parameter 'updateStudent' is set
		if (updateStudent == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'updateStudent' when calling updateStudentUsingOPTIONS");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/updateStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.OPTIONS, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * updateStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>204</b> - No Content
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * 
	 * @param registrationNumber registrationNumber
	 * @param updateStudent      updateStudent
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String updateStudentUsingPATCH(String registrationNumber, Student updateStudent) throws RestClientException {
		Object postBody = updateStudent;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling updateStudentUsingPATCH");
		}

		// verify the required parameter 'updateStudent' is set
		if (updateStudent == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'updateStudent' when calling updateStudentUsingPATCH");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/updateStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * updateStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param registrationNumber registrationNumber
	 * @param updateStudent      updateStudent
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String updateStudentUsingPOST(String registrationNumber, Student updateStudent) throws RestClientException {
		Object postBody = updateStudent;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling updateStudentUsingPOST");
		}

		// verify the required parameter 'updateStudent' is set
		if (updateStudent == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'updateStudent' when calling updateStudentUsingPOST");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/updateStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}

	/**
	 * updateStudent
	 * 
	 * <p>
	 * <b>200</b> - OK
	 * <p>
	 * <b>201</b> - Created
	 * <p>
	 * <b>401</b> - Unauthorized
	 * <p>
	 * <b>403</b> - Forbidden
	 * <p>
	 * <b>404</b> - Not Found
	 * 
	 * @param registrationNumber registrationNumber
	 * @param updateStudent      updateStudent
	 * @return String
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public String updateStudentUsingPUT(String registrationNumber, Student updateStudent) throws RestClientException {
		Object postBody = updateStudent;

		// verify the required parameter 'registrationNumber' is set
		if (registrationNumber == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'registrationNumber' when calling updateStudentUsingPUT");
		}

		// verify the required parameter 'updateStudent' is set
		if (updateStudent == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'updateStudent' when calling updateStudentUsingPUT");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<String, Object>();
		uriVariables.put("registrationNumber", registrationNumber);
		String path = UriComponentsBuilder.fromPath("/updateStudent{registrationNumber}").buildAndExpand(uriVariables)
				.toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
		final HttpHeaders headerParams = new HttpHeaders();
		final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
		final String[] contentTypes = { "application/json" };
		final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {
		};
		return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept,
				contentType, authNames, returnType);
	}
}
