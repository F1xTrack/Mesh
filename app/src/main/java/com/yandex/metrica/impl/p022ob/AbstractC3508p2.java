package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.p2 */
/* loaded from: classes2.dex */
public abstract class AbstractC3508p2<T> {

    /* renamed from: a */
    protected final Context f24404a;

    /* renamed from: b */
    private final String f24405b;

    /* renamed from: c */
    private final String f24406c;

    public AbstractC3508p2(Context context, String str, String str2) {
        this.f24404a = context;
        this.f24405b = str;
        this.f24406c = str2;
    }

    /* renamed from: a */
    public T m16553a() {
        int identifier = this.f24404a.getResources().getIdentifier(this.f24405b, this.f24406c, this.f24404a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return mo14634a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public abstract T mo14634a(int i);
}
