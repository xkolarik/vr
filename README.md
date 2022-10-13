# vr

# Crud Spring Boot 

# Tecnologias
- JAVA 11
- Spring 4
- Spring Boot
- Spring MVC
- Maven
- JUnit

#Observações Gerais
- O Projeto foi criado utilizando a versão 2.3.1.RELEASE do Spring Boot
- Para executar precisa baixar o projeto e executar o build com Maven
- A configuração de comunicação com banco que é gerado via docker container esta no arquivo application.yaml

#Detalhes de implementação
- Devera ser utilizado um representation ou mapper para separação da camada de negocio dominio/model
- Para evitar problemas de 2 requisiçoes ao mesmo tempo será utilizado CompletableFuture - Link: https://dzone.com/articles/multi-threading-in-spring-boot-using-completablefu
- Foi utilizado do pattern SOLID a I - Interface Segregation Principle e S - Single Responsiblity Principle
