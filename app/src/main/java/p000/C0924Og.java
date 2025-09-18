package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: Og */
/* loaded from: classes2.dex */
public final class C0924Og extends AbstractC11164tS1 {

    /* renamed from: a */
    public final InterfaceC9650hd1 f8560a;

    public C0924Og(InterfaceC9650hd1 interfaceC9650hd1) {
        O90.m5968f(interfaceC9650hd1, "trustRootIndex");
        this.f8560a = interfaceC9650hd1;
    }

    @Override // p000.AbstractC11164tS1
    /* renamed from: a */
    public final List mo6097a(String str, List list) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException, SSLPeerUnverifiedException {
        O90.m5968f(list, "chain");
        O90.m5968f(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        O90.m5967e(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            O90.m5966d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo7085a = this.f8560a.mo7085a(x509Certificate);
            if (x509CertificateMo7085a == null) {
                Iterator it = arrayDeque.iterator();
                O90.m5967e(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    O90.m5966d(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (O90.m5963a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo7085a)) {
                arrayList.add(x509CertificateMo7085a);
            }
            if (O90.m5963a(x509CertificateMo7085a.getIssuerDN(), x509CertificateMo7085a.getSubjectDN())) {
                try {
                    x509CertificateMo7085a.verify(x509CertificateMo7085a.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0924Og) && O90.m5963a(((C0924Og) obj).f8560a, this.f8560a);
    }

    public final int hashCode() {
        return this.f8560a.hashCode();
    }
}
