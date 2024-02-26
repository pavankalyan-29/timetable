package com.visll_k.t2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class ProgramAdapter extends ArrayAdapter<String> {
    Context context;
    String[] details;

    public ProgramAdapter(Context context, String[] details) {
        super(context, R.layout.single_element, R.id.details_txt, details);
        this.context = context;
        this.details = details;
    }

    public void setDetails(String[] details) {
        this.details = details;
        notifyDataSetChanged();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View singleItem = convertView;
        ProgramViewHolder holder = null;
        if(singleItem == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(R.layout.single_element, parent, false);
            holder = new ProgramViewHolder(singleItem);
            singleItem.setTag(holder);
        }
        else{
            holder = (ProgramViewHolder) singleItem.getTag();
        }
        holder.textView.setText(details[position]);

        return singleItem;
    }

}
