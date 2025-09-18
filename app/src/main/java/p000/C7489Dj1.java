package p000;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* renamed from: Dj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7489Dj1 {

    /* renamed from: a */
    public final C0787MV f2206a;

    /* renamed from: b */
    public final C7385Bj1 f2207b;

    /* renamed from: c */
    public final ChoreographerFrameCallbackC7437Cj1 f2208c;

    /* renamed from: d */
    public boolean f2209d;

    /* renamed from: e */
    public Surface f2210e;

    /* renamed from: f */
    public float f2211f;

    /* renamed from: g */
    public float f2212g;

    /* renamed from: h */
    public float f2213h;

    /* renamed from: i */
    public float f2214i;

    /* renamed from: j */
    public int f2215j;

    /* renamed from: k */
    public long f2216k;

    /* renamed from: l */
    public long f2217l;

    /* renamed from: m */
    public long f2218m;

    /* renamed from: n */
    public long f2219n;

    /* renamed from: o */
    public long f2220o;

    /* renamed from: p */
    public long f2221p;

    /* renamed from: q */
    public long f2222q;

    public C7489Dj1(Context context) {
        DisplayManager displayManager;
        C0787MV c0787mv = new C0787MV();
        c0787mv.f7192a = new C0724LV();
        c0787mv.f7193b = new C0724LV();
        c0787mv.f7195d = -9223372036854775807L;
        this.f2206a = c0787mv;
        C7385Bj1 c7385Bj1 = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new C7385Bj1(this, displayManager);
        this.f2207b = c7385Bj1;
        this.f2208c = c7385Bj1 != null ? ChoreographerFrameCallbackC7437Cj1.f1594e : null;
        this.f2216k = -9223372036854775807L;
        this.f2217l = -9223372036854775807L;
        this.f2211f = -1.0f;
        this.f2214i = 1.0f;
        this.f2215j = 0;
    }

    /* renamed from: a */
    public static void m1860a(C7489Dj1 c7489Dj1, Display display) {
        c7489Dj1.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            c7489Dj1.f2216k = refreshRate;
            c7489Dj1.f2217l = (refreshRate * 80) / 100;
        } else {
            AbstractC10872rA1.m24175h("Unable to query display refresh rate");
            c7489Dj1.f2216k = -9223372036854775807L;
            c7489Dj1.f2217l = -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public final void m1861b() {
        Surface surface;
        if (AbstractC7485Dh1.f2166a < 30 || (surface = this.f2210e) == null || this.f2215j == Integer.MIN_VALUE || this.f2213h == 0.0f) {
            return;
        }
        this.f2213h = 0.0f;
        AbstractC7333Aj1.m309a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1862c() {
        /*
            r9 = this;
            int r0 = p000.AbstractC7485Dh1.f2166a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f2210e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            MV r0 = r9.f2206a
            LV r2 = r0.f7192a
            boolean r2 = r2.m5009a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            LV r2 = r0.f7192a
            boolean r2 = r2.m5009a()
            if (r2 == 0) goto L37
            LV r2 = r0.f7192a
            long r4 = r2.f6671e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f6672f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f2211f
        L3b:
            float r4 = r9.f2212g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            return
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            LV r1 = r0.f7192a
            boolean r1 = r1.m5009a()
            if (r1 == 0) goto L71
            LV r1 = r0.f7192a
            boolean r1 = r1.m5009a()
            if (r1 == 0) goto L5f
            LV r0 = r0.f7192a
            long r0 = r0.f6672f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.f2212g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f7196e
            if (r0 < r1) goto L8d
        L87:
            r9.f2212g = r2
            r0 = 0
            r9.m1863d(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7489Dj1.m1862c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1863d(boolean r4) {
        /*
            r3 = this;
            int r0 = p000.AbstractC7485Dh1.f2166a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f2210e
            if (r0 == 0) goto L30
            int r1 = r3.f2215j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f2209d
            if (r1 == 0) goto L21
            float r1 = r3.f2212g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f2214i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f2213h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            return
        L2b:
            r3.f2213h = r1
            p000.AbstractC7333Aj1.m309a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7489Dj1.m1863d(boolean):void");
    }
}
