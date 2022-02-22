# CourseControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCourseUsingDELETE**](CourseControllerApi.md#createCourseUsingDELETE) | **DELETE** /createCourse | createCourse
[**createCourseUsingGET**](CourseControllerApi.md#createCourseUsingGET) | **GET** /createCourse | createCourse
[**createCourseUsingHEAD**](CourseControllerApi.md#createCourseUsingHEAD) | **HEAD** /createCourse | createCourse
[**createCourseUsingOPTIONS**](CourseControllerApi.md#createCourseUsingOPTIONS) | **OPTIONS** /createCourse | createCourse
[**createCourseUsingPATCH**](CourseControllerApi.md#createCourseUsingPATCH) | **PATCH** /createCourse | createCourse
[**createCourseUsingPOST**](CourseControllerApi.md#createCourseUsingPOST) | **POST** /createCourse | createCourse
[**createCourseUsingPUT**](CourseControllerApi.md#createCourseUsingPUT) | **PUT** /createCourse | createCourse
[**deleteCourseUsingDELETE**](CourseControllerApi.md#deleteCourseUsingDELETE) | **DELETE** /deleteCourse{courseId} | deleteCourse
[**deleteCourseUsingGET**](CourseControllerApi.md#deleteCourseUsingGET) | **GET** /deleteCourse{courseId} | deleteCourse
[**deleteCourseUsingHEAD**](CourseControllerApi.md#deleteCourseUsingHEAD) | **HEAD** /deleteCourse{courseId} | deleteCourse
[**deleteCourseUsingOPTIONS**](CourseControllerApi.md#deleteCourseUsingOPTIONS) | **OPTIONS** /deleteCourse{courseId} | deleteCourse
[**deleteCourseUsingPATCH**](CourseControllerApi.md#deleteCourseUsingPATCH) | **PATCH** /deleteCourse{courseId} | deleteCourse
[**deleteCourseUsingPOST**](CourseControllerApi.md#deleteCourseUsingPOST) | **POST** /deleteCourse{courseId} | deleteCourse
[**deleteCourseUsingPUT**](CourseControllerApi.md#deleteCourseUsingPUT) | **PUT** /deleteCourse{courseId} | deleteCourse
[**readCoursesUsingDELETE**](CourseControllerApi.md#readCoursesUsingDELETE) | **DELETE** /readCourses | readCourses
[**readCoursesUsingGET**](CourseControllerApi.md#readCoursesUsingGET) | **GET** /readCourses | readCourses
[**readCoursesUsingHEAD**](CourseControllerApi.md#readCoursesUsingHEAD) | **HEAD** /readCourses | readCourses
[**readCoursesUsingOPTIONS**](CourseControllerApi.md#readCoursesUsingOPTIONS) | **OPTIONS** /readCourses | readCourses
[**readCoursesUsingPATCH**](CourseControllerApi.md#readCoursesUsingPATCH) | **PATCH** /readCourses | readCourses
[**readCoursesUsingPOST**](CourseControllerApi.md#readCoursesUsingPOST) | **POST** /readCourses | readCourses
[**readCoursesUsingPUT**](CourseControllerApi.md#readCoursesUsingPUT) | **PUT** /readCourses | readCourses
[**updateCourseUsingDELETE**](CourseControllerApi.md#updateCourseUsingDELETE) | **DELETE** /updateCourse{courseId} | updateCourse
[**updateCourseUsingGET**](CourseControllerApi.md#updateCourseUsingGET) | **GET** /updateCourse{courseId} | updateCourse
[**updateCourseUsingHEAD**](CourseControllerApi.md#updateCourseUsingHEAD) | **HEAD** /updateCourse{courseId} | updateCourse
[**updateCourseUsingOPTIONS**](CourseControllerApi.md#updateCourseUsingOPTIONS) | **OPTIONS** /updateCourse{courseId} | updateCourse
[**updateCourseUsingPATCH**](CourseControllerApi.md#updateCourseUsingPATCH) | **PATCH** /updateCourse{courseId} | updateCourse
[**updateCourseUsingPOST**](CourseControllerApi.md#updateCourseUsingPOST) | **POST** /updateCourse{courseId} | updateCourse
[**updateCourseUsingPUT**](CourseControllerApi.md#updateCourseUsingPUT) | **PUT** /updateCourse{courseId} | updateCourse


<a name="createCourseUsingDELETE"></a>
# **createCourseUsingDELETE**
> String createCourseUsingDELETE(course)

createCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
Course course = new Course(); // Course | course
try {
    String result = apiInstance.createCourseUsingDELETE(course);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#createCourseUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **course** | [**Course**](Course.md)| course |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createCourseUsingGET"></a>
# **createCourseUsingGET**
> String createCourseUsingGET(course)

createCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
Course course = new Course(); // Course | course
try {
    String result = apiInstance.createCourseUsingGET(course);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#createCourseUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **course** | [**Course**](Course.md)| course |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createCourseUsingHEAD"></a>
# **createCourseUsingHEAD**
> String createCourseUsingHEAD(course)

createCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
Course course = new Course(); // Course | course
try {
    String result = apiInstance.createCourseUsingHEAD(course);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#createCourseUsingHEAD");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **course** | [**Course**](Course.md)| course |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createCourseUsingOPTIONS"></a>
# **createCourseUsingOPTIONS**
> String createCourseUsingOPTIONS(course)

createCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
Course course = new Course(); // Course | course
try {
    String result = apiInstance.createCourseUsingOPTIONS(course);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#createCourseUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **course** | [**Course**](Course.md)| course |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createCourseUsingPATCH"></a>
# **createCourseUsingPATCH**
> String createCourseUsingPATCH(course)

createCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
Course course = new Course(); // Course | course
try {
    String result = apiInstance.createCourseUsingPATCH(course);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#createCourseUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **course** | [**Course**](Course.md)| course |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createCourseUsingPOST"></a>
# **createCourseUsingPOST**
> String createCourseUsingPOST(course)

createCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
Course course = new Course(); // Course | course
try {
    String result = apiInstance.createCourseUsingPOST(course);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#createCourseUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **course** | [**Course**](Course.md)| course |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createCourseUsingPUT"></a>
# **createCourseUsingPUT**
> String createCourseUsingPUT(course)

createCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
Course course = new Course(); // Course | course
try {
    String result = apiInstance.createCourseUsingPUT(course);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#createCourseUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **course** | [**Course**](Course.md)| course |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCourseUsingDELETE"></a>
# **deleteCourseUsingDELETE**
> String deleteCourseUsingDELETE(courseId)

deleteCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
try {
    String result = apiInstance.deleteCourseUsingDELETE(courseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#deleteCourseUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteCourseUsingGET"></a>
# **deleteCourseUsingGET**
> String deleteCourseUsingGET(courseId)

deleteCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
try {
    String result = apiInstance.deleteCourseUsingGET(courseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#deleteCourseUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteCourseUsingHEAD"></a>
# **deleteCourseUsingHEAD**
> String deleteCourseUsingHEAD(courseId)

deleteCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
try {
    String result = apiInstance.deleteCourseUsingHEAD(courseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#deleteCourseUsingHEAD");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCourseUsingOPTIONS"></a>
# **deleteCourseUsingOPTIONS**
> String deleteCourseUsingOPTIONS(courseId)

deleteCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
try {
    String result = apiInstance.deleteCourseUsingOPTIONS(courseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#deleteCourseUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCourseUsingPATCH"></a>
# **deleteCourseUsingPATCH**
> String deleteCourseUsingPATCH(courseId)

deleteCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
try {
    String result = apiInstance.deleteCourseUsingPATCH(courseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#deleteCourseUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCourseUsingPOST"></a>
# **deleteCourseUsingPOST**
> String deleteCourseUsingPOST(courseId)

deleteCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
try {
    String result = apiInstance.deleteCourseUsingPOST(courseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#deleteCourseUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCourseUsingPUT"></a>
# **deleteCourseUsingPUT**
> String deleteCourseUsingPUT(courseId)

deleteCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
try {
    String result = apiInstance.deleteCourseUsingPUT(courseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#deleteCourseUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readCoursesUsingDELETE"></a>
# **readCoursesUsingDELETE**
> List&lt;Course&gt; readCoursesUsingDELETE()

readCourses

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
try {
    List<Course> result = apiInstance.readCoursesUsingDELETE();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#readCoursesUsingDELETE");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="readCoursesUsingGET"></a>
# **readCoursesUsingGET**
> List&lt;Course&gt; readCoursesUsingGET()

readCourses

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
try {
    List<Course> result = apiInstance.readCoursesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#readCoursesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="readCoursesUsingHEAD"></a>
# **readCoursesUsingHEAD**
> List&lt;Course&gt; readCoursesUsingHEAD()

readCourses

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
try {
    List<Course> result = apiInstance.readCoursesUsingHEAD();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#readCoursesUsingHEAD");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readCoursesUsingOPTIONS"></a>
# **readCoursesUsingOPTIONS**
> List&lt;Course&gt; readCoursesUsingOPTIONS()

readCourses

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
try {
    List<Course> result = apiInstance.readCoursesUsingOPTIONS();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#readCoursesUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readCoursesUsingPATCH"></a>
# **readCoursesUsingPATCH**
> List&lt;Course&gt; readCoursesUsingPATCH()

readCourses

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
try {
    List<Course> result = apiInstance.readCoursesUsingPATCH();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#readCoursesUsingPATCH");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readCoursesUsingPOST"></a>
# **readCoursesUsingPOST**
> List&lt;Course&gt; readCoursesUsingPOST()

readCourses

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
try {
    List<Course> result = apiInstance.readCoursesUsingPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#readCoursesUsingPOST");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="readCoursesUsingPUT"></a>
# **readCoursesUsingPUT**
> List&lt;Course&gt; readCoursesUsingPUT()

readCourses

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
try {
    List<Course> result = apiInstance.readCoursesUsingPUT();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#readCoursesUsingPUT");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCourseUsingDELETE"></a>
# **updateCourseUsingDELETE**
> String updateCourseUsingDELETE(courseId, updatedCourse)

updateCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
Course updatedCourse = new Course(); // Course | updatedCourse
try {
    String result = apiInstance.updateCourseUsingDELETE(courseId, updatedCourse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#updateCourseUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |
 **updatedCourse** | [**Course**](Course.md)| updatedCourse |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCourseUsingGET"></a>
# **updateCourseUsingGET**
> String updateCourseUsingGET(courseId, updatedCourse)

updateCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
Course updatedCourse = new Course(); // Course | updatedCourse
try {
    String result = apiInstance.updateCourseUsingGET(courseId, updatedCourse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#updateCourseUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |
 **updatedCourse** | [**Course**](Course.md)| updatedCourse |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCourseUsingHEAD"></a>
# **updateCourseUsingHEAD**
> String updateCourseUsingHEAD(courseId, updatedCourse)

updateCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
Course updatedCourse = new Course(); // Course | updatedCourse
try {
    String result = apiInstance.updateCourseUsingHEAD(courseId, updatedCourse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#updateCourseUsingHEAD");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |
 **updatedCourse** | [**Course**](Course.md)| updatedCourse |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCourseUsingOPTIONS"></a>
# **updateCourseUsingOPTIONS**
> String updateCourseUsingOPTIONS(courseId, updatedCourse)

updateCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
Course updatedCourse = new Course(); // Course | updatedCourse
try {
    String result = apiInstance.updateCourseUsingOPTIONS(courseId, updatedCourse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#updateCourseUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |
 **updatedCourse** | [**Course**](Course.md)| updatedCourse |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCourseUsingPATCH"></a>
# **updateCourseUsingPATCH**
> String updateCourseUsingPATCH(courseId, updatedCourse)

updateCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
Course updatedCourse = new Course(); // Course | updatedCourse
try {
    String result = apiInstance.updateCourseUsingPATCH(courseId, updatedCourse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#updateCourseUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |
 **updatedCourse** | [**Course**](Course.md)| updatedCourse |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCourseUsingPOST"></a>
# **updateCourseUsingPOST**
> String updateCourseUsingPOST(courseId, updatedCourse)

updateCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
Course updatedCourse = new Course(); // Course | updatedCourse
try {
    String result = apiInstance.updateCourseUsingPOST(courseId, updatedCourse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#updateCourseUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |
 **updatedCourse** | [**Course**](Course.md)| updatedCourse |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCourseUsingPUT"></a>
# **updateCourseUsingPUT**
> String updateCourseUsingPUT(courseId, updatedCourse)

updateCourse

### Example
```java
// Import classes:
//import com.registry.course.client.invoker.ApiException;
//import com.registry.course.client.api.CourseControllerApi;


CourseControllerApi apiInstance = new CourseControllerApi();
String courseId = "courseId_example"; // String | courseId
Course updatedCourse = new Course(); // Course | updatedCourse
try {
    String result = apiInstance.updateCourseUsingPUT(courseId, updatedCourse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseControllerApi#updateCourseUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **String**| courseId |
 **updatedCourse** | [**Course**](Course.md)| updatedCourse |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

