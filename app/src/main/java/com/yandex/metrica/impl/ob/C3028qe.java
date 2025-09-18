package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.qe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3028qe extends AbstractC3052re {
    public static final /* synthetic */ int j = 0;
    private final C3232ye f;
    private final C3232ye g;
    private final C3232ye h;
    private final C3232ye i;

    public C3028qe(Context context, String str) {
        super(context, str);
        this.f = new C3232ye("init_event_pref_key", c());
        this.g = new C3232ye("init_event_pref_key");
        this.h = new C3232ye("first_event_pref_key", c());
        this.i = new C3232ye("fitst_event_description_key", c());
    }

    private void a(C3232ye c3232ye) {
        this.b.edit().remove(c3232ye.a()).apply();
    }

    @Deprecated
    public String b(String str) {
        return this.b.getString(this.g.a(), null);
    }

    public String c(String str) {
        return this.b.getString(this.h.a(), null);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3052re
    public String d() {
        return "_initpreferences";
    }

    @Deprecated
    public void f() {
        a(this.g);
    }

    public void g() {
        a(this.i);
    }

    public void h() {
        a(this.h);
    }

    public void i() {
        a(this.f);
    }

    public void j() {
        a(this.f.a(), "DONE").b();
    }

    public String d(String str) {
        return this.b.getString(this.f.a(), null);
    }
}
