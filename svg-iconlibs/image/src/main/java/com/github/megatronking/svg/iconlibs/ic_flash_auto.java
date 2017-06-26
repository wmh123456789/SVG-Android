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
public class ic_flash_auto extends SVGRenderer {

    public ic_flash_auto(Context context) {
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
        
        mPath.moveTo(3.0f, 2.0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(0f, 9.0f);
        mPath.rLineTo(7.0f, -12.0f);
        mPath.lineTo(9.0f, 11.0f);
        mPath.rLineTo(4.0f, -9.0f);
        mPath.lineTo(3.0f, 2.0f);
        mPath.close();
        mPath.moveTo(3.0f, 2.0f);
        mPath.rMoveTo(16.0f, 0.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(-3.2f, 9.0f);
        mPath.rLineTo(1.9f, 0f);
        mPath.rLineTo(0.7f, -2.0f);
        mPath.rLineTo(3.2f, 0f);
        mPath.rLineTo(0.7f, 2.0f);
        mPath.rLineTo(1.9f, 0f);
        mPath.lineTo(19.0f, 2.0f);
        mPath.close();
        mPath.moveTo(19.0f, 2.0f);
        mPath.rMoveTo(-2.15f, 5.65f);
        mPath.lineTo(18.0f, 4.0f);
        mPath.rLineTo(1.15f, 3.65f);
        mPath.rLineTo(-2.3f, 0f);
        mPath.close();
        mPath.moveTo(16.85f, 7.65f);
        
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