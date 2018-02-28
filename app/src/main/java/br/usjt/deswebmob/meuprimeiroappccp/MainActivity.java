package br.usjt.deswebmob.meuprimeiroappccp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String MENSAGEM = "br.usjt.deswebmob.meuprimeiroappccp"
    private View EditText_editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String mensagem = editText.getText().toString();
        Intent intent = new Intent(this, DisplayMensageActivity.class);
        intent.putExtra(MENSAGEM,mensagem);
        startActivity(intent);
    }
}
