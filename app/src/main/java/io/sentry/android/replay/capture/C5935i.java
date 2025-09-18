package io.sentry.android.replay.capture;

import io.sentry.C5760E;
import io.sentry.C5765F1;
import io.sentry.C5776J0;
import io.sentry.C6193y;
import p000.O90;

/* renamed from: io.sentry.android.replay.capture.i */
/* loaded from: classes2.dex */
public final class C5935i extends AbstractC5937k {

    /* renamed from: a */
    public final C5765F1 f33950a;

    /* renamed from: b */
    public final C5776J0 f33951b;

    public C5935i(C5765F1 c5765f1, C5776J0 c5776j0) {
        this.f33950a = c5765f1;
        this.f33951b = c5776j0;
    }

    /* renamed from: a */
    public static void m21666a(C5935i c5935i, C5760E c5760e) {
        C6193y c6193y = new C6193y();
        c5935i.getClass();
        if (c5760e != null) {
            c6193y.f34744f = c5935i.f33951b;
            c5760e.mo21380z(c5935i.f33950a, c6193y);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5935i)) {
            return false;
        }
        C5935i c5935i = (C5935i) obj;
        return O90.m5963a(this.f33950a, c5935i.f33950a) && O90.m5963a(this.f33951b, c5935i.f33951b);
    }

    public final int hashCode() {
        return this.f33951b.hashCode() + (this.f33950a.hashCode() * 31);
    }

    public final String toString() {
        return "Created(replay=" + this.f33950a + ", recording=" + this.f33951b + ')';
    }
}
