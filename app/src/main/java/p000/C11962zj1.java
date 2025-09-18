package p000;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;

/* renamed from: zj1 */
/* loaded from: classes.dex */
public final class C11962zj1 {

    /* renamed from: a */
    public final C9161dp0 f46958a;

    /* renamed from: b */
    public final C7489Dj1 f46959b;

    /* renamed from: c */
    public boolean f46960c;

    /* renamed from: f */
    public long f46963f;

    /* renamed from: i */
    public boolean f46966i;

    /* renamed from: d */
    public int f46961d = 0;

    /* renamed from: e */
    public long f46962e = -9223372036854775807L;

    /* renamed from: g */
    public long f46964g = -9223372036854775807L;

    /* renamed from: h */
    public long f46965h = -9223372036854775807L;

    /* renamed from: j */
    public float f46967j = 1.0f;

    /* renamed from: k */
    public M71 f46968k = M71.f6997a;

    public C11962zj1(Context context, C9161dp0 c9161dp0) {
        this.f46958a = c9161dp0;
        this.f46959b = new C7489Dj1(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x023b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m26523a(long r23, long r25, long r27, long r29, boolean r31, p000.C7005vK r32) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11962zj1.m26523a(long, long, long, long, boolean, vK):int");
    }

    /* renamed from: b */
    public final void m26524b(boolean z) {
        this.f46966i = z;
        this.f46968k.getClass();
        this.f46965h = SystemClock.elapsedRealtime() + 5000;
    }

    /* renamed from: c */
    public final void m26525c(int i) {
        this.f46961d = Math.min(this.f46961d, i);
    }

    /* renamed from: d */
    public final void m26526d() {
        this.f46960c = true;
        this.f46968k.getClass();
        this.f46963f = AbstractC7485Dh1.m1802Q(SystemClock.elapsedRealtime());
        C7489Dj1 c7489Dj1 = this.f46959b;
        c7489Dj1.f2209d = true;
        c7489Dj1.f2218m = 0L;
        c7489Dj1.f2221p = -1L;
        c7489Dj1.f2219n = -1L;
        C7385Bj1 c7385Bj1 = c7489Dj1.f2207b;
        if (c7385Bj1 != null) {
            ChoreographerFrameCallbackC7437Cj1 choreographerFrameCallbackC7437Cj1 = c7489Dj1.f2208c;
            choreographerFrameCallbackC7437Cj1.getClass();
            choreographerFrameCallbackC7437Cj1.f1596b.sendEmptyMessage(2);
            Handler handlerM1829n = AbstractC7485Dh1.m1829n(null);
            DisplayManager displayManager = c7385Bj1.f994a;
            displayManager.registerDisplayListener(c7385Bj1, handlerM1829n);
            C7489Dj1.m1860a(c7385Bj1.f995b, displayManager.getDisplay(0));
        }
        c7489Dj1.m1863d(false);
    }

    /* renamed from: e */
    public final void m26527e() {
        this.f46960c = false;
        this.f46965h = -9223372036854775807L;
        C7489Dj1 c7489Dj1 = this.f46959b;
        c7489Dj1.f2209d = false;
        C7385Bj1 c7385Bj1 = c7489Dj1.f2207b;
        if (c7385Bj1 != null) {
            c7385Bj1.f994a.unregisterDisplayListener(c7385Bj1);
            ChoreographerFrameCallbackC7437Cj1 choreographerFrameCallbackC7437Cj1 = c7489Dj1.f2208c;
            choreographerFrameCallbackC7437Cj1.getClass();
            choreographerFrameCallbackC7437Cj1.f1596b.sendEmptyMessage(3);
        }
        c7489Dj1.m1861b();
    }

    /* renamed from: f */
    public final void m26528f(float f) {
        C7489Dj1 c7489Dj1 = this.f46959b;
        c7489Dj1.f2211f = f;
        C0787MV c0787mv = c7489Dj1.f2206a;
        c0787mv.f7192a.m5011c();
        c0787mv.f7193b.m5011c();
        c0787mv.f7194c = false;
        c0787mv.f7195d = -9223372036854775807L;
        c0787mv.f7196e = 0;
        c7489Dj1.m1862c();
    }
}
