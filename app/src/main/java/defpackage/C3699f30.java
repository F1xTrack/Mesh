package defpackage;

import android.os.SystemClock;
import java.util.List;

/* renamed from: f30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3699f30 extends AbstractC0428Fg {
    public int g;

    @Override // defpackage.InterfaceC5311jR
    public final void c(long j, long j2, long j3, List list, InterfaceC0375Eo0[] interfaceC0375Eo0Arr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (b(this.g, jElapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!b(i, jElapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.InterfaceC5311jR
    public final int e() {
        return this.g;
    }

    @Override // defpackage.InterfaceC5311jR
    public final int n() {
        return 0;
    }

    @Override // defpackage.InterfaceC5311jR
    public final Object q() {
        return null;
    }
}
