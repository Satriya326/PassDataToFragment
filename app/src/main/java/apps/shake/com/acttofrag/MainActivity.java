package apps.shake.com.acttofrag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button loginBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fmanager = getSupportFragmentManager();
        final FragmentTransaction fmTransaction = fmanager.beginTransaction();
        final FragmentFile fragmentFile = new FragmentFile();

        loginBtn = findViewById(R.id.submit);
        editText1 = findViewById(R.id.editTextUser1);
        editText2 = findViewById(R.id.editTextUser2);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bandle = new Bundle();
                bandle.putString("username",editText1.getText().toString());
                bandle.putString("psswd",editText2.getText().toString());
                fragmentFile.setArguments(bandle);
                fmTransaction.add(R.id.frameLayout,fragmentFile);
                fmTransaction.commit();
            }
        });

    }

}
