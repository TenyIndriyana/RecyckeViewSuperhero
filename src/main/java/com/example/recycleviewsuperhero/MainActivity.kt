package com.example.recycleviewsuperhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.denki,
                "Denki Kaminari",
                "Denki Kaminari juga dikenal sebagai Stun Gun Hero: Chargebolt" +
                        "(Sutan Gan Hīrō Chājizuma) adalah siswa Kelas 1-A di U.A. High School, berlatih untuk menjadi Pro Hero"
            ),
            Superhero(
                R.drawable.izuku,
                "Izuku Midoriya",
                "Izuku Midoriya juga dikenal dengan nama pahlawannya Deku adalah seorang pahlawan super dan" +
                        "protagonis utama dari serial manga My Hero Academia,yang dibuat oleh Kōhei Horikoshi"
            ),
            Superhero(
                R.drawable.katsuki,
                "Katsuki Bakugo",
                "Katsuki Bakugo juga dikenal sebagai Kacchan oleh teman-teman masa kecilnya dan" +
                        "pahlawannya bernama Great Explosion Murder God Dynamight adalah seorang siswa di Kelas 1-A di U.A. SMA," +
                        "pelatihan untuk menjadi Pro Hero. Dia adalah deuteragonist dari seri"
            ),
            Superhero(
                R.drawable.megumi,
                "Megumi Fushiguro",
                "Megumi Fushiguro Dia adalah siswa tahun pertama di Tokyo Jujutsu High dan juga" +
                        "keturunan dari keluarga Zenin, Megumi ingin membantu melindungi orang yang dia anggap baik atau baik"
            ),
            Superhero(
                R.drawable.inumaki,
                "Toge Inumaki",
                "Toge Inumaki adalah karakter pendukung dalam seri Jujutsu Kaisen." +
                        "Dia adalah keturunan dari Keluarga Inumaki yang mewarisi teknik pidato terkutuk yang langka dan kuat." +
                        "Toge adalah siswa kelas dua di SMA Jujutsu Tokyo bersama Yuta, Maki, dan Panda"
            ),
            Superhero(
                R.drawable.gojo,
                "Satoru Gojo",
                "Satoru Gojo adalah salah satu protagonis utama dari Jujutsu Kaisen." +
                        "Dia adalah penyihir jujutsu kelas khusus dan seorang guru di Tokyo Jujutsu High," +
                        "Gojo telah mengenakan perban di matanya daripada penutup matanya yang sederhana"
            ),
            Superhero(
                R.drawable.itadori,
                "Yuji Itadori",
                "Yuji Itadori adalah protagonis utama dari seri Jujutsu Kaisen." +
                        "Dia adalah anak dari Jin Itadori dan cucu dari Wasuke Itadori yang hidup normal" +
                        "sampai dia bertemu Megumi dan memakan salah satu jari Sukuna. Setelah menjadi kapal Sukuna," +
                        "Yuji mulai bersekolah di SMA Jujutsu Tokyo bersama Megumi dan Nobara sebagai siswa tahun pertama"
            ),
            Superhero(
                R.drawable.goku,
                "Son Goku",
                "Son Goku adalah seorang Saiyan yang dibesarkan di Bumi dan" +
                        "protagonis utama keseluruhan dari seri Dragon Ball." +
                        "Kakarot awalnya dikirim untuk menghancurkan Bumi saat masih bayi," +
                        "disana ia akan diadopsi oleh Kakek Gohan yang menamainya Son Goku"
            ),
            Superhero(
                R.drawable.luffy,
                "Monkey D Luffy",
                "Monkey D. Luffy juga dikenal sebagai \"Topi Jerami\" Luffy," +
                        "adalah karakter fiksi dan protagonis utama dari seri manga One Piece," +
                        "yang dibuat oleh Eiichiro Oda. Luffy memulai debutnya di One Piece Chapter #1" +
                        "sebagai anak laki-laki yang memperoleh sifat karet setelah secara tidak sengaja" +
                        "memakan Buah Gum-Gum supernatural, salah satu Buah Iblis"
            ),
            Superhero(
                R.drawable.shoto,
                "Shoto Todoroki",
                "Shoto Todoroki juga dikenal dengan mononim Shoto adalah superhero dan" +
                        "salah satu protagonis utama dari serial manga My Hero Academia," +
                        "yang dibuat oleh Kōhei Horikoshi. Menjadi satu-satunya anak yang mewarisi kebiasaan baik Endeavour dan" +
                        "Rei, Shoto sering dipisahkan dari saudara-saudaranya"
            ),
            Superhero(
                R.drawable.tsuyu,
                "Tsuyu Asui",
                "Tsuyu adalah gadis pendek dengan tubuh ramping, Tsuyu telah membuktikan dirinya sebagai" +
                        "individu yang sangat cakap. Menggunakan kemampuan berbasis katak yang diberikan oleh Quirk-nya," +
                        "Tsuyu memiliki kemampuan dalam pertarungan jarak dekat dan jarak jauh"
            ),
            Superhero(
                R.drawable.nobara,
                "Nobara Kugisaki",
                "Nobara Kugisaki adalah tritagonis dari seri Jujutsu Kaisen." +
                        "Dia adalah siswa tahun pertama dan penyihir jujutsu kelas 3 di Tokyo Jujutsu High" +
                        "belajar di bawah Satoru Gojo bersama Yuji dan Megumi," +
                        "Nobara adalah wanita muda yang percaya diri dan kurang ajar dengan karakter yang tak tergoyahkan." +
                        "Lebih dari segalanya, Nobara bertekad untuk tetap setia pada dirinya sendiri apa pun yang terjadi"
            )
        )

        val RecyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        RecyclerView.layoutManager = LinearLayoutManager(this)
        RecyclerView.setHasFixedSize(true)
        RecyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}