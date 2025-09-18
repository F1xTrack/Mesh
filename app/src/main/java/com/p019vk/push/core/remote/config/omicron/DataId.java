package com.p019vk.push.core.remote.config.omicron;

import java.util.Objects;
import p000.AbstractC1374Vq;

/* loaded from: classes2.dex */
public class DataId {

    /* renamed from: a */
    public final String f20500a;

    /* renamed from: b */
    public final String f20501b;

    public DataId(String str, String str2) {
        this.f20500a = str;
        this.f20501b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataId dataId = (DataId) obj;
        return Objects.equals(this.f20500a, dataId.f20500a) && Objects.equals(this.f20501b, dataId.f20501b);
    }

    public String getAppId() {
        return this.f20501b;
    }

    public String getUrl() {
        return this.f20500a;
    }

    public int hashCode() {
        return Objects.hash(this.f20500a, this.f20501b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataId{url='");
        sb.append(this.f20500a);
        sb.append("', appId='");
        return AbstractC1374Vq.m8593l(sb, this.f20501b, "'}");
    }
}
