package p000;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: WW */
/* loaded from: classes.dex */
public final class C1417WW {

    /* renamed from: p */
    public static final C1417WW f13221p = new C1417WW();

    /* renamed from: a */
    public final double f13222a;

    /* renamed from: b */
    public final String f13223b;

    /* renamed from: c */
    public final int f13224c;

    /* renamed from: d */
    public final ReadableMap f13225d;

    /* renamed from: e */
    public D91 f13226e;

    /* renamed from: f */
    public int f13227f;

    /* renamed from: g */
    public final String f13228g;

    /* renamed from: h */
    public final String f13229h;

    /* renamed from: i */
    public final int f13230i;

    /* renamed from: j */
    public final int f13231j;

    /* renamed from: k */
    public final E91 f13232k;

    /* renamed from: l */
    public final double f13233l;

    /* renamed from: m */
    public final double f13234m;

    /* renamed from: n */
    public final double f13235n;

    /* renamed from: o */
    public final boolean f13236o;

    public C1417WW() {
        this.f13225d = null;
        this.f13223b = "";
        this.f13224c = 1;
        this.f13226e = D91.Normal;
        this.f13227f = 400;
        this.f13228g = "";
        this.f13229h = "";
        this.f13230i = 1;
        this.f13231j = 1;
        this.f13232k = E91.None;
        this.f13236o = false;
        this.f13233l = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f13222a = 12.0d;
        this.f13234m = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f13235n = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    /* renamed from: b */
    public static double m8801b(ReadableMap readableMap, String str, double d, double d2, double d3) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) : GM1.m3048a(d3, d, d2, readableMap.getString(str));
    }

    /* renamed from: a */
    public final void m8802a(C1417WW c1417ww, double d) {
        long jRound = Math.round(d);
        if (jRound < 1 || jRound > 1000) {
            this.f13227f = c1417ww.f13227f;
            this.f13226e = c1417ww.f13226e;
            return;
        }
        int i = (int) jRound;
        this.f13227f = i;
        D91[] d91Arr = AbstractC1354VW.f12603a;
        this.f13226e = AbstractC1354VW.f12603a[Math.round(i / 100.0f)];
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[PHI: r1
  0x0071: PHI (r1v75 int) = (r1v74 int), (r1v80 int) binds: [B:27:0x007b, B:21:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1417WW(com.facebook.react.bridge.ReadableMap r17, p000.C1417WW r18, double r19) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1417WW.<init>(com.facebook.react.bridge.ReadableMap, WW, double):void");
    }
}
