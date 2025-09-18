package com.vk.push.core.domain.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/vk/push/core/domain/model/CallingAppIds;", "", "", "uid", "pid", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "a", "I", "getUid", "()I", "b", "getPid", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CallingAppIds {

    /* renamed from: a, reason: from kotlin metadata */
    public final int uid;

    /* renamed from: b, reason: from kotlin metadata */
    public final int pid;

    public CallingAppIds(int i, int i2) {
        this.uid = i;
        this.pid = i2;
    }

    public final int getPid() {
        return this.pid;
    }

    public final int getUid() {
        return this.uid;
    }

    public String toString() {
        return "uid = " + this.uid + ", pid = " + this.pid;
    }
}
