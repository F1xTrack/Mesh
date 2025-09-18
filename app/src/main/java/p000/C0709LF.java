package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* renamed from: LF */
/* loaded from: classes.dex */
public final class C0709LF implements InterfaceC0834NF, InterfaceC11737xy0 {

    /* renamed from: a */
    public final ByteBuffer f6574a;

    public C0709LF() {
        this.f6574a = ByteBuffer.allocate(4);
    }

    @Override // p000.InterfaceC0834NF
    /* renamed from: a */
    public int mo4932a() {
        return (mo4935d() << 8) | mo4935d();
    }

    @Override // p000.InterfaceC11737xy0
    /* renamed from: b */
    public void mo4933b(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.f6574a) {
            this.f6574a.position(0);
            messageDigest.update(this.f6574a.putInt(num.intValue()).array());
        }
    }

    @Override // p000.InterfaceC0834NF
    /* renamed from: c */
    public long mo4934c(long j) {
        ByteBuffer byteBuffer = this.f6574a;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // p000.InterfaceC0834NF
    /* renamed from: d */
    public short mo4935d() throws C0771MF {
        ByteBuffer byteBuffer = this.f6574a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C0771MF();
    }

    @Override // p000.InterfaceC0834NF
    /* renamed from: f */
    public int mo4936f(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f6574a;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    public C0709LF(ByteBuffer byteBuffer) {
        this.f6574a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
