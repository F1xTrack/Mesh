package com.vk.push.core.network.model;

import defpackage.AbstractC1705Vq;
import defpackage.F91;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/vk/push/core/network/model/ResponseError;", "", "", "code", "", "message", "status", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/vk/push/core/network/model/ResponseError;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCode", "b", "Ljava/lang/String;", "getMessage", "c", "getStatus", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ResponseError {

    /* renamed from: a, reason: from kotlin metadata */
    public final int code;

    /* renamed from: b, reason: from kotlin metadata */
    public final String message;

    /* renamed from: c, reason: from kotlin metadata */
    public final String status;

    public ResponseError(int i, String str, String str2) {
        O90.f(str, "message");
        O90.f(str2, "status");
        this.code = i;
        this.message = str;
        this.status = str2;
    }

    public static /* synthetic */ ResponseError copy$default(ResponseError responseError, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = responseError.code;
        }
        if ((i2 & 2) != 0) {
            str = responseError.message;
        }
        if ((i2 & 4) != 0) {
            str2 = responseError.status;
        }
        return responseError.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final ResponseError copy(int code, String message, String status) {
        O90.f(message, "message");
        O90.f(status, "status");
        return new ResponseError(code, message, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseError)) {
            return false;
        }
        ResponseError responseError = (ResponseError) other;
        return this.code == responseError.code && O90.a(this.message, responseError.message) && O90.a(this.status, responseError.status);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + AbstractC1705Vq.e(this.code * 31, 31, this.message);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResponseError(code=");
        sb.append(this.code);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", status=");
        return F91.v(sb, this.status, ')');
    }
}
