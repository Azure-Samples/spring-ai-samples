# spring-ai-samples

(short, 1-3 sentenced, description of the project)

Welcome to the spring-ai-samples project!  
Below are projects that are the result of the step-by-step instructions found at the: [QuickStarts page](https://learn.microsoft.com/en-us/azure/ai-services/openai/quickstart?tabs=command-line%2Cpython-new&pivots=programming-language-spring)
All of these examples use Azure OpenAI, and can be used with other LLM's (ie ollama).

## Features
This project framework provides the following features:

* Feature 1
* Feature 2
* ...

## Getting Started

### Prerequisites

- Azure Subscription.
- Java (17 and greater).
- Maven
- SDK (vsCode, IntelliJ, Eclipse, etc).
- [SDK Man](https://sdkman.io/install) (Optional, Strongly Recommended!)
- [HTTPie](https://httpie.io/docs/cli/installation) (Optional, Strongly Recommended!)
  
 
Before using the AI commands, obtain your Azure OpenAI `endpoint` and `api-key` from the Azure OpenAI Service section on [Azure Portal](https://portal.azure.com).
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

### Installation
We strongly recommend using sdkman & httpie for building and exercising the apps.  Below are instructions for each.   SDKMan is used to manage multiple versions of common tools.  Below we use SDKMan to manage:
* Java
* Maven
* Gradle

- [Install sdkman](https://sdkman.io/) 
```bash
curl -s "https://get.sdkman.io" | bash
```
```bash
sdk install java 21.0.4-librca; sdk use java 21.0.4-librca
```
```bash
sdk install sdk install maven 3.9.6; sdk use maven 3.9.6
```

- [Install HTTPie](https://httpie.io/docs/cli/installation)


### Quickstart

1. git clone [spring-ai-samples](https://github.com/Azure-Samples/spring-ai-samples.git)
```bash 
git clone https://github.com/Azure-Samples/spring-ai-samples.git
```
2. Change into ./projects directory: 
```bash
cd ./projects
```
3. Decide which sub-project to start.  Change into that directory:

```bash
cd [target project]
```

4. Build that project:

```bash
./mvnw spring-boot:run
```

5. Exercise that project, see project-specific URI(s):
```bash
http localhost:8080/<target endpoint>
```
Dig deeper into each project on the project's page.
Enjoy!

## Resources

- [Spring AI Reference](https://docs.spring.io/spring-ai/reference/index.html)
- [Spring Release Calendar](https://calendar.spring.io/)
- [Spring-AI-Core Releases Folder (Maven Central) ](https://mvnrepository.com/artifact/org.springframework.ai/spring-ai-core)
- [Spring Milestone Releases Repo](https://repo.spring.io/milestone/)- 
