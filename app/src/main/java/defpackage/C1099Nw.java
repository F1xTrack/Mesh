package defpackage;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Nw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1099Nw {
    public static final Date f = new Date(-1);
    public static final Date g = new Date(-1);
    public final SharedPreferences a;
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();
    public final Object e = new Object();

    public C1099Nw(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final C1021Mw a() {
        C1021Mw c1021Mw;
        synchronized (this.c) {
            int i = this.a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.a.getLong("backoff_end_time_in_millis", -1L));
            c1021Mw = new C1021Mw();
            c1021Mw.a = i;
            c1021Mw.b = date;
        }
        return c1021Mw;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.a.getString("customSignals", "{}"));
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

    public final C1021Mw c() {
        C1021Mw c1021Mw;
        synchronized (this.d) {
            int i = this.a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L));
            c1021Mw = new C1021Mw();
            c1021Mw.a = i;
            c1021Mw.b = date;
        }
        return c1021Mw;
    }

    public final void d(int i, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(String str) {
        synchronized (this.b) {
            this.a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void f(int i, Date date) {
        synchronized (this.d) {
            this.a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void g() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void h() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
