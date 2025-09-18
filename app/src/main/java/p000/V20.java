package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class V20 {

    /* renamed from: a */
    public final SharedPreferences f12313a;

    public V20(Context context, String str) {
        this.f12313a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    public final synchronized void m8273a() {
        try {
            long j = this.f12313a.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f12313a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f12313a.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f12313a.edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized void m8274b() {
        try {
            SharedPreferences.Editor editorEdit = this.f12313a.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.f12313a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strM8276d = m8276d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strM8276d)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strM8276d);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized ArrayList m8275c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f12313a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(m8276d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C0670Kd(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            m8284l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized String m8276d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* renamed from: e */
    public final synchronized String m8277e(String str) {
        for (Map.Entry<String, ?> entry : this.f12313a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public final synchronized boolean m8278f(long j, long j2) {
        return m8276d(j).equals(m8276d(j2));
    }

    /* renamed from: g */
    public final synchronized void m8279g() {
        String strM8276d = m8276d(System.currentTimeMillis());
        this.f12313a.edit().putString("last-used-date", strM8276d).commit();
        m8280h(strM8276d);
    }

    /* renamed from: h */
    public final synchronized void m8280h(String str) {
        try {
            String strM8277e = m8277e(str);
            if (strM8277e == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f12313a.getStringSet(strM8277e, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f12313a.edit().remove(strM8277e).commit();
            } else {
                this.f12313a.edit().putStringSet(strM8277e, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: i */
    public final synchronized boolean m8281i(long j) {
        return m8282j(j);
    }

    /* renamed from: j */
    public final synchronized boolean m8282j(long j) {
        if (!this.f12313a.contains("fire-global")) {
            this.f12313a.edit().putLong("fire-global", j).commit();
            return true;
        }
        if (m8278f(this.f12313a.getLong("fire-global", -1L), j)) {
            return false;
        }
        this.f12313a.edit().putLong("fire-global", j).commit();
        return true;
    }

    /* renamed from: k */
    public final synchronized void m8283k(long j, String str) {
        String strM8276d = m8276d(j);
        if (this.f12313a.getString("last-used-date", "").equals(strM8276d)) {
            String strM8277e = m8277e(strM8276d);
            if (strM8277e == null) {
                return;
            }
            if (strM8277e.equals(str)) {
                return;
            }
            m8285m(str, strM8276d);
            return;
        }
        long j2 = this.f12313a.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            m8273a();
            j2 = this.f12313a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f12313a.getStringSet(str, new HashSet()));
        hashSet.add(strM8276d);
        this.f12313a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strM8276d).commit();
    }

    /* renamed from: l */
    public final synchronized void m8284l(long j) {
        this.f12313a.edit().putLong("fire-global", j).commit();
    }

    /* renamed from: m */
    public final synchronized void m8285m(String str, String str2) {
        m8280h(str2);
        HashSet hashSet = new HashSet(this.f12313a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f12313a.edit().putStringSet(str, hashSet).commit();
    }
}
