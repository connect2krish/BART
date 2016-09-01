package net.krishlogic.bart;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import net.krishlogic.bart.model.ItemModel;

import java.util.List;

/**
 * Created by kvenkat on 5/10/16.
 */
public class TrainListAdapter extends BaseAdapter {

    List<ItemModel> mItemModelList;

    public TrainListAdapter(List<ItemModel> itemModelList) {
        this.mItemModelList = itemModelList;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return super.areAllItemsEnabled();
    }

    @Override
    public boolean isEnabled(int position) {
        return super.isEnabled(position);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public int getCount() {
        return mItemModelList.size();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(view==null) {
            LayoutInflater inflator = LayoutInflater.from(viewGroup.getContext());
            view = inflator.inflate(R.layout.content_main, viewGroup, false);
        }

        return view;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return mItemModelList.get(position);
    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {
        super.unregisterDataSetObserver(observer);
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {
        super.registerDataSetObserver(observer);
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
    }

    @Override
    public boolean hasStableIds() {
        return super.hasStableIds();
    }
}
