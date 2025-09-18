package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2991p2<T> {
    protected final Context a;
    private final String b;
    private final String c;

    public AbstractC2991p2(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    public T a() {
        int identifier = this.a.getResources().getIdentifier(this.b, this.c, this.a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract T a(int i);
}
