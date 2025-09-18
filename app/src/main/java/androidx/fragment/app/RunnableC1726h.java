package androidx.fragment.app;

/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1726h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Fragment f16188a;

    public /* synthetic */ RunnableC1726h(Fragment fragment) {
        this.f16188a = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment = this.f16188a;
        C1738t c1738t = fragment.mViewLifecycleOwner;
        c1738t.f16274f.m22831b(fragment.mSavedViewRegistryState);
        fragment.mSavedViewRegistryState = null;
    }
}
