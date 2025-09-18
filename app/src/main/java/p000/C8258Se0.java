package p000;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: Se0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8258Se0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f10887e;

    /* renamed from: f */
    public final /* synthetic */ C8310Te0 f10888f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8258Se0(C8310Te0 c8310Te0, int i) {
        super(0);
        this.f10887e = i;
        this.f10888f = c8310Te0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        C9461g90 c9461g90;
        switch (this.f10887e) {
            case 0:
                return AbstractC7589Fh1.m2752d(this.f10888f.m7710k());
            default:
                C8310Te0 c8310Te0 = this.f10888f;
                InterfaceC8946cA0 interfaceC8946cA0M7710k = c8310Te0.m7710k();
                boolean z = interfaceC8946cA0M7710k instanceof C10937rh0;
                AbstractC8360Ud0 abstractC8360Ud0 = c8310Te0.f11454a;
                if (z && O90.m5963a(AbstractC7589Fh1.m2755g(abstractC8360Ud0.mo8094p()), interfaceC8946cA0M7710k) && abstractC8360Ud0.mo8094p().mo116l() == 2) {
                    InterfaceC0140CD interfaceC0140CDMo423i = abstractC8360Ud0.mo8094p().mo423i();
                    O90.m5966d(interfaceC0140CDMo423i, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsM2759k = AbstractC7589Fh1.m2759k((InterfaceC6976us) interfaceC0140CDMo423i);
                    if (clsM2759k != null) {
                        return clsM2759k;
                    }
                    throw new C1131Rz("Cannot determine receiver Java type of inherited declaration: " + interfaceC8946cA0M7710k, 1);
                }
                InterfaceC0615Jl interfaceC0615JlMo8091m = abstractC8360Ud0.mo8091m();
                boolean z2 = interfaceC0615JlMo8091m instanceof C8005Nh1;
                int i = c8310Te0.f11455b;
                if (!z2) {
                    if (!(interfaceC0615JlMo8091m instanceof C7953Mh1)) {
                        return (Type) interfaceC0615JlMo8091m.mo3319a().get(i);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((C7953Mh1) interfaceC0615JlMo8091m).f7305d.get(i)).toArray(new Class[0]);
                    return C8310Te0.m7709b(c8310Te0, (Type[]) Arrays.copyOf(clsArr, clsArr.length));
                }
                C9461g90[] c9461g90Arr = ((C8005Nh1) interfaceC0615JlMo8091m).f7964e;
                if (i >= 0 && i < c9461g90Arr.length) {
                    c9461g90 = c9461g90Arr[i];
                } else if (c9461g90Arr.length == 0) {
                    c9461g90 = new C9461g90(i, i, 1);
                } else {
                    int length = ((C9461g90) AbstractC0576J8.m4197x(c9461g90Arr)).f26570b + 1 + (i - c9461g90Arr.length);
                    c9461g90 = new C9461g90(length, length, 1);
                }
                Type[] typeArr = (Type[]) AbstractC7167xu.m25975U(((C8005Nh1) interfaceC0615JlMo8091m).f7961b.mo3319a(), c9461g90).toArray(new Type[0]);
                return C8310Te0.m7709b(c8310Te0, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
        }
    }
}
