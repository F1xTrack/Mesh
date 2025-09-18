package com.vk.push.core.remote.config.omicron;

import defpackage.AbstractC1705Vq;
import java.util.Objects;

/* loaded from: classes2.dex */
public class DataId {
    public final String a;
    public final String b;

    public DataId(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataId dataId = (DataId) obj;
        return Objects.equals(this.a, dataId.a) && Objects.equals(this.b, dataId.b);
    }

    public String getAppId() {
        return this.b;
    }

    public String getUrl() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataId{url='");
        sb.append(this.a);
        sb.append("', appId='");
        return AbstractC1705Vq.l(sb, this.b, "'}");
    }
}
