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
    <li>As colunas e linhas são usados como containers.</li>
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
    <li>Scaffold é um componente que vai nos ajudar com uma estrutura pronto para criação de um layout responsivo.</li>
    <li>Para trabalhar com compose é necessário perceber que os elementos vão ser funções dentro de funções.</li>
    <li>A unidade de medida usada para texto é sp.</li>
    <li>É necessário que na chaves do scaffold passar o paddingValues, que vai receber de outra função composable que vai estar dentro dele, pode ser linha ou coluna, é isso que vai fazer a coluna ou a linha ficar posicionada dentro do Scaffold. Esse valor do paddingValues vai ser passado para o modifer da função composable que você passou.</li>
            
            Exemplo: Scaffold(
            
            ) {paddingValues ->

            Column(Modifier.padding(paddingValues)) {}

            }
    
</ol>

## Box
<ol>
    <li>O box pode ser utilizado como container principal ou como secundario</li>
    <li>Ao utilizarmos o box, se passarmos o parametro content não é necessário usar chaves a frente de seus parenteses para passar conteudo.</li>
        
    Box(
            content = { <br>
                } <br>
            )
<li>Os elementos que estão dentro do box se estiverem na mesma posição vão ficar um por cima do outro.</li>
    <li>Para usar o box como componente principal basta usar a função fillMaxSize().</li>d
</ol>

## State 
<ol>
    <li>O button espera o parametro onClick.</li>
        
        Exemplo: Button( onClick = {} ){}

<li>Para valores que vão mudar utilizamos o state, que se declara da seguinte forma:</li>
        
        Exemplo: var nomedavaravelstate by remember{mutableStateOf()}

<li>O states pode se iniciar o estado com um valor especifico passado dentro do mutableStateOf(), e depois pode mudar esse valor a partir de alguma ação.</li>
<li>Os states podem ter qualquer tipo de valor primitivo.</li>
<li>OutlinedTextField() é o componente de caixa de texto.</li>
<li>O OutlinedTextField precisa de dois parametros obrigatorios, que é o "value" que seria o estado inicial da caixa de texto, e o outro é o "onValueChange = {}" que é o que vai ser digitado na caixa de texto.</li>
        
        Exemplo:OutlinedTextField(value = valor, onValueChange){}

<li>Para utilizar o toast que é a mensagem temporaria é necessário ter um contexto que pode ser conseguido da seguinte forma: </li>

        Exemplo: var contexto = LocalContext.current //Pega o contexto atual

<li>O onValueChange do OutlinedTextField possui uma variavel it que é valor do que foi digitado no textfield.</li>
</ol>

## Criando seu próprio componente
<ol>
    <li>Criando seus próprios modelo evita na repetição de código.</li>
    <li>Ao utilizarmos o Modifer para criação de um componente é preciso importar a interface modifer do compose.ui.</li>
    <li>Nas alterações de cores os atributos com unfocused vai ser quando para definir quando clicar nele já o focused é quando ele está em seu estado normal.</li>
    <li>Para definir parametros opcional, temos que colocar o devido atributo para receber a classe necessária, fazendo isso ele não será obrigatorio na chamada da função.</li>
    <li>Para definir o tipo de teclado que vai ser usado no input utilizamos o atributo "keyboardOptions", que vai ser modificado no "keyboardType".</li>
    <li>Se não definir valores de tamanho para input quando digitarmos demais ele pode alterar de tamanho se não estiver com as medidas definidas.</li>
</ol>
