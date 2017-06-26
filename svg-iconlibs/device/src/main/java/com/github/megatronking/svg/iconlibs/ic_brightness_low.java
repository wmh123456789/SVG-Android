package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_brightness_low extends SVGRenderer {

    public ic_brightness_low(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(20.0f, 15.31f);
        mPath.lineTo(23.31f, 12.0f);
        mPath.lineTo(20.0f, 8.69f);
        mPath.lineTo(20.0f, 4.0f);
        mPath.rLineTo(-4.69f, 0f);
        mPath.lineTo(12.0f, 0.69f);
        mPath.lineTo(8.69f, 4.0f);
        mPath.lineTo(4.0f, 4.0f);
        mPath.rLineTo(0f, 4.69f);
        mPath.lineTo(0.69f, 12.0f);
        mPath.lineTo(4.0f, 15.31f);
        mPath.lineTo(4.0f, 20.0f);
        mPath.rLineTo(4.69f, 0f);
        mPath.lineTo(12.0f, 23.31f);
        mPath.lineTo(15.31f, 20.0f);
        mPath.lineTo(20.0f, 20.0f);
        mPath.rLineTo(0f, -4.69f);
        mPath.close();
        mPath.moveTo(20.0f, 15.31f);
        mPath.moveTo(12.0f, 18.0f);
        mPath.rCubicTo(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        mPath.rCubicTo(0.0f, -3.3099995f, 2.69f, -6.0f, 6.0f, -6.0f);
        mPath.rCubicTo(3.3099995f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        mPath.rCubicTo(0.0f, 3.3099995f, -2.69f, 6.0f, -6.0f, 6.0f);
        mPath.close();
        mPath.moveTo(12.0f, 18.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}