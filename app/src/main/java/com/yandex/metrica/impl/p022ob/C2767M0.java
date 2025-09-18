package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3687w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.M0 */
/* loaded from: classes2.dex */
public class C2767M0 {

    /* renamed from: a */
    private final List<d> f21684a = new ArrayList();

    /* renamed from: b */
    private C2885Qi f21685b;

    /* renamed from: com.yandex.metrica.impl.ob.M0$b */
    public static class b {

        /* renamed from: a */
        private boolean f21686a = false;

        /* renamed from: b */
        private long f21687b;

        /* renamed from: c */
        private long f21688c;

        /* renamed from: d */
        private long f21689d;

        /* renamed from: e */
        private final c f21690e;

        public b(C2885Qi c2885Qi, c cVar, String str) {
            this.f21690e = cVar;
            this.f21688c = c2885Qi == null ? 0L : c2885Qi.m14890p();
            this.f21687b = c2885Qi != null ? c2885Qi.m14853B() : 0L;
            this.f21689d = Long.MAX_VALUE;
        }

        /* renamed from: a */
        public void m14573a(long j, TimeUnit timeUnit) {
            this.f21689d = timeUnit.toMillis(j);
        }

        /* renamed from: b */
        public boolean m14575b() {
            if (this.f21686a) {
                return true;
            }
            c cVar = this.f21690e;
            long j = this.f21688c;
            long j2 = this.f21687b;
            long j3 = this.f21689d;
            cVar.getClass();
            return j2 - j >= j3;
        }

        /* renamed from: a */
        public void m14572a() {
            this.f21686a = true;
        }

        /* renamed from: a */
        public void m14574a(C2885Qi c2885Qi) {
            this.f21687b = c2885Qi.m14853B();
            this.f21688c = c2885Qi.m14890p();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M0$c */
    public static class c {
    }

    /* renamed from: com.yandex.metrica.impl.ob.M0$d */
    public static class d {

        /* renamed from: a */
        private b f21691a;

        /* renamed from: b */
        private final C3687w.b f21692b;

        /* renamed from: c */
        private final InterfaceExecutorC3607sn f21693c;

        /* renamed from: a */
        public void m14577a(C2885Qi c2885Qi) {
            this.f21691a.m14574a(c2885Qi);
        }

        private d(InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3687w.b bVar, b bVar2) {
            this.f21692b = bVar;
            this.f21691a = bVar2;
            this.f21693c = interfaceExecutorC3607sn;
        }

        /* renamed from: a */
        public void m14576a(long j) {
            this.f21691a.m14573a(j, TimeUnit.SECONDS);
        }

        /* renamed from: a */
        public boolean m14578a(int i) {
            if (!this.f21691a.m14575b()) {
                return false;
            }
            this.f21692b.m17105a(TimeUnit.SECONDS.toMillis(i), this.f21693c);
            this.f21691a.m14572a();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized d m14570a(Runnable runnable, InterfaceExecutorC3607sn interfaceExecutorC3607sn, String str) {
        d dVar;
        C3687w.b bVar = new C3687w.b(runnable, C2842P0.m14728i().m14729a());
        b bVar2 = new b(this.f21685b, new c(), str);
        synchronized (this) {
            dVar = new d(interfaceExecutorC3607sn, bVar, bVar2);
            this.f21684a.add(dVar);
        }
        return dVar;
        return dVar;
    }

    /* renamed from: a */
    public void m14571a(C2885Qi c2885Qi) {
        ArrayList arrayList;
        synchronized (this) {
            this.f21685b = c2885Qi;
            arrayList = new ArrayList(this.f21684a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d) it.next()).m14577a(c2885Qi);
        }
    }
}
