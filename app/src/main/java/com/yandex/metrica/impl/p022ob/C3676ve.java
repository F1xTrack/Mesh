package com.yandex.metrica.impl.p022ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.ve */
/* loaded from: classes2.dex */
public class C3676ve extends AbstractC3572re {

    /* renamed from: g */
    private static final C3754ye f25012g = new C3754ye("PREF_KEY_OFFSET", null);

    /* renamed from: f */
    private C3754ye f25013f;

    public C3676ve(Context context, String str) {
        super(context, str);
        this.f25013f = new C3754ye(f25012g.m17236b(), null);
    }

    /* renamed from: a */
    public long m16973a(int i) {
        return this.f24614b.getLong(this.f25013f.m17234a(), i);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3572re
    /* renamed from: d */
    public String mo16612d() {
        return "_servertimeoffset";
    }

    /* renamed from: f */
    public void m16974f() {
        m16688a(this.f25013f.m17234a()).m16690b();
    }
}
