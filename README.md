# Repositório de Testes e Estudo Ktor

Este repositório é dedicado a testes, estudos e experimentação com o framework Ktor.

## Dependências

Este projeto utiliza as seguintes dependências principais:

- **Ktor Server Netty**: Servidor HTTP assíncrono para Ktor.
- **Ktor Serialization (Kotlinx JSON)**: Suporte para serialização e desserialização JSON usando `kotlinx.serialization`.
- **Ktor CORS**: Gerenciamento de Cross-Origin Resource Sharing (CORS).
- **Ktor Client Core**: Cliente HTTP para fazer requisições.
- **Logback Classic**: Sistema de logging flexível e de alto desempenho.
- **Kotlinx Coroutines Core**: Biblioteca para programação assíncrona e concorrência em Kotlin.

## Construção e Execução

Para construir ou executar o projeto, use uma das seguintes tarefas do Gradle:

| Tarefa                                  | Descrição                                                              |
| --------------------------------------- | ---------------------------------------------------------------------- |
| `./gradlew test`                        | Executa os testes.                                                     |
| `./gradlew build`                       | Constrói todo o projeto.                                               |
| `./gradlew buildFatJar`                 | Constrói um JAR executável do servidor com todas as dependências.      |
| `./gradlew buildImage`                  | Constrói a imagem Docker para uso com o fat JAR.                       |
| `./gradlew publishImageToLocalRegistry` | Publica a imagem Docker localmente.                                    |
| `./gradlew run`                         | Executa o servidor.                                                    |
| `./gradlew runDocker`                   | Executa usando a imagem Docker local.                                  |

Se o servidor iniciar com sucesso, você verá uma saída similar a:

```
2024-12-04 14:32:45.584 [main] INFO  Application - Application started in 0.303 seconds.
2024-12-04 14:32:45.682 [main] INFO  Application - Responding at http://0.0.0.0:8080
```

aider --model gemini/gemini-2.5-flash