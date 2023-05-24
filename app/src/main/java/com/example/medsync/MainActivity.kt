package com.example.medsync

//import com.google.firebase.database.DatabaseReference
//import com.google.firebase.database.FirebaseDatabase
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_auth)


    }
    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello, Toast!" , Toast.LENGTH_SHORT)

        myToast.show()
    }
//        val database = FirebaseDatabase.getInstance()
//        val myRef = database.getReference("message")

//        myRef.setValue("Привет")

}
//
//fun writeHelloToFirebase() {
//    // Get an instance of DatabaseReference
//    val database: DatabaseReference = FirebaseDatabase.getInstance().reference
//
//    // Use setValue() to save "Hello" to a specified reference
//    database.child("messages").child("greeting").setValue("Hello")
//}
