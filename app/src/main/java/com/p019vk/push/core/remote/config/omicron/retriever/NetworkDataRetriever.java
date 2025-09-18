package com.p019vk.push.core.remote.config.omicron.retriever;

import com.p019vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.p019vk.push.core.remote.config.omicron.Data;
import com.p019vk.push.core.remote.config.omicron.DataId;
import com.p019vk.push.core.remote.config.omicron.OmicronEnvironment;
import com.p019vk.push.core.remote.config.omicron.ParseException;
import com.p019vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import p000.AbstractC11511wA1;
import p000.C10689pl0;
import p000.C10777qR0;
import p000.C6937uF;
import p000.C8540Xp0;
import p000.C9432fw1;
import p000.HS0;
import p000.O90;

/* loaded from: classes2.dex */
public class NetworkDataRetriever implements DataRetriever {

    /* renamed from: a */
    public final RequestExecutor f20560a;

    /* renamed from: b */
    public final ResponseParser f20561b;

    /* renamed from: c */
    public final AnalyticsHandler f20562c;

    /* renamed from: d */
    public Data f20563d;

    public NetworkDataRetriever(RequestExecutor requestExecutor, ResponseParser responseParser, AnalyticsHandler analyticsHandler) {
        this.f20560a = requestExecutor;
        this.f20561b = responseParser;
        this.f20562c = analyticsHandler;
    }

    @Override // com.p019vk.push.core.remote.config.omicron.retriever.DataRetriever
    public Data getData() {
        Data data = this.f20563d;
        if (data != null) {
            return data;
        }
        throw new IllegalStateException("Cannot get data if retrieve status is not SUCCESS");
    }

    @Override // com.p019vk.push.core.remote.config.omicron.retriever.DataRetriever
    public RetrievalStatus retrieve(DataId dataId, DataQuery dataQuery) {
        Pattern pattern = C8540Xp0.f13986d;
        C8540Xp0 c8540Xp0M25569b = AbstractC11511wA1.m25569b("application/x-www-form-urlencoded; charset=utf-8");
        C6937uF c6937uF = new C6937uF(9, false);
        c6937uF.m25136G(dataId.getUrl());
        C9432fw1 c9432fw1 = new C9432fw1(28);
        c9432fw1.m18331a(dataId.getAppId(), "mytracker_id");
        Integer num = dataQuery.f20548a;
        if (num != null) {
            c9432fw1.m18331a(num, "config_v");
        }
        String str = dataQuery.f20549b;
        if (str != null) {
            c9432fw1.m18331a(str, "cond_s");
        }
        Map map = dataQuery.f20550c;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : map.values()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str2);
            }
            c9432fw1.m18331a(sb.toString(), "segments");
        }
        OmicronEnvironment omicronEnvironment = dataQuery.f20551d;
        if (omicronEnvironment != null) {
            c9432fw1.m18331a(omicronEnvironment.name(), "app_env");
        }
        String str3 = dataQuery.f20552e;
        if (str3 != null) {
            c9432fw1.m18331a(str3, "account");
        }
        HashMap map2 = new HashMap();
        Iterator it = dataQuery.f20553f.iterator();
        while (it.hasNext()) {
            ((OmicronFingerprint) it.next()).collect(map2);
            for (Map.Entry entry : map2.entrySet()) {
                c9432fw1.m18331a(entry.getValue(), (String) entry.getKey());
            }
            map2.clear();
        }
        String string = ((StringBuilder) c9432fw1.f27505b).toString();
        O90.m5968f(string, RemoteMessageConst.Notification.CONTENT);
        c6937uF.m25132C(C10689pl0.m23864i(string, c8540Xp0M25569b));
        C10777qR0 c10777qR0M25141o = c6937uF.m25141o();
        String string2 = c10777qR0M25141o.toString();
        AnalyticsHandler analyticsHandler = this.f20562c;
        analyticsHandler.onConfigRequestStarted(string2);
        try {
            HS0 hs0Execute = this.f20560a.execute(c10777qR0M25141o);
            try {
                analyticsHandler.onConfigRequestEnded(hs0Execute.f4298d);
                int i = hs0Execute.f4298d;
                if (i == 200) {
                    this.f20563d = this.f20561b.parse(hs0Execute.f4301g.m3878x());
                    analyticsHandler.onResponseSuccess(dataId);
                    RetrievalStatus retrievalStatus = RetrievalStatus.SUCCESS;
                    hs0Execute.close();
                    return retrievalStatus;
                }
                if (i != 304) {
                    analyticsHandler.onResponseError(dataId, i);
                    RetrievalStatus retrievalStatus2 = RetrievalStatus.ERROR;
                    hs0Execute.close();
                    return retrievalStatus2;
                }
                analyticsHandler.onResponseNotModified(dataId);
                RetrievalStatus retrievalStatus3 = RetrievalStatus.NOT_MODIFIED;
                hs0Execute.close();
                return retrievalStatus3;
            } finally {
            }
        } catch (ParseException e) {
            analyticsHandler.onConfigRequestFailedWithException(e);
            analyticsHandler.onResponseParseException(dataId, e);
            return RetrievalStatus.ERROR;
        } catch (IOException e2) {
            analyticsHandler.onConfigRequestFailedWithException(e2);
            analyticsHandler.onResponseIOException(dataId, e2);
            return RetrievalStatus.ERROR;
        }
    }
}
