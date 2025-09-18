package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.EnumC3798q;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.w2 */
/* loaded from: classes2.dex */
public final class C3690w2 {

    /* renamed from: a */
    private final int f25151a;

    /* renamed from: b */
    private final int f25152b;

    /* renamed from: c */
    private final int f25153c;

    /* renamed from: d */
    private final float f25154d;

    /* renamed from: e */
    private final EnumC3798q f25155e;

    public C3690w2(int i, int i2, int i3, float f, EnumC3798q enumC3798q) {
        this.f25151a = i;
        this.f25152b = i2;
        this.f25153c = i3;
        this.f25154d = f;
        this.f25155e = enumC3798q;
    }

    /* renamed from: a */
    public final EnumC3798q m17108a() {
        return this.f25155e;
    }

    /* renamed from: b */
    public final int m17109b() {
        return this.f25153c;
    }

    /* renamed from: c */
    public final int m17110c() {
        return this.f25152b;
    }

    /* renamed from: d */
    public final float m17111d() {
        return this.f25154d;
    }

    /* renamed from: e */
    public final int m17112e() {
        return this.f25151a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3690w2)) {
            return false;
        }
        C3690w2 c3690w2 = (C3690w2) obj;
        return this.f25151a == c3690w2.f25151a && this.f25152b == c3690w2.f25152b && this.f25153c == c3690w2.f25153c && Float.compare(this.f25154d, c3690w2.f25154d) == 0 && O90.m5963a(this.f25155e, c3690w2.f25155e);
    }

    public int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.f25154d) + (((((this.f25151a * 31) + this.f25152b) * 31) + this.f25153c) * 31)) * 31;
        EnumC3798q enumC3798q = this.f25155e;
        return iFloatToIntBits + (enumC3798q != null ? enumC3798q.hashCode() : 0);
    }

    public String toString() {
        return "ScreenInfo(width=" + this.f25151a + ", height=" + this.f25152b + ", dpi=" + this.f25153c + ", scaleFactor=" + this.f25154d + ", deviceType=" + this.f25155e + ")";
    }
}
