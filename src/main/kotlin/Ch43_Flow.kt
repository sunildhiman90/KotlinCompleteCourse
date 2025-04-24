import kotlinx.coroutines.*
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf

//A suspending function asynchronously returns a single value,
// but how can we return multiple asynchronously computed values? This is where Kotlin Flows come in

// Flow Builders
//1. flow:
//2. flowOf
//3. asFlow


fun simpleFlow() = flow {
    for (i in 1..3) {
        emit(i)
    }
}

fun simpleFlow2() = flowOf(4, 5, 6)

fun simpleFlow3() = listOf(7, 8, 9).asFlow()

@OptIn(DelicateCoroutinesApi::class)
fun main() {

    runBlocking {

        simpleFlow().collect {
            println(it)
        }

        simpleFlow2().collect {
            println(it)
        }

        simpleFlow3().collect {
            println(it)
        }
    }


}


/**
 * Use Cases
 * Fetching Data from Network: Use Flow to handle network requests and update the UI based on the emitted data.
 * Database Operations: Use Flow to observe database changes and react to updates.
 *
 */