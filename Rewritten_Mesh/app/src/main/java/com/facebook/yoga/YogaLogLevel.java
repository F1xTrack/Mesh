package com.facebook.yoga;

import p000.AbstractC11153tN0;
import p000.InterfaceC1028QK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC1028QK
/* loaded from: classes.dex */
public final class YogaLogLevel {

    /* renamed from: a */
    public static final YogaLogLevel f17986a;

    /* renamed from: b */
    public static final YogaLogLevel f17987b;

    /* renamed from: c */
    public static final YogaLogLevel f17988c;

    /* renamed from: d */
    public static final YogaLogLevel f17989d;

    /* renamed from: e */
    public static final YogaLogLevel f17990e;

    /* renamed from: f */
    public static final YogaLogLevel f17991f;

    /* renamed from: g */
    public static final /* synthetic */ YogaLogLevel[] f17992g;

    static {
        YogaLogLevel yogaLogLevel = new YogaLogLevel("ERROR", 0);
        f17986a = yogaLogLevel;
        YogaLogLevel yogaLogLevel2 = new YogaLogLevel("WARN", 1);
        f17987b = yogaLogLevel2;
        YogaLogLevel yogaLogLevel3 = new YogaLogLevel("INFO", 2);
        f17988c = yogaLogLevel3;
        YogaLogLevel yogaLogLevel4 = new YogaLogLevel("DEBUG", 3);
        f17989d = yogaLogLevel4;
        YogaLogLevel yogaLogLevel5 = new YogaLogLevel("VERBOSE", 4);
        f17990e = yogaLogLevel5;
        YogaLogLevel yogaLogLevel6 = new YogaLogLevel("FATAL", 5);
        f17991f = yogaLogLevel6;
        f17992g = new YogaLogLevel[]{yogaLogLevel, yogaLogLevel2, yogaLogLevel3, yogaLogLevel4, yogaLogLevel5, yogaLogLevel6};
    }

    @InterfaceC1028QK
    public static YogaLogLevel fromInt(int i) {
        if (i == 0) {
            return f17986a;
        }
        if (i == 1) {
            return f17987b;
        }
        if (i == 2) {
            return f17988c;
        }
        if (i == 3) {
            return f17989d;
        }
        if (i == 4) {
            return f17990e;
        }
        if (i == 5) {
            return f17991f;
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Unknown enum value: "));
    }

    public static YogaLogLevel valueOf(String str) {
        return (YogaLogLevel) Enum.valueOf(YogaLogLevel.class, str);
    }

    public static YogaLogLevel[] values() {
        return (YogaLogLevel[]) f17992g.clone();
    }
}
