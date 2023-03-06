import kotlinx.coroutines.*

suspend fun main() = coroutineScope<Unit> {
    val taskOne = TaskOne()
    var count: Int

    do {
        print("Введите кол-во повторений: ")
        count = readln()!!.toInt()
    } while (count < 0)
    for (i in 1..count) {
        GlobalScope.launch {
            taskOne.InputName()
            taskOne.InputAge()
            delay(3000L)
        }
        taskOne.printGroup()
        runBlocking {
            delay(10000L)
        }
    }
    var taskTwo = TaskTwo()
    try {
        var countRep: Int
        do {
            print("Введите кол-во репрозиториев: ")
            countRep = readln()!!.toInt()
        } while (countRep < 0)

        for (i in 1..countRep) {
            GlobalScope.launch {
                taskTwo.inputDate()
                delay(10000L)
            }
            runBlocking {
                taskTwo.IsBlock(true)
                delay(10000L)
            }
        }
        println("${taskTwo.listRep.sortedBy {countRep}}")
        println("${taskTwo.listRep.maxBy {countRep}}")
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}
