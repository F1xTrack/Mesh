package com.yandex.metrica.impl.p022ob;

import java.util.List;
import p000.C11474vt1;

/* renamed from: com.yandex.metrica.impl.ob.v3 */
/* loaded from: classes2.dex */
public class C3665v3 implements InterfaceC3609t {

    /* renamed from: a */
    private final InterfaceC3432m4 f24973a;

    /* renamed from: b */
    private final InterfaceExecutorC3607sn f24974b;

    /* renamed from: com.yandex.metrica.impl.ob.v3$a */
    public class a extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ C11474vt1 f24975a;

        public a(C11474vt1 c11474vt1) {
            this.f24975a = c11474vt1;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws Exception {
            InterfaceC3432m4 interfaceC3432m4 = C3665v3.this.f24973a;
            C3665v3 c3665v3 = C3665v3.this;
            C11474vt1 c11474vt1 = this.f24975a;
            c3665v3.getClass();
            interfaceC3432m4.mo15171a(C3376k0.m16207a().mo15099a(new C2495B3(c11474vt1).m13916a()));
        }
    }

    public C3665v3(InterfaceC3432m4 interfaceC3432m4, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this.f24973a = interfaceC3432m4;
        this.f24974b = interfaceExecutorC3607sn;
    }

    /* renamed from: a */
    public void m16946a(List<C11474vt1> list) {
        for (C11474vt1 c11474vt1 : list) {
            ((C3581rn) this.f24974b).execute(new a(c11474vt1));
        }
    }
}
