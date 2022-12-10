package com.example.garden;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class VioletaDialog extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("VIOLETA")
                .setMessage("Viola reichenbachiana.\nSon plantas herbáceas de la familia de las violáceas, con entre 525 y 600 especies.\nLa mayoría de las especies se encuentran en las regiones templadas del hemisferio norte; sin embargo algunas especies están en Hawái, Australasia y los Andes de Sudamérica.")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        return builder.create();

    }
}
