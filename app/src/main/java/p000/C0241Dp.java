package p000;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* renamed from: Dp */
/* loaded from: classes.dex */
public final class C0241Dp extends AbstractRunnableC0304Ep {

    /* renamed from: b */
    public final /* synthetic */ C7863Ko1 f2259b;

    /* renamed from: c */
    public final /* synthetic */ String f2260c;

    /* renamed from: d */
    public final /* synthetic */ boolean f2261d;

    public C0241Dp(C7863Ko1 c7863Ko1, String str, boolean z) {
        this.f2259b = c7863Ko1;
        this.f2260c = str;
        this.f2261d = z;
    }

    @Override // p000.AbstractRunnableC0304Ep
    /* renamed from: b */
    public final void mo1373b() {
        C7863Ko1 c7863Ko1 = this.f2259b;
        WorkDatabase workDatabase = c7863Ko1.f6316c;
        workDatabase.m23793c();
        try {
            Iterator it = workDatabase.mo10328u().m8568k(this.f2260c).iterator();
            while (it.hasNext()) {
                AbstractRunnableC0304Ep.m2425a(c7863Ko1, (String) it.next());
            }
            workDatabase.m23799n();
            workDatabase.m23795j();
            if (this.f2261d) {
                CV0.m1192a(c7863Ko1.f6315b, c7863Ko1.f6316c, c7863Ko1.f6318e);
            }
        } catch (Throwable th) {
            workDatabase.m23795j();
            throw th;
        }
    }
}
