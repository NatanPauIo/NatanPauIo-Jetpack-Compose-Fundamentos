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
    <li>Nome de funções que vão criar interface grafica é necessario começar com letras maiusculas.</li>
    <li>Os componentes do Jetpack Compose também vão ser funções.</li>
    <li>Para renderizar os componentes é necessario chamar funções do metodo setContet.</li>
</ol>