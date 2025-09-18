package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: xR */
/* loaded from: classes.dex */
public final class C7138xR implements InterfaceC6575oo {

    /* renamed from: b */
    public final C0732Ld f45637b;

    /* renamed from: c */
    public final InterfaceC7331Ai1 f45638c;

    public C7138xR(String str, InterfaceC7331Ai1 interfaceC7331Ai1) {
        this.f45637b = new C0732Ld(str);
        this.f45638c = interfaceC7331Ai1;
    }

    @Override // p000.InterfaceC6575oo
    /* renamed from: a */
    public final List mo23559a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC6766ro interfaceC6766ro = (InterfaceC6766ro) it.next();
            AbstractC9104dM1.m17545d("The camera info doesn't contain internal implementation.", interfaceC6766ro instanceof InterfaceC6766ro);
            InterfaceC6766ro interfaceC6766ro2 = interfaceC6766ro;
            String strMo2393e = interfaceC6766ro2.mo2393e();
            if (this.f45638c.mo298h(T02.m7517a(interfaceC6766ro2), strMo2393e)) {
                arrayList.add(interfaceC6766ro);
            }
        }
        return arrayList;
    }

    @Override // p000.InterfaceC6575oo
    public final C0732Ld getIdentifier() {
        return this.f45637b;
    }
}
