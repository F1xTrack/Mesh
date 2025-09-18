package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Wh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8472Wh0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f13321e;

    /* renamed from: f */
    public final /* synthetic */ C8524Xh0 f13322f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8472Wh0(C8524Xh0 c8524Xh0, int i) {
        super(0);
        this.f13321e = i;
        this.f13322f = c8524Xh0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f13321e) {
            case 0:
                C8524Xh0 c8524Xh0 = this.f13322f;
                C7454Cs0 c7454Cs0 = c8524Xh0.f13922d;
                c7454Cs0.m1425x1();
                return Boolean.valueOf(AbstractC11148tK1.m24877b((C1442Wv) c7454Cs0.f1742l.getValue(), c8524Xh0.f13923e));
            case 1:
                C8524Xh0 c8524Xh02 = this.f13322f;
                C7454Cs0 c7454Cs02 = c8524Xh02.f13922d;
                c7454Cs02.m1425x1();
                return AbstractC11148tK1.m24878c((C1442Wv) c7454Cs02.f1742l.getValue(), c8524Xh02.f13923e);
            default:
                C8524Xh0 c8524Xh03 = this.f13322f;
                C8426Vk0 c8426Vk0 = c8524Xh03.f13925g;
                InterfaceC10293mf0[] interfaceC10293mf0Arr = C8524Xh0.f13921i;
                if (((Boolean) WS1.m8763b(c8426Vk0, interfaceC10293mf0Arr[1])).booleanValue()) {
                    return C9931jq0.f35419b;
                }
                List list = (List) WS1.m8763b(c8524Xh03.f13924f, interfaceC10293mf0Arr[0]);
                ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC11993zz0) it.next()).mo2748d0());
                }
                C7454Cs0 c7454Cs03 = c8524Xh03.f13922d;
                C0664KX c0664kx = c8524Xh03.f13923e;
                return AbstractC11928zS1.m26441b("package view scope for " + c0664kx + " in " + c7454Cs03.getName(), AbstractC7167xu.m25969O(arrayList, new J51(c7454Cs03, c0664kx)));
        }
    }
}
