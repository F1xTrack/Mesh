package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class WN implements VN {
    public final MediaCodec a;
    public final MediaCodec.BufferInfo b;
    public final int c;
    public final ByteBuffer d;
    public final C0599Hl e;
    public final C0365El f;
    public final AtomicBoolean g = new AtomicBoolean(false);

    public WN(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        this.c = i;
        this.d = mediaCodec.getOutputBuffer(i);
        this.b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.e = AbstractC8171yQ1.b(new C6702qj(atomicReference, 2));
        C0365El c0365El = (C0365El) atomicReference.get();
        c0365El.getClass();
        this.f = c0365El;
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
        if (this.g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        MediaCodec.BufferInfo bufferInfo = this.b;
        int i = bufferInfo.offset;
        ByteBuffer byteBuffer = this.d;
        byteBuffer.position(i);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }

    @Override // defpackage.VN
    public final long Y() {
        return this.b.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C0365El c0365El = this.f;
        if (this.g.getAndSet(true)) {
            return;
        }
        try {
            this.a.releaseOutputBuffer(this.c, false);
            c0365El.b(null);
        } catch (IllegalStateException e) {
            c0365El.d(e);
        }
    }

    @Override // defpackage.VN
    public final long size() {
        return this.b.size;
    }
}
