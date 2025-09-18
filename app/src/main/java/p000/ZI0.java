package p000;

import java.security.interfaces.RSAPublicKey;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ZI0 extends AbstractC10900rO1 {

    /* renamed from: c */
    public static final Set f14847c;

    /* renamed from: a */
    public final C9196e41 f14848a;

    /* renamed from: b */
    public final RSAPublicKey f14849b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(C7938Ma0.f7233f);
        linkedHashSet.add(C7938Ma0.f7234g);
        linkedHashSet.add(C7938Ma0.f7235h);
        linkedHashSet.add(C7938Ma0.f7240m);
        linkedHashSet.add(C7938Ma0.f7241n);
        linkedHashSet.add(C7938Ma0.f7242o);
        f14847c = Collections.unmodifiableSet(linkedHashSet);
    }

    public ZI0(RSAPublicKey rSAPublicKey) {
        Set set = f14847c;
        if (set == null) {
            throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
        }
        Collections.unmodifiableSet(set);
        C9196e41 c9196e41 = new C9196e41(10, false);
        c9196e41.f26532b = Collections.emptySet();
        this.f14848a = c9196e41;
        this.f14849b = rSAPublicKey;
        c9196e41.f26532b = Collections.emptySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[PHI: r3
  0x0090: PHI (r3v7 java.security.Signature) = (r3v4 java.security.Signature), (r3v6 java.security.Signature), (r3v9 java.security.Signature) binds: [B:53:0x00ea, B:43:0x00bd, B:33:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m9521b(p000.C7990Na0 r12, byte[] r13, p000.C0734Lf r14) throws p000.C11179ta0, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ZI0.m9521b(Na0, byte[], Lf):boolean");
    }
}
