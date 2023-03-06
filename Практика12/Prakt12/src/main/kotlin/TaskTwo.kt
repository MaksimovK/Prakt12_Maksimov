import kotlinx.coroutines.*

class TaskTwo {
    var block = false
    var listRep = mutableSetOf<Pair<String, Int>>()
    suspend fun main() {
        GlobalScope.launch {
        }
        inputDate()
        runBlocking {
            delay(5000L)
        }
    }

    fun inputDate() {
        try {
            var countRep: Int
            print("Введите имя пользователя: ")
            var login = readln()!!.toString()
            print("Введите пароль: ")
            var password = readln()!!.toString()
            do {
                print("Введите кол-во репрозиториев: ")
                countRep = readln()!!.toInt()
            } while (countRep < 0)
            listRep.add(login to countRep)
        } catch (ex: Exception) {
            println(ex.message)
        }
    }

    fun IsBlock(block: Boolean) {
        while (block == false) {
            println("Заблокировано. Введите 'Загрузить участников'")
            var input = readLine()!!
            if (input == "Загрузить участников") {
                break
            }
        }
    }
}