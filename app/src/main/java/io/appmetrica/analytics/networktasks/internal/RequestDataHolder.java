package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class RequestDataHolder {

    /* renamed from: a */
    private NetworkTask.Method f33135a = NetworkTask.Method.GET;

    /* renamed from: b */
    private final HashMap f33136b = new HashMap();

    /* renamed from: c */
    private byte[] f33137c = null;

    /* renamed from: d */
    private Long f33138d;

    /* renamed from: e */
    private Integer f33139e;

    public void applySendTime(long j) {
        this.f33138d = Long.valueOf(j);
        this.f33139e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j) * 1000) / 1000);
    }

    public Map<String, List<String>> getHeaders() {
        return this.f33136b;
    }

    public NetworkTask.Method getMethod() {
        return this.f33135a;
    }

    public byte[] getPostData() {
        return this.f33137c;
    }

    public Long getSendTimestamp() {
        return this.f33138d;
    }

    public Integer getSendTimezoneSec() {
        return this.f33139e;
    }

    public void setHeader(String str, String... strArr) {
        this.f33136b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f33135a = NetworkTask.Method.POST;
        this.f33137c = bArr;
    }
}
