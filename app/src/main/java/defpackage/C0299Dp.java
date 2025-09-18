package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* renamed from: Dp */
/* loaded from: classes.dex */
public final class C0299Dp extends AbstractRunnableC0377Ep {
    public final /* synthetic */ C0844Ko1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public C0299Dp(C0844Ko1 c0844Ko1, String str, boolean z) {
        this.b = c0844Ko1;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.AbstractRunnableC0377Ep
    public final void b() {
        C0844Ko1 c0844Ko1 = this.b;
        WorkDatabase workDatabase = c0844Ko1.c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.u().k(this.c).iterator();
            while (it.hasNext()) {
                AbstractRunnableC0377Ep.a(c0844Ko1, (String) it.next());
            }
            workDatabase.n();
            workDatabase.j();
            if (this.d) {
                CV0.a(c0844Ko1.b, c0844Ko1.c, c0844Ko1.e);
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
