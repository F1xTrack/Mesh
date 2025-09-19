package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.regex.Pattern;
import p000.AbstractC6620pU;

/* renamed from: com.horcrux.svg.d */
/* loaded from: classes.dex */
public final class C1990d extends AbstractC6620pU {

    /* renamed from: e */
    public static final Pattern f18590e = Pattern.compile("[0-9.-]+");

    /* renamed from: c */
    public ReadableArray f18591c;

    /* renamed from: d */
    public float f18592d;

    @Override // p000.AbstractC6620pU
    /* renamed from: l */
    public final Bitmap mo4327l(HashMap map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFlags(129);
        paint.setStyle(Paint.Style.FILL);
        float f = this.f18592d;
        ReadableArray readableArray = this.f18591c;
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

    /* renamed from: n */
    public final void m11364n(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f18591c = null;
            invalidate();
            return;
        }
        int i = readableMap.getInt("type");
        if (i == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.f18591c = JavaOnlyArray.m10961of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.f18591c = JavaOnlyArray.m10961of(0, readableMap.getMap("payload"));
            }
        } else if (i == 1) {
            this.f18591c = JavaOnlyArray.m10961of(1, readableMap.getString("brushRef"));
        } else {
            this.f18591c = JavaOnlyArray.m10961of(Integer.valueOf(i));
        }
        invalidate();
    }
}
