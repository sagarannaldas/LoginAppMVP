package `in`.techrebounce.loginappmvp

class LoginModelImpl(param: Any?) : LoginModel {
    lateinit var loginPresenter: LoginPresenter

    fun LoginModelImpl(loginPresenter: LoginPresenter) {
        this.loginPresenter = loginPresenter
    }

    override fun validateUser(emailId: String, password: String) {
        TODO("Not yet implemented")
    }
}