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
      //�����߳�(UI)ִ�к�ʱ�Ĳ���ʱ�������޷���Ӧ�����¼����ͻᷢ��
        //ANR�쳣������6�����Ϊ��
        //ANR(Appliction not responding)Ӧ���޷���Ӧ
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