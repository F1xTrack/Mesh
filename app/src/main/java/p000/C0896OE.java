package p000;

import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: OE */
/* loaded from: classes.dex */
public final /* synthetic */ class C0896OE {

    /* renamed from: a */
    public final /* synthetic */ C0959PE f8316a;

    /* renamed from: a */
    public final void m5998a(int i) {
        C0959PE c0959pe = this.f8316a;
        synchronized (c0959pe) {
            int i2 = c0959pe.f8929m;
            if (i2 == 0 || c0959pe.f8920d) {
                if (i2 == i) {
                    return;
                }
                c0959pe.f8929m = i;
                if (i != 1 && i != 0 && i != 8) {
                    c0959pe.f8927k = c0959pe.m6270b(i);
                    c0959pe.f8919c.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c0959pe.m6271c(c0959pe.f8922f > 0 ? (int) (jElapsedRealtime - c0959pe.f8923g) : 0, c0959pe.f8924h, c0959pe.f8927k);
                    c0959pe.f8923g = jElapsedRealtime;
                    c0959pe.f8924h = 0L;
                    c0959pe.f8926j = 0L;
                    c0959pe.f8925i = 0L;
                    C9830j21 c9830j21 = c0959pe.f8921e;
                    ((ArrayList) c9830j21.f34862f).clear();
                    c9830j21.f34858b = -1;
                    c9830j21.f34859c = 0;
                    c9830j21.f34860d = 0;
                }
            }
        }
    }
}
