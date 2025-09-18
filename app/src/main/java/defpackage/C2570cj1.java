package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import android.util.Range;
import java.io.IOException;
import java.util.Objects;

/* renamed from: cj1 */
/* loaded from: classes.dex */
public final class C2570cj1 extends U0 implements InterfaceC2380bj1 {
    public static final C0680Im d = new C0680Im(8);
    public final MediaCodecInfo.VideoCapabilities c;

    public C2570cj1(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) this.b).getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.c = videoCapabilities;
    }

    public static C2570cj1 w1(C1669Ve c1669Ve) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache lruCache = AbstractC5207iu.a;
        String str = c1669Ve.a;
        LruCache lruCache2 = AbstractC5207iu.a;
        synchronized (lruCache2) {
            mediaCodecInfo = (MediaCodecInfo) lruCache2.get(str);
        }
        try {
            if (mediaCodecInfo == null) {
                try {
                    mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                    try {
                        MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                        synchronized (lruCache2) {
                            lruCache2.put(str, codecInfo);
                        }
                        mediaCodecCreateEncoderByType.release();
                        mediaCodecInfo = codecInfo;
                    } catch (Throwable th) {
                        th = th;
                        if (mediaCodecCreateEncoderByType != null) {
                            mediaCodecCreateEncoderByType.release();
                        }
                        throw th;
                    }
                } catch (IOException | IllegalArgumentException e) {
                    throw new U90(e);
                }
            }
            return new C2570cj1(mediaCodecInfo, c1669Ve.a);
        } catch (Throwable th2) {
            th = th2;
            mediaCodecCreateEncoderByType = null;
        }
    }

    @Override // defpackage.InterfaceC2380bj1
    public final int B() {
        return this.c.getWidthAlignment();
    }

    @Override // defpackage.InterfaceC2380bj1
    public final Range D0(int i) {
        try {
            return this.c.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // defpackage.InterfaceC2380bj1
    public final int E0() {
        return this.c.getHeightAlignment();
    }

    @Override // defpackage.InterfaceC2380bj1
    public final Range F0() {
        return this.c.getSupportedWidths();
    }

    @Override // defpackage.InterfaceC2380bj1
    public final Range G() {
        return this.c.getBitrateRange();
    }

    @Override // defpackage.InterfaceC2380bj1
    public final boolean K0(int i, int i2) {
        return this.c.isSizeSupported(i, i2);
    }

    @Override // defpackage.InterfaceC2380bj1
    public final Range R0() {
        return this.c.getSupportedHeights();
    }

    @Override // defpackage.InterfaceC2380bj1
    public final boolean U() {
        return true;
    }

    @Override // defpackage.InterfaceC2380bj1
    public final /* synthetic */ boolean u(int i, int i2) {
        return F91.l(this, i, i2);
    }

    @Override // defpackage.InterfaceC2380bj1
    public final Range y0(int i) {
        try {
            return this.c.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }
}
