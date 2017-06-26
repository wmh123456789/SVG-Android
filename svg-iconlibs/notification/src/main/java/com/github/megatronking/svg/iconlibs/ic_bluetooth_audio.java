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
public class ic_bluetooth_audio extends SVGRenderer {

    public ic_bluetooth_audio(Context context) {
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
        
        mPath.moveTo(14.24f, 12.01f);
        mPath.rLineTo(2.32f, 2.32f);
        mPath.rCubicTo(0.28f, -0.72f, 0.44f, -1.51f, 0.44f, -2.33f);
        mPath.rCubicTo(0.0f, -0.82f, -0.16f, -1.59f, -0.43f, -2.31f);
        mPath.rLineTo(-2.33f, 2.32f);
        mPath.close();
        mPath.moveTo(14.24f, 12.01f);
        mPath.rMoveTo(5.29f, -5.3f);
        mPath.rLineTo(-1.26f, 1.26f);
        mPath.rCubicTo(0.63f, 1.21f, 0.98f, 2.57f, 0.98f, 4.02f);
        mPath.rCubicTo(0.0f, 1.4499998f, -0.36f, 2.82f, -0.98f, 4.02f);
        mPath.rLineTo(1.2f, 1.2f);
        mPath.rCubicTo(0.97f, -1.54f, 1.54f, -3.36f, 1.54f, -5.31f);
        mPath.rCubicTo(-0.01f, -1.89f, -0.55f, -3.67f, -1.48f, -5.19f);
        mPath.close();
        mPath.moveTo(19.529999f, 6.71f);
        mPath.rMoveTo(-3.82f, 1.0f);
        mPath.lineTo(10.0f, 2.0f);
        mPath.lineTo(9.0f, 2.0f);
        mPath.rLineTo(0f, 7.59f);
        mPath.lineTo(4.41f, 5.0f);
        mPath.lineTo(3.0f, 6.41f);
        mPath.lineTo(8.59f, 12.0f);
        mPath.lineTo(3.0f, 17.59f);
        mPath.lineTo(4.41f, 19.0f);
        mPath.lineTo(9.0f, 14.41f);
        mPath.lineTo(9.0f, 22.0f);
        mPath.rLineTo(1.0f, 0f);
        mPath.rLineTo(5.71f, -5.71f);
        mPath.rLineTo(-4.3f, -4.29f);
        mPath.rLineTo(4.3f, -4.29f);
        mPath.close();
        mPath.moveTo(15.709999f, 7.71f);
        mPath.moveTo(11.0f, 5.83f);
        mPath.rLineTo(1.88f, 1.88f);
        mPath.lineTo(11.0f, 9.59f);
        mPath.lineTo(11.0f, 5.83f);
        mPath.close();
        mPath.moveTo(11.0f, 5.83f);
        mPath.rMoveTo(1.88f, 10.46f);
        mPath.lineTo(11.0f, 18.17f);
        mPath.rLineTo(0f, -3.76f);
        mPath.rLineTo(1.88f, 1.88f);
        mPath.close();
        mPath.moveTo(12.88f, 16.29f);
        
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