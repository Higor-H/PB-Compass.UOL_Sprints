![Sprint 4, dia 5, 6 e 7](img/readMeImg/S4d567Banner.svg)

# Sprint 4 ![Logo](img/readMeImg/smalllogouol.svg)
## Dia 5, 6 e 7 Masterclass | POJOs, Serialização e Desserialização | Boas práticas para escrita de testes | Request Specification & Faker ![Logo2](img/readMeImg/sd.svg)
Esse é um arquivo com meus estudos sobre o quinto, sexto e sétimo dia da Sprint 4 na minha bolsa na [Compass.UOL](https://compass.uol/en/about-us/)


# Assuntos abordados 📚

O uso de ferramentas e framework para auxiliar o trabalho de um QA é muito importante. O uso de ferramentas como o Project Lombok, Java Faker, Jackson, entre outros. O uso desses complementos podem otimizar o trabalho e deixá-lo mais simples para realizar modificações, além de permitirem uma melhor leitura por outras pessoas. Serializar e deserilizar são excelentes caminhos para seus testes.

```Java
@Data
public class user {
    private String nome;
    private String email;
    private String password;
    @JsonFormat(shape = Shape.STRING)
    private boolean administrador;
    @JsonProperty(value = "_id", access = Access.WRITE_ONLY)
    private String id; // É apenas lido na desserialização
}
```


## Boas Praticas

Os testes devem ser independentes, ou seja, eles devem ser capazes de rodar sozinhos, e em paralelo, assim se ganha mais tempo e diminui possíveis erros, além de facilitar a manutenção e permitir mais flexibilidade.
Os nomes dos testes devem ser autoexplicativos, faz sentido um teste que cria  um usuario se chamar "deveCriarUsuario" e não "teste2000"
Como o objetivo dos testes é testar e validar, é sempre bom ter vários asserts, além deles trazerem mais confiança ao resultado final, eles também são maneiras de aproveitar ao máximo os seus testes.

Os testes de unidade devem ser curtos e rápidos, pois são testes que irão ser executados a todo momento de forma repetida, pensando nisso é importante que eles não tenham dependência de fatores externos. Para que seus testes sejam confiáveis é importante testar os próprios testes, pois assim teremos a certeza de que o resultado obtido será dado em função da aplicação e não dos nossos próprios testes. Uma outra dica é DRY (Don't repeat yourself)


![Rodapé](img/readMeImg/rodape.png)