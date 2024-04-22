package basic.sealedclass

import javax.xml.crypto.Data

//sealed class Response {
//    class loading:Response()
//    class sucess(val data:String):Response()
//
//    class error(val message:String):Response()
//}

//sealed class Response(val data: Data? = null, val errorMessage: String? = null) {
//
//    class Loading : Response()
//
//    class Succes(data: Data?) : Response(data = data)
//
//    class Error(errorMessage: String?) : Response(errorMessage = errorMessage)
//}

sealed class Response<T>(val data: Data? = null, val errorMessage: String? = null) {

    class Loading<T> : Response<T>()

    class Succes<T>(data: Data?) : Response<T>(data = data)

    class Error<T>(errorMessage: String?) : Response<T>(errorMessage = errorMessage)
}
