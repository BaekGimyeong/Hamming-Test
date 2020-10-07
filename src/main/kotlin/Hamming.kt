object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        var Hammingdistance = 0
        if(leftStrand.length != rightStrand.length) {
            diff(leftStrand1 = leftStrand , rightStrand1 = rightStrand)
            Hammingdistance++ until (Hammingdistance == diff() )
        }
    }
}
fun diff(leftStrand1: String, rightStrand1: String): Int {
    var value : Int = leftStrand1.length - rightStrand1.length
    return value
}
