package com.vk.push.common.clientid;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/common/clientid/ClientIdType;", "", "GAID", "OAID", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ClientIdType {
    public static final ClientIdType GAID;
    public static final ClientIdType OAID;
    public static final /* synthetic */ ClientIdType[] a;

    static {
        ClientIdType clientIdType = new ClientIdType("GAID", 0);
        GAID = clientIdType;
        ClientIdType clientIdType2 = new ClientIdType("OAID", 1);
        OAID = clientIdType2;
        a = new ClientIdType[]{clientIdType, clientIdType2};
    }

    public static ClientIdType valueOf(String str) {
        return (ClientIdType) Enum.valueOf(ClientIdType.class, str);
    }

    public static ClientIdType[] values() {
        return (ClientIdType[]) a.clone();
    }
}
