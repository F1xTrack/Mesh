package p000;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: Dk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7490Dk0 extends H41 {

    /* renamed from: f */
    public final /* synthetic */ E90 f2223f;

    /* renamed from: g */
    public final /* synthetic */ RD0 f2224g;

    /* renamed from: h */
    public final /* synthetic */ C10737q70 f2225h;

    /* renamed from: i */
    public final /* synthetic */ CancellationSignal f2226i;

    /* renamed from: j */
    public final /* synthetic */ C7542Ek0 f2227j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7490Dk0(C7542Ek0 c7542Ek0, AbstractC1237Tf abstractC1237Tf, E90 e90, RD0 rd0, E90 e902, RD0 rd02, C10737q70 c10737q70, CancellationSignal cancellationSignal) {
        super(abstractC1237Tf, e90, rd0, "LocalThumbnailBitmapSdk29Producer");
        this.f2227j = c7542Ek0;
        this.f2223f = e902;
        this.f2224g = rd02;
        this.f2225h = c10737q70;
        this.f2226i = cancellationSignal;
    }

    @Override // p000.H41
    /* renamed from: b */
    public final void mo845b(Object obj) {
        AbstractC7292zt.m26569p((AbstractC7292zt) obj);
    }

    @Override // p000.H41
    /* renamed from: c */
    public final Map mo846c(Object obj) {
        return C1380Vw.m8640a("createdThumbnail", String.valueOf(((AbstractC7292zt) obj) != null));
    }

    @Override // p000.H41
    /* renamed from: d */
    public final Object mo847d() throws IOException {
        String strM10480a;
        Bitmap bitmapLoadThumbnail;
        C7542Ek0 c7542Ek0 = this.f2227j;
        C10737q70 c10737q70 = this.f2225h;
        C9115dS0 c9115dS0 = c10737q70.f40615h;
        int i = c9115dS0 != null ? c9115dS0.f26115a : 2048;
        Uri uri = c10737q70.f40609b;
        Size size = new Size(i, c9115dS0 != null ? c9115dS0.f26116b : 2048);
        try {
            c7542Ek0.getClass();
            strM10480a = AbstractC8885bh1.m10480a(c7542Ek0.f2875c, uri);
        } catch (IllegalArgumentException unused) {
            strM10480a = null;
        }
        CancellationSignal cancellationSignal = this.f2226i;
        if (strM10480a != null) {
            String strM9384a = AbstractC8592Yp0.m9384a(strM10480a);
            bitmapLoadThumbnail = strM9384a != null ? D51.m1556o(strM9384a, "video/", false) : false ? ThumbnailUtils.createVideoThumbnail(new File(strM10480a), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(strM10480a), size, cancellationSignal);
        } else {
            bitmapLoadThumbnail = null;
        }
        if (bitmapLoadThumbnail == null) {
            bitmapLoadThumbnail = c7542Ek0.f2875c.loadThumbnail(uri, size, cancellationSignal);
        }
        if (bitmapLoadThumbnail == null) {
            return null;
        }
        C10689pl0 c10689pl0M23865l = C10689pl0.m23865l();
        T70 t70 = T70.f11167d;
        int i2 = C1336VE.f12442i;
        C1336VE c1336ve = new C1336VE(bitmapLoadThumbnail, c10689pl0M23865l, t70);
        C7027vg c7027vg = (C7027vg) this.f2224g;
        c7027vg.m25467i("thumbnail", "image_format");
        c1336ve.m8336a(c7027vg.f44478f);
        return AbstractC7292zt.m26566J(c1336ve);
    }

    @Override // p000.H41
    /* renamed from: e */
    public final void mo1865e() {
        super.mo1865e();
        this.f2226i.cancel();
    }

    @Override // p000.H41
    /* renamed from: f */
    public final void mo848f(Exception exc) {
        super.mo848f(exc);
        E90 e90 = this.f2223f;
        RD0 rd0 = this.f2224g;
        e90.mo748f(rd0, "LocalThumbnailBitmapSdk29Producer", false);
        ((C7027vg) rd0).m25469k(ImagesContract.LOCAL, "thumbnail_bitmap");
    }

    @Override // p000.H41
    /* renamed from: g */
    public final void mo849g(Object obj) {
        AbstractC7292zt abstractC7292zt = (AbstractC7292zt) obj;
        super.mo849g(abstractC7292zt);
        boolean z = abstractC7292zt != null;
        E90 e90 = this.f2223f;
        RD0 rd0 = this.f2224g;
        e90.mo748f(rd0, "LocalThumbnailBitmapSdk29Producer", z);
        ((C7027vg) rd0).m25469k(ImagesContract.LOCAL, "thumbnail_bitmap");
    }
}
