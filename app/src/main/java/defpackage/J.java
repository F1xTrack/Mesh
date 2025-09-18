package defpackage;

/* loaded from: classes.dex */
public final class J extends AbstractC1828Xf {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ L c;

    public J(L l, String str, boolean z) {
        this.c = l;
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.AbstractC1828Xf
    public final void onFailureImpl(YC yc) {
        I i = (I) yc;
        this.c.k(this.a, i, i.c(), true);
    }

    @Override // defpackage.AbstractC1828Xf
    public final void onNewResultImpl(YC yc) {
        I i = (I) yc;
        boolean zG = i.g();
        float fD = i.d();
        Object result = i.getResult();
        if (result != null) {
            this.c.l(this.a, i, result, fD, zG, this.b, false);
        } else if (zG) {
            this.c.k(this.a, i, new NullPointerException(), true);
        }
    }

    @Override // defpackage.AbstractC1828Xf, defpackage.InterfaceC4302iD
    public final void onProgressUpdate(YC yc) {
        I i = (I) yc;
        boolean zG = i.g();
        float fD = i.d();
        String str = this.a;
        L l = this.c;
        if (!l.g(str, i)) {
            l.h("ignore_old_datasource @ onProgress", null);
            i.close();
        } else {
            if (zG) {
                return;
            }
            F00 f00 = l.f;
            C6269oS c6269oS = f00.e;
            if (c6269oS.c(3) == null) {
                return;
            }
            c6269oS.r++;
            f00.j(fD);
            c6269oS.a();
        }
    }
}
