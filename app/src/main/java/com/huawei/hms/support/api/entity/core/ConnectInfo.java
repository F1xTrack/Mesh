package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* loaded from: classes2.dex */
public class ConnectInfo implements IMessageEntity {

    /* renamed from: a */
    @Packed
    private List<String> f19521a;

    /* renamed from: b */
    @Packed
    private List<Scope> f19522b;

    /* renamed from: c */
    @Packed
    private String f19523c;

    /* renamed from: d */
    @Packed
    private String f19524d;

    public ConnectInfo() {
    }

    public List<String> getApiNameList() {
        return this.f19521a;
    }

    public String getFingerprint() {
        return this.f19523c;
    }

    public List<Scope> getScopeList() {
        return this.f19522b;
    }

    public String getSubAppID() {
        return this.f19524d;
    }

    public void setApiNameList(List<String> list) {
        this.f19521a = list;
    }

    public void setFingerprint(String str) {
        this.f19523c = str;
    }

    public void setScopeList(List<Scope> list) {
        this.f19522b = list;
    }

    public void setSubAppID(String str) {
        this.f19524d = str;
    }

    public ConnectInfo(List<String> list, List<Scope> list2, String str, String str2) {
        this.f19521a = list;
        this.f19522b = list2;
        this.f19523c = str;
        this.f19524d = str2;
    }
}
