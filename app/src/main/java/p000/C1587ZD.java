package p000;

import java.nio.ByteBuffer;

/* renamed from: ZD */
/* loaded from: classes.dex */
public class C1587ZD extends AbstractC0325F9 {

    /* renamed from: c */
    public C6686qX f14796c;

    /* renamed from: d */
    public final C6536oB f14797d = new C6536oB();

    /* renamed from: e */
    public ByteBuffer f14798e;

    /* renamed from: f */
    public boolean f14799f;

    /* renamed from: g */
    public long f14800g;

    /* renamed from: h */
    public ByteBuffer f14801h;

    /* renamed from: i */
    public final int f14802i;

    static {
        AbstractC10953rp0.m24489a("media3.decoder");
    }

    public C1587ZD(int i) {
        this.f14802i = i;
    }

    /* renamed from: t */
    public void mo7722t() {
        this.f3082b = 0;
        ByteBuffer byteBuffer = this.f14798e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f14801h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f14799f = false;
    }

    /* renamed from: u */
    public final ByteBuffer m9505u(int i) {
        int i2 = this.f14802i;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f14798e;
        throw new C1524YD(AbstractC7222ym.m26233j("Buffer too small (", " < ", byteBuffer == null ? 0 : byteBuffer.capacity(), i, ")"));
    }

    /* renamed from: v */
    public final void m9506v(int i) {
        ByteBuffer byteBuffer = this.f14798e;
        if (byteBuffer == null) {
            this.f14798e = m9505u(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.f14798e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM9505u = m9505u(i2);
        byteBufferM9505u.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM9505u.put(byteBuffer);
        }
        this.f14798e = byteBufferM9505u;
    }

    /* renamed from: w */
    public final void m9507w() {
        ByteBuffer byteBuffer = this.f14798e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f14801h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
