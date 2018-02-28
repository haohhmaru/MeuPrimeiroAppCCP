package br.usjt.deswebmob.meuprimeiroappccp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMensageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_mensage);
        Intent intent = getIntent();
        String mensagem = intent.getStringExtra(MainActivity.MENSAGEM);
        TextView textView = new TextView(this);
        textView.setText(mensagem);
        ViewGroup Layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);

    }


}
