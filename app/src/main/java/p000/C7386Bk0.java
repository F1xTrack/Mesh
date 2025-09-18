package p000;

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
public final class C7386Bk0 extends H41 {

    /* renamed from: f */
    public final /* synthetic */ int f1000f = 0;

    /* renamed from: g */
    public final /* synthetic */ E90 f1001g;

    /* renamed from: h */
    public final /* synthetic */ RD0 f1002h;

    /* renamed from: i */
    public final /* synthetic */ Object f1003i;

    /* renamed from: j */
    public final /* synthetic */ QD0 f1004j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7386Bk0(AbstractC1237Tf abstractC1237Tf, E90 e90, RD0 rd0, W91 w91) {
        super(abstractC1237Tf, e90, rd0, "BackgroundThreadHandoffProducer");
        this.f1003i = abstractC1237Tf;
        this.f1001g = e90;
        this.f1002h = rd0;
        this.f1004j = w91;
    }

    @Override // p000.H41
    /* renamed from: b */
    public final void mo845b(Object obj) {
        switch (this.f1000f) {
            case 0:
                EncodedImage.closeSafely((EncodedImage) obj);
                break;
            case 1:
                AbstractC7292zt.m26569p((AbstractC7292zt) obj);
                break;
        }
    }

    @Override // p000.H41
    /* renamed from: c */
    public Map mo846c(Object obj) {
        switch (this.f1000f) {
            case 1:
                return C1380Vw.m8640a("createdThumbnail", String.valueOf(((AbstractC7292zt) obj) != null));
            default:
                return super.mo846c(obj);
        }
    }

    @Override // p000.H41
    /* renamed from: d */
    public final Object mo847d() throws Throwable {
        String strM10480a;
        Bitmap frameAtTime;
        RD0 rd0 = this.f1002h;
        int i = 1;
        Object obj = this.f1003i;
        QD0 qd0 = this.f1004j;
        switch (this.f1000f) {
            case 0:
                AbstractC7438Ck0 abstractC7438Ck0 = (AbstractC7438Ck0) qd0;
                EncodedImage encodedImageMo1306d = abstractC7438Ck0.mo1306d((C10737q70) obj);
                E90 e90 = this.f1001g;
                if (encodedImageMo1306d == null) {
                    e90.mo748f(rd0, abstractC7438Ck0.mo1307e(), false);
                    ((C7027vg) rd0).m25469k(ImagesContract.LOCAL, "fetch");
                    return null;
                }
                encodedImageMo1306d.parseMetaData();
                e90.mo748f(rd0, abstractC7438Ck0.mo1307e(), true);
                C7027vg c7027vg = (C7027vg) rd0;
                c7027vg.m25469k(ImagesContract.LOCAL, "fetch");
                c7027vg.m25467i(encodedImageMo1306d.getColorSpace(), "image_color_space");
                return encodedImageMo1306d;
            case 1:
                C7542Ek0 c7542Ek0 = (C7542Ek0) qd0;
                C10737q70 c10737q70 = (C10737q70) obj;
                try {
                    c7542Ek0.getClass();
                    strM10480a = AbstractC8885bh1.m10480a(c7542Ek0.f2875c, c10737q70.f40609b);
                } catch (IllegalArgumentException unused) {
                    strM10480a = null;
                }
                if (strM10480a != null) {
                    C9115dS0 c9115dS0 = c10737q70.f40615h;
                    if ((c9115dS0 != null ? c9115dS0.f26115a : 2048) <= 96) {
                        if ((c9115dS0 != null ? c9115dS0.f26116b : 2048) <= 96) {
                            i = 3;
                        }
                    }
                    frameAtTime = ThumbnailUtils.createVideoThumbnail(strM10480a, i);
                } else {
                    frameAtTime = null;
                }
                if (frameAtTime == null) {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = c7542Ek0.f2875c.openFileDescriptor(c10737q70.f40609b, "r");
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
                C10689pl0 c10689pl0M23865l = C10689pl0.m23865l();
                T70 t70 = T70.f11167d;
                int i2 = C1336VE.f12442i;
                C1336VE c1336ve = new C1336VE(frameAtTime, c10689pl0M23865l, t70);
                C7027vg c7027vg2 = (C7027vg) rd0;
                c7027vg2.m25467i("thumbnail", "image_format");
                c1336ve.m8336a(c7027vg2.f44478f);
                return AbstractC7292zt.m26566J(c1336ve);
            default:
                return null;
        }
    }

    @Override // p000.H41
    /* renamed from: f */
    public void mo848f(Exception exc) {
        switch (this.f1000f) {
            case 1:
                super.mo848f(exc);
                E90 e90 = this.f1001g;
                RD0 rd0 = this.f1002h;
                e90.mo748f(rd0, "VideoThumbnailProducer", false);
                ((C7027vg) rd0).m25469k(ImagesContract.LOCAL, "video");
                break;
            default:
                super.mo848f(exc);
                break;
        }
    }

    @Override // p000.H41
    /* renamed from: g */
    public void mo849g(Object obj) {
        switch (this.f1000f) {
            case 1:
                AbstractC7292zt abstractC7292zt = (AbstractC7292zt) obj;
                super.mo849g(abstractC7292zt);
                boolean z = abstractC7292zt != null;
                E90 e90 = this.f1001g;
                RD0 rd0 = this.f1002h;
                e90.mo748f(rd0, "VideoThumbnailProducer", z);
                ((C7027vg) rd0).m25469k(ImagesContract.LOCAL, "video");
                break;
            case 2:
                E90 e902 = this.f1001g;
                RD0 rd02 = this.f1002h;
                e902.mo743a(rd02, "BackgroundThreadHandoffProducer", null);
                ((W91) this.f1004j).f13014b.mo312a((AbstractC1237Tf) this.f1003i, rd02);
                break;
            default:
                super.mo849g(obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7386Bk0(AbstractC7438Ck0 abstractC7438Ck0, AbstractC1237Tf abstractC1237Tf, E90 e90, RD0 rd0, String str, C10737q70 c10737q70, E90 e902, RD0 rd02) {
        super(abstractC1237Tf, e90, rd0, str);
        this.f1004j = abstractC7438Ck0;
        this.f1003i = c10737q70;
        this.f1001g = e902;
        this.f1002h = rd02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7386Bk0(C7542Ek0 c7542Ek0, AbstractC1237Tf abstractC1237Tf, E90 e90, RD0 rd0, E90 e902, RD0 rd02, C10737q70 c10737q70) {
        super(abstractC1237Tf, e90, rd0, "VideoThumbnailProducer");
        this.f1004j = c7542Ek0;
        this.f1001g = e902;
        this.f1002h = rd02;
        this.f1003i = c10737q70;
    }

    /* renamed from: h */
    private final void m844h(Object obj) {
    }
}
