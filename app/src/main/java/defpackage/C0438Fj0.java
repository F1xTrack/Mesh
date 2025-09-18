package defpackage;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: Fj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438Fj0 implements AbsListView.OnScrollListener {
    public final /* synthetic */ C0594Hj0 a;

    public C0438Fj0(C0594Hj0 c0594Hj0) {
        this.a = c0594Hj0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C0594Hj0 c0594Hj0 = this.a;
            if (c0594Hj0.z.getInputMethodMode() == 2 || c0594Hj0.z.getContentView() == null) {
                return;
            }
            Handler handler = c0594Hj0.v;
            RunnableC0360Ej0 runnableC0360Ej0 = c0594Hj0.r;
            handler.removeCallbacks(runnableC0360Ej0);
            runnableC0360Ej0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
