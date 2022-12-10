package com.example.garden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Enciclopedia extends AppCompatActivity {

    private Button backEnciclopedia;

    private ImageView ivgirasol, ivgardenia, ivrosa, ivgeranio, ivtulipan, ivamapola, ivdalia, ivgladiolo, ivorquidea, ivpetunia, ivclavel, ivvioleta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enciclopedia);

        getSupportActionBar().hide();

        ivgirasol = (ImageView) findViewById(R.id.ivgirasol);
        ivgardenia = (ImageView) findViewById(R.id.ivgardenia);
        ivrosa = (ImageView) findViewById(R.id.ivrosa);
        ivgeranio = (ImageView) findViewById(R.id.ivgeranio);
        ivtulipan = (ImageView) findViewById(R.id.ivtulipan);
        ivamapola = (ImageView) findViewById(R.id.ivamapola);
        ivdalia = (ImageView) findViewById(R.id.ivdalia);
        ivgladiolo = (ImageView) findViewById(R.id.ivgladiolo);
        ivorquidea = (ImageView) findViewById(R.id.ivorquidea);
        ivpetunia = (ImageView) findViewById(R.id.ivpetunia);
        ivclavel = (ImageView) findViewById(R.id.ivclavel);
        ivvioleta = (ImageView) findViewById(R.id.ivvioleta);


        backEnciclopedia = (Button) findViewById(R.id.backEnciclopedia);

        backEnciclopedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Enciclopedia.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });

        ivgirasol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogGirasol();
            }
        });

        ivgardenia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogGardenia();
            }
        });

        ivrosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogRosa();
            }
        });

        ivgeranio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogGeranio();
            }
        });

        ivtulipan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogTulipan();
            }
        });

        ivamapola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { dialogAmapola() ; }
        });

        ivdalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogDalia();
            }
        });

        ivgladiolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogGladiolo();
            }
        });

        ivorquidea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogOrquidea();
            }
        });

        ivpetunia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogPetunia();
            }
        });

        ivclavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogClavel();
            }
        });

        ivvioleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogVioleta();
            }
        });

    }

    public void dialogGirasol() {
        GirasolDialog ed = new GirasolDialog();
        ed.show(getSupportFragmentManager(), "Dialogo Girasol");
    }

    public void dialogGardenia() {
        GardeniaDialog gad = new GardeniaDialog();
        gad.show(getSupportFragmentManager(), "Dialogo Gardenia");
    }

    public void dialogRosa() {
        RosaDialog rd = new RosaDialog();
        rd.show(getSupportFragmentManager(), "Dialogo Rosa");
    }

    public void dialogGeranio() {
        GeranioDialog ged = new GeranioDialog();
        ged.show(getSupportFragmentManager(), "Dialogo Geranio");
    }

    public void dialogTulipan() {
        TulipanDialog td = new TulipanDialog();
        td.show(getSupportFragmentManager(), "Dialogo Tulipan");
    }

    public void dialogAmapola() {
        AmapolaDialog ad = new AmapolaDialog();
        ad.show(getSupportFragmentManager(), "Dialogo Amapola");
    }

    public void dialogDalia() {
        DaliaDialog dd = new DaliaDialog();
        dd.show(getSupportFragmentManager(), "Dialogo Dalia");
    }

    public void dialogGladiolo() {
        GladioloDialog pd = new GladioloDialog();
        pd.show(getSupportFragmentManager(), "Dialogo Gladiolo");
    }

    public void dialogOrquidea() {
        OrquideaDialog od = new OrquideaDialog();
        od.show(getSupportFragmentManager(), "Dialogo Orquidea");
    }

    public void dialogPetunia() {
        PetuniaDialog pd = new PetuniaDialog();
        pd.show(getSupportFragmentManager(), "Dialogo Petunia");
    }

    public void dialogClavel() {
        ClavelDialog cd = new ClavelDialog();
        cd.show(getSupportFragmentManager(), "Dialogo Clavel");
    }

    public void dialogVioleta() {
        VioletaDialog vd = new VioletaDialog();
        vd.show(getSupportFragmentManager(), "Dialogo Violeta");
    }


}