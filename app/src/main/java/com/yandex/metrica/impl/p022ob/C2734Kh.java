package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.InterfaceC3800s;
import com.yandex.metrica.impl.p022ob.C3418lg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Kh */
/* loaded from: classes2.dex */
public class C2734Kh {

    /* renamed from: a */
    private final C2759Lh f21589a;

    /* renamed from: b */
    private final InterfaceC3800s f21590b;

    public C2734Kh() {
        this(new C2759Lh(), C2834Oh.m14711a());
    }

    /* renamed from: a */
    public void m14480a(C3418lg.e.b bVar) {
        this.f21590b.mo13934b("provided_request_result", this.f21589a.m14542a(bVar));
    }

    /* renamed from: b */
    public void m14481b(C3418lg.e.a aVar) {
        String string;
        InterfaceC3800s interfaceC3800s = this.f21590b;
        this.f21589a.getClass();
        try {
            string = new JSONObject().put(NotificationConstants.f19487ID, aVar.f24209a).toString();
        } catch (Throwable th) {
            string = th.toString();
        }
        interfaceC3800s.mo13934b("provided_request_send", string);
    }

    public C2734Kh(C2759Lh c2759Lh, InterfaceC3800s interfaceC3800s) {
        this.f21589a = c2759Lh;
        this.f21590b = interfaceC3800s;
    }

    /* renamed from: a */
    public void m14479a(C3418lg.e.a aVar) {
        String string;
        InterfaceC3800s interfaceC3800s = this.f21590b;
        this.f21589a.getClass();
        try {
            string = new JSONObject().put(NotificationConstants.f19487ID, aVar.f24209a).toString();
        } catch (Throwable th) {
            string = th.toString();
        }
        interfaceC3800s.mo13934b("provided_request_schedule", string);
    }
}
