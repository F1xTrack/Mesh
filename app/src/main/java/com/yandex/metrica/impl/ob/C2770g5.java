package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2620a5;
import com.yandex.metrica.impl.ob.C2744f4;
import com.yandex.metrica.impl.ob.InterfaceC2944n5;

/* renamed from: com.yandex.metrica.impl.ob.g5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2770g5<T extends InterfaceC2944n5, C extends C2744f4> extends C2620a5<T, C> {

    /* renamed from: com.yandex.metrica.impl.ob.g5$a */
    public class a implements C2620a5.a<T> {
        public a(C2770g5 c2770g5) {
        }

        @Override // com.yandex.metrica.impl.ob.C2620a5.a
        public boolean a(Object obj, C2864k0 c2864k0) {
            return ((InterfaceC2944n5) obj).a(c2864k0);
        }
    }

    public C2770g5(AbstractC2745f5<T> abstractC2745f5, C c) {
        super(abstractC2745f5, c);
    }

    public boolean a(C2864k0 c2864k0) {
        return a(c2864k0, new a(this));
    }
}
