package p000;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: FU */
/* loaded from: classes.dex */
public final class C0346FU {

    /* renamed from: a */
    public final Signature f3274a;

    /* renamed from: b */
    public final Cipher f3275b;

    /* renamed from: c */
    public final Mac f3276c;

    public C0346FU(Signature signature) {
        this.f3274a = signature;
        this.f3275b = null;
        this.f3276c = null;
    }

    public C0346FU(Cipher cipher) {
        this.f3275b = cipher;
        this.f3274a = null;
        this.f3276c = null;
    }

    public C0346FU(Mac mac) {
        this.f3276c = mac;
        this.f3275b = null;
        this.f3274a = null;
    }
}
