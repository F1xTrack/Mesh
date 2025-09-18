package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.re */
/* loaded from: classes2.dex */
public abstract class AbstractC3572re {

    /* renamed from: e */
    private static final C3754ye f24612e = new C3754ye("UNDEFINED_", null);

    /* renamed from: a */
    protected final String f24613a;

    /* renamed from: b */
    protected final SharedPreferences f24614b;

    /* renamed from: c */
    private final Map<String, Object> f24615c = new HashMap();

    /* renamed from: d */
    private boolean f24616d = false;

    public AbstractC3572re(Context context, String str) {
        this.f24613a = str;
        this.f24614b = m16686a(context);
        new C3754ye(f24612e.m17236b(), str);
    }

    /* renamed from: a */
    private SharedPreferences m16686a(Context context) {
        return C3323i.m16061a(context, mo16612d());
    }

    /* renamed from: b */
    public void m16690b() {
        synchronized (this) {
            m16687a();
            this.f24615c.clear();
            this.f24616d = false;
        }
    }

    /* renamed from: c */
    public String m16691c() {
        return this.f24613a;
    }

    /* renamed from: d */
    public abstract String mo16612d();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T extends AbstractC3572re> T m16692e() {
        synchronized (this) {
            this.f24616d = true;
            this.f24615c.clear();
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T extends AbstractC3572re> T m16689a(String str, Object obj) {
        synchronized (this) {
            if (obj != null) {
                try {
                    this.f24615c.put(str, obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T extends AbstractC3572re> T m16688a(String str) {
        synchronized (this) {
            this.f24615c.put(str, this);
        }
        return this;
    }

    /* renamed from: a */
    private void m16687a() {
        SharedPreferences.Editor editorEdit = this.f24614b.edit();
        if (this.f24616d) {
            editorEdit.clear();
            editorEdit.apply();
            return;
        }
        for (Map.Entry<String, Object> entry : this.f24615c.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == this) {
                editorEdit.remove(key);
            } else if (value instanceof String) {
                editorEdit.putString(key, (String) value);
            } else if (value instanceof Long) {
                editorEdit.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Integer) {
                editorEdit.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value != null) {
                throw new UnsupportedOperationException();
            }
        }
        editorEdit.apply();
    }
}
