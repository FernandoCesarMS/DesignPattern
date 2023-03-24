# Design Pattern Strategy

O Design Pattern Strategy é um padrão de projeto comportamental que permite que uma classe possa ter várias estratégias de implementação e possa trocá-las em tempo de execução, sem alterar o código que a utiliza.

Esse padrão é composto por três componentes principais: a classe abstrata que define a interface, as classes concretas que implementam essa interface e as classes que utilizam essas implementações.

A classe abstrata é responsável por definir a interface que será implementada pelas classes concretas. As classes concretas, por sua vez, implementam essa interface de forma diferente, oferecendo diferentes estratégias de implementação. E, por fim, as classes que utilizam essas implementações, podem trocá-las em tempo de execução, sem afetar o código que as utiliza.

# Projeto

O projeto proposto é um sistema de pagamento online, que permite o processamento de pagamentos com diferentes estratégias, como cartão de crédito, boleto bancário e Paypal.

Para implementar esse sistema, será criada uma classe abstrata "Pagamento", que definirá a interface para processar pagamentos. Em seguida, serão criadas classes concretas que implementam essa interface, como "PagamentoCartaoCredito", "PagamentoBoleto" e "PagamentoPaypal". Cada uma dessas classes concretas terá uma estratégia diferente para processar pagamentos.

Para utilizar o padrão strategy, será criada uma classe "ProcessadorPagamento" que receberá uma instância de "Pagamento" em seu construtor e usará essa instância para processar o pagamento. Dessa forma, será possível alternar entre as diferentes estratégias de pagamento, apenas trocando a instância de "Pagamento" passada para o "ProcessadorPagamento".

# Como o Design Pattern Strategy se aplica a esse projeto

No projeto proposto, o Design Pattern Strategy é aplicado por meio da criação da classe abstrata "Pagamento", que define a interface para processar pagamentos, e das classes concretas que implementam essa interface, oferecendo diferentes estratégias de pagamento.

A classe "ProcessadorPagamento" é responsável por utilizar as diferentes estratégias de pagamento, recebendo uma instância de "Pagamento" em seu construtor e processando o pagamento por meio dessa instância.

Dessa forma, o Design Pattern Strategy permite que diferentes estratégias de pagamento possam ser facilmente adicionadas no futuro, sem a necessidade de alterar o código que utiliza essas implementações. Além disso, esse padrão também oferece uma maior flexibilidade e facilidade de manutenção do código, tornando-o mais escalável e modular.
