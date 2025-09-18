package p000;

import java.util.Arrays;

/* renamed from: Tb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8305Tb1 {

    /* renamed from: a */
    public final int f11434a;

    /* renamed from: b */
    public final byte[] f11435b;

    /* renamed from: c */
    public final int f11436c;

    /* renamed from: d */
    public final int f11437d;

    public C8305Tb1(int i, byte[] bArr, int i2, int i3) {
        this.f11434a = i;
        this.f11435b = bArr;
        this.f11436c = i2;
        this.f11437d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8305Tb1.class != obj.getClass()) {
            return false;
        }
        C8305Tb1 c8305Tb1 = (C8305Tb1) obj;
        return this.f11434a == c8305Tb1.f11434a && this.f11436c == c8305Tb1.f11436c && this.f11437d == c8305Tb1.f11437d && Arrays.equals(this.f11435b, c8305Tb1.f11435b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11435b) + (this.f11434a * 31)) * 31) + this.f11436c) * 31) + this.f11437d;
    }
}
