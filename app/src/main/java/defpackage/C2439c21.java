package defpackage;

import android.graphics.Bitmap;

/* renamed from: c21 */
/* loaded from: classes.dex */
public final class C2439c21 implements InterfaceC3918gC0 {
    public final C8236ym0 a;
    public int b;
    public Bitmap.Config c;

    public C2439c21(C8236ym0 c8236ym0) {
        this.a = c8236ym0;
    }

    @Override // defpackage.InterfaceC3918gC0
    public final void a() {
        this.a.n1(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2439c21)) {
            return false;
        }
        C2439c21 c2439c21 = (C2439c21) obj;
        return this.b == c2439c21.b && AbstractC0121Bh1.b(this.c, c2439c21.c);
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bitmap.Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C3315d21.c(this.b, this.c);
    }
}
