package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: dG */
/* loaded from: classes.dex */
public class C3357dG {
    public final C5272jE a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final HashMap i;
    public long j;

    public C3357dG(C5272jE c5272jE, int i, int i2, int i3, int i4, boolean z, int i5) {
        a(i3, "bufferForPlaybackMs", 0, "0");
        a(i4, "bufferForPlaybackAfterRebufferMs", 0, "0");
        a(i, "minBufferMs", i3, "bufferForPlaybackMs");
        a(i, "minBufferMs", i4, "bufferForPlaybackAfterRebufferMs");
        a(i2, "maxBufferMs", i, "minBufferMs");
        a(i5, "backBufferDurationMs", 0, "0");
        this.a = c5272jE;
        this.b = AbstractC0277Dh1.Q(i);
        this.c = AbstractC0277Dh1.Q(i2);
        this.d = AbstractC0277Dh1.Q(i3);
        this.e = AbstractC0277Dh1.Q(i4);
        this.f = -1;
        this.g = z;
        this.h = AbstractC0277Dh1.Q(i5);
        this.i = new HashMap();
        this.j = -1L;
    }

    public static void a(int i, String str, int i2, String str2) {
        YN1.b(str + " cannot be less than " + str2, i >= i2);
    }

    public final int b() {
        Iterator it = this.i.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C2481cG) it.next()).b;
        }
        return i;
    }

    public final boolean c(C3448dk0 c3448dk0) {
        int i;
        C2481cG c2481cG = (C2481cG) this.i.get(c3448dk0.a);
        c2481cG.getClass();
        C5272jE c5272jE = this.a;
        synchronized (c5272jE) {
            i = c5272jE.c * c5272jE.a;
        }
        boolean z = true;
        boolean z2 = i >= b();
        float f = c3448dk0.c;
        long j = this.c;
        long jMin = this.b;
        if (f > 1.0f) {
            jMin = Math.min(AbstractC0277Dh1.y(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = c3448dk0.b;
        if (j2 < jMax) {
            if (!this.g && z2) {
                z = false;
            }
            c2481cG.a = z;
            if (!z && j2 < 500000) {
                AbstractC6789rA1.h("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z2) {
            c2481cG.a = false;
        }
        return c2481cG.a;
    }

    public final void d() {
        if (!this.i.isEmpty()) {
            this.a.b(b());
            return;
        }
        C5272jE c5272jE = this.a;
        synchronized (c5272jE) {
            if (c5272jE.e) {
                c5272jE.b(0);
            }
        }
    }
}
