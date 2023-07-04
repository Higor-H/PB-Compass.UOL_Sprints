![Sprint 4, dia 1 e 2](img/readMeImg/S4d2Banner.svg)

# Sprint 4 ![Logo](img/readMeImg/smalllogouol.svg)
## Dia 1 e 2 Ágil, Masterclass | Planning Sprint 4 | DoR, DoD & Acceptance Criteria ![Logo2](img/readMeImg/sd.svg)
Esse é um arquivo com meus estudos sobre o primeiro e segundo dia da Sprint 4 na minha bolsa na [Compass.UOL](https://compass.uol/en/about-us/)


# Assuntos abordados 📚

## Informações gerais sobre a Sprint

## User Stories
Uma User Story é uma descrição de uma funcionalidade que agregue para o objetivo da aplicação a ser desenvolvida, é o que o cliente quer que a aplicação faça, uma aplicação pode ter diversas User stories e cada uma é diferente e independente, uma User Story deve caber em uma Sprint, ou seja seu ela deve ser estimável, ela deve ser sujeita a mudanças e deve ser testada para garantir que ela foi feita de forma correta, segura e funcional.

As User Stories são:

- Independentes
- Negociáveis
- Valiosas
- Estimáveis
- Pequenas
- Testáveis

![Como-Eu_Quero-Para](img/comoEuQueroPara.png)


## DoR (Defintion of Ready)
É o consenso entre o time de desenvolvimento e o PO, é importante que ambos os lados tenham os mesma definição de "Ready", essa definição é sobre o nível de detalhamento e de informações de cada item do backlog, assim aumentando a transparência e diminuindo o risco de mal entendidos que podem gerar retrabalhos futuros.


## DoD (Definition of Done)
É o consenso entre o time de desenvolvimento, essa definição vale para as atividades e funcionalidades que serão incrementadas. Esse entendimento pode ser uma série de verificações que dizem se algo está pronto ou não, esse consenso é essencial pois diz ao desenvolvedor e para as demais pessoas quando algo está pronto.


## Acceptance Criteria
É uma lista de critérios vinculada a uma User Story, ou seja esses critérios serão diferentes para cada nova User Story, essa lista traz informações importantes sobre a US, com ela todos têm um entendimento melhor sobre o produto, eles são regras simples e independentes que dizem o que se deve ter e o que não se deve ter. Os testadores podem planejar seus testes com ela, os desenvolvedores podem adicionar funcionalidades com ela e o PO pode achar caminhos para agregar valor ao produto e ao cliente.


## Atividade

US 001 [API [Earth](https://api.nasa.gov/)] Pesquisa

Como um usuário da API eu gostaria de poder obter uma lista com as fotos e seus dados para eu poder ter acesso a quais dias possuem fotos na localização pesquisada.

DoR
- Banco de dados e infraestrutura para desenvolvimento disponibilizados
- Banco de dados com os dados e fotos disponibilizados
- API já desenvolvida
- Ambiente de testes disponibilizado


DoD

- Nova rota GET criada
- Nova rota devidamente testada
- Os dados das responses são precisos
- Testes automatizados desenvolvidos


Acceptance Criteria

- Ao não informar o query "date" deve-se obter a lista com as datas que possuem fotos tiradas naquela localização
- Os links das fotos deve aparecer junto de suas datas
- As responses tem que estar em Json
- Caso não haja nenhuma foto na coordenada informada a mensagem "Não há fotos para a localização informada" deve ser retornada
- As fotos devem ser do local informado no query "lon" e "lat"
- O query "api_key" deve ser válido
- Não deve ser possível obter a lista de dados sem informar uma key ou ao informar uma key inválida


![Rodapé](img/readMeImg/rodape.png)