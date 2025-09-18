package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: Cp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221Cp extends AbstractRunnableC0377Ep {
    public final /* synthetic */ C0844Ko1 b;
    public final /* synthetic */ UUID c;

    public C0221Cp(C0844Ko1 c0844Ko1, UUID uuid) {
        this.b = c0844Ko1;
        this.c = uuid;
    }

    @Override // defpackage.AbstractRunnableC0377Ep
    public final void b() {
        C0844Ko1 c0844Ko1 = this.b;
        WorkDatabase workDatabase = c0844Ko1.c;
        workDatabase.c();
        try {
            AbstractRunnableC0377Ep.a(c0844Ko1, this.c.toString());
            workDatabase.n();
            workDatabase.j();
            CV0.a(c0844Ko1.b, c0844Ko1.c, c0844Ko1.e);
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
