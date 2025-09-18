package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class FY extends AbstractC0496Gc1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ HY e;

    public FY(HY hy, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = hy;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.AbstractC0496Gc1, defpackage.InterfaceC0340Ec1
    public final void a(AbstractC0418Fc1 abstractC0418Fc1) {
        HY hy = this.e;
        Object obj = this.a;
        if (obj != null) {
            hy.s(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            hy.s(obj2, this.d, null);
        }
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void c(AbstractC0418Fc1 abstractC0418Fc1) {
        abstractC0418Fc1.z(this);
    }
}
