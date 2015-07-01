package halcon.com.xiaoenai.Home.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

import halcon.com.xiaoenai.Home.Model.HomeItem;
import halcon.com.xiaoenai.Home.adapter.Adapter_homeItems;
import halcon.com.xiaoenai.R;

public class Activity_logo extends AppCompatActivity {
    private ArrayList<HomeItem> homeItems = new ArrayList<>();
    private GridView grv_items;
    private Adapter_homeItems adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.percentrelativelayout);

        // 初始化数据
//        initData();
//
//        // 初始化组件
//        initViews();
    }

    private void initViews(){
        grv_items = (GridView)findViewById(R.id.grv_item);

        adapter = new Adapter_homeItems(homeItems,this);
        grv_items.setAdapter(adapter);
    }

    private void initData(){
        // 我睡了
        HomeItem sleep = new HomeItem("我睡了");
        homeItems.add(sleep);
        // 发送距离
        HomeItem distance = new HomeItem("发送距离");
        homeItems.add(distance);
        // 小姨妈
        HomeItem aunt = new HomeItem("小姨妈");
        homeItems.add(aunt);
        // 私密相册
        HomeItem gallery = new HomeItem("私密相册");
        homeItems.add(gallery);
        // 纪念日
        HomeItem memorial = new HomeItem("纪念日");
        homeItems.add(memorial);
        // 日记本
        HomeItem diary = new HomeItem("发送距离");
        homeItems.add(diary);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_logo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
