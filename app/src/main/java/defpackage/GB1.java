package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public abstract class GB1 {
    public static final String[] a = {"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"};
    public static final String[] b = {"TLS_RSA", "CBC", "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};

    public static final void a(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.f(motionEvent, "event");
        InterfaceC7418uT0 interfaceC7418uT0B = YQ1.b(viewGroup);
        if (interfaceC7418uT0B != null) {
            interfaceC7418uT0B.a(viewGroup, motionEvent);
        }
    }

    public static final void b(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.f(motionEvent, "event");
        InterfaceC7418uT0 interfaceC7418uT0B = YQ1.b(viewGroup);
        if (interfaceC7418uT0B != null) {
            interfaceC7418uT0B.c(viewGroup, motionEvent);
        }
    }

    public static void c(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            sSLSocket.setEnabledProtocols(new String[]{"TLSv1.3", "TLSv1.2"});
        }
        if (i < 29) {
            sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
        }
    }
}
