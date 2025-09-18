package p000;

import android.os.ConditionVariable;

/* loaded from: classes.dex */
public final class M01 extends Thread {

    /* renamed from: a */
    public final /* synthetic */ ConditionVariable f6966a;

    /* renamed from: b */
    public final /* synthetic */ N01 f6967b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M01(N01 n01, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f6967b = n01;
        this.f6966a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f6967b) {
            this.f6966a.open();
            N01.m5492a(this.f6967b);
            this.f6967b.f7454b.getClass();
        }
    }
}
