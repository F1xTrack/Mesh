package p000;

import android.content.ContentResolver;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.concurrent.ExecutorService;

/* renamed from: Ak0 */
/* loaded from: classes.dex */
public final class C7334Ak0 implements InterfaceC9516ga1 {

    /* renamed from: a */
    public final ExecutorService f344a;

    /* renamed from: b */
    public final C1339VH f345b;

    /* renamed from: c */
    public final ContentResolver f346c;

    public C7334Ak0(ExecutorService executorService, C1339VH c1339vh, ContentResolver contentResolver) {
        this.f344a = executorService;
        this.f345b = c1339vh;
        this.f346c = contentResolver;
    }

    @Override // p000.QD0
    /* renamed from: a */
    public final void mo312a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        C7027vg c7027vg = (C7027vg) rd0;
        E90 e90 = c7027vg.f44475c;
        c7027vg.m25469k(ImagesContract.LOCAL, "exif");
        C11963zk0 c11963zk0 = new C11963zk0(this, abstractC1237Tf, e90, rd0, c7027vg.f44473a);
        c7027vg.m25462a(new C1146SD(2, c11963zk0));
        this.f344a.execute(c11963zk0);
    }

    @Override // p000.InterfaceC9516ga1
    /* renamed from: b */
    public final boolean mo313b(C9115dS0 c9115dS0) {
        return AbstractC11432vY1.m25448e(512, 512, c9115dS0);
    }
}
