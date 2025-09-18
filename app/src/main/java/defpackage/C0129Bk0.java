package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.os.ParcelFileDescriptor;
import com.facebook.imagepipeline.image.EncodedImage;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.FileNotFoundException;
import java.util.Map;

/* renamed from: Bk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129Bk0 extends H41 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ E90 g;
    public final /* synthetic */ RD0 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ QD0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0129Bk0(AbstractC1516Tf abstractC1516Tf, E90 e90, RD0 rd0, W91 w91) {
        super(abstractC1516Tf, e90, rd0, "BackgroundThreadHandoffProducer");
        this.i = abstractC1516Tf;
        this.g = e90;
        this.h = rd0;
        this.j = w91;
    }

    @Override // defpackage.H41
    public final void b(Object obj) {
        switch (this.f) {
            case 0:
                EncodedImage.closeSafely((EncodedImage) obj);
                break;
            case 1:
                AbstractC8446zt.p((AbstractC8446zt) obj);
                break;
        }
    }

    @Override // defpackage.H41
    public Map c(Object obj) {
        switch (this.f) {
            case 1:
                return C1723Vw.a("createdThumbnail", String.valueOf(((AbstractC8446zt) obj) != null));
            default:
                return super.c(obj);
        }
    }

    @Override // defpackage.H41
    public final Object d() throws Throwable {
        String strA;
        Bitmap frameAtTime;
        RD0 rd0 = this.h;
        int i = 1;
        Object obj = this.i;
        QD0 qd0 = this.j;
        switch (this.f) {
            case 0:
                AbstractC0207Ck0 abstractC0207Ck0 = (AbstractC0207Ck0) qd0;
                EncodedImage encodedImageD = abstractC0207Ck0.d((C6589q70) obj);
                E90 e90 = this.g;
                if (encodedImageD == null) {
                    e90.f(rd0, abstractC0207Ck0.e(), false);
                    ((C7647vg) rd0).k(ImagesContract.LOCAL, "fetch");
                    return null;
                }
                encodedImageD.parseMetaData();
                e90.f(rd0, abstractC0207Ck0.e(), true);
                C7647vg c7647vg = (C7647vg) rd0;
                c7647vg.k(ImagesContract.LOCAL, "fetch");
                c7647vg.i(encodedImageD.getColorSpace(), "image_color_space");
                return encodedImageD;
            case 1:
                C0363Ek0 c0363Ek0 = (C0363Ek0) qd0;
                C6589q70 c6589q70 = (C6589q70) obj;
                try {
                    c0363Ek0.getClass();
                    strA = AbstractC2374bh1.a(c0363Ek0.c, c6589q70.b);
                } catch (IllegalArgumentException unused) {
                    strA = null;
                }
                if (strA != null) {
                    C3394dS0 c3394dS0 = c6589q70.h;
                    if ((c3394dS0 != null ? c3394dS0.a : 2048) <= 96) {
                        if ((c3394dS0 != null ? c3394dS0.b : 2048) <= 96) {
                            i = 3;
                        }
                    }
                    frameAtTime = ThumbnailUtils.createVideoThumbnail(strA, i);
                } else {
                    frameAtTime = null;
                }
                if (frameAtTime == null) {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = c0363Ek0.c.openFileDescriptor(c6589q70.b, "r");
                        parcelFileDescriptorOpenFileDescriptor.getClass();
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                    } catch (FileNotFoundException unused2) {
                        frameAtTime = null;
                    }
                }
                if (frameAtTime == null) {
                    return null;
                }
                C6518pl0 c6518pl0L = C6518pl0.l();
                T70 t70 = T70.d;
                int i2 = VE.i;
                VE ve = new VE(frameAtTime, c6518pl0L, t70);
                C7647vg c7647vg2 = (C7647vg) rd0;
                c7647vg2.i("thumbnail", "image_format");
                ve.a(c7647vg2.f);
                return AbstractC8446zt.J(ve);
            default:
                return null;
        }
    }

    @Override // defpackage.H41
    public void f(Exception exc) {
        switch (this.f) {
            case 1:
                super.f(exc);
                E90 e90 = this.g;
                RD0 rd0 = this.h;
                e90.f(rd0, "VideoThumbnailProducer", false);
                ((C7647vg) rd0).k(ImagesContract.LOCAL, "video");
                break;
            default:
                super.f(exc);
                break;
        }
    }

    @Override // defpackage.H41
    public void g(Object obj) {
        switch (this.f) {
            case 1:
                AbstractC8446zt abstractC8446zt = (AbstractC8446zt) obj;
                super.g(abstractC8446zt);
                boolean z = abstractC8446zt != null;
                E90 e90 = this.g;
                RD0 rd0 = this.h;
                e90.f(rd0, "VideoThumbnailProducer", z);
                ((C7647vg) rd0).k(ImagesContract.LOCAL, "video");
                break;
            case 2:
                E90 e902 = this.g;
                RD0 rd02 = this.h;
                e902.a(rd02, "BackgroundThreadHandoffProducer", null);
                ((W91) this.j).b.a((AbstractC1516Tf) this.i, rd02);
                break;
            default:
                super.g(obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0129Bk0(AbstractC0207Ck0 abstractC0207Ck0, AbstractC1516Tf abstractC1516Tf, E90 e90, RD0 rd0, String str, C6589q70 c6589q70, E90 e902, RD0 rd02) {
        super(abstractC1516Tf, e90, rd0, str);
        this.j = abstractC0207Ck0;
        this.i = c6589q70;
        this.g = e902;
        this.h = rd02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0129Bk0(C0363Ek0 c0363Ek0, AbstractC1516Tf abstractC1516Tf, E90 e90, RD0 rd0, E90 e902, RD0 rd02, C6589q70 c6589q70) {
        super(abstractC1516Tf, e90, rd0, "VideoThumbnailProducer");
        this.j = c0363Ek0;
        this.g = e902;
        this.h = rd02;
        this.i = c6589q70;
    }

    private final void h(Object obj) {
    }
}
