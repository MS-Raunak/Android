package com.ms.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val arrContact = ArrayList<ContactModel>()
        arrContact.add(ContactModel(R.drawable.ic_launcher_background,"A","8809198023"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_foreground, "B", "8790124576"))
        arrContact.add(ContactModel(R.drawable.ic_launcher_background, "C", "8956091287"))

        recyclerV.layoutManager = LinearLayoutManager(this, )
    }
}