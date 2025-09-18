package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Zh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8628Zh0 implements InterfaceC9347fG0 {

    /* renamed from: a */
    public volatile Set f15094a;

    /* renamed from: b */
    public volatile Set f15095b;

    /* renamed from: a */
    public final synchronized void m9577a() {
        try {
            Iterator it = this.f15094a.iterator();
            while (it.hasNext()) {
                this.f15095b.add(((InterfaceC9347fG0) it.next()).get());
            }
            this.f15094a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC9347fG0
    public final Object get() {
        if (this.f15095b == null) {
            synchronized (this) {
                try {
                    if (this.f15095b == null) {
                        this.f15095b = Collections.newSetFromMap(new ConcurrentHashMap());
                        m9577a();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f15095b);
    }
}
