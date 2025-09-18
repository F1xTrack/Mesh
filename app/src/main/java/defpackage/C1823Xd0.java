package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* renamed from: Xd0 */
/* loaded from: classes2.dex */
public final class C1823Xd0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C3430de0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1823Xd0(C3430de0 c3430de0, int i) {
        super(0);
        this.e = i;
        this.f = c3430de0;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        C8063xs c8063xsY;
        C3430de0 c3430de0 = this.f;
        switch (this.e) {
            case 0:
                Collection collectionN = c3430de0.n();
                ArrayList arrayList = new ArrayList(AbstractC8449zu.k(collectionN));
                Iterator it = collectionN.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C7260te0(c3430de0, (InterfaceC6174ny) it.next()));
                }
                return arrayList;
            case 1:
                return c3430de0.q(c3430de0.k().m().d0(), EnumC6115ne0.a);
            case 2:
                InterfaceC5578kq0 interfaceC5578kq0W = c3430de0.k().W();
                O90.e(interfaceC5578kq0W, "getStaticScope(...)");
                return c3430de0.q(interfaceC5578kq0W, EnumC6115ne0.a);
            case 3:
                int i = C3430de0.d;
                C0074As c0074AsZ = c3430de0.z();
                C1979Zd0 c1979Zd0 = (C1979Zd0) c3430de0.c.getValue();
                c1979Zd0.getClass();
                InterfaceC5927mf0 interfaceC5927mf0 = AbstractC5924me0.b[0];
                Object objInvoke = c1979Zd0.a.invoke();
                O90.e(objInvoke, "getValue(...)");
                C5894mU0 c5894mU0 = (C5894mU0) objInvoke;
                C7955xI c7955xI = c5894mU0.a;
                boolean z = c0074AsZ.c;
                Class cls = c3430de0.b;
                InterfaceC7492us interfaceC7492usB = (z && cls.isAnnotationPresent(Metadata.class)) ? c7955xI.b(c0074AsZ) : AbstractC3312d12.b(c7955xI.b, c0074AsZ);
                if (interfaceC7492usB != null) {
                    return interfaceC7492usB;
                }
                if (cls.isSynthetic()) {
                    c8063xsY = C3430de0.y(c0074AsZ, c5894mU0);
                } else {
                    C7977xP0 c7977xP0A = AbstractC7407uP1.a(cls);
                    EnumC0039Ag0 enumC0039Ag0 = c7977xP0A != null ? (EnumC0039Ag0) c7977xP0A.b.d : null;
                    switch (enumC0039Ag0 == null ? -1 : AbstractC2173ae0.a[enumC0039Ag0.ordinal()]) {
                        case -1:
                        case 6:
                            throw new C1420Rz("Unresolved class: " + cls + " (kind = " + enumC0039Ag0 + ')', 1);
                        case 0:
                        default:
                            throw new C7074sg();
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            c8063xsY = C3430de0.y(c0074AsZ, c5894mU0);
                            break;
                        case 5:
                            throw new C1420Rz("Unknown class: " + cls + " (kind = " + enumC0039Ag0 + ')', 1);
                    }
                }
                return c8063xsY;
            case 4:
                return c3430de0.q(c3430de0.k().m().d0(), EnumC6115ne0.b);
            case 5:
                InterfaceC5578kq0 interfaceC5578kq0W2 = c3430de0.k().W();
                O90.e(interfaceC5578kq0W2, "getStaticScope(...)");
                return c3430de0.q(interfaceC5578kq0W2, EnumC6115ne0.b);
            case 6:
                if (c3430de0.b.isAnonymousClass()) {
                    return null;
                }
                C0074As c0074AsZ2 = c3430de0.z();
                if (c0074AsZ2.c) {
                    return null;
                }
                return c0074AsZ2.b().b();
            default:
                return new C1979Zd0(c3430de0);
        }
    }
}
