package com.huawei.hms.support.api.entity.opendevice;

import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes2.dex */
public class OdidResp extends AbstractMessageEntity {

    /* renamed from: id */
    @Packed
    private String f19526id;

    public String getId() {
        return this.f19526id;
    }

    public void setId(String str) {
        this.f19526id = str;
    }
}
