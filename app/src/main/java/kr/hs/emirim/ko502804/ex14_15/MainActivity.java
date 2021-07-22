package kr.hs.emirim.ko502804.ex14_15;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    String[] fruitsArr = {"수박","메론","딸기"};
    boolean[] checkArr = {true, false, true};
    int[] imgsArr = {R.drawable.w1, R.drawable.m1, R.drawable.s1};
    Button btnFruits;
    ImageView imgV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDialog = findViewById(R.id.btn_dilog);
        Button btnFruits = findViewById(R.id.btn_fruits);
        btnDialog.setOnClickListener(btnListener);
        btnFruits.setOnClickListener(btnListener);
        imgV = findViewById(R.id.imgv);

    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_dilog:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(getApplicationContext());
                    dialog.setTitle(R.string.dilog_title);
                    dialog.setMessage(R.string.dilog_message);
                    dialog.setIcon(R.drawable.p1);
                    dialog.setPositiveButton(R.string.btn_alert, null);
                    dialog.show();

                case R.id.btn_fruits:
                    new AlertDialog.Builder(MainActivity.this)
                    .setTitle(R.string.btn_fruits)
                    .setIcon(R.drawable.w)
                            .setPositiveButton("닫기", null);
                    break;

            }
        }
    };
}