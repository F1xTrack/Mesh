package defpackage;

import java.nio.ByteBuffer;

/* renamed from: Tg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1519Tg extends ZD {
    public long j;
    public int k;
    public int l;

    @Override // defpackage.ZD
    public final void t() {
        super.t();
        this.k = 0;
    }

    public final boolean x(ZD zd) {
        ByteBuffer byteBuffer;
        YN1.c(!zd.g(1073741824));
        YN1.c(!zd.g(268435456));
        YN1.c(!zd.g(4));
        if (y()) {
            if (this.k >= this.l) {
                return false;
            }
            ByteBuffer byteBuffer2 = zd.e;
            if (byteBuffer2 != null && (byteBuffer = this.e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.k;
        this.k = i + 1;
        if (i == 0) {
            this.g = zd.g;
            if (zd.g(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = zd.e;
        if (byteBuffer3 != null) {
            v(byteBuffer3.remaining());
            this.e.put(byteBuffer3);
        }
        this.j = zd.g;
        return true;
    }

    public final boolean y() {
        return this.k > 0;
    }
}
