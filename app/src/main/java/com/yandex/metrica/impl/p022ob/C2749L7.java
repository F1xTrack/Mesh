package com.yandex.metrica.impl.p022ob;

import java.util.Arrays;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.L7 */
/* loaded from: classes2.dex */
public final class C2749L7 {

    /* renamed from: a */
    private final byte[] f21620a;

    /* renamed from: b */
    private final C2724K7 f21621b;

    public C2749L7(byte[] bArr, C2724K7 c2724k7) {
        this.f21620a = bArr;
        this.f21621b = c2724k7;
    }

    /* renamed from: a */
    public final byte[] m14510a() {
        return this.f21620a;
    }

    /* renamed from: b */
    public final C2724K7 m14511b() {
        return this.f21621b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2749L7)) {
            return false;
        }
        C2749L7 c2749l7 = (C2749L7) obj;
        return O90.m5963a(this.f21620a, c2749l7.f21620a) && O90.m5963a(this.f21621b, c2749l7.f21621b);
    }

    public int hashCode() {
        byte[] bArr = this.f21620a;
        int iHashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        C2724K7 c2724k7 = this.f21621b;
        return iHashCode + (c2724k7 != null ? c2724k7.hashCode() : 0);
    }

    public String toString() {
        return "NativeCrashModel(data=" + Arrays.toString(this.f21620a) + ", handlerDescription=" + this.f21621b + ")";
    }
}
