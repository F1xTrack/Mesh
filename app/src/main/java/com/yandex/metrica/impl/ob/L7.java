package com.yandex.metrica.impl.ob;

import defpackage.O90;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class L7 {
    private final byte[] a;
    private final K7 b;

    public L7(byte[] bArr, K7 k7) {
        this.a = bArr;
        this.b = k7;
    }

    public final byte[] a() {
        return this.a;
    }

    public final K7 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L7)) {
            return false;
        }
        L7 l7 = (L7) obj;
        return O90.a(this.a, l7.a) && O90.a(this.b, l7.b);
    }

    public int hashCode() {
        byte[] bArr = this.a;
        int iHashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        K7 k7 = this.b;
        return iHashCode + (k7 != null ? k7.hashCode() : 0);
    }

    public String toString() {
        return "NativeCrashModel(data=" + Arrays.toString(this.a) + ", handlerDescription=" + this.b + ")";
    }
}
