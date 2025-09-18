package p000;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import android.util.Range;
import java.io.IOException;
import java.util.Objects;

/* renamed from: cj1 */
/* loaded from: classes.dex */
public final class C9017cj1 extends AbstractC1259U0 implements InterfaceC8889bj1 {

    /* renamed from: d */
    public static final C0553Im f17713d = new C0553Im(8);

    /* renamed from: c */
    public final MediaCodecInfo.VideoCapabilities f17714c;

    public C9017cj1(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) this.f11615b).getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f17714c = videoCapabilities;
    }

    /* renamed from: w1 */
    public static C9017cj1 m10852w1(C1362Ve c1362Ve) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache lruCache = AbstractC6203iu.f34795a;
        String str = c1362Ve.f12673a;
        LruCache lruCache2 = AbstractC6203iu.f34795a;
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
            return new C9017cj1(mediaCodecInfo, c1362Ve.f12673a);
        } catch (Throwable th2) {
            th = th2;
            mediaCodecCreateEncoderByType = null;
        }
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: B */
    public final int mo10489B() {
        return this.f17714c.getWidthAlignment();
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: D0 */
    public final Range mo10490D0(int i) {
        try {
            return this.f17714c.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: E0 */
    public final int mo10491E0() {
        return this.f17714c.getHeightAlignment();
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: F0 */
    public final Range mo10492F0() {
        return this.f17714c.getSupportedWidths();
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: G */
    public final Range mo10493G() {
        return this.f17714c.getBitrateRange();
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: K0 */
    public final boolean mo10494K0(int i, int i2) {
        return this.f17714c.isSizeSupported(i, i2);
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: R0 */
    public final Range mo10495R0() {
        return this.f17714c.getSupportedHeights();
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: U */
    public final boolean mo10496U() {
        return true;
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: u */
    public final /* synthetic */ boolean mo10497u(int i, int i2) {
        return F91.m2529l(this, i, i2);
    }

    @Override // p000.InterfaceC8889bj1
    /* renamed from: y0 */
    public final Range mo10498y0(int i) {
        try {
            return this.f17714c.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }
}
