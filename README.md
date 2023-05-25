# Projeto da Pousada Alegria e Fantasia

Este projeto é uma simulação de uma pousada chamada Pousada Alegria e Fantasia. Este faz parte de uma avaliação de Padrões de Projetos para o curso Tecnólogo em Análise e Desenvolvimento de Sistemas no Campus Gaspar do IFSC.

## Como utilizar

Link de video-explicação: https://clipchamp.com/watch/Je70tSJJkUJ

## Integrantes

O projeto foi desenvolvido por três integrantes:

1. **Juvens St Louis**
   - E-mail: juvensstlouis77@gmail.com
   - Matrícula: 202313003785

2. **Vitiello Jules**
   - E-mail: vitiello.jules@gmail.com
   - Matrícula: 201920802355

3. **Nicolas Escobar**
   - E-mail: nicoeanzola@gmail.com
   - Matrícula: 202313003452

---

Ele contém as seguintes classes:

## Classe Pousada

A classe `Pousada` representa a pousada em si. Ela possui os seguintes atributos:

- `reservas`: uma lista de objetos `ReservaQuarto` representando as reservas feitas na pousada.
- `quartos`: uma lista de objetos `Quarto` representando os quartos disponíveis na pousada.
- `numeroReserva`: um contador para o número das reservas.

A classe `Pousada` possui um padrão Singleton, o que significa que só pode haver uma instância da classe. Ela contém métodos para criar uma reserva, procurar uma reserva pelo CPF do hóspede, cancelar uma reserva, limpar as reservas expiradas, listar as reservas e verificar o status dos quartos.

## Classe Hospede

A classe `Hospede` representa um hóspede da pousada. Ela possui os seguintes atributos:

- `nome`: o nome do hóspede.
- `cpf`: o CPF do hóspede.
- `email`: o endereço de e-mail do hóspede.
- `telefone`: o número de telefone do hóspede.
- `acompanhante`: um objeto do tipo `Hospede` representando um possível acompanhante.

A classe `Hospede` também possui um construtor que recebe um objeto `HospedeBuilder` para facilitar a criação de objetos `Hospede` com diferentes configurações.

## Classe HospedeBuilder

A classe `HospedeBuilder` é um padrão Builder para a classe `Hospede`. Ela possui os seguintes atributos:

- `nome`: o nome do hóspede.
- `cpf`: o CPF do hóspede.
- `email`: o endereço de e-mail do hóspede.
- `telefone`: o número de telefone do hóspede.
- `acompanhante`: um objeto do tipo `Hospede` representando um possível acompanhante.

A classe `HospedeBuilder` possui métodos `addNome`, `addCpf`, `addEmail`, `addTelefone` e `addAcompanhante` para configurar os atributos do objeto `HospedeBuilder`, bem como o método `build` para criar o objeto `Hospede` com as configurações desejadas.

## Classe Quarto

A classe `Quarto` representa um quarto da pousada. Ela implementa a interface `Prototype` para permitir a clonagem do objeto. A classe possui os seguintes atributos:

- `numero`: o número do quarto.
- `precoDiaria`: o preço da diária do quarto.
- `ocupado`: um booleano indicando se o quarto está ocupado.
- `numeroCamas`: o número de camas no quarto.

A classe `Quarto` possui métodos getters e setters para acessar e modificar os valores dos atributos, além do método `clone` para criar uma cópia do objeto `Quarto`.

## Classe ReservaQuarto

A classe `ReservaQuarto` representa uma reserva de quarto na pousada. Ela possui os seguintes atributos:

- `numeroReserva`: o número da reserva.
- `dataCheckin`: a data de check-in da reserva.
- `dataCheckout`: a data de check-out da reserva.
- `quarto`: o objeto `Quarto` associado à reserva.
- `hospede`: o objeto `Hospede` associado à reserva.

A classe `ReservaQuarto` possui métodos getters e setters para acessar e modificar os valores dos atributos, além do método `toString` para retornar uma representação em formato de string da reserva.

## Classe ReservaQuartoBuilder

A classe `ReservaQuartoBuilder` é um padrão Builder para a classe `ReservaQuarto`. Ela possui um objeto `ReservaQuarto` que está sendo construído e fornece métodos para configurar os atributos desse objeto, como `addNumeroReserva`, `addDataCheckin`, `addDataCheckout`, `addQuarto` e `addHospede`. O método `build` é usado para construir o objeto `ReservaQuarto` com as configurações desejadas e lançar exceções se alguma configuração estiver faltando ou inválida.

## Interface Prototype

A interface `Prototype` define um método `clone` que permite a clonagem de objetos que a implementam. A classe `Quarto` implementa essa interface para fornecer a funcionalidade de clonagem.

```Essas classes compõem o projeto da Pousada Alegria e Fantasia e fornecem funcionalidades para criação de reservas, gerenciamento de quartos e hospedes.```
