package io.sentry.android.ndk;

/* renamed from: io.sentry.android.ndk.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5920c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33870a;

    /* renamed from: b */
    public final /* synthetic */ C5921d f33871b;

    /* renamed from: c */
    public final /* synthetic */ String f33872c;

    /* renamed from: d */
    public final /* synthetic */ String f33873d;

    public /* synthetic */ RunnableC5920c(C5921d c5921d, String str, String str2, int i) {
        this.f33870a = i;
        this.f33871b = c5921d;
        this.f33872c = str;
        this.f33873d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33870a) {
            case 0:
                ((NativeScope) this.f33871b.f33875b).getClass();
                NativeScope.nativeSetExtra(this.f33872c, this.f33873d);
                break;
            default:
                ((NativeScope) this.f33871b.f33875b).getClass();
                NativeScope.nativeSetTag(this.f33872c, this.f33873d);
                break;
        }
    }
}
