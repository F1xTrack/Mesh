package defpackage;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class PX implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ PX(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.startPostponedEnterTransition();
                break;
            default:
                this.b.callStartTransitionListener(false);
                break;
        }
    }
}
