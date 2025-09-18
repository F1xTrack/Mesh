package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ZD extends F9 {
    public C6666qX c;
    public final C6218oB d = new C6218oB();
    public ByteBuffer e;
    public boolean f;
    public long g;
    public ByteBuffer h;
    public final int i;

    static {
        AbstractC6911rp0.a("media3.decoder");
    }

    public ZD(int i) {
        this.i = i;
    }

    public void t() {
        this.b = 0;
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f = false;
    }

    public final ByteBuffer u(int i) {
        int i2 = this.i;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.e;
        throw new YD(AbstractC8235ym.j("Buffer too small (", " < ", byteBuffer == null ? 0 : byteBuffer.capacity(), i, ")"));
    }

    public final void v(int i) {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null) {
            this.e = u(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferU = u(i2);
        byteBufferU.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferU.put(byteBuffer);
        }
        this.e = byteBufferU;
    }

    public final void w() {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
