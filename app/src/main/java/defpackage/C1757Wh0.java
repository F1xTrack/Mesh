package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Wh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1757Wh0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C1835Xh0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1757Wh0(C1835Xh0 c1835Xh0, int i) {
        super(0);
        this.e = i;
        this.f = c1835Xh0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                C1835Xh0 c1835Xh0 = this.f;
                C0231Cs0 c0231Cs0 = c1835Xh0.d;
                c0231Cs0.x1();
                return Boolean.valueOf(AbstractC7201tK1.b((C1798Wv) c0231Cs0.l.getValue(), c1835Xh0.e));
            case 1:
                C1835Xh0 c1835Xh02 = this.f;
                C0231Cs0 c0231Cs02 = c1835Xh02.d;
                c0231Cs02.x1();
                return AbstractC7201tK1.c((C1798Wv) c0231Cs02.l.getValue(), c1835Xh02.e);
            default:
                C1835Xh0 c1835Xh03 = this.f;
                C1688Vk0 c1688Vk0 = c1835Xh03.g;
                InterfaceC5927mf0[] interfaceC5927mf0Arr = C1835Xh0.i;
                if (((Boolean) WS1.b(c1688Vk0, interfaceC5927mf0Arr[1])).booleanValue()) {
                    return C5387jq0.b;
                }
                List list = (List) WS1.b(c1835Xh03.f, interfaceC5927mf0Arr[0]);
                ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC8465zz0) it.next()).d0());
                }
                C0231Cs0 c0231Cs03 = c1835Xh03.d;
                KX kx = c1835Xh03.e;
                return AbstractC8367zS1.b("package view scope for " + kx + " in " + c0231Cs03.getName(), AbstractC8069xu.O(arrayList, new J51(c0231Cs03, kx)));
        }
    }
}
