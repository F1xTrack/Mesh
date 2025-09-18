package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.InterfaceC3354j4;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.a5 */
/* loaded from: classes2.dex */
public class C3121a5<T, C extends InterfaceC3354j4> {

    /* renamed from: a */
    private final AbstractC3251f5<T> f23035a;

    /* renamed from: com.yandex.metrica.impl.ob.a5$a */
    public interface a<T> {
        /* renamed from: a */
        boolean mo15602a(T t, C3376k0 c3376k0);
    }

    public C3121a5(AbstractC3251f5<T> abstractC3251f5, C c) {
        this.f23035a = abstractC3251f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public boolean m15601a(C3376k0 c3376k0, a<T> aVar) {
        Iterator<Object> it = this.f23035a.mo15679a(c3376k0.m16244n()).m15703a().iterator();
        while (it.hasNext()) {
            if (aVar.mo15602a(it.next(), c3376k0)) {
                return true;
            }
        }
        return false;
    }
}
