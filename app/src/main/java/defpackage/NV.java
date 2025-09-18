package defpackage;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class NV extends SecureRandom {
    @Override // java.security.SecureRandom, java.util.Random
    public final synchronized void nextBytes(byte[] bArr) {
        AbstractC7287tn0.e();
        super.nextBytes(bArr);
    }
}
