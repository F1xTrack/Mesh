package com.p019vk.push.common.messaging;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m22267d2 = {"Lcom/vk/push/common/messaging/ClickActionType;", "", "DEFAULT", "DEEP_LINK", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ClickActionType {
    public static final ClickActionType DEEP_LINK;
    public static final ClickActionType DEFAULT;

    /* renamed from: a */
    public static final /* synthetic */ ClickActionType[] f20274a;

    static {
        ClickActionType clickActionType = new ClickActionType("DEFAULT", 0);
        DEFAULT = clickActionType;
        ClickActionType clickActionType2 = new ClickActionType("DEEP_LINK", 1);
        DEEP_LINK = clickActionType2;
        f20274a = new ClickActionType[]{clickActionType, clickActionType2};
    }

    public static ClickActionType valueOf(String str) {
        return (ClickActionType) Enum.valueOf(ClickActionType.class, str);
    }

    public static ClickActionType[] values() {
        return (ClickActionType[]) f20274a.clone();
    }
}
