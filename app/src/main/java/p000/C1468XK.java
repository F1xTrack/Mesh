package p000;

import javax.inject.Provider;

/* renamed from: XK */
/* loaded from: classes2.dex */
public final class C1468XK implements Provider {

    /* renamed from: c */
    public static final Object f13673c = new Object();

    /* renamed from: a */
    public volatile C0487Hj f13674a;

    /* renamed from: b */
    public volatile Object f13675b;

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj = this.f13675b;
        Object obj2 = f13673c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f13675b;
                    if (obj == obj2) {
                        obj = this.f13674a.get();
                        Object obj3 = this.f13675b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f13675b = obj;
                        this.f13674a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
