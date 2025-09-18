package defpackage;

import java.nio.ByteBuffer;

/* renamed from: lr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5771lr extends AbstractC1360Rf {
    public int[] i;
    public int[] j;

    @Override // defpackage.AbstractC1360Rf
    public final C6675qa a(C6675qa c6675qa) throws C6865ra {
        int[] iArr = this.i;
        if (iArr == null) {
            return C6675qa.e;
        }
        if (c6675qa.c != 2) {
            throw new C6865ra(c6675qa);
        }
        int length = iArr.length;
        int i = c6675qa.b;
        boolean z = i != length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= i) {
                throw new C6865ra(c6675qa);
            }
            z |= i3 != i2;
            i2++;
        }
        return z ? new C6675qa(c6675qa.a, iArr.length, 2) : C6675qa.e;
    }

    @Override // defpackage.AbstractC1360Rf
    public final void b() {
        this.j = this.i;
    }

    @Override // defpackage.InterfaceC7056sa
    public final void f(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferK.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // defpackage.AbstractC1360Rf
    public final void j() {
        this.j = null;
        this.i = null;
    }
}
