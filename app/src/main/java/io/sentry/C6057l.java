package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;

/* renamed from: io.sentry.l */
/* loaded from: classes2.dex */
public final class C6057l extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ int f34223a;

    /* renamed from: b */
    public final /* synthetic */ C6060m f34224b;

    public /* synthetic */ C6057l(C6060m c6060m, int i) {
        this.f34223a = i;
        this.f34224b = c6060m;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f34223a) {
            case 0:
                Iterator it = this.f34224b.f34231d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5790O) it.next()).mo21451c();
                }
                break;
            default:
                long jCurrentTimeMillis = System.currentTimeMillis();
                C6060m c6060m = this.f34224b;
                if (jCurrentTimeMillis - c6060m.f34236i >= 10) {
                    c6060m.f34236i = jCurrentTimeMillis;
                    C5755C0 c5755c0 = new C5755C0();
                    c5755c0.f33224a = null;
                    c5755c0.f33225b = null;
                    Iterator it2 = c6060m.f34231d.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC5790O) it2.next()).mo21450a(c5755c0);
                    }
                    Iterator it3 = c6060m.f34230c.values().iterator();
                    while (it3.hasNext()) {
                        ((List) it3.next()).add(c5755c0);
                    }
                    break;
                }
                break;
        }
    }
}
