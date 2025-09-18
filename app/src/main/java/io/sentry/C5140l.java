package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;

/* renamed from: io.sentry.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5140l extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ C5143m b;

    public /* synthetic */ C5140l(C5143m c5143m, int i) {
        this.a = i;
        this.b = c5143m;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Iterator it = this.b.d.iterator();
                while (it.hasNext()) {
                    ((O) it.next()).c();
                }
                break;
            default:
                long jCurrentTimeMillis = System.currentTimeMillis();
                C5143m c5143m = this.b;
                if (jCurrentTimeMillis - c5143m.i >= 10) {
                    c5143m.i = jCurrentTimeMillis;
                    C0 c0 = new C0();
                    c0.a = null;
                    c0.b = null;
                    Iterator it2 = c5143m.d.iterator();
                    while (it2.hasNext()) {
                        ((O) it2.next()).a(c0);
                    }
                    Iterator it3 = c5143m.c.values().iterator();
                    while (it3.hasNext()) {
                        ((List) it3.next()).add(c0);
                    }
                    break;
                }
                break;
        }
    }
}
