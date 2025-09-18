package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Sd */
/* loaded from: classes2.dex */
public class C2929Sd implements InterfaceC2979Ud {

    /* renamed from: a */
    private long f22301a;

    /* renamed from: b */
    private int f22302b;

    /* renamed from: c */
    private final C2954Td f22303c;

    /* renamed from: d */
    private final C2535Ci f22304d;

    /* renamed from: e */
    private final C2893R2 f22305e;

    /* renamed from: f */
    private final InterfaceC2839Om f22306f;

    public C2929Sd(C2954Td c2954Td, C2535Ci c2535Ci) {
        this(c2954Td, c2535Ci, new C2893R2(), new C2814Nm());
    }

    /* renamed from: b */
    private void m15116b() {
        this.f22302b = this.f22303c.m15194b();
        this.f22301a = this.f22303c.m15191a();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2979Ud
    /* renamed from: a */
    public boolean mo14997a() {
        C2535Ci c2535Ci = this.f22304d;
        if (c2535Ci != null) {
            long j = this.f22301a;
            if (j != 0) {
                C2893R2 c2893r2 = this.f22305e;
                int i = ((1 << (this.f22302b - 1)) - 1) * c2535Ci.f20985b;
                int i2 = c2535Ci.f20984a;
                if (i > i2) {
                    i = i2;
                }
                return c2893r2.m14970b(j, i, "last send attempt");
            }
        }
        return true;
    }

    /* renamed from: c */
    public void m15117c() {
        this.f22302b = 1;
        this.f22301a = 0L;
        this.f22303c.m15192a(1);
        this.f22303c.m15193a(this.f22301a);
    }

    /* renamed from: d */
    public void m15118d() {
        long jMo14675b = this.f22306f.mo14675b();
        this.f22301a = jMo14675b;
        this.f22302b++;
        this.f22303c.m15193a(jMo14675b);
        this.f22303c.m15192a(this.f22302b);
    }

    public C2929Sd(C2954Td c2954Td, C2535Ci c2535Ci, C2893R2 c2893r2, InterfaceC2839Om interfaceC2839Om) {
        this.f22304d = c2535Ci;
        this.f22303c = c2954Td;
        this.f22305e = c2893r2;
        this.f22306f = interfaceC2839Om;
        m15116b();
    }
}
