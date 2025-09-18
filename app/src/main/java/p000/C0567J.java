package p000;

/* renamed from: J */
/* loaded from: classes.dex */
public final class C0567J extends AbstractC1489Xf {

    /* renamed from: a */
    public final /* synthetic */ String f5249a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5250b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0693L f5251c;

    public C0567J(AbstractC0693L abstractC0693L, String str, boolean z) {
        this.f5251c = abstractC0693L;
        this.f5249a = str;
        this.f5250b = z;
    }

    @Override // p000.AbstractC1489Xf
    public final void onFailureImpl(InterfaceC1523YC interfaceC1523YC) {
        AbstractC0504I abstractC0504I = (AbstractC0504I) interfaceC1523YC;
        this.f5251c.m4813k(this.f5249a, abstractC0504I, abstractC0504I.m3664c(), true);
    }

    @Override // p000.AbstractC1489Xf
    public final void onNewResultImpl(InterfaceC1523YC interfaceC1523YC) {
        AbstractC0504I abstractC0504I = (AbstractC0504I) interfaceC1523YC;
        boolean zM3668g = abstractC0504I.m3668g();
        float fM3665d = abstractC0504I.m3665d();
        Object result = abstractC0504I.getResult();
        if (result != null) {
            this.f5251c.m4814l(this.f5249a, abstractC0504I, result, fM3665d, zM3668g, this.f5250b, false);
        } else if (zM3668g) {
            this.f5251c.m4813k(this.f5249a, abstractC0504I, new NullPointerException(), true);
        }
    }

    @Override // p000.AbstractC1489Xf, p000.InterfaceC4228iD
    public final void onProgressUpdate(InterfaceC1523YC interfaceC1523YC) {
        AbstractC0504I abstractC0504I = (AbstractC0504I) interfaceC1523YC;
        boolean zM3668g = abstractC0504I.m3668g();
        float fM3665d = abstractC0504I.m3665d();
        String str = this.f5249a;
        AbstractC0693L abstractC0693L = this.f5251c;
        if (!abstractC0693L.m4809g(str, abstractC0504I)) {
            abstractC0693L.m4810h("ignore_old_datasource @ onProgress", null);
            abstractC0504I.close();
        } else {
            if (zM3668g) {
                return;
            }
            F00 f00 = abstractC0693L.f6433f;
            C6553oS c6553oS = f00.f3009e;
            if (c6553oS.m23407c(3) == null) {
                return;
            }
            c6553oS.f39017r++;
            f00.m2481j(fM3665d);
            c6553oS.m23405a();
        }
    }
}
