package `in`.techrebounce.loginappmvp

class LoginPresenterImpl(mainActivity: MainActivity) : LoginPresenter {
    lateinit var loginView: LoginView
    lateinit var loginModel: LoginModel

    fun LoginPresenterImpl(loginView: LoginView) {
        this.loginView = loginView
        this.loginModel = LoginModelImpl(this)
    }

    override fun onHandleLogin(emailId: String, password: String) {
        TODO("Not yet implemented")
    }

    override fun onSuccess() {
        TODO("Not yet implemented")
    }

    override fun onFailure() {
        TODO("Not yet implemented")
    }

    override fun onError(errorMessage: String) {
        TODO("Not yet implemented")
    }
}