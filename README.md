# OrganizeDay
Aplicação de um ToDoList com Java / Srping Boot


Funcionalidades Principais:
CRUD de Tarefas:

Create (Criar): Adicionar novas tarefas.
Read (Ler): Listar todas as tarefas.
Update (Atualizar): Editar tarefas existentes.
Delete (Deletar): Remover tarefas.
Autenticação de Usuários:

Registro de novos usuários.
Login e logout.
Gerenciamento de sessão.
Categorias de Tarefas:

Criação e atribuição de categorias para as tarefas.
Listar tarefas por categoria.
Filtros por Data e Status:

Filtrar tarefas por data de criação, data de conclusão.
Filtrar tarefas por status (pendente, em progresso, concluída).
Estrutura do Projeto
Modelo (Model):

Classe Task para representar uma tarefa (com atributos como id, título, descrição, data de criação, data de conclusão, status, categoria).
Classe User para representar um usuário (com atributos como id, nome, email, senha).
Classe Category para representar categorias (com atributos como id, nome).
Controle (Controller):

Controladores para gerenciar requisições relacionadas às tarefas, usuários e categorias.
Serviço (Service):

Serviços para implementar a lógica de negócios, como criação, atualização e remoção de tarefas.
Serviços para autenticação e autorização de usuários.
Repositório (Repository):

Interfaces para comunicação com o banco de dados (utilizando JPA/Hibernate).
Vista (View):

Templates HTML para as páginas de visualização das tarefas, login, registro, etc.
Integração com frameworks como Spring Boot para facilitar a criação das rotas e manipulação de dados.
