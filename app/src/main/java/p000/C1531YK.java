package p000;

import javax.inject.Provider;

/* renamed from: YK */
/* loaded from: classes.dex */
public final class C1531YK implements Provider {

    /* renamed from: c */
    public static final Object f14244c = new Object();

    /* renamed from: a */
    public volatile InterfaceC4243iS f14245a;

    /* renamed from: b */
    public volatile Object f14246b;

    /* renamed from: a */
    public static Provider m9257a(InterfaceC4243iS interfaceC4243iS) {
        if (interfaceC4243iS instanceof C1531YK) {
            return interfaceC4243iS;
        }
        C1531YK c1531yk = new C1531YK();
        c1531yk.f14246b = f14244c;
        c1531yk.f14245a = interfaceC4243iS;
        return c1531yk;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj = this.f14246b;
        Object obj2 = f14244c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f14246b;
                    if (obj == obj2) {
                        obj = this.f14245a.get();
                        Object obj3 = this.f14246b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f14246b = obj;
                        this.f14245a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
