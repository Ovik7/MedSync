package com.example.medsync

//import com.google.firebase.database.DatabaseReference
//import com.google.firebase.database.FirebaseDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_main)
//        val database = FirebaseDatabase.getInstance()
//        val myRef = database.getReference("message")

//        myRef.setValue("Привет")
    }
}
//
//fun writeHelloToFirebase() {
//    // Get an instance of DatabaseReference
//    val database: DatabaseReference = FirebaseDatabase.getInstance().reference
//
//    // Use setValue() to save "Hello" to a specified reference
//    database.child("messages").child("greeting").setValue("Hello")
//}
