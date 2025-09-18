package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import ru.mes.dnevnik.R;

/* renamed from: bS, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2327bS extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C2517cS f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2327bS(C2517cS c2517cS, int i) {
        super(0);
        this.e = i;
        this.f = c2517cS;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() throws Resources.NotFoundException, NoSuchAlgorithmException, KeyManagementException {
        int i = 24;
        int i2 = 23;
        boolean z = false;
        int i3 = 15;
        int i4 = 25;
        C2517cS c2517cS = this.f;
        switch (this.e) {
            case 0:
                Context context = c2517cS.K;
                O90.f(context, "context");
                List listF = AbstractC8259yu.f(Integer.valueOf(R.raw.remote_config_rustore_ru), Integer.valueOf(R.raw.global_sign_rsa_ov_ssl_ca_2018), Integer.valueOf(R.raw.global_sing));
                ArrayList arrayList = new ArrayList(AbstractC8449zu.k(listF));
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    InputStream inputStreamOpenRawResource = context.getResources().openRawResource(((Number) it.next()).intValue());
                    try {
                        O90.e(inputStreamOpenRawResource, "stream");
                        String strD = AbstractC7803wU1.d(new InputStreamReader(inputStreamOpenRawResource, AbstractC7680vr.a));
                        AbstractC2141aT1.a(inputStreamOpenRawResource, null);
                        arrayList.add(strD);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC2141aT1.a(inputStreamOpenRawResource, th);
                            throw th2;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((String) next).length() > 0) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            case 1:
                List list = (List) c2517cS.M.getValue();
                O90.f(list, "signedCertificates");
                return Build.VERSION.SDK_INT >= 24 ? new C6170nw1(list) : new C8001xX0(list);
            case 2:
                return new C0631Hv1(c2517cS.a);
            case 3:
                return new C1080Np1((C6531pp1) c2517cS.A.getValue());
            case 4:
                YZ1 yz1 = c2517cS.d;
                if (yz1 instanceof C1599Ug1) {
                    return new C6294oa0();
                }
                boolean z2 = yz1 instanceof C1677Vg1;
                YZ1 yz12 = c2517cS.d;
                F71 f71 = c2517cS.q;
                F71 f712 = c2517cS.H;
                F71 f713 = c2517cS.w;
                F71 f714 = c2517cS.B;
                if (z2) {
                    return new C8445zs1((C1080Np1) f714.getValue(), (C0541Gr1) f713.getValue(), (C3672ev1) f712.getValue(), (C5829m81) f71.getValue(), ((C1677Vg1) yz12).a);
                }
                if (yz1 instanceof C1755Wg1) {
                    return new C8445zs1((C1080Np1) f714.getValue(), (C0541Gr1) f713.getValue(), (C3672ev1) f712.getValue(), (C5829m81) f71.getValue(), ((C1755Wg1) yz12).a);
                }
                throw new C7074sg();
            case 5:
                return new C0939Lu1(new VH(new C1442Sg0(c2517cS.a, "ACTUAL_CONFIG_CACHE_DIR"), new C6273oT0(new C0240Cv0(i3)), z, i4), (C0745Jh1) c2517cS.u.getValue(), new C0474Fv0(i2), new C0474Fv0(i));
            case 6:
                return new C0790Jw1((C3478du1) c2517cS.E.getValue(), new C0396Ev0(i4));
            case 7:
                return new M40(c2517cS.f);
            case 8:
                return new C1247Pt0((C0939Lu1) c2517cS.x.getValue());
            case 9:
                return new C0944Lw0((C0790Jw1) c2517cS.I.getValue());
            case 10:
                return new C7514uz0((C0867Kw0) c2517cS.y.getValue());
            case 11:
                Context context2 = c2517cS.a;
                O90.f(context2, "context");
                return C5958mp1.c.j(context2).b;
            case 12:
                OL0 ol0 = new OL0(i2);
                String str = c2517cS.b;
                C0166Bw1 c0166Bw1 = (C0166Bw1) c2517cS.s.getValue();
                SSLSocketFactory sSLSocketFactory = (SSLSocketFactory) c2517cS.t.getValue();
                C4271i3 c4271i3 = c2517cS.c;
                InterfaceC0866Kw interfaceC0866Kw = c2517cS.e;
                O90.f(str, "appId");
                O90.f(c0166Bw1, "remoteConfigEndpointProvider");
                O90.f(sSLSocketFactory, "internalSsLSocketFactory");
                C1241Pr0 c1241Pr0 = new C1241Pr0();
                c1241Pr0.a = str;
                c1241Pr0.b = c4271i3;
                c1241Pr0.c = interfaceC0866Kw;
                c1241Pr0.d = c0166Bw1;
                c1241Pr0.e = sSLSocketFactory;
                c1241Pr0.f = LB.b(new S51(4, c1241Pr0));
                return new C0745Jh1(ol0, c1241Pr0);
            case 13:
                return new C0541Gr1((C0745Jh1) c2517cS.u.getValue(), (C8059xq1) c2517cS.v.getValue(), new C0474Fv0(i2));
            case 14:
                return new C3672ev1((C3478du1) c2517cS.E.getValue(), (C6531pp1) c2517cS.A.getValue(), (C1641Uu1) c2517cS.C.getValue(), (C0784Ju1) c2517cS.G.getValue());
            case 15:
                return new C3478du1((C1442Sg0) c2517cS.D.getValue(), new C5396jt0(i4, new C0240Cv0(i3)));
            case 16:
                return new C1442Sg0(c2517cS.a, "PERSISTABLE_CONFIG_CACHE_DIR");
            case 17:
                return new C2034Zv1((C7887ww1) c2517cS.j.getValue(), (C0400Ew1) c2517cS.k.getValue());
            case 18:
                return new C7887ww1(new C0162Bv0(i4), (C1397Rr0) c2517cS.i.getValue());
            case 19:
                return new C6264oQ0((InterfaceC8267yw1) c2517cS.n.getValue());
            case 20:
                YZ1 yz13 = c2517cS.d;
                boolean z3 = yz13 instanceof C1599Ug1;
                F71 f715 = c2517cS.l;
                F71 f716 = c2517cS.m;
                F71 f717 = c2517cS.o;
                F71 f718 = c2517cS.z;
                if (z3) {
                    return new C0709Iv1((C0631Hv1) f718.getValue(), (C1247Pt0) c2517cS.p.getValue(), (InterfaceC6646qQ0) f717.getValue(), (C2034Zv1) f716.getValue(), (C0985Mk) f715.getValue());
                }
                boolean z4 = yz13 instanceof C1677Vg1;
                F71 f719 = c2517cS.h;
                if (z4) {
                    return new OM((C0631Hv1) f718.getValue(), (InterfaceC0619Hr1) f719.getValue(), (C0985Mk) f715.getValue(), (C0944Lw0) c2517cS.J.getValue(), (InterfaceC6646qQ0) f717.getValue(), (C2034Zv1) f716.getValue());
                }
                if (yz13 instanceof C1755Wg1) {
                    return new OM((C0631Hv1) f718.getValue(), (InterfaceC0619Hr1) f719.getValue(), (InterfaceC6646qQ0) f717.getValue(), (C7514uz0) c2517cS.r.getValue(), (C0985Mk) f715.getValue(), (C2034Zv1) f716.getValue());
                }
                throw new C7074sg();
            case 21:
                X509TrustManager x509TrustManager = (X509TrustManager) c2517cS.L.getValue();
                O90.f(x509TrustManager, "trustManager");
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                sSLContext.init(null, new X509TrustManager[]{x509TrustManager}, null);
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                O90.e(socketFactory, "getInstance(\"TLSv1.2\")\n …           .socketFactory");
                return socketFactory;
            case 22:
                OL0 ol02 = new OL0(i4);
                c2517cS.getClass();
                return new C0400Ew1(ol02, new NV1(i4), new C7532v32(i4));
            case 23:
                return new C0985Mk(new C1304Qm0(i3, new C5266jC()), new C1304Qm0(new C4067h(c2517cS.a, 0), new C0240Cv0(i3)));
            default:
                return new C0867Kw0((C1364Rg0) c2517cS.F.getValue(), (C3478du1) c2517cS.E.getValue(), new S20(17));
        }
    }
}
