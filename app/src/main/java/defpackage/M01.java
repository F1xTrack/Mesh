package defpackage;

import android.os.ConditionVariable;

/* loaded from: classes.dex */
public final class M01 extends Thread {
    public final /* synthetic */ ConditionVariable a;
    public final /* synthetic */ N01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M01(N01 n01, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.b = n01;
        this.a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.a.open();
            N01.a(this.b);
            this.b.b.getClass();
        }
    }
}
