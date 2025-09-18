package p000;

import android.os.Process;

/* renamed from: zR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11925zR0 extends Thread {

    /* renamed from: a */
    public final int f46834a;

    public C11925zR0(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f46834a = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f46834a);
        super.run();
    }
}
