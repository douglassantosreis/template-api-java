# Template de API

Template de readme para apis.

## Deploy Automatizado

| Ambiente                          | Branch                    | URL                                                                                                    |
| --------------------------------- | ------------------------- | ------------------------------------------------------------------------------------------------------ |
| Desenvolvimento                   | `ci/aws-dev`              | https://jenkins.devops.gpa.digital/job/retail-experience/store-api-dev/job/build/job/${project-name}/  |
| Homologação                       | `ci/aws-hlg`              | https://jenkins.devops.gpa.digital/job/retail-experience/store-api-hlg/job/build/job/${project-name}/  |
| Produção                          | `ci/aws-prod`             | https://jenkins.devops.gpa.digital/job/retail-experience/store-api-prod/job/build/job/${project-name}/ |

## DNS da API

| Ambiente                          | Branch                    | URL                                        |
| --------------------------------- | ------------------------- | ------------------------------------------ |
| Desenvolvimento                   | `ci/aws-dev`              | https://${dev-gateway-host}/${name}        |
| Homologação                       | `ci/aws-hlg`              | https://${hlg-gateway-host}/${name}        |
| Produção                          | `ci/aws-prod`             | https://${gateway-host}/${name}            |

# Rodando o Projeto

## Intellij

1. Selecione o settings.gradle com o botão direito do mouse e selecione "Importar projeto gradle" (Passo opcional caso o intellij não reconheça o projeto como um projeto gradle)
1. Rode a task de build
1. Rode a task de bootRun

## CMD para Sistemas Unix (linux e mac)
1. De permissão de execução ao gradle:
    ```shell script
    chmod +x ./gradlew
   ```
1. Execute o comando de build
    ```shell script
    ./gradlew clean build
    ```

1. Execute o comando de run
    ```shell script
    ./gradlew bootRun
    ```
   
### CMD para Windows
1. Siga os passos para Sistemas linux *pulando o comande de permissão* e trocando *gradlew* por *gradlew.bat*

# Testes

## Unitários
Testes unitários são rodados no momento do build


# Documentação do Projeto
Para mais detalhes sobre a arquitetura do projeto acesse a wiki do projeto https://git.devops.gpa.digital/development/api/retail-experience/store/docs
