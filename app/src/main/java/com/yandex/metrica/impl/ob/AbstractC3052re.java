package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.re, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3052re {
    private static final C3232ye e = new C3232ye("UNDEFINED_", null);
    protected final String a;
    protected final SharedPreferences b;
    private final Map<String, Object> c = new HashMap();
    private boolean d = false;

    public AbstractC3052re(Context context, String str) {
        this.a = str;
        this.b = a(context);
        new C3232ye(e.b(), str);
    }

    private SharedPreferences a(Context context) {
        return C2814i.a(context, d());
    }

    public void b() {
        synchronized (this) {
            a();
            this.c.clear();
            this.d = false;
        }
    }

    public String c() {
        return this.a;
    }

    public abstract String d();

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC3052re> T e() {
        synchronized (this) {
            this.d = true;
            this.c.clear();
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC3052re> T a(String str, Object obj) {
        synchronized (this) {
            if (obj != null) {
                try {
                    this.c.put(str, obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC3052re> T a(String str) {
        synchronized (this) {
            this.c.put(str, this);
        }
        return this;
    }

    private void a() {
        SharedPreferences.Editor editorEdit = this.b.edit();
        if (this.d) {
            editorEdit.clear();
            editorEdit.apply();
            return;
        }
        for (Map.Entry<String, Object> entry : this.c.entrySet()) {
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
