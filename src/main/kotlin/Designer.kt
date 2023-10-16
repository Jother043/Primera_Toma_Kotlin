class Designer(name: String, age: Int) : Persona(name, age) {

    fun getNameFromDesigner(): String {
        return super.getName()
    }
    fun getAgeFromDesigner(): Int {
        return super.getAge()
    }

    override fun introducePersona() {
        println("Soy muy original, mi nombre es $name y soy diseñador")
    }

}