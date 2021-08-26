package com.example.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmation.adapter.ItemAdapter
import com.example.affirmation.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mydataset = Datasource().loadAffirmations()
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this,mydataset)
        //To increase performance we can use recyclerview.sethasfixedsize
        recyclerView.setHasFixedSize(true)

    }
}