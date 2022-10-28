package br.com.etecia.foodfast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //inserindo o Menu na barra de aplicativos
    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.personalizei, menu);
        return super.onCreatePanelMenu(featureId, menu);

    }

    //criando o metodo para clilar nos itens do menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mAmor:
                Toast.makeText(getApplicationContext(),
                        "AMOR DA MINHA VIDA?",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mVoltar:
                Toast.makeText(getApplicationContext(),
                        "Ta querendo voltar?",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSend:
                Toast.makeText(getApplicationContext(),
                        "MANDOU ALGO AI",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mJoia:
                Toast.makeText(getApplicationContext(),
                        "TA BÃO?",
                        Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}