package p000;

/* renamed from: oV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10530oV1 extends VA1 {

    /* renamed from: e */
    public final /* synthetic */ int f39044e;

    /* renamed from: f */
    public final /* synthetic */ C8989cV1 f39045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10530oV1(C8989cV1 c8989cV1, C9110dP1 c9110dP1, int i) {
        super(c9110dP1);
        this.f39044e = i;
        this.f39045f = c8989cV1;
    }

    @Override // p000.VA1
    /* renamed from: c */
    public final void mo185c() {
        switch (this.f39044e) {
            case 0:
                C8989cV1 c8989cV1 = this.f39045f;
                c8989cV1.mo7681v1();
                if (c8989cV1.m10747I1()) {
                    c8989cV1.mo6070n().f8386o.m24555d("Inactivity, disconnecting from the service");
                    c8989cV1.m10746H1();
                    break;
                }
                break;
            default:
                this.f39045f.mo6070n().f8381j.m24555d("Tasks have been queued for a long time");
                break;
        }
    }
}
