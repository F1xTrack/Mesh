package defpackage;

/* renamed from: d20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3314d20 extends AbstractC7067sd1 {
    public AbstractC7067sd1 a;

    @Override // defpackage.AbstractC7067sd1
    public final void a(C0885Lc0 c0885Lc0, Object obj) {
        AbstractC7067sd1 abstractC7067sd1 = this.a;
        if (abstractC7067sd1 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC7067sd1.a(c0885Lc0, obj);
    }
}
