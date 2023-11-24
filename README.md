# Cadastro-automovel-com-springboot
Projeto utilizando a linguagem de programação Java e o framework Spring com uma estrutura inicial de microsserviços para fazer a gestão dos veículos de uma loja.
Trata-se do desenvolvimento de um protótipo reutilizável, que deve servir de estrutura inicial para o novo sistema de gestão de veículos, tendo como serviços criados:
GET/listarprodutos: Este recurso, quando requisitado no navegador, deve retornar ao cliente uma tela com a listagem dos veículos da loja. Para esta versão do sistema, essa lista poderá ser inserida de forma fixa no front-end.
GET /cadastrarproduto: Este recurso, quando requisitado no navegador, deve retornar ao cliente uma tela com um formulário para cadastrar um veículo. A ação do botão “Adicionar” deve disparar o método POST descrito a seguir. Para esta versão do sistema, os dados não precisarão ser persistidos, sendo exibida uma mensagem em uma tela de confirmação, conforme descrita a seguir.
POST /inserirproduto: Este recurso é acionado pela ação do botão “Adicionar”. O objetivo deste método, para esta versão do sistema, é apenas fazer um redirecionamento para outro recurso, para que seja exibida uma tela de confirmação.
GET /produtoinserido: Este recurso é acionado internamente pelo item 3 e seu objetivo é exibir uma tela de confirmação que o veículo foi inserido com sucesso.
