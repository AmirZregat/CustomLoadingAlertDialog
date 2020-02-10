package com.ameer.customloadingalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {


    //4-
    LoadingDialog loadingDialog=new LoadingDialog(MainActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1- layout->new layout resource file
        //2-change it from linear layout to constraint layout
        //3-create new class LoadingDialog and make it private

        //5:
        loadingDialog.startLoadingDialog();

        //6: if i want the dialog to dismiss after 5 sec:
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                loadingDialog.dismissDialog();
            }
        },5000);
    }
}
