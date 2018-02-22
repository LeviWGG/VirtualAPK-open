package app.main.wangliwei.hostdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.didi.virtualapk.PluginManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {
    private Unbinder unbinder;

    @BindView(R.id.text_load_plugin)
    TextView textLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
    }

    @OnClick(R.id.text_load_plugin)
    public void onClick() {
        final String pkg = "app.main.wangliwei.plugindemo";
        if(PluginManager.getInstance(this).getLoadedPlugin(pkg) == null) {
            Toast.makeText(this,"plugin not loaded",Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("app.main.wangliwei.plugindemo","app.main.wangliwei.plugindemo.MainActivity");
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
