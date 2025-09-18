package defpackage;

import android.net.Uri;

/* renamed from: fy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3870fy {
    public final Uri a;
    public final boolean b;

    public C3870fy(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C3870fy.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C3870fy c3870fy = (C3870fy) obj;
        return O90.a(this.a, c3870fy.a) && this.b == c3870fy.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }
}
