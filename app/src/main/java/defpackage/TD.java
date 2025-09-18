package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class TD extends AbstractC8332zH {
    public final RD0 c;
    public final String d;
    public final E90 e;
    public final C8110y60 f;
    public boolean g;
    public final C1817Xb0 h;
    public int i;
    public final /* synthetic */ UD j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TD(UD ud, AbstractC1516Tf abstractC1516Tf, RD0 rd0, int i) {
        super(abstractC1516Tf);
        O90.f(abstractC1516Tf, "consumer");
        O90.f(rd0, "producerContext");
        this.j = ud;
        this.c = rd0;
        this.d = "ProgressiveDecoder";
        C7647vg c7647vg = (C7647vg) rd0;
        this.e = c7647vg.c;
        C8110y60 c8110y60 = c7647vg.a.g;
        O90.e(c8110y60, "producerContext.imageRequest.imageDecodeOptions");
        this.f = c8110y60;
        this.h = new C1817Xb0(ud.b, new C1069Nm(this, i, ud));
        c7647vg.a(new SD(0, this));
    }

    @Override // defpackage.AbstractC8332zH, defpackage.AbstractC1516Tf
    public final void d() {
        q(true);
        this.b.c();
    }

    @Override // defpackage.AbstractC8332zH, defpackage.AbstractC1516Tf
    public final void f(Throwable th) {
        O90.f(th, "t");
        q(true);
        this.b.e(th);
    }

    @Override // defpackage.AbstractC1516Tf
    public final void h(int i, Object obj) {
        EncodedImage encodedImage = (EncodedImage) obj;
        AbstractC4368iZ.b();
        boolean zA = AbstractC1516Tf.a(i);
        RD0 rd0 = this.c;
        if (zA) {
            AbstractC1516Tf abstractC1516Tf = this.b;
            if (encodedImage == null) {
                C7647vg c7647vg = (C7647vg) rd0;
                O90.a(c7647vg.f.get("cached_value_found"), Boolean.TRUE);
                c7647vg.l.t.getClass();
                C0254Da c0254Da = new C0254Da("Encoded image is null.", 6);
                q(true);
                abstractC1516Tf.e(c0254Da);
                return;
            }
            if (!encodedImage.isValid()) {
                C0254Da c0254Da2 = new C0254Da("Encoded image is not valid.", 6);
                q(true);
                abstractC1516Tf.e(c0254Da2);
                return;
            }
        }
        if (s(encodedImage, i)) {
            boolean zL = AbstractC1516Tf.l(i, 4);
            if (zA || zL || ((C7647vg) rd0).g()) {
                this.h.d();
            }
        }
    }

    @Override // defpackage.AbstractC8332zH, defpackage.AbstractC1516Tf
    public final void j(float f) {
        super.j(f * 0.99f);
    }

    public final C1723Vw m(InterfaceC7876wt interfaceC7876wt, long j, InterfaceC7379uG0 interfaceC7379uG0, boolean z, String str, String str2, String str3, String str4) {
        HashMap map;
        Object obj;
        String string = null;
        if (!this.e.i(this.c, "DecodeProducer")) {
            return null;
        }
        String strValueOf = String.valueOf(j);
        String strValueOf2 = String.valueOf(((T70) interfaceC7379uG0).b);
        String strValueOf3 = String.valueOf(z);
        if (interfaceC7876wt != null && (map = ((VE) interfaceC7876wt).a) != null && (obj = map.get("non_fatal_decode_error")) != null) {
            string = obj.toString();
        }
        String str5 = string;
        if (!(interfaceC7876wt instanceof InterfaceC0077At)) {
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
            return new C1723Vw(map2);
        }
        Bitmap bitmap = ((VE) ((InterfaceC0077At) interfaceC7876wt)).d;
        O90.e(bitmap, "image.underlyingBitmap");
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
        return new C1723Vw(map3);
    }

    public abstract int n(EncodedImage encodedImage);

    public abstract T70 o();

    public final InterfaceC7876wt p(EncodedImage encodedImage, int i, InterfaceC7379uG0 interfaceC7379uG0) throws Throwable {
        InputStream inputStream;
        UD ud = this.j;
        ud.getClass();
        ES1 es1 = ud.c;
        C8110y60 c8110y60 = this.f;
        es1.getClass();
        c8110y60.getClass();
        D60 imageFormat = encodedImage.getImageFormat();
        if ((imageFormat == null || imageFormat == D60.c) && (inputStream = encodedImage.getInputStream()) != null) {
            Object obj = E60.c;
            try {
                encodedImage.setImageFormat(V12.a(inputStream));
            } catch (IOException e) {
                AbstractC7243tY1.b(e);
                throw null;
            }
        }
        C3866fw1 c3866fw1 = (C3866fw1) es1.c;
        c3866fw1.getClass();
        D60 imageFormat2 = encodedImage.getImageFormat();
        ES1 es12 = (ES1) c3866fw1.b;
        es12.getClass();
        Boolean bool = Boolean.FALSE;
        c8110y60.getClass();
        if (imageFormat2 == KF.a) {
            AbstractC8446zt abstractC8446ztB = ((InterfaceC7173tB0) es12.b).b(encodedImage, c8110y60.a, i, null);
            try {
                abstractC8446ztB.getClass();
                int rotationAngle = encodedImage.getRotationAngle();
                int exifOrientation = encodedImage.getExifOrientation();
                int i2 = VE.i;
                VE ve = new VE(abstractC8446ztB, interfaceC7379uG0, rotationAngle, exifOrientation);
                if (VE.h.contains("is_rounded")) {
                    ve.a.put("is_rounded", bool);
                }
                return ve;
            } finally {
                AbstractC8446zt.p(abstractC8446ztB);
            }
        }
        if (imageFormat2 == KF.c) {
            if (encodedImage.getWidth() == -1 || encodedImage.getHeight() == -1) {
                throw new LD("image width or height is incorrect", encodedImage);
            }
            c8110y60.getClass();
            return es12.q(encodedImage, c8110y60);
        }
        if (imageFormat2 == KF.j) {
            c8110y60.getClass();
            return es12.q(encodedImage, c8110y60);
        }
        if (imageFormat2 != D60.c) {
            return es12.q(encodedImage, c8110y60);
        }
        throw new LD("unknown image format", encodedImage);
    }

    public final void q(boolean z) {
        synchronized (this) {
            if (z) {
                if (!this.g) {
                    this.b.i(1.0f);
                    this.g = true;
                    this.h.a();
                }
            }
        }
    }

    public final void r(EncodedImage encodedImage, InterfaceC7876wt interfaceC7876wt, int i) {
        ((C7647vg) this.c).i(Integer.valueOf(encodedImage.getWidth()), "encoded_width");
        ((C7647vg) this.c).i(Integer.valueOf(encodedImage.getHeight()), "encoded_height");
        ((C7647vg) this.c).i(Integer.valueOf(encodedImage.getSize()), "encoded_size");
        ((C7647vg) this.c).i(encodedImage.getColorSpace(), "image_color_space");
        if (interfaceC7876wt instanceof InterfaceC0077At) {
            Bitmap.Config config = ((VE) ((InterfaceC0077At) interfaceC7876wt)).d.getConfig();
            ((C7647vg) this.c).i(String.valueOf(config), "bitmap_config");
        }
        if (interfaceC7876wt != null) {
            ((VE) interfaceC7876wt).a(((C7647vg) this.c).f);
        }
        ((C7647vg) this.c).i(Integer.valueOf(i), "last_scan_num");
    }

    public abstract boolean s(EncodedImage encodedImage, int i);
}
