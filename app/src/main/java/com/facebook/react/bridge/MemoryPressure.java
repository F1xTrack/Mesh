package com.facebook.react.bridge;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p000.F02;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m22267d2 = {"Lcom/facebook/react/bridge/MemoryPressure;", "", "(Ljava/lang/String;I)V", "UI_HIDDEN", "MODERATE", "CRITICAL", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class MemoryPressure {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MemoryPressure[] $VALUES;
    public static final MemoryPressure UI_HIDDEN = new MemoryPressure("UI_HIDDEN", 0);
    public static final MemoryPressure MODERATE = new MemoryPressure("MODERATE", 1);
    public static final MemoryPressure CRITICAL = new MemoryPressure("CRITICAL", 2);

    private static final /* synthetic */ MemoryPressure[] $values() {
        return new MemoryPressure[]{UI_HIDDEN, MODERATE, CRITICAL};
    }

    static {
        MemoryPressure[] memoryPressureArr$values = $values();
        $VALUES = memoryPressureArr$values;
        $ENTRIES = F02.m2482c(memoryPressureArr$values);
    }

    private MemoryPressure(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static MemoryPressure valueOf(String str) {
        return (MemoryPressure) Enum.valueOf(MemoryPressure.class, str);
    }

    public static MemoryPressure[] values() {
        return (MemoryPressure[]) $VALUES.clone();
    }
}
