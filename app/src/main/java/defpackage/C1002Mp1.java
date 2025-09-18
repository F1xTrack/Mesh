package defpackage;

import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: Mp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1002Mp1 implements HostnameVerifier {
    public final /* synthetic */ int a;
    public final /* synthetic */ URL b;

    public /* synthetic */ C1002Mp1(URL url, int i) {
        this.a = i;
        this.b = url;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        switch (this.a) {
            case 0:
                URL url = this.b;
                O90.f(url, "$this_createHostnameVerifier");
                return str.equals(url.getHost());
            default:
                URL url2 = this.b;
                O90.f(url2, "$this_createHostnameVerifier");
                return str.equals(url2.getHost());
        }
    }
}
