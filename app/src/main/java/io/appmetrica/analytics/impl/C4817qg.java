package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qg */
/* loaded from: classes2.dex */
public final class C4817qg extends AbstractC4625ig {
    public final tn b;

    public C4817qg(C4567g5 c4567g5) {
        this(c4567g5, c4567g5.u());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        C4567g5 c4567g5 = this.a;
        if (this.b.c()) {
            return false;
        }
        if (!this.b.d()) {
            C4619i9 c4619i9 = c4567g5.o;
            c4619i9.c.b(T5.a(t5, Wa.EVENT_TYPE_FIRST_ACTIVATION));
        }
        tn tnVar = this.b;
        synchronized (tnVar) {
            un unVar = tnVar.a;
            unVar.a(unVar.a().put("first_event_done", true));
        }
        return false;
    }

    public C4817qg(C4567g5 c4567g5, tn tnVar) {
        super(c4567g5);
        this.b = tnVar;
    }
}
