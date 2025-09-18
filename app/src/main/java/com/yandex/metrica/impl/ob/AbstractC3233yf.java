package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2631ag;

/* renamed from: com.yandex.metrica.impl.ob.yf */
/* loaded from: classes2.dex */
public abstract class AbstractC3233yf implements Hf, InterfaceC2979of {
    private final String a;
    private final int b;
    private final uo<String> c;
    private final AbstractC3029qf d;
    private Im e = AbstractC3265zm.a();

    public AbstractC3233yf(int i, String str, uo<String> uoVar, AbstractC3029qf abstractC3029qf) {
        this.b = i;
        this.a = str;
        this.c = uoVar;
        this.d = abstractC3029qf;
    }

    public final C2631ag.a a() {
        C2631ag.a aVar = new C2631ag.a();
        aVar.c = this.b;
        aVar.b = this.a.getBytes();
        aVar.e = new C2631ag.c();
        aVar.d = new C2631ag.b();
        return aVar;
    }

    public AbstractC3029qf b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public boolean e() {
        so soVarA = this.c.a(this.a);
        if (soVarA.b()) {
            return true;
        }
        if (!this.e.c()) {
            return false;
        }
        this.e.c("Attribute " + this.a + " of type " + Ff.a(this.b) + " is skipped because " + soVarA.a());
        return false;
    }

    public void a(Im im) {
        this.e = im;
    }
}
