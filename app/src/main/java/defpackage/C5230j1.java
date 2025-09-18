package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5230j1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ C2005Zm f;
    public final /* synthetic */ InterfaceC1009Ms g;
    public final /* synthetic */ Z01 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5230j1(ArrayList arrayList, C2005Zm c2005Zm, InterfaceC1009Ms interfaceC1009Ms, Z01 z01) {
        super(1);
        this.e = arrayList;
        this.f = c2005Zm;
        this.g = interfaceC1009Ms;
        this.h = z01;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        C0889Ld1 c0889Ld1 = (C0889Ld1) obj;
        O90.f(c0889Ld1, "$this$runForkingPoint");
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            C4263i1 c4263i1 = new C4263i1(this.f, this.g, (Z01) it.next(), this.h, 0);
            if (!c0889Ld1.a) {
                c0889Ld1.a = ((Boolean) c4263i1.invoke()).booleanValue();
            }
        }
        return C1518Tf1.a;
    }
}
