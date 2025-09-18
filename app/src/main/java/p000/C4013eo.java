package p000;

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
public final class C4013eo {

    /* renamed from: a */
    public final InterfaceC6766ro f26841a;

    /* renamed from: b */
    public final String f26842b;

    /* renamed from: c */
    public final EnumC10363nC0 f26843c;

    /* renamed from: d */
    public final String f26844d;

    /* renamed from: e */
    public final boolean f26845e;

    /* renamed from: f */
    public final float f26846f;

    /* renamed from: g */
    public final float f26847g;

    /* renamed from: h */
    public final Integer f26848h;

    /* renamed from: i */
    public final Integer f26849i;

    /* renamed from: j */
    public final boolean f26850j;

    /* renamed from: k */
    public final EnumC0919Ob f26851k;

    /* renamed from: l */
    public final C0328FC f26852l;

    /* renamed from: m */
    public final C1338VG f26853m;

    /* renamed from: n */
    public final boolean f26854n;

    /* renamed from: o */
    public final EnumC8038Ny0 f26855o;

    /* renamed from: p */
    public final InterfaceC6766ro f26856p;

    /* renamed from: q */
    public final C0301Em f26857q;

    /* renamed from: r */
    public final boolean f26858r;

    /* renamed from: s */
    public final G20 f26859s;

    /* renamed from: t */
    public final double f26860t;

    /* renamed from: u */
    public final Range f26861u;

    /* renamed from: v */
    public final double f26862v;

    /* renamed from: w */
    public final boolean f26863w;

    /* renamed from: x */
    public final boolean f26864x;

    /* JADX WARN: Removed duplicated region for block: B:198:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4013eo(p000.InterfaceC6766ro r12, androidx.camera.extensions.C1691a r13) throws p000.C6640po {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4013eo.<init>(ro, androidx.camera.extensions.a):void");
    }

    /* renamed from: b */
    public static double m18032b(float[] fArr, SizeF sizeF) {
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

    /* renamed from: a */
    public final WritableMap m18033a(Size size, Size size2, Range range) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("photoHeight", size.getHeight());
        writableMapCreateMap.putInt("photoWidth", size.getWidth());
        writableMapCreateMap.putInt("videoHeight", size2.getHeight());
        writableMapCreateMap.putInt("videoWidth", size2.getWidth());
        Object lower = range.getLower();
        O90.m5967e(lower, "getLower(...)");
        writableMapCreateMap.putInt("minFps", ((Number) lower).intValue());
        Object upper = range.getUpper();
        O90.m5967e(upper, "getUpper(...)");
        writableMapCreateMap.putInt("maxFps", ((Number) upper).intValue());
        Range range2 = this.f26861u;
        Object lower2 = range2.getLower();
        O90.m5967e(lower2, "getLower(...)");
        writableMapCreateMap.putInt("minISO", ((Number) lower2).intValue());
        Object upper2 = range2.getUpper();
        O90.m5967e(upper2, "getUpper(...)");
        writableMapCreateMap.putInt("maxISO", ((Number) upper2).intValue());
        writableMapCreateMap.putDouble("fieldOfView", this.f26862v);
        writableMapCreateMap.putBoolean("supportsVideoHdr", this.f26854n);
        writableMapCreateMap.putBoolean("supportsPhotoHdr", this.f26863w);
        writableMapCreateMap.putBoolean("supportsDepthCapture", false);
        writableMapCreateMap.putString("autoFocusSystem", this.f26851k.f8511a);
        EnumC8373Uj1[] enumC8373Uj1Arr = {EnumC8373Uj1.f12008c};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC11205tn0.m24983b(1));
        AbstractC0576J8.m4171B(enumC8373Uj1Arr, linkedHashSet);
        if (this.f26853m.f12474b) {
            linkedHashSet.add(EnumC8373Uj1.f12010e);
        }
        if (this.f26852l.f3086a) {
            linkedHashSet.add(EnumC8373Uj1.f12011f);
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(((EnumC8373Uj1) it.next()).f12013a);
        }
        O90.m5965c(writableArrayCreateArray);
        writableMapCreateMap.putArray("videoStabilizationModes", writableArrayCreateArray);
        return writableMapCreateMap;
    }
}
