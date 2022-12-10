package com.example.garden;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MiJardin extends AppCompatActivity {

    private Button backJardin, addJardin;
    private ListView lv;
    private ArrayList<String> arrayList;
    private ArrayAdapter adapter;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_jardin);

        getSupportActionBar().hide();

        lv = (ListView)findViewById(R.id.itemlist);
        backJardin = (Button) findViewById(R.id.backJardin);
        addJardin = (Button) findViewById(R.id.addJardin);

        arrayList = new ArrayList<String>();

        arrayList.add("Petunia");
        arrayList.add("Rosal");
        arrayList.add("Nardo");
        arrayList.add("Hiedra");
        arrayList.add("Violeta");
        arrayList.add("Lavándula");
        arrayList.add("Orquídea");
        arrayList.add("Geranio");
        arrayList.add("Gladiolo");
        arrayList.add("Gardenia");

        adapter = new ArrayAdapter(MiJardin.this, android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(adapter);

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long id) {

                final int which_item = position;

                new AlertDialog.Builder(MiJardin.this)
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("¿Estás seguro?")
                        .setMessage("¿Quieres eliminar esta planta?")
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                arrayList.remove(which_item);
                                adapter.notifyDataSetChanged();
                            }
                        })
                .setNegativeButton("No", null)
                        .show();
                return true;
            }
        });

        backJardin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiJardin.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });

        addJardin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder dialog = new AlertDialog.Builder((MiJardin.this));
                dialog.setTitle("Introduzca el nombre de la planta a añadir: ");


                final EditText et = new EditText (MiJardin.this);
               et.setInputType(InputType.TYPE_CLASS_TEXT);
                 dialog.setView(et);

                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        if(!et.getText().toString().equals("")) {
                            arrayList.add(et.getText().toString());

                            Toast.makeText(MiJardin.this, "La planta añadida es: " + et.getText().toString(), Toast.LENGTH_LONG).show();
                        }
                    }

                });

                dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        dialogInterface.cancel();
                    }
                });

                dialog.show();

                adapter.notifyDataSetChanged();

            }
        });

    }
}