package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class PS0 implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof OS0) {
            return ((OS0) obj).a;
        }
        return null;
    }

    public static String b(Object obj) {
        if (obj instanceof OS0) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PS0) {
            return O90.a(this.a, ((PS0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return b(this.a);
    }
}
