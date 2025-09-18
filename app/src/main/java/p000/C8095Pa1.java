package p000;

import java.nio.ByteBuffer;

/* renamed from: Pa1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8095Pa1 extends AbstractC1111Rf {

    /* renamed from: i */
    public static final int f9150i = Float.floatToIntBits(Float.NaN);

    /* renamed from: l */
    public static void m6385l(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (iFloatToIntBits == f9150i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p000.AbstractC1111Rf
    /* renamed from: a */
    public final C6689qa mo3679a(C6689qa c6689qa) throws C6752ra {
        int i = c6689qa.f41028c;
        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 4 ? new C6689qa(c6689qa.f41026a, c6689qa.f41027b, 4) : C6689qa.f41025e;
        }
        throw new C6752ra(c6689qa);
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: f */
    public final void mo3682f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM7059k;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f10362b.f41028c;
        if (i2 == 21) {
            byteBufferM7059k = m7059k((i / 3) * 4);
            while (iPosition < iLimit) {
                m6385l(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM7059k);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferM7059k = m7059k(i);
            while (iPosition < iLimit) {
                m6385l((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM7059k);
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferM7059k = m7059k((i / 3) * 4);
            while (iPosition < iLimit) {
                m6385l(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM7059k);
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferM7059k = m7059k(i);
            while (iPosition < iLimit) {
                m6385l((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM7059k);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM7059k.flip();
    }
}
