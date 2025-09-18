package p000;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: e2 */
/* loaded from: classes.dex */
public final class RunnableC3965e2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26502a;

    /* renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f26503b;

    public /* synthetic */ RunnableC3965e2(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f26502a = i;
        this.f26503b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26502a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f26503b;
                actionBarOverlayLayout.m9839h();
                actionBarOverlayLayout.f15837w = actionBarOverlayLayout.f15818d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f15838x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f26503b;
                actionBarOverlayLayout2.m9839h();
                actionBarOverlayLayout2.f15837w = actionBarOverlayLayout2.f15818d.animate().translationY(-actionBarOverlayLayout2.f15818d.getHeight()).setListener(actionBarOverlayLayout2.f15838x);
                break;
        }
    }
}
