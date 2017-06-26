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
public class ic_favorite extends SVGRenderer {

    public ic_favorite(Context context) {
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
        
        mPath.moveTo(12.0f, 21.35f);
        mPath.rLineTo(-1.45f, -1.32f);
        mPath.cubicTo(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        mPath.cubicTo(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        mPath.rCubicTo(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        mPath.cubicTo(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        mPath.cubicTo(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        mPath.rCubicTo(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        mPath.lineTo(12.0f, 21.35f);
        mPath.close();
        mPath.moveTo(12.0f, 21.35f);
        
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