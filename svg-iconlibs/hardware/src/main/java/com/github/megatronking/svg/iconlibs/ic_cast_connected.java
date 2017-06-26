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
public class ic_cast_connected extends SVGRenderer {

    public ic_cast_connected(Context context) {
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
        
        mPath.moveTo(1.0f, 18.0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rCubicTo(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        mPath.close();
        mPath.moveTo(1.0f, 18.0f);
        mPath.rMoveTo(0.0f, -4.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rCubicTo(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rCubicTo(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        mPath.close();
        mPath.moveTo(1.0f, 14.0f);
        mPath.rMoveTo(18.0f, -7.0f);
        mPath.lineTo(5.0f, 7.0f);
        mPath.rLineTo(0f, 1.63f);
        mPath.rCubicTo(3.96f, 1.28f, 7.09f, 4.41f, 8.37f, 8.37f);
        mPath.lineTo(19.0f, 17.0f);
        mPath.lineTo(19.0f, 7.0f);
        mPath.close();
        mPath.moveTo(19.0f, 7.0f);
        mPath.moveTo(1.0f, 10.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rCubicTo(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rCubicTo(0.0f, -6.08f, -4.93f, -11.0f, -11.0f, -11.0f);
        mPath.close();
        mPath.moveTo(1.0f, 10.0f);
        mPath.rMoveTo(20.0f, -7.0f);
        mPath.lineTo(3.0f, 3.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(3.0f, 5.0f);
        mPath.rLineTo(18.0f, 0f);
        mPath.rLineTo(0f, 14.0f);
        mPath.rLineTo(-7.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(7.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(23.0f, 5.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(21.0f, 3.0f);
        
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