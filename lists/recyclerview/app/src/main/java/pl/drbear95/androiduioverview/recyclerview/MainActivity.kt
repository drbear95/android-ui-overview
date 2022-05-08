package pl.drbear95.androiduioverview.recyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = SampleAdapter()
        listView.adapter = adapter
    }

    private class SampleAdapter :
        RecyclerView.Adapter<SampleAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val textView1 = view.findViewById<TextView>(R.id.sample_text_1)
            val textView2 = view.findViewById<TextView>(R.id.sample_text_2)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.sample_list_view, parent, false)

            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.textView1.text = "Przykładowy tekst 1"
            holder.textView2.text = "Przykładowy tekst 2"
        }

        override fun getItemCount(): Int {
            return 100
        }
    }
}