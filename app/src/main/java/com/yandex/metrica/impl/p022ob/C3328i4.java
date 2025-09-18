package com.yandex.metrica.impl.p022ob;

import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.i4 */
/* loaded from: classes2.dex */
public class C3328i4 {

    /* renamed from: a */
    private final C2526C9 f23624a;

    /* renamed from: b */
    private final C2675I8 f23625b;

    public C3328i4(C2675I8 c2675i8) {
        this(c2675i8, new C2526C9(c2675i8));
    }

    /* renamed from: a */
    public int m16080a() {
        int iM14292d = this.f23625b.m14292d();
        this.f23625b.m14282a(iM14292d + 1);
        return iM14292d;
    }

    public C3328i4(C2675I8 c2675i8, C2526C9 c2526c9) {
        this.f23625b = c2675i8;
        this.f23624a = c2526c9;
    }

    /* renamed from: a */
    public int m16081a(int i) throws JSONException {
        int iM13959a = this.f23624a.m13959a(i);
        this.f23624a.m13960a(i, iM13959a + 1);
        return iM13959a;
    }
}
