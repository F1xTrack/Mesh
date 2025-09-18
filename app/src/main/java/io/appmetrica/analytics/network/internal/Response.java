package io.appmetrica.analytics.network.internal;

import io.appmetrica.analytics.network.impl.AbstractC5674e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class Response {

    /* renamed from: a */
    private final boolean f33081a;

    /* renamed from: b */
    private final int f33082b;

    /* renamed from: c */
    private final byte[] f33083c;

    /* renamed from: d */
    private final byte[] f33084d;

    /* renamed from: e */
    private final Map f33085e;

    /* renamed from: f */
    private final Throwable f33086f;

    public Response(Throwable th) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th);
    }

    public int getCode() {
        return this.f33082b;
    }

    public byte[] getErrorData() {
        return this.f33084d;
    }

    public Throwable getException() {
        return this.f33086f;
    }

    public Map<String, List<String>> getHeaders() {
        return this.f33085e;
    }

    public byte[] getResponseData() {
        return this.f33083c;
    }

    public boolean isCompleted() {
        return this.f33081a;
    }

    public String toString() {
        return "Response{completed=" + this.f33081a + ", code=" + this.f33082b + ", responseDataLength=" + this.f33083c.length + ", errorDataLength=" + this.f33084d.length + ", headers=" + this.f33085e + ", exception=" + this.f33086f + '}';
    }

    public Response(boolean z, int i, byte[] bArr, byte[] bArr2, Map<String, List<String>> map, Throwable th) {
        this.f33081a = z;
        this.f33082b = i;
        this.f33083c = bArr;
        this.f33084d = bArr2;
        this.f33085e = map == null ? Collections.emptyMap() : AbstractC5674e.m21289a(map);
        this.f33086f = th;
    }
}
