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
public class ic_card_giftcard extends SVGRenderer {

    public ic_card_giftcard(Context context) {
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
        
        mPath.moveTo(20.0f, 6.0f);
        mPath.rLineTo(-2.18f, 0f);
        mPath.rCubicTo(0.11f, -0.31f, 0.18f, -0.65f, 0.18f, -1.0f);
        mPath.rCubicTo(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        mPath.rCubicTo(-1.05f, 0.0f, -1.96f, 0.54f, -2.5f, 1.35f);
        mPath.rLineTo(-0.5f, 0.67f);
        mPath.rLineTo(-0.5f, -0.68f);
        mPath.cubicTo(10.96f, 2.54f, 10.05f, 2.0f, 9.0f, 2.0f);
        mPath.cubicTo(7.34f, 2.0f, 6.0f, 3.34f, 6.0f, 5.0f);
        mPath.rCubicTo(0.0f, 0.35f, 0.07f, 0.69f, 0.18f, 1.0f);
        mPath.lineTo(4.0f, 6.0f);
        mPath.rCubicTo(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        mPath.lineTo(2.0f, 19.0f);
        mPath.rCubicTo(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rCubicTo(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        mPath.lineTo(22.0f, 8.0f);
        mPath.rCubicTo(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(20.0f, 6.0f);
        mPath.rMoveTo(-5.0f, -2.0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        mPath.rCubicTo(0.0f, 0.5500002f, -0.45f, 1.0f, -1.0f, 1.0f);
        mPath.rCubicTo(-0.5500002f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        mPath.rCubicTo(0.0f, -0.5500002f, 0.45f, -1.0f, 1.0f, -1.0f);
        mPath.close();
        mPath.moveTo(15.0f, 4.0f);
        mPath.moveTo(9.0f, 4.0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        mPath.rCubicTo(0.0f, 0.5500002f, -0.45f, 1.0f, -1.0f, 1.0f);
        mPath.rCubicTo(-0.5500002f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        mPath.rCubicTo(0.0f, -0.5500002f, 0.45f, -1.0f, 1.0f, -1.0f);
        mPath.close();
        mPath.moveTo(9.0f, 4.0f);
        mPath.rMoveTo(11.0f, 15.0f);
        mPath.lineTo(4.0f, 19.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(20.0f, 19.0f);
        mPath.rMoveTo(0.0f, -5.0f);
        mPath.lineTo(4.0f, 14.0f);
        mPath.lineTo(4.0f, 8.0f);
        mPath.rLineTo(5.08f, 0f);
        mPath.lineTo(7.0f, 10.83f);
        mPath.lineTo(8.62f, 12.0f);
        mPath.lineTo(11.0f, 8.76f);
        mPath.rLineTo(1.0f, -1.36f);
        mPath.rLineTo(1.0f, 1.36f);
        mPath.lineTo(15.38f, 12.0f);
        mPath.lineTo(17.0f, 10.83f);
        mPath.lineTo(14.92f, 8.0f);
        mPath.lineTo(20.0f, 8.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.close();
        mPath.moveTo(20.0f, 14.0f);
        
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