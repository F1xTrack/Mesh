package p000;

import android.graphics.Bitmap;

/* renamed from: c21 */
/* loaded from: classes.dex */
public final class C8929c21 implements InterfaceC9467gC0 {

    /* renamed from: a */
    public final C11840ym0 f17265a;

    /* renamed from: b */
    public int f17266b;

    /* renamed from: c */
    public Bitmap.Config f17267c;

    public C8929c21(C11840ym0 c11840ym0) {
        this.f17265a = c11840ym0;
    }

    @Override // p000.InterfaceC9467gC0
    /* renamed from: a */
    public final void mo10572a() {
        this.f17265a.m7845n1(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8929c21)) {
            return false;
        }
        C8929c21 c8929c21 = (C8929c21) obj;
        return this.f17266b == c8929c21.f17266b && AbstractC7381Bh1.m803b(this.f17267c, c8929c21.f17267c);
    }

    public final int hashCode() {
        int i = this.f17266b * 31;
        Bitmap.Config config = this.f17267c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C9062d21.m17472c(this.f17266b, this.f17267c);
    }
}
