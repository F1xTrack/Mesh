package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: Nu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1094Nu0 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1094Nu0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                C1172Ou0 c1172Ou0 = (C1172Ou0) this.b;
                c1172Ou0.k = network;
                c1172Ou0.f(250);
                break;
            case 1:
            default:
                super.onAvailable(network);
                break;
            case 2:
                AbstractC0121Bh1.f().post(new U8(this, true, 2));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                C1172Ou0 c1172Ou0 = (C1172Ou0) obj;
                c1172Ou0.k = network;
                c1172Ou0.l = networkCapabilities;
                c1172Ou0.g();
                break;
            case 1:
                O90.f(network, "network");
                O90.f(networkCapabilities, "capabilities");
                TE teG = TE.G();
                int i = AbstractC3480dv0.a;
                networkCapabilities.toString();
                teG.getClass();
                C3290cv0 c3290cv0 = (C3290cv0) obj;
                c3290cv0.i(AbstractC3480dv0.a(c3290cv0.f));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.a) {
            case 0:
                C1172Ou0 c1172Ou0 = (C1172Ou0) this.b;
                if (c1172Ou0.k != null) {
                    c1172Ou0.k = network;
                }
                c1172Ou0.f(250);
                break;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLosing(Network network, int i) {
        switch (this.a) {
            case 0:
                C1172Ou0 c1172Ou0 = (C1172Ou0) this.b;
                c1172Ou0.k = network;
                c1172Ou0.g();
                break;
            default:
                super.onLosing(network, i);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                C1172Ou0 c1172Ou0 = (C1172Ou0) obj;
                c1172Ou0.k = null;
                c1172Ou0.l = null;
                c1172Ou0.g();
                break;
            case 1:
                O90.f(network, "network");
                TE teG = TE.G();
                int i = AbstractC3480dv0.a;
                teG.getClass();
                C3290cv0 c3290cv0 = (C3290cv0) obj;
                c3290cv0.i(AbstractC3480dv0.a(c3290cv0.f));
                break;
            default:
                AbstractC0121Bh1.f().post(new U8(this, false, 2));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.a) {
            case 0:
                C1172Ou0 c1172Ou0 = (C1172Ou0) this.b;
                c1172Ou0.k = null;
                c1172Ou0.l = null;
                c1172Ou0.g();
                break;
            default:
                super.onUnavailable();
                break;
        }
    }
}
