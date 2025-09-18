package defpackage;

import java.io.Serializable;

/* renamed from: ua0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7439ua0 implements Serializable {
    public final String a;

    public C7439ua0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7439ua0) {
            if (this.a.equalsIgnoreCase(((C7439ua0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.toLowerCase().hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
