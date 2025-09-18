package p000;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: Fj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7592Fj0 implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ C7696Hj0 f3402a;

    public C7592Fj0(C7696Hj0 c7696Hj0) {
        this.f3402a = c7696Hj0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C7696Hj0 c7696Hj0 = this.f3402a;
            if (c7696Hj0.f4480z.getInputMethodMode() == 2 || c7696Hj0.f4480z.getContentView() == null) {
                return;
            }
            Handler handler = c7696Hj0.f4476v;
            RunnableC7540Ej0 runnableC7540Ej0 = c7696Hj0.f4472r;
            handler.removeCallbacks(runnableC7540Ej0);
            runnableC7540Ej0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
