package com.erro;

import android.app.Activity;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ErrorActivity extends Activity {
   private Button btn;
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn=(Button)findViewById(R.id.btn);
      //在主线程(UI)执行耗时的操作时，界面无法响应输入事件，就会发生
        //ANR异常（大于6秒的行为）
        //ANR(Appliction not responding)应用无法响应
        btn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
			try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
    }
}