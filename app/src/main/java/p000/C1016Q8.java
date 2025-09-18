package p000;

import android.os.SharedMemory;
import android.system.ErrnoException;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: Q8 */
/* loaded from: classes.dex */
public final class C1016Q8 implements InterfaceC10827qq0, Closeable {

    /* renamed from: a */
    public SharedMemory f9487a;

    /* renamed from: b */
    public ByteBuffer f9488b;

    /* renamed from: c */
    public final long f9489c;

    public C1016Q8(int i) throws ErrnoException {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i);
            this.f9487a = sharedMemoryCreate;
            this.f9488b = sharedMemoryCreate.mapReadWrite();
            this.f9489c = System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    /* renamed from: a */
    public final void m6577a(InterfaceC10827qq0 interfaceC10827qq0, int i) {
        if (!(interfaceC10827qq0 instanceof C1016Q8)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        ML1.m5338e(!isClosed());
        C1016Q8 c1016q8 = (C1016Q8) interfaceC10827qq0;
        ML1.m5338e(!c1016q8.isClosed());
        this.f9488b.getClass();
        c1016q8.f9488b.getClass();
        SA1.m7189c(0, c1016q8.getSize(), 0, i, getSize());
        this.f9488b.position(0);
        c1016q8.f9488b.position(0);
        byte[] bArr = new byte[i];
        this.f9488b.get(bArr, 0, i);
        c1016q8.f9488b.put(bArr, 0, i);
    }

    @Override // p000.InterfaceC10827qq0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f9487a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f9488b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f9488b = null;
                this.f9487a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC10827qq0
    public final int getSize() {
        this.f9487a.getClass();
        return this.f9487a.getSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    @Override // p000.InterfaceC10827qq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean isClosed() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.f9488b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            android.os.SharedMemory r0 = r1.f9487a     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto La
            goto Le
        La:
            r0 = 0
            goto Lf
        Lc:
            r0 = move-exception
            goto L11
        Le:
            r0 = 1
        Lf:
            monitor-exit(r1)
            return r0
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1016Q8.isClosed():boolean");
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: m */
    public final long mo6578m() {
        return this.f9489c;
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: n */
    public final void mo6579n(InterfaceC10827qq0 interfaceC10827qq0, int i) {
        long jMo6578m = interfaceC10827qq0.mo6578m();
        long j = this.f9489c;
        if (jMo6578m == j) {
            Long.toHexString(j);
            Long.toHexString(interfaceC10827qq0.mo6578m());
            ML1.m5334a(Boolean.FALSE);
        }
        if (interfaceC10827qq0.mo6578m() < this.f9489c) {
            synchronized (interfaceC10827qq0) {
                synchronized (this) {
                    m6577a(interfaceC10827qq0, i);
                }
            }
        } else {
            synchronized (this) {
                synchronized (interfaceC10827qq0) {
                    m6577a(interfaceC10827qq0, i);
                }
            }
        }
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: o */
    public final synchronized int mo6580o(int i, byte[] bArr, int i2, int i3) {
        int iM7188b;
        bArr.getClass();
        this.f9488b.getClass();
        iM7188b = SA1.m7188b(i, i3, getSize());
        SA1.m7189c(i, bArr.length, i2, iM7188b, getSize());
        this.f9488b.position(i);
        this.f9488b.put(bArr, i2, iM7188b);
        return iM7188b;
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: p */
    public final synchronized byte mo6581p(int i) {
        ML1.m5338e(!isClosed());
        ML1.m5334a(Boolean.valueOf(i >= 0));
        ML1.m5334a(Boolean.valueOf(i < getSize()));
        this.f9488b.getClass();
        return this.f9488b.get(i);
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: w */
    public final synchronized int mo6582w(int i, byte[] bArr, int i2, int i3) {
        int iM7188b;
        bArr.getClass();
        this.f9488b.getClass();
        iM7188b = SA1.m7188b(i, i3, getSize());
        SA1.m7189c(i, bArr.length, i2, iM7188b, getSize());
        this.f9488b.position(i);
        this.f9488b.get(bArr, i2, iM7188b);
        return iM7188b;
    }
}
