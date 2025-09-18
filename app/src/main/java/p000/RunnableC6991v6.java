package p000;

import android.view.ViewGroup;

/* renamed from: v6 */
/* loaded from: classes.dex */
public final class RunnableC6991v6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44145a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0448H6 f44146b;

    public /* synthetic */ RunnableC6991v6(LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6, int i) {
        this.f44145a = i;
        this.f44146b = layoutInflaterFactory2C0448H6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f44145a) {
            case 0:
                LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = this.f44146b;
                if ((layoutInflaterFactory2C0448H6.f4084Z & 1) != 0) {
                    layoutInflaterFactory2C0448H6.m3293v(0);
                }
                if ((layoutInflaterFactory2C0448H6.f4084Z & 4096) != 0) {
                    layoutInflaterFactory2C0448H6.m3293v(108);
                }
                layoutInflaterFactory2C0448H6.f4083Y = false;
                layoutInflaterFactory2C0448H6.f4084Z = 0;
                break;
            default:
                LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H62 = this.f44146b;
                layoutInflaterFactory2C0448H62.f4105w.showAtLocation(layoutInflaterFactory2C0448H62.f4104v, 55, 0, 0);
                C10690pl1 c10690pl1 = layoutInflaterFactory2C0448H62.f4107y;
                if (c10690pl1 != null) {
                    c10690pl1.m23871b();
                }
                if (!(layoutInflaterFactory2C0448H62.f4108z && (viewGroup = layoutInflaterFactory2C0448H62.f4059A) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0448H62.f4104v.setAlpha(1.0f);
                    layoutInflaterFactory2C0448H62.f4104v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0448H62.f4104v.setAlpha(0.0f);
                    C10690pl1 c10690pl1M24469a = AbstractC10944rk1.m24469a(layoutInflaterFactory2C0448H62.f4104v);
                    c10690pl1M24469a.m23870a(1.0f);
                    layoutInflaterFactory2C0448H62.f4107y = c10690pl1M24469a;
                    c10690pl1M24469a.m23873d(new C7054w6(0, this));
                    break;
                }
                break;
        }
    }
}
