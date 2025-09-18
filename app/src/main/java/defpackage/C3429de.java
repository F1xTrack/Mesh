package defpackage;

import android.net.Uri;

/* renamed from: de, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3429de {
    public final Uri a;

    public C3429de(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3429de)) {
            return false;
        }
        return this.a.equals(((C3429de) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.a + "}";
    }
}
