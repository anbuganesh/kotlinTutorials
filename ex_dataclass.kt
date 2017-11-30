

/*

In this example, are going to see about data classes.

We have two examples below.

laptop class declared with keyword data
and laptopNormal declared without the keyword.

We have println in main function of objects from these classes to understand the functionality

operator fun component1 and component2 is required for laptopNormal class to use destructure function.

*/


data class laptop(val brand : String, var price : Int)


class laptopNormal(val brand : String, var price : Int)
{
    operator fun component1(): Any {return brand}
    operator fun component2(): Any {return price}

}


fun main(args : Array<String>)
{

    var lap1 : laptop = laptop("dell",3000)
    var lap1Normal : laptopNormal = laptopNormal("delln",3000)

    println(lap1)
    println(lap1Normal)

    println(lap1.toString())
    println(lap1Normal.toString())

    //  Below is an example of destructuring  declarations.
    //  Happens automatically for data class
    // for laptopNormal class we have to define component1 and component2 manually
    //
    val(Brand, Price) = lap1

    println("$Brand price is $Price")

    val(brand, price) = lap1Normal

    println("$brand price is $price")
}