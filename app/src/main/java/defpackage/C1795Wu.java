package defpackage;

/* renamed from: Wu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1795Wu extends AbstractC1951Yu {
    public final /* synthetic */ int f;
    public final /* synthetic */ C2223av g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1795Wu(C2223av c2223av, int i) {
        super(c2223av);
        this.f = i;
        this.g = c2223av;
    }

    @Override // defpackage.AbstractC1951Yu
    public final Object a(int i) {
        switch (this.f) {
            case 0:
                return this.g.k()[i];
            case 1:
                return new C2029Zu(this.g, i);
            default:
                return this.g.l()[i];
        }
    }
}
