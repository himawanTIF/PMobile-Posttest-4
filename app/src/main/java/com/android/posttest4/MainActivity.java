package com.android.posttest4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "mainactivity";
    private Button masuk, daftar;
    EditText username, passwd, re_passwd;
    CheckBox S_K;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate");
        Toast.makeText(MainActivity.this, "onCreate", Toast.LENGTH_SHORT).show();

        username = (EditText)findViewById(R.id.username);
        passwd = (EditText)findViewById(R.id.passwd);
        re_passwd = (EditText)findViewById(R.id.re_passwd);
        S_K = (CheckBox)findViewById(R.id.S_K);
        masuk = (Button)findViewById(R.id.masuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.length() == 0) {
                    Toast.makeText(getBaseContext(), "Username wajib diisi!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getBaseContext(), "Selamat Datang " + username.getText(), Toast.LENGTH_SHORT).show();
                }
                if (passwd.length() > 0){
                    if (!passwd.getText().toString().equals(re_passwd.getText().toString())){
                        Toast.makeText(getBaseContext(), "Pengulangan password tidak sama", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(getBaseContext(), "Password tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
                if (S_K.isChecked()){
                    Toast.makeText(getBaseContext(), "Terima Kasih telah setuju dengan Syarat dan Ketentuan", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getBaseContext(), "Anda harus setuju Syarat dan Ketentuan!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        daftar = (Button)findViewById(R.id.daftar);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.length() == 0) {
                    Toast.makeText(getBaseContext(), "Username wajib diisi!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getBaseContext(), "Selamat Bergabung " + username.getText(), Toast.LENGTH_SHORT).show();
                }
                if (passwd.length() > 0){
                    if (!passwd.getText().toString().equals(re_passwd.getText().toString())){
                        Toast.makeText(getBaseContext(), "Pengulangan password tidak sama", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(getBaseContext(), "Password tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
                if (S_K.isChecked()){
                    Toast.makeText(getBaseContext(), "Terima Kasih telah setuju dengan Syarat dan Ketentuan", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getBaseContext(), "Anda harus setuju Syarat dan Ketentuan!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");

        Toast.makeText(MainActivity.this, "Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");

        Toast.makeText(MainActivity.this, "Resume", Toast.LENGTH_SHORT).show();
    }
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");

        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");

        Toast.makeText(MainActivity.this, "Destroy", Toast.LENGTH_SHORT).show();
    }
}
