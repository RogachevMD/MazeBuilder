var sizeX: Int = 11
var sizeY: Int = 11


fun main(args: Array<String>) {
    init(args)


}

fun init(args: Array<String>) {
    if (args.size != 0) {
        for (i in args.indices) {
            println("arg$i: ${args[i]}")
            sizeX = args[i].toInt()

        }
    }

    if (args.size == 0) {
        println("No args")
    } else {
        for (i in args.indices){

        }
    }
}