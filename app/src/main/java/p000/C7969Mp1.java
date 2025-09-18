package p000;

import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: Mp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C7969Mp1 implements HostnameVerifier {

    /* renamed from: a */
    public final /* synthetic */ int f7365a;

    /* renamed from: b */
    public final /* synthetic */ URL f7366b;

    public /* synthetic */ C7969Mp1(URL url, int i) {
        this.f7365a = i;
        this.f7366b = url;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        switch (this.f7365a) {
            case 0:
                URL url = this.f7366b;
                O90.m5968f(url, "$this_createHostnameVerifier");
                return str.equals(url.getHost());
            default:
                URL url2 = this.f7366b;
                O90.m5968f(url2, "$this_createHostnameVerifier");
                return str.equals(url2.getHost());
        }
    }
}
