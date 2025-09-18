package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: qo */
/* loaded from: classes.dex */
public final /* synthetic */ class C6703qo implements InterfaceC6575oo {

    /* renamed from: b */
    public final /* synthetic */ int f41166b;

    /* renamed from: c */
    public final /* synthetic */ Object f41167c;

    public /* synthetic */ C6703qo(int i, Object obj) {
        this.f41166b = i;
        this.f41167c = obj;
    }

    @Override // p000.InterfaceC6575oo
    /* renamed from: a */
    public final List mo23559a(List list) {
        String str;
        InterfaceC6766ro interfaceC6766ro;
        switch (this.f41166b) {
            case 0:
                C0301Em c0301Em = (C0301Em) this.f41167c;
                Iterator it = list.iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    str = c0301Em.f2885a;
                    if (!zHasNext) {
                        throw new IllegalStateException(AbstractC7222ym.m26234k("Unable to find camera with id ", str, " from list of available cameras."));
                    }
                    interfaceC6766ro = (InterfaceC6766ro) it.next();
                    AbstractC9104dM1.m17546e(interfaceC6766ro instanceof InterfaceC6766ro);
                } while (!interfaceC6766ro.mo2393e().equals(str));
                return Collections.singletonList(interfaceC6766ro);
            default:
                String str2 = (String) this.f41167c;
                O90.m5968f(str2, "$id");
                O90.m5968f(list, "cameraInfos");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    InterfaceC6766ro interfaceC6766ro2 = (InterfaceC6766ro) obj;
                    O90.m5965c(interfaceC6766ro2);
                    if (O90.m5963a(AbstractC9114dR1.m17667b(interfaceC6766ro2), str2)) {
                        arrayList.add(obj);
                    }
                }
                return AbstractC7167xu.m25984d0(arrayList);
        }
    }

    @Override // p000.InterfaceC6575oo
    public final C0732Ld getIdentifier() {
        switch (this.f41166b) {
        }
        return InterfaceC6575oo.f39271a;
    }
}
