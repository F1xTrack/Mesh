package com.yandex.metrica.impl.ob;

import defpackage.AbstractC8235ym;
import defpackage.O90;

/* renamed from: com.yandex.metrica.impl.ob.ui, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3131ui {
    private final String a;
    private final int b;
    private final int c;
    private final boolean d;
    private final boolean e;

    public C3131ui(String str, int i, int i2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3131ui)) {
            return false;
        }
        C3131ui c3131ui = (C3131ui) obj;
        return O90.a(this.a, c3131ui.a) && this.b == c3131ui.b && this.c == c3131ui.c && this.d == c3131ui.d && this.e == c3131ui.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.a;
        int iHashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.e;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EgressConfig(url=");
        sb.append(this.a);
        sb.append(", repeatedDelay=");
        sb.append(this.b);
        sb.append(", randomDelayWindow=");
        sb.append(this.c);
        sb.append(", isBackgroundAllowed=");
        sb.append(this.d);
        sb.append(", isDiagnosticsEnabled=");
        return AbstractC8235ym.m(sb, this.e, ")");
    }
}
