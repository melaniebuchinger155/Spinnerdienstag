package buchinger.melanie.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        spinner = (Spinner) findViewById( R.id.spinner );
        List<String> list = new ArrayList<>();
        list.add("Montag");
        list.add("Dienstag");
        list.add("Mittwoch");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list  );
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );

        spinner.setAdapter( adapter );
        spinner.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemvalue = parent.getItemAtPosition( position ).toString();
                Toast.makeText( MainActivity.this, "Selected:" + itemvalue, Toast.LENGTH_SHORT ).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        } ); }



}
