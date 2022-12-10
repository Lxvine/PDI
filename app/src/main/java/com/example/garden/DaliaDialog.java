package com.example.garden;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DaliaDialog extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("DALIA")
                .setMessage("Dahlia.\nEs un género de plantas de la familia de las asteráceas. Es la flor nacional de Rusia y México.\nSu nombre original en el idioma náhuatl fue atlcotlixochitl que viene de agua (a-tl), tubo (coco-tli) y flor (xochitl).")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        return builder.create();

    }
}
