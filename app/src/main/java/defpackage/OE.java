package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class OE {
    public final /* synthetic */ PE a;

    public final void a(int i) {
        PE pe = this.a;
        synchronized (pe) {
            int i2 = pe.m;
            if (i2 == 0 || pe.d) {
                if (i2 == i) {
                    return;
                }
                pe.m = i;
                if (i != 1 && i != 0 && i != 8) {
                    pe.k = pe.b(i);
                    pe.c.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    pe.c(pe.f > 0 ? (int) (jElapsedRealtime - pe.g) : 0, pe.h, pe.k);
                    pe.g = jElapsedRealtime;
                    pe.h = 0L;
                    pe.j = 0L;
                    pe.i = 0L;
                    C5236j21 c5236j21 = pe.e;
                    ((ArrayList) c5236j21.f).clear();
                    c5236j21.b = -1;
                    c5236j21.c = 0;
                    c5236j21.d = 0;
                }
            }
        }
    }
}
