package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yh0 */
/* loaded from: classes2.dex */
public final class C11830yh0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f46418e;

    /* renamed from: f */
    public final /* synthetic */ C11957zh0 f46419f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11830yh0(C11957zh0 c11957zh0, int i) {
        super(0);
        this.f46418e = i;
        this.f46419f = c11957zh0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f46418e) {
            case 0:
                return AbstractC11306uZ1.m25209b(this.f46419f);
            case 1:
                C11957zh0 c11957zh0 = this.f46419f;
                ArrayList typeParameters = c11957zh0.f46932h.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(typeParameters));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    C11285uP0 c11285uP0 = (C11285uP0) it.next();
                    InterfaceC10292me1 interfaceC10292me1Mo10472l = ((InterfaceC10548oe1) c11957zh0.f46934j.f38229c).mo10472l(c11285uP0);
                    if (interfaceC10292me1Mo10472l == null) {
                        throw new AssertionError("Parameter " + c11285uP0 + " surely belongs to class " + c11957zh0.f46932h + ", so it must be resolved");
                    }
                    arrayList.add(interfaceC10292me1Mo10472l);
                }
                return arrayList;
            default:
                C11957zh0 c11957zh02 = this.f46419f;
                if (AbstractC6940uI.m25153f(c11957zh02) == null) {
                    return null;
                }
                ((OJ1) ((C9773ib0) c11957zh02.f46931g.f38228b).f29360w).getClass();
                return null;
        }
    }
}
