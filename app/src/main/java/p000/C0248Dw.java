package p000;

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
public final class C0248Dw {

    /* renamed from: j */
    public static final long f2311j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k */
    public static final int[] f2312k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a */
    public final InterfaceC1478XU f2313a;

    /* renamed from: b */
    public final InterfaceC9347fG0 f2314b;

    /* renamed from: c */
    public final Executor f2315c;

    /* renamed from: d */
    public final Clock f2316d;

    /* renamed from: e */
    public final Random f2317e;

    /* renamed from: f */
    public final C7169xw f2318f;

    /* renamed from: g */
    public final ConfigFetchHttpClient f2319g;

    /* renamed from: h */
    public final C0877Nw f2320h;

    /* renamed from: i */
    public final HashMap f2321i;

    public C0248Dw(InterfaceC1478XU interfaceC1478XU, InterfaceC9347fG0 interfaceC9347fG0, Executor executor, Clock clock, Random random, C7169xw c7169xw, ConfigFetchHttpClient configFetchHttpClient, C0877Nw c0877Nw, HashMap map) {
        this.f2313a = interfaceC1478XU;
        this.f2314b = interfaceC9347fG0;
        this.f2315c = executor;
        this.f2316d = clock;
        this.f2317e = random;
        this.f2318f = c7169xw;
        this.f2319g = configFetchHttpClient;
        this.f2320h = c0877Nw;
        this.f2321i = map;
    }

    /* renamed from: a */
    public final C9450g32 m1947a(long j) {
        HashMap map = new HashMap(this.f2321i);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return this.f2318f.m26005c().mo11140g(this.f2315c, new C0059Aw(this, j, map, 0));
    }

    /* renamed from: b */
    public final C0185Cw m1948b(String str, String str2, Date date, HashMap map) throws C6747rV {
        String str3;
        try {
            HttpURLConnection httpURLConnectionM11347b = this.f2319g.m11347b();
            ConfigFetchHttpClient configFetchHttpClient = this.f2319g;
            HashMap mapM1951e = m1951e();
            String string = this.f2320h.f8136a.getString("last_fetch_etag", null);
            InterfaceC1136S3 interfaceC1136S3 = (InterfaceC1136S3) this.f2314b.get();
            C0185Cw c0185CwFetch = configFetchHttpClient.fetch(httpURLConnectionM11347b, str, str2, mapM1951e, string, map, interfaceC1136S3 == null ? null : (Long) ((CG1) ((C1199T3) interfaceC1136S3).f11130a.f27505b).m1134c(null, null, true).get("_fot"), date, this.f2320h.m5908b());
            C7232yw c7232yw = c0185CwFetch.f1763b;
            if (c7232yw != null) {
                C0877Nw c0877Nw = this.f2320h;
                long j = c7232yw.f46547f;
                synchronized (c0877Nw.f8137b) {
                    c0877Nw.f8136a.edit().putLong("last_template_version", j).apply();
                }
            }
            String str4 = c0185CwFetch.f1764c;
            if (str4 != null) {
                this.f2320h.m5911e(str4);
            }
            this.f2320h.m5910d(0, C0877Nw.f8135g);
            return c0185CwFetch;
        } catch (C7016vV e) {
            int i = e.f44391b;
            C0877Nw c0877Nw2 = this.f2320h;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i2 = c0877Nw2.m5907a().f7406a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f2312k;
                c0877Nw2.m5910d(i2, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i2, iArr.length) - 1]) / 2) + this.f2317e.nextInt((int) r6)));
            }
            C0814Mw c0814MwM5907a = c0877Nw2.m5907a();
            int i3 = e.f44391b;
            if (c0814MwM5907a.f7406a > 1 || i3 == 429) {
                c0814MwM5907a.f7407b.getTime();
                throw new C6827sV("Fetch was throttled.");
            }
            if (i3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i3 == 429) {
                    throw new C6684qV("The throttled response from the server was not handled correctly by the FRC SDK.");
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
            throw new C7016vV(e.f44391b, "Fetch failed: ".concat(str3), e);
        }
    }

    /* renamed from: c */
    public final C9450g32 m1949c(Task task, long j, HashMap map) {
        C9450g32 c9450g32Mo11140g;
        Date date = new Date(this.f2316d.currentTimeMillis());
        boolean zMo11144k = task.mo11144k();
        C0877Nw c0877Nw = this.f2320h;
        if (zMo11144k) {
            Date date2 = new Date(c0877Nw.f8136a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(C0877Nw.f8134f) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date2.getTime()))) {
                return AbstractC9376fU1.m18244e(new C0185Cw(2, null, null));
            }
        }
        Date date3 = c0877Nw.m5907a().f7407b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f2315c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            c9450g32Mo11140g = AbstractC9376fU1.m18243d(new C6827sV(str));
        } else {
            C1415WU c1415wu = (C1415WU) this.f2313a;
            C9450g32 c9450g32M8789d = c1415wu.m8789d();
            C9450g32 c9450g32M8790e = c1415wu.m8790e();
            c9450g32Mo11140g = AbstractC9376fU1.m18247h(c9450g32M8789d, c9450g32M8790e).mo11140g(executor, new C0122Bw(this, c9450g32M8789d, c9450g32M8790e, date, map));
        }
        return c9450g32Mo11140g.mo11140g(executor, new C0424Gj(this, 9, date));
    }

    /* renamed from: d */
    public final C9450g32 m1950d(int i) {
        HashMap map = new HashMap(this.f2321i);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i);
        return this.f2318f.m26005c().mo11140g(this.f2315c, new C0424Gj(this, 8, map));
    }

    /* renamed from: e */
    public final HashMap m1951e() {
        HashMap map = new HashMap();
        InterfaceC1136S3 interfaceC1136S3 = (InterfaceC1136S3) this.f2314b.get();
        if (interfaceC1136S3 == null) {
            return map;
        }
        for (Map.Entry entry : ((CG1) ((C1199T3) interfaceC1136S3).f11130a.f27505b).m1134c(null, null, false).entrySet()) {
            map.put((String) entry.getKey(), entry.getValue().toString());
        }
        return map;
    }
}
