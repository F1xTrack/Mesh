package p000;

import java.io.Serializable;

/* renamed from: xA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11637xA0 implements Serializable {

    /* renamed from: a */
    public final C0734Lf f45430a;

    public C11637xA0(C0734Lf c0734Lf) {
        if (c0734Lf == null) {
            throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
        }
        this.f45430a = c0734Lf;
    }

    public final String toString() {
        C0734Lf c0734Lf = this.f45430a;
        if (c0734Lf != null) {
            return new String(c0734Lf.m4698a(), AbstractC9964k41.f36286a);
        }
        return null;
    }
}
