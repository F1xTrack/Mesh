package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6892rj implements VN {
    public final ByteBuffer a;
    public final MediaCodec.BufferInfo b;
    public final C0365El c;

    public C6892rj(VN vn) {
        MediaCodec.BufferInfo bufferInfoC = vn.C();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoC.size, bufferInfoC.presentationTimeUs, bufferInfoC.flags);
        this.b = bufferInfo;
        ByteBuffer byteBufferQ = vn.Q();
        MediaCodec.BufferInfo bufferInfoC2 = vn.C();
        byteBufferQ.position(bufferInfoC2.offset);
        byteBufferQ.limit(bufferInfoC2.offset + bufferInfoC2.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoC2.size);
        byteBufferAllocate.order(byteBufferQ.order());
        byteBufferAllocate.put(byteBufferQ);
        byteBufferAllocate.flip();
        this.a = byteBufferAllocate;
        AtomicReference atomicReference = new AtomicReference();
        AbstractC8171yQ1.b(new C6702qj(atomicReference, 0));
        C0365El c0365El = (C0365El) atomicReference.get();
        c0365El.getClass();
        this.c = c0365El;
    }

    @Override // defpackage.VN
    public final MediaCodec.BufferInfo C() {
        return this.b;
    }

    @Override // defpackage.VN
    public final boolean G() {
        return (this.b.flags & 1) != 0;
    }

    @Override // defpackage.VN
    public final ByteBuffer Q() {
        return this.a;
    }

    @Override // defpackage.VN
    public final long Y() {
        return this.b.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c.b(null);
    }

    @Override // defpackage.VN
    public final long size() {
        return this.b.size;
    }
}
