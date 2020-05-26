package sg.edu.rp.c346.id19047433.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FouthActivity extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fouth);
        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        double Value = intentReceived.getDoubleExtra("double",99.99);
        tvAnswer.setText("Double Value received is : " + Value);
    }
}
