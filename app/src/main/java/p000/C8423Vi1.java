package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import kotlin.KotlinVersion;

/* renamed from: Vi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8423Vi1 implements InterfaceC11737xy0, InterfaceC9286en1 {

    /* renamed from: a */
    public final ByteBuffer f12698a;

    public C8423Vi1() {
        this.f12698a = ByteBuffer.allocate(8);
    }

    @Override // p000.InterfaceC9286en1
    /* renamed from: a */
    public int mo4741a() {
        return ((mo4744d() << 8) & 65280) | (mo4744d() & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    @Override // p000.InterfaceC11737xy0
    /* renamed from: b */
    public void mo4933b(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f12698a) {
            this.f12698a.position(0);
            messageDigest.update(this.f12698a.putLong(l.longValue()).array());
        }
    }

    @Override // p000.InterfaceC9286en1
    /* renamed from: d */
    public int mo4744d() {
        ByteBuffer byteBuffer = this.f12698a;
        if (byteBuffer.remaining() < 1) {
            return -1;
        }
        return byteBuffer.get();
    }

    @Override // p000.InterfaceC9286en1
    /* renamed from: g */
    public long mo4747g() {
        ByteBuffer byteBuffer = this.f12698a;
        int iMin = (int) Math.min(byteBuffer.remaining(), 4L);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public C8423Vi1(ByteBuffer byteBuffer) {
        this.f12698a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
