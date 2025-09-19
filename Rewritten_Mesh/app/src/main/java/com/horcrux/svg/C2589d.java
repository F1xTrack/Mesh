package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import defpackage.AbstractC6466pU;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: com.horcrux.svg.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2589d extends AbstractC6466pU {
    public static final Pattern e = Pattern.compile("[0-9.-]+");
    public ReadableArray c;
    public float d;

    @Override // defpackage.AbstractC6466pU
    public final Bitmap l(HashMap map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFlags(129);
        paint.setStyle(Paint.Style.FILL);
        float f = this.d;
        ReadableArray readableArray = this.c;
        if (readableArray.getInt(0) == 0) {
            if (readableArray.size() == 2) {
                paint.setColor((Math.round((r2 >>> 24) * f) << 24) | ((readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1)) & 16777215));
            } else {
                paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * f * 255.0d : f * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
            }
        }
        canvas.drawPaint(paint);
        return bitmapCreateBitmap;
    }

    public final void n(ReadableMap readableMap) {
        if (readableMap == null) {
            this.c = null;
            invalidate();
            return;
        }
        int i = readableMap.getInt("type");
        if (i == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.c = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.c = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i == 1) {
            this.c = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.c = JavaOnlyArray.of(Integer.valueOf(i));
        }
        invalidate();
    }
}
