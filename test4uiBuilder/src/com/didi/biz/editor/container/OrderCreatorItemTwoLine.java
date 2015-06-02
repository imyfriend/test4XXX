package com.didi.biz.editor.container;

import com.example.test4uibuilder.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

/**
 * Class description
 * 
 * @author houshengyong
 * @since 2015-6-2
 */

public class OrderCreatorItemTwoLine extends RelativeLayout {

    /**
     * @param context
     */
    public OrderCreatorItemTwoLine(Context context) {
        super(context);
        init();
    }

    /**
     * @param context
     * @param attrs
     */
    public OrderCreatorItemTwoLine(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    /**
     * @param context
     * @param attrs
     * @param defStyle
     */
    public OrderCreatorItemTwoLine(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    /**
     * 
     */
    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.order_creator_item_two_line, this, true);
    }

}