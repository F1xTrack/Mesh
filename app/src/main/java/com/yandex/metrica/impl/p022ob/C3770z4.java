package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.z4 */
/* loaded from: classes2.dex */
public class C3770z4 {

    /* renamed from: a */
    private final C2626G9 f25396a;

    /* renamed from: b */
    private final InterfaceC2839Om f25397b;

    /* renamed from: c */
    private final C2893R2 f25398c;

    /* renamed from: d */
    private C2984Ui f25399d;

    /* renamed from: e */
    private long f25400e;

    public C3770z4(Context context, C3172c4 c3172c4) {
        this(new C2626G9(C2877Qa.m14815a(context).m14825b(c3172c4)), new C2814Nm(), new C2893R2());
    }

    /* renamed from: a */
    public boolean m17323a(Boolean bool) {
        C2984Ui c2984Ui;
        return Boolean.FALSE.equals(bool) && (c2984Ui = this.f25399d) != null && this.f25398c.m14969a(this.f25400e, c2984Ui.f22494a, "should report diagnostic");
    }

    /* renamed from: a */
    public void m17321a() {
        long jMo14674a = this.f25397b.mo14674a();
        this.f25400e = jMo14674a;
        this.f25396a.m14169d(jMo14674a).m14258c();
    }

    public C3770z4(C2626G9 c2626g9, InterfaceC2839Om interfaceC2839Om, C2893R2 c2893r2) {
        this.f25396a = c2626g9;
        this.f25397b = interfaceC2839Om;
        this.f25398c = c2893r2;
        this.f25400e = c2626g9.m14180j();
    }

    /* renamed from: a */
    public void m17322a(C2984Ui c2984Ui) {
        this.f25399d = c2984Ui;
    }
}
