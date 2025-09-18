package defpackage;

/* loaded from: classes.dex */
public final class DR1 extends AbstractC6617qG1 implements KI1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DR1(int i, QG1 qg1) {
        super(qg1);
        this.c = i;
    }

    @Override // defpackage.AbstractC6617qG1
    public /* bridge */ /* synthetic */ QG1 h() {
        switch (this.c) {
            case 0:
                return l();
            default:
                return super.h();
        }
    }

    @Override // defpackage.AbstractC6617qG1
    public /* bridge */ /* synthetic */ DD1 i() {
        switch (this.c) {
            case 0:
                return l();
            default:
                return super.i();
        }
    }

    @Override // defpackage.AbstractC6617qG1
    public void k() {
        switch (this.c) {
            case 0:
                super.k();
                QG1 qg1 = this.b;
                if (((AbstractC8331zG1) qg1).zzb != SF1.c) {
                    AbstractC8331zG1 abstractC8331zG1 = (AbstractC8331zG1) qg1;
                    abstractC8331zG1.zzb = abstractC8331zG1.zzb.clone();
                    break;
                }
                break;
            default:
                super.k();
                break;
        }
    }

    public AbstractC8331zG1 l() {
        if (!((AbstractC8331zG1) this.b).k()) {
            return (AbstractC8331zG1) this.b;
        }
        ((AbstractC8331zG1) this.b).zzb.d();
        return (AbstractC8331zG1) super.h();
    }
}
