# LP2 IFSP

Repositório para organizar os códigos da disciplina de Linguagem de Programação 2.

## Instruções Lab de informática

### Ao chegar no laboratório:

1 - Configurar o usuário local do git

```bash
git config --global user.name "Mateus Cruzatto"
git config --global user.email "mateusc.ramos@outlook.com"
```

2 - Fazer o clone do seu repositório no GitHub

```bash
git clone https://github.com/mat-afk/lp2-ifsp.git
```

3 - Abrir o repo no VSCode
```bash
code lp2-ifsp
```

4 - Criar um token para realizar os pushs

Settings -> Developer settings -> Personal access tokens -> Tokens (classic) 
Generate new token, selecionar a opção Generate new token classic, marcar a opção scope repo.

### Antes de sair do Laboratório
1 - Remover configurações de usuário do git local
```bash
git config --global --unset user.name
git config --global --unset user.email
```

2 - Deletar o token no GitHub

3 - Deslogar do GitHub