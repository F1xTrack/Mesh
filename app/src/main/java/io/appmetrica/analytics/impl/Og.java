package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
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

/* loaded from: classes2.dex */
public final class Og implements UnderlyingNetworkTask {
    public final C4567g5 a;
    public final LinkedHashMap b;
    public C4712m7 c;
    public C4595h9 d;
    public final L6 e;
    public List f;
    public int g;
    public int h;
    public int i;
    public Ng j;
    public final C4804q3 k;
    public final PublicLogger l;
    public final tn m;
    public final Oa n;
    public final C4888tg o;
    public final FullUrlFormer p;
    public final C4859sb q;
    public final RequestDataHolder r;
    public final ResponseDataHolder s;
    public final SendingDataTaskHelper t;
    public int u;

    public Og(C4567g5 c4567g5, C4888tg c4888tg, C4859sb c4859sb, FullUrlFormer<Eg> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this(c4567g5, c4888tg, c4859sb, fullUrlFormer, requestDataHolder, responseDataHolder, c4567g5.h(), c4567g5.o(), c4567g5.u(), requestBodyEncrypter);
    }

    public final C4595h9 a(Ng ng, List list, Eg eg) {
        C4595h9 c4595h9 = new C4595h9();
        Z8 z8 = new Z8();
        z8.a = WrapUtils.getOrDefaultIfEmpty(this.c.b, eg.getUuid());
        z8.b = WrapUtils.getOrDefaultIfEmpty(this.c.a, eg.getDeviceId());
        this.g = CodedOutputByteBufferNano.computeMessageSize(4, z8) + this.g;
        c4595h9.b = z8;
        C4679km c4679kmZ = C4667ka.C.z();
        Lg lg = new Lg(this, c4595h9);
        synchronized (c4679kmZ) {
            c4679kmZ.a.a(lg);
        }
        List list2 = ng.a;
        c4595h9.a = (C4523e9[]) list2.toArray(new C4523e9[list2.size()]);
        c4595h9.c = a(ng.c);
        c4595h9.e = (String[]) list.toArray(new String[list.size()]);
        this.g = CodedOutputByteBufferNano.computeTagSize(8) + this.g;
        return c4595h9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.a.b.b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((Eg) this.a.l.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((Bk) C4667ka.C.x()).getClass();
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
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Og.onCreateTask():boolean");
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        String strA;
        if (z) {
            a(false);
        } else if (this.s.getResponseCode() == 400) {
            a(true);
        }
        if (z) {
            for (int i = 0; i < this.j.a.size(); i++) {
                for (C4473c9 c4473c9 : ((C4523e9) this.j.a.get(i)).c) {
                    if (c4473c9 != null && (strA = AbstractC4553ff.a(c4473c9)) != null) {
                        this.l.info(strA, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.a.q.b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        this.a.q.c.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        SQLiteDatabase writableDatabase;
        L6 l6 = this.a.f;
        l6.getClass();
        try {
            l6.b.lock();
            if (l6.i.get() > ((Eg) l6.h.l.a()).w && (writableDatabase = l6.c.getWritableDatabase()) != null) {
                int iA = l6.a(writableDatabase);
                l6.i.addAndGet(-iA);
                if (iA != 0) {
                    Iterator it = l6.j.iterator();
                    while (it.hasNext()) {
                        ((O8) it.next()).a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        l6.b.unlock();
        this.a.q.c.set(true);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        this.a.q.c.set(true);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public Og(C4567g5 c4567g5, C4888tg c4888tg, C4859sb c4859sb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, L6 l6, PublicLogger publicLogger, tn tnVar, RequestBodyEncrypter requestBodyEncrypter) {
        this(c4567g5, publicLogger, l6, c4888tg, tnVar, c4859sb, new C4804q3(1024000, "event value in ReportTask", publicLogger), AbstractC4658k1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public Og(C4567g5 c4567g5, PublicLogger publicLogger, L6 l6, C4888tg c4888tg, tn tnVar, C4859sb c4859sb, C4804q3 c4804q3, C4557fj c4557fj, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.b = new LinkedHashMap();
        this.g = 0;
        this.h = 0;
        this.i = -1;
        this.t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.o = c4888tg;
        this.a = c4567g5;
        this.e = l6;
        this.l = publicLogger;
        this.k = c4804q3;
        this.m = tnVar;
        this.q = c4859sb;
        this.n = c4557fj;
        this.r = requestDataHolder;
        this.s = responseDataHolder;
        this.p = fullUrlFormer;
    }

    public static W8[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        W8[] w8Arr = new W8[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                W8 w8 = new W8();
                w8.a = next;
                w8.b = jSONObject.getString(next);
                w8Arr[i] = w8;
            } catch (Throwable unused) {
            }
            i++;
        }
        return w8Arr;
    }

    public final void a(boolean z) {
        tn tnVar = this.m;
        int i = this.u;
        synchronized (tnVar) {
            un unVar = tnVar.a;
            unVar.a(unVar.a().put("report_request_id", i));
        }
        C4523e9[] c4523e9Arr = this.d.a;
        for (int i2 = 0; i2 < c4523e9Arr.length; i2++) {
            try {
                C4523e9 c4523e9 = c4523e9Arr[i2];
                long jLongValue = ((Long) this.f.get(i2)).longValue();
                Yj yj = (Yj) AbstractC4529ef.b.get(c4523e9.b.c);
                if (yj == null) {
                    yj = Yj.FOREGROUND;
                }
                this.e.a(jLongValue, yj.a, c4523e9.c.length, z);
                AbstractC4529ef.a(c4523e9);
            } catch (Throwable unused) {
            }
        }
        L6 l6 = this.e;
        long jA = this.a.k.a();
        l6.b.lock();
        try {
            if (C5.a.booleanValue()) {
                l6.c();
            }
            SQLiteDatabase writableDatabase = l6.c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", A5.c, new String[]{String.valueOf(jA)});
            }
        } catch (Throwable unused2) {
        }
        l6.b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea A[LOOP:1: B:44:0x00e4->B:46:0x00ea, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.Ng a(io.appmetrica.analytics.impl.Eg r17) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Og.a(io.appmetrica.analytics.impl.Eg):io.appmetrica.analytics.impl.Ng");
    }

    public static C4414a0 a(ContentValues contentValues) {
        C4545f7 model = new C4569g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        return new C4414a0((String) WrapUtils.getOrDefault(model.g.g, ""), ((Long) WrapUtils.getOrDefault(model.g.h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: all -> 0x009b, TryCatch #4 {all -> 0x009b, blocks: (B:7:0x0026, B:8:0x002c, B:10:0x0033, B:12:0x0039, B:27:0x006c, B:29:0x0072, B:38:0x0093, B:45:0x00a7, B:47:0x00b6, B:54:0x00c2, B:53:0x00c1, B:50:0x00bc, B:55:0x00c8, B:58:0x00da, B:61:0x00e1, B:42:0x00a0, B:65:0x00f4, B:67:0x00fa, B:64:0x00ea, B:25:0x0066), top: B:88:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.Mg a(long r17, io.appmetrica.analytics.impl.C4498d9 r19, io.appmetrica.analytics.impl.Eg r20, java.util.ArrayList r21, int r22) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Og.a(long, io.appmetrica.analytics.impl.d9, io.appmetrica.analytics.impl.Eg, java.util.ArrayList, int):io.appmetrica.analytics.impl.Mg");
    }

    public final Cursor a() {
        SQLiteDatabase readableDatabase;
        L6 l6 = this.e;
        LinkedHashMap linkedHashMap = this.b;
        l6.a.lock();
        try {
            readableDatabase = l6.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, L6.a(linkedHashMap), L6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null) : null;
        l6.a.unlock();
        return cursorQuery;
    }

    public final Cursor a(long j, Yj yj) {
        SQLiteDatabase readableDatabase;
        L6 l6 = this.e;
        l6.a.lock();
        try {
            readableDatabase = l6.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j), Integer.toString(yj.a)}, null, null, "number_in_session ASC", null) : null;
        l6.a.unlock();
        return cursorQuery;
    }
}
