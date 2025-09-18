package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.yandex.metrica.impl.ob.H9 */
/* loaded from: classes2.dex */
public abstract class AbstractC2651H9 {

    /* renamed from: a */
    private final InterfaceC3774z8 f21351a;

    /* renamed from: b */
    private final String f21352b;

    public AbstractC2651H9(InterfaceC3774z8 interfaceC3774z8) {
        this(interfaceC3774z8, null);
    }

    /* renamed from: a */
    public long m14247a(String str, long j) {
        return this.f21351a.mo14983a(str, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public <T extends AbstractC2651H9> T m14253b(String str, String str2) {
        synchronized (this) {
            this.f21351a.mo14984a(str, str2);
        }
        return this;
    }

    /* renamed from: c */
    public C3754ye m14257c(String str) {
        return new C3754ye(str, this.f21352b);
    }

    /* renamed from: d */
    public String m14259d(String str) {
        return this.f21351a.mo14992b(str, (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T extends AbstractC2651H9> T m14261e(String str) {
        synchronized (this) {
            this.f21351a.mo14989b(str);
        }
        return this;
    }

    public AbstractC2651H9(InterfaceC3774z8 interfaceC3774z8, String str) {
        this.f21351a = interfaceC3774z8;
        this.f21352b = str;
    }

    /* renamed from: a */
    public int m14246a(String str, int i) {
        return this.f21351a.mo14982a(str, i);
    }

    /* renamed from: d */
    public Set<String> m14260d() {
        return this.f21351a.mo14986a();
    }

    /* renamed from: a */
    public String m14248a(String str, String str2) {
        return this.f21351a.mo14992b(str, str2);
    }

    /* renamed from: a */
    public boolean m14250a(String str, boolean z) {
        return this.f21351a.mo14994b(str, z);
    }

    /* renamed from: c */
    public void m14258c() {
        synchronized (this) {
            this.f21351a.mo14993b();
        }
    }

    /* renamed from: a */
    public List<String> m14249a(String str, List<String> list) {
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String strMo14992b = this.f21351a.mo14992b(str, (String) null);
        if (!TextUtils.isEmpty(strMo14992b)) {
            try {
                JSONArray jSONArray = new JSONArray(strMo14992b);
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
    /* renamed from: b */
    public <T extends AbstractC2651H9> T m14252b(String str, long j) {
        synchronized (this) {
            this.f21351a.mo14991b(str, j);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public <T extends AbstractC2651H9> T m14251b(String str, int i) {
        synchronized (this) {
            this.f21351a.mo14990b(str, i);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public <T extends AbstractC2651H9> T m14255b(String str, boolean z) {
        synchronized (this) {
            this.f21351a.mo14985a(str, z);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public <T extends AbstractC2651H9> T m14254b(String str, List<String> list) {
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
        this.f21351a.mo14984a(str, string);
        return this;
    }

    /* renamed from: b */
    public boolean m14256b(String str) {
        return this.f21351a.mo14988a(str);
    }
}
