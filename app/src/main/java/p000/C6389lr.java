package p000;

import java.nio.ByteBuffer;

/* renamed from: lr */
/* loaded from: classes.dex */
public final class C6389lr extends AbstractC1111Rf {

    /* renamed from: i */
    public int[] f37316i;

    /* renamed from: j */
    public int[] f37317j;

    @Override // p000.AbstractC1111Rf
    /* renamed from: a */
    public final C6689qa mo3679a(C6689qa c6689qa) throws C6752ra {
        int[] iArr = this.f37316i;
        if (iArr == null) {
            return C6689qa.f41025e;
        }
        if (c6689qa.f41028c != 2) {
            throw new C6752ra(c6689qa);
        }
        int length = iArr.length;
        int i = c6689qa.f41027b;
        boolean z = i != length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= i) {
                throw new C6752ra(c6689qa);
            }
            z |= i3 != i2;
            i2++;
        }
        return z ? new C6689qa(c6689qa.f41026a, iArr.length, 2) : C6689qa.f41025e;
    }

    @Override // p000.AbstractC1111Rf
    /* renamed from: b */
    public final void mo3680b() {
        this.f37317j = this.f37316i;
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: f */
    public final void mo3682f(ByteBuffer byteBuffer) {
        int[] iArr = this.f37317j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM7059k = m7059k(((iLimit - iPosition) / this.f10362b.f41029d) * this.f10363c.f41029d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferM7059k.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f10362b.f41029d;
        }
        byteBuffer.position(iLimit);
        byteBufferM7059k.flip();
    }

    @Override // p000.AbstractC1111Rf
    /* renamed from: j */
    public final void mo3683j() {
        this.f37317j = null;
        this.f37316i = null;
    }
}
