package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3503e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ RunnableC3503e2(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.a = i;
        this.b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.x);
                break;
        }
    }
}
