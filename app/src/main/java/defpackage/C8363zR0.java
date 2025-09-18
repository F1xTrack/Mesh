package defpackage;

import android.os.Process;

/* renamed from: zR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8363zR0 extends Thread {
    public final int a;

    public C8363zR0(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.a = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
