package com.hm.odev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)
        val clearButton: Button = findViewById(R.id.clearButton)
        val diceImg1 : ImageView = findViewById(R.id.diceImg)
        val diceImg2 : ImageView = findViewById(R.id.diceImg2)
        diceImg1.setImageResource(R.drawable.empty_dice)
        diceImg2.setImageResource(R.drawable.empty_dice)

        val zar1 = Zar(R.drawable.dice_1)
        val zar2 = Zar(R.drawable.dice_2)
        val zar3 = Zar(R.drawable.dice_3)
        val zar4 = Zar(R.drawable.dice_4)
        val zar5 = Zar(R.drawable.dice_5)
        val zar6 = Zar(R.drawable.dice_6)


        rollButton.setOnClickListener {

            val toast = Toast.makeText(this, "Zar Atıldı!", Toast.LENGTH_SHORT)
            toast.show()

            val rand1 = (1..6).random()
            val rand2 = (1..6).random()

            when(rand1){
                1 -> diceImg1.setImageResource(zar1.img)
                2 -> diceImg1.setImageResource(zar2.img)
                3 -> diceImg1.setImageResource(zar3.img)
                4 -> diceImg1.setImageResource(zar4.img)
                5 -> diceImg1.setImageResource(zar5.img)
                6 -> diceImg1.setImageResource(zar6.img)
            }

            when(rand2){
                1 -> diceImg2.setImageResource(zar1.img)
                2 -> diceImg2.setImageResource(zar2.img)
                3 -> diceImg2.setImageResource(zar3.img)
                4 -> diceImg2.setImageResource(zar4.img)
                5 -> diceImg2.setImageResource(zar5.img)
                6 -> diceImg2.setImageResource(zar6.img)
            }


        }

        clearButton.setOnClickListener {

            val toast = Toast.makeText(this, "Temizlendi", Toast.LENGTH_SHORT)
            toast.show()

            diceImg1.setImageResource(R.drawable.empty_dice)
            diceImg2.setImageResource(R.drawable.empty_dice)
        }



    }
}


//Selam arkadaşlar ödevinizi buradan takip edebilirsiniz!
//
//Basic bir zar uygulaması yapılacak
//
//Basıldığında tepki veren 2 tuş bulunacak
//# Her düğme için bir tane olmak üzere iki tıklama işleyici ayarlamalıdır.
//# 1. Tuşun üzerinde  ZAR AT yazılacak ve basıldığında rastgele 2 zar atacak (2 zar da her atıldığında aynı değeri göstermemeli) zarlar image olarak ekranda gösterilecek
//# 2. Tuş üzerinde  TEMİZLE  yazılacak ve basıldığında ekranı temizleyecek veya üstünde değer olmayan zarları gösterecek
//# Zar kullanımında when yapısı kullanılacak
//# Ödev yüklerken github link kullanılacak
//
//Optional eklentiler (Bunlar isteğe bağlı eklentilerdir sizi geliştirmekte çok yardımcı olacaktır araştırmanızda fayda)
//
//* Zar adında bir class oluşturup bu uygulamayı çalıştırın
//* ZAR AT tuşuna basıldığında  alt kısımda zar atıldı yazan bir  penceresi açılacak (Toast yapısı)
//* Backgrounda istenen bir image konulacak Ekranı kaplayacak şekilde
//
//P.S. Kullanacağınız zar ımagelerini dosyaya ekledim, bu dosyaları kullanabilirsiniz.