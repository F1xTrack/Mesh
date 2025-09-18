package com.yandex.metrica.impl.p022ob;

import p000.AbstractC1374Vq;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.K7 */
/* loaded from: classes2.dex */
public final class C2724K7 {

    /* renamed from: a */
    private final EnumC2824O7 f21574a;

    /* renamed from: b */
    private final String f21575b;

    public C2724K7() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    /* renamed from: a */
    public final String m14468a() {
        return this.f21575b;
    }

    /* renamed from: b */
    public final EnumC2824O7 m14469b() {
        return this.f21574a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2724K7)) {
            return false;
        }
        C2724K7 c2724k7 = (C2724K7) obj;
        return O90.m5963a(this.f21574a, c2724k7.f21574a) && O90.m5963a(this.f21575b, c2724k7.f21575b);
    }

    public int hashCode() {
        EnumC2824O7 enumC2824O7 = this.f21574a;
        int iHashCode = (enumC2824O7 != null ? enumC2824O7.hashCode() : 0) * 31;
        String str = this.f21575b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeCrashHandlerDescription(source=");
        sb.append(this.f21574a);
        sb.append(", handlerVersion=");
        return AbstractC1374Vq.m8593l(sb, this.f21575b, ")");
    }

    public C2724K7(EnumC2824O7 enumC2824O7, String str) {
        this.f21574a = enumC2824O7;
        this.f21575b = str;
    }

    public /* synthetic */ C2724K7(EnumC2824O7 enumC2824O7, String str, int i) {
        this((i & 1) != 0 ? EnumC2824O7.UNKNOWN : null, null);
    }
}
