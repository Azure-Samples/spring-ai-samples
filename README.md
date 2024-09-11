# Spring AI Samples

These projects will give you a basic start in AI projects with Azure-Open-AI and Spring-AI.  

The following projects:
- Completions


## Features

This project framework provides the following features:

* Jump-Start With Java & Spring-Boot
* Integrated With Azure-Open-AI
* Integrated with Spring-AI


## Getting Started

### Prerequisites


Before using the AI commands, obtain your Azure OpenAI `endpoint` and `api-key` from the Azure OpenAI Service section on [Azure Portal](https://portal.azure.com)
Exporting the environment variables is one way to set these configuration properties.

```bash
export SPRING_AI_AZURE_OPENAI_API_KEY="REPLACE_WITH_YOUR_KEY_VALUE_HERE"
export SPRING_AI_AZURE_OPENAI_ENDPOINT="REPLACE_WITH_YOUR_ENDPOINT_HERE"
export SPRING_AI_AZURE_OPENAI_MODEL="REPLACE_WITH_YOUR_MODEL_NAME_HERE"
```

Next, you need to create an Azure AI Deployment and specify the deployent name as a configuration property.

### Create an Azure AI Deployment

Follow these steps to create an Azure AI Deployment via the [Azure AI Portal](https://oai.azure.com/portal) so that you can use the default values in the Spring Boot Autoconfiguration

**NOTE:** In Azure, it's mandatory for each client to identify a `Deployment Name` for connecting to the Azure OpenAI service. Note that the `Deployment Name` is distinct from the actual model you intend to deploy. For example, a deployment called 'MyAiDeployment' might be set up to utilize the GPT 3.5 Turbo or the GPT 4.0 model.

For now, to create an easy setup, create a deployment in the [Azure AI Portal](https://oai.azure.com/portal) with these parameters:

- Deployment Name: `gpt-35-turbo`
- Model Name: `gpt-35-turbo`

This configuration is compatible with the default settings of the Spring Boot Azure AI Starter and its auto-configuration capabilities.

### Installation

The following need to be installed:

- [Java IDE vsCode](https://code.visualstudio.com/download)
- [SDKMan](https://sdkman.io/install/) Strongly Recommended to mange following:
  - Java 21 or Greater
  - Maven 3.9.3 or Greater

Once SDKMan is installed, you can install Java and Maven with the following:
```
sdk install maven 3.9.3
```
```
sdk install java 21.0.4-librca
```

### Quickstart

1. ``` git clone https://github.com/Azure-Samples/spring-ai-samples.git ```
2. ``` cd ./spring-ai-samples ```
3. ``` cd ./projects ```
4. Decide which project you want to use.



## Demo

To build & run most demos, follow these steps:


1. ``` cd (target-project)    ```
2. ``` ./mvnw clean install   ```
3. ``` ./mvnw spring-boot:run ```

## Resources

- [Azure Quick Start](https://learn.microsoft.com/en-us/azure/ai-services/openai/quickstart?tabs=command-line%2Cpython-new&pivots=programming-language-spring)

