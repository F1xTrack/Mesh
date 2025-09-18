package p000;

import android.net.Uri;

/* renamed from: de */
/* loaded from: classes.dex */
public final class C3941de {

    /* renamed from: a */
    public final Uri f26176a;

    public C3941de(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.f26176a = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3941de)) {
            return false;
        }
        return this.f26176a.equals(((C3941de) obj).f26176a);
    }

    public final int hashCode() {
        return this.f26176a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.f26176a + "}";
    }
}
