# 🐰 Projeto RabbitMQ na Prática

Este repositório contém uma implementação prática de sistemas de mensageria utilizando o RabbitMQ, conforme abordado no curso [RabbitMQ na Prática](https://www.udemy.com/course/rabbitmq-na-pratica/) da Udemy.

## 🚀 Objetivo

Demonstrar como integrar o RabbitMQ em aplicações Java com Spring Boot, criando uma arquitetura desacoplada e escalável para comunicação entre microsserviços.

## 🛠 Tecnologias Utilizadas

- **RabbitMQ**: Broker de mensagens para comunicação assíncrona.
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Docker**: Contêinerização do RabbitMQ.
- **Maven**: Gerenciamento de dependências e build.
- **Lombok**: Redução de boilerplate code.

## 📁 Estrutura do Projeto

```
.
├── commons/                # Biblioteca de DTOs compartilhados
├── producer/               # Serviço produtor de mensagens
└── consumer/               # Serviço consumidor de mensagens
```

## 🧪 Funcionalidades

- **Producer**: Envia mensagens para o RabbitMQ.
- **Consumer**: Consome mensagens do RabbitMQ e processa os dados.

## 🔧 Como Executar

### 1. Iniciar o RabbitMQ com Docker

```bash
docker run -d -p 5672:5672 -p 15672:15672 --name rabbitmq rabbitmq:management
```

Acesse o painel de administração em [http://localhost:15672](http://localhost:15672) com o usuário `guest` e senha `guest`.

### 2. Construir e Executar os Serviços

#### Producer

```bash
cd producer
mvn clean install
java -jar target/producer-1.0-SNAPSHOT.jar
```

#### Consumer

```bash
cd consumer
mvn clean install
java -jar target/consumer-1.0-SNAPSHOT.jar
```

## 📚 Conteúdo do Curso

O curso aborda os seguintes tópicos:

- Instalação e configuração do RabbitMQ.
- Conceitos de filas, exchanges e bindings.
- Padrões de mensageria: Work Queues, Publish/Subscribe, RPC.
- Dead Letter Exchanges (DLX) e Dead Letter Queues (DLQ).
- Clusterização e alta disponibilidade.
- Monitoramento e administração do RabbitMQ.

## 📌 Observações

- Certifique-se de que o RabbitMQ esteja em execução antes de iniciar os serviços.
- As configurações de filas e exchanges podem ser ajustadas conforme necessário.

## 📄 Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

