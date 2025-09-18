package com.huawei.hms.push;

import com.huawei.hms.push.notification.SubscribedItem;
import com.huawei.hms.support.api.client.Result;
import java.util.List;

/* loaded from: classes.dex */
public class SubscribeResult extends Result {

    /* renamed from: a */
    private String f19412a;

    /* renamed from: b */
    private List<SubscribedItem> f19413b;

    public String getErrorMsg() {
        return this.f19412a;
    }

    public List<SubscribedItem> getSubscribedItems() {
        return this.f19413b;
    }

    public void setErrorMsg(String str) {
        this.f19412a = str;
    }

    public void setSubscribedItems(List<SubscribedItem> list) {
        this.f19413b = list;
    }
}
