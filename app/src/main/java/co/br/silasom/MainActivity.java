package co.br.silasom;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aEmpresa(View v){
        Intent empresa = new Intent(getApplicationContext(), AEmpresa.class);
        startActivity(empresa);
    }

    public void projetos(View v){
        Intent projetos = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("https://www.facebook.com/pg/SILASOM-ACESSÓRIOS-569757643137516/photos/");
        projetos.setData(uri);
        startActivity(projetos);
    }

    public void verMapa(View v){
        Intent mapa = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("https://goo.gl/maps/Ehu1zj5JTVs");
        mapa.setData(uri);
        startActivity(mapa);
    }

    public void ligar(View v){
        Intent ligar = new Intent(Intent.ACTION_DIAL);
        Uri uri = Uri.parse("tel://+553134942999");
        ligar.setData(uri);
        startActivity(ligar);
    }

    public void facebook(View v){
        Intent facebook = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("https://www.facebook.com/SILASOM-ACESS%C3%93RIOS-569757643137516/");
        facebook.setData(uri);
        startActivity(facebook);
    }

    public void whatsapp(View v){
        Intent whataspp = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("https://api.whatsapp.com/send?phone=5531984025616&text=Ol%C3%A1%2C%20gostaria%20de%20informa%C3%A7%C3%B5es%20sobre%20produtos%20e%20servi%C3%A7os%20da%20Silasom.");
        whataspp.setData(uri);
        startActivity(whataspp);
    }

}
