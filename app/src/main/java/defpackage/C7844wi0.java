package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: wi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7844wi0 implements InterfaceC6335oo {
    public final int b;

    public C7844wi0(int i) {
        this.b = i;
    }

    @Override // defpackage.InterfaceC6335oo
    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC6907ro interfaceC6907ro = (InterfaceC6907ro) it.next();
            AbstractC3377dM1.d("The camera info doesn't contain internal implementation.", interfaceC6907ro instanceof InterfaceC6907ro);
            if (interfaceC6907ro.j() == this.b) {
                arrayList.add(interfaceC6907ro);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC6335oo
    public final C0887Ld getIdentifier() {
        return InterfaceC6335oo.a;
    }
}
