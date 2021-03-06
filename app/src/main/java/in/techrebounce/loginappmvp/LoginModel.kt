package `in`.techrebounce.loginappmvp

interface LoginModel {

    fun validateUser(emailId: String, password: String)
}