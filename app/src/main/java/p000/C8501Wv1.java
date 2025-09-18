package p000;

import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: Wv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8501Wv1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f13455e;

    /* renamed from: f */
    public final /* synthetic */ C9955k11 f13456f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8501Wv1(C9955k11 c9955k11, int i) {
        super(1);
        this.f13455e = i;
        this.f13456f = c9955k11;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f13455e) {
            case 0:
                TT0 tt0 = (TT0) obj;
                O90.m5968f(tt0, "error");
                this.f13456f.m22133b(tt0);
                break;
            case 1:
                TT0 tt02 = (TT0) obj;
                O90.m5968f(tt02, "error");
                this.f13456f.m22133b(tt02);
                break;
            case 2:
                TT0 tt03 = (TT0) obj;
                O90.m5968f(tt03, "error");
                this.f13456f.m22133b(tt03);
                break;
            case 3:
                ReviewInfo reviewInfo = (ReviewInfo) obj;
                O90.m5968f(reviewInfo, "reviewInfo");
                this.f13456f.m22134c(reviewInfo);
                break;
            default:
                TT0 tt04 = (TT0) obj;
                O90.m5968f(tt04, "error");
                this.f13456f.m22133b(tt04);
                break;
        }
        return C8313Tf1.f11463a;
    }
}
