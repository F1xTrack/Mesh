package defpackage;

import android.os.Trace;

/* renamed from: Bb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0103Bb1 {
    public static void a(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(int i, String str) {
        Trace.setCounter(str, i);
    }
}
