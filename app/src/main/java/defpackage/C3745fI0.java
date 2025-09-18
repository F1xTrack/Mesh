package defpackage;

import android.graphics.Bitmap;

/* renamed from: fI0 */
/* loaded from: classes.dex */
public final class C3745fI0 extends AbstractC1438Sf {
    public final /* synthetic */ int a;
    public final /* synthetic */ C6045nH b;

    public /* synthetic */ C3745fI0(C6045nH c6045nH, int i) {
        this.a = i;
        this.b = c6045nH;
    }

    @Override // defpackage.AbstractC1828Xf
    public final void onFailureImpl(YC yc) {
        switch (this.a) {
            case 0:
                C6045nH c6045nH = this.b;
                c6045nH.c = null;
                c6045nH.e();
                break;
            case 1:
                C6045nH c6045nH2 = this.b;
                c6045nH2.b = null;
                c6045nH2.e();
                break;
            default:
                C6045nH c6045nH3 = this.b;
                c6045nH3.d = null;
                c6045nH3.e();
                break;
        }
    }

    @Override // defpackage.AbstractC1438Sf
    public final void onNewResultImpl(Bitmap bitmap) {
        switch (this.a) {
            case 0:
                C6045nH c6045nH = this.b;
                c6045nH.c = bitmap;
                c6045nH.e();
                break;
            case 1:
                C6045nH c6045nH2 = this.b;
                c6045nH2.b = bitmap;
                c6045nH2.e();
                break;
            default:
                C6045nH c6045nH3 = this.b;
                c6045nH3.d = bitmap;
                c6045nH3.e();
                break;
        }
    }
}
