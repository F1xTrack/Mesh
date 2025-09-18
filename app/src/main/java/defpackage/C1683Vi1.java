package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import kotlin.KotlinVersion;

/* renamed from: Vi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1683Vi1 implements InterfaceC8082xy0, InterfaceC3648en1 {
    public final ByteBuffer a;

    public C1683Vi1() {
        this.a = ByteBuffer.allocate(8);
    }

    @Override // defpackage.InterfaceC3648en1
    public int a() {
        return ((d() << 8) & 65280) | (d() & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    @Override // defpackage.InterfaceC8082xy0
    public void b(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putLong(l.longValue()).array());
        }
    }

    @Override // defpackage.InterfaceC3648en1
    public int d() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() < 1) {
            return -1;
        }
        return byteBuffer.get();
    }

    @Override // defpackage.InterfaceC3648en1
    public long g() {
        ByteBuffer byteBuffer = this.a;
        int iMin = (int) Math.min(byteBuffer.remaining(), 4L);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public C1683Vi1(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
