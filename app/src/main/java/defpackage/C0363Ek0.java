package defpackage;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.concurrent.ExecutorService;

/* renamed from: Ek0 */
/* loaded from: classes.dex */
public final class C0363Ek0 implements QD0 {
    public final /* synthetic */ int a;
    public final ExecutorService b;
    public final ContentResolver c;

    public /* synthetic */ C0363Ek0(ExecutorService executorService, ContentResolver contentResolver, int i) {
        this.a = i;
        this.b = executorService;
        this.c = contentResolver;
    }

    @Override // defpackage.QD0
    public final void a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        switch (this.a) {
            case 0:
                C7647vg c7647vg = (C7647vg) rd0;
                E90 e90 = c7647vg.c;
                c7647vg.k(ImagesContract.LOCAL, "thumbnail_bitmap");
                C0285Dk0 c0285Dk0 = new C0285Dk0(this, abstractC1516Tf, e90, rd0, e90, rd0, c7647vg.a, new CancellationSignal());
                c7647vg.a(new SD(4, c0285Dk0));
                this.b.execute(c0285Dk0);
                break;
            default:
                C7647vg c7647vg2 = (C7647vg) rd0;
                E90 e902 = c7647vg2.c;
                c7647vg2.k(ImagesContract.LOCAL, "video");
                C0129Bk0 c0129Bk0 = new C0129Bk0(this, abstractC1516Tf, e902, rd0, e902, rd0, c7647vg2.a);
                c7647vg2.a(new SD(5, c0129Bk0));
                this.b.execute(c0129Bk0);
                break;
        }
    }
}
