package defpackage;

import android.os.SharedMemory;
import android.system.ErrnoException;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class Q8 implements InterfaceC6724qq0, Closeable {
    public SharedMemory a;
    public ByteBuffer b;
    public final long c;

    public Q8(int i) throws ErrnoException {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i);
            this.a = sharedMemoryCreate;
            this.b = sharedMemoryCreate.mapReadWrite();
            this.c = System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    public final void a(InterfaceC6724qq0 interfaceC6724qq0, int i) {
        if (!(interfaceC6724qq0 instanceof Q8)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        ML1.e(!isClosed());
        Q8 q8 = (Q8) interfaceC6724qq0;
        ML1.e(!q8.isClosed());
        this.b.getClass();
        q8.b.getClass();
        SA1.c(0, q8.getSize(), 0, i, getSize());
        this.b.position(0);
        q8.b.position(0);
        byte[] bArr = new byte[i];
        this.b.get(bArr, 0, i);
        q8.b.put(bArr, 0, i);
    }

    @Override // defpackage.InterfaceC6724qq0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.b = null;
                this.a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC6724qq0
    public final int getSize() {
        this.a.getClass();
        return this.a.getSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    @Override // defpackage.InterfaceC6724qq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean isClosed() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            android.os.SharedMemory r0 = r1.a     // Catch: java.lang.Throwable -> Lc
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q8.isClosed():boolean");
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
        this.b.getClass();
        iB = SA1.b(i, i3, getSize());
        SA1.c(i, bArr.length, i2, iB, getSize());
        this.b.position(i);
        this.b.put(bArr, i2, iB);
        return iB;
    }

    @Override // defpackage.InterfaceC6724qq0
    public final synchronized byte p(int i) {
        ML1.e(!isClosed());
        ML1.a(Boolean.valueOf(i >= 0));
        ML1.a(Boolean.valueOf(i < getSize()));
        this.b.getClass();
        return this.b.get(i);
    }

    @Override // defpackage.InterfaceC6724qq0
    public final synchronized int w(int i, byte[] bArr, int i2, int i3) {
        int iB;
        bArr.getClass();
        this.b.getClass();
        iB = SA1.b(i, i3, getSize());
        SA1.c(i, bArr.length, i2, iB, getSize());
        this.b.position(i);
        this.b.get(bArr, i2, iB);
        return iB;
    }
}
