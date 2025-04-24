import kotlinx.coroutines.*

// Coroutines are like lightweight threads that can be launched to perform some work asynchronously.
// Unlike threads, they are not tied to any specific thread in the underlying operating system.
// Instead, they are managed by a CoroutineDispatcher, which determines the thread or pool of threads they execute on.

@OptIn(DelicateCoroutinesApi::class)
fun main() {


    val job = runBlocking {
        val job1 = launch(Dispatchers.IO) {
            delay(1000L) //api calling
            println("Api fetched")

            println("launch thread: $${Thread.currentThread()}")
        }

        println("main method thread: $${Thread.currentThread()}")
        println("after launch")
        //job1.cancel()


        val job2 = async(Dispatchers.IO) {
            delay(1000L) //api calling
            println("async Api fetched")

            println("async thread: $${Thread.currentThread()}")
            5
        }

        val job3 = async(Dispatchers.IO) {
            delay(1000L) //api calling
            println("async Api fetched")

            println("async thread: $${Thread.currentThread()}")
            6
        }
        val data = listOf(job2, job3).awaitAll()
        println(data)

    }




}


