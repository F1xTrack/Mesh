package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.p028io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Og */
/* loaded from: classes2.dex */
public final class C4713Og implements UnderlyingNetworkTask {

    /* renamed from: a */
    public final C5139g5 f30560a;

    /* renamed from: b */
    public final LinkedHashMap f30561b;

    /* renamed from: c */
    public C5291m7 f30562c;

    /* renamed from: d */
    public C5168h9 f30563d;

    /* renamed from: e */
    public final C4631L6 f30564e;

    /* renamed from: f */
    public List f30565f;

    /* renamed from: g */
    public int f30566g;

    /* renamed from: h */
    public int f30567h;

    /* renamed from: i */
    public int f30568i;

    /* renamed from: j */
    public C4689Ng f30569j;

    /* renamed from: k */
    public final C5387q3 f30570k;

    /* renamed from: l */
    public final PublicLogger f30571l;

    /* renamed from: m */
    public final C5482tn f30572m;

    /* renamed from: n */
    public final InterfaceC4707Oa f30573n;

    /* renamed from: o */
    public final C5475tg f30574o;

    /* renamed from: p */
    public final FullUrlFormer f30575p;

    /* renamed from: q */
    public final C5445sb f30576q;

    /* renamed from: r */
    public final RequestDataHolder f30577r;

    /* renamed from: s */
    public final ResponseDataHolder f30578s;

    /* renamed from: t */
    public final SendingDataTaskHelper f30579t;

    /* renamed from: u */
    public int f30580u;

    public C4713Og(C5139g5 c5139g5, C5475tg c5475tg, C5445sb c5445sb, FullUrlFormer<C4473Eg> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this(c5139g5, c5475tg, c5445sb, fullUrlFormer, requestDataHolder, responseDataHolder, c5139g5.m20417h(), c5139g5.m20424o(), c5139g5.m20430u(), requestBodyEncrypter);
    }

    /* renamed from: a */
    public final C5168h9 m19693a(C4689Ng c4689Ng, List list, C4473Eg c4473Eg) {
        C5168h9 c5168h9 = new C5168h9();
        C4968Z8 c4968z8 = new C4968Z8();
        c4968z8.f31182a = WrapUtils.getOrDefaultIfEmpty(this.f30562c.f32174b, c4473Eg.getUuid());
        c4968z8.f31183b = WrapUtils.getOrDefaultIfEmpty(this.f30562c.f32173a, c4473Eg.getDeviceId());
        this.f30566g = CodedOutputByteBufferNano.computeMessageSize(4, c4968z8) + this.f30566g;
        c5168h9.f31852b = c4968z8;
        C5256km c5256kmM20641z = C5244ka.f32038C.m20641z();
        C4641Lg c4641Lg = new C4641Lg(this, c5168h9);
        synchronized (c5256kmM20641z) {
            c5256kmM20641z.f32112a.mo19829a(c4641Lg);
        }
        List list2 = c4689Ng.f30519a;
        c5168h9.f31851a = (C5093e9[]) list2.toArray(new C5093e9[list2.size()]);
        c5168h9.f31853c = m19688a(c4689Ng.f30521c);
        c5168h9.f31855e = (String[]) list.toArray(new String[list.size()]);
        this.f30566g = CodedOutputByteBufferNano.computeTagSize(8) + this.f30566g;
        return c5168h9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f30560a.f31723b.f31145b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f30575p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f30577r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f30578s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C4473Eg) this.f30560a.f31733l.m21113a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((C4402Bk) C5244ka.f32038C.m20639x()).getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onCreateTask() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4713Og.onCreateTask():boolean");
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f30579t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        String strM20388a;
        if (z) {
            m19694a(false);
        } else if (this.f30578s.getResponseCode() == 400) {
            m19694a(true);
        }
        if (z) {
            for (int i = 0; i < this.f30569j.f30519a.size(); i++) {
                for (C5043c9 c5043c9 : ((C5093e9) this.f30569j.f30519a.get(i)).f31574c) {
                    if (c5043c9 != null && (strM20388a = AbstractC5124ff.m20388a(c5043c9)) != null) {
                        this.f30571l.info(strM20388a, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f30579t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f30560a.f31738q.m20860b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        this.f30560a.f31738q.f32339c.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        SQLiteDatabase writableDatabase;
        C4631L6 c4631l6 = this.f30560a.f31727f;
        c4631l6.getClass();
        try {
            c4631l6.f30432b.lock();
            if (c4631l6.f30439i.get() > ((C4473Eg) c4631l6.f30438h.f31733l.m21113a()).f30099w && (writableDatabase = c4631l6.f30433c.getWritableDatabase()) != null) {
                int iM19582a = c4631l6.m19582a(writableDatabase);
                c4631l6.f30439i.addAndGet(-iM19582a);
                if (iM19582a != 0) {
                    Iterator it = c4631l6.f30440j.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4705O8) it.next()).mo19307a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        c4631l6.f30432b.unlock();
        this.f30560a.f31738q.f32339c.set(true);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        this.f30560a.f31738q.f32339c.set(true);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public C4713Og(C5139g5 c5139g5, C5475tg c5475tg, C5445sb c5445sb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, C4631L6 c4631l6, PublicLogger publicLogger, C5482tn c5482tn, RequestBodyEncrypter requestBodyEncrypter) {
        this(c5139g5, publicLogger, c4631l6, c5475tg, c5482tn, c5445sb, new C5387q3(1024000, "event value in ReportTask", publicLogger), AbstractC5235k1.m20601a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C4713Og(C5139g5 c5139g5, PublicLogger publicLogger, C4631L6 c4631l6, C5475tg c5475tg, C5482tn c5482tn, C5445sb c5445sb, C5387q3 c5387q3, C5128fj c5128fj, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f30561b = new LinkedHashMap();
        this.f30566g = 0;
        this.f30567h = 0;
        this.f30568i = -1;
        this.f30579t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f30574o = c5475tg;
        this.f30560a = c5139g5;
        this.f30564e = c4631l6;
        this.f30571l = publicLogger;
        this.f30570k = c5387q3;
        this.f30572m = c5482tn;
        this.f30576q = c5445sb;
        this.f30573n = c5128fj;
        this.f30577r = requestDataHolder;
        this.f30578s = responseDataHolder;
        this.f30575p = fullUrlFormer;
    }

    /* renamed from: a */
    public static C4896W8[] m19688a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C4896W8[] c4896w8Arr = new C4896W8[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                C4896W8 c4896w8 = new C4896W8();
                c4896w8.f30933a = next;
                c4896w8.f30934b = jSONObject.getString(next);
                c4896w8Arr[i] = c4896w8;
            } catch (Throwable unused) {
            }
            i++;
        }
        return c4896w8Arr;
    }

    /* renamed from: a */
    public final void m19694a(boolean z) {
        C5482tn c5482tn = this.f30572m;
        int i = this.f30580u;
        synchronized (c5482tn) {
            C5507un c5507un = c5482tn.f32656a;
            c5507un.m21152a(c5507un.m21151a().put("report_request_id", i));
        }
        C5093e9[] c5093e9Arr = this.f30563d.f31851a;
        for (int i2 = 0; i2 < c5093e9Arr.length; i2++) {
            try {
                C5093e9 c5093e9 = c5093e9Arr[i2];
                long jLongValue = ((Long) this.f30565f.get(i2)).longValue();
                EnumC4955Yj enumC4955Yj = (EnumC4955Yj) AbstractC5099ef.f31599b.get(c5093e9.f31573b.f31479c);
                if (enumC4955Yj == null) {
                    enumC4955Yj = EnumC4955Yj.FOREGROUND;
                }
                this.f30564e.m19586a(jLongValue, enumC4955Yj.f31130a, c5093e9.f31574c.length, z);
                AbstractC5099ef.m20349a(c5093e9);
            } catch (Throwable unused) {
            }
        }
        C4631L6 c4631l6 = this.f30564e;
        long jM19889a = this.f30560a.f31732k.m19889a();
        c4631l6.f30432b.lock();
        try {
            if (AbstractC4412C5.f29951a.booleanValue()) {
                c4631l6.m19592c();
            }
            SQLiteDatabase writableDatabase = c4631l6.f30433c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", AbstractC4362A5.f29847c, new String[]{String.valueOf(jM19889a)});
            }
        } catch (Throwable unused2) {
        }
        c4631l6.f30432b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea A[LOOP:1: B:44:0x00e4->B:46:0x00ea, LOOP_END] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C4689Ng m19692a(io.appmetrica.analytics.impl.C4473Eg r17) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4713Og.m19692a(io.appmetrica.analytics.impl.Eg):io.appmetrica.analytics.impl.Ng");
    }

    /* renamed from: a */
    public static C4984a0 m19687a(ContentValues contentValues) {
        C5116f7 model = new C5141g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        return new C4984a0((String) WrapUtils.getOrDefault(model.f31665g.f31543g, ""), ((Long) WrapUtils.getOrDefault(model.f31665g.f31544h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: all -> 0x009b, TryCatch #4 {all -> 0x009b, blocks: (B:7:0x0026, B:8:0x002c, B:10:0x0033, B:12:0x0039, B:27:0x006c, B:29:0x0072, B:38:0x0093, B:45:0x00a7, B:47:0x00b6, B:54:0x00c2, B:53:0x00c1, B:50:0x00bc, B:55:0x00c8, B:58:0x00da, B:61:0x00e1, B:42:0x00a0, B:65:0x00f4, B:67:0x00fa, B:64:0x00ea, B:25:0x0066), top: B:88:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ea A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C4665Mg m19691a(long r17, io.appmetrica.analytics.impl.C5068d9 r19, io.appmetrica.analytics.impl.C4473Eg r20, java.util.ArrayList r21, int r22) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4713Og.m19691a(long, io.appmetrica.analytics.impl.d9, io.appmetrica.analytics.impl.Eg, java.util.ArrayList, int):io.appmetrica.analytics.impl.Mg");
    }

    /* renamed from: a */
    public final Cursor m19689a() {
        SQLiteDatabase readableDatabase;
        C4631L6 c4631l6 = this.f30564e;
        LinkedHashMap linkedHashMap = this.f30561b;
        c4631l6.f30431a.lock();
        try {
            readableDatabase = c4631l6.f30433c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, C4631L6.m19579a(linkedHashMap), C4631L6.m19581a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null) : null;
        c4631l6.f30431a.unlock();
        return cursorQuery;
    }

    /* renamed from: a */
    public final Cursor m19690a(long j, EnumC4955Yj enumC4955Yj) {
        SQLiteDatabase readableDatabase;
        C4631L6 c4631l6 = this.f30564e;
        c4631l6.f30431a.lock();
        try {
            readableDatabase = c4631l6.f30433c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j), Integer.toString(enumC4955Yj.f31130a)}, null, null, "number_in_session ASC", null) : null;
        c4631l6.f30431a.unlock();
        return cursorQuery;
    }
}
