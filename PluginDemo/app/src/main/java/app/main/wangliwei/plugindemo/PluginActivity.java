package app.main.wangliwei.plugindemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class PluginActivity extends Activity {
    private Unbinder unbinder;

    @BindView(R.id.text_back_host)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plugin2);
        unbinder = ButterKnife.bind(this);

//        findViewById(R.id.text_back_host).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setClassName("app.main.wangliwei.hostdemo", "app.main.wangliwei.hostdemo.MainActivity");
//                startActivity(intent);
//            }
//        });
    }

    @OnClick(R.id.text_back_host)
    public void onClick() {
        Intent intent = new Intent();
        intent.setClassName("app.main.wangliwei.hostdemo", "app.main.wangliwei.hostdemo.MainActivity");
        startActivity(intent);
    }
}
