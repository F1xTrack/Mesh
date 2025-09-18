package p000;

import android.net.Uri;

/* renamed from: fy */
/* loaded from: classes.dex */
public final class C4086fy {

    /* renamed from: a */
    public final Uri f27513a;

    /* renamed from: b */
    public final boolean f27514b;

    public C4086fy(boolean z, Uri uri) {
        this.f27513a = uri;
        this.f27514b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4086fy.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.m5966d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C4086fy c4086fy = (C4086fy) obj;
        return O90.m5963a(this.f27513a, c4086fy.f27513a) && this.f27514b == c4086fy.f27514b;
    }

    public final int hashCode() {
        return (this.f27513a.hashCode() * 31) + (this.f27514b ? 1231 : 1237);
    }
}
