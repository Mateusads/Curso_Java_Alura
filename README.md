<p align="center">
  <img href="https://cursos.alura.com.br/" src="https://hipsters.jobs/files/pictures/alura-dark-300.png" align="center" width="130" >
</p>

# [PROJETOS E EXERCÍCIOS CURSO DE JAVA COMPLETO ALURA.](https://cursos.alura.com.br/category/programacao/java)

### Aproximadamente 23 cursos de java, do básico ao avançado seguindo os padrões usados hoje no mundo da programação Orientada a Objeto, OO

<p align="center">
  <img src="https://yata-apix-a9caea66-ad78-425f-aa08-e292558ebb65.lss.locawebcorp.com.br/0ef33a607ebb453e8fb4f13aa1ad56c7.png" align="center" width="530" >
</p>


## Java Conceitos.

Curso é iniciado com introdução sobre programação, lógica e programação OO.

Onde passa para o básico sobre a sintaxe e as particularidades do Java.

É abordado com detalhes sobre polimorfismo e herança, assim para entender exceções e como criar as suas.

## Java composição.

Entrando a fundo no polimorfismo usando as classes mais genéricas como a Object a (Avó) de todos os objetos.

Wrappers - como transformar ou como java já transforma automaticamente os atributos primitivos para objetos (Autoboxing e Unboxing)

Bibliotecas padrões - Como java.lang e java.util, suas classes para facilicar um desenvolvimento.

Lambdas - Programação funcional onde é possível abstrair varias ações como criar uma classe ou fazer um foreach de maneira fácil. ( -> )

## Java Files.

FileInput e FileOutput - Escrever e ler um aquivo é sempre importante, é abordado de maneira simples de maneira detalhada para um entendimento. 

Serializable - É transformar um objeto em outro formato, muito comum é em Json, mas também pode ser bin como no exemplo.
No exercício foi criado um arquivo .bin com os dados de um Objeto, e depois foi recuperado esses dados e printado na tela, 
[Para ver os prints no console segue as imagens clicando aqui](https://github.com/Mateusads/Curso_Java_Alura/tree/master/java-io/src/img/printConsole)

## Collections.

Arrays - Métodos e como os arrays se comportam. Uso de comparator e alguns métodos da Classe Collections como sort.

Relacionamento com Coleções - O melhor é sempre usar a forma mais genérica usando o polimorfismo, nesse caso usando List<> invés do ArrayList ao criar a instancia de Aula em curso, para que se um dia precisar mudar para outro tipo de List fica muito mais fácil, e um baixo acoplamento é tambem um padrão de projeto.

Sets - Com alguns métodos similares a List por ser filhos de collections, tem uma estrutura totalmente diferente, onde para se adicionar e buscar com estrema rapidez. "Feito teste de velocidade em mls". 

HashSet - Começando usando HashSet uma estrutura hash, que adiciona não em sequencia e sim de uma forma bem mais complexa, guardando um número mágico para poder buscar depois, por isso é bem importante na classe implementar o HashCode para a busca ser mais precisa depois.

LinkedHashSet - Visto de uma forma rápida por ser muito semelhando ao HashSet porém ela retorna digamos de uma forma orgazinada, sem critério ela volta por ordem de inserção.

TreeSet - Com forma de árvore, não foi visto a sua implementação a fundo, mas podemos ter uma visão dela, onde deve se passar um Comparator ao adicionar o elemente para que a ordenação sejá feita, no exemplo foi criado uma classe adicional que implementa Comparator para poder criar uma Collection do tipo TreeSet.

## Map
### Não é uma Collection, mas segue uma linha próxima, para armazenar varios elementos.

Usamos o HashMap mais sabemos que tem mais algumas variações como LinkedHashMap, TreeHashMap entre outras, mais que é o entendimento é que ele trabalha com Key, value (Chave, valor), ou seja para cada Objeto há uma chave para encontrar, no exemplo adicionamos em matriculaParaAluno, ao adicionar Aluno no curso é salvo a matricula como chave, para uma busca fácil de aluno por matrícula.

## Java 8

Algumas novidades foram introduzidas no [Java SE 8 (LTS)](https://docs.oracle.com/javase/8/docs/api/) (2014) como o foreach e lambda que ja foi visto no curso até aqui, porém outros recursos tambem foram introduzidos.

lista.foreach(lista -> System.out.println(lista) - Exemplo de Lambda

lista.foreach(System.out::println) - Exemplo de References


Metodos default nas interfaces - Agora as interfaces podem implementar métodos, graças a essa atualização, no caso isso quer dizer que as interfaces agora podem implementar um método, não só abstrair.

Temos as Functions como Comparator, Consumer entre outras Functions que possui somente um método, assim podemos fazer o lambda sem precisar explicitamente implementar o método da classe. 

Stream - Toda Collection agora possui essa "Interface Fluente", é uma forma de trabalhar com Objetos, e ele possui um monte de metódos auxiliares que retornam um stream, assim sendo possível encadear as ações.

		int soma = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.mapToInt(Curso::getAlunos)
				.sum();

Nessa função usando stream, temos um exemplo com ela retornando um inteiro soma (lembrando que nem sempre é preciso pegar o retorno já que ele consegue fazer um forEach para printar na tela).

Cursos é nossa lista de curso, por ser uma lista pode usar stream, podem ver como é prático, porque na mesma linha contatena varias ações, ele já filtra somente os cursos com + de 100 alunos, ele pega o int do retordo de getAlunos ou seja o número de alunos cadastrados, e ainda retorna e soma desses alunos com o método sum(), fica muito melhor tanto para fazer e para entender o código.



## [Meu Certificado Alura](https://cursos.alura.com.br/user/mateus-medeiros2/fullCertificate/426499523006e2d52fc5554ca0855d22)


<p align="center">
  <img src="https://yata-apix-a9caea66-ad78-425f-aa08-e292558ebb65.lss.locawebcorp.com.br/0ef33a607ebb453e8fb4f13aa1ad56c7.png" align="center" width="530" >
</p>

# Experiência com a plataforma de cursos.

A experiência com a Alura é muito boa: a equipe consegue estar sempre atualizada sobre as novas tecnologias,
agregar conhecimentos, aperfeiçoando para melhorar e se capacitar para o mercado de trabalho da tecnologias de hoje.

<p align="center">
  <img src="https://yata-apix-a9caea66-ad78-425f-aa08-e292558ebb65.lss.locawebcorp.com.br/0ef33a607ebb453e8fb4f13aa1ad56c7.png" align="center" width="530" >
</p>


# Meus dados do portifólio Git.
<div align="center">
<img height="160" src="https://github-readme-stats.vercel.app/api?username=mateusads&show_icons=true&theme=tokyonight">

<img height="160" src="https://github-readme-stats.vercel.app/api/top-langs/?username=mateusads&layout=compact)](https://github.com/mateusads/github-readme-stats">
</div>

## Contato

[<img href="https://www.linkedin.com/in/mateus-medeiros-1a82411b1" height="50" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/linkedin/linkedin-original.svg">](https://www.linkedin.com/in/mateus-medeiros-1a82411b1)

## Linguagens

<div>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" align="center" heigth="50" width="60" >

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/javascript/javascript-original.svg" align="center" heigth="50" width="60" >

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original-wordmark.svg" align="center" heigth="50" width="60" >

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original-wordmark.svg" align="center" heigth="50" width="60" >
</div>

<p align="center">
  <img src="https://yata-apix-a9caea66-ad78-425f-aa08-e292558ebb65.lss.locawebcorp.com.br/0ef33a607ebb453e8fb4f13aa1ad56c7.png" align="center" width="530" >
</p>