package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: Rf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1361Rf0 implements Serializable {
    public static final C1361Rf0 b = new C1361Rf0("sig");
    public static final C1361Rf0 c = new C1361Rf0("enc");
    public final String a;

    public C1361Rf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1361Rf0) {
            return Objects.equals(this.a, ((C1361Rf0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return this.a;
    }
}
