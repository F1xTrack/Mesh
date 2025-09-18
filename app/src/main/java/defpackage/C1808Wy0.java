package defpackage;

import android.os.Build;
import android.view.Surface;

/* renamed from: Wy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1808Wy0 {
    public final C3874fz0 a;

    public C1808Wy0(int i, Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.a = new C3492dz0(i, surface);
            return;
        }
        if (i2 >= 28) {
            this.a = new C3302cz0(i, surface);
            return;
        }
        if (i2 >= 26) {
            this.a = new C2236az0(i, surface);
        } else if (i2 >= 24) {
            this.a = new C1964Yy0(i, surface);
        } else {
            this.a = new C3874fz0(surface);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1808Wy0)) {
            return false;
        }
        return this.a.equals(((C1808Wy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public C1808Wy0(C1964Yy0 c1964Yy0) {
        this.a = c1964Yy0;
    }
}
