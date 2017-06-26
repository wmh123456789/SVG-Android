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
public class ic_screen_share extends SVGRenderer {

    public ic_screen_share(Context context) {
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
        
        mPath.moveTo(20.0f, 18.0f);
        mPath.rCubicTo(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        mPath.lineTo(22.0f, 6.0f);
        mPath.rCubicTo(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.lineTo(4.0f, 4.0f);
        mPath.rCubicTo(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 10.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        mPath.lineTo(0.0f, 18.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(24.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.close();
        mPath.moveTo(20.0f, 18.0f);
        mPath.rMoveTo(-7.0f, -3.53f);
        mPath.rLineTo(0f, -2.19f);
        mPath.rCubicTo(-2.78f, 0.0f, -4.61f, 0.85f, -6.0f, 2.72f);
        mPath.rCubicTo(0.56f, -2.67f, 2.11f, -5.33f, 6.0f, -5.87f);
        mPath.lineTo(13.0f, 7.0f);
        mPath.rLineTo(4.0f, 3.73f);
        mPath.rLineTo(-4.0f, 3.74f);
        mPath.close();
        mPath.moveTo(13.0f, 14.47f);
        
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