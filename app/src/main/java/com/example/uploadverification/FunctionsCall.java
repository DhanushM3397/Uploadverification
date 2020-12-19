package com.example.uploadverification;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import java.io.File;

public class FunctionsCall extends Application {

    public String filepath(String value) {
        File dir = new File(android.os.Environment.getExternalStorageDirectory(), AppFolderName()
                + File.separator + value);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir.toString();
    }

    public String AppFolderName() {
        return "Upload verification" ;
    }

    public void showToastMethod(Context context, String msg) {
        Toast.makeText(context, " "+msg, Toast.LENGTH_SHORT).show();

    }


}
