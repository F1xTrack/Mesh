package p000;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: dG */
/* loaded from: classes.dex */
public class C3917dG {

    /* renamed from: a */
    public final C6224jE f25906a;

    /* renamed from: b */
    public final long f25907b;

    /* renamed from: c */
    public final long f25908c;

    /* renamed from: d */
    public final long f25909d;

    /* renamed from: e */
    public final long f25910e;

    /* renamed from: f */
    public final int f25911f;

    /* renamed from: g */
    public final boolean f25912g;

    /* renamed from: h */
    public final long f25913h;

    /* renamed from: i */
    public final HashMap f25914i;

    /* renamed from: j */
    public long f25915j;

    public C3917dG(C6224jE c6224jE, int i, int i2, int i3, int i4, boolean z, int i5) {
        m17516a(i3, "bufferForPlaybackMs", 0, "0");
        m17516a(i4, "bufferForPlaybackAfterRebufferMs", 0, "0");
        m17516a(i, "minBufferMs", i3, "bufferForPlaybackMs");
        m17516a(i, "minBufferMs", i4, "bufferForPlaybackAfterRebufferMs");
        m17516a(i2, "maxBufferMs", i, "minBufferMs");
        m17516a(i5, "backBufferDurationMs", 0, "0");
        this.f25906a = c6224jE;
        this.f25907b = AbstractC7485Dh1.m1802Q(i);
        this.f25908c = AbstractC7485Dh1.m1802Q(i2);
        this.f25909d = AbstractC7485Dh1.m1802Q(i3);
        this.f25910e = AbstractC7485Dh1.m1802Q(i4);
        this.f25911f = -1;
        this.f25912g = z;
        this.f25913h = AbstractC7485Dh1.m1802Q(i5);
        this.f25914i = new HashMap();
        this.f25915j = -1L;
    }

    /* renamed from: a */
    public static void m17516a(int i, String str, int i2, String str2) {
        YN1.m9277b(str + " cannot be less than " + str2, i >= i2);
    }

    /* renamed from: b */
    public final int m17517b() {
        Iterator it = this.f25914i.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C1836cG) it.next()).f17399b;
        }
        return i;
    }

    /* renamed from: c */
    public final boolean m17518c(C9151dk0 c9151dk0) {
        int i;
        C1836cG c1836cG = (C1836cG) this.f25914i.get(c9151dk0.f26232a);
        c1836cG.getClass();
        C6224jE c6224jE = this.f25906a;
        synchronized (c6224jE) {
            i = c6224jE.f34991c * c6224jE.f34989a;
        }
        boolean z = true;
        boolean z2 = i >= m17517b();
        float f = c9151dk0.f26234c;
        long j = this.f25908c;
        long jMin = this.f25907b;
        if (f > 1.0f) {
            jMin = Math.min(AbstractC7485Dh1.m1840y(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = c9151dk0.f26233b;
        if (j2 < jMax) {
            if (!this.f25912g && z2) {
                z = false;
            }
            c1836cG.f17398a = z;
            if (!z && j2 < 500000) {
                AbstractC10872rA1.m24175h("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z2) {
            c1836cG.f17398a = false;
        }
        return c1836cG.f17398a;
    }

    /* renamed from: d */
    public final void m17519d() {
        if (!this.f25914i.isEmpty()) {
            this.f25906a.m22007b(m17517b());
            return;
        }
        C6224jE c6224jE = this.f25906a;
        synchronized (c6224jE) {
            if (c6224jE.f34993e) {
                c6224jE.m22007b(0);
            }
        }
    }
}
