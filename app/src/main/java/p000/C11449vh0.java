package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* renamed from: vh0 */
/* loaded from: classes2.dex */
public final class C11449vh0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f44490e;

    /* renamed from: f */
    public final /* synthetic */ C11576wh0 f44491f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11449vh0(C11576wh0 c11576wh0, int i) {
        super(0);
        this.f44490e = i;
        this.f44491f = c11576wh0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f44490e) {
            case 0:
                C11576wh0 c11576wh0 = this.f44491f;
                ArrayList arrayListM8753b = c11576wh0.f45030b.m8753b();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListM8753b.iterator();
                while (it.hasNext()) {
                    InterfaceC8146Qa0 interfaceC8146Qa0 = (InterfaceC8146Qa0) it.next();
                    C8340Tt0 c8340Tt0 = ((XO0) interfaceC8146Qa0).f13687a;
                    if (c8340Tt0 == null) {
                        c8340Tt0 = AbstractC8046Oc0.f8520b;
                    }
                    AbstractC0249Dx abstractC0249DxM25671a = c11576wh0.m25671a(interfaceC8146Qa0);
                    Pair pair = abstractC0249DxM25671a != null ? new Pair(c8340Tt0, abstractC0249DxM25671a) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return AbstractC11077sn0.m24786n(arrayList);
            case 1:
                return VO0.m8433a(P22.m6213b(P22.m6212a(this.f44491f.f45030b.f13158a))).m359b();
            default:
                C11576wh0 c11576wh02 = this.f44491f;
                C0664KX c0664kxMo4960f = c11576wh02.mo4960f();
                WO0 wo0 = c11576wh02.f45030b;
                if (c0664kxMo4960f == null) {
                    return C6298kP.m22197c(EnumC6235jP.f35116E, wo0.toString());
                }
                C6479nH c6479nH = c11576wh02.f45029a;
                InterfaceC6976us interfaceC6976usM1933u = C7512Dv0.m1933u(c0664kxMo4960f, ((C7454Cs0) ((C9773ib0) c6479nH.f38228b).f29352o).f1735e);
                if (interfaceC6976usM1933u == null) {
                    C9493gP0 c9493gP0 = new C9493gP0(P22.m6213b(P22.m6212a(wo0.f13158a)));
                    C9773ib0 c9773ib0 = (C9773ib0) c6479nH.f38228b;
                    C10339n11 c10339n11 = (C10339n11) c9773ib0.f29348k;
                    c10339n11.getClass();
                    C7621Fx1 c7621Fx1 = (C7621Fx1) c10339n11.f38046b;
                    if (c7621Fx1 == null) {
                        O90.m5977o("resolver");
                        throw null;
                    }
                    interfaceC6976usM1933u = c7621Fx1.m2860x(c9493gP0);
                    if (interfaceC6976usM1933u == null) {
                        interfaceC6976usM1933u = AbstractC9060d12.m17467d((C7454Cs0) c9773ib0.f29352o, C0055As.m358j(c0664kxMo4960f), ((C0712LI) c9773ib0.f29341d).m4944c().f45529l);
                    }
                }
                return interfaceC6976usM1933u.mo1492m();
        }
    }
}
