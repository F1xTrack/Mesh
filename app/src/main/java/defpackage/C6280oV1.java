package defpackage;

/* renamed from: oV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6280oV1 extends VA1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ C2528cV1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6280oV1(C2528cV1 c2528cV1, C3386dP1 c3386dP1, int i) {
        super(c3386dP1);
        this.e = i;
        this.f = c2528cV1;
    }

    @Override // defpackage.VA1
    public final void c() {
        switch (this.e) {
            case 0:
                C2528cV1 c2528cV1 = this.f;
                c2528cV1.v1();
                if (c2528cV1.I1()) {
                    c2528cV1.n().o.d("Inactivity, disconnecting from the service");
                    c2528cV1.H1();
                    break;
                }
                break;
            default:
                this.f.n().j.d("Tasks have been queued for a long time");
                break;
        }
    }
}
