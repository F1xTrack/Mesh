package p000;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* renamed from: TD */
/* loaded from: classes.dex */
public abstract class AbstractC1209TD extends AbstractC7254zH {

    /* renamed from: c */
    public final RD0 f11198c;

    /* renamed from: d */
    public final String f11199d;

    /* renamed from: e */
    public final E90 f11200e;

    /* renamed from: f */
    public final C11756y60 f11201f;

    /* renamed from: g */
    public boolean f11202g;

    /* renamed from: h */
    public final C8512Xb0 f11203h;

    /* renamed from: i */
    public int f11204i;

    /* renamed from: j */
    public final /* synthetic */ C1272UD f11205j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1209TD(C1272UD c1272ud, AbstractC1237Tf abstractC1237Tf, RD0 rd0, int i) {
        super(abstractC1237Tf);
        O90.m5968f(abstractC1237Tf, "consumer");
        O90.m5968f(rd0, "producerContext");
        this.f11205j = c1272ud;
        this.f11198c = rd0;
        this.f11199d = "ProgressiveDecoder";
        C7027vg c7027vg = (C7027vg) rd0;
        this.f11200e = c7027vg.f44475c;
        C11756y60 c11756y60 = c7027vg.f44473a.f40614g;
        O90.m5967e(c11756y60, "producerContext.imageRequest.imageDecodeOptions");
        this.f11201f = c11756y60;
        this.f11203h = new C8512Xb0(c1272ud.f11686b, new C0867Nm(this, i, c1272ud));
        c7027vg.m25462a(new C1146SD(0, this));
    }

    @Override // p000.AbstractC7254zH, p000.AbstractC1237Tf
    /* renamed from: d */
    public final void mo6844d() {
        m7627q(true);
        this.f46773b.m7717c();
    }

    @Override // p000.AbstractC7254zH, p000.AbstractC1237Tf
    /* renamed from: f */
    public final void mo6845f(Throwable th) {
        O90.m5968f(th, "t");
        m7627q(true);
        this.f46773b.m7718e(th);
    }

    @Override // p000.AbstractC1237Tf
    /* renamed from: h */
    public final void mo6846h(int i, Object obj) {
        EncodedImage encodedImage = (EncodedImage) obj;
        AbstractC4250iZ.m19063b();
        boolean zM7714a = AbstractC1237Tf.m7714a(i);
        RD0 rd0 = this.f11198c;
        if (zM7714a) {
            AbstractC1237Tf abstractC1237Tf = this.f46773b;
            if (encodedImage == null) {
                C7027vg c7027vg = (C7027vg) rd0;
                O90.m5963a(c7027vg.f44478f.get("cached_value_found"), Boolean.TRUE);
                c7027vg.f44484l.f16804t.getClass();
                C0226Da c0226Da = new C0226Da("Encoded image is null.", 6);
                m7627q(true);
                abstractC1237Tf.m7718e(c0226Da);
                return;
            }
            if (!encodedImage.isValid()) {
                C0226Da c0226Da2 = new C0226Da("Encoded image is not valid.", 6);
                m7627q(true);
                abstractC1237Tf.m7718e(c0226Da2);
                return;
            }
        }
        if (mo6617s(encodedImage, i)) {
            boolean zM7716l = AbstractC1237Tf.m7716l(i, 4);
            if (zM7714a || zM7716l || ((C7027vg) rd0).m25465g()) {
                this.f11203h.m9096d();
            }
        }
    }

    @Override // p000.AbstractC7254zH, p000.AbstractC1237Tf
    /* renamed from: j */
    public final void mo6847j(float f) {
        super.mo6847j(f * 0.99f);
    }

    /* renamed from: m */
    public final C1380Vw m7625m(InterfaceC7103wt interfaceC7103wt, long j, InterfaceC11267uG0 interfaceC11267uG0, boolean z, String str, String str2, String str3, String str4) {
        HashMap map;
        Object obj;
        String string = null;
        if (!this.f11200e.mo751i(this.f11198c, "DecodeProducer")) {
            return null;
        }
        String strValueOf = String.valueOf(j);
        String strValueOf2 = String.valueOf(((T70) interfaceC11267uG0).f11169b);
        String strValueOf3 = String.valueOf(z);
        if (interfaceC7103wt != null && (map = ((C1336VE) interfaceC7103wt).f12443a) != null && (obj = map.get("non_fatal_decode_error")) != null) {
            string = obj.toString();
        }
        String str5 = string;
        if (!(interfaceC7103wt instanceof InterfaceC0056At)) {
            HashMap map2 = new HashMap(7);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", str3);
            map2.put("sampleSize", str4);
            if (str5 != null) {
                map2.put("non_fatal_decode_error", str5);
            }
            return new C1380Vw(map2);
        }
        Bitmap bitmap = ((C1336VE) ((InterfaceC0056At) interfaceC7103wt)).f12446d;
        O90.m5967e(bitmap, "image.underlyingBitmap");
        String str6 = bitmap.getWidth() + "x" + bitmap.getHeight();
        HashMap map3 = new HashMap(8);
        map3.put("bitmapSize", str6);
        map3.put("queueTime", strValueOf);
        map3.put("hasGoodQuality", strValueOf2);
        map3.put("isFinal", strValueOf3);
        map3.put("encodedImageSize", str2);
        map3.put("imageFormat", str);
        map3.put("requestedImageSize", str3);
        map3.put("sampleSize", str4);
        int byteCount = bitmap.getByteCount();
        StringBuilder sb = new StringBuilder();
        sb.append(byteCount);
        map3.put("byteCount", sb.toString());
        if (str5 != null) {
            map3.put("non_fatal_decode_error", str5);
        }
        return new C1380Vw(map3);
    }

    /* renamed from: n */
    public abstract int mo6615n(EncodedImage encodedImage);

    /* renamed from: o */
    public abstract T70 mo6616o();

    /* renamed from: p */
    public final InterfaceC7103wt m7626p(EncodedImage encodedImage, int i, InterfaceC11267uG0 interfaceC11267uG0) throws Throwable {
        InputStream inputStream;
        C1272UD c1272ud = this.f11205j;
        c1272ud.getClass();
        ES1 es1 = c1272ud.f11687c;
        C11756y60 c11756y60 = this.f11201f;
        es1.getClass();
        c11756y60.getClass();
        D60 imageFormat = encodedImage.getImageFormat();
        if ((imageFormat == null || imageFormat == D60.f1843c) && (inputStream = encodedImage.getInputStream()) != null) {
            Object obj = E60.f2475c;
            try {
                encodedImage.setImageFormat(V12.m8270a(inputStream));
            } catch (IOException e) {
                AbstractC11176tY1.m24943b(e);
                throw null;
            }
        }
        C9432fw1 c9432fw1 = (C9432fw1) es1.f2709c;
        c9432fw1.getClass();
        D60 imageFormat2 = encodedImage.getImageFormat();
        ES1 es12 = (ES1) c9432fw1.f27505b;
        es12.getClass();
        Boolean bool = Boolean.FALSE;
        c11756y60.getClass();
        if (imageFormat2 == AbstractC0646KF.f5957a) {
            AbstractC7292zt abstractC7292ztMo5958b = ((InterfaceC11129tB0) es12.f2708b).mo5958b(encodedImage, c11756y60.f46088a, i, null);
            try {
                abstractC7292ztMo5958b.getClass();
                int rotationAngle = encodedImage.getRotationAngle();
                int exifOrientation = encodedImage.getExifOrientation();
                int i2 = C1336VE.f12442i;
                C1336VE c1336ve = new C1336VE(abstractC7292ztMo5958b, interfaceC11267uG0, rotationAngle, exifOrientation);
                if (C1336VE.f12441h.contains("is_rounded")) {
                    c1336ve.f12443a.put("is_rounded", bool);
                }
                return c1336ve;
            } finally {
                AbstractC7292zt.m26569p(abstractC7292ztMo5958b);
            }
        }
        if (imageFormat2 == AbstractC0646KF.f5959c) {
            if (encodedImage.getWidth() == -1 || encodedImage.getHeight() == -1) {
                throw new C0707LD("image width or height is incorrect", encodedImage);
            }
            c11756y60.getClass();
            return es12.m2296q(encodedImage, c11756y60);
        }
        if (imageFormat2 == AbstractC0646KF.f5966j) {
            c11756y60.getClass();
            return es12.m2296q(encodedImage, c11756y60);
        }
        if (imageFormat2 != D60.f1843c) {
            return es12.m2296q(encodedImage, c11756y60);
        }
        throw new C0707LD("unknown image format", encodedImage);
    }

    /* renamed from: q */
    public final void m7627q(boolean z) {
        synchronized (this) {
            if (z) {
                if (!this.f11202g) {
                    this.f46773b.m7720i(1.0f);
                    this.f11202g = true;
                    this.f11203h.m9093a();
                }
            }
        }
    }

    /* renamed from: r */
    public final void m7628r(EncodedImage encodedImage, InterfaceC7103wt interfaceC7103wt, int i) {
        ((C7027vg) this.f11198c).m25467i(Integer.valueOf(encodedImage.getWidth()), "encoded_width");
        ((C7027vg) this.f11198c).m25467i(Integer.valueOf(encodedImage.getHeight()), "encoded_height");
        ((C7027vg) this.f11198c).m25467i(Integer.valueOf(encodedImage.getSize()), "encoded_size");
        ((C7027vg) this.f11198c).m25467i(encodedImage.getColorSpace(), "image_color_space");
        if (interfaceC7103wt instanceof InterfaceC0056At) {
            Bitmap.Config config = ((C1336VE) ((InterfaceC0056At) interfaceC7103wt)).f12446d.getConfig();
            ((C7027vg) this.f11198c).m25467i(String.valueOf(config), "bitmap_config");
        }
        if (interfaceC7103wt != null) {
            ((C1336VE) interfaceC7103wt).m8336a(((C7027vg) this.f11198c).f44478f);
        }
        ((C7027vg) this.f11198c).m25467i(Integer.valueOf(i), "last_scan_num");
    }

    /* renamed from: s */
    public abstract boolean mo6617s(EncodedImage encodedImage, int i);
}
