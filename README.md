# Instruções para Acessar o SQL no pgAdmin
## 1. Abrir o pgAdmin
  - Inicie o pgAdmin no seu computador onde o PostgreSQL está instalado.
    
## 2. Conectar ao Servidor:
  - No painel à esquerda, localize o servidor do PostgreSQL e clique duas vezes para se conectar.
    
## 3. Criar um Banco de Dados:
  - Com o servidor conectado, clique com o botão direito em "Databases" (Bancos de Dados) e selecione "Create" (Criar) > "Database" (Banco de Dados).
  - Nomeie o banco de dados como 'gerenciamento' e clique em "Save" (Salvar).
    
## 5. Abrir o Editor de Consultas:
  - Clique com o botão direito no banco de dados 'gerenciamento' e selecione "Query Tool" (Ferramenta de Consulta) para abrir o editor.
    
## 6. Importar o DUMP:
  - Cole o conteúdo do seu DUMP SQL no editor.
  - Clique no ícone de execução (play) ou pressione F5 para executar o script.

---------
# Instruções para Compilação e Execução da Aplicação

## Pré-requisitos
- Java JDK instalado (versão 8 ou superior)
- Banco de dados configurado (PostgreSQL)
- Biblioteca JDBC correspondente ao seu banco de dados
- IDE recomendada: NetBeans

## Estrutura do Projeto
- src
  - main
    - java
      - [pacote da aplicação]
        - Principal.java
        - [outras classes, modelos, controladores, etc.]

## Passos para Compilação
1. Abra sua IDE e carregue o projeto.
2. Verifique se todas as dependências estão configuradas corretamente.
3. Compile o projeto.

## Passos para Execução
1. Após a compilação localize a classe `Principal` que contém o método `main`.
2. Clique com o botão direito na classe `Principal` e escolha "Executar" ou "Run".
3. Siga as instruções apresentadas no console para interagir com a aplicação.

## Configuração do Banco de Dados
1. Certifique-se de que o banco de dados está em funcionamento e que as tabelas estão criadas conforme especificado.
2. Configure a conexão com o banco de dados no código, verificando se as credenciais e a URL estão corretas.

## Exemplos de Uso
1. Cadastrar uma editora.
2. Listar todas as editoras cadastrados.
3. Atualizar as informações de uma editora existente.
4. Remover uma editora da base de dados.
