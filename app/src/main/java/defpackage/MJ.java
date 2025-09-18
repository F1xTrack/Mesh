package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public class MJ extends XH {
    public int m;

    public MJ(AbstractC6716qn1 abstractC6716qn1) {
        super(abstractC6716qn1);
        if (abstractC6716qn1 instanceof M30) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.XH
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            SH sh = (SH) it.next();
            sh.a(sh);
        }
    }
}
