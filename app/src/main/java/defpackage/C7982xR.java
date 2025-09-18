package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: xR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7982xR implements InterfaceC6335oo {
    public final C0887Ld b;
    public final InterfaceC0046Ai1 c;

    public C7982xR(String str, InterfaceC0046Ai1 interfaceC0046Ai1) {
        this.b = new C0887Ld(str);
        this.c = interfaceC0046Ai1;
    }

    @Override // defpackage.InterfaceC6335oo
    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC6907ro interfaceC6907ro = (InterfaceC6907ro) it.next();
            AbstractC3377dM1.d("The camera info doesn't contain internal implementation.", interfaceC6907ro instanceof InterfaceC6907ro);
            InterfaceC6907ro interfaceC6907ro2 = interfaceC6907ro;
            String strE = interfaceC6907ro2.e();
            if (this.c.h(T02.a(interfaceC6907ro2), strE)) {
                arrayList.add(interfaceC6907ro);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC6335oo
    public final C0887Ld getIdentifier() {
        return this.b;
    }
}
