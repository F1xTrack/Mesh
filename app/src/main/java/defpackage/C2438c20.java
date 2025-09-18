package defpackage;

/* renamed from: c20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2438c20 extends AbstractC6876rd1 {
    public AbstractC6876rd1 a;

    @Override // defpackage.AbstractC6876rd1
    public final Object a(C8206yc0 c8206yc0) {
        AbstractC6876rd1 abstractC6876rd1 = this.a;
        if (abstractC6876rd1 != null) {
            return abstractC6876rd1.a(c8206yc0);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // defpackage.AbstractC6876rd1
    public final void b(C0807Kc0 c0807Kc0, Object obj) {
        AbstractC6876rd1 abstractC6876rd1 = this.a;
        if (abstractC6876rd1 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC6876rd1.b(c0807Kc0, obj);
    }
}
