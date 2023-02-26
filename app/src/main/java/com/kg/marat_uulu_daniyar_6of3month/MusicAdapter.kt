package com.kg.marat_uulu_daniyar_6of3month

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.kg.marat_uulu_daniyar_6of3month.databinding.ItemMusicListBinding

class MusicAdapter(
    val musicList: ArrayList<Music>,
    val onItemClick: (position: Int) -> Unit
    ): Adapter<MusicAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicListBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = musicList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    inner class ViewHolder(private val binding: ItemMusicListBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val music = musicList[adapterPosition]
            binding.apply {
                tvNum.text = music.positionOfMusic
                tvMusicName.text = music.nameOfMusic
                tvMusicPlayer.text = music.playerOfMusic
                tvMusicDuration.text = music.durationOfMusic
            }
            itemView.setOnClickListener {
                onItemClick(adapterPosition)
            }

        }
    }
}
