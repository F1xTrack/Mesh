package com.p019vk.push.core.remote.config.omicron.retriever;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class RetrievalStatus {
    public static final RetrievalStatus ERROR;
    public static final RetrievalStatus NOT_MODIFIED;
    public static final RetrievalStatus SUCCESS;

    /* renamed from: a */
    public static final /* synthetic */ RetrievalStatus[] f20566a;

    static {
        RetrievalStatus retrievalStatus = new RetrievalStatus("SUCCESS", 0);
        SUCCESS = retrievalStatus;
        RetrievalStatus retrievalStatus2 = new RetrievalStatus("NOT_MODIFIED", 1);
        NOT_MODIFIED = retrievalStatus2;
        RetrievalStatus retrievalStatus3 = new RetrievalStatus("ERROR", 2);
        ERROR = retrievalStatus3;
        f20566a = new RetrievalStatus[]{retrievalStatus, retrievalStatus2, retrievalStatus3};
    }

    public static RetrievalStatus valueOf(String str) {
        return (RetrievalStatus) Enum.valueOf(RetrievalStatus.class, str);
    }

    public static RetrievalStatus[] values() {
        return (RetrievalStatus[]) f20566a.clone();
    }
}
