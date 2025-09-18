package defpackage;

import java.util.ArrayList;

/* renamed from: mj1 */
/* loaded from: classes.dex */
public final class C5940mj1 extends AbstractC1676Vg0 implements InterfaceC7053sZ {
    public final /* synthetic */ C5217ix0 e;
    public final /* synthetic */ C7467uj1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5940mj1(C5217ix0 c5217ix0, C7467uj1 c7467uj1) {
        super(8);
        this.e = c5217ix0;
        this.f = c7467uj1;
    }

    public final Object a(Long l, Long l2, Integer num, Integer num2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        long jLongValue = l.longValue();
        long jLongValue2 = l2.longValue();
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        O90.f(arrayList, "audioTracks");
        O90.f(arrayList2, "textTracks");
        O90.f(arrayList3, "videoTracks");
        this.e.d(SP.d, new C4399ij1(jLongValue, jLongValue2, this.f, iIntValue, iIntValue2, str, arrayList3, arrayList, arrayList2));
        return C1518Tf1.a;
    }
}
