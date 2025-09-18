package com.yandex.metrica.impl.ob;

import defpackage.AbstractC1705Vq;
import defpackage.O90;

/* loaded from: classes2.dex */
public final class K7 {
    private final O7 a;
    private final String b;

    public K7() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public final String a() {
        return this.b;
    }

    public final O7 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K7)) {
            return false;
        }
        K7 k7 = (K7) obj;
        return O90.a(this.a, k7.a) && O90.a(this.b, k7.b);
    }

    public int hashCode() {
        O7 o7 = this.a;
        int iHashCode = (o7 != null ? o7.hashCode() : 0) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeCrashHandlerDescription(source=");
        sb.append(this.a);
        sb.append(", handlerVersion=");
        return AbstractC1705Vq.l(sb, this.b, ")");
    }

    public K7(O7 o7, String str) {
        this.a = o7;
        this.b = str;
    }

    public /* synthetic */ K7(O7 o7, String str, int i) {
        this((i & 1) != 0 ? O7.UNKNOWN : null, null);
    }
}
