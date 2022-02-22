# StudentClient

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
    <groupId>StudentClient</groupId>
    <artifactId>StudentClient</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "StudentClient:StudentClient:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/StudentClient-0.0.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.registry.student.client.invoker.*;
import com.registry.student.client.invoker.auth.*;
import com.registry.student.client.model.*;
import com.registry.student.client.api.BasicErrorControllerApi;

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
*StudentControllerApi* | [**createStudentUsingDELETE**](docs/StudentControllerApi.md#createStudentUsingDELETE) | **DELETE** /createStudent | createStudent
*StudentControllerApi* | [**createStudentUsingGET**](docs/StudentControllerApi.md#createStudentUsingGET) | **GET** /createStudent | createStudent
*StudentControllerApi* | [**createStudentUsingHEAD**](docs/StudentControllerApi.md#createStudentUsingHEAD) | **HEAD** /createStudent | createStudent
*StudentControllerApi* | [**createStudentUsingOPTIONS**](docs/StudentControllerApi.md#createStudentUsingOPTIONS) | **OPTIONS** /createStudent | createStudent
*StudentControllerApi* | [**createStudentUsingPATCH**](docs/StudentControllerApi.md#createStudentUsingPATCH) | **PATCH** /createStudent | createStudent
*StudentControllerApi* | [**createStudentUsingPOST**](docs/StudentControllerApi.md#createStudentUsingPOST) | **POST** /createStudent | createStudent
*StudentControllerApi* | [**createStudentUsingPUT**](docs/StudentControllerApi.md#createStudentUsingPUT) | **PUT** /createStudent | createStudent
*StudentControllerApi* | [**deleteStudentUsingDELETE**](docs/StudentControllerApi.md#deleteStudentUsingDELETE) | **DELETE** /deleteStudent{registrationNumber} | deleteStudent
*StudentControllerApi* | [**deleteStudentUsingGET**](docs/StudentControllerApi.md#deleteStudentUsingGET) | **GET** /deleteStudent{registrationNumber} | deleteStudent
*StudentControllerApi* | [**deleteStudentUsingHEAD**](docs/StudentControllerApi.md#deleteStudentUsingHEAD) | **HEAD** /deleteStudent{registrationNumber} | deleteStudent
*StudentControllerApi* | [**deleteStudentUsingOPTIONS**](docs/StudentControllerApi.md#deleteStudentUsingOPTIONS) | **OPTIONS** /deleteStudent{registrationNumber} | deleteStudent
*StudentControllerApi* | [**deleteStudentUsingPATCH**](docs/StudentControllerApi.md#deleteStudentUsingPATCH) | **PATCH** /deleteStudent{registrationNumber} | deleteStudent
*StudentControllerApi* | [**deleteStudentUsingPOST**](docs/StudentControllerApi.md#deleteStudentUsingPOST) | **POST** /deleteStudent{registrationNumber} | deleteStudent
*StudentControllerApi* | [**deleteStudentUsingPUT**](docs/StudentControllerApi.md#deleteStudentUsingPUT) | **PUT** /deleteStudent{registrationNumber} | deleteStudent
*StudentControllerApi* | [**readStudentsUsingDELETE**](docs/StudentControllerApi.md#readStudentsUsingDELETE) | **DELETE** /readStudents | readStudents
*StudentControllerApi* | [**readStudentsUsingGET**](docs/StudentControllerApi.md#readStudentsUsingGET) | **GET** /readStudents | readStudents
*StudentControllerApi* | [**readStudentsUsingHEAD**](docs/StudentControllerApi.md#readStudentsUsingHEAD) | **HEAD** /readStudents | readStudents
*StudentControllerApi* | [**readStudentsUsingOPTIONS**](docs/StudentControllerApi.md#readStudentsUsingOPTIONS) | **OPTIONS** /readStudents | readStudents
*StudentControllerApi* | [**readStudentsUsingPATCH**](docs/StudentControllerApi.md#readStudentsUsingPATCH) | **PATCH** /readStudents | readStudents
*StudentControllerApi* | [**readStudentsUsingPOST**](docs/StudentControllerApi.md#readStudentsUsingPOST) | **POST** /readStudents | readStudents
*StudentControllerApi* | [**readStudentsUsingPUT**](docs/StudentControllerApi.md#readStudentsUsingPUT) | **PUT** /readStudents | readStudents
*StudentControllerApi* | [**updateStudentUsingDELETE**](docs/StudentControllerApi.md#updateStudentUsingDELETE) | **DELETE** /updateStudent{registrationNumber} | updateStudent
*StudentControllerApi* | [**updateStudentUsingGET**](docs/StudentControllerApi.md#updateStudentUsingGET) | **GET** /updateStudent{registrationNumber} | updateStudent
*StudentControllerApi* | [**updateStudentUsingHEAD**](docs/StudentControllerApi.md#updateStudentUsingHEAD) | **HEAD** /updateStudent{registrationNumber} | updateStudent
*StudentControllerApi* | [**updateStudentUsingOPTIONS**](docs/StudentControllerApi.md#updateStudentUsingOPTIONS) | **OPTIONS** /updateStudent{registrationNumber} | updateStudent
*StudentControllerApi* | [**updateStudentUsingPATCH**](docs/StudentControllerApi.md#updateStudentUsingPATCH) | **PATCH** /updateStudent{registrationNumber} | updateStudent
*StudentControllerApi* | [**updateStudentUsingPOST**](docs/StudentControllerApi.md#updateStudentUsingPOST) | **POST** /updateStudent{registrationNumber} | updateStudent
*StudentControllerApi* | [**updateStudentUsingPUT**](docs/StudentControllerApi.md#updateStudentUsingPUT) | **PUT** /updateStudent{registrationNumber} | updateStudent


## Documentation for Models

 - [ModelAndView](docs/ModelAndView.md)
 - [Student](docs/Student.md)
 - [View](docs/View.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



