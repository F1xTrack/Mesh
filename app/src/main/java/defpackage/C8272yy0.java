package defpackage;

import android.text.TextUtils;

/* renamed from: yy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8272yy0 {
    public static final C5396jt0 e = new C5396jt0(18);
    public final Object a;
    public final InterfaceC8082xy0 b;
    public final String c;
    public volatile byte[] d;

    public C8272yy0(String str, Object obj, InterfaceC8082xy0 interfaceC8082xy0) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.c = str;
        this.a = obj;
        this.b = interfaceC8082xy0;
    }

    public static C8272yy0 a(Object obj, String str) {
        return new C8272yy0(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8272yy0) {
            return this.c.equals(((C8272yy0) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return AbstractC1705Vq.l(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
