package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public abstract class H9 {
    private final InterfaceC3251z8 a;
    private final String b;

    public H9(InterfaceC3251z8 interfaceC3251z8) {
        this(interfaceC3251z8, null);
    }

    public long a(String str, long j) {
        return this.a.a(str, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T b(String str, String str2) {
        synchronized (this) {
            this.a.a(str, str2);
        }
        return this;
    }

    public C3232ye c(String str) {
        return new C3232ye(str, this.b);
    }

    public String d(String str) {
        return this.a.b(str, (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T e(String str) {
        synchronized (this) {
            this.a.b(str);
        }
        return this;
    }

    public H9(InterfaceC3251z8 interfaceC3251z8, String str) {
        this.a = interfaceC3251z8;
        this.b = str;
    }

    public int a(String str, int i) {
        return this.a.a(str, i);
    }

    public Set<String> d() {
        return this.a.a();
    }

    public String a(String str, String str2) {
        return this.a.b(str, str2);
    }

    public boolean a(String str, boolean z) {
        return this.a.b(str, z);
    }

    public void c() {
        synchronized (this) {
            this.a.b();
        }
    }

    public List<String> a(String str, List<String> list) {
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String strB = this.a.b(str, (String) null);
        if (!TextUtils.isEmpty(strB)) {
            try {
                JSONArray jSONArray = new JSONArray(strB);
                strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.optString(i);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T b(String str, long j) {
        synchronized (this) {
            this.a.b(str, j);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T b(String str, int i) {
        synchronized (this) {
            this.a.b(str, i);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T b(String str, boolean z) {
        synchronized (this) {
            this.a.a(str, z);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T b(String str, List<String> list) {
        String string;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
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

    public boolean b(String str) {
        return this.a.a(str);
    }
}
