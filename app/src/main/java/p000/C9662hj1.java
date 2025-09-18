package p000;

import java.util.ArrayList;

/* renamed from: hj1 */
/* loaded from: classes.dex */
public final class C9662hj1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f28550e;

    /* renamed from: f */
    public final /* synthetic */ C9817ix0 f28551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9662hj1(C9817ix0 c9817ix0, int i) {
        super(1);
        this.f28550e = i;
        this.f28551f = c9817ix0;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f28550e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.f28551f.m21947d(EnumC1158SP.f10732p, new C9534gj1(zBooleanValue, 0));
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                this.f28551f.m21947d(EnumC1158SP.f10724h, new C9534gj1(zBooleanValue2, 1));
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                O90.m5968f(arrayList, "metadataArrayList");
                if (arrayList.size() != 0) {
                    this.f28551f.m21947d(EnumC1158SP.f10735s, new C6429mU(arrayList, 1));
                }
                break;
            case 3:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                this.f28551f.m21947d(EnumC1158SP.f10737u, new C9534gj1(zBooleanValue3, 2));
                break;
            case 4:
                float fFloatValue = ((Number) obj).floatValue();
                this.f28551f.m21947d(EnumC1158SP.f10738v, new C9918jj1(fFloatValue, 0));
                break;
            case 5:
                float fFloatValue2 = ((Number) obj).floatValue();
                this.f28551f.m21947d(EnumC1158SP.f10739w, new C9918jj1(fFloatValue2, 1));
                break;
            case 6:
                String str = (String) obj;
                O90.m5968f(str, "textTrackData");
                this.f28551f.m21947d(EnumC1158SP.f10742z, new C11387vC0(str, 22));
                break;
            default:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                this.f28551f.m21947d(EnumC1158SP.f10716B, new C9534gj1(zBooleanValue4, 3));
                break;
        }
        return C8313Tf1.f11463a;
    }
}
