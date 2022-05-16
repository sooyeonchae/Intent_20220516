package net.soozip.intent_20220516

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnMoveToOther.setOnClickListener {
//            val myIntent = Intent(this, OtherActivity::class.java)
//            startActivity(myIntent)

            //현재 화면 종료 > 이전 화면이 다시 나타남
            finish()
        }

        btnSendMessage.setOnClickListener{

            //1. 입력한 내용을 변수에 저장
            val inputMessage = edtMessage.text.toString()
            //2. 메시지 보여주는 화면으로(1.의 변수를 들고) 이동.
            val myIntent = Intent(this, ViewMessageActivity::class.java)
            myIntent.putExtra("message",inputMessage)
            startActivity(myIntent)
        }

    }

}