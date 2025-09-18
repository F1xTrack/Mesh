package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3121a5;
import com.yandex.metrica.impl.p022ob.C3250f4;
import com.yandex.metrica.impl.p022ob.InterfaceC3459n5;

/* renamed from: com.yandex.metrica.impl.ob.g5 */
/* loaded from: classes2.dex */
public class C3277g5<T extends InterfaceC3459n5, C extends C3250f4> extends C3121a5<T, C> {

    /* renamed from: com.yandex.metrica.impl.ob.g5$a */
    public class a implements C3121a5.a<T> {
        public a(C3277g5 c3277g5) {
        }

        @Override // com.yandex.metrica.impl.p022ob.C3121a5.a
        /* renamed from: a */
        public boolean mo15602a(Object obj, C3376k0 c3376k0) {
            return ((InterfaceC3459n5) obj).mo13844a(c3376k0);
        }
    }

    public C3277g5(AbstractC3251f5<T> abstractC3251f5, C c) {
        super(abstractC3251f5, c);
    }

    /* renamed from: a */
    public boolean m15978a(C3376k0 c3376k0) {
        return m15601a(c3376k0, new a(this));
    }
}
