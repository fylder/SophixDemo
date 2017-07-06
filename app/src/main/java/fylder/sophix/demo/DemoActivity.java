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
        tv = (TextView) findViewById(R.id.demo_text);
        button = (Button) findViewById(R.id.demo_btn);
        ahh();
    }

    private void ahh() {
        tv.setText("一箭倾心GMK");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DemoActivity.this, "要买呢，还是买呢，还是买呢", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
