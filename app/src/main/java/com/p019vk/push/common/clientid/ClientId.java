package com.p019vk.push.common.clientid;

import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m22267d2 = {"Lcom/vk/push/common/clientid/ClientId;", "", "", "clientIdValue", "Lcom/vk/push/common/clientid/ClientIdType;", "clientIdType", "<init>", "(Ljava/lang/String;Lcom/vk/push/common/clientid/ClientIdType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/vk/push/common/clientid/ClientIdType;", "copy", "(Ljava/lang/String;Lcom/vk/push/common/clientid/ClientIdType;)Lcom/vk/push/common/clientid/ClientId;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getClientIdValue", "b", "Lcom/vk/push/common/clientid/ClientIdType;", "getClientIdType", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ClientId {

    /* renamed from: a, reason: from kotlin metadata */
    public final String clientIdValue;

    /* renamed from: b, reason: from kotlin metadata */
    public final ClientIdType clientIdType;

    public ClientId(String str, ClientIdType clientIdType) {
        O90.m5968f(str, "clientIdValue");
        O90.m5968f(clientIdType, "clientIdType");
        this.clientIdValue = str;
        this.clientIdType = clientIdType;
    }

    public static /* synthetic */ ClientId copy$default(ClientId clientId, String str, ClientIdType clientIdType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientId.clientIdValue;
        }
        if ((i & 2) != 0) {
            clientIdType = clientId.clientIdType;
        }
        return clientId.copy(str, clientIdType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientIdValue() {
        return this.clientIdValue;
    }

    /* renamed from: component2, reason: from getter */
    public final ClientIdType getClientIdType() {
        return this.clientIdType;
    }

    public final ClientId copy(String clientIdValue, ClientIdType clientIdType) {
        O90.m5968f(clientIdValue, "clientIdValue");
        O90.m5968f(clientIdType, "clientIdType");
        return new ClientId(clientIdValue, clientIdType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientId)) {
            return false;
        }
        ClientId clientId = (ClientId) other;
        return O90.m5963a(this.clientIdValue, clientId.clientIdValue) && this.clientIdType == clientId.clientIdType;
    }

    public final ClientIdType getClientIdType() {
        return this.clientIdType;
    }

    public final String getClientIdValue() {
        return this.clientIdValue;
    }

    public int hashCode() {
        return this.clientIdType.hashCode() + (this.clientIdValue.hashCode() * 31);
    }

    public String toString() {
        return "ClientId(clientIdValue=" + this.clientIdValue + ", clientIdType=" + this.clientIdType + ')';
    }
}
