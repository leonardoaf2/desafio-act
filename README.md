# API - Cadastro de Pessoas e Endereços 

API desenvolvida com Spring Boot 2.3.4 com função de realizar o cadastro de pessoas relacionando com seu endereço consultado através do CEP, utilizando a API externa do endereço https://viacep.com.br/ws/01001000/json/ para realizar as consultas.

A aplicação consiste em:
- Cadastro de pessoas com endereço através do POST;
- Cadastro de pessoas sem endereço através do POST;
- Atualização de pessoas através do PUT;
- Consulta de pessoas através do GET;
- Consulta de CEP através do GET;

   No Postman
---
    Inserção de pessoas e seu respectivo endereço
    POST -> http://localhost:8080/pessoas
    
    {
    "nome": "Matheus",
    "cpf": "12345678910",
    "rg": "12548862", 
    "enderecos":[
        {
        "cep": "05782370",
        "numero": "80"
        },
        {
        "cep": "04775160",
        "numero": "128"
        }
     ] 
    }
---
---
    Consultar pessoas
    GET -> http://localhost:8080/pessoas/todas
   
---
    Consultar CEP
    GET -> http://localhost:8080/cep/05782370
 ---   
   Atualizar pessoas
    PUT -> http://localhost:8080/pessoas
---
