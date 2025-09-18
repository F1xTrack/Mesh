package androidx.fragment.app;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ Fragment a;

    public /* synthetic */ h(Fragment fragment) {
        this.a = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment = this.a;
        t tVar = fragment.mViewLifecycleOwner;
        tVar.f.b(fragment.mSavedViewRegistryState);
        fragment.mSavedViewRegistryState = null;
    }
}
