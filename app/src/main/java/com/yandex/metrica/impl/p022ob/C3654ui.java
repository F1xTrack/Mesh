package com.yandex.metrica.impl.p022ob;

import p000.AbstractC7222ym;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.ui */
/* loaded from: classes2.dex */
public final class C3654ui {

    /* renamed from: a */
    private final String f24929a;

    /* renamed from: b */
    private final int f24930b;

    /* renamed from: c */
    private final int f24931c;

    /* renamed from: d */
    private final boolean f24932d;

    /* renamed from: e */
    private final boolean f24933e;

    public C3654ui(String str, int i, int i2, boolean z, boolean z2) {
        this.f24929a = str;
        this.f24930b = i;
        this.f24931c = i2;
        this.f24932d = z;
        this.f24933e = z2;
    }

    /* renamed from: a */
    public final int m16925a() {
        return this.f24931c;
    }

    /* renamed from: b */
    public final int m16926b() {
        return this.f24930b;
    }

    /* renamed from: c */
    public final String m16927c() {
        return this.f24929a;
    }

    /* renamed from: d */
    public final boolean m16928d() {
        return this.f24932d;
    }

    /* renamed from: e */
    public final boolean m16929e() {
        return this.f24933e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3654ui)) {
            return false;
        }
        C3654ui c3654ui = (C3654ui) obj;
        return O90.m5963a(this.f24929a, c3654ui.f24929a) && this.f24930b == c3654ui.f24930b && this.f24931c == c3654ui.f24931c && this.f24932d == c3654ui.f24932d && this.f24933e == c3654ui.f24933e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f24929a;
        int iHashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f24930b) * 31) + this.f24931c) * 31;
        boolean z = this.f24932d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.f24933e;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EgressConfig(url=");
        sb.append(this.f24929a);
        sb.append(", repeatedDelay=");
        sb.append(this.f24930b);
        sb.append(", randomDelayWindow=");
        sb.append(this.f24931c);
        sb.append(", isBackgroundAllowed=");
        sb.append(this.f24932d);
        sb.append(", isDiagnosticsEnabled=");
        return AbstractC7222ym.m26236m(sb, this.f24933e, ")");
    }
}
