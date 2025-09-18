package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8096y2 {
    public final ExecutorService a;
    public final HashMap b;
    public final ReferenceQueue c;
    public EO d;
    public volatile boolean e;

    public C8096y2() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC7716w2(0));
        this.b = new HashMap();
        this.c = new ReferenceQueue();
        this.a = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new GR0(1, this));
    }

    public final synchronized void a(IO io2, JO jo) {
        C7906x2 c7906x2 = (C7906x2) this.b.put(io2, new C7906x2(io2, jo, this.c));
        if (c7906x2 != null) {
            c7906x2.c = null;
            c7906x2.clear();
        }
    }

    public final void b(C7906x2 c7906x2) {
        InterfaceC5506kS0 interfaceC5506kS0;
        synchronized (this) {
            this.b.remove(c7906x2.a);
            if (c7906x2.b && (interfaceC5506kS0 = c7906x2.c) != null) {
                this.d.e(c7906x2.a, new JO(interfaceC5506kS0, true, false, c7906x2.a, this.d));
            }
        }
    }
}
