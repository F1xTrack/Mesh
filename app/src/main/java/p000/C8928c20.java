package p000;

/* renamed from: c20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8928c20 extends AbstractC10930rd1 {

    /* renamed from: a */
    public AbstractC10930rd1 f17264a;

    @Override // p000.AbstractC10930rd1
    /* renamed from: a */
    public final Object mo480a(C11820yc0 c11820yc0) {
        AbstractC10930rd1 abstractC10930rd1 = this.f17264a;
        if (abstractC10930rd1 != null) {
            return abstractC10930rd1.mo480a(c11820yc0);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: b */
    public final void mo481b(C7838Kc0 c7838Kc0, Object obj) {
        AbstractC10930rd1 abstractC10930rd1 = this.f17264a;
        if (abstractC10930rd1 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC10930rd1.mo481b(c7838Kc0, obj);
    }
}
