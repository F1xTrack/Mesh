package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j1 */
/* loaded from: classes2.dex */
public final class C6211j1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ ArrayList f34841e;

    /* renamed from: f */
    public final /* synthetic */ C1622Zm f34842f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC0810Ms f34843g;

    /* renamed from: h */
    public final /* synthetic */ Z01 f34844h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6211j1(ArrayList arrayList, C1622Zm c1622Zm, InterfaceC0810Ms interfaceC0810Ms, Z01 z01) {
        super(1);
        this.f34841e = arrayList;
        this.f34842f = c1622Zm;
        this.f34843g = interfaceC0810Ms;
        this.f34844h = z01;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        C7893Ld1 c7893Ld1 = (C7893Ld1) obj;
        O90.m5968f(c7893Ld1, "$this$runForkingPoint");
        Iterator it = this.f34841e.iterator();
        while (it.hasNext()) {
            C4216i1 c4216i1 = new C4216i1(this.f34842f, this.f34843g, (Z01) it.next(), this.f34844h, 0);
            if (!c7893Ld1.f6774a) {
                c7893Ld1.f6774a = ((Boolean) c4216i1.invoke()).booleanValue();
            }
        }
        return C8313Tf1.f11463a;
    }
}
