# Jetpack-Compose-Fundamentos

## Introdução
<ol>
    <li>Jetpack Compose é um kit de ferramentas moderno do Android com intuito de ajudar na criação de UIs.</li>
    <li>Com ele vamos conseguir desenvolver a UIs em conjunto com a parte lógica da aplicação, descartando assim o XML.</li>
    <li>Seu desenvolvimento nativo é 100% em Kotlin.</li>
    <li>Ele utiliza um paradigma interativo.</li>
    <li>Sempre que você definir permissões dentro do seu app vai ser definido dentro arquivo android manifest.</li>
    <li>Imagens e arquivos desenhaveis vão ser adicionados na pasta drawable.</li>
    <li>No build.gradle.kts a nivel de projeto e a nivel de app é onde vai ser configurado bibliotecas.</li>
    <li>No arquivo libs.version.toml é onde fica o novo padrão de biblioteca apontando para build.gradle a nivel de app.</li>
    <li>Para fazer a criação de telas é necessario criar uma função composable.</li>
        Exemplo: @Composable
                fun NovaTela(){
                    }
    <li>Nome de funções que vão criar interfaces grafica é necessario que comecem com letras maiusculas.</li>
    <li>Os componentes do Jetpack Compose também vão ser funções.</li>
    <li>Para renderizar os componentes é necessario chamar funções do metodo setContet.</li>
</ol>

## Column e Row
<ol>
    <li>As linhas e colunas no código vão ser como escrever metodos, em que se você coloca parenteses neles eles podem receber alguns parametros e basta utilizar a virgula para ir adicinando os outros parametros esperados.</li>
    <li>O parametro do atributo modifer é uma interface que vem androidx.compose.ui.</li>
    <li>Assim que chamamos o modifer podemos dar o ponto e chamar o atributos que queremos modificar como altura, largura, background e etc, e basta apenas colocar o ponto e chamar o outro metodo que vai definir o atributo.</li>
            Exemplo: Column( 
                modifer = Modifer.height(100dp).width(50dp).background(color = Color.green) 
            )
    <li>A unidade que usamos na medida é o dp.</li>
    <li>A coluna por padrão ela não tem altura nem largura.</li>
    <li>Na coluna para pegar os valores maximos tanto de largura como de largura utilizamos os metodos fillMax.</li>
    <li>A função size no Modifer serve para definir tanto largura como altura.</li>
    <li>Para fazer o alinhamento dos elementos utilizamos horizontalAlignment e o verticalArrangement.</li>
    <li>Na coluna os componentes que vão sendo adicionados sempre vão ficar um abaixo do outro.</li>
    <li>A coluna seria o equivalente do linear layout do xml.</li>
    <li>Com as linhas os elementos que vão sendo adicionados vão sendo organizados um do lado dos outros.</li>
</ol>

## Scaffold
<ol>
    <li>Scaffold é um compponete que vai nos ajudar com uma estrutura pronto para criação de um layout responsivo.</li>
    <li>Para trabalhar com compose é necessário perceber que os elementos vão ser funções dentro de funções.</li>
    <li>A unidade de medida usada para texto é sp.</li>
    <li>É necessário que na chaves do scaffold passar o paddingValues, que vai receber de outra função composable que vai estar dentro dele, pode ser linha ou coluna, é isso que vai fazer a coluna ficar posicionada dentro do Scaffold.</li>
</ol>