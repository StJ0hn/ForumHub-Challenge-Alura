# ForumHub API

![Status](https://imgshields.io/badge/status-concluído-brightgreen)

## 📖 Sobre o Projeto

**ForumHub** é uma API REST desenvolvida como parte do Alura Challenges ONE (Oracle Next Education). O projeto simula o backend de um fórum de discussões, permitindo que usuários criem, leiam, atualizem e deletem tópicos. A API foi construída seguindo os princípios REST e inclui um sistema de autenticação de usuários para proteger os endpoints.

Este projeto serviu como um profundo exercício prático para solidificar conceitos de desenvolvimento backend com Java e o ecossistema Spring, incluindo a criação de uma API CRUD completa, gerenciamento de banco de dados com Flyway, validações, e a implementação de segurança com Spring Security e tokens JWT.

## ✨ Funcionalidades da API

A API expõe os seguintes endpoints para a gestão de tópicos:

| Método HTTP | Endpoint | Descrição |
| --- | --- | --- |
| `POST` | `/login` | Autentica um usuário e retorna um token JWT. |
| `POST` | `/topicos` | Cadastra um novo tópico no fórum. |
| `GET` | `/topicos` | Lista todos os tópicos ativos de forma paginada. |
| `GET` | `/topicos/{id}` | Detalha um tópico específico pelo seu ID. |
| `PUT` | `/topicos/{id}` | Atualiza o título e/ou a mensagem de um tópico. |
| `DELETE` | `/topicos/{id}` | Realiza a exclusão lógica de um tópico. |

## 🛠️ Tecnologias Utilizadas

As seguintes ferramentas e tecnologias foram usadas na construção do projeto:

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Flyway**
- **Maven**
- **Lombok**
- **Spring Security**
- **JWT (Java Web Token)**
- **Jackson Databind**

## 🚀 Como Executar o Projeto

**Pré-requisitos:**
- Java 17 ou superior
- Maven 3.8 ou superior
- MySQL Server

**1. Clone o Repositório:**
```bash
git clone [URL-DO-SEU-REPOSITORIO-GITHUB]
cd ForumHub
```
**2. Configure o Banco de Dados:**

- Crie um banco de dados no MySQL chamado forumhub_db.

- Abra o arquivo src/main/resources/application.properties.

Altere as seguintes propriedades com suas credenciais do MySQL:
```
spring.datasource.url=jdbc:mysql://localhost:3306/forumhub_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```
**3. Execute a Aplicação:**

Você pode executar a aplicação através da sua IDE ou via linha de comando com o Maven:
```Bash
mvn spring-boot:run
```
A API iniciará e estará pronta para receber requisições na porta 8080.
👨‍💻 Autor
John Miguel Da Silva Fernandes
