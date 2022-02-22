# ExamClient

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
    <groupId>ExamClient</groupId>
    <artifactId>ExamClient</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "ExamClient:ExamClient:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/ExamClient-0.0.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.registry.exam.client.invoker.*;
import com.registry.exam.client.invoker.auth.*;
import com.registry.exam.client.model.*;
import com.registry.exam.client.api.BasicErrorControllerApi;

import java.io.File;
import java.util.*;

public class BasicErrorControllerApiExample {

    public static void main(String[] args) {
        
        BasicErrorControllerApi apiInstance = new BasicErrorControllerApi();
        try {
            Map<String, Object> result = apiInstance.errorUsingDELETE();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BasicErrorControllerApi#errorUsingDELETE");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BasicErrorControllerApi* | [**errorUsingDELETE**](docs/BasicErrorControllerApi.md#errorUsingDELETE) | **DELETE** /error | error
*BasicErrorControllerApi* | [**errorUsingGET**](docs/BasicErrorControllerApi.md#errorUsingGET) | **GET** /error | error
*BasicErrorControllerApi* | [**errorUsingHEAD**](docs/BasicErrorControllerApi.md#errorUsingHEAD) | **HEAD** /error | error
*BasicErrorControllerApi* | [**errorUsingOPTIONS**](docs/BasicErrorControllerApi.md#errorUsingOPTIONS) | **OPTIONS** /error | error
*BasicErrorControllerApi* | [**errorUsingPATCH**](docs/BasicErrorControllerApi.md#errorUsingPATCH) | **PATCH** /error | error
*BasicErrorControllerApi* | [**errorUsingPOST**](docs/BasicErrorControllerApi.md#errorUsingPOST) | **POST** /error | error
*BasicErrorControllerApi* | [**errorUsingPUT**](docs/BasicErrorControllerApi.md#errorUsingPUT) | **PUT** /error | error
*ExamControllerApi* | [**createExamUsingDELETE**](docs/ExamControllerApi.md#createExamUsingDELETE) | **DELETE** /createExam | createExam
*ExamControllerApi* | [**createExamUsingGET**](docs/ExamControllerApi.md#createExamUsingGET) | **GET** /createExam | createExam
*ExamControllerApi* | [**createExamUsingHEAD**](docs/ExamControllerApi.md#createExamUsingHEAD) | **HEAD** /createExam | createExam
*ExamControllerApi* | [**createExamUsingOPTIONS**](docs/ExamControllerApi.md#createExamUsingOPTIONS) | **OPTIONS** /createExam | createExam
*ExamControllerApi* | [**createExamUsingPATCH**](docs/ExamControllerApi.md#createExamUsingPATCH) | **PATCH** /createExam | createExam
*ExamControllerApi* | [**createExamUsingPOST**](docs/ExamControllerApi.md#createExamUsingPOST) | **POST** /createExam | createExam
*ExamControllerApi* | [**createExamUsingPUT**](docs/ExamControllerApi.md#createExamUsingPUT) | **PUT** /createExam | createExam
*ExamControllerApi* | [**deleteExamUsingDELETE**](docs/ExamControllerApi.md#deleteExamUsingDELETE) | **DELETE** /deleteExam{examId} | deleteExam
*ExamControllerApi* | [**deleteExamUsingGET**](docs/ExamControllerApi.md#deleteExamUsingGET) | **GET** /deleteExam{examId} | deleteExam
*ExamControllerApi* | [**deleteExamUsingHEAD**](docs/ExamControllerApi.md#deleteExamUsingHEAD) | **HEAD** /deleteExam{examId} | deleteExam
*ExamControllerApi* | [**deleteExamUsingOPTIONS**](docs/ExamControllerApi.md#deleteExamUsingOPTIONS) | **OPTIONS** /deleteExam{examId} | deleteExam
*ExamControllerApi* | [**deleteExamUsingPATCH**](docs/ExamControllerApi.md#deleteExamUsingPATCH) | **PATCH** /deleteExam{examId} | deleteExam
*ExamControllerApi* | [**deleteExamUsingPOST**](docs/ExamControllerApi.md#deleteExamUsingPOST) | **POST** /deleteExam{examId} | deleteExam
*ExamControllerApi* | [**deleteExamUsingPUT**](docs/ExamControllerApi.md#deleteExamUsingPUT) | **PUT** /deleteExam{examId} | deleteExam
*ExamControllerApi* | [**readExamUsingDELETE**](docs/ExamControllerApi.md#readExamUsingDELETE) | **DELETE** /readExams | readExam
*ExamControllerApi* | [**readExamUsingGET**](docs/ExamControllerApi.md#readExamUsingGET) | **GET** /readExams | readExam
*ExamControllerApi* | [**readExamUsingHEAD**](docs/ExamControllerApi.md#readExamUsingHEAD) | **HEAD** /readExams | readExam
*ExamControllerApi* | [**readExamUsingOPTIONS**](docs/ExamControllerApi.md#readExamUsingOPTIONS) | **OPTIONS** /readExams | readExam
*ExamControllerApi* | [**readExamUsingPATCH**](docs/ExamControllerApi.md#readExamUsingPATCH) | **PATCH** /readExams | readExam
*ExamControllerApi* | [**readExamUsingPOST**](docs/ExamControllerApi.md#readExamUsingPOST) | **POST** /readExams | readExam
*ExamControllerApi* | [**readExamUsingPUT**](docs/ExamControllerApi.md#readExamUsingPUT) | **PUT** /readExams | readExam
*ExamControllerApi* | [**updateExamUsingDELETE**](docs/ExamControllerApi.md#updateExamUsingDELETE) | **DELETE** /updateExam{examId} | updateExam
*ExamControllerApi* | [**updateExamUsingGET**](docs/ExamControllerApi.md#updateExamUsingGET) | **GET** /updateExam{examId} | updateExam
*ExamControllerApi* | [**updateExamUsingHEAD**](docs/ExamControllerApi.md#updateExamUsingHEAD) | **HEAD** /updateExam{examId} | updateExam
*ExamControllerApi* | [**updateExamUsingOPTIONS**](docs/ExamControllerApi.md#updateExamUsingOPTIONS) | **OPTIONS** /updateExam{examId} | updateExam
*ExamControllerApi* | [**updateExamUsingPATCH**](docs/ExamControllerApi.md#updateExamUsingPATCH) | **PATCH** /updateExam{examId} | updateExam
*ExamControllerApi* | [**updateExamUsingPOST**](docs/ExamControllerApi.md#updateExamUsingPOST) | **POST** /updateExam{examId} | updateExam
*ExamControllerApi* | [**updateExamUsingPUT**](docs/ExamControllerApi.md#updateExamUsingPUT) | **PUT** /updateExam{examId} | updateExam


## Documentation for Models

 - [Exam](docs/Exam.md)
 - [ModelAndView](docs/ModelAndView.md)
 - [View](docs/View.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



