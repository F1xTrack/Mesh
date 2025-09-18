package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* loaded from: classes.dex */
public final class DO1 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ C7595vO1 b;

    public DO1(C7595vO1 c7595vO1, String str) {
        this.b = c7595vO1;
        Preconditions.checkNotNull(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.n().g.c(th, this.a);
    }
}
