package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.w5 */
/* loaded from: classes2.dex */
public class C3693w5 extends AbstractC3589s5 {

    /* renamed from: b */
    private final C3278g6 f25159b;

    public C3693w5(C3250f4 c3250f4) {
        this(c3250f4, c3250f4.m15911j());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3459n5
    /* renamed from: a */
    public boolean mo13844a(C3376k0 c3376k0) {
        if (TextUtils.isEmpty(c3376k0.m16237g())) {
            return false;
        }
        c3376k0.m16224a(this.f25159b.m15980a(c3376k0.m16237g()));
        return false;
    }

    public C3693w5(C3250f4 c3250f4, C3278g6 c3278g6) {
        super(c3250f4);
        this.f25159b = c3278g6;
    }
}
