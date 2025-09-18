package io.appmetrica.analytics.networktasks.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ResponseDataHolder {

    /* renamed from: a */
    private int f33140a;

    /* renamed from: b */
    private byte[] f33141b;

    /* renamed from: c */
    private Map f33142c;

    /* renamed from: d */
    private final ResponseValidityChecker f33143d;

    public ResponseDataHolder(ResponseValidityChecker responseValidityChecker) {
        this.f33143d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f33140a;
    }

    public byte[] getResponseData() {
        return this.f33141b;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f33142c;
    }

    public boolean isValidResponse() {
        return this.f33143d.isResponseValid(this.f33140a);
    }

    public void setResponseCode(int i) {
        this.f33140a = i;
    }

    public void setResponseData(byte[] bArr) {
        this.f33141b = bArr;
    }

    public void setResponseHeaders(Map<String, List<String>> map) {
        this.f33142c = map;
    }
}
