package andreasagap.sampleloadingbutton;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import andreasagap.loadingbutton.ButtonLoading;

public class MainActivity extends AppCompatActivity {
    ButtonLoading buttonLoading;
    ConstraintLayout root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        root=findViewById(R.id.root);
        buttonLoading=findViewById(R.id.loadingbutton);
        buttonLoading.setRoot(buttonLoading,this,root);
        buttonLoading.setOnButtonLoadingListener(new ButtonLoading.OnButtonLoadingListener() {
            @Override
            public void onClick() {
                //...
            }

            @Override
            public void onStart() {

                //...
            }

            @Override
            public void onFinish() {
                //...

            }
        });
    }

    @Override
    public void onBackPressed() {

        buttonLoading.cancel();
    }
}
