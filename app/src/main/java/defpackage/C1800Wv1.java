package defpackage;

import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: Wv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1800Wv1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C5423k11 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1800Wv1(C5423k11 c5423k11, int i) {
        super(1);
        this.e = i;
        this.f = c5423k11;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                TT0 tt0 = (TT0) obj;
                O90.f(tt0, "error");
                this.f.b(tt0);
                break;
            case 1:
                TT0 tt02 = (TT0) obj;
                O90.f(tt02, "error");
                this.f.b(tt02);
                break;
            case 2:
                TT0 tt03 = (TT0) obj;
                O90.f(tt03, "error");
                this.f.b(tt03);
                break;
            case 3:
                ReviewInfo reviewInfo = (ReviewInfo) obj;
                O90.f(reviewInfo, "reviewInfo");
                this.f.c(reviewInfo);
                break;
            default:
                TT0 tt04 = (TT0) obj;
                O90.f(tt04, "error");
                this.f.b(tt04);
                break;
        }
        return C1518Tf1.a;
    }
}
