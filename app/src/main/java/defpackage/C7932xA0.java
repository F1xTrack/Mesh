package defpackage;

import java.io.Serializable;

/* renamed from: xA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7932xA0 implements Serializable {
    public final C0893Lf a;

    public C7932xA0(C0893Lf c0893Lf) {
        if (c0893Lf == null) {
            throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
        }
        this.a = c0893Lf;
    }

    public final String toString() {
        C0893Lf c0893Lf = this.a;
        if (c0893Lf != null) {
            return new String(c0893Lf.a(), AbstractC5435k41.a);
        }
        return null;
    }
}
