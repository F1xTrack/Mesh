package p000;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class PS0 implements Serializable {

    /* renamed from: a */
    public final Object f9075a;

    /* renamed from: a */
    public static final Throwable m6365a(Object obj) {
        if (obj instanceof OS0) {
            return ((OS0) obj).f8450a;
        }
        return null;
    }

    /* renamed from: b */
    public static String m6366b(Object obj) {
        if (obj instanceof OS0) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PS0) {
            return O90.m5963a(this.f9075a, ((PS0) obj).f9075a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f9075a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return m6366b(this.f9075a);
    }
}
