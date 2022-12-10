package com.example.garden;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class PetuniaDialog extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("PETUNIA")
                .setMessage("PEtunia integrifolia.\nComprende 23 especies pertenecientes a la familia de las Solanáceas nativas de Sudamérica.\nLa mayoría de las variedades cultivadas son híbridos de Petunia x Hybrida, llamada tambien P. atkinsiana.")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        return builder.create();

    }
}
