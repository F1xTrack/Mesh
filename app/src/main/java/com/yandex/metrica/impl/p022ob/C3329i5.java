package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.AbstractC3303h5;
import com.yandex.metrica.impl.p022ob.C3094Z3;
import com.yandex.metrica.impl.p022ob.C3121a5;

/* renamed from: com.yandex.metrica.impl.ob.i5 */
/* loaded from: classes2.dex */
public class C3329i5<T extends AbstractC3303h5, C extends C3094Z3> extends C3121a5<T, C> {

    /* renamed from: com.yandex.metrica.impl.ob.i5$a */
    public class a implements C3121a5.a<T> {

        /* renamed from: a */
        final /* synthetic */ C2646H4 f23626a;

        public a(C3329i5 c3329i5, C2646H4 c2646h4) {
            this.f23626a = c2646h4;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3121a5.a
        /* renamed from: a */
        public boolean mo15602a(Object obj, C3376k0 c3376k0) {
            return ((AbstractC3303h5) obj).mo16029a(c3376k0, this.f23626a);
        }
    }

    public C3329i5(AbstractC3251f5<T> abstractC3251f5, C c) {
        super(abstractC3251f5, c);
    }

    /* renamed from: a */
    public boolean m16082a(C3376k0 c3376k0, C2646H4 c2646h4) {
        return m15601a(c3376k0, new a(this, c2646h4));
    }
}
