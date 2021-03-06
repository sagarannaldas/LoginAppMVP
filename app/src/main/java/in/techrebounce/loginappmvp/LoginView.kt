package `in`.techrebounce.loginappmvp

interface LoginView {

     fun onSuccess()
     fun onFailure()
     fun onError(errorMessage: String)

}