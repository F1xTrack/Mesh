package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* renamed from: Yj0 */
/* loaded from: classes2.dex */
public class C8580Yj0 extends AbstractC0488Hk {

    /* renamed from: b */
    public final byte[] f14490b;

    /* renamed from: c */
    public int f14491c = 0;

    public C8580Yj0(byte[] bArr) {
        this.f14490b = bArr;
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: A */
    public final void mo3572A(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f14490b, i, i2);
    }

    /* renamed from: B */
    public final boolean m9345B(C8580Yj0 c8580Yj0, int i, int i2) {
        byte[] bArr = c8580Yj0.f14490b;
        int length = bArr.length;
        byte[] bArr2 = this.f14490b;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        int length3 = bArr.length;
        byte[] bArr3 = c8580Yj0.f14490b;
        if (i3 <= length3) {
            int i4 = 0;
            while (i4 < i2) {
                if (bArr2[i4] != bArr3[i]) {
                    return false;
                }
                i4++;
                i++;
            }
            return true;
        }
        int length4 = bArr3.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(length4);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0488Hk) || size() != ((AbstractC0488Hk) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C8580Yj0) {
            return m9345B((C8580Yj0) obj, 0, size());
        }
        if (obj instanceof C11802yT0) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(AbstractC1374Vq.m8593l(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    public final int hashCode() {
        int iMo3579t = this.f14491c;
        if (iMo3579t == 0) {
            int size = size();
            iMo3579t = mo3579t(size, 0, size);
            if (iMo3579t == 0) {
                iMo3579t = 1;
            }
            this.f14491c = iMo3579t;
        }
        return iMo3579t;
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: i */
    public void mo3575i(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f14490b, i, bArr, i2, i3);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0110Bk(this);
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: k */
    public final int mo3576k() {
        return 0;
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: q */
    public final boolean mo3577q() {
        return true;
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: r */
    public final boolean mo3578r() {
        byte[] bArr = this.f14490b;
        return AbstractC8924c02.m10557e(bArr, 0, bArr.length) == 0;
    }

    @Override // p000.AbstractC0488Hk
    public int size() {
        return this.f14490b.length;
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: t */
    public final int mo3579t(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f14490b[i4];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0095, code lost:
    
        if (r0[r8] > (-65)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0019, code lost:
    
        if (r0[r9] > (-65)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x004d, code lost:
    
        if (r0[r9] > (-65)) goto L78;
     */
    @Override // p000.AbstractC0488Hk
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo3580u(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r10 = r10 + r9
            byte[] r0 = r7.f14490b
            if (r8 == 0) goto L98
            if (r9 < r10) goto L9
            goto L9c
        L9:
            byte r1 = (byte) r8
            r2 = -65
            r3 = -1
            r4 = -32
            if (r1 >= r4) goto L22
            r8 = -62
            if (r1 < r8) goto L1f
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r2) goto L1c
            goto L1f
        L1c:
            r9 = r8
            goto L98
        L1f:
            r8 = r3
            goto L9c
        L22:
            r5 = -16
            if (r1 >= r5) goto L50
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L3b
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r8 < r10) goto L38
            int r8 = p000.AbstractC8924c02.m10554b(r1, r9)
            goto L9c
        L38:
            r6 = r9
            r9 = r8
            r8 = r6
        L3b:
            if (r8 > r2) goto L1f
            r5 = -96
            if (r1 != r4) goto L43
            if (r8 < r5) goto L1f
        L43:
            r4 = -19
            if (r1 != r4) goto L49
            if (r8 >= r5) goto L1f
        L49:
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r2) goto L1c
            goto L1f
        L50:
            int r4 = r8 >> 8
            int r4 = ~r4
            byte r4 = (byte) r4
            if (r4 != 0) goto L63
            int r8 = r9 + 1
            r4 = r0[r9]
            if (r8 < r10) goto L61
            int r8 = p000.AbstractC8924c02.m10554b(r1, r4)
            goto L9c
        L61:
            r9 = 0
            goto L69
        L63:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r9
            r9 = r8
            r8 = r6
        L69:
            if (r9 != 0) goto L84
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r9 < r10) goto L81
            r9 = -12
            if (r1 > r9) goto L1f
            if (r4 > r2) goto L1f
            if (r8 <= r2) goto L7a
            goto L1f
        L7a:
            int r9 = r4 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            goto L9c
        L81:
            r6 = r9
            r9 = r8
            r8 = r6
        L84:
            if (r4 > r2) goto L1f
            int r1 = r1 << 28
            int r4 = r4 + 112
            int r4 = r4 + r1
            int r1 = r4 >> 30
            if (r1 != 0) goto L1f
            if (r9 > r2) goto L1f
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r8 <= r2) goto L98
            goto L1f
        L98:
            int r8 = p000.AbstractC8924c02.m10557e(r0, r9, r10)
        L9c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8580Yj0.mo3580u(int, int, int):int");
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: v */
    public final int mo3581v() {
        return this.f14491c;
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: y */
    public final String mo3582y() {
        byte[] bArr = this.f14490b;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }
}
