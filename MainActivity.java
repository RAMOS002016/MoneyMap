package com.example.moneymap;

     import android.os.Bundle;
     import android.view.View;
     import android.widget.Button;
     import android.widget.TextView;
     import androidx.appcompat.app.AppCompatActivity;
     import androidx.fragment.app.FragmentManager;
     import androidx.fragment.app.FragmentTransaction;

     public class MainActivity extends AppCompatActivity {
         private Button btnPerfil, btnFotos, btnVideo, btnWeb, btnBotones;
         private TextView tvContent;

         @Override
         protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_main);

             btnPerfil = findViewById(R.id.btnPerfil);
             btnFotos = findViewById(R.id.btnFotos);
             btnVideo = findViewById(R.id.btnVideo);
             btnWeb = findViewById(R.id.btnWeb);
             btnBotones = findViewById(R.id.btnBotones);
             tvContent = findViewById(R.id.tvContent);

             btnPerfil.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     tvContent.setText("Perfil seleccionado");
                 }
             });
         }
     }