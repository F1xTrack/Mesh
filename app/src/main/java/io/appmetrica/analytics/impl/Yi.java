package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Yi implements Na {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public Yi(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.putAppEnvironmentValue(this.a, this.b);
    }
}
