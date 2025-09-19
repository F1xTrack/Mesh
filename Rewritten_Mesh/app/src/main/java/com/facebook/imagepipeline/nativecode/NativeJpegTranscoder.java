package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p000.AbstractC0119Bt;
import p000.AbstractC0646KF;
import p000.AbstractC10195lu0;
import p000.AbstractC8796b02;
import p000.AbstractC9263ec0;
import p000.C11467vq0;
import p000.C3979eG;
import p000.C9115dS0;
import p000.CT0;
import p000.D60;
import p000.InterfaceC1090RK;
import p000.InterfaceC11504w70;
import p000.ML1;
import p000.Q70;

@InterfaceC1090RK
/* loaded from: classes.dex */
public class NativeJpegTranscoder implements InterfaceC11504w70 {

    /* renamed from: a */
    public boolean f17853a;

    /* renamed from: b */
    public int f17854b;

    /* renamed from: c */
    public boolean f17855c;

    /* renamed from: d */
    public static void m10908d(InputStream inputStream, C11467vq0 c11467vq0, int i, int i2, int i3) throws IOException {
        AbstractC10195lu0.m22592a();
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 <= 100)) {
            throw new IllegalArgumentException();
        }
        Q70 q70 = AbstractC9263ec0.f26777a;
        if (!(i >= 0 && i <= 270 && i % 90 == 0)) {
            throw new IllegalArgumentException();
        }
        ML1.m5335b("no transformation requested", (i2 == 8 && i == 0) ? false : true);
        nativeTranscodeJpeg(inputStream, c11467vq0, i, i2, i3);
    }

    /* renamed from: e */
    public static void m10909e(InputStream inputStream, C11467vq0 c11467vq0, int i, int i2, int i3) throws IOException {
        boolean z;
        AbstractC10195lu0.m22592a();
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 <= 100)) {
            throw new IllegalArgumentException();
        }
        Q70 q70 = AbstractC9263ec0.f26777a;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException();
        }
        ML1.m5335b("no transformation requested", (i2 == 8 && i == 1) ? false : true);
        nativeTranscodeJpegWithExifOrientation(inputStream, c11467vq0, i, i2, i3);
    }

    @InterfaceC1090RK
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @InterfaceC1090RK
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @Override // p000.InterfaceC11504w70
    /* renamed from: a */
    public final boolean mo2546a(D60 d60) {
        return d60 == AbstractC0646KF.f5957a;
    }

    @Override // p000.InterfaceC11504w70
    /* renamed from: b */
    public final C3979eG mo2547b(EncodedImage encodedImage, C11467vq0 c11467vq0, CT0 ct0, C9115dS0 c9115dS0, ColorSpace colorSpace) throws Throwable {
        Integer num = 85;
        if (ct0 == null) {
            ct0 = CT0.f1389b;
        }
        int iM10405e = AbstractC8796b02.m10405e(ct0, c9115dS0, encodedImage, this.f17854b);
        try {
            int iM18016c = AbstractC9263ec0.m18016c(ct0, c9115dS0, encodedImage, this.f17853a);
            int iMax = Math.max(1, 8 / iM10405e);
            if (this.f17855c) {
                iM18016c = iMax;
            }
            InputStream inputStream = encodedImage.getInputStream();
            if (AbstractC9263ec0.f26777a.contains(Integer.valueOf(encodedImage.getExifOrientation()))) {
                int iM18014a = AbstractC9263ec0.m18014a(ct0, encodedImage);
                ML1.m5337d(inputStream, "Cannot transcode from null input stream!");
                m10909e(inputStream, c11467vq0, iM18014a, iM18016c, num.intValue());
            } else {
                int iM18015b = AbstractC9263ec0.m18015b(ct0, encodedImage);
                ML1.m5337d(inputStream, "Cannot transcode from null input stream!");
                m10908d(inputStream, c11467vq0, iM18015b, iM18016c, num.intValue());
            }
            AbstractC0119Bt.m900b(inputStream);
            return new C3979eG(iM10405e != 1 ? 0 : 1, 2);
        } catch (Throwable th) {
            AbstractC0119Bt.m900b(null);
            throw th;
        }
    }

    @Override // p000.InterfaceC11504w70
    /* renamed from: c */
    public final boolean mo2548c(EncodedImage encodedImage, CT0 ct0, C9115dS0 c9115dS0) {
        if (ct0 == null) {
            ct0 = CT0.f1389b;
        }
        return AbstractC9263ec0.m18016c(ct0, c9115dS0, encodedImage, this.f17853a) < 8;
    }

    @Override // p000.InterfaceC11504w70
    public final String getIdentifier() {
        return "NativeJpegTranscoder";
    }
}
