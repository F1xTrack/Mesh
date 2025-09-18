package p000;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: sP */
/* loaded from: classes.dex */
public final class C6821sP implements M51, InterfaceC9859jG0 {

    /* renamed from: a */
    public final HashMap f42418a = new HashMap();

    /* renamed from: b */
    public ArrayDeque f42419b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f42420c;

    public C6821sP(Executor executor) {
        this.f42420c = executor;
    }

    @Override // p000.InterfaceC9859jG0
    /* renamed from: a */
    public final void mo5003a(C6487nP c6487nP) {
        c6487nP.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.f42419b;
                if (arrayDeque != null) {
                    arrayDeque.add(c6487nP);
                    return;
                }
                for (Map.Entry entry : m24734b(c6487nP)) {
                    ((Executor) entry.getValue()).execute(new RunnableC3973eA(entry, 29, c6487nP));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final synchronized Set m24734b(C6487nP c6487nP) {
        Map map;
        try {
            HashMap map2 = this.f42418a;
            c6487nP.getClass();
            map = (Map) map2.get(C0328FC.class);
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* renamed from: c */
    public final synchronized void m24735c(Executor executor, InterfaceC0089BP interfaceC0089BP) {
        try {
            executor.getClass();
            if (!this.f42418a.containsKey(C0328FC.class)) {
                this.f42418a.put(C0328FC.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f42418a.get(C0328FC.class)).put(interfaceC0089BP, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: d */
    public final synchronized void m24736d(C3994eV c3994eV) {
        c3994eV.getClass();
        if (this.f42418a.containsKey(C0328FC.class)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f42418a.get(C0328FC.class);
            concurrentHashMap.remove(c3994eV);
            if (concurrentHashMap.isEmpty()) {
                this.f42418a.remove(C0328FC.class);
            }
        }
    }
}
