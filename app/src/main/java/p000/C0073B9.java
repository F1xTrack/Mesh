package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: B9 */
/* loaded from: classes.dex */
public final class C0073B9 extends MediaCodec.Callback {

    /* renamed from: b */
    public final HandlerThread f591b;

    /* renamed from: c */
    public Handler f592c;

    /* renamed from: h */
    public MediaFormat f597h;

    /* renamed from: i */
    public MediaFormat f598i;

    /* renamed from: j */
    public MediaCodec.CodecException f599j;

    /* renamed from: k */
    public MediaCodec.CryptoException f600k;

    /* renamed from: l */
    public long f601l;

    /* renamed from: m */
    public boolean f602m;

    /* renamed from: n */
    public IllegalStateException f603n;

    /* renamed from: o */
    public C8278So0 f604o;

    /* renamed from: a */
    public final Object f590a = new Object();

    /* renamed from: d */
    public final C6327ks f593d = new C6327ks();

    /* renamed from: e */
    public final C6327ks f594e = new C6327ks();

    /* renamed from: f */
    public final ArrayDeque f595f = new ArrayDeque();

    /* renamed from: g */
    public final ArrayDeque f596g = new ArrayDeque();

    public C0073B9(HandlerThread handlerThread) {
        this.f591b = handlerThread;
    }

    /* renamed from: a */
    public final void m529a() {
        ArrayDeque arrayDeque = this.f596g;
        if (!arrayDeque.isEmpty()) {
            this.f598i = (MediaFormat) arrayDeque.getLast();
        }
        C6327ks c6327ks = this.f593d;
        c6327ks.f36731b = c6327ks.f36730a;
        C6327ks c6327ks2 = this.f594e;
        c6327ks2.f36731b = c6327ks2.f36730a;
        this.f595f.clear();
        arrayDeque.clear();
    }

    /* renamed from: b */
    public final void m530b(IllegalStateException illegalStateException) {
        synchronized (this.f590a) {
            this.f603n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f590a) {
            this.f600k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f590a) {
            this.f599j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        C1537YQ c1537yq;
        synchronized (this.f590a) {
            this.f593d.m22275a(i);
            C8278So0 c8278So0 = this.f604o;
            if (c8278So0 != null && (c1537yq = c8278So0.f10986a.f12080G) != null) {
                c1537yq.m9296a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        C1537YQ c1537yq;
        synchronized (this.f590a) {
            try {
                MediaFormat mediaFormat = this.f598i;
                if (mediaFormat != null) {
                    this.f594e.m22275a(-2);
                    this.f596g.add(mediaFormat);
                    this.f598i = null;
                }
                this.f594e.m22275a(i);
                this.f595f.add(bufferInfo);
                C8278So0 c8278So0 = this.f604o;
                if (c8278So0 != null && (c1537yq = c8278So0.f10986a.f12080G) != null) {
                    c1537yq.m9296a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f590a) {
            this.f594e.m22275a(-2);
            this.f596g.add(mediaFormat);
            this.f598i = null;
        }
    }
}
