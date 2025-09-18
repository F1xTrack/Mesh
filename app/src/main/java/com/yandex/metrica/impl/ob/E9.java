package com.yandex.metrica.impl.ob;

@Deprecated
/* loaded from: classes2.dex */
public class E9 extends H9 {
    private final C3232ye c;
    private final C3232ye d;

    public E9(InterfaceC3251z8 interfaceC3251z8) {
        super(interfaceC3251z8);
        this.c = new C3232ye("init_event_pref_key");
        this.d = new C3232ye("first_event_pref_key");
    }

    @Deprecated
    public boolean e() {
        return a(this.d.a(), (String) null) != null;
    }

    @Deprecated
    public String f(String str) {
        return a(this.c.a(), (String) null);
    }

    @Deprecated
    public E9 g() {
        return (E9) e(this.d.a());
    }

    @Deprecated
    public E9 h() {
        return (E9) e(this.c.a());
    }

    @Deprecated
    public void i() {
        b(this.d.a(), "DONE").c();
    }

    @Deprecated
    public void j() {
        b(this.c.a(), "DONE").c();
    }

    @Deprecated
    public boolean f() {
        return a(this.c.a(), (String) null) != null;
    }
}
