package p000;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Mc1 */
/* loaded from: classes.dex */
public class C7943Mc1 extends AbstractC7579Fc1 {

    /* renamed from: D */
    public int f7271D;

    /* renamed from: B */
    public ArrayList f7269B = new ArrayList();

    /* renamed from: C */
    public boolean f7270C = true;

    /* renamed from: E */
    public boolean f7272E = false;

    /* renamed from: F */
    public int f7273F = 0;

    @Override // p000.AbstractC7579Fc1
    /* renamed from: A */
    public final void mo2683A(View view) {
        for (int i = 0; i < this.f7269B.size(); i++) {
            ((AbstractC7579Fc1) this.f7269B.get(i)).mo2683A(view);
        }
        this.f3341f.remove(view);
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: B */
    public final void mo2684B(View view) {
        super.mo2684B(view);
        int size = this.f7269B.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7579Fc1) this.f7269B.get(i)).mo2684B(view);
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: C */
    public final void mo2685C() {
        if (this.f7269B.isEmpty()) {
            m2692J();
            m2706o();
            return;
        }
        C7891Lc1 c7891Lc1 = new C7891Lc1();
        c7891Lc1.f6771b = this;
        Iterator it = this.f7269B.iterator();
        while (it.hasNext()) {
            ((AbstractC7579Fc1) it.next()).m2694a(c7891Lc1);
        }
        this.f7271D = this.f7269B.size();
        if (this.f7270C) {
            Iterator it2 = this.f7269B.iterator();
            while (it2.hasNext()) {
                ((AbstractC7579Fc1) it2.next()).mo2685C();
            }
            return;
        }
        for (int i = 1; i < this.f7269B.size(); i++) {
            ((AbstractC7579Fc1) this.f7269B.get(i - 1)).m2694a(new C7891Lc1((AbstractC7579Fc1) this.f7269B.get(i)));
        }
        AbstractC7579Fc1 abstractC7579Fc1 = (AbstractC7579Fc1) this.f7269B.get(0);
        if (abstractC7579Fc1 != null) {
            abstractC7579Fc1.mo2685C();
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: D */
    public final void mo2686D(long j) {
        ArrayList arrayList;
        this.f3338c = j;
        if (j < 0 || (arrayList = this.f7269B) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7579Fc1) this.f7269B.get(i)).mo2686D(j);
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: E */
    public final void mo2687E(UY1 uy1) {
        this.f3357v = uy1;
        this.f7273F |= 8;
        int size = this.f7269B.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7579Fc1) this.f7269B.get(i)).mo2687E(uy1);
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: F */
    public final void mo2688F(TimeInterpolator timeInterpolator) {
        this.f7273F |= 1;
        ArrayList arrayList = this.f7269B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC7579Fc1) this.f7269B.get(i)).mo2688F(timeInterpolator);
            }
        }
        this.f3339d = timeInterpolator;
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: G */
    public final void mo2689G(S20 s20) {
        super.mo2689G(s20);
        this.f7273F |= 4;
        if (this.f7269B != null) {
            for (int i = 0; i < this.f7269B.size(); i++) {
                ((AbstractC7579Fc1) this.f7269B.get(i)).mo2689G(s20);
            }
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: H */
    public final void mo2690H() {
        this.f7273F |= 2;
        int size = this.f7269B.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7579Fc1) this.f7269B.get(i)).mo2690H();
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: I */
    public final void mo2691I(long j) {
        this.f3337b = j;
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: K */
    public final String mo2693K(String str) {
        String strMo2693K = super.mo2693K(str);
        for (int i = 0; i < this.f7269B.size(); i++) {
            StringBuilder sbM5762k = AbstractC0852NX.m5762k(strMo2693K, "\n");
            sbM5762k.append(((AbstractC7579Fc1) this.f7269B.get(i)).mo2693K(str + "  "));
            strMo2693K = sbM5762k.toString();
        }
        return strMo2693K;
    }

    /* renamed from: L */
    public final void m5410L(AbstractC7579Fc1 abstractC7579Fc1) {
        this.f7269B.add(abstractC7579Fc1);
        abstractC7579Fc1.f3344i = this;
        long j = this.f3338c;
        if (j >= 0) {
            abstractC7579Fc1.mo2686D(j);
        }
        if ((this.f7273F & 1) != 0) {
            abstractC7579Fc1.mo2688F(this.f3339d);
        }
        if ((this.f7273F & 2) != 0) {
            abstractC7579Fc1.mo2690H();
        }
        if ((this.f7273F & 4) != 0) {
            abstractC7579Fc1.mo2689G(this.f3358w);
        }
        if ((this.f7273F & 8) != 0) {
            abstractC7579Fc1.mo2687E(this.f3357v);
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: b */
    public final void mo2695b(View view) {
        for (int i = 0; i < this.f7269B.size(); i++) {
            ((AbstractC7579Fc1) this.f7269B.get(i)).mo2695b(view);
        }
        this.f3341f.add(view);
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: e */
    public final void mo2696e() {
        super.mo2696e();
        int size = this.f7269B.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7579Fc1) this.f7269B.get(i)).mo2696e();
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: f */
    public final void mo2697f(C8099Pc1 c8099Pc1) {
        if (m2712v(c8099Pc1.f9198b)) {
            Iterator it = this.f7269B.iterator();
            while (it.hasNext()) {
                AbstractC7579Fc1 abstractC7579Fc1 = (AbstractC7579Fc1) it.next();
                if (abstractC7579Fc1.m2712v(c8099Pc1.f9198b)) {
                    abstractC7579Fc1.mo2697f(c8099Pc1);
                    c8099Pc1.f9199c.add(abstractC7579Fc1);
                }
            }
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: h */
    public final void mo2699h(C8099Pc1 c8099Pc1) {
        int size = this.f7269B.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7579Fc1) this.f7269B.get(i)).mo2699h(c8099Pc1);
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: i */
    public final void mo2700i(C8099Pc1 c8099Pc1) {
        if (m2712v(c8099Pc1.f9198b)) {
            Iterator it = this.f7269B.iterator();
            while (it.hasNext()) {
                AbstractC7579Fc1 abstractC7579Fc1 = (AbstractC7579Fc1) it.next();
                if (abstractC7579Fc1.m2712v(c8099Pc1.f9198b)) {
                    abstractC7579Fc1.mo2700i(c8099Pc1);
                    c8099Pc1.f9199c.add(abstractC7579Fc1);
                }
            }
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: l */
    public final AbstractC7579Fc1 clone() {
        C7943Mc1 c7943Mc1 = (C7943Mc1) super.clone();
        c7943Mc1.f7269B = new ArrayList();
        int size = this.f7269B.size();
        for (int i = 0; i < size; i++) {
            AbstractC7579Fc1 abstractC7579Fc1Clone = ((AbstractC7579Fc1) this.f7269B.get(i)).clone();
            c7943Mc1.f7269B.add(abstractC7579Fc1Clone);
            abstractC7579Fc1Clone.f3344i = c7943Mc1;
        }
        return c7943Mc1;
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: n */
    public final void mo2705n(ViewGroup viewGroup, C8071Oo1 c8071Oo1, C8071Oo1 c8071Oo12, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f3337b;
        int size = this.f7269B.size();
        for (int i = 0; i < size; i++) {
            AbstractC7579Fc1 abstractC7579Fc1 = (AbstractC7579Fc1) this.f7269B.get(i);
            if (j > 0 && (this.f7270C || i == 0)) {
                long j2 = abstractC7579Fc1.f3337b;
                if (j2 > 0) {
                    abstractC7579Fc1.mo2691I(j2 + j);
                } else {
                    abstractC7579Fc1.mo2691I(j);
                }
            }
            abstractC7579Fc1.mo2705n(viewGroup, c8071Oo1, c8071Oo12, arrayList, arrayList2);
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: y */
    public final void mo2714y(ViewGroup viewGroup) {
        super.mo2714y(viewGroup);
        int size = this.f7269B.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7579Fc1) this.f7269B.get(i)).mo2714y(viewGroup);
        }
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: z */
    public final AbstractC7579Fc1 mo2715z(InterfaceC7527Ec1 interfaceC7527Ec1) {
        super.mo2715z(interfaceC7527Ec1);
        return this;
    }
}
