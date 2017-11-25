//ID dari aplikasi
package com.example.iakbeginner;

//import import library
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//class
public class MainActivity extends AppCompatActivity {

    EditText editUsername;
    EditText editPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //METHOD
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hitungUmur(2000, 2017, "Derah"); //methodnya sudah dieksekusi
        int umurSaya = hitungUmur(2000, 2017); //umurSaya = 17

        // koneksikan view dengan java
        editUsername = (EditText) findViewById(R.id.editUsername);
        editPassword = (EditText) findViewById(R.id.editPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        //memberikan action ke tombol login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editUsername.getText().toString();
                String password = editPassword.getText().toString();

                if(username.equals("")){
                    //JIKA username kosong
                    Toast.makeText(
                            MainActivity.this,
                            "Username harus diisi",
                            Toast.LENGTH_LONG)
                            .show();
                }else if(password.equals("")){
                    //jika password kosong
                    Toast.makeText(
                            MainActivity.this,
                            "Password harus diisi",
                            Toast.LENGTH_LONG)
                            .show();
                }else{
                    //jika username dan password TIDAK kosong.
                    //String inputResult = username + " " + password;

                    //Toast.makeText(
                    //    MainActivity.this,
                      //  inputResult,
                       // Toast.LENGTH_LONG)
                       // .show();

                    // mengirim data username dan password ke activity yang kedua
                    // menampilkan activity kedua
                    // intent --> media untuk berpindah ke suatu activity
                    Intent nextActivity = new Intent(MainActivity.this, Main2Activity.class);
                    nextActivity.putExtra("username", username);
                    nextActivity.putExtra("password", password);
                    startActivity(nextActivity);

                }

            }
        });
    }

    // akses type nama (parameter) {  }
    // akses --> protected, private, public
    // type --> void --> type method yang tidak membalikkan nilai
    // nama --> camel case & tanpa spasi

    private void hitungUmur(int tahunLahir, int tahunSekarang, String namaSaya){
        // int, String, dll --> TIPE DATA
        // int --> merupakan type data untuk menyimpan nilai angka 0 - 9
        // String --> menyimpan nilai dalama bentuk text

        int umur = tahunSekarang - tahunLahir;
    }

    private int hitungUmur(int tahunLahir, int tahunSekarang){
        // int, String, dll --> TIPE DATA
        // int --> merupakan type data untuk menyimpan nilai angka 0 - 9
        // String --> menyimpan nilai dalama bentuk text

        int umur = tahunSekarang - tahunLahir;

        return umur; //membalikkan nilai
    }

}
