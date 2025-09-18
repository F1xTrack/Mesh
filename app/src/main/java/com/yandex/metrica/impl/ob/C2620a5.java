package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.InterfaceC2843j4;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.a5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2620a5<T, C extends InterfaceC2843j4> {
    private final AbstractC2745f5<T> a;

    /* renamed from: com.yandex.metrica.impl.ob.a5$a */
    public interface a<T> {
        boolean a(T t, C2864k0 c2864k0);
    }

    public C2620a5(AbstractC2745f5<T> abstractC2745f5, C c) {
        this.a = abstractC2745f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean a(C2864k0 c2864k0, a<T> aVar) {
        Iterator<Object> it = this.a.a(c2864k0.n()).a().iterator();
        while (it.hasNext()) {
            if (aVar.a(it.next(), c2864k0)) {
                return true;
            }
        }
        return false;
    }
}
