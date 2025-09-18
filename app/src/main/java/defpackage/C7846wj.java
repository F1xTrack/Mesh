package defpackage;

import java.nio.ByteBuffer;

/* renamed from: wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7846wj {
    public final int a;
    public final int b;
    public final ByteBuffer c;
    public long d;

    public C7846wj(ByteBuffer byteBuffer, C7635vc c7635vc, int i, int i2) {
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (iLimit != c7635vc.a) {
            StringBuilder sbN = AbstractC8235ym.n(iLimit, "Byte buffer size is not match with packet info: ", " != ");
            sbN.append(c7635vc.a);
            throw new IllegalStateException(sbN.toString());
        }
        this.a = i;
        this.b = i2;
        this.c = byteBuffer;
        this.d = c7635vc.b;
    }

    public final C7635vc a(ByteBuffer byteBuffer) {
        int iRemaining;
        long j = this.d;
        ByteBuffer byteBuffer2 = this.c;
        int iPosition = byteBuffer2.position();
        int iPosition2 = byteBuffer.position();
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            iRemaining = byteBuffer.remaining();
            this.d += AbstractC4146hO1.b(this.b, AbstractC4146hO1.c(this.a, iRemaining));
            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
            byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
            byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
        } else {
            iRemaining = byteBuffer2.remaining();
            byteBuffer.put(byteBuffer2).limit(iPosition2 + iRemaining).position(iPosition2);
        }
        byteBuffer2.position(iPosition + iRemaining);
        return new C7635vc(iRemaining, j);
    }
}
