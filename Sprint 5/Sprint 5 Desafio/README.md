#  - Plano de Testes Sprint 3 [SeverRest] Usuários, Login, Produtos e Carrinho - ![compass.svg](/uploads/217944039619357e305958145c080112/compass.svg)

# US 001: [API] Usuários
------
"Sendo um vendedor de uma loja
Gostaria de poder me cadastrar no Marketplace do ServeRest
Para poder realizar as vendas dos meus produtos"

## RESUMO
No contexto de funcionalidades da API "SeverRest  v2.26.11", principalmente na parte de Usuários, é necessário que as seguintes regras sejam funcionais.

1. Os vendedores (usuários) deverão possuir os campos NOME, E-MAIL, PASSWORD e ADMINISTRADOR;
2. Não deverá ser possível fazer ações e chamadas para usuários inexistentes;
3. Não deve ser possível criar um usuário com e-mail já utilizado;
4. Caso não seja encontrado usuário com o ID informado no PUT, um novo usuário deverá ser criado;
5. Não deve ser possível cadastrar usuário com e-mail já utilizado utilizando PUT;
6. Os testes executados deverão conter evidências;
7. Não deverá ser possível cadastrar usuários com e-mails de provedor gmail e hotmail;
8. Os e-mails devem seguir um padrão válido de e-mail para o cadastro;
9. As senhas devem possuir no mínimo 5 caracteres e no máximo 10 caracteres;
10. A cobertura de testes deve se basear no Swagger e ir além, cobrindo cenários alternativos.

A fim de agregar valor, na aplicação uma série de testes e análises serão feitas em cima da aplicação em questão.


## Caso de testes US 001 ![test.svg](/uploads/fd41e63fe3e35b359609782a377bb8b9/test.svg)

CTUxRx_xxx (Caso de Teste User Storie X, Regra X, xxx número do teste)

### R1
- CTU1R1_001 Teste com dados válidos
- CTU1R1_002 Teste com um ou mais dados ausentes
- CTU1R1_003 Teste com um ou mais dados vazios
- CTU1R1_004 Teste com tipo de dado errado
- CTU1R1_005 Teste com máximo e mínimo de caracteres permitidos
- CTU1R1_006 Teste com dados com espaço em branco
- CTU1R1_007 Teste com dado com caractere especial/invalido
- CTU1R1_008 Teste com dados "nome" sendo apenas números
- CTU1R1_009 Teste com dado de administrador

### R2
- CTU1R2_010 Teste chamando ID válido
- CTU1R2_011 Teste chamando ID invalido
- CTU1R2_012 Teste chamando usuário por nome e não por ID
- CTU1R2_013 Teste chamando ID por query
- CTU1R2_014 Teste chamando ID invalido por query
- CTU1R2_015 Teste deletando ID Invalido
- CTU1R2_016 Teste deletando ID Invalido por query

### R3
- CTU1R3_017 Teste cadastrando email repetido por POST
- CTU1R3_018 Teste cadastrando email repetido por PUT
- CTU1R3_019 Teste cadastrando email repetido por PUT query

### R4
- CTU1R4_020 Teste cadastrando usuário via PUT com ID não encontrado
- CTU1R4_021 Teste cadastrando usuário via PUT sem ID
- CTU1R4_022 Teste cadastrando usuário via PUT com id já usado com query
- CTU1R4_023 Teste cadastrando usuário via PUT com ID no body
- CTU1R4_024 Teste atualizando informações do cadastro via PUT

### R5
- CTU1R5_025 Teste cadastrando usuario via PUT com email repetido
- CTU1R5_026 Teste cadastrando usuario via PUT com email repetido e ID query

### R7
- CTU1R7_027 Teste cadastrando usuário via POST com email sem ser gmail ou hotmail
- CTU1R7_028 Teste cadastrando usuário via POST com email tipo gmail
- CTU1R7_029 Teste cadastrando usuário via POST com email tipo hotmail
- CTU1R7_030 Teste cadastrando usuario via PUT com email tipo gmail
- CTU1R7_031 Teste cadastrando usuario via PUT com email tipo hotmail
- CTU1R7_032 Teste cadastrando usuario via PUT com email tipo gmail ou hotmail via query

### R8
- CTU1R8_033 Teste cadastrando usuário via POST e PUT com email padrão
- CTU1R8_034 Teste cadastrando usuário via POST e PUT com email com padrão email (xx.xx@XXX.XXX)
- CTU1R8_035 Teste cadastrando usuário via POST sem email
- CTU1R8_036 Teste cadastrando usuário via POST com email vazio
- CTU1R8_037 Teste cadastrando usuário via POST com email em branco
- CTU1R8_038 Teste cadastrando usuário via POST e PUT com email com caracteres especiais/inválidos
- CTU1R8_039 Teste cadastrando usuário via POST e PUT com email com excesso de caracteres aceitos
- CTU1R8_040 Teste cadastrando usuário via POST e PUT com email com o mínimo de caracteres aceitos
- CTU1R8_041 Teste alterando email já cadastrado via PUT para um email invalido.


### R9
- CTU1R9_042 Teste cadastrando senha via POST e PUT válida
- CTU1R9_043 Teste cadastrando senha via POST e PUT sem senha
- CTU1R9_044 Teste cadastrando senha via POST e PUT com senha sem valor
- CTU1R9_045 Teste cadastrando senha via POST e PUT com senha em branco
- CTU1R9_046 Teste cadastrando senha via POST e PUT com caracteres especiais/inválidos
- CTU1R9_047 Teste cadastrando senha via POST e PUT com mais de 30 caracteres
- CTU1R9_048 Teste cadastrando senha via POST e PUT com menos de 5 caracteres
- CTU1R9_049 Teste alterando senha válida via PUT para uma senha inválida


(Mais testes que não estão no plano podem ser realizados dependendo do estado da aplicação)


# US 002: [API] Login
------
"Sendo um vendedor de uma loja com cadastro já realizado
Gostaria de poder me autenticar no Marketplace da ServeRest
Para poder cadastrar, editar, atualizar e excluir meus produtos"

## RESUMO
No contexto de funcionalidades da API "SeverRest  v2.26.11", Principalmente na parte de Login, é necessário que as seguintes regras sejam funcionais.

1. Usuários não cadastrados não deverão conseguir autenticar;
2. Usuários com senha inválida não deverão conseguir autenticar;
3. No caso de não autenticação, deverá ser retornado um status code 401 (Unauthorized);
4. Usuários existentes e com a senha correta deverão ser autenticados;
5. A autenticação deverá gerar um token Bearer;
6. A duração da validade do token deverá ser de 10 minutos;
7. Os testes executados deverão conter evidências;
8. A cobertura de testes deve se basear no Swagger e ir além, cobrindo cenários alternativos.


## Caso de testes US 002 ![test.svg](/uploads/fd41e63fe3e35b359609782a377bb8b9/test.svg)

CTUxRx_xxx (Caso de Teste, User Storie X, Regra X, xxx número do teste) (mudança nos títulos dos testes)

### R1
- CTU2R1_001 Testar a autenticação com um não usuário cadastrado

### R2
- CTU2R2_001 Testar a autenticação com o campo "email" correto e o campo "password" invalido

### R3
- CTU2R3_001 Testar a autenticação com o campo "email" valido e o campo "password" válido e esperar um status 200
- CTU2R3_002 Testar a autenticação com o campo "email" valido e o campo "password" invalido e esperar um status 401
- CTU2R3_003 Testar a autenticação com o campo "email" invalido e o campo "password" valido e esperar um status 401
- CTU2R3_004 Testar a autenticação com o campo "email" invalido e o campo "password" invalido e esperar um status 401

### R4
- CTU2R4_001 Testar a autenticação com o campo "email" válido e o campo "password" válido

### R5
- CTU2R5_001 Testar a autenticação com o campo "email" válido e o campo "password" válido e esperar um token Bearer como resposta
- CTU2R5_002 Testar a autenticação com o campo "email" valido e o campo "password" invalido e esperar que não tenha um token Bearer como resposta
- CTU2R5_003 Testar a autenticação com o campo "email" invalido e o campo "password" valido e esperar que não tenha um token Bearer como resposta
- CTU2R5_004 Testar a autenticação com o campo "email" invalido e o campo "password" invalido e esperar que não tenha um token Bearer como resposta

### R6
- CTU2R6_001 Testar um token invalido
- CTU2R6_002 Testar o tempo de validade do token assim que ele for gerado
- CTU2R6_003 Testar o tempo de validade do token a cada 1 minuto assim que ele for gerado
- CTU2R6_004 Testar o tempo de validade do token depois de 10 minutos a partir do momento que ele foi gerado


# US 003: [API] Produtos
------
"Sendo um vendedor de uma loja com cadastro já realizado
Gostaria de poder me autenticar e cadastrar produtos no Marketplace do ServeRest
Para poder cadastrar, editar, atualizar e excluir meus produtos"

## RESUMO
No contexto de funcionalidades da API "SeverRest  v2.26.11", principalmente na parte de Produtos, é necessário que as seguintes regras sejam funcionais.

1. Usuários não autenticados não devem conseguir realizar ações na rota de Produtos;
2. Não deve ser possível realizar o cadastro de produtos com nomes já utilizados;
3. Não deve ser possível excluir produtos que estão dentro de carrinhos (dependência API Carrinhos);
4. Caso não exista produto com o ID informado na hora do UPDATE, um novo produto deverá ser criado;
5. Produtos criados através do PUT não poderão ter nomes previamente cadastrados;
6. Os testes executados deverão conter evidências;
7. A cobertura de testes deve se basear no Swagger e ir além, cobrindo cenários alternativos.


## Caso de testes US 003 ![test.svg](/uploads/fd41e63fe3e35b359609782a377bb8b9/test.svg)

CTUxRx_xxx (Caso de Teste, User Storie X, Regra X, xxx número do teste)

### R1

- CTU3R1_001 Testar fazer uma ação com um usuário autenticado
- CTU3R1_002 Testar o GET em um produto com um usuário não autenticado
- CTU3R1_003 Testar o GET com query em um produto com um usuário não autenticado
- CTU3R1_004 Testar o GET{id} em um produto com um usuário não autenticado
- CTU3R1_005 Testar o POST em um produto com um usuário não autenticado    
- CTU3R1_006 Testar o DELETE em um produto com um usuário não autenticado  
- CTU3R1_007 Testar o PUT em um produto com um usuário não autenticado      
### R2

- CTU3R2_001 tentar cadastrar produto sem nome repetido  
- CTU3R2_002 Tentar cadastrar um produto com nome repetido via POST  
- CTU3R2_003 Tentar cadastrar um produto com nome repetido via PUT
- CTU3R2_004 Tentar alterar um produto e colocar um nome repetido nele com PUT

### R3

- CTU3R3_001 Tentar excluir um produto fora do carrinho
- CTU3R3_002 Tentar excluir um produto dentro do carrinho (Cadastrar carrinho, adicionar o produto a ser testado e tentar excluí-lo)
- CTU3R3_003 Tentar excluir um produto fora do carrinho apos compra cancelada ou concluida


### R4

- CTU3R4_001 Tentar atualizar um produto via PUT
- CTU3R4_002 Tentar criar um produto ainda não cadastrado via PUT  
- CTU3R4_003 Tentar criar um produto ainda não cadastrado via PUT query

### R5

- CTU3R5_001 Tentar cadastrar um produto com nome repetido via PUT


# US 004: [API] Carrinho
------
"Sendo um vendedor cadastrado eu gostaria de poder me autenticar no Marketplace do ServeRest para que eu possa criar, consultar, concluir e cancelar minhas compras."

## RESUMO
No contexto de funcionalidades da API "SeverRest  v2.26.11", principalmente na parte de Carrinhos, é necessário que as seguintes regras sejam funcionais.

1. Deve ser possível buscar carrinhos tanto por via query como via path
2. Não deve ser possível realizar um PUT em um carrinho
3. Apenas usuários autenticados e logados podem criar seu carrinho
4. Não deve ser possível criar mais de um carrinho por usuário
5. O carrinho não pode possuir produto duplicado, inexistente ou com quantidade insuficiente.
6. Quando um produto é adicionado em um carrinho deve haver uma diminuição na mesma quantidade no cadastro do produto
7. Só se pode excluir o carrinho ao concluir uma compra ou ao cancelar uma compra
8. Não se pode deletar o carrinho de usuários não logados
9. Ao cancelar uma compra, a quantidade de produtos que estavam no carrinho devem voltar para o cadastro do produto e ao concluir uma compra não se deve voltar.
10. Os testes executados deverão conter evidências
11. A cobertura de testes deve se basear no Swagger e ir além, cobrindo cenários alternativos


## Caso de testes US 004 ![test.svg](/uploads/fd41e63fe3e35b359609782a377bb8b9/test.svg)

CTUxRx_xxx (Caso de Teste, User Storie X, Regra X, xxx número do teste)

### R1

- CTU4R1_001 Testar a o GET em carrinhos usando path {_id}
- CTU4R1_002 Testar a o GET em carrinhos usando path com outro valor sem ser ID
- CTU4R1_001 Testar a o GET em carrinhos usando query com _id, precoTotal, quantidadeTotal ou idUsuario
- CTU4R1_001 Testar a o GET em carrinhos sem passar nenhum valor ou caminho --- É possível dar um get sem estar autenticado, e ver o que os outros usuários estão comprando. MELHORIA  

### R2
- CTU4R2_001 Testar alterar as informações do carrinho via PUT
- CTU4R2_001 Testar alterar as informações do carrinho via PUT com path ou query id

### R3
- CTU4R3_001 Testar criar um carrinho sem estar logado
- CTU4R3_001 Testar criar um carrinho com um tokem expirado
- CTU4R3_001 Testar criar um carrinho com um usuário autenticado

### R4
- CTU4R4_001 Testar criar um carrinho em um usuário que já possui um carrinho

### R5
- CTU4R5_001 Testar criar um carrinho com produto duplicado
- CTU4R5_001 Testar criar um carrinho com produto inexistente
- CTU4R5_001 Testar criar um carrinho com produto quantidade insuficiente

### R6
- CTU4R6_001 Testar criar um carrinho com produto tendo uma quantidade válida e verificar com GET em produtos
- CTU4R6_001 Testar criar um carrinho com produto tendo uma quantidade acima da cadastrada verificar com GET em produtos
- CTU4R6_001 Testar criar um carrinho com produto tendo a mesma quantidade do cadastro verificar com GET em produtos
- CTU4R6_001 Testar criar um carrinho com produto tendo a quantidade 0 e  verificar com GET em produtos

### R7
- CTU4R7_001 Testar excluir um carrinho sem usar os caminhos "/concluir-compra" e "/cancelar-compra"
- CTU4R7_001 Testar excluir um carrinho usando query idcarrinho
- CTU4R7_001 Testar excluir um carrinho usando path idcarrinho

### R8
- CTU4R8_001 Testar excluir um carrinho pelo path "/concluir-compra" sem estar logado
- CTU4R8_001 Testar excluir um carrinho pelo path "/cancelar-compra" sem estar logado

### R9
- CTU4R9_001 Testar cancelar um carrinho com produto tendo uma quantidade válida e verificar com GET em produtos
- CTU4R9_001 Testar após concluir a compra se a quantidade de produtos no cadastro continua igual e que não tenha aumentado.
- CTU4R6_001 Testar criar um carrinho com produto tendo a quantidade 0 e  verificar com PUT em produtos


## Testes candidatos a automação ![automação.svg](/uploads/b6cedbe066a9ca4267da2df9467d08f6/automação.svg)

Esses testes são os que mais se repetem no processo de teste da aplicação, por causa disso sua automação pode ser necessária.

### US1
- CTR1_001 Teste com dados válidos (Criação de usuário válido)
---
- CTR1_002 Teste com um ou mais dados ausentes
- CTR1_003 Teste com um ou mais dados vazios
- CTR1_004 Teste com tipo de dado errado
- CTR1_005 Teste com maximo e minimo de caracteres permitidos
- CTR1_006 Teste com dados com espaço em branco
- CTR1_007 Teste com dado com caracter especial/invalido
---
- CTR2_010 Teste chamando ID válido
- CTR2_011 Teste chamando ID invalido
---
- CTR4_024 Teste atualizando informações do cadastro via PUT
---

### US2
- CTU2R1_001 Testar a autenticação com um não usuário cadastrado
---
- CTU2R2_001 Testar a autenticação com o campo "email" correto e o campo "password" invalido
---
- CTU2R3_004 Testar a autenticação com o campo "email" invalido e o campo "password" invalido e esperar um status 401
---
- CTU2R4_001 Testar a autenticação com o campo "email" válido e o campo "password" válido
---
- CTU2R5_001 Testar a autenticação com o campo "email" válido e o campo "password" válido e esperar um token Bearer como resposta
- CTU2R5_004 Testar a autenticação com o campo "email" invalido e o campo "password" invalido e esperar que não tenha um token Bearer como resposta
---
- CTU2R6_001 Testar um token invalido
- CTU2R6_003 Testar o tempo de validade do token a cada 1 minuto assim que ele for gerado
- CTU2R6_004 Testar o tempo de validade do token depois de 10 minutos a partir do momento que ele foi gerado
---

### US3
- CTU3R2_002 Tentar cadastrar um produto com nome repetido via POST
- CTU3R2_003 Tentar cadastrar um produto com nome repetido via PUT
- CTU3R2_004 Tentar alterar um produto e colocar um nome repetido nele com PUT
---
- CTU3R1_002 → CTU3R1_003 → CTU3R1_004 → CTU3R1_005 → CTU3R1_006 → CTU3R1_007 (fluxo)
---
- CTU3R4_002 Tentar criar um produto ainda não cadastrado via PUT
---
- CTU3R5_001 Tentar cadastrar um produto com nome repetido via PUT

### US4

- CTU4R1_001 Testar a o GET em carrinhos usando path {_id}
- CTU4R1_001 Testar a o GET em carrinhos usando query com _id, precoTotal, quantidadeTotal ou idUsuario
---
- CTU4R2_001 Testar alterar as informações do carrinho via PUT
- CTU4R2_001 Testar alterar as informações do carrinho via PUT com path ou query id
---
- CTU4R3_001 Testar criar um carrinho sem estar logado
- CTU4R3_001 Testar criar um carrinho com um tokem expirado
- CTU4R3_001 Testar criar um carrinho com um usuário autenticado
---
- CTU4R4_001 Testar criar um carrinho em um usuário que já possui um carrinho
---
- CTU4R5_001 Testar criar um carrinho com produto duplicado
- CTU4R5_001 Testar criar um carrinho com produto inexistente
- CTU4R5_001 Testar criar um carrinho com produto quantidade insuficiente
---
- CTU4R6_001 Testar criar um carrinho com produto tendo uma quantidade acima da cadastrada verificar com GET em produtos
---
- CTU4R7_001 Testar excluir um carrinho sem usar os caminhos "/concluir-compra" e "/cancelar-compra"
---
- CTU4R8_001 Testar excluir um carrinho pelo path "/concluir-compra" sem estar logado
- CTU4R8_001 Testar excluir um carrinho pelo path "/cancelar-compra" sem estar logado
---
- CTU4R9_001 Testar cancelar um carrinho com produto tendo uma quantidade válida e verificar com GET em produtos
- CTU4R9_001 Testar após concluir a compra se a quantidade de produtos no cadastro continua igual e que não tenha aumentado.
- CTU4R6_001 Testar criar um carrinho com produto tendo a quantidade 0 e  verificar com PUT em produtos
---

## Escopo:

Funções de comércio E-Commerce, principalmente as funções de Usuários, Login e Produtos.


## Cobertura

Usuários  (CRIAR, ATUALIZAR, LISTAR E DELETAR)
Login
Produtos (CRIAR, ATUALIZAR, LISTAR E DELETAR)


## DoR

US 001: [API] Usuários
- Banco de dados e infraestrutura para desenvolvimento disponibilizados;
- Ambiente de testes disponibilizado.

US 002: [API] Login
- Banco de dados e infraestrutura para desenvolvimento disponibilizados;
- API de cadastro de usuários implementada;
- Ambiente de testes disponibilizado.

US 003: [API] Produtos
- Banco de dados e infraestrutura para desenvolvimento disponibilizados;
- API de cadastro de usuários implementada;
- API de autenticação implementada;
- Ambiente de testes disponibilizado.

US 004: [API] Carrinho
- Banco de dados e infraestrutura para desenvolvimento disponibilizados;
- API de cadastro de usuários implementada;
- API de autenticação implementada;
- API de Cadastro, alteração e exclusão de produtos implementada;
- Ambiente de testes disponibilizado.


## DoD

US 001: [API] Usuários
- CRUD de cadastro de vendedores (usuários) implementado (CRIAR, ATUALIZAR, LISTAR E DELETAR);
- Análise de testes cobrindo todos verbos;
- Matriz de rastreabilidade atualizada;
- Automação de testes baseado na análise realizada;

US 002: [API] Login
- Autenticação com geração de token Bearer implementada;
- Análise de testes cobrindo a rota de login;
- Matriz de rastreabilidade atualizada;
- Automação de testes baseado na análise realizada;

US 003: [API] Produtos
- CRUD de cadastro de Produtos implementado (CRIAR, ATUALIZAR, LISTAR E DELETAR);
- Análise de testes cobrindo a rota de produtos;
- Matriz de rastreabilidade atualizada;
- Automação de testes baseado na análise realizada;

US 004: [API] Carrinho

- CRUD de carrinhos implementado (CRIAR, LISTAR E DELETAR(Concluir e cancelar compra));
- Análise de testes cobrindo todos verbos;
- Matriz de rastreabilidade atualizada;
- Automação de testes baseado na análise realizada;


### Pessoas que testaram ![peaple.svg](/uploads/b26e028cf288aa9832b11739bec243ef/peaple.svg)

| Equipe QualiTech |
| --- |
| Higor Milani |


### Ferramentas ![ferramenta.svg](/uploads/589fc388735633e4e612964c7734af88/ferramenta.svg)

* Postman Version 10.15.4
* GitLab
* Xmind
* Swagger
> * Eclipse IDE 2023-03 (4.27.0)
>> * junit.jupiter 5.9.3
>> * junit 4.13.2
>> * rest-assured 5.3.1
>> * javafaker 1.0.2
* Java JDK 20.0.1 2023-04-18
* Apache Maven 3.9.2
* Node.Js 18.16.0
* Project Lombok 1.18.28


### Versão da aplicação

* ServeRest v2.26.11
* ServeRest v2.26.13 (Atualizada depois de 16/07/2023)


![fututre.svg](/uploads/855ce7c4249236fae104ced55d70cd8a/fututre.svg)