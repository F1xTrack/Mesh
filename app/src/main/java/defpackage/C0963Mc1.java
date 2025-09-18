package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Mc1 */
/* loaded from: classes.dex */
public class C0963Mc1 extends AbstractC0418Fc1 {
    public int D;
    public ArrayList B = new ArrayList();
    public boolean C = true;
    public boolean E = false;
    public int F = 0;

    @Override // defpackage.AbstractC0418Fc1
    public final void A(View view) {
        for (int i = 0; i < this.B.size(); i++) {
            ((AbstractC0418Fc1) this.B.get(i)).A(view);
        }
        this.f.remove(view);
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void B(View view) {
        super.B(view);
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0418Fc1) this.B.get(i)).B(view);
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void C() {
        if (this.B.isEmpty()) {
            J();
            o();
            return;
        }
        C0886Lc1 c0886Lc1 = new C0886Lc1();
        c0886Lc1.b = this;
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((AbstractC0418Fc1) it.next()).a(c0886Lc1);
        }
        this.D = this.B.size();
        if (this.C) {
            Iterator it2 = this.B.iterator();
            while (it2.hasNext()) {
                ((AbstractC0418Fc1) it2.next()).C();
            }
            return;
        }
        for (int i = 1; i < this.B.size(); i++) {
            ((AbstractC0418Fc1) this.B.get(i - 1)).a(new C0886Lc1((AbstractC0418Fc1) this.B.get(i)));
        }
        AbstractC0418Fc1 abstractC0418Fc1 = (AbstractC0418Fc1) this.B.get(0);
        if (abstractC0418Fc1 != null) {
            abstractC0418Fc1.C();
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void D(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.B) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0418Fc1) this.B.get(i)).D(j);
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void E(UY1 uy1) {
        this.v = uy1;
        this.F |= 8;
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0418Fc1) this.B.get(i)).E(uy1);
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void F(TimeInterpolator timeInterpolator) {
        this.F |= 1;
        ArrayList arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0418Fc1) this.B.get(i)).F(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void G(S20 s20) {
        super.G(s20);
        this.F |= 4;
        if (this.B != null) {
            for (int i = 0; i < this.B.size(); i++) {
                ((AbstractC0418Fc1) this.B.get(i)).G(s20);
            }
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void H() {
        this.F |= 2;
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0418Fc1) this.B.get(i)).H();
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void I(long j) {
        this.b = j;
    }

    @Override // defpackage.AbstractC0418Fc1
    public final String K(String str) {
        String strK = super.K(str);
        for (int i = 0; i < this.B.size(); i++) {
            StringBuilder sbK = NX.k(strK, "\n");
            sbK.append(((AbstractC0418Fc1) this.B.get(i)).K(str + "  "));
            strK = sbK.toString();
        }
        return strK;
    }

    public final void L(AbstractC0418Fc1 abstractC0418Fc1) {
        this.B.add(abstractC0418Fc1);
        abstractC0418Fc1.i = this;
        long j = this.c;
        if (j >= 0) {
            abstractC0418Fc1.D(j);
        }
        if ((this.F & 1) != 0) {
            abstractC0418Fc1.F(this.d);
        }
        if ((this.F & 2) != 0) {
            abstractC0418Fc1.H();
        }
        if ((this.F & 4) != 0) {
            abstractC0418Fc1.G(this.w);
        }
        if ((this.F & 8) != 0) {
            abstractC0418Fc1.E(this.v);
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void b(View view) {
        for (int i = 0; i < this.B.size(); i++) {
            ((AbstractC0418Fc1) this.B.get(i)).b(view);
        }
        this.f.add(view);
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void e() {
        super.e();
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0418Fc1) this.B.get(i)).e();
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void f(C1197Pc1 c1197Pc1) {
        if (v(c1197Pc1.b)) {
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                AbstractC0418Fc1 abstractC0418Fc1 = (AbstractC0418Fc1) it.next();
                if (abstractC0418Fc1.v(c1197Pc1.b)) {
                    abstractC0418Fc1.f(c1197Pc1);
                    c1197Pc1.c.add(abstractC0418Fc1);
                }
            }
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void h(C1197Pc1 c1197Pc1) {
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0418Fc1) this.B.get(i)).h(c1197Pc1);
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void i(C1197Pc1 c1197Pc1) {
        if (v(c1197Pc1.b)) {
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                AbstractC0418Fc1 abstractC0418Fc1 = (AbstractC0418Fc1) it.next();
                if (abstractC0418Fc1.v(c1197Pc1.b)) {
                    abstractC0418Fc1.i(c1197Pc1);
                    c1197Pc1.c.add(abstractC0418Fc1);
                }
            }
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    /* renamed from: l */
    public final AbstractC0418Fc1 clone() {
        C0963Mc1 c0963Mc1 = (C0963Mc1) super.clone();
        c0963Mc1.B = new ArrayList();
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            AbstractC0418Fc1 abstractC0418Fc1Clone = ((AbstractC0418Fc1) this.B.get(i)).clone();
            c0963Mc1.B.add(abstractC0418Fc1Clone);
            abstractC0418Fc1Clone.i = c0963Mc1;
        }
        return c0963Mc1;
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void n(ViewGroup viewGroup, C1155Oo1 c1155Oo1, C1155Oo1 c1155Oo12, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            AbstractC0418Fc1 abstractC0418Fc1 = (AbstractC0418Fc1) this.B.get(i);
            if (j > 0 && (this.C || i == 0)) {
                long j2 = abstractC0418Fc1.b;
                if (j2 > 0) {
                    abstractC0418Fc1.I(j2 + j);
                } else {
                    abstractC0418Fc1.I(j);
                }
            }
            abstractC0418Fc1.n(viewGroup, c1155Oo1, c1155Oo12, arrayList, arrayList2);
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void y(ViewGroup viewGroup) {
        super.y(viewGroup);
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0418Fc1) this.B.get(i)).y(viewGroup);
        }
    }

    @Override // defpackage.AbstractC0418Fc1
    public final AbstractC0418Fc1 z(InterfaceC0340Ec1 interfaceC0340Ec1) {
        super.z(interfaceC0340Ec1);
        return this;
    }
}
