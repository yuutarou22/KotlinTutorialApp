package com.example.kotlintutorial

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

// AppCompatActivity を継承した MainActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var num = 0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        toast_button.setOnClickListener { view ->
            Toast.makeText(applicationContext, "現在の値は、" + num_text.getText().toString() + "です", Toast.LENGTH_SHORT).show()
        }

        count_button.setOnClickListener { view ->
            num = num_text.getText().toString().toInt()
            num++
            num_text.setText(num.toString())
        }

        random_button.setOnClickListener { view ->
            num = (Math.random() * 1000).toInt()
            num_text.setText(num.toString())
        }

        fab.setOnClickListener {view ->
            Toast.makeText(applicationContext, "押してくださいましたね…", Toast.LENGTH_SHORT).show()

            /**Java ver
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
             */

            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
    }

    // 画面右上に配置されるオプションメニューを作成する
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    // 画面右上のオプションメニューの要素を選択した時に呼ばれる
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // whenはswitch文のようなもの。Javaとは異なり、String比較出来る。
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
