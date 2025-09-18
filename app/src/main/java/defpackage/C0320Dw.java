package defpackage;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: Dw */
/* loaded from: classes.dex */
public final class C0320Dw {
    public static final long j = TimeUnit.HOURS.toSeconds(12);
    public static final int[] k = {2, 4, 8, 16, 32, 64, 128, 256};
    public final XU a;
    public final InterfaceC3739fG0 b;
    public final Executor c;
    public final Clock d;
    public final Random e;
    public final C8075xw f;
    public final ConfigFetchHttpClient g;
    public final C1099Nw h;
    public final HashMap i;

    public C0320Dw(XU xu, InterfaceC3739fG0 interfaceC3739fG0, Executor executor, Clock clock, Random random, C8075xw c8075xw, ConfigFetchHttpClient configFetchHttpClient, C1099Nw c1099Nw, HashMap map) {
        this.a = xu;
        this.b = interfaceC3739fG0;
        this.c = executor;
        this.d = clock;
        this.e = random;
        this.f = c8075xw;
        this.g = configFetchHttpClient;
        this.h = c1099Nw;
        this.i = map;
    }

    public final C3892g32 a(long j2) {
        HashMap map = new HashMap(this.i);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return this.f.c().g(this.c, new C0086Aw(this, j2, map, 0));
    }

    public final C0242Cw b(String str, String str2, Date date, HashMap map) throws C6850rV {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.g.b();
            ConfigFetchHttpClient configFetchHttpClient = this.g;
            HashMap mapE = e();
            String string = this.h.a.getString("last_fetch_etag", null);
            S3 s3 = (S3) this.b.get();
            C0242Cw c0242CwFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapE, string, map, s3 == null ? null : (Long) ((CG1) ((T3) s3).a.b).c(null, null, true).get("_fot"), date, this.h.b());
            C8265yw c8265yw = c0242CwFetch.b;
            if (c8265yw != null) {
                C1099Nw c1099Nw = this.h;
                long j2 = c8265yw.f;
                synchronized (c1099Nw.b) {
                    c1099Nw.a.edit().putLong("last_template_version", j2).apply();
                }
            }
            String str4 = c0242CwFetch.c;
            if (str4 != null) {
                this.h.e(str4);
            }
            this.h.d(0, C1099Nw.g);
            return c0242CwFetch;
        } catch (C7614vV e) {
            int i = e.b;
            C1099Nw c1099Nw2 = this.h;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i2 = c1099Nw2.a().a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = k;
                c1099Nw2.d(i2, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i2, iArr.length) - 1]) / 2) + this.e.nextInt((int) r6)));
            }
            C1021Mw c1021MwA = c1099Nw2.a();
            int i3 = e.b;
            if (c1021MwA.a > 1 || i3 == 429) {
                c1021MwA.b.getTime();
                throw new C7041sV("Fetch was throttled.");
            }
            if (i3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i3 == 429) {
                    throw new C6660qV("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i3 != 500) {
                    switch (i3) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new C7614vV(e.b, "Fetch failed: ".concat(str3), e);
        }
    }

    public final C3892g32 c(Task task, long j2, HashMap map) {
        C3892g32 c3892g32G;
        Date date = new Date(this.d.currentTimeMillis());
        boolean zK = task.k();
        C1099Nw c1099Nw = this.h;
        if (zK) {
            Date date2 = new Date(c1099Nw.a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(C1099Nw.f) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j2) + date2.getTime()))) {
                return AbstractC3782fU1.e(new C0242Cw(2, null, null));
            }
        }
        Date date3 = c1099Nw.a().b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            c3892g32G = AbstractC3782fU1.d(new C7041sV(str));
        } else {
            WU wu = (WU) this.a;
            C3892g32 c3892g32D = wu.d();
            C3892g32 c3892g32E = wu.e();
            c3892g32G = AbstractC3782fU1.h(c3892g32D, c3892g32E).g(executor, new C0164Bw(this, c3892g32D, c3892g32E, date, map));
        }
        return c3892g32G.g(executor, new C0515Gj(this, 9, date));
    }

    public final C3892g32 d(int i) {
        HashMap map = new HashMap(this.i);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i);
        return this.f.c().g(this.c, new C0515Gj(this, 8, map));
    }

    public final HashMap e() {
        HashMap map = new HashMap();
        S3 s3 = (S3) this.b.get();
        if (s3 == null) {
            return map;
        }
        for (Map.Entry entry : ((CG1) ((T3) s3).a.b).c(null, null, false).entrySet()) {
            map.put((String) entry.getKey(), entry.getValue().toString());
        }
        return map;
    }
}
