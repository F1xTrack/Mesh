package p000;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Nw */
/* loaded from: classes.dex */
public final class C0877Nw {

    /* renamed from: f */
    public static final Date f8134f = new Date(-1);

    /* renamed from: g */
    public static final Date f8135g = new Date(-1);

    /* renamed from: a */
    public final SharedPreferences f8136a;

    /* renamed from: b */
    public final Object f8137b = new Object();

    /* renamed from: c */
    public final Object f8138c = new Object();

    /* renamed from: d */
    public final Object f8139d = new Object();

    /* renamed from: e */
    public final Object f8140e = new Object();

    public C0877Nw(SharedPreferences sharedPreferences) {
        this.f8136a = sharedPreferences;
    }

    /* renamed from: a */
    public final C0814Mw m5907a() {
        C0814Mw c0814Mw;
        synchronized (this.f8138c) {
            int i = this.f8136a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f8136a.getLong("backoff_end_time_in_millis", -1L));
            c0814Mw = new C0814Mw();
            c0814Mw.f7406a = i;
            c0814Mw.f7407b = date;
        }
        return c0814Mw;
    }

    /* renamed from: b */
    public final HashMap m5908b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f8136a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: c */
    public final C0814Mw m5909c() {
        C0814Mw c0814Mw;
        synchronized (this.f8139d) {
            int i = this.f8136a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f8136a.getLong("realtime_backoff_end_time_in_millis", -1L));
            c0814Mw = new C0814Mw();
            c0814Mw.f7406a = i;
            c0814Mw.f7407b = date;
        }
        return c0814Mw;
    }

    /* renamed from: d */
    public final void m5910d(int i, Date date) {
        synchronized (this.f8138c) {
            this.f8136a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* renamed from: e */
    public final void m5911e(String str) {
        synchronized (this.f8137b) {
            this.f8136a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* renamed from: f */
    public final void m5912f(int i, Date date) {
        synchronized (this.f8139d) {
            this.f8136a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* renamed from: g */
    public final void m5913g() {
        synchronized (this.f8137b) {
            this.f8136a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* renamed from: h */
    public final void m5914h() {
        synchronized (this.f8137b) {
            this.f8136a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
