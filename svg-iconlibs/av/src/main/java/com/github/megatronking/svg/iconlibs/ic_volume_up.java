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
public class ic_volume_up extends SVGRenderer {

    public ic_volume_up(Context context) {
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
        
        mPath.moveTo(3.0f, 9.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.rLineTo(5.0f, 5.0f);
        mPath.lineTo(12.0f, 4.0f);
        mPath.lineTo(7.0f, 9.0f);
        mPath.lineTo(3.0f, 9.0f);
        mPath.close();
        mPath.moveTo(3.0f, 9.0f);
        mPath.rMoveTo(13.5f, 3.0f);
        mPath.rCubicTo(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        mPath.rLineTo(0f, 8.05f);
        mPath.rCubicTo(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
        mPath.close();
        mPath.moveTo(16.5f, 12.0f);
        mPath.moveTo(14.0f, 3.23f);
        mPath.rLineTo(0f, 2.06f);
        mPath.rCubicTo(2.89f, 0.86f, 5.0f, 3.54f, 5.0f, 6.71f);
        mPath.rCubicTo(0.0f, 3.17f, -2.11f, 5.85f, -5.0f, 6.71f);
        mPath.rLineTo(0f, 2.06f);
        mPath.rCubicTo(4.01f, -0.91f, 7.0f, -4.49f, 7.0f, -8.77f);
        mPath.rCubicTo(0.0f, -4.2800007f, -2.99f, -7.86f, -7.0f, -8.77f);
        mPath.close();
        mPath.moveTo(14.0f, 3.23f);
        
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