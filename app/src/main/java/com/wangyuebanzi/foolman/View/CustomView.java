package com.wangyuebanzi.foolman.View;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/10/15.
 */

@SuppressLint("AppCompatCustomView")
public class CustomView extends TextView {

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        Typeface oldTypeface = getTypeface();


        int style = Typeface.NORMAL;

        if(oldTypeface!=null){
            style = oldTypeface.getStyle();
            oldTypeface.isBold();
            oldTypeface.isItalic();
        }
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"sss");
        setTypeface(typeface,style);

    }

}
