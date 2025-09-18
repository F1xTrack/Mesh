package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: w80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7736w80 {
    public final MediaCodec a;
    public final int b;
    public final ByteBuffer c;
    public final C0599Hl d;
    public final C0365El e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = 0;
    public boolean h = false;

    public C7736w80(MediaCodec mediaCodec, int i) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        AbstractC3377dM1.g(i);
        this.b = i;
        this.c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.d = AbstractC8171yQ1.b(new C6702qj(atomicReference, 5));
        C0365El c0365El = (C0365El) atomicReference.get();
        c0365El.getClass();
        this.e = c0365El;
    }

    public final void a() {
        C0365El c0365El = this.e;
        if (this.f.getAndSet(true)) {
            return;
        }
        try {
            this.a.queueInputBuffer(this.b, 0, 0, 0L, 0);
            c0365El.b(null);
        } catch (IllegalStateException e) {
            c0365El.d(e);
        }
    }

    public final void b() {
        C0365El c0365El = this.e;
        ByteBuffer byteBuffer = this.c;
        if (this.f.getAndSet(true)) {
            return;
        }
        try {
            this.a.queueInputBuffer(this.b, byteBuffer.position(), byteBuffer.limit(), this.g, this.h ? 4 : 0);
            c0365El.b(null);
        } catch (IllegalStateException e) {
            c0365El.d(e);
        }
    }
}
