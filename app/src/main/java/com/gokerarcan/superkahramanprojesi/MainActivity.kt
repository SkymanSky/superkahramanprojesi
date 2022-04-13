package com.gokerarcan.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun superKahramanYap(view:View){

        val isim = isimText.text.toString()
        val yas = yasText.text.toString().toIntOrNull()
        val meslek =meslekText.text.toString()

        if(yas==null){
            sonucView.text="Doğru yaşı giriniz."
        }else{
            val superkahraman = SuperKahraman(isim, yas, meslek)

            sonucView.text ="İsim:${superkahraman.isim} Yaş:${superkahraman.yas} Meslek:${superkahraman.meslek}"

        }


    }
}