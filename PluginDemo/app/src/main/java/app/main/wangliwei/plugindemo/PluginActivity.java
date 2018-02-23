package app.main.wangliwei.plugindemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PluginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plugin2);

        findViewById(R.id.text_back_host).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName("app.main.wangliwei.hostdemo", "app.main.wangliwei.hostdemo.MainActivity");
                startActivity(intent);
            }
        });
    }
}
