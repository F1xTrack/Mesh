package p000;

import com.facebook.imagepipeline.image.EncodedImage;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: Ck0 */
/* loaded from: classes.dex */
public abstract class AbstractC7438Ck0 implements QD0 {

    /* renamed from: a */
    public final ExecutorService f1601a;

    /* renamed from: b */
    public final C1339VH f1602b;

    public AbstractC7438Ck0(ExecutorService executorService, C1339VH c1339vh) {
        this.f1601a = executorService;
        this.f1602b = c1339vh;
    }

    @Override // p000.QD0
    /* renamed from: a */
    public final void mo312a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        C7027vg c7027vg = (C7027vg) rd0;
        E90 e90 = c7027vg.f44475c;
        c7027vg.m25469k(ImagesContract.LOCAL, "fetch");
        C7386Bk0 c7386Bk0 = new C7386Bk0(this, abstractC1237Tf, e90, rd0, mo1307e(), c7027vg.f44473a, e90, rd0);
        c7027vg.m25462a(new C1146SD(3, c7386Bk0));
        this.f1601a.execute(c7386Bk0);
    }

    /* renamed from: c */
    public final EncodedImage m1305c(InputStream inputStream, int i) {
        C11467vq0 c11467vq0;
        C1273UE c1273ueM26566J;
        C1339VH c1339vh = this.f1602b;
        try {
            if (i <= 0) {
                c1339vh.getClass();
                O90.m5968f(inputStream, "inputStream");
                AbstractC10955rq0 abstractC10955rq0 = (AbstractC10955rq0) c1339vh.f12486b;
                c11467vq0 = new C11467vq0(abstractC10955rq0, abstractC10955rq0.f41927j[0]);
                try {
                    ((C0986Pf) c1339vh.f12487c).m6395f(inputStream, c11467vq0);
                    C11339uq0 c11339uq0M25523n = c11467vq0.m25523n();
                    c11467vq0.close();
                    c1273ueM26566J = AbstractC7292zt.m26566J(c11339uq0M25523n);
                } finally {
                }
            } else {
                c1339vh.getClass();
                O90.m5968f(inputStream, "inputStream");
                c11467vq0 = new C11467vq0((AbstractC10955rq0) c1339vh.f12486b, i);
                try {
                    ((C0986Pf) c1339vh.f12487c).m6395f(inputStream, c11467vq0);
                    C11339uq0 c11339uq0M25523n2 = c11467vq0.m25523n();
                    c11467vq0.close();
                    c1273ueM26566J = AbstractC7292zt.m26566J(c11339uq0M25523n2);
                } finally {
                }
            }
            C1273UE c1273ue = c1273ueM26566J;
            EncodedImage encodedImage = new EncodedImage(c1273ue);
            AbstractC0119Bt.m900b(inputStream);
            AbstractC7292zt.m26569p(c1273ue);
            return encodedImage;
        } catch (Throwable th) {
            AbstractC0119Bt.m900b(inputStream);
            AbstractC7292zt.m26569p(null);
            throw th;
        }
    }

    /* renamed from: d */
    public abstract EncodedImage mo1306d(C10737q70 c10737q70);

    /* renamed from: e */
    public abstract String mo1307e();
}
