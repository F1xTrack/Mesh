package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: w80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11506w80 {

    /* renamed from: a */
    public final MediaCodec f44684a;

    /* renamed from: b */
    public final int f44685b;

    /* renamed from: c */
    public final ByteBuffer f44686c;

    /* renamed from: d */
    public final C0489Hl f44687d;

    /* renamed from: e */
    public final C0300El f44688e;

    /* renamed from: f */
    public final AtomicBoolean f44689f = new AtomicBoolean(false);

    /* renamed from: g */
    public long f44690g = 0;

    /* renamed from: h */
    public boolean f44691h = false;

    public C11506w80(MediaCodec mediaCodec, int i) {
        mediaCodec.getClass();
        this.f44684a = mediaCodec;
        AbstractC9104dM1.m17548g(i);
        this.f44685b = i;
        this.f44686c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.f44687d = AbstractC11797yQ1.m26149b(new C6698qj(atomicReference, 5));
        C0300El c0300El = (C0300El) atomicReference.get();
        c0300El.getClass();
        this.f44688e = c0300El;
    }

    /* renamed from: a */
    public final void m25564a() {
        C0300El c0300El = this.f44688e;
        if (this.f44689f.getAndSet(true)) {
            return;
        }
        try {
            this.f44684a.queueInputBuffer(this.f44685b, 0, 0, 0L, 0);
            c0300El.m2375b(null);
        } catch (IllegalStateException e) {
            c0300El.m2377d(e);
        }
    }

    /* renamed from: b */
    public final void m25565b() {
        C0300El c0300El = this.f44688e;
        ByteBuffer byteBuffer = this.f44686c;
        if (this.f44689f.getAndSet(true)) {
            return;
        }
        try {
            this.f44684a.queueInputBuffer(this.f44685b, byteBuffer.position(), byteBuffer.limit(), this.f44690g, this.f44691h ? 4 : 0);
            c0300El.m2375b(null);
        } catch (IllegalStateException e) {
            c0300El.m2377d(e);
        }
    }
}
