package p000;

import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public abstract class GB1 {

    /* renamed from: a */
    public static final String[] f3632a = {"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"};

    /* renamed from: b */
    public static final String[] f3633b = {"TLS_RSA", "CBC", "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};

    /* renamed from: a */
    public static final void m2967a(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "event");
        InterfaceC11293uT0 interfaceC11293uT0M9298b = YQ1.m9298b(viewGroup);
        if (interfaceC11293uT0M9298b != null) {
            interfaceC11293uT0M9298b.mo6036a(viewGroup, motionEvent);
        }
    }

    /* renamed from: b */
    public static final void m2968b(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "event");
        InterfaceC11293uT0 interfaceC11293uT0M9298b = YQ1.m9298b(viewGroup);
        if (interfaceC11293uT0M9298b != null) {
            interfaceC11293uT0M9298b.mo6038c(viewGroup, motionEvent);
        }
    }

    /* renamed from: c */
    public static void m2969c(SSLSocket sSLSocket) {
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
