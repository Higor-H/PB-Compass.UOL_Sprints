#  - Plano de Testes Sprint 2 [SeverRest] Usuários - ![compass.svg](/uploads/217944039619357e305958145c080112/compass.svg)

## RESUMO
No contexto de funcionalidades da API "SeverRest  v2.26.11", Principalmente na parte de Usuários, é necessário que as seguintes regras sejam funcionais.

1. Os vendedores (usuários) deverão possuir os campos NOME, E-MAIL, PASSWORD e ADMINISTRADOR;
2. Não deverá ser possível fazer ações e chamadas para usuários inexistentes;
3. Não deve ser possível criar um usuário com e-mail já utilizado;
4. Caso não seja encontrado usuário com o ID informado no PUT, um novo usuário deverá ser criado;
5. Não deve ser possível cadastrar usuário com e-mail já utilizado utilizando PUT;
6. Os testes executados deverão conter evidências;
7. Não deverá ser possível cadastrar usuários com e-mails de provedor gmail e hotmail;
8. Os e-mails devem seguir um padrão válido de e-mail para o cadastro;
9. As senhas devem possuír no mínimo 5 caracteres e no máximo 10 caracteres;
10. A cobertura de testes deve se basear no Swagger e ir além, cobrindo cenários alternativos.


A fim de agregar valor, na aplicação uma série de testes e análises serão feitas em cima da aplicação em questão.


## Caso de testes ![test.svg](/uploads/fd41e63fe3e35b359609782a377bb8b9/test.svg)

CTRx_xxx (Caso de Teste Regra X, xxx numero do teste)

### R1
- CTR1_001 Teste com dados válidos
- CTR1_002 Teste com um ou mais dados ausentes
- CTR1_003 Teste com um ou mais dados vazios
- CTR1_004 Teste com tipo de dado errado
- CTR1_005 Teste com maximo e minimo de caracteres permitidos
- CTR1_006 Teste com dados com espaço em branco
- CTR1_007 Teste com dado com caracter especial/invalido
- CTR1_008 Teste com dados "nome" sendo apenas números
- CTR1_009 Teste com dado de administrador


### R2
- CTR2_010 Teste chamando ID válido
- CTR2_011 Teste chamando ID invalido
- CTR2_012 Teste chamando usuário por nome e não por ID
- CTR2_013 Teste chamando ID por query
- CTR2_014 Teste chamando ID invalido por query
- CTR2_015 Teste deletando ID Invalido
- CTR2_016 Teste deletando ID Invalido por query


### R3
- CTR3_017 Teste cadastrando email repetido por POST
- CTR3_018 Teste cadastrando email repetido por PUT
- CTR3_019 Teste cadastrando email repetido por PUT query


### R4
- CTR4_020 Teste cadastrando usuário via PUT com ID não encontrado
- CTR4_021 Teste cadastrando usuário via PUT sem ID
- CTR4_022 Teste cadastrando usuário via PUT com id já usado com query
- CTR4_023 Teste cadastrando usuário via PUT com ID no body
- CTR4_024 Teste atualizando informações do cadastro via PUT

### R5
- CTR5_025 Teste cadastrando usuario via PUT com email repetido
- CTR5_026 Teste cadastrando usuario via PUT com email repetido e ID query


### R7
- CTR7_027 Teste cadastrando usuário via POST com email sem ser gmail ou hotmail
- CTR7_028 Teste cadastrando usuário via POST com email tipo gmail
- CTR7_029 Teste cadastrando usuário via POST com email tipo hotmail
- CTR7_030 Teste cadastrando usuario via PUT com email tipo gmail
- CTR7_031 Teste cadastrando usuario via PUT com email tipo hotmail
- CTR7_032 Teste cadastrando usuario via PUT com email tipo gmail ou hotmail via query

### R8
- CTR8_033 Teste cadastrando usuário via POST e PUT com email padrão
- CTR8_034 Teste cadastrando usuário via POST e PUT com email com padrão email (xx.xx@XXX.XXX)
- CTR8_035 Teste cadastrando usuário via POST sem email
- CTR8_036 Teste cadastrando usuário via POST com email vazio
- CTR8_037 Teste cadastrando usuário via POST com email em branco
- CTR8_038 Teste cadastrando usuário via POST e PUT com email com caracteres especiais/inválidos
- CTR8_039 Teste cadastrando usuário via POST e PUT com email com excesso de caracteres aceitos
- CTR8_040 Teste cadastrando usuário via POST e PUT com email com o mínimo de caracteres aceitos
- CTR8_041 Teste cadastrando usuário via POST e PUT com email com excesso de caracteres aceitos
- CTR8_042 Teste alterando email já cadastrado via PUT para um email invalido.

### R9
- CTR9_043 Teste cadastrando senha via POST e PUT válida
- CTR9_044 Teste cadastrando senha via POST e PUT sem senha
- CTR9_045 Teste cadastrando senha via POST e PUT com senha sem valor
- CTR9_046 Teste cadastrando senha via POST e PUT com senha em branco
- CTR9_047 Teste cadastrando senha via POST e PUT com caracteres especiais/inválidos
- CTR9_048 Teste cadastrando senha via POST e PUT com mais de 30 caracteres
- CTR9_049 Teste cadastrando senha via POST e PUT com menos de 5 caracteres
- CTR9_050 Teste alterando senha válida via PUT para uma senha inválida

(Mais testes que não estão no plano podem ser realizados dependendo do estado da aplicação)


## Testes candidatos a automação ![automação.svg](/uploads/b6cedbe066a9ca4267da2df9467d08f6/automação.svg)

Esses testes são os que mais se repetem no processo de teste da aplicação, por causa disso sua automação pode ser necessária.

---
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


## Escopo:

Funções de comércio E-Commerce, principalmente as funções de usuários.


## Cobertura 

Usuários  (CRIAR, ATUALIZAR, LISTAR E DELETAR).


## DoR

- Banco de dados e infraestrutura para desenvolvimento disponibilizados;
- Ambiente de testes disponibilizado.


## DoD

- CRUD de cadastro de vendedores (usuários) implementado (CRIAR, ATUALIZAR, LISTAR E DELETAR);
- Análise de testes cobrindo todos verbos;
- Matriz de rastreabilidade atualizada;
- Automação de testes baseado na análise realizada;


### Pessoas que testaram ![peaple.svg](/uploads/b26e028cf288aa9832b11739bec243ef/peaple.svg)

| Equipe QualiTech |
| --- |
| Higor Milani |


### Ferramentas ![ferramenta.svg](/uploads/589fc388735633e4e612964c7734af88/ferramenta.svg)

* Postman
* GitLab
* Xmind
* Swagger


### Versão da aplicação

* ServeRest v2.26.11


![fututre.svg](/uploads/855ce7c4249236fae104ced55d70cd8a/fututre.svg)