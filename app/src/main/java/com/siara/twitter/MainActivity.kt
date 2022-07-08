package com.siara.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.Contacts
import com.siara.twitter.databinding.ActivityMainBinding
import com.twitterAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaytweet()
    }
    fun displaytweet(){
        var contact = Contacts("Siara","@matakwamatakwa@gmail.com","1/2/2022"," ")
        var contact2 = Contacts("Anota","@matakwa@gmail.com","6/2/2000"," ")
        var contact3 = Contacts("Anota","@matakwa@gmail.com","11/2/2023"," ")
        var contact4 = Contacts("Anota","@matakwa@gmail.com","10/2/2022"," ")
        var contact5 = Contacts("Anota","@matakwa@gmail.com","11/2/2022"," ")
        var contactList = listOf(contact,contact2,contact3,contact4,contact5)

        var contactAdapter = twitterAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter
    }
}