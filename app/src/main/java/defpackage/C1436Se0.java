package defpackage;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: Se0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1436Se0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C1514Te0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1436Se0(C1514Te0 c1514Te0, int i) {
        super(0);
        this.e = i;
        this.f = c1514Te0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        C3909g90 c3909g90;
        switch (this.e) {
            case 0:
                return AbstractC0433Fh1.d(this.f.k());
            default:
                C1514Te0 c1514Te0 = this.f;
                InterfaceC2464cA0 interfaceC2464cA0K = c1514Te0.k();
                boolean z = interfaceC2464cA0K instanceof C6887rh0;
                AbstractC1589Ud0 abstractC1589Ud0 = c1514Te0.a;
                if (z && O90.a(AbstractC0433Fh1.g(abstractC1589Ud0.p()), interfaceC2464cA0K) && abstractC1589Ud0.p().l() == 2) {
                    CD cdI = abstractC1589Ud0.p().i();
                    O90.d(cdI, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsK = AbstractC0433Fh1.k((InterfaceC7492us) cdI);
                    if (clsK != null) {
                        return clsK;
                    }
                    throw new C1420Rz("Cannot determine receiver Java type of inherited declaration: " + interfaceC2464cA0K, 1);
                }
                InterfaceC0755Jl interfaceC0755JlM = abstractC1589Ud0.m();
                boolean z2 = interfaceC0755JlM instanceof C1056Nh1;
                int i = c1514Te0.b;
                if (!z2) {
                    if (!(interfaceC0755JlM instanceof C0978Mh1)) {
                        return (Type) interfaceC0755JlM.a().get(i);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((C0978Mh1) interfaceC0755JlM).d.get(i)).toArray(new Class[0]);
                    return C1514Te0.b(c1514Te0, (Type[]) Arrays.copyOf(clsArr, clsArr.length));
                }
                C3909g90[] c3909g90Arr = ((C1056Nh1) interfaceC0755JlM).e;
                if (i >= 0 && i < c3909g90Arr.length) {
                    c3909g90 = c3909g90Arr[i];
                } else if (c3909g90Arr.length == 0) {
                    c3909g90 = new C3909g90(i, i, 1);
                } else {
                    int length = ((C3909g90) J8.x(c3909g90Arr)).b + 1 + (i - c3909g90Arr.length);
                    c3909g90 = new C3909g90(length, length, 1);
                }
                Type[] typeArr = (Type[]) AbstractC8069xu.U(((C1056Nh1) interfaceC0755JlM).b.a(), c3909g90).toArray(new Type[0]);
                return C1514Te0.b(c1514Te0, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
        }
    }
}
