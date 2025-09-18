package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: Ch0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0198Ch0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C0276Dh0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0198Ch0(C0276Dh0 c0276Dh0, int i) {
        super(0);
        this.e = i;
        this.f = c0276Dh0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                Collection collectionB = this.f.o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionB) {
                    if (((C5879mP0) obj).a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iB = AbstractC7287tn0.b(AbstractC8449zu.k(arrayList));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((C5879mP0) next).c(), next);
                }
                return linkedHashMap;
            case 1:
                Class<?>[] declaredClasses = this.f.o.a.getDeclaredClasses();
                O90.e(declaredClasses, "getDeclaredClasses(...)");
                return AbstractC8069xu.g0(AbstractC4175hY0.n(AbstractC4175hY0.m(new C7991xU(J8.d(declaredClasses), false, C3808fd0.F), C3808fd0.G)));
            default:
                C0276Dh0 c0276Dh0 = this.f;
                return AbstractC7627vZ0.c(c0276Dh0.b(), c0276Dh0.f());
        }
    }
}
