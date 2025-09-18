package p000;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: Nu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8030Nu0 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ int f8124a;

    /* renamed from: b */
    public final /* synthetic */ Object f8125b;

    public /* synthetic */ C8030Nu0(int i, Object obj) {
        this.f8124a = i;
        this.f8125b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f8124a) {
            case 0:
                C8082Ou0 c8082Ou0 = (C8082Ou0) this.f8125b;
                c8082Ou0.f8667k = network;
                c8082Ou0.m6182f(250);
                break;
            case 1:
            default:
                super.onAvailable(network);
                break;
            case 2:
                AbstractC7381Bh1.m807f().post(new RunnableC1267U8(this, true, 2));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Object obj = this.f8125b;
        switch (this.f8124a) {
            case 0:
                C8082Ou0 c8082Ou0 = (C8082Ou0) obj;
                c8082Ou0.f8667k = network;
                c8082Ou0.f8668l = networkCapabilities;
                c8082Ou0.m6183g();
                break;
            case 1:
                O90.m5968f(network, "network");
                O90.m5968f(networkCapabilities, "capabilities");
                C1210TE c1210teM7634G = C1210TE.m7634G();
                int i = AbstractC9173dv0.f26389a;
                networkCapabilities.toString();
                c1210teM7634G.getClass();
                C9045cv0 c9045cv0 = (C9045cv0) obj;
                c9045cv0.m9649i(AbstractC9173dv0.m17776a(c9045cv0.f25720f));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.f8124a) {
            case 0:
                C8082Ou0 c8082Ou0 = (C8082Ou0) this.f8125b;
                if (c8082Ou0.f8667k != null) {
                    c8082Ou0.f8667k = network;
                }
                c8082Ou0.m6182f(250);
                break;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLosing(Network network, int i) {
        switch (this.f8124a) {
            case 0:
                C8082Ou0 c8082Ou0 = (C8082Ou0) this.f8125b;
                c8082Ou0.f8667k = network;
                c8082Ou0.m6183g();
                break;
            default:
                super.onLosing(network, i);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Object obj = this.f8125b;
        switch (this.f8124a) {
            case 0:
                C8082Ou0 c8082Ou0 = (C8082Ou0) obj;
                c8082Ou0.f8667k = null;
                c8082Ou0.f8668l = null;
                c8082Ou0.m6183g();
                break;
            case 1:
                O90.m5968f(network, "network");
                C1210TE c1210teM7634G = C1210TE.m7634G();
                int i = AbstractC9173dv0.f26389a;
                c1210teM7634G.getClass();
                C9045cv0 c9045cv0 = (C9045cv0) obj;
                c9045cv0.m9649i(AbstractC9173dv0.m17776a(c9045cv0.f25720f));
                break;
            default:
                AbstractC7381Bh1.m807f().post(new RunnableC1267U8(this, false, 2));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.f8124a) {
            case 0:
                C8082Ou0 c8082Ou0 = (C8082Ou0) this.f8125b;
                c8082Ou0.f8667k = null;
                c8082Ou0.f8668l = null;
                c8082Ou0.m6183g();
                break;
            default:
                super.onUnavailable();
                break;
        }
    }
}
