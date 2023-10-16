class Programmer(name: String, age:Int, private val _language: ProgrammingLanguage) : Persona(name, age) {
    private val _programsCreate: MutableList<String> = mutableListOf()

    val languages: String
        get() = _language.title

    override fun introducePersona() {
        println("Hola me llamo $name, y tengo $age, a demás soy programador especialista en ${_language.title} ")
    }

    fun createProgram(program : String){
        _programsCreate.add(program)
    }

    fun listPrograms(){
        if (_programsCreate.size != 0){
            println("No hay programas creados")
        }else{
            println("Los programas creados son: ")
            _programsCreate.forEach{
                println(it)
            }
        }
    }
}

enum class ProgrammingLanguage(val title: String){
    KOTLIN("Kotlin"),JAVA("Java"),CPP("C++")
}