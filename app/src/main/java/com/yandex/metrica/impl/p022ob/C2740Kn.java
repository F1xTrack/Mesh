package com.yandex.metrica.impl.p022ob;

import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.Kn */
/* loaded from: classes2.dex */
public class C2740Kn {

    /* renamed from: a */
    private final C2815Nn f21608a;

    /* renamed from: b */
    private final C2815Nn f21609b;

    /* renamed from: c */
    private final C2640Gn f21610c;

    /* renamed from: d */
    private final C2689Im f21611d;

    /* renamed from: e */
    private final String f21612e;

    public C2740Kn(int i, int i2, int i3, String str, C2689Im c2689Im) {
        this(new C2640Gn(i), new C2815Nn(i2, AbstractC7222ym.m26232i(str, "map key"), c2689Im), new C2815Nn(i3, AbstractC7222ym.m26232i(str, "map value"), c2689Im), str, c2689Im);
    }

    /* renamed from: a */
    public C2640Gn m14495a() {
        return this.f21610c;
    }

    /* renamed from: b */
    public C2815Nn m14497b() {
        return this.f21608a;
    }

    /* renamed from: c */
    public C2815Nn m14498c() {
        return this.f21609b;
    }

    /* renamed from: a */
    public void m14496a(String str) {
        if (this.f21611d.m17370c()) {
            this.f21611d.m17369c("The %s has reached the limit of %d items. Item with key %s will be ignored", this.f21612e, Integer.valueOf(this.f21610c.m14213a()), str);
        }
    }

    public C2740Kn(C2640Gn c2640Gn, C2815Nn c2815Nn, C2815Nn c2815Nn2, String str, C2689Im c2689Im) {
        this.f21610c = c2640Gn;
        this.f21608a = c2815Nn;
        this.f21609b = c2815Nn2;
        this.f21612e = str;
        this.f21611d = c2689Im;
    }
}
