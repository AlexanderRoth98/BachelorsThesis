# CourseClient

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>CourseClient</groupId>
    <artifactId>CourseClient</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "CourseClient:CourseClient:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/CourseClient-0.0.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.registry.course.client.invoker.*;
import com.registry.course.client.invoker.auth.*;
import com.registry.course.client.model.*;
import com.registry.course.client.api.BasicErrorControllerApi;

import java.io.File;
import java.util.*;

public class BasicErrorControllerApiExample {

    public static void main(String[] args) {
        
        BasicErrorControllerApi apiInstance = new BasicErrorControllerApi();
        try {
            ModelAndView result = apiInstance.errorHtmlUsingDELETE();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BasicErrorControllerApi#errorHtmlUsingDELETE");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BasicErrorControllerApi* | [**errorHtmlUsingDELETE**](docs/BasicErrorControllerApi.md#errorHtmlUsingDELETE) | **DELETE** /error | errorHtml
*BasicErrorControllerApi* | [**errorHtmlUsingGET**](docs/BasicErrorControllerApi.md#errorHtmlUsingGET) | **GET** /error | errorHtml
*BasicErrorControllerApi* | [**errorHtmlUsingHEAD**](docs/BasicErrorControllerApi.md#errorHtmlUsingHEAD) | **HEAD** /error | errorHtml
*BasicErrorControllerApi* | [**errorHtmlUsingOPTIONS**](docs/BasicErrorControllerApi.md#errorHtmlUsingOPTIONS) | **OPTIONS** /error | errorHtml
*BasicErrorControllerApi* | [**errorHtmlUsingPATCH**](docs/BasicErrorControllerApi.md#errorHtmlUsingPATCH) | **PATCH** /error | errorHtml
*BasicErrorControllerApi* | [**errorHtmlUsingPOST**](docs/BasicErrorControllerApi.md#errorHtmlUsingPOST) | **POST** /error | errorHtml
*BasicErrorControllerApi* | [**errorHtmlUsingPUT**](docs/BasicErrorControllerApi.md#errorHtmlUsingPUT) | **PUT** /error | errorHtml
*CourseControllerApi* | [**createCourseUsingDELETE**](docs/CourseControllerApi.md#createCourseUsingDELETE) | **DELETE** /createCourse | createCourse
*CourseControllerApi* | [**createCourseUsingGET**](docs/CourseControllerApi.md#createCourseUsingGET) | **GET** /createCourse | createCourse
*CourseControllerApi* | [**createCourseUsingHEAD**](docs/CourseControllerApi.md#createCourseUsingHEAD) | **HEAD** /createCourse | createCourse
*CourseControllerApi* | [**createCourseUsingOPTIONS**](docs/CourseControllerApi.md#createCourseUsingOPTIONS) | **OPTIONS** /createCourse | createCourse
*CourseControllerApi* | [**createCourseUsingPATCH**](docs/CourseControllerApi.md#createCourseUsingPATCH) | **PATCH** /createCourse | createCourse
*CourseControllerApi* | [**createCourseUsingPOST**](docs/CourseControllerApi.md#createCourseUsingPOST) | **POST** /createCourse | createCourse
*CourseControllerApi* | [**createCourseUsingPUT**](docs/CourseControllerApi.md#createCourseUsingPUT) | **PUT** /createCourse | createCourse
*CourseControllerApi* | [**deleteCourseUsingDELETE**](docs/CourseControllerApi.md#deleteCourseUsingDELETE) | **DELETE** /deleteCourse{courseId} | deleteCourse
*CourseControllerApi* | [**deleteCourseUsingGET**](docs/CourseControllerApi.md#deleteCourseUsingGET) | **GET** /deleteCourse{courseId} | deleteCourse
*CourseControllerApi* | [**deleteCourseUsingHEAD**](docs/CourseControllerApi.md#deleteCourseUsingHEAD) | **HEAD** /deleteCourse{courseId} | deleteCourse
*CourseControllerApi* | [**deleteCourseUsingOPTIONS**](docs/CourseControllerApi.md#deleteCourseUsingOPTIONS) | **OPTIONS** /deleteCourse{courseId} | deleteCourse
*CourseControllerApi* | [**deleteCourseUsingPATCH**](docs/CourseControllerApi.md#deleteCourseUsingPATCH) | **PATCH** /deleteCourse{courseId} | deleteCourse
*CourseControllerApi* | [**deleteCourseUsingPOST**](docs/CourseControllerApi.md#deleteCourseUsingPOST) | **POST** /deleteCourse{courseId} | deleteCourse
*CourseControllerApi* | [**deleteCourseUsingPUT**](docs/CourseControllerApi.md#deleteCourseUsingPUT) | **PUT** /deleteCourse{courseId} | deleteCourse
*CourseControllerApi* | [**readCoursesUsingDELETE**](docs/CourseControllerApi.md#readCoursesUsingDELETE) | **DELETE** /readCourses | readCourses
*CourseControllerApi* | [**readCoursesUsingGET**](docs/CourseControllerApi.md#readCoursesUsingGET) | **GET** /readCourses | readCourses
*CourseControllerApi* | [**readCoursesUsingHEAD**](docs/CourseControllerApi.md#readCoursesUsingHEAD) | **HEAD** /readCourses | readCourses
*CourseControllerApi* | [**readCoursesUsingOPTIONS**](docs/CourseControllerApi.md#readCoursesUsingOPTIONS) | **OPTIONS** /readCourses | readCourses
*CourseControllerApi* | [**readCoursesUsingPATCH**](docs/CourseControllerApi.md#readCoursesUsingPATCH) | **PATCH** /readCourses | readCourses
*CourseControllerApi* | [**readCoursesUsingPOST**](docs/CourseControllerApi.md#readCoursesUsingPOST) | **POST** /readCourses | readCourses
*CourseControllerApi* | [**readCoursesUsingPUT**](docs/CourseControllerApi.md#readCoursesUsingPUT) | **PUT** /readCourses | readCourses
*CourseControllerApi* | [**updateCourseUsingDELETE**](docs/CourseControllerApi.md#updateCourseUsingDELETE) | **DELETE** /updateCourse{courseId} | updateCourse
*CourseControllerApi* | [**updateCourseUsingGET**](docs/CourseControllerApi.md#updateCourseUsingGET) | **GET** /updateCourse{courseId} | updateCourse
*CourseControllerApi* | [**updateCourseUsingHEAD**](docs/CourseControllerApi.md#updateCourseUsingHEAD) | **HEAD** /updateCourse{courseId} | updateCourse
*CourseControllerApi* | [**updateCourseUsingOPTIONS**](docs/CourseControllerApi.md#updateCourseUsingOPTIONS) | **OPTIONS** /updateCourse{courseId} | updateCourse
*CourseControllerApi* | [**updateCourseUsingPATCH**](docs/CourseControllerApi.md#updateCourseUsingPATCH) | **PATCH** /updateCourse{courseId} | updateCourse
*CourseControllerApi* | [**updateCourseUsingPOST**](docs/CourseControllerApi.md#updateCourseUsingPOST) | **POST** /updateCourse{courseId} | updateCourse
*CourseControllerApi* | [**updateCourseUsingPUT**](docs/CourseControllerApi.md#updateCourseUsingPUT) | **PUT** /updateCourse{courseId} | updateCourse


## Documentation for Models

 - [Course](docs/Course.md)
 - [ModelAndView](docs/ModelAndView.md)
 - [View](docs/View.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



