package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.Sh */
/* loaded from: classes2.dex */
public abstract class AbstractC4809Sh {

    /* renamed from: a */
    protected final Context f30742a;

    /* renamed from: b */
    public final String f30743b;

    /* renamed from: c */
    public final String f30744c;

    public AbstractC4809Sh(Context context, String str, String str2) {
        this.f30742a = context;
        this.f30743b = str;
        this.f30744c = str2;
    }

    /* renamed from: a */
    public final Object m19817a() {
        int identifier = this.f30742a.getResources().getIdentifier(this.f30743b, this.f30744c, this.f30742a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return mo19818a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public abstract Object mo19818a(int i);
}
