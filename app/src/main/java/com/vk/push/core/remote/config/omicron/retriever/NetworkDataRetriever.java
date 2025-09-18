package com.vk.push.core.remote.config.omicron.retriever;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import com.vk.push.core.remote.config.omicron.ParseException;
import com.vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint;
import defpackage.AbstractC7743wA1;
import defpackage.C1859Xp0;
import defpackage.C3866fw1;
import defpackage.C6518pl0;
import defpackage.C6649qR0;
import defpackage.C7375uF;
import defpackage.HS0;
import defpackage.O90;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class NetworkDataRetriever implements DataRetriever {
    public final RequestExecutor a;
    public final ResponseParser b;
    public final AnalyticsHandler c;
    public Data d;

    public NetworkDataRetriever(RequestExecutor requestExecutor, ResponseParser responseParser, AnalyticsHandler analyticsHandler) {
        this.a = requestExecutor;
        this.b = responseParser;
        this.c = analyticsHandler;
    }

    @Override // com.vk.push.core.remote.config.omicron.retriever.DataRetriever
    public Data getData() {
        Data data = this.d;
        if (data != null) {
            return data;
        }
        throw new IllegalStateException("Cannot get data if retrieve status is not SUCCESS");
    }

    @Override // com.vk.push.core.remote.config.omicron.retriever.DataRetriever
    public RetrievalStatus retrieve(DataId dataId, DataQuery dataQuery) {
        Pattern pattern = C1859Xp0.d;
        C1859Xp0 c1859Xp0B = AbstractC7743wA1.b("application/x-www-form-urlencoded; charset=utf-8");
        C7375uF c7375uF = new C7375uF(9, false);
        c7375uF.G(dataId.getUrl());
        C3866fw1 c3866fw1 = new C3866fw1(28);
        c3866fw1.a(dataId.getAppId(), "mytracker_id");
        Integer num = dataQuery.a;
        if (num != null) {
            c3866fw1.a(num, "config_v");
        }
        String str = dataQuery.b;
        if (str != null) {
            c3866fw1.a(str, "cond_s");
        }
        Map map = dataQuery.c;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : map.values()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str2);
            }
            c3866fw1.a(sb.toString(), "segments");
        }
        OmicronEnvironment omicronEnvironment = dataQuery.d;
        if (omicronEnvironment != null) {
            c3866fw1.a(omicronEnvironment.name(), "app_env");
        }
        String str3 = dataQuery.e;
        if (str3 != null) {
            c3866fw1.a(str3, "account");
        }
        HashMap map2 = new HashMap();
        Iterator it = dataQuery.f.iterator();
        while (it.hasNext()) {
            ((OmicronFingerprint) it.next()).collect(map2);
            for (Map.Entry entry : map2.entrySet()) {
                c3866fw1.a(entry.getValue(), (String) entry.getKey());
            }
            map2.clear();
        }
        String string = ((StringBuilder) c3866fw1.b).toString();
        O90.f(string, RemoteMessageConst.Notification.CONTENT);
        c7375uF.C(C6518pl0.i(string, c1859Xp0B));
        C6649qR0 c6649qR0O = c7375uF.o();
        String string2 = c6649qR0O.toString();
        AnalyticsHandler analyticsHandler = this.c;
        analyticsHandler.onConfigRequestStarted(string2);
        try {
            HS0 hs0Execute = this.a.execute(c6649qR0O);
            try {
                analyticsHandler.onConfigRequestEnded(hs0Execute.d);
                int i = hs0Execute.d;
                if (i == 200) {
                    this.d = this.b.parse(hs0Execute.g.x());
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
