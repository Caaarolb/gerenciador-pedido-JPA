# Gerenciador de Pedidos 🛒

Um projeto simples para gerenciar pedidos e produtos, desenvolvido com **Java**, **Spring Boot** e **PostgreSQL**.

---

## Tecnologias Utilizadas 🚀
- **Java 21**
- **Spring Boot 3.4.1**
- **Spring Data JPA**
- **PostgreSQL**

---

## Funcionalidades ✨
- Cadastro de produtos com nome e preço.
- Criação de pedidos associando produtos.
- Consultas personalizadas com JPQL.

---

## Configuração do Banco de Dados 🗄️
1. Crie um banco de dados PostgreSQL chamado **gerenciador-pedidos**.
2. Atualize o arquivo **`application.properties`** com suas configurações:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/gerenciador-pedidos
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=create
```

---

## Executando o Projeto ▶️
1. Clone o repositório:
   ```bash
   git clone <url-do-repositorio>
   ```
2. Navegue até a pasta do projeto:
   ```bash
   cd gerenciador-pedidos
   ```
3. Execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

---

## Exemplos de Consulta JPQL 🔍
1. Buscar produtos com preço maior que um valor:
```java
List<Produto> produtos = produtoRepository.findByPrecoMaiorQue(BigDecimal.valueOf(50.00));
```

---

## Contribuição 🤝
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

---

## Licença 📜
Este projeto é licenciado sob a licença MIT.

