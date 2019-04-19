package com.ck.exp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }



    // Initiating Menu XML file (menu.xml)
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    /**
     * Event Handling for Individual menu item selected
     * Identify single menu item by it's id
     * */
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case R.id.menu_bookmark:
                // Single menu item is selected do something
                // Ex: launching new activity/screen or show alert message
                Toast.makeText(MainActivity.this, "Bookmark is Selected", Toast.LENGTH_SHORT).show();
                textView.setText("Bookmark");
                return true;

            case R.id.menu_save:
                Toast.makeText(MainActivity.this, "Save is Selected", Toast.LENGTH_SHORT).show();
                textView.setText("Save");
                return true;

            case R.id.menu_search:
                Toast.makeText(MainActivity.this, "Search is Selected", Toast.LENGTH_SHORT).show();
                textView.setText("Search");
                return true;

            case R.id.menu_share:
                Toast.makeText(MainActivity.this, "Share is Selected", Toast.LENGTH_SHORT).show();
                textView.setText("Share");
                return true;

            case R.id.menu_delete:
                Toast.makeText(MainActivity.this, "Delete is Selected", Toast.LENGTH_SHORT).show();
                textView.setText("Delete");
                return true;

            case R.id.menu_preferences:
                Toast.makeText(MainActivity.this, "Preferences is Selected", Toast.LENGTH_SHORT).show();
                textView.setText("Preferences");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
