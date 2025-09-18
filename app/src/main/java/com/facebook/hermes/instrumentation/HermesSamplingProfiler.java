package com.facebook.hermes.instrumentation;

import com.facebook.soloader.SoLoader;

/* loaded from: classes.dex */
public abstract class HermesSamplingProfiler {
    static {
        SoLoader.m11076j("jsijniprofiler");
    }

    public static native void disable();

    public static native void dumpSampledTraceToFile(String str);

    public static native void enable();
}
