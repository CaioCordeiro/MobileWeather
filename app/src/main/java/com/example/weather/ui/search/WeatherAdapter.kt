package com.example.weather.ui.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.weather.R
import com.example.weather.WeatherItem
import kotlinx.android.synthetic.main.weather_item.view.*

class WeatherAdapter(private val weatherList: List<WeatherItem>): RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>() {
    override fun onCreateViewHolder ( parent: ViewGroup, viewType: Int) : WeatherViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.weather_item, parent, false)
        return WeatherViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        val currentItem = weatherList[position]

        // TODO: Get image from API
        //holder.image_view.setImageResource(IMAGE)
        holder.cityName.text = currentItem.cityName
        holder.temperature.text = currentItem.temperature.toString()
    }

    override fun getItemCount() = weatherList.size

    class WeatherViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val imageView: ImageView = itemView.image_view
        val cityName: TextView = itemView.cityName
        val temperature: TextView = itemView.temperature
    }

}