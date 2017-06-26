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
public class ic_closed_caption extends SVGRenderer {

    public ic_closed_caption(Context context) {
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
        
        mPath.moveTo(19.0f, 4.0f);
        mPath.lineTo(5.0f, 4.0f);
        mPath.rCubicTo(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(21.0f, 6.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(19.0f, 4.0f);
        mPath.rMoveTo(-8.0f, 7.0f);
        mPath.lineTo(9.5f, 11.0f);
        mPath.rLineTo(0f, -0.5f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(9.5f, 13.0f);
        mPath.lineTo(11.0f, 13.0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.rCubicTo(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        mPath.lineTo(7.0f, 15.0f);
        mPath.rCubicTo(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        mPath.rLineTo(0f, -4.0f);
        mPath.rCubicTo(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.close();
        mPath.moveTo(11.0f, 11.0f);
        mPath.rMoveTo(7.0f, 0.0f);
        mPath.rLineTo(-1.5f, 0f);
        mPath.rLineTo(0f, -0.5f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(16.5f, 13.0f);
        mPath.lineTo(18.0f, 13.0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.rCubicTo(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        mPath.rLineTo(-3.0f, 0f);
        mPath.rCubicTo(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        mPath.rLineTo(0f, -4.0f);
        mPath.rCubicTo(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.close();
        mPath.moveTo(18.0f, 11.0f);
        
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