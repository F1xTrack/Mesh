package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.dd */
/* loaded from: classes2.dex */
public abstract class AbstractC4502dd implements InterfaceC4437an, InterfaceC4635j2 {
    public final String a;
    public final int b;
    public final on c;
    public final R2 d;
    public PublicLogger e = PublicLogger.getAnonymousInstance();

    public AbstractC4502dd(int i, String str, on onVar, R2 r2) {
        this.b = i;
        this.a = str;
        this.c = onVar;
        this.d = r2;
    }

    public final C4462bn a() {
        C4462bn c4462bn = new C4462bn();
        c4462bn.b = this.b;
        c4462bn.a = this.a.getBytes();
        c4462bn.d = new C4512dn();
        c4462bn.c = new C4487cn();
        return c4462bn;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4437an
    public abstract /* synthetic */ void a(Zm zm);

    public final R2 b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final on d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f() {
        mn mnVarA = this.c.a(this.a);
        if (mnVarA.a) {
            return true;
        }
        this.e.warning("Attribute " + this.a + " of type " + ((String) Km.a.get(this.b)) + " is skipped because " + mnVarA.b, new Object[0]);
        return false;
    }

    public final void a(PublicLogger publicLogger) {
        this.e = publicLogger;
    }
}
