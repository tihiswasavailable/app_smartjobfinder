package com.example.smart_job_finder.ui.send;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import com.example.smart_job_finder.R;

public class SendSuccessDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_send_success_dialog, null);
        Button continueButton = view.findViewById(R.id.continue_button);
        continueButton.setOnClickListener(v -> {
            dismiss();
            requireActivity().finish();
        });
        builder.setView(view);
        return builder.create();
    }
}