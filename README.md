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
 
Bibliotecas padrões - Como java.lang e java.util, suas classes para facilitar um desenvolvimento.
 
Lambdas - Programação funcional onde é possível abstrair várias ações como criar uma classe ou fazer um foreach de maneira fácil. ( -> )
 
## Java Files.
 
FileInput e FileOutput - Escrever e ler um arquivo é sempre importante, é abordado de maneira simples de maneira detalhada para um entendimento. 
 
Serializable - É transformar um objeto em outro formato, muito comum é em Json, mas também pode ser bin entre outros.
No exercício foi criado um arquivo .bin com os dados de um Objeto, e depois foi recuperado esses dados e printado na tela, 
[Para ver os prints no console segue as imagens clicando aqui](https://github.com/Mateusads/Curso_Java_Alura/tree/master/java-io/src/img/printConsole)
 
## Collections.
 
Arrays - Métodos e como os arrays se comportam. Uso de comparator e alguns métodos da Classe Collections como sort.
 
Relacionamento com Coleções - O melhor é sempre usar a forma mais genérica usando o polimorfismo, nesse caso usando List<> invés do ArrayList ao criar a instância de Aula em curso, para que se um dia precisar mudar para outro tipo de List fica muito mais fácil, e um baixo acoplamento é também um padrão de projeto.
 
Sets - Com alguns métodos similares a List por ser filhos de collections, tem uma estrutura totalmente diferente, onde para se adicionar e buscar com extrema rapidez. "Feito teste de velocidade em mls". 
 
HashSet - Começando usando HashSet uma estrutura hash, que adiciona não em sequência e sim de uma forma bem mais complexa, guardando um número mágico para poder buscar depois, por isso é bem importante na classe implementar o HashCode para a busca ser mais precisa depois.
 
LinkedHashSet - Visto de uma forma rápida por ser muito semelhante ao HashSet porém ela retorna digamos de uma forma organizada, sem critério ela volta por ordem de inserção.
 
TreeSet - Com forma de árvore, não foi visto a sua implementação a fundo, mas podemos ter uma visão dela, onde deve se passar um Comparator ao adicionar o elemento para que a ordenação seja feita, no exemplo foi criado uma classe adicional que implementa Comparator para poder criar uma Collection do tipo TreeSet.
 
## Map
### Não é uma Collection, mas segue uma linha próxima, para armazenar varios elementos.
 
Usamos o HashMap mais sabemos que tem mais algumas variações como LinkedHashMap, TreeHashMap entre outras, mais que é o entendimento é que ele trabalha com Key, value (Chave, valor), ou seja para cada Objeto há uma chave para encontrar, no exemplo adicionamos em matriculaParaAluno, ao adicionar Aluno no curso é salvo a matrícula como chave, para uma busca fácil de aluno por matrícula.
 
## Java 8
 
Algumas novidades foram introduzidas no [Java SE 8 (LTS)](https://docs.oracle.com/javase/8/docs/api/) (2014) como o foreach e lambda que já foi visto no curso até aqui, alguns outros recursos importante do Java 8 é abordado.
 
- Exemplo em Código
 
    lista.forEach(l -> System.out.println(l));
    lista.forEach(System.out::println);
 
* * O Exemplo acima exibe o mesmo resultado, o primeiro usando expressão [Lambda](https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826) e o segundo usando [References](https://cursos.alura.com.br/forum/topico-metodos-references-com-parametros-44231)
 
Métodos default nas interfaces - Agora as interfaces podem implementar métodos, graças a essa atualização, no caso isso quer dizer que as interfaces agora podem implementar um método, não só abstrair.
 
Temos as Functions como Comparator, Consumer entre outras Functions que possui somente um método, assim podemos fazer o lambda sem precisar explicitamente implementar o método da classe. 
 
Stream - Trata-se de uma poderosa solução para processar coleções de maneira declarativa, ao invés da tradicional e burocrática forma imperativa. Toda Collection agora possui essa "Interface Fluente" e possui um vários métodos auxiliares que retornam um stream, assim sendo possível encadear as ações.
 
<p align="center">
  <img src="https://www.oracle.com/technetwork/pt/images/java8-streams-3410045.png" align="center" width="auto" >
</p>
 
Na imagem podemos ver a ordem que pode ser encadeada ao stream.
 
- Exemplo em Código
 
    int soma = cursos.stream()
        .filter(c -> c.getAlunos() > 100)
        .mapToInt(Curso::getAlunos)
        .sum();
 
* * Nesse exemplo com [Stream](https://www.oracle.com/br/technical-resources/articles/java/processing-streams-java-se-8.html#:~:text=As%20streams%20suportam%20o%20m%C3%A9todo%20map%2C%20que%20usa,obter%20informa%C3%A7%C3%B5es%20de%20cada%20elemento%20de%20uma%20stream.) é usado o Filter e Functions sem precisar usar o Comparator como no fluxo da imagem.
 
No exemplo é esperado como retorno um inteiro resultado de soma (lembrando que nem sempre é preciso pegar o retorno já que ele consegue fazer um forEach para printar na tela por exemplo), nesse caso o método sum() retorna um int, porém o mais comum é os métodos retornam um Stream.
 
A variável cursos é nossa lista de Curso, por ser uma lista(Collections) pode usar stream, é muito prático, porque na mesma linha concatenar várias ações, já é filtrado onde a variável Aluno é maior que 100, com MapToInt guarda somente o que é (Inteiro) do retorno de getAlunos ou seja o número de alunos cadastrados, e com sum() é retornado a soma desses alunos, fica muito melhor tanto para programar e para entender o código.
 
Optional - Ganhamos muito com essa nova introdução. Assim não precisamos escrever aqueles diversos ifs garantindo que o objeto não é nulo, temos uma forma muito mais interessante de representar nossas intenções.
 
    OptionalDouble media = cursos.stream()
        .filter(c -> c.getAlunos() >= 50 )
        .mapToInt(Curso::getAlunos)
        .average();
 
* * Nesse exemplo usamos OptinalDouble, para Objetos criados podemos usar Optinal apenas, o interessado que se a divisão for por 0 não receberemos uma exception, ele guarda null.
 
A classe [Optional](http://docs.oracle.com/javase/8/docs/api/java/util/Optional.html) nos oferece uma variedade imensa de novos métodos que nos permite trabalhar de forma funcional com nossos valores, tirando maior proveito dos novos recursos de default methods, lambdas e method reference.
 
DataTime - Até o java 8 lidar com datas no java era difícil e burocrático, porém essa nova forma veio para simplificar tudo.
Para formatar, criar datas, e fazer operações com ela virou coisa simples, para pegar datas com tempo como horas e minutos pode ser usado o LocalDateTime.
- Exemplo em Código
 
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");   
    LocalDateTime agoraComMinutos = LocalDateTime.now();
    System.out.println(agoraComMinutos.format(formatador));
 
No exemplo é criado um formatador(opcional), na próxima linha de cod é guardado a LocalDateTime.now() pega a sua data e hora do sistema e faz um print passando o formatador.
 
 
# Java teste unitário
 
Junit - Primeiro teste foi comparado um teste sem e com Junit como ele ajuda e deixa muito mais fácil a verificação do teste.
Usando o Junit 5 usamos o método Assert.assertEquals para verificar se o valor que recebemos do método é o esperado.
 
  int soma = calc.somar(10, 11);
    Assert.assertEquals(21, soma);
 
TDD - (Test Drive Designer) é uma programação guiada a teste, onde antes de você escrever as funcionalidades, primeiro cria o teste, depois implementa e por último refatora deixando o cod. funcional e clean. Para refatorar implementamos o [Designer Pattern Strategy](https://java-design-patterns.com/patterns/strategy/) onde nosso enum implementa um método abstrato que passa o valor do percentual sem precisar criar um monte de if como na nossa primeira implementação.
 
    public void reajuste(Funcionario func, Enum desempenho) {
      BigDecimal percentual = desempenho.percentual();
      BigDecimal reajuste = func.getSalario().multiply(percentual);
      func.reajusteSalario(reajuste);   
 
Teste Exception - Quando no teste você espera que de uma exception para um certo comportamento, o próprio Junit já tem uma abordagem para isso com AssertThrow, ou usando o Try catch.

#  Java Programação paralela (Threads)

Threads - Primeiro um projeto rodando somente uma thread que a própria JVM cria. Uma aplicação de calculador (feita para travar com números altos) abre uma tela feita em swing e pede dois números para multiplicação, como não é ainda uma execução em paralelo ela fica travada para o usuário até que seja finalizada o calculo, então vamos resolver com threds.

Varias Threads - Feito um cod. com várias threds buscando nome em arquivos separados, nesse caso vimos que como elas também dependem do sistema operacional, a ordem que são execultadas não segue um padrão, é a primeira que chegar execulta, e pode se alterar toda vez.

 
<p align="center">
  <img src="https://yata-apix-a9caea66-ad78-425f-aa08-e292558ebb65.lss.locawebcorp.com.br/0ef33a607ebb453e8fb4f13aa1ad56c7.png" align="center" width="530" >
</p>
 
# Experiência com a plataforma de cursos.
 
A experiência com a Alura é muito boa: a equipe consegue estar sempre atualizada sobre as novas tecnologias,
agregar conhecimentos, aperfeiçoando para melhorar e se capacitar para o mercado de trabalho das tecnologias de hoje.
 
#
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
 
#
# [Meu Certificado Alura](https://cursos.alura.com.br/user/mateus-medeiros2/fullCertificate/426499523006e2d52fc5554ca0855d22)
 

