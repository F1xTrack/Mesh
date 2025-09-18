package defpackage;

import java.security.interfaces.RSAPublicKey;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ZI0 extends AbstractC6831rO1 {
    public static final Set c;
    public final C3513e41 a;
    public final RSAPublicKey b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(C0956Ma0.f);
        linkedHashSet.add(C0956Ma0.g);
        linkedHashSet.add(C0956Ma0.h);
        linkedHashSet.add(C0956Ma0.m);
        linkedHashSet.add(C0956Ma0.n);
        linkedHashSet.add(C0956Ma0.o);
        c = Collections.unmodifiableSet(linkedHashSet);
    }

    public ZI0(RSAPublicKey rSAPublicKey) {
        Set set = c;
        if (set == null) {
            throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
        }
        Collections.unmodifiableSet(set);
        C3513e41 c3513e41 = new C3513e41(10, false);
        c3513e41.b = Collections.emptySet();
        this.a = c3513e41;
        this.b = rSAPublicKey;
        c3513e41.b = Collections.emptySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[PHI: r3
  0x0090: PHI (r3v7 java.security.Signature) = (r3v4 java.security.Signature), (r3v6 java.security.Signature), (r3v9 java.security.Signature) binds: [B:53:0x00ea, B:43:0x00bd, B:33:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.C1034Na0 r12, byte[] r13, defpackage.C0893Lf r14) throws defpackage.C7248ta0, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ZI0.b(Na0, byte[], Lf):boolean");
    }
}
