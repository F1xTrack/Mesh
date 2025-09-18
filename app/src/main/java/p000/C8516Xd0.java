package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* renamed from: Xd0 */
/* loaded from: classes2.dex */
public final class C8516Xd0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f13883e;

    /* renamed from: f */
    public final /* synthetic */ C9139de0 f13884f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8516Xd0(C9139de0 c9139de0, int i) {
        super(0);
        this.f13883e = i;
        this.f13884f = c9139de0;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        C7165xs c7165xsM17720y;
        C9139de0 c9139de0 = this.f13884f;
        switch (this.f13883e) {
            case 0:
                Collection collectionMo3831n = c9139de0.mo3831n();
                ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(collectionMo3831n));
                Iterator it = collectionMo3831n.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C11187te0(c9139de0, (InterfaceC6522ny) it.next()));
                }
                return arrayList;
            case 1:
                return c9139de0.m23830q(c9139de0.mo17722k().mo1492m().mo3799d0(), EnumC10419ne0.f38428a);
            case 2:
                InterfaceC10059kq0 interfaceC10059kq0Mo1433W = c9139de0.mo17722k().mo1433W();
                O90.m5967e(interfaceC10059kq0Mo1433W, "getStaticScope(...)");
                return c9139de0.m23830q(interfaceC10059kq0Mo1433W, EnumC10419ne0.f38428a);
            case 3:
                int i = C9139de0.f26177d;
                C0055As c0055AsM17723z = c9139de0.m17723z();
                C8620Zd0 c8620Zd0 = (C8620Zd0) c9139de0.f26179c.getValue();
                c8620Zd0.getClass();
                InterfaceC10293mf0 interfaceC10293mf0 = AbstractC10291me0.f37814b[0];
                Object objInvoke = c8620Zd0.f37815a.invoke();
                O90.m5967e(objInvoke, "getValue(...)");
                C10271mU0 c10271mU0 = (C10271mU0) objInvoke;
                C7129xI c7129xI = c10271mU0.f37726a;
                boolean z = c0055AsM17723z.f453c;
                Class cls = c9139de0.f26178b;
                InterfaceC6976us interfaceC6976usM25826b = (z && cls.isAnnotationPresent(Metadata.class)) ? c7129xI.m25826b(c0055AsM17723z) : AbstractC9060d12.m17465b(c7129xI.f45519b, c0055AsM17723z);
                if (interfaceC6976usM25826b != null) {
                    return interfaceC6976usM25826b;
                }
                if (cls.isSynthetic()) {
                    c7165xsM17720y = C9139de0.m17720y(c0055AsM17723z, c10271mU0);
                } else {
                    C11667xP0 c11667xP0M25185a = AbstractC11286uP1.m25185a(cls);
                    EnumC7326Ag0 enumC7326Ag0 = c11667xP0M25185a != null ? (EnumC7326Ag0) c11667xP0M25185a.f45573b.f35299d : null;
                    switch (enumC7326Ag0 == null ? -1 : AbstractC8750ae0.f15603a[enumC7326Ag0.ordinal()]) {
                        case -1:
                        case 6:
                            throw new C1131Rz("Unresolved class: " + cls + " (kind = " + enumC7326Ag0 + ')', 1);
                        case 0:
                        default:
                            throw new C6838sg();
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            c7165xsM17720y = C9139de0.m17720y(c0055AsM17723z, c10271mU0);
                            break;
                        case 5:
                            throw new C1131Rz("Unknown class: " + cls + " (kind = " + enumC7326Ag0 + ')', 1);
                    }
                }
                return c7165xsM17720y;
            case 4:
                return c9139de0.m23830q(c9139de0.mo17722k().mo1492m().mo3799d0(), EnumC10419ne0.f38429b);
            case 5:
                InterfaceC10059kq0 interfaceC10059kq0Mo1433W2 = c9139de0.mo17722k().mo1433W();
                O90.m5967e(interfaceC10059kq0Mo1433W2, "getStaticScope(...)");
                return c9139de0.m23830q(interfaceC10059kq0Mo1433W2, EnumC10419ne0.f38429b);
            case 6:
                if (c9139de0.f26178b.isAnonymousClass()) {
                    return null;
                }
                C0055As c0055AsM17723z2 = c9139de0.m17723z();
                if (c0055AsM17723z2.f453c) {
                    return null;
                }
                return c0055AsM17723z2.m359b().m4654b();
            default:
                return new C8620Zd0(c9139de0);
        }
    }
}
