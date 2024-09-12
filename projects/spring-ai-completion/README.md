# Simple Spring AI Application with Azure OpenAI

This project contains a simple java-spring-boot app that will ask a basic question to the Azure OpenAI Service, and return the answer.

## Prerequisite

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


## Building and running

```
./mvnw spring-boot:run
```





