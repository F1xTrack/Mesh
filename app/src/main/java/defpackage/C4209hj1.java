package defpackage;

import java.util.ArrayList;

/* renamed from: hj1 */
/* loaded from: classes.dex */
public final class C4209hj1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C5217ix0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4209hj1(C5217ix0 c5217ix0, int i) {
        super(1);
        this.e = i;
        this.f = c5217ix0;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.f.d(SP.p, new C4018gj1(zBooleanValue, 0));
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                this.f.d(SP.h, new C4018gj1(zBooleanValue2, 1));
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                O90.f(arrayList, "metadataArrayList");
                if (arrayList.size() != 0) {
                    this.f.d(SP.s, new C5893mU(arrayList, 1));
                }
                break;
            case 3:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                this.f.d(SP.u, new C4018gj1(zBooleanValue3, 2));
                break;
            case 4:
                float fFloatValue = ((Number) obj).floatValue();
                this.f.d(SP.v, new C5367jj1(fFloatValue, 0));
                break;
            case 5:
                float fFloatValue2 = ((Number) obj).floatValue();
                this.f.d(SP.w, new C5367jj1(fFloatValue2, 1));
                break;
            case 6:
                String str = (String) obj;
                O90.f(str, "textTrackData");
                this.f.d(SP.z, new C7558vC0(str, 22));
                break;
            default:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                this.f.d(SP.B, new C4018gj1(zBooleanValue4, 3));
                break;
        }
        return C1518Tf1.a;
    }
}
