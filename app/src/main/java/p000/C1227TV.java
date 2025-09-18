package p000;

import java.util.Arrays;

/* renamed from: TV */
/* loaded from: classes.dex */
public final class C1227TV extends AbstractC9582h51 {

    /* renamed from: n */
    public C1290UV f11403n;

    /* renamed from: o */
    public C0451H9 f11404o;

    @Override // p000.AbstractC9582h51
    /* renamed from: b */
    public final long mo5171b(C9591hA0 c9591hA0) {
        byte[] bArr = c9591hA0.f28293a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c9591hA0.m18742H(4);
            c9591hA0.m18736B();
        }
        int iM17818b = AbstractC9188e12.m17818b(i, c9591hA0);
        c9591hA0.m18741G(0);
        return iM17818b;
    }

    @Override // p000.AbstractC9582h51
    /* renamed from: c */
    public final boolean mo5172c(C9591hA0 c9591hA0, long j, CC0 cc0) {
        byte[] bArr = c9591hA0.f28293a;
        C1290UV c1290uv = this.f11403n;
        if (c1290uv == null) {
            C1290UV c1290uv2 = new C1290UV(bArr, 17);
            this.f11403n = c1290uv2;
            cc0.f1250b = c1290uv2.m8079c(Arrays.copyOfRange(bArr, 9, c9591hA0.f28295c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            C0451H9 c0451h9 = this.f11404o;
            if (c0451h9 != null) {
                c0451h9.f4146a = j;
                cc0.f1251c = c0451h9;
            }
            ((C6686qX) cc0.f1250b).getClass();
            return false;
        }
        ES1 es1M18156b = AbstractC9316f12.m18156b(c9591hA0);
        C1290UV c1290uv3 = new C1290UV(c1290uv.f11818a, c1290uv.f11819b, c1290uv.f11820c, c1290uv.f11821d, c1290uv.f11822e, c1290uv.f11824g, c1290uv.f11825h, c1290uv.f11827j, es1M18156b, c1290uv.f11829l);
        this.f11403n = c1290uv3;
        C0451H9 c0451h92 = new C0451H9();
        c0451h92.f4148c = c1290uv3;
        c0451h92.f4149d = es1M18156b;
        c0451h92.f4146a = -1L;
        c0451h92.f4147b = -1L;
        this.f11404o = c0451h92;
        return true;
    }

    @Override // p000.AbstractC9582h51
    /* renamed from: d */
    public final void mo5173d(boolean z) {
        super.mo5173d(z);
        if (z) {
            this.f11403n = null;
            this.f11404o = null;
        }
    }
}
