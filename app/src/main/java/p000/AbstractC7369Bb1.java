package p000;

import android.os.Trace;

/* renamed from: Bb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7369Bb1 {
    /* renamed from: a */
    public static void m774a(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    /* renamed from: b */
    public static void m775b(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    /* renamed from: c */
    public static boolean m776c() {
        return Trace.isEnabled();
    }

    /* renamed from: d */
    public static void m777d(int i, String str) {
        Trace.setCounter(str, i);
    }
}
