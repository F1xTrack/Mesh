package p000;

import androidx.fragment.app.Fragment;

/* renamed from: PX */
/* loaded from: classes.dex */
public final class RunnableC0978PX implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f9106a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f9107b;

    public /* synthetic */ RunnableC0978PX(Fragment fragment, int i) {
        this.f9106a = i;
        this.f9107b = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9106a) {
            case 0:
                this.f9107b.startPostponedEnterTransition();
                break;
            default:
                this.f9107b.callStartTransitionListener(false);
                break;
        }
    }
}
