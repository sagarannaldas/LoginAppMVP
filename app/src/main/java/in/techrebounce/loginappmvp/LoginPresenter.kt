package `in`.techrebounce.loginappmvp

interface LoginPresenter {
    fun onHandleLogin(emailId :String, password: String)
}