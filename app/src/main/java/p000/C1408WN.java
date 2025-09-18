package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: WN */
/* loaded from: classes.dex */
public final class C1408WN implements InterfaceC1345VN {

    /* renamed from: a */
    public final MediaCodec f13148a;

    /* renamed from: b */
    public final MediaCodec.BufferInfo f13149b;

    /* renamed from: c */
    public final int f13150c;

    /* renamed from: d */
    public final ByteBuffer f13151d;

    /* renamed from: e */
    public final C0489Hl f13152e;

    /* renamed from: f */
    public final C0300El f13153f;

    /* renamed from: g */
    public final AtomicBoolean f13154g = new AtomicBoolean(false);

    public C1408WN(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.f13148a = mediaCodec;
        this.f13150c = i;
        this.f13151d = mediaCodec.getOutputBuffer(i);
        this.f13149b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.f13152e = AbstractC11797yQ1.m26149b(new C6698qj(atomicReference, 2));
        C0300El c0300El = (C0300El) atomicReference.get();
        c0300El.getClass();
        this.f13153f = c0300El;
    }

    @Override // p000.InterfaceC1345VN
    /* renamed from: C */
    public final MediaCodec.BufferInfo mo8425C() {
        return this.f13149b;
    }

    @Override // p000.InterfaceC1345VN
    /* renamed from: G */
    public final boolean mo8426G() {
        return (this.f13149b.flags & 1) != 0;
    }

    @Override // p000.InterfaceC1345VN
    /* renamed from: Q */
    public final ByteBuffer mo8427Q() {
        if (this.f13154g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        MediaCodec.BufferInfo bufferInfo = this.f13149b;
        int i = bufferInfo.offset;
        ByteBuffer byteBuffer = this.f13151d;
        byteBuffer.position(i);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }

    @Override // p000.InterfaceC1345VN
    /* renamed from: Y */
    public final long mo8428Y() {
        return this.f13149b.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C0300El c0300El = this.f13153f;
        if (this.f13154g.getAndSet(true)) {
            return;
        }
        try {
            this.f13148a.releaseOutputBuffer(this.f13150c, false);
            c0300El.m2375b(null);
        } catch (IllegalStateException e) {
            c0300El.m2377d(e);
        }
    }

    @Override // p000.InterfaceC1345VN
    public final long size() {
        return this.f13149b.size;
    }
}
