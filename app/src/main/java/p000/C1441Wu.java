package p000;

/* renamed from: Wu */
/* loaded from: classes.dex */
public final class C1441Wu extends AbstractC1567Yu {

    /* renamed from: f */
    public final /* synthetic */ int f13446f;

    /* renamed from: g */
    public final /* synthetic */ C1752av f13447g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1441Wu(C1752av c1752av, int i) {
        super(c1752av);
        this.f13446f = i;
        this.f13447g = c1752av;
    }

    @Override // p000.AbstractC1567Yu
    /* renamed from: a */
    public final Object mo8870a(int i) {
        switch (this.f13446f) {
            case 0:
                return this.f13447g.m10366k()[i];
            case 1:
                return new C1630Zu(this.f13447g, i);
            default:
                return this.f13447g.m10367l()[i];
        }
    }
}
