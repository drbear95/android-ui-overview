package pl.drbear95.androiduioverview.listview

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        val listView = findViewById<ListView>(R.id.list_view)
        val adapter = SampleAdapter(this)
        listView.adapter = adapter
    }

    private class SampleAdapter(private val context: Context): BaseAdapter(){
        override fun getCount(): Int {
            return 100
        }

        override fun getItem(position: Int): Any {
            return 1
        }

        override fun getItemId(position: Int): Long {
            return 1.toLong()
        }

        @SuppressLint("ViewHolder")
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            return LayoutInflater.from(context).inflate(R.layout.sample_list_view, parent, false).apply {
                val textView1 = findViewById<TextView>(R.id.sample_text_1)
                val textView2 = findViewById<TextView>(R.id.sample_text_2)

                textView1.text = "Przykładowy tekst 1"
                textView2.text = "Przykładowy tekst 2"
            }
        }
    }
}