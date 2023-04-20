import java.awt.CardLayout

fun main() {
    var car1=Car("subaru","retain","KWX",75)
    car1.starts()
    println(car1.accelerate(45))
    println(car1.speed)

var person1=Person("ANN",45)
   // println(person1.talk("i am tall"))
    var  banker1=Banker("Joy",67)
    println(banker1.talk("i am a good person"))
    println(banker1.name)
}
class Car(var make:String, var model: String,var registration:String,var speed: Int ) {
    fun starts() {
        println("i am driving")
    }

    fun accelerate(acceleration: Int): Int {
        var speed = speed + acceleration
        return speed

    }
}

//inheritance
// there have some common factors .
 open class Person(var name:String,var age:Int){
    open fun talk( words:String):String{
        return words
    }

}
class Banker(name:String,age:Int):Person(name,age){
    override fun talk(words: String): String {
//        super.talk(words)
        return  words
    }


}
