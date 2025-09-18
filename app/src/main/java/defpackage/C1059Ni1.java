package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Ni1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059Ni1 extends AbstractC6141nn {
    public boolean a = true;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ C0365El c;
    public final /* synthetic */ C7433uY0 d;

    public C1059Ni1(AtomicBoolean atomicBoolean, C0365El c0365El, C7433uY0 c7433uY0) {
        this.b = atomicBoolean;
        this.c = c0365El;
        this.d = c7433uY0;
    }

    @Override // defpackage.AbstractC6141nn
    public final void b(int i, InterfaceC7668vn interfaceC7668vn) {
        Object obj;
        if (this.a) {
            this.a = false;
            interfaceC7668vn.getTimestamp();
            SystemClock.uptimeMillis();
            SystemClock.elapsedRealtime();
            AbstractC0759Jm0.f("VideoCapture");
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get() || (obj = interfaceC7668vn.b().a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        C0365El c0365El = this.c;
        if (iIntValue == c0365El.hashCode() && c0365El.b(null) && !atomicBoolean.getAndSet(true)) {
            QR1.h().execute(new O91(this, 5, this.d));
        }
    }
}
