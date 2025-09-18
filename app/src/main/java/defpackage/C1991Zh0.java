package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Zh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1991Zh0 implements InterfaceC3739fG0 {
    public volatile Set a;
    public volatile Set b;

    public final synchronized void a() {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b.add(((InterfaceC3739fG0) it.next()).get());
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC3739fG0
    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
