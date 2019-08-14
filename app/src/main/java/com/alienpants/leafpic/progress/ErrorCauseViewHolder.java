package com.alienpants.leafpic.progress;

import android.view.View;

import com.alienpants.leafpic.R;
import com.alienpants.liz.ThemedViewHolder;
import com.alienpants.liz.ui.ThemedLinearLayout;
import com.alienpants.liz.ui.ThemedTextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ErrorCauseViewHolder extends ThemedViewHolder {

    @BindView(R.id.error_title)
    ThemedTextView title;

    @BindView(R.id.error_causes)
    ThemedLinearLayout causes;

    ErrorCauseViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void load(ErrorCause errorCause) {
        title.setText(errorCause.getTitle());

        causes.removeAllViews();
        for (String c : errorCause.getCauses()) {
            ThemedTextView textView = new ThemedTextView(itemView.getContext());
            textView.setStyleColor(ThemedTextView.SUB_TEXT_COLOR);
            //textView.setTextSize();
            textView.setText(c);
            causes.addView(textView);
        }
    }
}
