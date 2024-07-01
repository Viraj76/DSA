package kotlin_practices
/*
difference between enum and sealed is that , lies in the instance creation
we can have flexible data in the instances of sealed but not in enum
 */
enum class Days(name : String) {
    Sunday("viraj"),
    Monday("viraj")     // must pass namae
}

sealed class DaySealed(viraj: String){

    data class Sunday(val viraj: String) : DaySealed("viraj")

    // we can create instances with flexibility

}

fun name(){

}
