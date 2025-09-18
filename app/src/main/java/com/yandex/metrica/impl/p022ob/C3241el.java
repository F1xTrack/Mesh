package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.el */
/* loaded from: classes2.dex */
class C3241el implements InterfaceC2513Bl {

    /* renamed from: a */
    private final C2837Ok f23373a;

    public C3241el() {
        this(new C2837Ok());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2513Bl
    /* renamed from: a */
    public boolean mo13937a(String str, C3164bm c3164bm) {
        if (!c3164bm.f23154g) {
            return !C2968U2.m15245a("allow-parsing", str);
        }
        this.f23373a.getClass();
        return C2968U2.m15245a("do-not-parse", str);
    }

    public C3241el(C2837Ok c2837Ok) {
        this.f23373a = c2837Ok;
    }
}
