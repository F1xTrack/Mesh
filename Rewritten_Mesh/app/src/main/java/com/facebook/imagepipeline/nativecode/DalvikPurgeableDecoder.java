package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.List;
import java.util.Locale;
import p000.AbstractC11176tY1;
import p000.AbstractC1374Vq;
import p000.AbstractC1428Wh;
import p000.AbstractC6697qi;
import p000.AbstractC7292zt;
import p000.AbstractC9073d70;
import p000.C11339uq0;
import p000.C1273UE;
import p000.C1365Vh;
import p000.C3916dF;
import p000.C6838sg;
import p000.InterfaceC0902OK;
import p000.InterfaceC1090RK;
import p000.InterfaceC11129tB0;
import p000.O90;

@InterfaceC1090RK
/* loaded from: classes.dex */
public abstract class DalvikPurgeableDecoder implements InterfaceC11129tB0 {

    /* renamed from: b */
    public static final byte[] f17851b;

    /* renamed from: a */
    public final C1365Vh f17852a;

    @InterfaceC0902OK
    public static class OreoUtils {
        private OreoUtils() {
        }
    }

    static {
        List list = AbstractC9073d70.f25823a;
        C3916dF.m17513c("imagepipeline");
        f17851b = new byte[]{-1, -39};
    }

    public DalvikPurgeableDecoder() {
        if (AbstractC1428Wh.f13320c == null) {
            synchronized (AbstractC1428Wh.class) {
                if (AbstractC1428Wh.f13320c == null) {
                    AbstractC1428Wh.f13320c = new C1365Vh(AbstractC1428Wh.f13319b, AbstractC1428Wh.f13318a);
                }
            }
        }
        C1365Vh c1365Vh = AbstractC1428Wh.f13320c;
        O90.m5965c(c1365Vh);
        this.f17852a = c1365Vh;
    }

    /* renamed from: e */
    public static boolean m10903e(AbstractC7292zt abstractC7292zt, int i) {
        C11339uq0 c11339uq0 = (C11339uq0) abstractC7292zt.m26572w();
        return i >= 2 && c11339uq0.m25251n(i + (-2)) == -1 && c11339uq0.m25251n(i - 1) == -39;
    }

    @InterfaceC1090RK
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // p000.InterfaceC11129tB0
    /* renamed from: a */
    public final AbstractC7292zt mo5957a(EncodedImage encodedImage, Bitmap.Config config) {
        int sampleSize = encodedImage.getSampleSize();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = sampleSize;
        options.inMutable = true;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        AbstractC7292zt byteBufferRef = encodedImage.getByteBufferRef();
        byteBufferRef.getClass();
        try {
            return m10906f(mo10904c(byteBufferRef, options));
        } finally {
            AbstractC7292zt.m26569p(byteBufferRef);
        }
    }

    @Override // p000.InterfaceC11129tB0
    /* renamed from: b */
    public final AbstractC7292zt mo5958b(EncodedImage encodedImage, Bitmap.Config config, int i, ColorSpace colorSpace) {
        int sampleSize = encodedImage.getSampleSize();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = sampleSize;
        options.inMutable = true;
        if (Build.VERSION.SDK_INT >= 26) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
        AbstractC7292zt byteBufferRef = encodedImage.getByteBufferRef();
        byteBufferRef.getClass();
        try {
            return m10906f(mo10905d(byteBufferRef, i, options));
        } finally {
            AbstractC7292zt.m26569p(byteBufferRef);
        }
    }

    /* renamed from: c */
    public abstract Bitmap mo10904c(AbstractC7292zt abstractC7292zt, BitmapFactory.Options options);

    /* renamed from: d */
    public abstract Bitmap mo10905d(AbstractC7292zt abstractC7292zt, int i, BitmapFactory.Options options);

    /* renamed from: f */
    public final C1273UE m10906f(Bitmap bitmap) throws Throwable {
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            C1365Vh c1365Vh = this.f17852a;
            synchronized (c1365Vh) {
                int iM24051d = AbstractC6697qi.m24051d(bitmap);
                int i = c1365Vh.f12688a;
                if (i < c1365Vh.f12690c) {
                    long j = c1365Vh.f12689b + iM24051d;
                    if (j <= c1365Vh.f12691d) {
                        c1365Vh.f12688a = i + 1;
                        c1365Vh.f12689b = j;
                        return AbstractC7292zt.m26567S(bitmap, this.f17852a.f12692e, AbstractC7292zt.f47072f);
                    }
                }
                int iM24051d2 = AbstractC6697qi.m24051d(bitmap);
                bitmap.recycle();
                Locale locale = Locale.US;
                int iM8532b = this.f17852a.m8532b();
                long jM8535e = this.f17852a.m8535e();
                int iM8533c = this.f17852a.m8533c();
                int iM8534d = this.f17852a.m8534d();
                StringBuilder sbM8594m = AbstractC1374Vq.m8594m("Attempted to pin a bitmap of size ", " bytes. The current pool count is ", iM24051d2, iM8532b, ", the current pool size is ");
                sbM8594m.append(jM8535e);
                sbM8594m.append(" bytes. The current pool max count is ");
                sbM8594m.append(iM8533c);
                sbM8594m.append(", the current pool max size is ");
                sbM8594m.append(iM8534d);
                sbM8594m.append(" bytes.");
                throw new C6838sg(sbM8594m.toString());
            }
        } catch (Exception e) {
            bitmap.recycle();
            AbstractC11176tY1.m24943b(e);
            throw null;
        }
    }
}
