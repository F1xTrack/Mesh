package p000;

import androidx.activity.C1690a;
import java.util.ListIterator;

/* renamed from: Ex0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7568Ex0 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f2981e;

    /* renamed from: f */
    public final /* synthetic */ C1690a f2982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7568Ex0(C1690a c1690a, int i) {
        super(1);
        this.f2981e = i;
        this.f2982f = c1690a;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f2981e) {
            case 0:
                O90.m5968f((C6900tf) obj, "backEvent");
                C1690a c1690a = this.f2982f;
                C6470n8 c6470n8 = c1690a.f15743b;
                ListIterator listIterator = c6470n8.listIterator(c6470n8.mo5922b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C0767MB) objPrevious).f7026a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                C0767MB c0767mb = (C0767MB) objPrevious;
                if (c1690a.f15744c != null) {
                    c1690a.m9820b();
                }
                c1690a.f15744c = c0767mb;
                break;
            default:
                O90.m5968f((C6900tf) obj, "backEvent");
                C1690a c1690a2 = this.f2982f;
                if (c1690a2.f15744c == null) {
                    C6470n8 c6470n82 = c1690a2.f15743b;
                    ListIterator listIterator2 = c6470n82.listIterator(c6470n82.mo5922b());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((C0767MB) objPrevious2).f7026a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                }
                break;
        }
        return C8313Tf1.f11463a;
    }
}
