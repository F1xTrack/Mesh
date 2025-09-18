package p000;

import java.util.List;

/* renamed from: K4 */
/* loaded from: classes.dex */
public final class C0635K4 extends AbstractC1259U0 {

    /* renamed from: c */
    public final /* synthetic */ int f5895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0635K4(List list, int i) {
        super(2, list);
        this.f5895c = i;
    }

    @Override // p000.InterfaceC1074R4
    /* renamed from: M0 */
    public final AbstractC6378lg mo4553M0() {
        switch (this.f5895c) {
            case 0:
                return new C0435Gu((List) this.f11615b, 0);
            case 1:
                return new R10((List) this.f11615b, 0);
            case 2:
                return new C0435Gu((List) this.f11615b, 1);
            case 3:
                return new R10((List) this.f11615b, 1);
            case 4:
                return new R10((List) this.f11615b, 2);
            case 5:
                return new UZ0((List) this.f11615b);
            default:
                return new C0435Gu((List) this.f11615b, 2);
        }
    }
}
