package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rj */
/* loaded from: classes.dex */
public final class C6761rj implements InterfaceC1345VN {

    /* renamed from: a */
    public final ByteBuffer f41831a;

    /* renamed from: b */
    public final MediaCodec.BufferInfo f41832b;

    /* renamed from: c */
    public final C0300El f41833c;

    public C6761rj(InterfaceC1345VN interfaceC1345VN) {
        MediaCodec.BufferInfo bufferInfoMo8425C = interfaceC1345VN.mo8425C();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoMo8425C.size, bufferInfoMo8425C.presentationTimeUs, bufferInfoMo8425C.flags);
        this.f41832b = bufferInfo;
        ByteBuffer byteBufferMo8427Q = interfaceC1345VN.mo8427Q();
        MediaCodec.BufferInfo bufferInfoMo8425C2 = interfaceC1345VN.mo8425C();
        byteBufferMo8427Q.position(bufferInfoMo8425C2.offset);
        byteBufferMo8427Q.limit(bufferInfoMo8425C2.offset + bufferInfoMo8425C2.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoMo8425C2.size);
        byteBufferAllocate.order(byteBufferMo8427Q.order());
        byteBufferAllocate.put(byteBufferMo8427Q);
        byteBufferAllocate.flip();
        this.f41831a = byteBufferAllocate;
        AtomicReference atomicReference = new AtomicReference();
        AbstractC11797yQ1.m26149b(new C6698qj(atomicReference, 0));
        C0300El c0300El = (C0300El) atomicReference.get();
        c0300El.getClass();
        this.f41833c = c0300El;
    }

    @Override // p000.InterfaceC1345VN
    /* renamed from: C */
    public final MediaCodec.BufferInfo mo8425C() {
        return this.f41832b;
    }

    @Override // p000.InterfaceC1345VN
    /* renamed from: G */
    public final boolean mo8426G() {
        return (this.f41832b.flags & 1) != 0;
    }

    @Override // p000.InterfaceC1345VN
    /* renamed from: Q */
    public final ByteBuffer mo8427Q() {
        return this.f41831a;
    }

    @Override // p000.InterfaceC1345VN
    /* renamed from: Y */
    public final long mo8428Y() {
        return this.f41832b.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f41833c.m2375b(null);
    }

    @Override // p000.InterfaceC1345VN
    public final long size() {
        return this.f41832b.size;
    }
}
