package p000;

import android.text.TextUtils;

/* renamed from: Vo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8434Vo0 {

    /* renamed from: a */
    public final String f12760a;

    /* renamed from: b */
    public final boolean f12761b;

    /* renamed from: c */
    public final boolean f12762c;

    public C8434Vo0(String str, boolean z, boolean z2) {
        this.f12760a = str;
        this.f12761b = z;
        this.f12762c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C8434Vo0.class) {
            return false;
        }
        C8434Vo0 c8434Vo0 = (C8434Vo0) obj;
        return TextUtils.equals(this.f12760a, c8434Vo0.f12760a) && this.f12761b == c8434Vo0.f12761b && this.f12762c == c8434Vo0.f12762c;
    }

    public final int hashCode() {
        return ((AbstractC1374Vq.m8586e(31, 31, this.f12760a) + (this.f12761b ? 1231 : 1237)) * 31) + (this.f12762c ? 1231 : 1237);
    }
}
