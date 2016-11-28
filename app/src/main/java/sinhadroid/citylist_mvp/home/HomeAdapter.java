package sinhadroid.citylist_mvp.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import sinhadroid.citylist_mvp.R;
import sinhadroid.citylist_mvp.models.CityListData;

/**
 * Created by deepanshu on 25/10/16.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private final OnItemClickListener listener;
    private List<CityListData> data;
    private Context context;

    public HomeAdapter(Context context, List<CityListData> cityListDataList, OnItemClickListener listener) {
        this.data = cityListDataList;
        this.listener = listener;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, null);
        view.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.click(data.get(position), listener);
        holder.tvCity.setText(data.get(position).getTitle());
        holder.tvDesc.setText(data.get(position).getDateTaken());

        String images = data.get(position).getMedia().getM();

        Glide.with(context)
                .load(images)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .skipMemoryCache(true)
                .into(holder.background);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public interface OnItemClickListener {
        void onClick(CityListData item);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvCity, tvDesc;
        ImageView background;

        public ViewHolder(View itemView) {
            super(itemView);
            tvCity = (TextView) itemView.findViewById(R.id.city);
            tvDesc = (TextView) itemView.findViewById(R.id.hotel);
            background = (ImageView) itemView.findViewById(R.id.image);

        }

        public void click(final CityListData cityListData, final OnItemClickListener listener) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(cityListData);
                }
            });
        }
    }
}
