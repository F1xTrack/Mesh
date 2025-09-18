package com.facebook.imagepipeline.memory;

import java.io.Closeable;
import p000.C3916dF;
import p000.InterfaceC10827qq0;
import p000.InterfaceC1090RK;
import p000.ML1;
import p000.SA1;

@InterfaceC1090RK
/* loaded from: classes.dex */
public class NativeMemoryChunk implements InterfaceC10827qq0, Closeable {

    /* renamed from: a */
    public final long f17847a;

    /* renamed from: b */
    public final int f17848b;

    /* renamed from: c */
    public boolean f17849c;

    static {
        C3916dF.m17513c("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        this.f17848b = i;
        this.f17847a = nativeAllocate(i);
        this.f17849c = false;
    }

    @InterfaceC1090RK
    private static native long nativeAllocate(int i);

    @InterfaceC1090RK
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @InterfaceC1090RK
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @InterfaceC1090RK
    private static native void nativeFree(long j);

    @InterfaceC1090RK
    private static native void nativeMemcpy(long j, long j2, int i);

    @InterfaceC1090RK
    private static native byte nativeReadByte(long j);

    /* renamed from: a */
    public final void m10902a(InterfaceC10827qq0 interfaceC10827qq0, int i) {
        if (!(interfaceC10827qq0 instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        ML1.m5338e(!isClosed());
        NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) interfaceC10827qq0;
        ML1.m5338e(!nativeMemoryChunk.isClosed());
        SA1.m7189c(0, nativeMemoryChunk.f17848b, 0, i, this.f17848b);
        long j = 0;
        nativeMemcpy(nativeMemoryChunk.f17847a + j, this.f17847a + j, i);
    }

    @Override // p000.InterfaceC10827qq0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f17849c) {
            this.f17849c = true;
            nativeFree(this.f17847a);
        }
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Integer.toHexString(System.identityHashCode(this));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // p000.InterfaceC10827qq0
    public final int getSize() {
        return this.f17848b;
    }

    @Override // p000.InterfaceC10827qq0
    public final synchronized boolean isClosed() {
        return this.f17849c;
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: m */
    public final long mo6578m() {
        return this.f17847a;
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: n */
    public final void mo6579n(InterfaceC10827qq0 interfaceC10827qq0, int i) {
        if (interfaceC10827qq0.mo6578m() == this.f17847a) {
            Integer.toHexString(System.identityHashCode(this));
            Integer.toHexString(System.identityHashCode(interfaceC10827qq0));
            Long.toHexString(this.f17847a);
            ML1.m5334a(Boolean.FALSE);
        }
        if (interfaceC10827qq0.mo6578m() < this.f17847a) {
            synchronized (interfaceC10827qq0) {
                synchronized (this) {
                    m10902a(interfaceC10827qq0, i);
                }
            }
        } else {
            synchronized (this) {
                synchronized (interfaceC10827qq0) {
                    m10902a(interfaceC10827qq0, i);
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
        iM7188b = SA1.m7188b(i, i3, this.f17848b);
        SA1.m7189c(i, bArr.length, i2, iM7188b, this.f17848b);
        nativeCopyFromByteArray(this.f17847a + i, bArr, i2, iM7188b);
        return iM7188b;
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: p */
    public final synchronized byte mo6581p(int i) {
        boolean z = true;
        ML1.m5338e(!isClosed());
        if (!(i >= 0)) {
            throw new IllegalArgumentException();
        }
        if (i >= this.f17848b) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException();
        }
        return nativeReadByte(this.f17847a + i);
    }

    @Override // p000.InterfaceC10827qq0
    /* renamed from: w */
    public final synchronized int mo6582w(int i, byte[] bArr, int i2, int i3) {
        int iM7188b;
        bArr.getClass();
        ML1.m5338e(!isClosed());
        iM7188b = SA1.m7188b(i, i3, this.f17848b);
        SA1.m7189c(i, bArr.length, i2, iM7188b, this.f17848b);
        nativeCopyToByteArray(this.f17847a + i, bArr, i2, iM7188b);
        return iM7188b;
    }

    public NativeMemoryChunk() {
        this.f17848b = 0;
        this.f17847a = 0L;
        this.f17849c = true;
    }
}
