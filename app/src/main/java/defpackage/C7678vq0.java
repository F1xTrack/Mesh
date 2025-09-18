package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: vq0 */
/* loaded from: classes.dex */
public final class C7678vq0 extends OutputStream {
    public final AbstractC6914rq0 a;
    public UE b;
    public int c;

    public C7678vq0(AbstractC6914rq0 abstractC6914rq0, int i) {
        if (i <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        this.a = abstractC6914rq0;
        this.c = 0;
        this.b = AbstractC8446zt.S(abstractC6914rq0.get(i), abstractC6914rq0, AbstractC8446zt.f);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC8446zt.p(this.b);
        this.b = null;
        this.c = -1;
        m();
    }

    public final void m() throws Throwable {
        try {
            super.close();
        } catch (IOException e) {
            AbstractC7243tY1.b(e);
            throw null;
        }
    }

    public final C7487uq0 n() {
        if (!AbstractC8446zt.D(this.b)) {
            throw new C7074sg("OutputStream no longer valid");
        }
        UE ue = this.b;
        if (ue != null) {
            return new C7487uq0(ue, this.c);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        O90.f(bArr, "buffer");
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            if (AbstractC8446zt.D(this.b)) {
                int i3 = this.c + i2;
                if (AbstractC8446zt.D(this.b)) {
                    UE ue = this.b;
                    if (ue != null) {
                        if (i3 > ((InterfaceC6724qq0) ue.w()).getSize()) {
                            AbstractC6914rq0 abstractC6914rq0 = this.a;
                            Object obj = abstractC6914rq0.get(i3);
                            O90.e(obj, "this.pool[newLength]");
                            InterfaceC6724qq0 interfaceC6724qq0 = (InterfaceC6724qq0) obj;
                            UE ue2 = this.b;
                            if (ue2 != null) {
                                ((InterfaceC6724qq0) ue2.w()).n(interfaceC6724qq0, this.c);
                                UE ue3 = this.b;
                                O90.c(ue3);
                                ue3.close();
                                this.b = AbstractC8446zt.S(interfaceC6724qq0, abstractC6914rq0, AbstractC8446zt.f);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        UE ue4 = this.b;
                        if (ue4 != null) {
                            ((InterfaceC6724qq0) ue4.w()).o(this.c, bArr, i, i2);
                            this.c += i2;
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new C7074sg("OutputStream no longer valid");
            }
            throw new C7074sg("OutputStream no longer valid");
        }
        StringBuilder sbM = AbstractC1705Vq.m("length=", "; regionStart=", bArr.length, i, "; regionLength=");
        sbM.append(i2);
        throw new ArrayIndexOutOfBoundsException(sbM.toString());
    }
}
