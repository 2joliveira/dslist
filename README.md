# 📋 DS List API

API REST desenvolvida em Java com Spring Boot, projetada para listagem de itens. A API permite listar todos os itens, listar um item específico, listar as listas de itens, listar os itens de uma lista específica

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Maven
- PostgreSQL
- H2 Database
- Docker
- Docker Compose

## ⚙️ Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)
- [Git](https://git-scm.com/)

## 🧭 Rodando o projeto

Clone o repositório

```bash
git clone https://github.com/2joliveira/dslist.git
```

Configure a variável spring.profiles.active no arquivo application.properties para selecionar o ambiente:

- TEST
  ```bash
    # No ambiente de test basta você rodar a aplicação normalmente que a API estará disponível em http://localhost:8080, podendo verificar o banco de dados H2 no http://localhost:8080/h2-console
  ```

- DEV
  ```bash
    # Execute o docker compose para criar os contêineres para rodar o banco de dados PostgreSQL acessado pela porta 5433 e a interface web de gerenciamento de bancos PostgreSQL.

    docker-compose up
  ```

- PROD
  ```bash
    # Faça deploy da aplicação em alguma plataforma de hospedagem de serviços, configurando as variáveis de ambiente.
  ```

## 📮 Endpoints

| Método   | Endpoint                       | Descrição                                         | Parâmetros / Body             |
| ---------|--------------------------------|---------------------------------------------------|------------------------------ |
| `GET`    | `/games`                       | [Listar todos os jogos][games]                    | —                             |
| `GET`    | `/games/{game_id}`             | [Busca jogo por ID][game]                         | `game_id` (path param)        |
| `GET`    | `/lists`                       | [Busca listas de jogos][lists]                    | —                             |
| `GET`    | `/lists/{list_id}/games`       | [Busca jogos de uma lista específica][games-list] | `list_id` (path param)        |
| `POST`   | `/lists/{list_id}/replacement` | Altera a posição do jogo na lista                 | `list_id` (path) + JSON       |


## 🌐 Deploy
A aplicação está hospedada na Render e pode ser acessada por:

URL da API: https://dslist-1q5q.onrender.com


[games]: https://dslist-1q5q.onrender.com/games
[game]: https://dslist-1q5q.onrender.com/game/2
[lists]: https://dslist-1q5q.onrender.com/lists
[games-list]: https://dslist-1q5q.onrender.com/lists/1/games