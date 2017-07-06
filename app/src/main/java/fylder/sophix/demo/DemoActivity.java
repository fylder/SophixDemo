package fylder.sophix.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DemoActivity extends AppCompatActivity {

    private TextView tv;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        initView();
    }

    private void initView() {
        tv = (TextView) findViewById(R.id.demo_text);
        button = (Button) findViewById(R.id.demo_btn);
        tv.setText("我是热修复的app");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DemoActivity.this, "我是热修复的app", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
