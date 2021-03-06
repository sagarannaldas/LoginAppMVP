package `in`.techrebounce.loginappmvp

import android.text.TextUtils

class LoginModelImpl(loginPresenter: LoginPresenter) : LoginModel {
    var loginPresenter: LoginPresenter

    init {
        this.loginPresenter = loginPresenter
    }

    override fun validateUser(emailId: String, password: String) {

        if(TextUtils.isEmpty(emailId)) {
            loginPresenter.onError("please enter emailId")
        } else if (!emailId.equals("xyz@gmail.com",  true)) {
            loginPresenter.onError("Please enter valid emailId")
        } else if (TextUtils.isEmpty(password)) {
            loginPresenter.onError("Please enter password")
        } else if(password.equals("12345",true)) {
            loginPresenter.onError("Please Enter valid Password")
        } else {
            loginPresenter.onSuccess()
        }


    }
}