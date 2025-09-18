package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: Nb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1037Nb0 extends C6601qB0 {
    public static final boolean c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numF = property != null ? C51.f(property) : null;
        boolean z = false;
        if (numF == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numF.intValue() >= 9) {
            z = true;
        }
        c = z;
    }

    @Override // defpackage.C6601qB0
    public final void d(SSLSocket sSLSocket, String str, List list) {
        O90.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC3548eG0) obj) != EnumC3548eG0.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC3548eG0) it.next()).a);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // defpackage.C6601qB0
    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
