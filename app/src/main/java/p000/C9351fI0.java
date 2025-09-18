package p000;

import android.graphics.Bitmap;

/* renamed from: fI0 */
/* loaded from: classes.dex */
public final class C9351fI0 extends AbstractC1174Sf {

    /* renamed from: a */
    public final /* synthetic */ int f27132a;

    /* renamed from: b */
    public final /* synthetic */ C6479nH f27133b;

    public /* synthetic */ C9351fI0(C6479nH c6479nH, int i) {
        this.f27132a = i;
        this.f27133b = c6479nH;
    }

    @Override // p000.AbstractC1489Xf
    public final void onFailureImpl(InterfaceC1523YC interfaceC1523YC) {
        switch (this.f27132a) {
            case 0:
                C6479nH c6479nH = this.f27133b;
                c6479nH.f38229c = null;
                c6479nH.m23118e();
                break;
            case 1:
                C6479nH c6479nH2 = this.f27133b;
                c6479nH2.f38228b = null;
                c6479nH2.m23118e();
                break;
            default:
                C6479nH c6479nH3 = this.f27133b;
                c6479nH3.f38230d = null;
                c6479nH3.m23118e();
                break;
        }
    }

    @Override // p000.AbstractC1174Sf
    public final void onNewResultImpl(Bitmap bitmap) {
        switch (this.f27132a) {
            case 0:
                C6479nH c6479nH = this.f27133b;
                c6479nH.f38229c = bitmap;
                c6479nH.m23118e();
                break;
            case 1:
                C6479nH c6479nH2 = this.f27133b;
                c6479nH2.f38228b = bitmap;
                c6479nH2.m23118e();
                break;
            default:
                C6479nH c6479nH3 = this.f27133b;
                c6479nH3.f38230d = bitmap;
                c6479nH3.m23118e();
                break;
        }
    }
}
