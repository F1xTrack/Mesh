package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* loaded from: classes2.dex */
public final class j extends Authenticator {
    public final String a;
    public final String b;

    public j(String str, String str2) {
        io.sentry.config.a.D(str, "user is required");
        this.a = str;
        io.sentry.config.a.D(str2, "password is required");
        this.b = str2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.a, this.b.toCharArray());
    }
}
