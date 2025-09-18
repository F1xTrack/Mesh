package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;

/* renamed from: zj1 */
/* loaded from: classes.dex */
public final class C8418zj1 {
    public final C3462dp0 a;
    public final C0283Dj1 b;
    public boolean c;
    public long f;
    public boolean i;
    public int d = 0;
    public long e = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public float j = 1.0f;
    public M71 k = M71.a;

    public C8418zj1(Context context, C3462dp0 c3462dp0) {
        this.a = c3462dp0;
        this.b = new C0283Dj1(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r23, long r25, long r27, long r29, boolean r31, defpackage.C7581vK r32) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8418zj1.a(long, long, long, long, boolean, vK):int");
    }

    public final void b(boolean z) {
        this.i = z;
        this.k.getClass();
        this.h = SystemClock.elapsedRealtime() + 5000;
    }

    public final void c(int i) {
        this.d = Math.min(this.d, i);
    }

    public final void d() {
        this.c = true;
        this.k.getClass();
        this.f = AbstractC0277Dh1.Q(SystemClock.elapsedRealtime());
        C0283Dj1 c0283Dj1 = this.b;
        c0283Dj1.d = true;
        c0283Dj1.m = 0L;
        c0283Dj1.p = -1L;
        c0283Dj1.n = -1L;
        C0127Bj1 c0127Bj1 = c0283Dj1.b;
        if (c0127Bj1 != null) {
            ChoreographerFrameCallbackC0205Cj1 choreographerFrameCallbackC0205Cj1 = c0283Dj1.c;
            choreographerFrameCallbackC0205Cj1.getClass();
            choreographerFrameCallbackC0205Cj1.b.sendEmptyMessage(2);
            Handler handlerN = AbstractC0277Dh1.n(null);
            DisplayManager displayManager = c0127Bj1.a;
            displayManager.registerDisplayListener(c0127Bj1, handlerN);
            C0283Dj1.a(c0127Bj1.b, displayManager.getDisplay(0));
        }
        c0283Dj1.d(false);
    }

    public final void e() {
        this.c = false;
        this.h = -9223372036854775807L;
        C0283Dj1 c0283Dj1 = this.b;
        c0283Dj1.d = false;
        C0127Bj1 c0127Bj1 = c0283Dj1.b;
        if (c0127Bj1 != null) {
            c0127Bj1.a.unregisterDisplayListener(c0127Bj1);
            ChoreographerFrameCallbackC0205Cj1 choreographerFrameCallbackC0205Cj1 = c0283Dj1.c;
            choreographerFrameCallbackC0205Cj1.getClass();
            choreographerFrameCallbackC0205Cj1.b.sendEmptyMessage(3);
        }
        c0283Dj1.b();
    }

    public final void f(float f) {
        C0283Dj1 c0283Dj1 = this.b;
        c0283Dj1.f = f;
        MV mv = c0283Dj1.a;
        mv.a.c();
        mv.b.c();
        mv.c = false;
        mv.d = -9223372036854775807L;
        mv.e = 0;
        c0283Dj1.c();
    }
}
