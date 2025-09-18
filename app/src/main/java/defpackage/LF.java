package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class LF implements NF, InterfaceC8082xy0 {
    public final ByteBuffer a;

    public LF() {
        this.a = ByteBuffer.allocate(4);
    }

    @Override // defpackage.NF
    public int a() {
        return (d() << 8) | d();
    }

    @Override // defpackage.InterfaceC8082xy0
    public void b(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putInt(num.intValue()).array());
        }
    }

    @Override // defpackage.NF
    public long c(long j) {
        ByteBuffer byteBuffer = this.a;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // defpackage.NF
    public short d() throws MF {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new MF();
    }

    @Override // defpackage.NF
    public int f(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.a;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    public LF(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
