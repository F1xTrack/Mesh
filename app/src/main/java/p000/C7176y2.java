package p000;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: y2 */
/* loaded from: classes.dex */
public final class C7176y2 {

    /* renamed from: a */
    public final ExecutorService f46038a;

    /* renamed from: b */
    public final HashMap f46039b;

    /* renamed from: c */
    public final ReferenceQueue f46040c;

    /* renamed from: d */
    public C0277EO f46041d;

    /* renamed from: e */
    public volatile boolean f46042e;

    public C7176y2() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC7050w2(0));
        this.f46039b = new HashMap();
        this.f46040c = new ReferenceQueue();
        this.f46038a = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new GR0(1, this));
    }

    /* renamed from: a */
    public final synchronized void m26034a(C0529IO c0529io, C0592JO c0592jo) {
        C7113x2 c7113x2 = (C7113x2) this.f46039b.put(c0529io, new C7113x2(c0529io, c0592jo, this.f46040c));
        if (c7113x2 != null) {
            c7113x2.f45279c = null;
            c7113x2.clear();
        }
    }

    /* renamed from: b */
    public final void m26035b(C7113x2 c7113x2) {
        InterfaceC10011kS0 interfaceC10011kS0;
        synchronized (this) {
            this.f46039b.remove(c7113x2.f45277a);
            if (c7113x2.f45278b && (interfaceC10011kS0 = c7113x2.f45279c) != null) {
                this.f46041d.m2206e(c7113x2.f45277a, new C0592JO(interfaceC10011kS0, true, false, c7113x2.f45277a, this.f46041d));
            }
        }
    }
}
