package com.jiangtea.girdviewdemo;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GvAdapter extends BaseAdapter {
	private Context mContext;
	private List<GvItem> mData;

	public GvAdapter(Context context, List<GvItem> data) {
		super();
		this.mContext = context;
		this.mData = data;
	}

	@Override
	public int getCount() {
//		return mData == null ? 0 : mData.size();
		return 10;
	}

	// 供我们调用，不调用可以不写
	@Override
	public Object getItem(int position) {
//		return mData.get(position);
		return null;
	}

	// 供我们调用，不调用可以不写
	@Override
	public long getItemId(int position) {
//		return position;
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = View.inflate(mContext, R.layout.item_gridview, null);
		// 初始化控件
		ImageView ivIcon = (ImageView) view.findViewById(R.id.item_gridview_icon);
		TextView tvTitle = (TextView) view.findViewById(R.id.item_gridview_title);
		// 绑定数据
		//GvItem data = mData.get(position); //通常写法
//		GvItem data = (GvItem) getItem(position); //另一种写法
//		ivIcon.setImageResource(data.getIcon());
//		tvTitle.setText(data.getTitle());
		ivIcon.setImageResource(R.mipmap.ic_launcher);
		tvTitle.setText("标题" + ( position + 1));
		return view;
	}
}