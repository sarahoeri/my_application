package ke.ac.akademic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mrFelix(View x){
        Intent next = new Intent ( this, Main2Activity.class);
        startActivity (next);

    }
}
