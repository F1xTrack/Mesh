package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.oe */
/* loaded from: classes2.dex */
public abstract class AbstractC5348oe {

    /* renamed from: c */
    public static final String f32346c = "oe";

    /* renamed from: a */
    public final InterfaceC4467Ea f32347a;

    /* renamed from: b */
    public final String f32348b;

    public AbstractC5348oe(InterfaceC4467Ea interfaceC4467Ea, String str) {
        this.f32347a = interfaceC4467Ea;
        this.f32348b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T extends AbstractC5348oe> T m20866a(String str, float f) {
        synchronized (this) {
            this.f32347a.mo19343a(str, f);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC5348oe> T m20873b(String str, String str2) {
        synchronized (this) {
            this.f32347a.mo19345a(str, str2);
        }
        return this;
    }

    /* renamed from: c */
    public final C5373pe m20877c(String str) {
        return new C5373pe(str, this.f32348b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final <T extends AbstractC5348oe> T m20878d(String str) {
        synchronized (this) {
            this.f32347a.remove(str);
        }
        return this;
    }

    /* renamed from: c */
    public Set<String> mo20823c() {
        return this.f32347a.mo19347a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T extends AbstractC5348oe> T m20868a(String str, String[] strArr) {
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
        this.f32347a.mo19345a(str, string);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC5348oe> T m20872b(String str, long j) {
        synchronized (this) {
            this.f32347a.mo19344a(str, j);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC5348oe> T m20871b(String str, int i) {
        synchronized (this) {
            this.f32347a.mo19342a(i, str);
        }
        return this;
    }

    /* renamed from: a */
    public final <T extends AbstractC5348oe> T m20867a(String str, List<String> list) {
        return (T) m20868a(str, (String[]) list.toArray(new String[list.size()]));
    }

    /* renamed from: a */
    public final long m20865a(String str, long j) {
        return this.f32347a.getLong(str, j);
    }

    /* renamed from: a */
    public final int m20864a(String str, int i) {
        return this.f32347a.getInt(str, i);
    }

    /* renamed from: a */
    public final String m20869a(String str, String str2) {
        return this.f32347a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC5348oe> T m20874b(String str, boolean z) {
        synchronized (this) {
            this.f32347a.mo19346a(str, z);
        }
        return this;
    }

    /* renamed from: a */
    public final boolean m20870a(String str, boolean z) {
        return this.f32347a.getBoolean(str, z);
    }

    /* renamed from: b */
    public final void m20875b() {
        synchronized (this) {
            this.f32347a.mo19349b();
        }
    }

    /* renamed from: b */
    public final boolean m20876b(String str) {
        return this.f32347a.mo19348a(str);
    }
}
