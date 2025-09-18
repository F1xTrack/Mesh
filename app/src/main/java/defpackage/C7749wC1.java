package defpackage;

/* renamed from: wC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7749wC1 extends AbstractC1951Yu {
    public final /* synthetic */ int f;
    public final /* synthetic */ C2223av g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7749wC1(C2223av c2223av, int i) {
        super(c2223av, (byte) 0);
        this.f = i;
        this.g = c2223av;
    }

    @Override // defpackage.AbstractC1951Yu
    public final Object b(int i) {
        C2223av c2223av = this.g;
        switch (this.f) {
            case 0:
                Object obj = C2223av.k;
                return c2223av.o()[i];
            case 1:
                return new C3922gD1(c2223av, i);
            default:
                Object obj2 = C2223av.k;
                return c2223av.p()[i];
        }
    }
}
