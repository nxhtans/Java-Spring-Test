# Primeira Aplicação Spring Boot

Este é um projeto básico de demonstração usando Spring Boot que implementa uma API REST simples.

## Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── nxhtans/
│   │           └── first_app_spring/
│   │               ├── configurations/     # Configurações do Spring
│   │               ├── controllers/        # Controladores REST
│   │               ├── domains/           # Classes de domínio/modelo
│   │               ├── services/          # Camada de serviços
│   │               └── FirstAppSpringApplication.java
│   └── resources/
│       └── application.properties         # Configurações da aplicação
```

## Componentes Principais

### Controllers
- `HelloWorldController`: Controlador REST que fornece endpoints para:
  - GET `/hello-world`: Retorna uma saudação personalizada
  - POST `/hello-world/{id}`: Aceita parâmetros via path, query e body

### Domains
- `User`: Modelo que representa um usuário com:
  - name: Nome do usuário
  - email: Email do usuário

### Services
- `HelloWorldService`: Serviço que implementa a lógica de negócio para as saudações

### Configurations
- `HelloConfiguration`: Configuração básica do Spring com beans personalizados

## Configurações

- Nome da aplicação: first_app_spring
- Porta do servidor: 3000

## Requisitos

- Java 21
- Maven 3.9+
- Spring Boot 3.4.4

## Como Executar

1. Clone o repositório
2. Execute o comando: `./mvnw spring-boot:run`
3. Acesse: `http://localhost:3000/hello-world`

## Endpoints Disponíveis

### GET /hello-world
- Retorna uma saudação personalizada

### POST /hello-world/{id}
- Parâmetros:
  - Path: `id` (identificador)
  - Query: `filter` (opcional, padrão: "nenhum")
  - Body: Objeto User (name, email)
