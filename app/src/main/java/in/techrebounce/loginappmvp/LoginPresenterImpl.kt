package `in`.techrebounce.loginappmvp

class LoginPresenterImpl(loginView: LoginView) : LoginPresenter {
     var loginView: LoginView
     var loginModel: LoginModel

    init {
        this.loginView = loginView
        this.loginModel = LoginModelImpl(this)
    }

    override fun onHandleLogin(emailId: String, password: String) {
        loginModel.validateUser(emailId, password)
    }

    override fun onSuccess() {
        loginView.onSuccess()
    }

    override fun onFailure() {
        TODO("Not yet implemented")
    }

    override fun onError(errorMessage: String) {
        loginView.onError(errorMessage)
    }
}