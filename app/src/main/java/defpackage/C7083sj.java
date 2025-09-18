package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: sj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7083sj implements InterfaceC6724qq0, Closeable {
    public ByteBuffer a;
    public final int b;
    public final long c = System.identityHashCode(this);

    public C7083sj(int i) {
        this.a = ByteBuffer.allocateDirect(i);
        this.b = i;
    }

    public final void a(InterfaceC6724qq0 interfaceC6724qq0, int i) {
        ByteBuffer byteBuffer;
        if (!(interfaceC6724qq0 instanceof C7083sj)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        ML1.e(!isClosed());
        C7083sj c7083sj = (C7083sj) interfaceC6724qq0;
        ML1.e(!c7083sj.isClosed());
        this.a.getClass();
        SA1.c(0, c7083sj.b, 0, i, this.b);
        this.a.position(0);
        synchronized (c7083sj) {
            byteBuffer = c7083sj.a;
        }
        byteBuffer.getClass();
        byteBuffer.position(0);
        byte[] bArr = new byte[i];
        this.a.get(bArr, 0, i);
        byteBuffer.put(bArr, 0, i);
    }

    @Override // defpackage.InterfaceC6724qq0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a = null;
    }

    @Override // defpackage.InterfaceC6724qq0
    public final int getSize() {
        return this.b;
    }

    @Override // defpackage.InterfaceC6724qq0
    public final synchronized boolean isClosed() {
        return this.a == null;
    }

    @Override // defpackage.InterfaceC6724qq0
    public final long m() {
        return this.c;
    }

    @Override // defpackage.InterfaceC6724qq0
    public final void n(InterfaceC6724qq0 interfaceC6724qq0, int i) {
        long jM = interfaceC6724qq0.m();
        long j = this.c;
        if (jM == j) {
            Long.toHexString(j);
            Long.toHexString(interfaceC6724qq0.m());
            ML1.a(Boolean.FALSE);
        }
        if (interfaceC6724qq0.m() < this.c) {
            synchronized (interfaceC6724qq0) {
                synchronized (this) {
                    a(interfaceC6724qq0, i);
                }
            }
        } else {
            synchronized (this) {
                synchronized (interfaceC6724qq0) {
                    a(interfaceC6724qq0, i);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC6724qq0
    public final synchronized int o(int i, byte[] bArr, int i2, int i3) {
        int iB;
        bArr.getClass();
        ML1.e(!isClosed());
        this.a.getClass();
        iB = SA1.b(i, i3, this.b);
        SA1.c(i, bArr.length, i2, iB, this.b);
        this.a.position(i);
        this.a.put(bArr, i2, iB);
        return iB;
    }

    @Override // defpackage.InterfaceC6724qq0
    public final synchronized byte p(int i) {
        ML1.e(!isClosed());
        ML1.a(Boolean.valueOf(i >= 0));
        ML1.a(Boolean.valueOf(i < this.b));
        this.a.getClass();
        return this.a.get(i);
    }

    @Override // defpackage.InterfaceC6724qq0
    public final synchronized int w(int i, byte[] bArr, int i2, int i3) {
        int iB;
        bArr.getClass();
        ML1.e(!isClosed());
        this.a.getClass();
        iB = SA1.b(i, i3, this.b);
        SA1.c(i, bArr.length, i2, iB, this.b);
        this.a.position(i);
        this.a.get(bArr, i2, iB);
        return iB;
    }
}
