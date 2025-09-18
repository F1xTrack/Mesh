package defpackage;

import android.text.TextUtils;

/* renamed from: Vo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1700Vo0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public C1700Vo0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C1700Vo0.class) {
            return false;
        }
        C1700Vo0 c1700Vo0 = (C1700Vo0) obj;
        return TextUtils.equals(this.a, c1700Vo0.a) && this.b == c1700Vo0.b && this.c == c1700Vo0.c;
    }

    public final int hashCode() {
        return ((AbstractC1705Vq.e(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
