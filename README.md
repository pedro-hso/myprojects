# myprojects
F1Results README

TECNOLOGIAS

  Java 8
  MongoDB
  Spring
  Swagger

FUNCIONALIDADES
	A aplicação consome o json do desafio usando o RestTemplate do Spring, que é mapeado para as classes correspondentes com o auxilio do Gson.	Logo após, esses dados são armazenados no MongoDB, no qual é possível realizar diversas pesquisas de formas diferentes: A aplicação busca os registros pelo	número do carro/piloto e retorna suas informações. Ainda pode retornar as informações de todos os pilotos, bem como o json completo com todos os dados que foram inseridos. A documentação interativa foi feita utilizando Swagger, lá também é possível realizar as buscas citadas anteriormente (get), como também inserir dados (post).
