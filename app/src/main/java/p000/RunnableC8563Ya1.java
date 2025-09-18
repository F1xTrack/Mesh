package p000;

import androidx.appcompat.widget.Toolbar;

/* renamed from: Ya1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8563Ya1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f14349a;

    /* renamed from: b */
    public final /* synthetic */ Toolbar f14350b;

    public /* synthetic */ RunnableC8563Ya1(Toolbar toolbar, int i) {
        this.f14349a = i;
        this.f14350b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14349a) {
            case 0:
                C8745ab1 c8745ab1 = this.f14350b.f15881M;
                C7866Kq0 c7866Kq0 = c8745ab1 == null ? null : c8745ab1.f15580b;
                if (c7866Kq0 != null) {
                    c7866Kq0.collapseActionView();
                    break;
                }
                break;
            default:
                this.f14350b.m9862n();
                break;
        }
    }
}
