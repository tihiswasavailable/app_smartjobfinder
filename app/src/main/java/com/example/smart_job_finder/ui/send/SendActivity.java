package com.example.smart_job_finder.ui.send;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.smart_job_finder.Job;
import com.example.smart_job_finder.R;
import java.util.Objects;

public class SendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        Job job = (Job) getIntent().getSerializableExtra("job");

        TextView jobEmail = findViewById(R.id.email_input);
        EditText email = findViewById(R.id.user_email_input);
        TextView jobTitle = findViewById(R.id.jobTitleSent);
        assert job != null;
        jobTitle.setText(job.getTitle());
        jobEmail.setText(job.getEmail());
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Send Application");

        Button sent = findViewById(R.id.sent_button);


        sent.setOnClickListener(v -> {
            SendDialog dialog = new SendDialog();

            if (email.getText().toString().trim().isEmpty()) {
                email.setError("Please enter your email");
                return;
            }
            else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email.getText().toString().trim()).matches()) {
                email.setError("Please enter a valid email");
                return;
            }
            dialog.show(getSupportFragmentManager(), "sent");
        });
    }

}
