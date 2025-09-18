package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: qo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6717qo implements InterfaceC6335oo {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C6717qo(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.InterfaceC6335oo
    public final List a(List list) {
        String str;
        InterfaceC6907ro interfaceC6907ro;
        switch (this.b) {
            case 0:
                C0368Em c0368Em = (C0368Em) this.c;
                Iterator it = list.iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    str = c0368Em.a;
                    if (!zHasNext) {
                        throw new IllegalStateException(AbstractC8235ym.k("Unable to find camera with id ", str, " from list of available cameras."));
                    }
                    interfaceC6907ro = (InterfaceC6907ro) it.next();
                    AbstractC3377dM1.e(interfaceC6907ro instanceof InterfaceC6907ro);
                } while (!interfaceC6907ro.e().equals(str));
                return Collections.singletonList(interfaceC6907ro);
            default:
                String str2 = (String) this.c;
                O90.f(str2, "$id");
                O90.f(list, "cameraInfos");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    InterfaceC6907ro interfaceC6907ro2 = (InterfaceC6907ro) obj;
                    O90.c(interfaceC6907ro2);
                    if (O90.a(AbstractC3392dR1.b(interfaceC6907ro2), str2)) {
                        arrayList.add(obj);
                    }
                }
                return AbstractC8069xu.d0(arrayList);
        }
    }

    @Override // defpackage.InterfaceC6335oo
    public final C0887Ld getIdentifier() {
        switch (this.b) {
        }
        return InterfaceC6335oo.a;
    }
}
