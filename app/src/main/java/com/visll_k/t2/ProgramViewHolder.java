package com.visll_k.t2;

import android.view.View;
import android.widget.TextView;

public class ProgramViewHolder {
    TextView textView;

    public ProgramViewHolder(View v)
    {
        textView = v.findViewById(R.id.details_txt);
    }
}
