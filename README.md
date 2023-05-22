# *Classes Abstratas e Métodos Abstratos*
## Exercício de fixação


Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
bem como o total de imposto arrecadado.
Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
seguintes:

**Pessoa física**: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
destes gastos são abatidos no imposto.

**Pessoa jurídica**: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
funcionários, ela paga 14% de imposto. 

### *Abstract methods and classes*

Write a program that reads the data of N tax payers (N being given by the user), which they can be Individuals or legal entities, and then show the amount of tax paid by each one, as well as the total tax collected.
Individual data are: name, anual income and health expenditures. Company data are name, anual income and number of employees. The tax calculation rules are as follows: 

**Individual entity**: People who had income below 20000.00 pay up to 15% tax. People whose income was over 20000.00, must pay 25% tax. Should the individual had health expenditures, 50% of those expenses  must be deducted from the tax paid.  

**Legal entity**: companies must pay tax of 16% over their anual income. However, if said company has more than 10 employees, it must pay only 14%. 
