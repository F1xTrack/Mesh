package defpackage;

import java.util.Arrays;

/* renamed from: sm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7093sm0 {
    public final C1847Xl0 a;
    public final Throwable b;

    public C7093sm0(C1847Xl0 c1847Xl0) {
        this.a = c1847Xl0;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7093sm0)) {
            return false;
        }
        C7093sm0 c7093sm0 = (C7093sm0) obj;
        C1847Xl0 c1847Xl0 = this.a;
        if (c1847Xl0 != null && c1847Xl0.equals(c7093sm0.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || c7093sm0.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public C7093sm0(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
