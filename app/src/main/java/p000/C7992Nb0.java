package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: Nb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7992Nb0 extends C10745qB0 {

    /* renamed from: c */
    public static final boolean f7896c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numM979f = property != null ? C51.m979f(property) : null;
        boolean z = false;
        if (numM979f == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numM979f.intValue() >= 9) {
            z = true;
        }
        f7896c = z;
    }

    @Override // p000.C10745qB0
    /* renamed from: d */
    public final void mo5408d(SSLSocket sSLSocket, String str, List list) {
        O90.m5968f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC9219eG0) obj) != EnumC9219eG0.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC9219eG0) it.next()).f26631a);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // p000.C10745qB0
    /* renamed from: f */
    public final String mo5409f(SSLSocket sSLSocket) {
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
