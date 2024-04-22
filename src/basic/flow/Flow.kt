package basic.flow

//import kotlinx.coroutines.*
//import kotlinx.coroutines.flow.*
// Flow
//fun main()= runBlocking {
//
//    val number:Flow<Int> = flow{
//        emit(1)
//        emit(2)
//        emit(3)
//        emit(4)
//    }

//     number.collect{it->
//         println(it)
//     }

//     number.map{it*2}.collect{it->
//         println(it)
//     }

//        number.filter{it%2==0}.collect{it->
//            println(it)
//        }

//        number.flowOn(Dispatchers.IO).collect { println(it) }

//}

//State Flow

//fun main()= runBlocking{
//
//    val stateFlow = MutableStateFlow(0)
//    val readOnly : StateFlow<Int> = stateFlow
//
//    val job=launch(){
//
//        stateFlow.collect{it->
//            println(it)
//
//        }
//    }
//    stateFlow.value=1
//    stateFlow.value=2
//
//    job.cancel()
//
//}

//SharedFlow

//import kotlinx.coroutines.*
//import kotlinx.coroutines.flow.*
//
//fun main() {
//    val sharedFlow = MutableSharedFlow<Int>()
//
//    // Launch a coroutine to collect from the shared flow
//    CoroutineScope(Dispatchers.Default).launch {
//        sharedFlow.collect { value ->
//            println("Collected: $value")
//        }
//    }
//
//    // Emit values to the shared flow
//    runBlocking {
//        (1..5).forEach { value ->
//            sharedFlow.emit(value)
//        }
//    }
//
//    // Delay to allow the collector to finish
//    Thread.sleep(100)
//}


