package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public final class WW {
    public static final WW p = new WW();
    public final double a;
    public final String b;
    public final int c;
    public final ReadableMap d;
    public D91 e;
    public int f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final E91 k;
    public final double l;
    public final double m;
    public final double n;
    public final boolean o;

    public WW() {
        this.d = null;
        this.b = "";
        this.c = 1;
        this.e = D91.Normal;
        this.f = 400;
        this.g = "";
        this.h = "";
        this.i = 1;
        this.j = 1;
        this.k = E91.None;
        this.o = false;
        this.l = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.a = 12.0d;
        this.m = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.n = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public static double b(ReadableMap readableMap, String str, double d, double d2, double d3) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) : GM1.a(d3, d, d2, readableMap.getString(str));
    }

    public final void a(WW ww, double d) {
        long jRound = Math.round(d);
        if (jRound < 1 || jRound > 1000) {
            this.f = ww.f;
            this.e = ww.e;
            return;
        }
        int i = (int) jRound;
        this.f = i;
        D91[] d91Arr = VW.a;
        this.e = VW.a[Math.round(i / 100.0f)];
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[PHI: r1
  0x0071: PHI (r1v75 int) = (r1v74 int), (r1v80 int) binds: [B:27:0x007b, B:21:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WW(com.facebook.react.bridge.ReadableMap r17, defpackage.WW r18, double r19) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WW.<init>(com.facebook.react.bridge.ReadableMap, WW, double):void");
    }
}
