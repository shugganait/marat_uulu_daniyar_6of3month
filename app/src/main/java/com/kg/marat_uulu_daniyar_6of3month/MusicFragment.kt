package com.kg.marat_uulu_daniyar_6of3month

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kg.marat_uulu_daniyar_6of3month.databinding.FragmentMusicBinding

class MusicFragment : Fragment() {
    private lateinit var binding: FragmentMusicBinding
    private var musicList = arrayListOf(
        Music("1", "Sheker", "Darkhan Juzz", "3:37"),
        Music("2", "Erikpe", "Darkhan Juzz", "3:12"),
        Music("3", "Сердца из железа", "Скриптонит", "3:05"),
        Music("4", "Пламенный свет", "Макс Корж", "3:55"),
        Music("5", "Улицы ждали", "Zoloto", "3:33"),
        Music("6", "Spicks And Specks", "Bee Gees", "2:52"),
        Music("7", "Clementine Suite", "Jared Emerson-Johnson", "7:05"),
        Music("8", "Slow Mo", "Armich, Скриптонит", "3:15"),
        Music("9", "КПСП", "Gruppa Skryptonite", "3:27"),
        Music("10", "Natural Blues", "Moby", "4:14"),
        Music("11", "Maniac", "Michael Sambello", "4:05"),
        Music("12", "Tom's Diner", "Suzanne Vega", "2:13"),
        Music("13", "Civilian", "Wye Oak", "3:41"),
        Music("14", "Партизан", "Баста", "2:42"),
        Music("15", "Suicidal Thoughts", "The Notorious B.I.G", "2:50"),
        Music("16", "That's my nigga Fo'Real", "Young Zee", "4:46"),
        Music("17", "Adrenaline Rush", "Obie Trice", "3:49"),
        Music("18", "Рэп", "Скриптонит", "2:58"),
        Music("19", "Балуюсь", "ИК", "5:02"),
        Music("20", "Ezio's Family", "Jesper Kyd", "3:58"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MusicAdapter(musicList, this::onItemClick)
        binding.rvMusicList.adapter = adapter
    }

    private fun onItemClick (position: Int){
        val music = musicList[position]
        val intent = Intent(activity, SecondActivity::class.java)
        intent.putExtra("name",  music.nameOfMusic)
        intent.putExtra("player", music.playerOfMusic)
        startActivity(intent)
    }
}
