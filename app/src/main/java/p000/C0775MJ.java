package p000;

import java.util.Iterator;

/* renamed from: MJ */
/* loaded from: classes.dex */
public class C0775MJ extends C1465XH {

    /* renamed from: m */
    public int f7088m;

    public C0775MJ(AbstractC10822qn1 abstractC10822qn1) {
        super(abstractC10822qn1);
        if (abstractC10822qn1 instanceof M30) {
            this.f13655e = 2;
        } else {
            this.f13655e = 3;
        }
    }

    @Override // p000.C1465XH
    /* renamed from: d */
    public final void mo5302d(int i) {
        if (this.f13660j) {
            return;
        }
        this.f13660j = true;
        this.f13657g = i;
        Iterator it = this.f13661k.iterator();
        while (it.hasNext()) {
            InterfaceC1150SH interfaceC1150SH = (InterfaceC1150SH) it.next();
            interfaceC1150SH.mo3126a(interfaceC1150SH);
        }
    }
}
