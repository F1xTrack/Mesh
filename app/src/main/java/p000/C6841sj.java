package p000;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: sj */
/* loaded from: classes.dex */
public final class C6841sj implements InterfaceC10827qq0, Closeable {

    /* renamed from: a */
    public ByteBuffer f42568a;

    /* renamed from: b */
    public final int f42569b;

    /* renamed from: c */
    public final long f42570c = System.identityHashCode(this);

    public C6841sj(int i) {
        this.f42568a = ByteBuffer.allocateDirect(i);
        this.f42569b = i;
    }

    /* renamed from: a */
    public final void m24771a(InterfaceC10827qq0 interfaceC10827qq0, int i) {
        ByteBuffer byteBuffer;
        if (!(interfaceC10827qq0 instanceof C6841sj)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        ML1.m5338e(!isClosed());
        C6841sj c6841sj = (C6841sj) interfaceC10827qq0;
        ML1.m5338e(!c6841sj.isClosed());
        this.f42568a.getClass();
        SA1.m7189c(0, c6841sj.f42569b, 0, i, this.f42569b);
        this.f42568a.position(0);
        synchronized (c6841sj) {
            byteBuffer = c6841sj.f42568a;
        }
        byteBuffer.getClass();
        byteBuffer.position(0);
        byte[] bArr = new byte[i];
        this.f42568a.get(bArr, 0, i);
        byteBuffer.put(bArr, 0, i);
    }

    @Override // p000.InterfaceC10827qq0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f42568a = null;
    }

    @Override // p000.InterfaceC10827qq0
    public final int getSize() {
        return this.f42569b;
    }

    @Override // p000.InterfaceC10827qq0
    public final synchronized boolean isClosed() {
        return this.f42568a == null;
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: m */
    public final long mo6578m() {
        return this.f42570c;
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: n */
    public final void mo6579n(InterfaceC10827qq0 interfaceC10827qq0, int i) {
        long jMo6578m = interfaceC10827qq0.mo6578m();
        long j = this.f42570c;
        if (jMo6578m == j) {
            Long.toHexString(j);
            Long.toHexString(interfaceC10827qq0.mo6578m());
            ML1.m5334a(Boolean.FALSE);
        }
        if (interfaceC10827qq0.mo6578m() < this.f42570c) {
            synchronized (interfaceC10827qq0) {
                synchronized (this) {
                    m24771a(interfaceC10827qq0, i);
                }
            }
        } else {
            synchronized (this) {
                synchronized (interfaceC10827qq0) {
                    m24771a(interfaceC10827qq0, i);
                }
            }
        }
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: o */
    public final synchronized int mo6580o(int i, byte[] bArr, int i2, int i3) {
        int iM7188b;
        bArr.getClass();
        ML1.m5338e(!isClosed());
        this.f42568a.getClass();
        iM7188b = SA1.m7188b(i, i3, this.f42569b);
        SA1.m7189c(i, bArr.length, i2, iM7188b, this.f42569b);
        this.f42568a.position(i);
        this.f42568a.put(bArr, i2, iM7188b);
        return iM7188b;
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: p */
    public final synchronized byte mo6581p(int i) {
        ML1.m5338e(!isClosed());
        ML1.m5334a(Boolean.valueOf(i >= 0));
        ML1.m5334a(Boolean.valueOf(i < this.f42569b));
        this.f42568a.getClass();
        return this.f42568a.get(i);
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: w */
    public final synchronized int mo6582w(int i, byte[] bArr, int i2, int i3) {
        int iM7188b;
        bArr.getClass();
        ML1.m5338e(!isClosed());
        this.f42568a.getClass();
        iM7188b = SA1.m7188b(i, i3, this.f42569b);
        SA1.m7189c(i, bArr.length, i2, iM7188b, this.f42569b);
        this.f42568a.position(i);
        this.f42568a.get(bArr, i2, iM7188b);
        return iM7188b;
    }
}
