package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: Im, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0680Im implements InterfaceC7244tZ {
    public final /* synthetic */ int a;

    public /* synthetic */ C0680Im(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC7244tZ
    public final Object apply(Object obj) {
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return null;
            case 2:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 3:
                int i = C1771Wm.g;
                return Boolean.FALSE;
            case 4:
                int i2 = C1927Ym.h;
                return Boolean.FALSE;
            case 5:
                C6967s60 c6967s60 = C7349u60.z;
                return null;
            case 6:
                return CD0.b;
            case 7:
                return null;
            case 8:
                try {
                    return C3446dj1.a(C2570cj1.w1((C1669Ve) obj), null);
                } catch (U90 unused) {
                    AbstractC0759Jm0.f("VideoEncoderInfoImpl");
                    return null;
                }
            default:
                List list = (List) obj;
                if (list != null) {
                    List<C1545To1> list2 = list;
                    arrayList = new ArrayList(AbstractC8449zu.k(list2));
                    for (C1545To1 c1545To1 : list2) {
                        ArrayList arrayList2 = c1545To1.g;
                        arrayList.add(new C0454Fo1(UUID.fromString(c1545To1.a), c1545To1.b, c1545To1.c, c1545To1.f, !arrayList2.isEmpty() ? (C8317zC) arrayList2.get(0) : C8317zC.b, c1545To1.d, c1545To1.e));
                    }
                }
                return arrayList;
        }
    }
}
