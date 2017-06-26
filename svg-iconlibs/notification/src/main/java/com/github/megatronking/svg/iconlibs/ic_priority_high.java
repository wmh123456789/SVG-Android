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
public class ic_priority_high extends SVGRenderer {

    public ic_priority_high(Context context) {
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
        
        mPath.moveTo(12.0f, 19.0f);
        mPath.rMoveTo(-2.0f, 0.0f);
        mPath.cubicTo(10.0f, 18.46977f, 10.210857f, 17.960716f, 10.585787f, 17.585787f);
        mPath.cubicTo(10.960715f, 17.210857f, 11.46977f, 17.0f, 12.0f, 17.0f);
        mPath.cubicTo(12.53023f, 17.0f, 13.039285f, 17.210857f, 13.414213f, 17.585787f);
        mPath.cubicTo(13.789143f, 17.960716f, 14.0f, 18.46977f, 14.0f, 19.0f);
        mPath.cubicTo(14.0f, 19.53023f, 13.789143f, 20.039284f, 13.414213f, 20.414213f);
        mPath.cubicTo(13.039285f, 20.789143f, 12.53023f, 21.0f, 12.0f, 21.0f);
        mPath.cubicTo(11.46977f, 21.0f, 10.960715f, 20.789143f, 10.585787f, 20.414213f);
        mPath.cubicTo(10.210857f, 20.039284f, 10.0f, 19.53023f, 10.0f, 19.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(10.0f, 3.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.close();
        mPath.moveTo(10.0f, 3.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}