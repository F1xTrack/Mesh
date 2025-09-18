package p000;

import android.os.SystemClock;
import java.util.List;

/* renamed from: f30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9320f30 extends AbstractC0358Fg {

    /* renamed from: g */
    public int f27024g;

    @Override // p000.InterfaceC6237jR
    /* renamed from: c */
    public final void mo6373c(long j, long j2, long j3, List list, InterfaceC7550Eo0[] interfaceC7550Eo0Arr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (mo2723b(this.f27024g, jElapsedRealtime)) {
            for (int i = this.f3383b - 1; i >= 0; i--) {
                if (!mo2723b(i, jElapsedRealtime)) {
                    this.f27024g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: e */
    public final int mo6374e() {
        return this.f27024g;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: n */
    public final int mo6375n() {
        return 0;
    }

    @Override // p000.InterfaceC6237jR
    /* renamed from: q */
    public final Object mo6376q() {
        return null;
    }
}
