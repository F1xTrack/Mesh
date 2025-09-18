package defpackage;

import android.content.ContentResolver;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.concurrent.ExecutorService;

/* renamed from: Ak0 */
/* loaded from: classes.dex */
public final class C0051Ak0 implements InterfaceC3991ga1 {
    public final ExecutorService a;
    public final VH b;
    public final ContentResolver c;

    public C0051Ak0(ExecutorService executorService, VH vh, ContentResolver contentResolver) {
        this.a = executorService;
        this.b = vh;
        this.c = contentResolver;
    }

    @Override // defpackage.QD0
    public final void a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        C7647vg c7647vg = (C7647vg) rd0;
        E90 e90 = c7647vg.c;
        c7647vg.k(ImagesContract.LOCAL, "exif");
        C8420zk0 c8420zk0 = new C8420zk0(this, abstractC1516Tf, e90, rd0, c7647vg.a);
        c7647vg.a(new SD(2, c8420zk0));
        this.a.execute(c8420zk0);
    }

    @Override // defpackage.InterfaceC3991ga1
    public final boolean b(C3394dS0 c3394dS0) {
        return AbstractC7625vY1.e(512, 512, c3394dS0);
    }
}
