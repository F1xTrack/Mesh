package io.sentry.android.ndk;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ c(d dVar, String str, String str2, int i) {
        this.a = i;
        this.b = dVar;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((NativeScope) this.b.b).getClass();
                NativeScope.nativeSetExtra(this.c, this.d);
                break;
            default:
                ((NativeScope) this.b.b).getClass();
                NativeScope.nativeSetTag(this.c, this.d);
                break;
        }
    }
}
