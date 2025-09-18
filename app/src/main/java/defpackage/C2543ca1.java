package defpackage;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

/* renamed from: ca1 */
/* loaded from: classes.dex */
public final class C2543ca1 implements QD0 {
    public final C2328bS0 a;
    public int b;
    public final ConcurrentLinkedQueue c;
    public final ExecutorService d;

    public C2543ca1(ExecutorService executorService, C2328bS0 c2328bS0) {
        executorService.getClass();
        this.d = executorService;
        this.a = c2328bS0;
        this.c = new ConcurrentLinkedQueue();
        this.b = 0;
    }

    @Override // defpackage.QD0
    public final void a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        boolean z;
        ((C7647vg) rd0).c.j(rd0, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.b;
                z = true;
                if (i >= 5) {
                    this.c.add(Pair.create(abstractC1516Tf, rd0));
                } else {
                    this.b = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        ((C7647vg) rd0).c.a(rd0, "ThrottlingProducer", null);
        this.a.a(new C2353ba1(this, abstractC1516Tf), rd0);
    }
}
