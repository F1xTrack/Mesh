package defpackage;

import android.view.ViewGroup;

/* renamed from: v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7539v6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ H6 b;

    public /* synthetic */ RunnableC7539v6(H6 h6, int i) {
        this.a = i;
        this.b = h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                H6 h6 = this.b;
                if ((h6.Z & 1) != 0) {
                    h6.v(0);
                }
                if ((h6.Z & 4096) != 0) {
                    h6.v(108);
                }
                h6.Y = false;
                h6.Z = 0;
                break;
            default:
                H6 h62 = this.b;
                h62.w.showAtLocation(h62.v, 55, 0, 0);
                C6519pl1 c6519pl1 = h62.y;
                if (c6519pl1 != null) {
                    c6519pl1.b();
                }
                if (!(h62.z && (viewGroup = h62.A) != null && viewGroup.isLaidOut())) {
                    h62.v.setAlpha(1.0f);
                    h62.v.setVisibility(0);
                    break;
                } else {
                    h62.v.setAlpha(0.0f);
                    C6519pl1 c6519pl1A = AbstractC6897rk1.a(h62.v);
                    c6519pl1A.a(1.0f);
                    h62.y = c6519pl1A;
                    c6519pl1A.d(new C7729w6(0, this));
                    break;
                }
                break;
        }
    }
}
