package com.yandex.metrica.impl.ob;

import defpackage.C7688vt1;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3141v3 implements InterfaceC3087t {
    private final InterfaceC2918m4 a;
    private final InterfaceExecutorC3086sn b;

    /* renamed from: com.yandex.metrica.impl.ob.v3$a */
    public class a extends Km {
        final /* synthetic */ C7688vt1 a;

        public a(C7688vt1 c7688vt1) {
            this.a = c7688vt1;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            InterfaceC2918m4 interfaceC2918m4 = C3141v3.this.a;
            C3141v3 c3141v3 = C3141v3.this;
            C7688vt1 c7688vt1 = this.a;
            c3141v3.getClass();
            interfaceC2918m4.a(C2864k0.a().a(new B3(c7688vt1).a()));
        }
    }

    public C3141v3(InterfaceC2918m4 interfaceC2918m4, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this.a = interfaceC2918m4;
        this.b = interfaceExecutorC3086sn;
    }

    public void a(List<C7688vt1> list) {
        for (C7688vt1 c7688vt1 : list) {
            ((C3061rn) this.b).execute(new a(c7688vt1));
        }
    }
}
