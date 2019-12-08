package com.tjoeun.a20191208_02_intent04_application

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.invoke.CallSite

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialBtn.setOnClickListener {
//            누구에게 전화를 걸지 정보를 미리 명시.
            val uri = Uri.parse("tel:01051123237")
//            어느 화면에 넘겨줄지 명시
            val intent = Intent(Intent.ACTION_DIAL,uri)
            startActivity(intent)
        }

        callBtn.setOnClickListener {
            var num="01023232323"
            val uri=Uri.parse("tel:${num}")
            val intent=Intent(Intent.ACTION_CALL,uri)
            startActivity(intent)
        }

        smsBtn.setOnClickListener {
//            누구에게 문자를 보낼지 uri로 명시

            val uri = Uri.parse("smsto:${smsNumEdt.text.toString()}")

            val intent = Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("sms_body","광고 문구 입력하자")
            startActivity(intent)
        }

        naverBtn.setOnClickListener {
            val uri = Uri.parse("https://naver.com")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }

    }
}
