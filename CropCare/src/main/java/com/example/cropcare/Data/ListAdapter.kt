package com.example.cropcare.Data

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView




import com.example.cropcare.R


class ListAdapter(private val context :Activity,private val arrayList: ArrayList<Treatments>): ArrayAdapter<Treatments>(context,
    R.layout.list_item,arrayList){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item,null)

        val pest : TextView = view.findViewById(R.id.pest)
        val status :TextView = view.findViewById(R.id.status)
        val date : TextView = view.findViewById(R.id.date)
        val level : TextView = view.findViewById(R.id.level)
        val name: TextView = view.findViewById(R.id.name)
        val treatment: TextView = view.findViewById(R.id.treatment)

        pest.text = arrayList[position].pest
        status.text = arrayList[position].status
        date.text = arrayList[position].date + " ago"
        level.text = arrayList[position].level
        name.text = arrayList[position].name
        treatment.text = arrayList[position].product




        return view
    }
}