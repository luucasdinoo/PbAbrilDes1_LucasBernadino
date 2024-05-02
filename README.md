# PbAbrilDes1_LucasBernadino

1- Cenário 1: Genealogia

Arquivos utilizados: 

- Program.java (Classe principal main)
- Person.java (Atributos e métodos de person) ->
O construtor um recebe apenas um nome como parâmetro.
O construtor dois recebe um nome e uma variavel "mom" do tipo Person para 
adicionar o nome da pessoa e sua respectiva mãe ou pai.
O método addSpouse recebe uma variável spouse do tipo Person e adiciona essa pessoa 
como conjugue.
O método addChild recebe uma variável child do tipo Person e adiciona child
a uma lista de filhos.
O método printFamilyTree possui uma variavel build do tipo String que ao ser adicionada em
um println exibe os primeiros membros da familia, em seguida o for entra em ação chamando seus filhos
através do método recursivo printFamilyTree(num + 1);

2- Cenário 2: Roda Gigante:

Arquivos utilizados:

- Program2.java (Classe principal main)
- Person2.java -> Contém os atributos de pessoa e serve como super classe para Child e Adult.
- Waggon.java -> Contém os atributos da gondola, seus construtores e seus gets.
- Child.java e Adult.java -> Extensões da super classe Person2, a classe child possui
um atributo diferente, o responsible, que determina um responsavel do tipo Adult.
- FerrisWheel -> A classe mais importante, que faz a roda gigante "funcionar" , possui uma lista
de gondolas do tipo Waggon, possui um construtor que inicia uma lista e preenche essa lista com 
o número de gondolas da roda gigante.
- Métodos da classe FerrisWheel:
* board: O primeiro método board recebe duas pessoas para serem adicionadas em uma gondola, se essas pessoas
forem crianças menores de 12 anos e não estiverem com seus respectivos responsáveis, o programa imprime um erro,
se ocorrer tudo certo, o método set da classe ArrayList é chamado para atualizar uma posição da gondola de null
para a nova posição informada.
* board: O segundo método board recebe apenas uma pessoa para ser adicionada a uma gondola, se essa pessoa
for uma criança menor de 12 anos e não estiver com seu respectivo responsável, o programa imprime um erro,
se ocorrer tudo certo, o método set da classe ArrayList é chamado para atualizar uma posição da gondola de null
para a nova posição informada.
* status: O método status imprime a situação das gondolas, a partir de um for para armazenar todas as gondolas e
em seguida imprimir "Empty" caso as duas posições do vagão seja null, imprimir o nome das duas pessoas caso as duas
posições sejam diferentes de null, imprimir o nome da pessoa do assento 2 caso apenas o assento 2 esteja ocupado, e por fim
imprimir o nome da pessoa do assento 1 caso apenas o assento 1 esteja ocupado, isso tudo foi feito na variavcel build do tipo
String utilizando varias estruturas ternárias.

Cenário 3: Script SQL

Arquivos utilizados:

- sql.sql

Tabelas criadas:
* Person
* Waggon



