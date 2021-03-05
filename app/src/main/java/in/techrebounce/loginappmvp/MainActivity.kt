package `in`.techrebounce.loginappmvp

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var editTextUserName: EditText
    lateinit var editTextPassword: EditText
    lateinit var textViewSubmit: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViews()
        textViewSubmit.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                validateUser()
            }
        })
    }

    private fun validateUser() {
        var focusView: View? = null
        var cancel = false

        var username = editTextUserName.text.toString()
        var password = editTextPassword.text.toString()

        if (TextUtils.isEmpty(username)) {
            focusView = editTextUserName
            cancel = true
            Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show()
        } else if (TextUtils.isEmpty(password)) {
            focusView = editTextPassword
            cancel = true
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show()
        }

        if(cancel) {
            focusView?.requestFocus()
        } else {
            val intent = Intent(this@MainActivity,HomeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun bindViews() {
        editTextUserName = findViewById(R.id.editTextUserName)
        editTextPassword = findViewById(R.id.editTextPassword)
        textViewSubmit = findViewById(R.id.textViewSubmit)
    }
}