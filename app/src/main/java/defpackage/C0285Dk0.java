package defpackage;

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
public final class C0285Dk0 extends H41 {
    public final /* synthetic */ E90 f;
    public final /* synthetic */ RD0 g;
    public final /* synthetic */ C6589q70 h;
    public final /* synthetic */ CancellationSignal i;
    public final /* synthetic */ C0363Ek0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0285Dk0(C0363Ek0 c0363Ek0, AbstractC1516Tf abstractC1516Tf, E90 e90, RD0 rd0, E90 e902, RD0 rd02, C6589q70 c6589q70, CancellationSignal cancellationSignal) {
        super(abstractC1516Tf, e90, rd0, "LocalThumbnailBitmapSdk29Producer");
        this.j = c0363Ek0;
        this.f = e902;
        this.g = rd02;
        this.h = c6589q70;
        this.i = cancellationSignal;
    }

    @Override // defpackage.H41
    public final void b(Object obj) {
        AbstractC8446zt.p((AbstractC8446zt) obj);
    }

    @Override // defpackage.H41
    public final Map c(Object obj) {
        return C1723Vw.a("createdThumbnail", String.valueOf(((AbstractC8446zt) obj) != null));
    }

    @Override // defpackage.H41
    public final Object d() throws IOException {
        String strA;
        Bitmap bitmapLoadThumbnail;
        C0363Ek0 c0363Ek0 = this.j;
        C6589q70 c6589q70 = this.h;
        C3394dS0 c3394dS0 = c6589q70.h;
        int i = c3394dS0 != null ? c3394dS0.a : 2048;
        Uri uri = c6589q70.b;
        Size size = new Size(i, c3394dS0 != null ? c3394dS0.b : 2048);
        try {
            c0363Ek0.getClass();
            strA = AbstractC2374bh1.a(c0363Ek0.c, uri);
        } catch (IllegalArgumentException unused) {
            strA = null;
        }
        CancellationSignal cancellationSignal = this.i;
        if (strA != null) {
            String strA2 = AbstractC1937Yp0.a(strA);
            bitmapLoadThumbnail = strA2 != null ? D51.o(strA2, "video/", false) : false ? ThumbnailUtils.createVideoThumbnail(new File(strA), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(strA), size, cancellationSignal);
        } else {
            bitmapLoadThumbnail = null;
        }
        if (bitmapLoadThumbnail == null) {
            bitmapLoadThumbnail = c0363Ek0.c.loadThumbnail(uri, size, cancellationSignal);
        }
        if (bitmapLoadThumbnail == null) {
            return null;
        }
        C6518pl0 c6518pl0L = C6518pl0.l();
        T70 t70 = T70.d;
        int i2 = VE.i;
        VE ve = new VE(bitmapLoadThumbnail, c6518pl0L, t70);
        C7647vg c7647vg = (C7647vg) this.g;
        c7647vg.i("thumbnail", "image_format");
        ve.a(c7647vg.f);
        return AbstractC8446zt.J(ve);
    }

    @Override // defpackage.H41
    public final void e() {
        super.e();
        this.i.cancel();
    }

    @Override // defpackage.H41
    public final void f(Exception exc) {
        super.f(exc);
        E90 e90 = this.f;
        RD0 rd0 = this.g;
        e90.f(rd0, "LocalThumbnailBitmapSdk29Producer", false);
        ((C7647vg) rd0).k(ImagesContract.LOCAL, "thumbnail_bitmap");
    }

    @Override // defpackage.H41
    public final void g(Object obj) {
        AbstractC8446zt abstractC8446zt = (AbstractC8446zt) obj;
        super.g(abstractC8446zt);
        boolean z = abstractC8446zt != null;
        E90 e90 = this.f;
        RD0 rd0 = this.g;
        e90.f(rd0, "LocalThumbnailBitmapSdk29Producer", z);
        ((C7647vg) rd0).k(ImagesContract.LOCAL, "thumbnail_bitmap");
    }
}
