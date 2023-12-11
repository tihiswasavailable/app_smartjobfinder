package com.example.smart_job_finder.ui.send;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.example.smart_job_finder.R;

import java.util.Objects;

public class SendDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Are you sure you want to send your application?")
                .setPositiveButton("sent", (dialog, id) -> {
                   //Todo: send the application
                    SendSuccessDialog successDialog = new SendSuccessDialog();
                    successDialog.show(requireActivity().getSupportFragmentManager(), "success");

                })
                .setNegativeButton("cancel", (dialog, id) -> {
                    //Todo: cancel the application
                });

        return builder.create();
    }
}