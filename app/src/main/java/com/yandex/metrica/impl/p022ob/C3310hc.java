package com.yandex.metrica.impl.p022ob;

import p000.EnumC8183Qs1;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.hc */
/* loaded from: classes2.dex */
public final class C3310hc {

    /* renamed from: a */
    private final String f23573a;

    /* renamed from: b */
    private final EnumC8183Qs1 f23574b;

    public C3310hc(String str, EnumC8183Qs1 enumC8183Qs1) {
        this.f23573a = str;
        this.f23574b = enumC8183Qs1;
    }

    /* renamed from: a */
    public final String m16042a() {
        return this.f23573a;
    }

    /* renamed from: b */
    public final EnumC8183Qs1 m16043b() {
        return this.f23574b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3310hc)) {
            return false;
        }
        C3310hc c3310hc = (C3310hc) obj;
        return O90.m5963a(this.f23573a, c3310hc.f23573a) && O90.m5963a(this.f23574b, c3310hc.f23574b);
    }

    public int hashCode() {
        String str = this.f23573a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        EnumC8183Qs1 enumC8183Qs1 = this.f23574b;
        return iHashCode + (enumC8183Qs1 != null ? enumC8183Qs1.hashCode() : 0);
    }

    public String toString() {
        return "AppSetId(id=" + this.f23573a + ", scope=" + this.f23574b + ")";
    }
}
