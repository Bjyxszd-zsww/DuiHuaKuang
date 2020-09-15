package com.example.duihuakuang;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "LIFTCYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "(1) onCreate()");
        setContentView(R.layout.activity_main);
        Button button = (Button) this.findViewById((R.id.button));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                final View viewdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.customdialog,null,false);
                builder.setTitle("自定义对话框");
                builder.setView(viewdialog);
                builder.setPositiveButton(("确定"), new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editTextUserId = viewdialog.findViewById(R.id.edittext_user_id);
                        EditText editTextUserPassword = viewdialog.findViewById(R.id.edittext_user_password);
                        if ((editTextUserId.getText().toString().equals("abc"))
                                && (editTextUserPassword.getText().toString().equals("123")))
                            Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this, "登陆失败", Toast.LENGTH_LONG).show();
                        Toast.makeText(MainActivity.this, "UserId" + editTextUserId.getText().toString()
                                        + "UserPassword= " + editTextUserPassword.getText().toString(),
                                Toast.LENGTH_LONG).show();
                    }
                }).setNegativeButton(("取消"), new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,
                                "用户点击取消按钮", Toast.LENGTH_LONG).show();
                    }
                });
                builder.create().show();
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "(2) onResume()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "(3) onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "(4) onSTop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "(5) onRestart()");
    }
}