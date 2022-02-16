#language: pt
#Autor: Caio Augusto
#Data: Dezembro/2022
@gerenciamento @regressao


Funcionalidade: Geranciamento de usuarios CRUD

Como Administrador quero gerenciar todos usuarios do sistema
Para assim poder maniputar quando quiser
Alterar, deletar, inserir e ler informaçoes

Contexto: 
Dado que esteja no Orage
Quando escrevo o Login "Admin"
E a "admin123"
E clico no botao login
E visualizo "Dasboard"
Quando passo o mouse em cima de Administrador
E visualizo Gerenciamento de usuario 
E em seguida clico em comercial 


@adicionar_usuario_Administrador
Cenario: Adicionar usuario
Quando clico no botao adicionar
E seleciono a funcao "Admin"
E seleciono o funcionario "Mano Caio"
E nome de usuario 
E situacao "Enabled"
E senha "uZZJMWTt7VpjnvEcBdf%F*"
E repetir a senha "uZZJMWTt7VpjnvEcBdf%F*"
Quando clico no botao save
Entao devo ver a mensagem que sucesso




Exemplos:

|Login	|Senha		 |Dasboard	 |
|"Admin"|"admin123"|"Dashboard"|