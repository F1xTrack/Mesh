package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: Ly0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7934Ly0 extends AbstractC9582h51 {

    /* renamed from: o */
    public static final byte[] f6945o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    public static final byte[] f6946p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    public boolean f6947n;

    /* renamed from: e */
    public static boolean m5170e(C9591hA0 c9591hA0, byte[] bArr) {
        if (c9591hA0.m18743a() < bArr.length) {
            return false;
        }
        int i = c9591hA0.f28294b;
        byte[] bArr2 = new byte[bArr.length];
        c9591hA0.m18747e(bArr2, 0, bArr.length);
        c9591hA0.m18741G(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p000.AbstractC9582h51
    /* renamed from: b */
    public final long mo5171b(C9591hA0 c9591hA0) {
        byte[] bArr = c9591hA0.f28293a;
        return (this.f28254i * NJ1.m5623b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // p000.AbstractC9582h51
    /* renamed from: c */
    public final boolean mo5172c(C9591hA0 c9591hA0, long j, CC0 cc0) {
        if (m5170e(c9591hA0, f6945o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c9591hA0.f28293a, c9591hA0.f28295c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListM5622a = NJ1.m5622a(bArrCopyOf);
            if (((C6686qX) cc0.f1250b) != null) {
                return true;
            }
            C6623pX c6623pX = new C6623pX();
            c6623pX.f40161l = AbstractC8544Xr0.m9171n("audio/opus");
            c6623pX.f40175z = i;
            c6623pX.f40141A = 48000;
            c6623pX.f40164o = arrayListM5622a;
            cc0.f1250b = new C6686qX(c6623pX);
            return true;
        }
        if (!m5170e(c9591hA0, f6946p)) {
            YN1.m9283h((C6686qX) cc0.f1250b);
            return false;
        }
        YN1.m9283h((C6686qX) cc0.f1250b);
        if (this.f6947n) {
            return true;
        }
        this.f6947n = true;
        c9591hA0.m18742H(8);
        C7660Gr0 c7660Gr0M7860c = U02.m7860c(P70.m6235v((String[]) U02.m7861d(c9591hA0, false, false).f43693a));
        if (c7660Gr0M7860c == null) {
            return true;
        }
        C6623pX c6623pXM24020a = ((C6686qX) cc0.f1250b).m24020a();
        c6623pXM24020a.f40159j = c7660Gr0M7860c.m3182b(((C6686qX) cc0.f1250b).f40972k);
        cc0.f1250b = new C6686qX(c6623pXM24020a);
        return true;
    }

    @Override // p000.AbstractC9582h51
    /* renamed from: d */
    public final void mo5173d(boolean z) {
        super.mo5173d(z);
        if (z) {
            this.f6947n = false;
        }
    }
}
