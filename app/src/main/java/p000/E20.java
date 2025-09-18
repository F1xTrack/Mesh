package p000;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class E20 {

    /* renamed from: a */
    public final EnumC8043Oa1 f2357a;

    /* renamed from: b */
    public final C4080fs f2358b;

    /* renamed from: c */
    public final List f2359c;

    /* renamed from: d */
    public final F71 f2360d;

    public E20(EnumC8043Oa1 enumC8043Oa1, C4080fs c4080fs, List list, InterfaceC6434mZ interfaceC6434mZ) {
        this.f2357a = enumC8043Oa1;
        this.f2358b = c4080fs;
        this.f2359c = list;
        this.f2360d = AbstractC0705LB.m4915b(new C1026QI(1, interfaceC6434mZ));
    }

    /* renamed from: a */
    public final List m1987a() {
        return (List) this.f2360d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E20) {
            E20 e20 = (E20) obj;
            if (e20.f2357a == this.f2357a && O90.m5963a(e20.f2358b, this.f2358b) && O90.m5963a(e20.m1987a(), m1987a()) && O90.m5963a(e20.f2359c, this.f2359c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2359c.hashCode() + ((m1987a().hashCode() + ((this.f2358b.hashCode() + ((this.f2357a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM1987a = m1987a();
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listM1987a));
        for (Certificate certificate : listM1987a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                O90.m5967e(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f2357a);
        sb.append(" cipherSuite=");
        sb.append(this.f2358b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f2359c;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                O90.m5967e(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
