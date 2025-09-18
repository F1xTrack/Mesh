package p000;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: Cp */
/* loaded from: classes.dex */
public final class C0178Cp extends AbstractRunnableC0304Ep {

    /* renamed from: b */
    public final /* synthetic */ C7863Ko1 f1671b;

    /* renamed from: c */
    public final /* synthetic */ UUID f1672c;

    public C0178Cp(C7863Ko1 c7863Ko1, UUID uuid) {
        this.f1671b = c7863Ko1;
        this.f1672c = uuid;
    }

    @Override // p000.AbstractRunnableC0304Ep
    /* renamed from: b */
    public final void mo1373b() {
        C7863Ko1 c7863Ko1 = this.f1671b;
        WorkDatabase workDatabase = c7863Ko1.f6316c;
        workDatabase.m23793c();
        try {
            AbstractRunnableC0304Ep.m2425a(c7863Ko1, this.f1672c.toString());
            workDatabase.m23799n();
            workDatabase.m23795j();
            CV0.m1192a(c7863Ko1.f6315b, c7863Ko1.f6316c, c7863Ko1.f6318e);
        } catch (Throwable th) {
            workDatabase.m23795j();
            throw th;
        }
    }
}
