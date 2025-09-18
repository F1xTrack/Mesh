package p000;

/* renamed from: wC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11515wC1 extends AbstractC1567Yu {

    /* renamed from: f */
    public final /* synthetic */ int f44709f;

    /* renamed from: g */
    public final /* synthetic */ C1752av f44710g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11515wC1(C1752av c1752av, int i) {
        super(c1752av, (byte) 0);
        this.f44709f = i;
        this.f44710g = c1752av;
    }

    @Override // p000.AbstractC1567Yu
    /* renamed from: b */
    public final Object mo9388b(int i) {
        C1752av c1752av = this.f44710g;
        switch (this.f44709f) {
            case 0:
                Object obj = C1752av.f16662k;
                return c1752av.m10370o()[i];
            case 1:
                return new C9470gD1(c1752av, i);
            default:
                Object obj2 = C1752av.f16662k;
                return c1752av.m10371p()[i];
        }
    }
}
