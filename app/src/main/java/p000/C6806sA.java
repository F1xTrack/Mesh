package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sA */
/* loaded from: classes.dex */
public final class C6806sA implements InterfaceC6726rA {

    /* renamed from: c */
    public static final C7460Cv0 f42281c = new C7460Cv0(11);

    /* renamed from: a */
    public final C7466Cy0 f42282a;

    /* renamed from: b */
    public final AtomicReference f42283b = new AtomicReference(null);

    public C6806sA(C7466Cy0 c7466Cy0) {
        this.f42282a = c7466Cy0;
        c7466Cy0.m1482a(new C0071B7(24, this));
    }

    @Override // p000.InterfaceC6726rA
    /* renamed from: a */
    public final InterfaceC11091su0 mo7022a(String str) {
        InterfaceC6726rA interfaceC6726rA = (InterfaceC6726rA) this.f42283b.get();
        return interfaceC6726rA == null ? f42281c : interfaceC6726rA.mo7022a(str);
    }

    @Override // p000.InterfaceC6726rA
    /* renamed from: b */
    public final boolean mo7023b() {
        InterfaceC6726rA interfaceC6726rA = (InterfaceC6726rA) this.f42283b.get();
        return interfaceC6726rA != null && interfaceC6726rA.mo7023b();
    }

    @Override // p000.InterfaceC6726rA
    /* renamed from: c */
    public final boolean mo7024c(String str) {
        InterfaceC6726rA interfaceC6726rA = (InterfaceC6726rA) this.f42283b.get();
        return interfaceC6726rA != null && interfaceC6726rA.mo7024c(str);
    }

    @Override // p000.InterfaceC6726rA
    /* renamed from: d */
    public final void mo7025d(String str, long j, C0104Be c0104Be) {
        this.f42282a.m1482a(new C0059Aw(str, j, c0104Be, 1));
    }
}
