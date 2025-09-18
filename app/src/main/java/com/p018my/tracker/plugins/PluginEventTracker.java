package com.p018my.tracker.plugins;

import com.p018my.tracker.obfuscated.C2313f0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class PluginEventTracker {

    /* renamed from: b */
    private static final Executor f20224b = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    private final C2313f0 f20225a;

    private PluginEventTracker(C2313f0 c2313f0) {
        this.f20225a = c2313f0;
    }

    public static PluginEventTracker newTracker(C2313f0 c2313f0) {
        return new PluginEventTracker(c2313f0);
    }

    public static void onBackground(Runnable runnable) {
        f20224b.execute(runnable);
    }

    public void trackPluginEvent(int i, byte[] bArr, boolean z, boolean z2, Runnable runnable) {
        this.f20225a.m13056a(i, bArr, z, z2, runnable);
    }
}
