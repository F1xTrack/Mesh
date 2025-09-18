package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* renamed from: Dj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283Dj1 {
    public final MV a;
    public final C0127Bj1 b;
    public final ChoreographerFrameCallbackC0205Cj1 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public C0283Dj1(Context context) {
        DisplayManager displayManager;
        MV mv = new MV();
        mv.a = new LV();
        mv.b = new LV();
        mv.d = -9223372036854775807L;
        this.a = mv;
        C0127Bj1 c0127Bj1 = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new C0127Bj1(this, displayManager);
        this.b = c0127Bj1;
        this.c = c0127Bj1 != null ? ChoreographerFrameCallbackC0205Cj1.e : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static void a(C0283Dj1 c0283Dj1, Display display) {
        c0283Dj1.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            c0283Dj1.k = refreshRate;
            c0283Dj1.l = (refreshRate * 80) / 100;
        } else {
            AbstractC6789rA1.h("Unable to query display refresh rate");
            c0283Dj1.k = -9223372036854775807L;
            c0283Dj1.l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (AbstractC0277Dh1.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        AbstractC0049Aj1.a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = defpackage.AbstractC0277Dh1.a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            MV r0 = r9.a
            LV r2 = r0.a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            LV r2 = r0.a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            LV r2 = r0.a
            long r4 = r2.e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f
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
            float r2 = r9.f
        L3b:
            float r4 = r9.g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            return
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            LV r1 = r0.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            LV r1 = r0.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            LV r0 = r0.a
            long r0 = r0.f
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
            float r1 = r9.g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.e
            if (r0 < r1) goto L8d
        L87:
            r9.g = r2
            r0 = 0
            r9.d(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0283Dj1.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r4) {
        /*
            r3 = this;
            int r0 = defpackage.AbstractC0277Dh1.a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.e
            if (r0 == 0) goto L30
            int r1 = r3.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.d
            if (r1 == 0) goto L21
            float r1 = r3.g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            return
        L2b:
            r3.h = r1
            defpackage.AbstractC0049Aj1.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0283Dj1.d(boolean):void");
    }
}
