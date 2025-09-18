package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: Ck0 */
/* loaded from: classes.dex */
public abstract class AbstractC0207Ck0 implements QD0 {
    public final ExecutorService a;
    public final VH b;

    public AbstractC0207Ck0(ExecutorService executorService, VH vh) {
        this.a = executorService;
        this.b = vh;
    }

    @Override // defpackage.QD0
    public final void a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        C7647vg c7647vg = (C7647vg) rd0;
        E90 e90 = c7647vg.c;
        c7647vg.k(ImagesContract.LOCAL, "fetch");
        C0129Bk0 c0129Bk0 = new C0129Bk0(this, abstractC1516Tf, e90, rd0, e(), c7647vg.a, e90, rd0);
        c7647vg.a(new SD(3, c0129Bk0));
        this.a.execute(c0129Bk0);
    }

    public final EncodedImage c(InputStream inputStream, int i) {
        C7678vq0 c7678vq0;
        UE ueJ;
        VH vh = this.b;
        try {
            if (i <= 0) {
                vh.getClass();
                O90.f(inputStream, "inputStream");
                AbstractC6914rq0 abstractC6914rq0 = (AbstractC6914rq0) vh.b;
                c7678vq0 = new C7678vq0(abstractC6914rq0, abstractC6914rq0.j[0]);
                try {
                    ((C1204Pf) vh.c).f(inputStream, c7678vq0);
                    C7487uq0 c7487uq0N = c7678vq0.n();
                    c7678vq0.close();
                    ueJ = AbstractC8446zt.J(c7487uq0N);
                } finally {
                }
            } else {
                vh.getClass();
                O90.f(inputStream, "inputStream");
                c7678vq0 = new C7678vq0((AbstractC6914rq0) vh.b, i);
                try {
                    ((C1204Pf) vh.c).f(inputStream, c7678vq0);
                    C7487uq0 c7487uq0N2 = c7678vq0.n();
                    c7678vq0.close();
                    ueJ = AbstractC8446zt.J(c7487uq0N2);
                } finally {
                }
            }
            UE ue = ueJ;
            EncodedImage encodedImage = new EncodedImage(ue);
            AbstractC0155Bt.b(inputStream);
            AbstractC8446zt.p(ue);
            return encodedImage;
        } catch (Throwable th) {
            AbstractC0155Bt.b(inputStream);
            AbstractC8446zt.p(null);
            throw th;
        }
    }

    public abstract EncodedImage d(C6589q70 c6589q70);

    public abstract String e();
}
