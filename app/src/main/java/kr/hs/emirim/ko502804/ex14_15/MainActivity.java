package kr.hs.emirim.ko502804.ex14_15;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDialog = findViewById(R.id.btn_dilog);
        btnDialog.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(getApplicationContext());
            dialog.setTitle(R.string.dilog_title);
            dialog.setMessage(R.string.dilog_message);
            dialog.setIcon(R.drawable.p1);
            dialog.setPositiveButton(R.string.btn_alert, null);
            dialog.show();
        }
    };
}