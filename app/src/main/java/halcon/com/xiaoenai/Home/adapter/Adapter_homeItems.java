package halcon.com.xiaoenai.Home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import halcon.com.xiaoenai.Home.Model.HomeItem;
import halcon.com.xiaoenai.R;

/**
 * 作者：Administrator on 2015/6/30 16:29
 * 工程名：Xiaoenai
 */
public class Adapter_homeItems extends BaseAdapter {

    private ArrayList<HomeItem> items;
    private Context context;

    public Adapter_homeItems(ArrayList<HomeItem> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size() == 0 ? 0 : items.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater;
        ViewHolder holder;

        if (convertView == null){
            inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.adapter_homeitems,null);

            holder = new ViewHolder(convertView);

            convertView.setTag(holder);
        }else{
            holder =(ViewHolder)convertView.getTag();
        }

        HomeItem item = items.get(position);
        holder.bindView(item);

        return convertView;
    }

    class ViewHolder{
        private ImageView img_item;
        private TextView txv_title;

        public ViewHolder(View convertView){
            img_item = (ImageView)convertView.findViewById(R.id.img_item);
            txv_title = (TextView)convertView.findViewById(R.id.txv_title);
        }

        private void bindView(HomeItem homeItem){
//            img_item.setImageResource(homeItem.getIcon());
            txv_title.setText(homeItem.getTitle());
        }
    }
}
