package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Fm */
/* loaded from: classes2.dex */
public class C4503Fm implements InterfaceC4905Wh {

    /* renamed from: a */
    public final int f30152a;

    /* renamed from: b */
    public final int f30153b;

    /* renamed from: c */
    public int f30154c = 0;

    public C4503Fm(int i, int i2) {
        this.f30152a = i;
        this.f30153b = i2;
    }

    /* renamed from: a */
    public final int m19423a() {
        return this.f30153b;
    }

    /* renamed from: b */
    public final boolean m19424b() {
        int i = this.f30154c;
        this.f30154c = i + 1;
        return i < this.f30152a;
    }

    /* renamed from: c */
    public final void m19425c() {
        this.f30154c = 0;
    }
}
