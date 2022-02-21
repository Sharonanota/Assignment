fun main(){
    username("Sharon")
    modules(30,50)
    add(32,70,56,40)
    myFact()

}

fun username(name:String){
    println ("hello my name is" +name)
}
fun modules(e:Int, f:Int){
    var modules= e%f
    println(modules)
}
fun add(a:Int, b:Int, c:Int, d:Int){
    var sum=(a+b+c+d)
    println(sum)
}
fun myFact(){
    println("I'm nice")
}