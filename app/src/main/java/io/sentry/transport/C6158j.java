package io.sentry.transport;

import io.sentry.config.AbstractC6003a;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* renamed from: io.sentry.transport.j */
/* loaded from: classes2.dex */
public final class C6158j extends Authenticator {

    /* renamed from: a */
    public final String f34642a;

    /* renamed from: b */
    public final String f34643b;

    public C6158j(String str, String str2) {
        AbstractC6003a.m21735D(str, "user is required");
        this.f34642a = str;
        AbstractC6003a.m21735D(str2, "password is required");
        this.f34643b = str2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.f34642a, this.f34643b.toCharArray());
    }
}
