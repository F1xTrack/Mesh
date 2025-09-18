package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* loaded from: classes.dex */
public final class DO1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f2003a;

    /* renamed from: b */
    public final /* synthetic */ C11412vO1 f2004b;

    public DO1(C11412vO1 c11412vO1, String str) {
        this.f2004b = c11412vO1;
        Preconditions.checkNotNull(str);
        this.f2003a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f2004b.mo6070n().f8378g.m24554c(th, this.f2003a);
    }
}
