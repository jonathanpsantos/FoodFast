package br.com.etecia.foodfast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MenuAppBarTopActivity extends AppCompatActivity {
    // declarando a variavel global do objeto App bar

    MaterialToolbar idToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_app_bar_top_layout);

        //apresentando a toolbar xml para o java

        idToolbar = findViewById(R.id.idtoolBar);

        idToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei no icone", Toast.LENGTH_SHORT).show();


            }
        });

        idToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mFavorite:
                        Toast.makeText(getApplicationContext(), "CLique no Favorite", Toast.LENGTH_SHORT).show();

                        break;
                }
                return false;
            }
        });
        idToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mFavorite:
                        Toast.makeText(getApplicationContext(), "CLique no Favorite", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.mSearch:
                        Toast.makeText(getApplicationContext(), "CLique no Search", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.mMore:
                        Toast.makeText(getApplicationContext(), "CLique no More", Toast.LENGTH_SHORT).show();

                        break;
                }

                return false;
            }

        });
    }
}




