package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4767oe {
    public static final String c = "oe";
    public final Ea a;
    public final String b;

    public AbstractC4767oe(Ea ea, String str) {
        this.a = ea;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4767oe> T a(String str, float f) {
        synchronized (this) {
            this.a.a(str, f);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4767oe> T b(String str, String str2) {
        synchronized (this) {
            this.a.a(str, str2);
        }
        return this;
    }

    public final C4791pe c(String str) {
        return new C4791pe(str, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4767oe> T d(String str) {
        synchronized (this) {
            this.a.remove(str);
        }
        return this;
    }

    public Set<String> c() {
        return this.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4767oe> T a(String str, String[] strArr) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
            string = jSONArray.toString();
        } catch (Throwable unused) {
            string = null;
        }
        this.a.a(str, string);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4767oe> T b(String str, long j) {
        synchronized (this) {
            this.a.a(str, j);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4767oe> T b(String str, int i) {
        synchronized (this) {
            this.a.a(i, str);
        }
        return this;
    }

    public final <T extends AbstractC4767oe> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j) {
        return this.a.getLong(str, j);
    }

    public final int a(String str, int i) {
        return this.a.getInt(str, i);
    }

    public final String a(String str, String str2) {
        return this.a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4767oe> T b(String str, boolean z) {
        synchronized (this) {
            this.a.a(str, z);
        }
        return this;
    }

    public final boolean a(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    public final void b() {
        synchronized (this) {
            this.a.b();
        }
    }

    public final boolean b(String str) {
        return this.a.a(str);
    }
}
