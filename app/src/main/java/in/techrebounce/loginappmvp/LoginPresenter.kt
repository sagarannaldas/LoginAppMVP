package `in`.techrebounce.loginappmvp

interface LoginPresenter {
    fun onHandleLogin(emailId :String, password: String)
    fun onSuccess()
    fun onFailure()
    fun onError(errorMessage: String)
}