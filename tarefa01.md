0. Configure seu nome e e-mail:
  git config user.name "Mateus"
g  it config user.email "mateus@teste.com"

2. Crie uma pasta chamada cs-aulagit
  mkdir cs-aulagit
  
3. Entre na pasta e inicie um repositório local
   cd cs-aulagit
   git init

4. Verifique se o repositório foi criado
	ls -la
   "sim"
5. procure pelo diretório ".git"
cat .git

6. Remova o repositório
	rm -rf .git

7. Crie o repositório novamente
   git init

8. Crie um arquivo chamado cs.txt e na primeira linha adicione o seu nome.
  touch cs.txt

9. Verifique se o status do arquivo é "Untracked files" (Status: work directory)
   git status
10. Adiciona o arquivo ao "Stage" e verifique o status novamente (agora deve ser "Changes to be committed" - que indica a etapa de Staging area)
   git add cs.txt
    
12. Faça o commit desse arquivo no seu repositório local. Coloque o comentário "Arquivo cs.txt criado com o meu nome"
   git commit -m "teste"

10. Verifique o status do repositório
	git status

11. Verifique os arquivos sob o controle do git
	git ls-files

12. Altere o arquivo cs.txt: inclua uma nova linha com o nome da disciplina.
vim cs.txt
    esc/shift :/wq

13. Crie um novo arquivo chamado engenharia-software.txt e no conteúdo dê uma descrição do curso (2 ou 3 linhas).
touch engenharia-software.txt
vim engenharia-software.txt
...

14. Verifique o satus dos dois arquivos e procure entender a diferença
git diff


15. Verifique os arquivos sob o controle do git novamente (git ls-files). Ambos os arquivos são listados? por que (procure entender e se não souber pesquise/pergunte)?
git ls-files

16. Adicione os dois arquivo para "Staged area": 
	git add .

17. Retorne o arquivo cs.txt para a etapa de Work directory
	git reset cs.txt

18. Verifique o status e "entenda" que os dois arquivos estão em etapa diferentes (Work Directory e Staged area)
    git status
    ok

19. Adicione no arquivo cs.txt mais uma linha: "INF - Instituto de Informatica"
  vim cs.txt


20. "Mova" esse arquivo para Staged
  git add cs.txt


21. Faça o commit dos dois arquivos com o seguinte comentário: "Definição do Curso de Engenharia de Software do INF"
  git commit -m "Definição do Curso de Engenharia de Software do INF"


22. Verifique o "log" de mudanças
	git log

23. Verifique o "log" de mudanças do arquivo "cs.txt"
git log cs.txt


24. Altere o arquivo "cs.txt" adicionando a seguinte linha: "UFG - Universidade Federal de Goiás"
  vim cs.txt

25. Verifique a diferença entre a versão "comitada" e a versão atual do arquivo cs.txt
	git diff cs.txt

26 Adicione o arquivo cs.txt ao Staged area
  git add cs.txt


27. Volte o arquivo cs.txt para a área de staged. 
	git reset cs.txt

28. Agora mova o arquivo para a area de Staged e depois faça o commit. Não esqueça o comentário:
	git add cs.txt
	git commit -m "Teste"

29. Veja os branches existentes
	git branch
//master

30. Crie um novo "branch" chamado "develop" e entre nele
	git checkout -b develop
//Switched to a new branch 'develop'

31. Vejas os branches existentes
  git branch

32. Faça uma mudança no arquivo "engenharia-software.txt". Adicione uma linha com a carga horaria total do curso.
  vim engenharia-software.txt

33. Crie um outro arquivo com o nome estudo-git.txt e, dentro dele, explique brevemente o comando "git status"
  touch estudo-git.txt
//verificar o status e alteração dos arquivos em stage ou fora dele

34. Verifique o status dos arquivos
	git status

35. Move os arquivos para Staged area e depois faça o commit.
  git add .
  git commit -m "teste"

36. Mude para a branch master
	git checkout master

37. Verifique se o arquivo "estudo-git.txt" está na branch master.
	git ls-files
//não

38. Verifique se a mudança realizada existe no arquivo "engenharia-software.txt". Pesquise/pergunte se não conseguiu entender o motivo da mudança não constar aqui.
cat engenharia-software.txt
//existe

39. Faça o "merge" das mudanças realizadas no "develop" para a branch "master"

39.1 Certifique-se que está na master
		git branch

14 Faça o merge
    git merge develop
//merge não funcinou
//Already up to date

43. Apague a branch "develop"
	git branch -D develop

44. Verifique se a branch foi excluída
	git branch


