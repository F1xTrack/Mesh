package p000;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: Rf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8208Rf0 implements Serializable {

    /* renamed from: b */
    public static final C8208Rf0 f10369b = new C8208Rf0("sig");

    /* renamed from: c */
    public static final C8208Rf0 f10370c = new C8208Rf0("enc");

    /* renamed from: a */
    public final String f10371a;

    public C8208Rf0(String str) {
        this.f10371a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8208Rf0) {
            return Objects.equals(this.f10371a, ((C8208Rf0) obj).f10371a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10371a);
    }

    public final String toString() {
        return this.f10371a;
    }
}
