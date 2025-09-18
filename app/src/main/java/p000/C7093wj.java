package p000;

import java.nio.ByteBuffer;

/* renamed from: wj */
/* loaded from: classes.dex */
public final class C7093wj {

    /* renamed from: a */
    public final int f45042a;

    /* renamed from: b */
    public final int f45043b;

    /* renamed from: c */
    public final ByteBuffer f45044c;

    /* renamed from: d */
    public long f45045d;

    public C7093wj(ByteBuffer byteBuffer, C7023vc c7023vc, int i, int i2) {
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (iLimit != c7023vc.f44446a) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(iLimit, "Byte buffer size is not match with packet info: ", " != ");
            sbM26237n.append(c7023vc.f44446a);
            throw new IllegalStateException(sbM26237n.toString());
        }
        this.f45042a = i;
        this.f45043b = i2;
        this.f45044c = byteBuffer;
        this.f45045d = c7023vc.f44447b;
    }

    /* renamed from: a */
    public final C7023vc m25674a(ByteBuffer byteBuffer) {
        int iRemaining;
        long j = this.f45045d;
        ByteBuffer byteBuffer2 = this.f45044c;
        int iPosition = byteBuffer2.position();
        int iPosition2 = byteBuffer.position();
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            iRemaining = byteBuffer.remaining();
            this.f45045d += AbstractC9620hO1.m18814b(this.f45043b, AbstractC9620hO1.m18815c(this.f45042a, iRemaining));
            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
            byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
            byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
        } else {
            iRemaining = byteBuffer2.remaining();
            byteBuffer.put(byteBuffer2).limit(iPosition2 + iRemaining).position(iPosition2);
        }
        byteBuffer2.position(iPosition + iRemaining);
        return new C7023vc(iRemaining, j);
    }
}
