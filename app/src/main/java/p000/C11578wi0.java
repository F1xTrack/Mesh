package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: wi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11578wi0 implements InterfaceC6575oo {

    /* renamed from: b */
    public final int f45038b;

    public C11578wi0(int i) {
        this.f45038b = i;
    }

    @Override // p000.InterfaceC6575oo
    /* renamed from: a */
    public final List mo23559a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC6766ro interfaceC6766ro = (InterfaceC6766ro) it.next();
            AbstractC9104dM1.m17545d("The camera info doesn't contain internal implementation.", interfaceC6766ro instanceof InterfaceC6766ro);
            if (interfaceC6766ro.mo2398j() == this.f45038b) {
                arrayList.add(interfaceC6766ro);
            }
        }
        return arrayList;
    }

    @Override // p000.InterfaceC6575oo
    public final C0732Ld getIdentifier() {
        return InterfaceC6575oo.f39271a;
    }
}
