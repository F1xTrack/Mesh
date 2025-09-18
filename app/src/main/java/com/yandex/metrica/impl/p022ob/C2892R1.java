package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.yandex.metrica.impl.ob.R1 */
/* loaded from: classes2.dex */
public class C2892R1 extends C3685vn implements InterfaceC2594F2 {

    /* renamed from: b */
    private final Executor f22093b;

    /* renamed from: g */
    private volatile b f22098g;

    /* renamed from: h */
    private C2904Rd f22099h;

    /* renamed from: i */
    private final C2676I9 f22100i;

    /* renamed from: d */
    private final BlockingQueue<b> f22095d = new LinkedBlockingQueue();

    /* renamed from: e */
    private final Object f22096e = new Object();

    /* renamed from: f */
    private final Object f22097f = new Object();

    /* renamed from: c */
    private Executor f22094c = new ExecutorC3503on();

    /* renamed from: com.yandex.metrica.impl.ob.R1$b */
    public static class b {

        /* renamed from: a */
        final AbstractC2942T1 f22101a;

        /* renamed from: b */
        private final String f22102b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            return this.f22102b.equals(((b) obj).f22102b);
        }

        public int hashCode() {
            return this.f22102b.hashCode();
        }

        private b(AbstractC2942T1 abstractC2942T1) {
            this.f22101a = abstractC2942T1;
            this.f22102b = abstractC2942T1.mo14457a();
        }
    }

    public C2892R1(Context context, Executor executor, C2676I9 c2676i9) {
        this.f22093b = executor;
        this.f22100i = c2676i9;
        this.f22099h = new C2904Rd(context);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2594F2
    /* renamed from: a */
    public void mo14019a() {
    }

    /* renamed from: b */
    public void m14967b(AbstractC2942T1 abstractC2942T1) {
        synchronized (this.f22096e) {
            try {
                b bVar = new b(abstractC2942T1);
                if (mo16707c() && !this.f22095d.contains(bVar) && !bVar.equals(this.f22098g) && bVar.f22101a.m15162u()) {
                    this.f22095d.offer(bVar);
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        AbstractC2942T1 abstractC2942T1 = null;
        while (mo16707c()) {
            try {
                synchronized (this.f22097f) {
                }
                this.f22098g = this.f22095d.take();
                abstractC2942T1 = this.f22098g.f22101a;
                (abstractC2942T1.mo14467z() ? this.f22093b : this.f22094c).execute(m14966a(abstractC2942T1));
                synchronized (this.f22097f) {
                    this.f22098g = null;
                    abstractC2942T1.mo15164w();
                    abstractC2942T1.mo15165x();
                }
            } catch (InterruptedException unused) {
                synchronized (this.f22097f) {
                    try {
                        this.f22098g = null;
                        if (abstractC2942T1 != null) {
                            abstractC2942T1.mo15164w();
                            abstractC2942T1.mo15165x();
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f22097f) {
                    try {
                        this.f22098g = null;
                        if (abstractC2942T1 != null) {
                            abstractC2942T1.mo15164w();
                            abstractC2942T1.mo15165x();
                        }
                        throw th;
                    } finally {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public RunnableC3017W1 m14966a(AbstractC2942T1 abstractC2942T1) {
        return new RunnableC3017W1(this.f22099h, new C2929Sd(new C2954Td(this.f22100i, abstractC2942T1.mo14459b()), abstractC2942T1.mo14461j()), abstractC2942T1, this, new C2992V1(), "NetworkTaskQueue");
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2594F2
    /* renamed from: b */
    public void mo14021b() {
        synchronized (this.f22097f) {
            try {
                b bVar = this.f22098g;
                if (bVar != null) {
                    bVar.f22101a.mo15165x();
                }
                ArrayList arrayList = new ArrayList(this.f22095d.size());
                this.f22095d.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).f22101a.mo15165x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
