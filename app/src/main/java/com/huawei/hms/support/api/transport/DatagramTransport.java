package com.huawei.hms.support.api.transport;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;

/* loaded from: classes2.dex */
public interface DatagramTransport {

    /* renamed from: com.huawei.hms.support.api.transport.DatagramTransport$a */
    public interface InterfaceC2262a {
        /* renamed from: a */
        void mo12574a(int i, IMessageEntity iMessageEntity);
    }

    void post(ApiClient apiClient, InterfaceC2262a interfaceC2262a);

    void send(ApiClient apiClient, InterfaceC2262a interfaceC2262a);
}
