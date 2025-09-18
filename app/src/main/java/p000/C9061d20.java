package p000;

/* renamed from: d20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9061d20 extends AbstractC11058sd1 {

    /* renamed from: a */
    public AbstractC11058sd1 f25768a;

    @Override // p000.AbstractC11058sd1
    /* renamed from: a */
    public final void mo246a(C7890Lc0 c7890Lc0, Object obj) {
        AbstractC11058sd1 abstractC11058sd1 = this.f25768a;
        if (abstractC11058sd1 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC11058sd1.mo246a(c7890Lc0, obj);
    }
}
