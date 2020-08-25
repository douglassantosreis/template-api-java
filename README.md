# Template de API

Template de readme para apis.

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
