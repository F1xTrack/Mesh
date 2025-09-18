package com.my.tracker.plugins;

import com.my.tracker.obfuscated.f0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class PluginEventTracker {
    private static final Executor b = Executors.newSingleThreadExecutor();
    private final f0 a;

    private PluginEventTracker(f0 f0Var) {
        this.a = f0Var;
    }

    public static PluginEventTracker newTracker(f0 f0Var) {
        return new PluginEventTracker(f0Var);
    }

    public static void onBackground(Runnable runnable) {
        b.execute(runnable);
    }

    public void trackPluginEvent(int i, byte[] bArr, boolean z, boolean z2, Runnable runnable) {
        this.a.a(i, bArr, z, z2, runnable);
    }
}
