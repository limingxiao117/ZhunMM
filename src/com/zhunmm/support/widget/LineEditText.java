package com.zhunmm.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.zhunmm.R;

public class LineEditText extends LinearLayout {

    private int mLineColor;
    private float mLineMarginTOpWord;

    public LineEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        TypedArray typedArray = context.obtainStyledAttributes(attrs,
                R.styleable.Style_line_edittext);
        mLineColor = typedArray.getColor(
                R.styleable.Style_line_edittext_line_color,
                R.color.self_line_edit_text_line_color);
        mLineMarginTOpWord = typedArray.getDimension(
                R.styleable.Style_line_edittext_line_margin_top_word, 4l);
        LayoutInflater.from(context)
                .inflate(R.layout.self_line_edit_text, null);
    }

}
