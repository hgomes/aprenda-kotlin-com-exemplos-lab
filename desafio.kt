// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel(val descricao: String) { 
    BASICO("Preparado para quem não tem experiência"), INTERMEDIARIO("Preparado para quem tem alguma experiência"), DIFICIL("Preparado para quem tem experiência") 
}

data class Usuario(val nome: String, val idade: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel?)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    
    caseTeste1();
    caseTeste2();
    
}

//Fazer uma matricula
fun caseTeste1() {
    
    val usuariohugo = Usuario("Hugo Gomes", 41)
    
    val modulo1Kotlin = ConteudoEducacional("Ciclo Básico de kotlin", 55,  Nivel.BASICO)
    val modulo2Kotlin = ConteudoEducacional("Ciclo Avançado de kotlin", 75, Nivel.DIFICIL)
    var conteudos = mutableListOf<ConteudoEducacional>(modulo1Kotlin, modulo2Kotlin)
    
    val formacao = Formacao("Formação de Kotlin", conteudos)
    
    formacao.matricular(usuariohugo)
    
    println("Matricula ok $formacao")
    
}

//Fazer uma segunda matricula
fun caseTeste2() {
    
    val usuarioIngles = Usuario("Peter Parker", 35)
    
    val modulo1Ingles = ConteudoEducacional("Básico de Ingles", 55,  Nivel.BASICO)
    val modulo2Ingles = ConteudoEducacional("Intermediario de Ingles", 75, Nivel.INTERMEDIARIO)
    val modulo3Ingles = ConteudoEducacional("Avançado de Ingles", 75, Nivel.DIFICIL)
    var conteudos = mutableListOf<ConteudoEducacional>(modulo1Ingles, modulo2Ingles, modulo3Ingles)
    
    val formacao = Formacao("Formação de Ingles", conteudos)
    
    formacao.matricular(usuarioIngles)
    
    println("Matricula ok $formacao")
}
