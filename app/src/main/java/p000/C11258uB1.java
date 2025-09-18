package p000;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: uB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11258uB1 extends AbstractC11892zA1 implements Serializable {

    /* renamed from: a */
    public final MessageDigest f43583a;

    /* renamed from: b */
    public final int f43584b;

    /* renamed from: c */
    public final boolean f43585c;

    /* renamed from: d */
    public final String f43586d;

    public C11258uB1() throws NoSuchAlgorithmException, CloneNotSupportedException {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f43583a = messageDigest;
            this.f43584b = messageDigest.getDigestLength();
            this.f43586d = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.f43585c = z;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        return this.f43586d;
    }
}
