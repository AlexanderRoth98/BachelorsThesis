# ExamControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExamUsingDELETE**](ExamControllerApi.md#createExamUsingDELETE) | **DELETE** /createExam | createExam
[**createExamUsingGET**](ExamControllerApi.md#createExamUsingGET) | **GET** /createExam | createExam
[**createExamUsingHEAD**](ExamControllerApi.md#createExamUsingHEAD) | **HEAD** /createExam | createExam
[**createExamUsingOPTIONS**](ExamControllerApi.md#createExamUsingOPTIONS) | **OPTIONS** /createExam | createExam
[**createExamUsingPATCH**](ExamControllerApi.md#createExamUsingPATCH) | **PATCH** /createExam | createExam
[**createExamUsingPOST**](ExamControllerApi.md#createExamUsingPOST) | **POST** /createExam | createExam
[**createExamUsingPUT**](ExamControllerApi.md#createExamUsingPUT) | **PUT** /createExam | createExam
[**deleteExamUsingDELETE**](ExamControllerApi.md#deleteExamUsingDELETE) | **DELETE** /deleteExam{examId} | deleteExam
[**deleteExamUsingGET**](ExamControllerApi.md#deleteExamUsingGET) | **GET** /deleteExam{examId} | deleteExam
[**deleteExamUsingHEAD**](ExamControllerApi.md#deleteExamUsingHEAD) | **HEAD** /deleteExam{examId} | deleteExam
[**deleteExamUsingOPTIONS**](ExamControllerApi.md#deleteExamUsingOPTIONS) | **OPTIONS** /deleteExam{examId} | deleteExam
[**deleteExamUsingPATCH**](ExamControllerApi.md#deleteExamUsingPATCH) | **PATCH** /deleteExam{examId} | deleteExam
[**deleteExamUsingPOST**](ExamControllerApi.md#deleteExamUsingPOST) | **POST** /deleteExam{examId} | deleteExam
[**deleteExamUsingPUT**](ExamControllerApi.md#deleteExamUsingPUT) | **PUT** /deleteExam{examId} | deleteExam
[**readExamUsingDELETE**](ExamControllerApi.md#readExamUsingDELETE) | **DELETE** /readExams | readExam
[**readExamUsingGET**](ExamControllerApi.md#readExamUsingGET) | **GET** /readExams | readExam
[**readExamUsingHEAD**](ExamControllerApi.md#readExamUsingHEAD) | **HEAD** /readExams | readExam
[**readExamUsingOPTIONS**](ExamControllerApi.md#readExamUsingOPTIONS) | **OPTIONS** /readExams | readExam
[**readExamUsingPATCH**](ExamControllerApi.md#readExamUsingPATCH) | **PATCH** /readExams | readExam
[**readExamUsingPOST**](ExamControllerApi.md#readExamUsingPOST) | **POST** /readExams | readExam
[**readExamUsingPUT**](ExamControllerApi.md#readExamUsingPUT) | **PUT** /readExams | readExam
[**updateExamUsingDELETE**](ExamControllerApi.md#updateExamUsingDELETE) | **DELETE** /updateExam{examId} | updateExam
[**updateExamUsingGET**](ExamControllerApi.md#updateExamUsingGET) | **GET** /updateExam{examId} | updateExam
[**updateExamUsingHEAD**](ExamControllerApi.md#updateExamUsingHEAD) | **HEAD** /updateExam{examId} | updateExam
[**updateExamUsingOPTIONS**](ExamControllerApi.md#updateExamUsingOPTIONS) | **OPTIONS** /updateExam{examId} | updateExam
[**updateExamUsingPATCH**](ExamControllerApi.md#updateExamUsingPATCH) | **PATCH** /updateExam{examId} | updateExam
[**updateExamUsingPOST**](ExamControllerApi.md#updateExamUsingPOST) | **POST** /updateExam{examId} | updateExam
[**updateExamUsingPUT**](ExamControllerApi.md#updateExamUsingPUT) | **PUT** /updateExam{examId} | updateExam


<a name="createExamUsingDELETE"></a>
# **createExamUsingDELETE**
> String createExamUsingDELETE(exam)

createExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
Exam exam = new Exam(); // Exam | exam
try {
    String result = apiInstance.createExamUsingDELETE(exam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#createExamUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exam** | [**Exam**](Exam.md)| exam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createExamUsingGET"></a>
# **createExamUsingGET**
> String createExamUsingGET(exam)

createExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
Exam exam = new Exam(); // Exam | exam
try {
    String result = apiInstance.createExamUsingGET(exam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#createExamUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exam** | [**Exam**](Exam.md)| exam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createExamUsingHEAD"></a>
# **createExamUsingHEAD**
> String createExamUsingHEAD(exam)

createExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
Exam exam = new Exam(); // Exam | exam
try {
    String result = apiInstance.createExamUsingHEAD(exam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#createExamUsingHEAD");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exam** | [**Exam**](Exam.md)| exam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createExamUsingOPTIONS"></a>
# **createExamUsingOPTIONS**
> String createExamUsingOPTIONS(exam)

createExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
Exam exam = new Exam(); // Exam | exam
try {
    String result = apiInstance.createExamUsingOPTIONS(exam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#createExamUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exam** | [**Exam**](Exam.md)| exam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createExamUsingPATCH"></a>
# **createExamUsingPATCH**
> String createExamUsingPATCH(exam)

createExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
Exam exam = new Exam(); // Exam | exam
try {
    String result = apiInstance.createExamUsingPATCH(exam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#createExamUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exam** | [**Exam**](Exam.md)| exam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createExamUsingPOST"></a>
# **createExamUsingPOST**
> String createExamUsingPOST(exam)

createExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
Exam exam = new Exam(); // Exam | exam
try {
    String result = apiInstance.createExamUsingPOST(exam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#createExamUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exam** | [**Exam**](Exam.md)| exam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createExamUsingPUT"></a>
# **createExamUsingPUT**
> String createExamUsingPUT(exam)

createExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
Exam exam = new Exam(); // Exam | exam
try {
    String result = apiInstance.createExamUsingPUT(exam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#createExamUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exam** | [**Exam**](Exam.md)| exam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteExamUsingDELETE"></a>
# **deleteExamUsingDELETE**
> String deleteExamUsingDELETE(examId)

deleteExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
try {
    String result = apiInstance.deleteExamUsingDELETE(examId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#deleteExamUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteExamUsingGET"></a>
# **deleteExamUsingGET**
> String deleteExamUsingGET(examId)

deleteExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
try {
    String result = apiInstance.deleteExamUsingGET(examId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#deleteExamUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteExamUsingHEAD"></a>
# **deleteExamUsingHEAD**
> String deleteExamUsingHEAD(examId)

deleteExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
try {
    String result = apiInstance.deleteExamUsingHEAD(examId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#deleteExamUsingHEAD");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteExamUsingOPTIONS"></a>
# **deleteExamUsingOPTIONS**
> String deleteExamUsingOPTIONS(examId)

deleteExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
try {
    String result = apiInstance.deleteExamUsingOPTIONS(examId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#deleteExamUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteExamUsingPATCH"></a>
# **deleteExamUsingPATCH**
> String deleteExamUsingPATCH(examId)

deleteExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
try {
    String result = apiInstance.deleteExamUsingPATCH(examId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#deleteExamUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteExamUsingPOST"></a>
# **deleteExamUsingPOST**
> String deleteExamUsingPOST(examId)

deleteExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
try {
    String result = apiInstance.deleteExamUsingPOST(examId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#deleteExamUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteExamUsingPUT"></a>
# **deleteExamUsingPUT**
> String deleteExamUsingPUT(examId)

deleteExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
try {
    String result = apiInstance.deleteExamUsingPUT(examId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#deleteExamUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readExamUsingDELETE"></a>
# **readExamUsingDELETE**
> List&lt;Exam&gt; readExamUsingDELETE()

readExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
try {
    List<Exam> result = apiInstance.readExamUsingDELETE();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#readExamUsingDELETE");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Exam&gt;**](Exam.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="readExamUsingGET"></a>
# **readExamUsingGET**
> List&lt;Exam&gt; readExamUsingGET()

readExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
try {
    List<Exam> result = apiInstance.readExamUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#readExamUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Exam&gt;**](Exam.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="readExamUsingHEAD"></a>
# **readExamUsingHEAD**
> List&lt;Exam&gt; readExamUsingHEAD()

readExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
try {
    List<Exam> result = apiInstance.readExamUsingHEAD();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#readExamUsingHEAD");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Exam&gt;**](Exam.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readExamUsingOPTIONS"></a>
# **readExamUsingOPTIONS**
> List&lt;Exam&gt; readExamUsingOPTIONS()

readExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
try {
    List<Exam> result = apiInstance.readExamUsingOPTIONS();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#readExamUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Exam&gt;**](Exam.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readExamUsingPATCH"></a>
# **readExamUsingPATCH**
> List&lt;Exam&gt; readExamUsingPATCH()

readExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
try {
    List<Exam> result = apiInstance.readExamUsingPATCH();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#readExamUsingPATCH");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Exam&gt;**](Exam.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readExamUsingPOST"></a>
# **readExamUsingPOST**
> List&lt;Exam&gt; readExamUsingPOST()

readExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
try {
    List<Exam> result = apiInstance.readExamUsingPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#readExamUsingPOST");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Exam&gt;**](Exam.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readExamUsingPUT"></a>
# **readExamUsingPUT**
> List&lt;Exam&gt; readExamUsingPUT()

readExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
try {
    List<Exam> result = apiInstance.readExamUsingPUT();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#readExamUsingPUT");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Exam&gt;**](Exam.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateExamUsingDELETE"></a>
# **updateExamUsingDELETE**
> String updateExamUsingDELETE(examId, updatedExam)

updateExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
Exam updatedExam = new Exam(); // Exam | updatedExam
try {
    String result = apiInstance.updateExamUsingDELETE(examId, updatedExam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#updateExamUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |
 **updatedExam** | [**Exam**](Exam.md)| updatedExam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateExamUsingGET"></a>
# **updateExamUsingGET**
> String updateExamUsingGET(examId, updatedExam)

updateExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
Exam updatedExam = new Exam(); // Exam | updatedExam
try {
    String result = apiInstance.updateExamUsingGET(examId, updatedExam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#updateExamUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |
 **updatedExam** | [**Exam**](Exam.md)| updatedExam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateExamUsingHEAD"></a>
# **updateExamUsingHEAD**
> String updateExamUsingHEAD(examId, updatedExam)

updateExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
Exam updatedExam = new Exam(); // Exam | updatedExam
try {
    String result = apiInstance.updateExamUsingHEAD(examId, updatedExam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#updateExamUsingHEAD");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |
 **updatedExam** | [**Exam**](Exam.md)| updatedExam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateExamUsingOPTIONS"></a>
# **updateExamUsingOPTIONS**
> String updateExamUsingOPTIONS(examId, updatedExam)

updateExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
Exam updatedExam = new Exam(); // Exam | updatedExam
try {
    String result = apiInstance.updateExamUsingOPTIONS(examId, updatedExam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#updateExamUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |
 **updatedExam** | [**Exam**](Exam.md)| updatedExam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateExamUsingPATCH"></a>
# **updateExamUsingPATCH**
> String updateExamUsingPATCH(examId, updatedExam)

updateExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
Exam updatedExam = new Exam(); // Exam | updatedExam
try {
    String result = apiInstance.updateExamUsingPATCH(examId, updatedExam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#updateExamUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |
 **updatedExam** | [**Exam**](Exam.md)| updatedExam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateExamUsingPOST"></a>
# **updateExamUsingPOST**
> String updateExamUsingPOST(examId, updatedExam)

updateExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
Exam updatedExam = new Exam(); // Exam | updatedExam
try {
    String result = apiInstance.updateExamUsingPOST(examId, updatedExam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#updateExamUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |
 **updatedExam** | [**Exam**](Exam.md)| updatedExam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateExamUsingPUT"></a>
# **updateExamUsingPUT**
> String updateExamUsingPUT(examId, updatedExam)

updateExam

### Example
```java
// Import classes:
//import com.registry.exam.client.invoker.ApiException;
//import com.registry.exam.client.api.ExamControllerApi;


ExamControllerApi apiInstance = new ExamControllerApi();
String examId = "examId_example"; // String | examId
Exam updatedExam = new Exam(); // Exam | updatedExam
try {
    String result = apiInstance.updateExamUsingPUT(examId, updatedExam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExamControllerApi#updateExamUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **examId** | **String**| examId |
 **updatedExam** | [**Exam**](Exam.md)| updatedExam |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

