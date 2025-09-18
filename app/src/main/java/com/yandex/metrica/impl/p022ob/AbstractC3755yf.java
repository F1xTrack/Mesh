package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3132ag;

/* renamed from: com.yandex.metrica.impl.ob.yf */
/* loaded from: classes2.dex */
public abstract class AbstractC3755yf implements InterfaceC2657Hf, InterfaceC3495of {

    /* renamed from: a */
    private final String f25310a;

    /* renamed from: b */
    private final int f25311b;

    /* renamed from: c */
    private final InterfaceC3660uo<String> f25312c;

    /* renamed from: d */
    private final AbstractC3547qf f25313d;

    /* renamed from: e */
    private C2689Im f25314e = AbstractC3788zm.m17344a();

    public AbstractC3755yf(int i, String str, InterfaceC3660uo<String> interfaceC3660uo, AbstractC3547qf abstractC3547qf) {
        this.f25311b = i;
        this.f25310a = str;
        this.f25312c = interfaceC3660uo;
        this.f25313d = abstractC3547qf;
    }

    /* renamed from: a */
    public final C3132ag.a m17237a() {
        C3132ag.a aVar = new C3132ag.a();
        aVar.f23054c = this.f25311b;
        aVar.f23053b = this.f25310a.getBytes();
        aVar.f23056e = new C3132ag.c();
        aVar.f23055d = new C3132ag.b();
        return aVar;
    }

    /* renamed from: b */
    public AbstractC3547qf m17239b() {
        return this.f25313d;
    }

    /* renamed from: c */
    public String m17240c() {
        return this.f25310a;
    }

    /* renamed from: d */
    public int m17241d() {
        return this.f25311b;
    }

    /* renamed from: e */
    public boolean m17242e() {
        C3608so c3608soMo14391a = this.f25312c.mo14391a(this.f25310a);
        if (c3608soMo14391a.m16805b()) {
            return true;
        }
        if (!this.f25314e.m17370c()) {
            return false;
        }
        this.f25314e.m17368c("Attribute " + this.f25310a + " of type " + C2607Ff.m14131a(this.f25311b) + " is skipped because " + c3608soMo14391a.m16804a());
        return false;
    }

    /* renamed from: a */
    public void m17238a(C2689Im c2689Im) {
        this.f25314e = c2689Im;
    }
}
