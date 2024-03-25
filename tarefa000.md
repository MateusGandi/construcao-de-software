# Pesquisa sobre Rest API (Application Programming Interface)

API's são formas pela quais diferentes sistemas se comunicam e tramitam dados entre si. Diferentemente de formas antigas de funcionamento dos programas, que mesclavam o front e back-end em uma só aplicação, hoje temos uma prefência por dividir essas estrtuturas pela elaboração de diferentes arquiteturas de serviços, que funcionam de forma independente entre si e são mais adeptos a mudanças de escalabilidade e proporção. Uma dessas arquiteturas de API comum é a REST (Representational State Transfer), norteada por um conjunto de princípios para projetar a interação entre essas partes do sistema.

**REST (Representational State Transfer)**: É um estilo arquitetural para sistemas distribuídos que foca na escalabilidade, simplicidade e a interoperabilidade (mutuabildiade). As APIs REST são baseadas nos princípios definidos pela REST, utilizando o protocolo HTTP para comunicação entre cliente e servidor, sendo um conjunto de regras e definições que permite que diferentes softwares se comuniquem entre si.

## Principais Características

**Arquitetura Cliente-Servidor**: As APIs REST seguem o modelo cliente-servidor, onde o cliente envia requisições para o servidor e recebe respostas em troca. O que enfatiza a separação de responsabilidades e facilita a escalabilidade quando houver necessidade de aumentar a demanda.

**Recursos Identificáveis**: Os recursos, que podem ser dados ou funcionalidades, são identificados por URIs (Uniform Resource Identifiers). Cada recurso deve ter uma URI única que o identifica de forma única na aplicação.

**Operações HTTP**: As operações comuns de um CRUD (Create, Read, Update, Delete) são alocadas para os métodos do HTTP: POST, GET, PUT e DELETE. Isso permite uma correspondência direta entre as operações da API e os métodos HTTP, facilitando a compreensão e o desenvolvimento de APIs REST, além, é claro, de separar e facilitar operações no sistema e intaração com um banco de dados, embebido de recursos para proteção, controle de acesso e restrições.

**Stateless (Sem Estado)**: As comunicações entre cliente e servidor devem ser "stateless", cada requisição do cliente deve conter todas as informações necessárias para o servidor entender e processar a requisição, sem depender de nenhuma requisição anterior. Isso permite que os servidores sejam mais facilmente escaláveis e distribuíveis, afinal, os parametros nem sempre serão os mesmos quando se trata de diferentes usuários em um sistema.

**Representações de Recursos**: Os recursos são representados em um formato específico, geralmente JSON (JavaScript Object Notation) ou XML (eXtensible Markup Language). Isso permite que os clientes e servidores negociem o formato de representação mais adequado para os dados.


