package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: vq0 */
/* loaded from: classes.dex */
public final class C11467vq0 extends OutputStream {

    /* renamed from: a */
    public final AbstractC10955rq0 f44553a;

    /* renamed from: b */
    public C1273UE f44554b;

    /* renamed from: c */
    public int f44555c;

    public C11467vq0(AbstractC10955rq0 abstractC10955rq0, int i) {
        if (i <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        this.f44553a = abstractC10955rq0;
        this.f44555c = 0;
        this.f44554b = AbstractC7292zt.m26567S(abstractC10955rq0.get(i), abstractC10955rq0, AbstractC7292zt.f47072f);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC7292zt.m26569p(this.f44554b);
        this.f44554b = null;
        this.f44555c = -1;
        m25522m();
    }

    /* renamed from: m */
    public final void m25522m() throws Throwable {
        try {
            super.close();
        } catch (IOException e) {
            AbstractC11176tY1.m24943b(e);
            throw null;
        }
    }

    /* renamed from: n */
    public final C11339uq0 m25523n() {
        if (!AbstractC7292zt.m26565D(this.f44554b)) {
            throw new C6838sg("OutputStream no longer valid");
        }
        C1273UE c1273ue = this.f44554b;
        if (c1273ue != null) {
            return new C11339uq0(c1273ue, this.f44555c);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        O90.m5968f(bArr, "buffer");
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            if (AbstractC7292zt.m26565D(this.f44554b)) {
                int i3 = this.f44555c + i2;
                if (AbstractC7292zt.m26565D(this.f44554b)) {
                    C1273UE c1273ue = this.f44554b;
                    if (c1273ue != null) {
                        if (i3 > ((InterfaceC10827qq0) c1273ue.m26572w()).getSize()) {
                            AbstractC10955rq0 abstractC10955rq0 = this.f44553a;
                            Object obj = abstractC10955rq0.get(i3);
                            O90.m5967e(obj, "this.pool[newLength]");
                            InterfaceC10827qq0 interfaceC10827qq0 = (InterfaceC10827qq0) obj;
                            C1273UE c1273ue2 = this.f44554b;
                            if (c1273ue2 != null) {
                                ((InterfaceC10827qq0) c1273ue2.m26572w()).mo6579n(interfaceC10827qq0, this.f44555c);
                                C1273UE c1273ue3 = this.f44554b;
                                O90.m5965c(c1273ue3);
                                c1273ue3.close();
                                this.f44554b = AbstractC7292zt.m26567S(interfaceC10827qq0, abstractC10955rq0, AbstractC7292zt.f47072f);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        C1273UE c1273ue4 = this.f44554b;
                        if (c1273ue4 != null) {
                            ((InterfaceC10827qq0) c1273ue4.m26572w()).mo6580o(this.f44555c, bArr, i, i2);
                            this.f44555c += i2;
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new C6838sg("OutputStream no longer valid");
            }
            throw new C6838sg("OutputStream no longer valid");
        }
        StringBuilder sbM8594m = AbstractC1374Vq.m8594m("length=", "; regionStart=", bArr.length, i, "; regionLength=");
        sbM8594m.append(i2);
        throw new ArrayIndexOutOfBoundsException(sbM8594m.toString());
    }
}
