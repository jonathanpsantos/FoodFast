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
        inflater.inflate(R.menu.menu, menu);
        return super.onCreatePanelMenu(featureId, menu);

    }

    //criando o metodo para clilar nos itens do menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mFav:
                Toast.makeText(getApplicationContext(),
                        "Favoritei",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(),
                        "Busquei",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mConfig:
                Toast.makeText(getApplicationContext(),
                        "Configurei",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHistory:
                Toast.makeText(getApplicationContext(),
                        "Historico",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mInfo:
                Toast.makeText(getApplicationContext(),
                        "informações",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mShare:
                Toast.makeText(getApplicationContext(),
                        "Compartilhei",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}