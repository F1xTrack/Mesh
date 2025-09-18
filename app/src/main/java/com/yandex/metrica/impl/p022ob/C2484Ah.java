package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2880Qd;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ah */
/* loaded from: classes2.dex */
class C2484Ah implements C2880Qd.a {

    /* renamed from: a */
    final /* synthetic */ C2584Eh f20866a;

    /* renamed from: b */
    final /* synthetic */ C3757yh f20867b;

    /* renamed from: c */
    final /* synthetic */ C3783zh f20868c;

    public C2484Ah(C3783zh c3783zh, C2584Eh c2584Eh, C3757yh c3757yh) {
        this.f20868c = c3783zh;
        this.f20866a = c2584Eh;
        this.f20867b = c3757yh;
    }

    @Override // com.yandex.metrica.impl.p022ob.C2880Qd.a
    /* renamed from: a */
    public void mo13864a(String str, byte[] bArr) {
        List<C2659Hh> listM17338a = this.f20868c.f25429c.m17338a(this.f20868c.f25430d.m15680a(bArr, "af9202nao18gswqp"));
        C3757yh c3757yh = this.f20867b;
        this.f20868c.f25432f.getClass();
        c3757yh.m17262a(new C2584Eh(listM17338a, str, System.currentTimeMillis(), true, false));
    }

    @Override // com.yandex.metrica.impl.p022ob.C2880Qd.a
    /* renamed from: b */
    public String mo13865b() {
        return this.f20866a.f21118b;
    }

    @Override // com.yandex.metrica.impl.p022ob.C2880Qd.a
    /* renamed from: c */
    public void mo13866c() {
        this.f20867b.m17261a();
    }

    @Override // com.yandex.metrica.impl.p022ob.C2880Qd.a
    /* renamed from: a */
    public void mo13863a() {
        C3757yh c3757yh = this.f20867b;
        C2584Eh c2584Eh = this.f20866a;
        List<C2659Hh> list = c2584Eh.f21117a;
        String str = c2584Eh.f21118b;
        this.f20868c.f25432f.getClass();
        c3757yh.m17262a(new C2584Eh(list, str, System.currentTimeMillis(), true, false));
    }
}
