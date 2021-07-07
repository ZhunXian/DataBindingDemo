package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingdemo.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson :Person = Person("Ali", "12345", "ali@gmail.com", "12 Jalan Ali")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.personData = aPerson
//        binding.txtName.text = aPerson.name
//        binding.txtNric.text = aPerson.ic
//        binding.txtEmail.text = aPerson.email
//        binding.txtAddress.text = aPerson.address

        binding.btnUpdate.setOnClickListener() {
                aPerson.email = "abu@gmail.com"
                aPerson.address = "123 Jalan Abu"
                binding.apply { invalidateAll() }
        }
    }
}