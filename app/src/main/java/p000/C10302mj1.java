package p000;

import java.util.ArrayList;

/* renamed from: mj1 */
/* loaded from: classes.dex */
public final class C10302mj1 extends AbstractC8418Vg0 implements InterfaceC6831sZ {

    /* renamed from: e */
    public final /* synthetic */ C9817ix0 f37857e;

    /* renamed from: f */
    public final /* synthetic */ C11326uj1 f37858f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10302mj1(C9817ix0 c9817ix0, C11326uj1 c11326uj1) {
        super(8);
        this.f37857e = c9817ix0;
        this.f37858f = c11326uj1;
    }

    /* renamed from: a */
    public final Object m22936a(Long l, Long l2, Integer num, Integer num2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        long jLongValue = l.longValue();
        long jLongValue2 = l2.longValue();
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        O90.m5968f(arrayList, "audioTracks");
        O90.m5968f(arrayList2, "textTracks");
        O90.m5968f(arrayList3, "videoTracks");
        this.f37857e.m21947d(EnumC1158SP.f10720d, new C9790ij1(jLongValue, jLongValue2, this.f37858f, iIntValue, iIntValue2, str, arrayList3, arrayList, arrayList2));
        return C8313Tf1.f11463a;
    }
}
