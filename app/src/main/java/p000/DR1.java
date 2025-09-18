package p000;

/* loaded from: classes.dex */
public final class DR1 extends AbstractC10756qG1 implements KI1 {

    /* renamed from: c */
    public final /* synthetic */ int f2017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DR1(int i, QG1 qg1) {
        super(qg1);
        this.f2017c = i;
    }

    @Override // p000.AbstractC10756qG1
    /* renamed from: h */
    public /* bridge */ /* synthetic */ QG1 mo1684h() {
        switch (this.f2017c) {
            case 0:
                return m1687l();
            default:
                return super.mo1684h();
        }
    }

    @Override // p000.AbstractC10756qG1
    /* renamed from: i */
    public /* bridge */ /* synthetic */ DD1 mo1685i() {
        switch (this.f2017c) {
            case 0:
                return m1687l();
            default:
                return super.mo1685i();
        }
    }

    @Override // p000.AbstractC10756qG1
    /* renamed from: k */
    public void mo1686k() {
        switch (this.f2017c) {
            case 0:
                super.mo1686k();
                QG1 qg1 = this.f40713b;
                if (((AbstractC11904zG1) qg1).zzb != SF1.f10657c) {
                    AbstractC11904zG1 abstractC11904zG1 = (AbstractC11904zG1) qg1;
                    abstractC11904zG1.zzb = abstractC11904zG1.zzb.clone();
                    break;
                }
                break;
            default:
                super.mo1686k();
                break;
        }
    }

    /* renamed from: l */
    public AbstractC11904zG1 m1687l() {
        if (!((AbstractC11904zG1) this.f40713b).m6626k()) {
            return (AbstractC11904zG1) this.f40713b;
        }
        ((AbstractC11904zG1) this.f40713b).zzb.m7203d();
        return (AbstractC11904zG1) super.mo1684h();
    }
}
