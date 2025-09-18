package defpackage;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: sP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7023sP implements M51, InterfaceC5279jG0 {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public C7023sP(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.InterfaceC5279jG0
    public final void a(C6069nP c6069nP) {
        c6069nP.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.b;
                if (arrayDeque != null) {
                    arrayDeque.add(c6069nP);
                    return;
                }
                for (Map.Entry entry : b(c6069nP)) {
                    ((Executor) entry.getValue()).execute(new RunnableC3529eA(entry, 29, c6069nP));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Set b(C6069nP c6069nP) {
        Map map;
        try {
            HashMap map2 = this.a;
            c6069nP.getClass();
            map = (Map) map2.get(FC.class);
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    public final synchronized void c(Executor executor, BP bp) {
        try {
            executor.getClass();
            if (!this.a.containsKey(FC.class)) {
                this.a.put(FC.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(FC.class)).put(bp, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(C3592eV c3592eV) {
        c3592eV.getClass();
        if (this.a.containsKey(FC.class)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a.get(FC.class);
            concurrentHashMap.remove(c3592eV);
            if (concurrentHashMap.isEmpty()) {
                this.a.remove(FC.class);
            }
        }
    }
}
