package com.yandex.metrica.impl.p022ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.ue */
/* loaded from: classes2.dex */
public class C3650ue extends AbstractC3572re {

    /* renamed from: h */
    private static final C3754ye f24911h = new C3754ye("SERVICE_API_LEVEL", null);

    /* renamed from: i */
    private static final C3754ye f24912i = new C3754ye("CLIENT_API_LEVEL", null);

    /* renamed from: f */
    private C3754ye f24913f;

    /* renamed from: g */
    private C3754ye f24914g;

    public C3650ue(Context context) {
        super(context, null);
        this.f24913f = new C3754ye(f24911h.m17236b());
        this.f24914g = new C3754ye(f24912i.m17236b());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3572re
    /* renamed from: d */
    public String mo16612d() {
        return "_migrationpreferences";
    }

    /* renamed from: f */
    public int m16918f() {
        return this.f24614b.getInt(this.f24913f.m17234a(), -1);
    }

    /* renamed from: g */
    public C3650ue m16919g() {
        m16688a(this.f24914g.m17234a());
        return this;
    }

    @Deprecated
    /* renamed from: h */
    public C3650ue m16920h() {
        m16688a(this.f24913f.m17234a());
        return this;
    }
}
