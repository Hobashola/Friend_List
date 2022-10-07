package com.hobashola.friendlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayadapter: ArrayAdapter<*>
        val users = arrayOf(
            "Yusuf Ajani", "Mardhiyyah Yusuf", "Balqis Isiaq", "Halimat Saadu", "Obashola Ayinde",
        "Hassanah Kamal", "Balqis Mahmud", "Balqis Kolawole", "Hamdat Saadu", "Shakirat Saadu"

        )
        var mListView = findViewById<ListView>(R.id.friend)
        arrayadapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayadapter
    }
}