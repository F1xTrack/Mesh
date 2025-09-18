package com.yandex.metrica.impl.ob;

import defpackage.O90;

/* renamed from: com.yandex.metrica.impl.ob.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3170w2 {
    private final int a;
    private final int b;
    private final int c;
    private final float d;
    private final com.yandex.metrica.q e;

    public C3170w2(int i, int i2, int i3, float f, com.yandex.metrica.q qVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = qVar;
    }

    public final com.yandex.metrica.q a() {
        return this.e;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public final float d() {
        return this.d;
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3170w2)) {
            return false;
        }
        C3170w2 c3170w2 = (C3170w2) obj;
        return this.a == c3170w2.a && this.b == c3170w2.b && this.c == c3170w2.c && Float.compare(this.d, c3170w2.d) == 0 && O90.a(this.e, c3170w2.e);
    }

    public int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.d) + (((((this.a * 31) + this.b) * 31) + this.c) * 31)) * 31;
        com.yandex.metrica.q qVar = this.e;
        return iFloatToIntBits + (qVar != null ? qVar.hashCode() : 0);
    }

    public String toString() {
        return "ScreenInfo(width=" + this.a + ", height=" + this.b + ", dpi=" + this.c + ", scaleFactor=" + this.d + ", deviceType=" + this.e + ")";
    }
}
