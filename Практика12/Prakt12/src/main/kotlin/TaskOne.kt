import kotlinx.coroutines.*

class TaskOne {
    suspend fun main(){
        GlobalScope.launch {
            delay(1000L)
            InputAge()
        }
        InputName()
        runBlocking {
            delay(2000L)
        }
    }
    fun InputName()
    {
        try {
            print("Введите имя: ")
            var name = readln()!!.toString()
            println("Привет ${name}")
        }
        catch (ex: Exception)
        {
            println(ex.message)
        }
    }

    fun InputAge()
    {
        try{
        var age: Int
        do {
            print("Введите возраст: ")
            age = readln()!!.toInt()
        }while(age < 0)

        println("Ваш возраст ${age}")
        }
        catch (ex: Exception)
        {
            println(ex.message)
        }
    }
    fun printGroup()
    {
        println("\nВаша группа Пр-21")
    }
}

