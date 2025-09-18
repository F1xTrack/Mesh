package p000;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

/* renamed from: ca1 */
/* loaded from: classes.dex */
public final class C8999ca1 implements QD0 {

    /* renamed from: a */
    public final C8854bS0 f17627a;

    /* renamed from: b */
    public int f17628b;

    /* renamed from: c */
    public final ConcurrentLinkedQueue f17629c;

    /* renamed from: d */
    public final ExecutorService f17630d;

    public C8999ca1(ExecutorService executorService, C8854bS0 c8854bS0) {
        executorService.getClass();
        this.f17630d = executorService;
        this.f17627a = c8854bS0;
        this.f17629c = new ConcurrentLinkedQueue();
        this.f17628b = 0;
    }

    @Override // p000.QD0
    /* renamed from: a */
    public final void mo312a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        boolean z;
        ((C7027vg) rd0).f44475c.mo752j(rd0, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.f17628b;
                z = true;
                if (i >= 5) {
                    this.f17629c.add(Pair.create(abstractC1237Tf, rd0));
                } else {
                    this.f17628b = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        ((C7027vg) rd0).f44475c.mo743a(rd0, "ThrottlingProducer", null);
        this.f17627a.mo312a(new C8871ba1(this, abstractC1237Tf), rd0);
    }
}
