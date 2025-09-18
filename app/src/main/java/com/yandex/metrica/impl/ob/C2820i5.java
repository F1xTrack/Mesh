package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.AbstractC2795h5;
import com.yandex.metrica.impl.ob.C2620a5;
import com.yandex.metrica.impl.ob.Z3;

/* renamed from: com.yandex.metrica.impl.ob.i5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2820i5<T extends AbstractC2795h5, C extends Z3> extends C2620a5<T, C> {

    /* renamed from: com.yandex.metrica.impl.ob.i5$a */
    public class a implements C2620a5.a<T> {
        final /* synthetic */ H4 a;

        public a(C2820i5 c2820i5, H4 h4) {
            this.a = h4;
        }

        @Override // com.yandex.metrica.impl.ob.C2620a5.a
        public boolean a(Object obj, C2864k0 c2864k0) {
            return ((AbstractC2795h5) obj).a(c2864k0, this.a);
        }
    }

    public C2820i5(AbstractC2745f5<T> abstractC2745f5, C c) {
        super(abstractC2745f5, c);
    }

    public boolean a(C2864k0 c2864k0, H4 h4) {
        return a(c2864k0, new a(this, h4));
    }
}
