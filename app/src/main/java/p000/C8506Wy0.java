package p000;

import android.os.Build;
import android.view.Surface;

/* renamed from: Wy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8506Wy0 {

    /* renamed from: a */
    public final C9437fz0 f13467a;

    public C8506Wy0(int i, Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f13467a = new C9181dz0(i, surface);
            return;
        }
        if (i2 >= 28) {
            this.f13467a = new C9053cz0(i, surface);
            return;
        }
        if (i2 >= 26) {
            this.f13467a = new C8792az0(i, surface);
        } else if (i2 >= 24) {
            this.f13467a = new C8610Yy0(i, surface);
        } else {
            this.f13467a = new C9437fz0(surface);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8506Wy0)) {
            return false;
        }
        return this.f13467a.equals(((C8506Wy0) obj).f13467a);
    }

    public final int hashCode() {
        return this.f13467a.hashCode();
    }

    public C8506Wy0(C8610Yy0 c8610Yy0) {
        this.f13467a = c8610Yy0;
    }
}
