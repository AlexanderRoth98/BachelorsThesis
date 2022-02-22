# StudentControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStudentUsingDELETE**](StudentControllerApi.md#createStudentUsingDELETE) | **DELETE** /createStudent | createStudent
[**createStudentUsingGET**](StudentControllerApi.md#createStudentUsingGET) | **GET** /createStudent | createStudent
[**createStudentUsingHEAD**](StudentControllerApi.md#createStudentUsingHEAD) | **HEAD** /createStudent | createStudent
[**createStudentUsingOPTIONS**](StudentControllerApi.md#createStudentUsingOPTIONS) | **OPTIONS** /createStudent | createStudent
[**createStudentUsingPATCH**](StudentControllerApi.md#createStudentUsingPATCH) | **PATCH** /createStudent | createStudent
[**createStudentUsingPOST**](StudentControllerApi.md#createStudentUsingPOST) | **POST** /createStudent | createStudent
[**createStudentUsingPUT**](StudentControllerApi.md#createStudentUsingPUT) | **PUT** /createStudent | createStudent
[**deleteStudentUsingDELETE**](StudentControllerApi.md#deleteStudentUsingDELETE) | **DELETE** /deleteStudent{registrationNumber} | deleteStudent
[**deleteStudentUsingGET**](StudentControllerApi.md#deleteStudentUsingGET) | **GET** /deleteStudent{registrationNumber} | deleteStudent
[**deleteStudentUsingHEAD**](StudentControllerApi.md#deleteStudentUsingHEAD) | **HEAD** /deleteStudent{registrationNumber} | deleteStudent
[**deleteStudentUsingOPTIONS**](StudentControllerApi.md#deleteStudentUsingOPTIONS) | **OPTIONS** /deleteStudent{registrationNumber} | deleteStudent
[**deleteStudentUsingPATCH**](StudentControllerApi.md#deleteStudentUsingPATCH) | **PATCH** /deleteStudent{registrationNumber} | deleteStudent
[**deleteStudentUsingPOST**](StudentControllerApi.md#deleteStudentUsingPOST) | **POST** /deleteStudent{registrationNumber} | deleteStudent
[**deleteStudentUsingPUT**](StudentControllerApi.md#deleteStudentUsingPUT) | **PUT** /deleteStudent{registrationNumber} | deleteStudent
[**readStudentsUsingDELETE**](StudentControllerApi.md#readStudentsUsingDELETE) | **DELETE** /readStudents | readStudents
[**readStudentsUsingGET**](StudentControllerApi.md#readStudentsUsingGET) | **GET** /readStudents | readStudents
[**readStudentsUsingHEAD**](StudentControllerApi.md#readStudentsUsingHEAD) | **HEAD** /readStudents | readStudents
[**readStudentsUsingOPTIONS**](StudentControllerApi.md#readStudentsUsingOPTIONS) | **OPTIONS** /readStudents | readStudents
[**readStudentsUsingPATCH**](StudentControllerApi.md#readStudentsUsingPATCH) | **PATCH** /readStudents | readStudents
[**readStudentsUsingPOST**](StudentControllerApi.md#readStudentsUsingPOST) | **POST** /readStudents | readStudents
[**readStudentsUsingPUT**](StudentControllerApi.md#readStudentsUsingPUT) | **PUT** /readStudents | readStudents
[**updateStudentUsingDELETE**](StudentControllerApi.md#updateStudentUsingDELETE) | **DELETE** /updateStudent{registrationNumber} | updateStudent
[**updateStudentUsingGET**](StudentControllerApi.md#updateStudentUsingGET) | **GET** /updateStudent{registrationNumber} | updateStudent
[**updateStudentUsingHEAD**](StudentControllerApi.md#updateStudentUsingHEAD) | **HEAD** /updateStudent{registrationNumber} | updateStudent
[**updateStudentUsingOPTIONS**](StudentControllerApi.md#updateStudentUsingOPTIONS) | **OPTIONS** /updateStudent{registrationNumber} | updateStudent
[**updateStudentUsingPATCH**](StudentControllerApi.md#updateStudentUsingPATCH) | **PATCH** /updateStudent{registrationNumber} | updateStudent
[**updateStudentUsingPOST**](StudentControllerApi.md#updateStudentUsingPOST) | **POST** /updateStudent{registrationNumber} | updateStudent
[**updateStudentUsingPUT**](StudentControllerApi.md#updateStudentUsingPUT) | **PUT** /updateStudent{registrationNumber} | updateStudent


<a name="createStudentUsingDELETE"></a>
# **createStudentUsingDELETE**
> String createStudentUsingDELETE(student)

createStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
Student student = new Student(); // Student | student
try {
    String result = apiInstance.createStudentUsingDELETE(student);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#createStudentUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **student** | [**Student**](Student.md)| student |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createStudentUsingGET"></a>
# **createStudentUsingGET**
> String createStudentUsingGET(student)

createStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
Student student = new Student(); // Student | student
try {
    String result = apiInstance.createStudentUsingGET(student);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#createStudentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **student** | [**Student**](Student.md)| student |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createStudentUsingHEAD"></a>
# **createStudentUsingHEAD**
> String createStudentUsingHEAD(student)

createStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
Student student = new Student(); // Student | student
try {
    String result = apiInstance.createStudentUsingHEAD(student);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#createStudentUsingHEAD");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **student** | [**Student**](Student.md)| student |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createStudentUsingOPTIONS"></a>
# **createStudentUsingOPTIONS**
> String createStudentUsingOPTIONS(student)

createStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
Student student = new Student(); // Student | student
try {
    String result = apiInstance.createStudentUsingOPTIONS(student);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#createStudentUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **student** | [**Student**](Student.md)| student |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createStudentUsingPATCH"></a>
# **createStudentUsingPATCH**
> String createStudentUsingPATCH(student)

createStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
Student student = new Student(); // Student | student
try {
    String result = apiInstance.createStudentUsingPATCH(student);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#createStudentUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **student** | [**Student**](Student.md)| student |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createStudentUsingPOST"></a>
# **createStudentUsingPOST**
> String createStudentUsingPOST(student)

createStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
Student student = new Student(); // Student | student
try {
    String result = apiInstance.createStudentUsingPOST(student);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#createStudentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **student** | [**Student**](Student.md)| student |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createStudentUsingPUT"></a>
# **createStudentUsingPUT**
> String createStudentUsingPUT(student)

createStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
Student student = new Student(); // Student | student
try {
    String result = apiInstance.createStudentUsingPUT(student);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#createStudentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **student** | [**Student**](Student.md)| student |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteStudentUsingDELETE"></a>
# **deleteStudentUsingDELETE**
> String deleteStudentUsingDELETE(registrationNumber)

deleteStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
try {
    String result = apiInstance.deleteStudentUsingDELETE(registrationNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#deleteStudentUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteStudentUsingGET"></a>
# **deleteStudentUsingGET**
> String deleteStudentUsingGET(registrationNumber)

deleteStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
try {
    String result = apiInstance.deleteStudentUsingGET(registrationNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#deleteStudentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteStudentUsingHEAD"></a>
# **deleteStudentUsingHEAD**
> String deleteStudentUsingHEAD(registrationNumber)

deleteStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
try {
    String result = apiInstance.deleteStudentUsingHEAD(registrationNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#deleteStudentUsingHEAD");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteStudentUsingOPTIONS"></a>
# **deleteStudentUsingOPTIONS**
> String deleteStudentUsingOPTIONS(registrationNumber)

deleteStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
try {
    String result = apiInstance.deleteStudentUsingOPTIONS(registrationNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#deleteStudentUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteStudentUsingPATCH"></a>
# **deleteStudentUsingPATCH**
> String deleteStudentUsingPATCH(registrationNumber)

deleteStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
try {
    String result = apiInstance.deleteStudentUsingPATCH(registrationNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#deleteStudentUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteStudentUsingPOST"></a>
# **deleteStudentUsingPOST**
> String deleteStudentUsingPOST(registrationNumber)

deleteStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
try {
    String result = apiInstance.deleteStudentUsingPOST(registrationNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#deleteStudentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteStudentUsingPUT"></a>
# **deleteStudentUsingPUT**
> String deleteStudentUsingPUT(registrationNumber)

deleteStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
try {
    String result = apiInstance.deleteStudentUsingPUT(registrationNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#deleteStudentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readStudentsUsingDELETE"></a>
# **readStudentsUsingDELETE**
> List&lt;Student&gt; readStudentsUsingDELETE()

readStudents

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
try {
    List<Student> result = apiInstance.readStudentsUsingDELETE();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#readStudentsUsingDELETE");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="readStudentsUsingGET"></a>
# **readStudentsUsingGET**
> List&lt;Student&gt; readStudentsUsingGET()

readStudents

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
try {
    List<Student> result = apiInstance.readStudentsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#readStudentsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="readStudentsUsingHEAD"></a>
# **readStudentsUsingHEAD**
> List&lt;Student&gt; readStudentsUsingHEAD()

readStudents

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
try {
    List<Student> result = apiInstance.readStudentsUsingHEAD();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#readStudentsUsingHEAD");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readStudentsUsingOPTIONS"></a>
# **readStudentsUsingOPTIONS**
> List&lt;Student&gt; readStudentsUsingOPTIONS()

readStudents

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
try {
    List<Student> result = apiInstance.readStudentsUsingOPTIONS();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#readStudentsUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readStudentsUsingPATCH"></a>
# **readStudentsUsingPATCH**
> List&lt;Student&gt; readStudentsUsingPATCH()

readStudents

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
try {
    List<Student> result = apiInstance.readStudentsUsingPATCH();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#readStudentsUsingPATCH");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readStudentsUsingPOST"></a>
# **readStudentsUsingPOST**
> List&lt;Student&gt; readStudentsUsingPOST()

readStudents

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
try {
    List<Student> result = apiInstance.readStudentsUsingPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#readStudentsUsingPOST");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readStudentsUsingPUT"></a>
# **readStudentsUsingPUT**
> List&lt;Student&gt; readStudentsUsingPUT()

readStudents

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
try {
    List<Student> result = apiInstance.readStudentsUsingPUT();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#readStudentsUsingPUT");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateStudentUsingDELETE"></a>
# **updateStudentUsingDELETE**
> String updateStudentUsingDELETE(registrationNumber, updateStudent)

updateStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
Student updateStudent = new Student(); // Student | updateStudent
try {
    String result = apiInstance.updateStudentUsingDELETE(registrationNumber, updateStudent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#updateStudentUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |
 **updateStudent** | [**Student**](Student.md)| updateStudent |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateStudentUsingGET"></a>
# **updateStudentUsingGET**
> String updateStudentUsingGET(registrationNumber, updateStudent)

updateStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
Student updateStudent = new Student(); // Student | updateStudent
try {
    String result = apiInstance.updateStudentUsingGET(registrationNumber, updateStudent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#updateStudentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |
 **updateStudent** | [**Student**](Student.md)| updateStudent |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateStudentUsingHEAD"></a>
# **updateStudentUsingHEAD**
> String updateStudentUsingHEAD(registrationNumber, updateStudent)

updateStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
Student updateStudent = new Student(); // Student | updateStudent
try {
    String result = apiInstance.updateStudentUsingHEAD(registrationNumber, updateStudent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#updateStudentUsingHEAD");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |
 **updateStudent** | [**Student**](Student.md)| updateStudent |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateStudentUsingOPTIONS"></a>
# **updateStudentUsingOPTIONS**
> String updateStudentUsingOPTIONS(registrationNumber, updateStudent)

updateStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
Student updateStudent = new Student(); // Student | updateStudent
try {
    String result = apiInstance.updateStudentUsingOPTIONS(registrationNumber, updateStudent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#updateStudentUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |
 **updateStudent** | [**Student**](Student.md)| updateStudent |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateStudentUsingPATCH"></a>
# **updateStudentUsingPATCH**
> String updateStudentUsingPATCH(registrationNumber, updateStudent)

updateStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
Student updateStudent = new Student(); // Student | updateStudent
try {
    String result = apiInstance.updateStudentUsingPATCH(registrationNumber, updateStudent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#updateStudentUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |
 **updateStudent** | [**Student**](Student.md)| updateStudent |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateStudentUsingPOST"></a>
# **updateStudentUsingPOST**
> String updateStudentUsingPOST(registrationNumber, updateStudent)

updateStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
Student updateStudent = new Student(); // Student | updateStudent
try {
    String result = apiInstance.updateStudentUsingPOST(registrationNumber, updateStudent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#updateStudentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |
 **updateStudent** | [**Student**](Student.md)| updateStudent |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateStudentUsingPUT"></a>
# **updateStudentUsingPUT**
> String updateStudentUsingPUT(registrationNumber, updateStudent)

updateStudent

### Example
```java
// Import classes:
//import com.registry.student.client.invoker.ApiException;
//import com.registry.student.client.api.StudentControllerApi;


StudentControllerApi apiInstance = new StudentControllerApi();
String registrationNumber = "registrationNumber_example"; // String | registrationNumber
Student updateStudent = new Student(); // Student | updateStudent
try {
    String result = apiInstance.updateStudentUsingPUT(registrationNumber, updateStudent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentControllerApi#updateStudentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registrationNumber** | **String**| registrationNumber |
 **updateStudent** | [**Student**](Student.md)| updateStudent |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

