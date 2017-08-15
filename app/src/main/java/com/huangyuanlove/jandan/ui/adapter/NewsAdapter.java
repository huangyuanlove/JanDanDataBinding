package com.huangyuanlove.jandan.ui.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huangyuanlove.jandan.R;
import com.huangyuanlove.jandan.bean.NewsVO;
import com.huangyuanlove.jandan.databinding.ItemNewsBinding;

import java.util.List;

/**
 * Created by huangyuan on 2017/8/14.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    private List<NewsVO> lists;
    private LayoutInflater inflater;

    public NewsAdapter(Context context, List<NewsVO> lists) {
        this.lists = lists;
        this.inflater = LayoutInflater.from(context);
    }

    public void setLists(List<NewsVO> lists) {
        this.lists = lists;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemNewsBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_news, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.getBinding().setNewsVo(lists.get(position));
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return lists==null?0:lists.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ItemNewsBinding binding;

        public ViewHolder(ItemNewsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public ItemNewsBinding getBinding() {
            return binding;
        }

        public void setBinding(ItemNewsBinding binding) {
            this.binding = binding;
        }
    }

}
