package p000;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Ni1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8007Ni1 extends AbstractC6511nn {

    /* renamed from: a */
    public boolean f7970a = true;

    /* renamed from: b */
    public final /* synthetic */ AtomicBoolean f7971b;

    /* renamed from: c */
    public final /* synthetic */ C0300El f7972c;

    /* renamed from: d */
    public final /* synthetic */ C11303uY0 f7973d;

    public C8007Ni1(AtomicBoolean atomicBoolean, C0300El c0300El, C11303uY0 c11303uY0) {
        this.f7971b = atomicBoolean;
        this.f7972c = c0300El;
        this.f7973d = c11303uY0;
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: b */
    public final void mo5817b(int i, InterfaceC7034vn interfaceC7034vn) {
        Object obj;
        if (this.f7970a) {
            this.f7970a = false;
            interfaceC7034vn.getTimestamp();
            SystemClock.uptimeMillis();
            SystemClock.elapsedRealtime();
            AbstractC7806Jm0.m4412f("VideoCapture");
        }
        AtomicBoolean atomicBoolean = this.f7971b;
        if (atomicBoolean.get() || (obj = interfaceC7034vn.mo385b().f42279a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        C0300El c0300El = this.f7972c;
        if (iIntValue == c0300El.hashCode() && c0300El.m2375b(null) && !atomicBoolean.getAndSet(true)) {
            QR1.m6710h().execute(new O91(this, 5, this.f7973d));
        }
    }
}
