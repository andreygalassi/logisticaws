.: Entregando mercadorias

O Walmart esta desenvolvendo um novo sistema de logistica e sua ajuda é muito importante neste momento. 
Sua tarefa será desenvolver o novo sistema de entregas visando sempre o menor custo. Para popular sua 
base de dados o sistema precisa expor um Webservices que aceite o formato de malha logística (exemplo abaixo), 
nesta mesma requisição o requisitante deverá informar um nome para este mapa. É importante que os mapas 
sejam persistidos para evitar que a cada novo deploy todas as informações desapareçam. O formato de malha 
logística é bastante simples, cada linha mostra uma rota: ponto de origem, ponto de destino e distância entre 
os pontos em quilômetros.

A B 10
B D 15
A C 20
C D 30
B E 50
D E 30

Com os mapas carregados o requisitante irá procurar o menor valor de entrega e seu caminho, para isso ele 
passará o mapa, nome do ponto de origem, nome do ponto de destino, autonomia do caminhão (km/l) e o valor 
do litro do combustivel, agora sua tarefa é criar este Webservices. Um exemplo de entrada seria, mapa SP, 
origem A, destino D, autonomia 10, valor do litro 2,50; a resposta seria a rota A B D com custo de 6,25.

Você está livre para definir a melhor arquitetura e tecnologias para solucionar este desafio, mas não se 
esqueça de contar sua motivação no arquivo README que deve acompanhar sua solução, junto com os detalhes 
de como executar seu programa. Documentação e testes serão avaliados também =) Lembre-se de que iremos 
executar seu código com malhas beeemm mais complexas, por isso é importante pensar em requisitos não 
funcionais também!!

Também gostaríamos de acompanhar o desenvolvimento da sua aplicação através do código fonte. Por isso, 
solicitamos a criação de um repositório que seja compartilhado com a gente. Para o desenvolvimento desse 
sistema, nós solicitamos que você utilize a sua (ou as suas) linguagens de programação principal. Pode ser 
Java, JavaScript ou Ruby.

Nós solicitamos que você trabalhe no desenvolvimento desse sistema sozinho e não divulgue a solução desse 
problema pela internet. 
 
Caso você precise de mais tempo, favor nos avisar.
============================================================

Este é um Webservice criado para atender o desafio da wallmart.
Aqui foi utilizado o JAX-WS para desenvolver um WS em SOAP.

Um endereço valido para acessar o WSDL (arquivo descritor do Webservice) é o http://localhost:8080?wsdl e 
pode ser acessado após executar o .jar criado.

Este WS tem basicamente as 2 funções solicitadas pelo desafio, a criação de uma nova malha logistica e
a função com o calculo da melhor rota de um mapa específico.
Os métodos criados são:
http://localhost:8080?melhorRota
http://localhost:8080?novaMalha
 

