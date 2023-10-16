open class Persona(protected var name: String, protected var age: Int) {

    open fun getName(): String{
        return name
    }

    open fun getAge(): Int{
        return age
    }

    open fun introducePersona(){
        println("Hola soy $name, y tengo $age años.")
    }
}