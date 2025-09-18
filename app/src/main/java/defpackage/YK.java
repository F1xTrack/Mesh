package defpackage;

import javax.inject.Provider;

/* loaded from: classes.dex */
public final class YK implements Provider {
    public static final Object c = new Object();
    public volatile InterfaceC4347iS a;
    public volatile Object b;

    public static Provider a(InterfaceC4347iS interfaceC4347iS) {
        if (interfaceC4347iS instanceof YK) {
            return interfaceC4347iS;
        }
        YK yk = new YK();
        yk.b = c;
        yk.a = interfaceC4347iS;
        return yk;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.a.get();
                        Object obj3 = this.b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.b = obj;
                        this.a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
