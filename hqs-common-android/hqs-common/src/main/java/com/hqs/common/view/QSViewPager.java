package com.hqs.common.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by apple on 16/9/30.
 */

public class QSViewPager extends ViewPager {

    private boolean horizontalScrollEnable = false;

    public QSViewPager(Context context) {
        super(context);
    }

    public QSViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if(horizontalScrollEnable){
            return super.onTouchEvent(ev);
        }
        else {
            return false;
        }
    }


    public boolean onInterceptTouchEvent(MotionEvent ev) {

        if(horizontalScrollEnable){
            return super.onInterceptTouchEvent(ev);
        }
        else {
            return false;
        }
    }

    public boolean isHorizontalScrollEnable() {
        return horizontalScrollEnable;
    }

    public void setHorizontalScrollEnable(boolean horizontalScrollEnabel) {
        this.horizontalScrollEnable = horizontalScrollEnabel;
    }



}
