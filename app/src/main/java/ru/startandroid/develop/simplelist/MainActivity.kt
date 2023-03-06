package ru.startandroid.develop.simplelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private var names = arrayOf("Иван", "Марья", "Петр", "Антон", "Даша", "Борис",
        "Костя", "Игорь", "Анна", "Денис", "Андрей")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvMain = findViewById<ListView>(R.id.lvMain)

        val adapter = ArrayAdapter(this, R.layout.my_list_item, names)

        lvMain.adapter = adapter
        
    }
}