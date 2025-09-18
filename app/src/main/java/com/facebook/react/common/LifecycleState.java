package com.facebook.react.common;

import p000.F02;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LifecycleState {

    /* renamed from: a */
    public static final LifecycleState f17891a;

    /* renamed from: b */
    public static final LifecycleState f17892b;

    /* renamed from: c */
    public static final LifecycleState f17893c;

    /* renamed from: d */
    public static final /* synthetic */ LifecycleState[] f17894d;

    static {
        LifecycleState lifecycleState = new LifecycleState("BEFORE_CREATE", 0);
        f17891a = lifecycleState;
        LifecycleState lifecycleState2 = new LifecycleState("BEFORE_RESUME", 1);
        f17892b = lifecycleState2;
        LifecycleState lifecycleState3 = new LifecycleState("RESUMED", 2);
        f17893c = lifecycleState3;
        LifecycleState[] lifecycleStateArr = {lifecycleState, lifecycleState2, lifecycleState3};
        f17894d = lifecycleStateArr;
        F02.m2482c(lifecycleStateArr);
    }

    public static LifecycleState valueOf(String str) {
        return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
    }

    public static LifecycleState[] values() {
        return (LifecycleState[]) f17894d.clone();
    }
}
