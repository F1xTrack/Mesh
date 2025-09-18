package defpackage;

import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: eo */
/* loaded from: classes2.dex */
public final class C3649eo {
    public final InterfaceC6907ro a;
    public final String b;
    public final EnumC6031nC0 c;
    public final String d;
    public final boolean e;
    public final float f;
    public final float g;
    public final Integer h;
    public final Integer i;
    public final boolean j;
    public final EnumC1114Ob k;
    public final FC l;
    public final VG m;
    public final boolean n;
    public final EnumC1106Ny0 o;
    public final InterfaceC6907ro p;
    public final C0368Em q;
    public final boolean r;
    public final G20 s;
    public final double t;
    public final Range u;
    public final double v;
    public final boolean w;
    public final boolean x;

    /* JADX WARN: Removed duplicated region for block: B:198:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3649eo(defpackage.InterfaceC6907ro r12, androidx.camera.extensions.a r13) throws defpackage.C6526po {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3649eo.<init>(ro, androidx.camera.extensions.a):void");
    }

    public static double b(float[] fArr, SizeF sizeF) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float fMin = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (1 <= length) {
                while (true) {
                    fMin = Math.min(fMin, fArr[i]);
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            fValueOf = Float.valueOf(fMin);
        }
        if (fValueOf == null) {
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        float fFloatValue = fValueOf.floatValue();
        if (sizeF.getWidth() == 0.0f || sizeF.getHeight() == 0.0f) {
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        return Math.toDegrees(Math.atan2(Math.sqrt((sizeF.getHeight() * sizeF.getHeight()) + (sizeF.getWidth() * sizeF.getWidth())), fFloatValue * 2.0d) * 2.0d);
    }

    public final WritableMap a(Size size, Size size2, Range range) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("photoHeight", size.getHeight());
        writableMapCreateMap.putInt("photoWidth", size.getWidth());
        writableMapCreateMap.putInt("videoHeight", size2.getHeight());
        writableMapCreateMap.putInt("videoWidth", size2.getWidth());
        Object lower = range.getLower();
        O90.e(lower, "getLower(...)");
        writableMapCreateMap.putInt("minFps", ((Number) lower).intValue());
        Object upper = range.getUpper();
        O90.e(upper, "getUpper(...)");
        writableMapCreateMap.putInt("maxFps", ((Number) upper).intValue());
        Range range2 = this.u;
        Object lower2 = range2.getLower();
        O90.e(lower2, "getLower(...)");
        writableMapCreateMap.putInt("minISO", ((Number) lower2).intValue());
        Object upper2 = range2.getUpper();
        O90.e(upper2, "getUpper(...)");
        writableMapCreateMap.putInt("maxISO", ((Number) upper2).intValue());
        writableMapCreateMap.putDouble("fieldOfView", this.v);
        writableMapCreateMap.putBoolean("supportsVideoHdr", this.n);
        writableMapCreateMap.putBoolean("supportsPhotoHdr", this.w);
        writableMapCreateMap.putBoolean("supportsDepthCapture", false);
        writableMapCreateMap.putString("autoFocusSystem", this.k.a);
        EnumC1608Uj1[] enumC1608Uj1Arr = {EnumC1608Uj1.c};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC7287tn0.b(1));
        J8.B(enumC1608Uj1Arr, linkedHashSet);
        if (this.m.b) {
            linkedHashSet.add(EnumC1608Uj1.e);
        }
        if (this.l.a) {
            linkedHashSet.add(EnumC1608Uj1.f);
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(((EnumC1608Uj1) it.next()).a);
        }
        O90.c(writableArrayCreateArray);
        writableMapCreateMap.putArray("videoStabilizationModes", writableArrayCreateArray);
        return writableMapCreateMap;
    }
}
