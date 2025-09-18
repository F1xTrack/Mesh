package com.vk.push.core.remote.config.omicron;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class UpdateBehaviour {
    public static final UpdateBehaviour CACHE_ONLY;
    public static final UpdateBehaviour DEFAULT;
    public static final UpdateBehaviour SCHEDULED;
    public static final UpdateBehaviour WAIT_FOR_ACTUAL;
    public static final /* synthetic */ UpdateBehaviour[] a;

    static {
        UpdateBehaviour updateBehaviour = new UpdateBehaviour("WAIT_FOR_ACTUAL", 0);
        WAIT_FOR_ACTUAL = updateBehaviour;
        UpdateBehaviour updateBehaviour2 = new UpdateBehaviour("CACHE_ONLY", 1);
        CACHE_ONLY = updateBehaviour2;
        UpdateBehaviour updateBehaviour3 = new UpdateBehaviour("DEFAULT", 2);
        DEFAULT = updateBehaviour3;
        UpdateBehaviour updateBehaviour4 = new UpdateBehaviour(Core.NotificationType.SCHEDULED, 3);
        SCHEDULED = updateBehaviour4;
        a = new UpdateBehaviour[]{updateBehaviour, updateBehaviour2, updateBehaviour3, updateBehaviour4};
    }

    public static UpdateBehaviour valueOf(String str) {
        return (UpdateBehaviour) Enum.valueOf(UpdateBehaviour.class, str);
    }

    public static UpdateBehaviour[] values() {
        return (UpdateBehaviour[]) a.clone();
    }
}
