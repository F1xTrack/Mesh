package p000;

import java.util.ArrayList;

/* renamed from: FY */
/* loaded from: classes.dex */
public final class C0350FY extends AbstractC7631Gc1 {

    /* renamed from: a */
    public final /* synthetic */ Object f3297a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3298b;

    /* renamed from: c */
    public final /* synthetic */ Object f3299c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f3300d;

    /* renamed from: e */
    public final /* synthetic */ C0476HY f3301e;

    public C0350FY(C0476HY c0476hy, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f3301e = c0476hy;
        this.f3297a = obj;
        this.f3298b = arrayList;
        this.f3299c = obj2;
        this.f3300d = arrayList2;
    }

    @Override // p000.AbstractC7631Gc1, p000.InterfaceC7527Ec1
    /* renamed from: a */
    public final void mo2334a(AbstractC7579Fc1 abstractC7579Fc1) {
        C0476HY c0476hy = this.f3301e;
        Object obj = this.f3297a;
        if (obj != null) {
            c0476hy.m3498s(obj, this.f3298b, null);
        }
        Object obj2 = this.f3299c;
        if (obj2 != null) {
            c0476hy.m3498s(obj2, this.f3300d, null);
        }
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: c */
    public final void mo2336c(AbstractC7579Fc1 abstractC7579Fc1) {
        abstractC7579Fc1.mo2715z(this);
    }
}
