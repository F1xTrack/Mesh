package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: Im */
/* loaded from: classes.dex */
public final /* synthetic */ class C0553Im implements InterfaceC6894tZ {

    /* renamed from: a */
    public final /* synthetic */ int f5140a;

    public /* synthetic */ C0553Im(int i) {
        this.f5140a = i;
    }

    @Override // p000.InterfaceC6894tZ
    public final Object apply(Object obj) {
        ArrayList arrayList = null;
        switch (this.f5140a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return null;
            case 2:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 3:
                int i = C1433Wm.f13394g;
                return Boolean.FALSE;
            case 4:
                int i2 = C1559Ym.f14507h;
                return Boolean.FALSE;
            case 5:
                C10991s60 c10991s60 = C11247u60.f43513z;
                return null;
            case 6:
                return CD0.f1253b;
            case 7:
                return null;
            case 8:
                try {
                    return C9150dj1.m17731a(C9017cj1.m10852w1((C1362Ve) obj), null);
                } catch (U90 unused) {
                    AbstractC7806Jm0.m4412f("VideoEncoderInfoImpl");
                    return null;
                }
            default:
                List list = (List) obj;
                if (list != null) {
                    List<C8331To1> list2 = list;
                    arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
                    for (C8331To1 c8331To1 : list2) {
                        ArrayList arrayList2 = c8331To1.f11534g;
                        arrayList.add(new C7603Fo1(UUID.fromString(c8331To1.f11528a), c8331To1.f11529b, c8331To1.f11530c, c8331To1.f11533f, !arrayList2.isEmpty() ? (C7249zC) arrayList2.get(0) : C7249zC.f46721b, c8331To1.f11531d, c8331To1.f11532e));
                    }
                }
                return arrayList;
        }
    }
}
