package p000;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.concurrent.ExecutorService;

/* renamed from: Ek0 */
/* loaded from: classes.dex */
public final class C7542Ek0 implements QD0 {

    /* renamed from: a */
    public final /* synthetic */ int f2873a;

    /* renamed from: b */
    public final ExecutorService f2874b;

    /* renamed from: c */
    public final ContentResolver f2875c;

    public /* synthetic */ C7542Ek0(ExecutorService executorService, ContentResolver contentResolver, int i) {
        this.f2873a = i;
        this.f2874b = executorService;
        this.f2875c = contentResolver;
    }

    @Override // p000.QD0
    /* renamed from: a */
    public final void mo312a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        switch (this.f2873a) {
            case 0:
                C7027vg c7027vg = (C7027vg) rd0;
                E90 e90 = c7027vg.f44475c;
                c7027vg.m25469k(ImagesContract.LOCAL, "thumbnail_bitmap");
                C7490Dk0 c7490Dk0 = new C7490Dk0(this, abstractC1237Tf, e90, rd0, e90, rd0, c7027vg.f44473a, new CancellationSignal());
                c7027vg.m25462a(new C1146SD(4, c7490Dk0));
                this.f2874b.execute(c7490Dk0);
                break;
            default:
                C7027vg c7027vg2 = (C7027vg) rd0;
                E90 e902 = c7027vg2.f44475c;
                c7027vg2.m25469k(ImagesContract.LOCAL, "video");
                C7386Bk0 c7386Bk0 = new C7386Bk0(this, abstractC1237Tf, e902, rd0, e902, rd0, c7027vg2.f44473a);
                c7027vg2.m25462a(new C1146SD(5, c7386Bk0));
                this.f2874b.execute(c7386Bk0);
                break;
        }
    }
}
