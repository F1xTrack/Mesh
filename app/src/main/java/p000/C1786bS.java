package p000;

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

/* renamed from: bS */
/* loaded from: classes2.dex */
public final class C1786bS extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f17027e;

    /* renamed from: f */
    public final /* synthetic */ C1848cS f17028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1786bS(C1848cS c1848cS, int i) {
        super(0);
        this.f17027e = i;
        this.f17028f = c1848cS;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() throws Resources.NotFoundException, NoSuchAlgorithmException, KeyManagementException {
        int i = 24;
        int i2 = 23;
        boolean z = false;
        int i3 = 15;
        int i4 = 25;
        C1848cS c1848cS = this.f17028f;
        switch (this.f17027e) {
            case 0:
                Context context = c1848cS.f17490K;
                O90.m5968f(context, "context");
                List listM26275f = AbstractC7230yu.m26275f(Integer.valueOf(R.raw.remote_config_rustore_ru), Integer.valueOf(R.raw.global_sign_rsa_ov_ssl_ca_2018), Integer.valueOf(R.raw.global_sing));
                ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listM26275f));
                Iterator it = listM26275f.iterator();
                while (it.hasNext()) {
                    InputStream inputStreamOpenRawResource = context.getResources().openRawResource(((Number) it.next()).intValue());
                    try {
                        O90.m5967e(inputStreamOpenRawResource, "stream");
                        String strM25640d = AbstractC11551wU1.m25640d(new InputStreamReader(inputStreamOpenRawResource, AbstractC7038vr.f44561a));
                        AbstractC8729aT1.m9749a(inputStreamOpenRawResource, null);
                        arrayList.add(strM25640d);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC8729aT1.m9749a(inputStreamOpenRawResource, th);
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
                List list = (List) c1848cS.f17492M.getValue();
                O90.m5968f(list, "signedCertificates");
                return Build.VERSION.SDK_INT >= 24 ? new C10456nw1(list) : new C11683xX0(list);
            case 2:
                return new C7721Hv1(c1848cS.f17493a);
            case 3:
                return new C8021Np1((C10698pp1) c1848cS.f17480A.getValue());
            case 4:
                YZ1 yz1 = c1848cS.f17496d;
                if (yz1 instanceof C8367Ug1) {
                    return new C10539oa0();
                }
                boolean z2 = yz1 instanceof C8419Vg1;
                YZ1 yz12 = c1848cS.f17496d;
                F71 f71 = c1848cS.f17509q;
                F71 f712 = c1848cS.f17487H;
                F71 f713 = c1848cS.f17515w;
                F71 f714 = c1848cS.f17481B;
                if (z2) {
                    return new C11980zs1((C8021Np1) f714.getValue(), (C7661Gr1) f713.getValue(), (C9302ev1) f712.getValue(), (C10228m81) f71.getValue(), ((C8419Vg1) yz12).f12687a);
                }
                if (yz1 instanceof C8471Wg1) {
                    return new C11980zs1((C8021Np1) f714.getValue(), (C7661Gr1) f713.getValue(), (C9302ev1) f712.getValue(), (C10228m81) f71.getValue(), ((C8471Wg1) yz12).f13317a);
                }
                throw new C6838sg();
            case 5:
                return new C7927Lu1(new C1339VH(new C8262Sg0(c1848cS.f17493a, "ACTUAL_CONFIG_CACHE_DIR"), new C10525oT0(new C7460Cv0(i3)), z, i4), (C7797Jh1) c1848cS.f17513u.getValue(), new C7616Fv0(i2), new C7616Fv0(i));
            case 6:
                return new C7827Jw1((C9172du1) c1848cS.f17484E.getValue(), new C7564Ev0(i4));
            case 7:
                return new M40(c1848cS.f17498f);
            case 8:
                return new C8132Pt0((C7927Lu1) c1848cS.f17516x.getValue());
            case 9:
                return new C7930Lw0((C7827Jw1) c1848cS.f17488I.getValue());
            case 10:
                return new C11357uz0((C7878Kw0) c1848cS.f17517y.getValue());
            case 11:
                Context context2 = c1848cS.f17493a;
                O90.m5968f(context2, "context");
                return C10314mp1.f37956c.m1942j(context2).f37959b;
            case 12:
                OL0 ol0 = new OL0(i2);
                String str = c1848cS.f17494b;
                C7411Bw1 c7411Bw1 = (C7411Bw1) c1848cS.f17511s.getValue();
                SSLSocketFactory sSLSocketFactory = (SSLSocketFactory) c1848cS.f17512t.getValue();
                C4218i3 c4218i3 = c1848cS.f17495c;
                InterfaceC0689Kw interfaceC0689Kw = c1848cS.f17497e;
                O90.m5968f(str, "appId");
                O90.m5968f(c7411Bw1, "remoteConfigEndpointProvider");
                O90.m5968f(sSLSocketFactory, "internalSsLSocketFactory");
                C8128Pr0 c8128Pr0 = new C8128Pr0();
                c8128Pr0.f9303a = str;
                c8128Pr0.f9304b = c4218i3;
                c8128Pr0.f9305c = interfaceC0689Kw;
                c8128Pr0.f9306d = c7411Bw1;
                c8128Pr0.f9307e = sSLSocketFactory;
                c8128Pr0.f9308f = AbstractC0705LB.m4915b(new S51(4, c8128Pr0));
                return new C7797Jh1(ol0, c8128Pr0);
            case 13:
                return new C7661Gr1((C7797Jh1) c1848cS.f17513u.getValue(), (C11722xq1) c1848cS.f17514v.getValue(), new C7616Fv0(i2));
            case 14:
                return new C9302ev1((C9172du1) c1848cS.f17484E.getValue(), (C10698pp1) c1848cS.f17480A.getValue(), (C8395Uu1) c1848cS.f17482C.getValue(), (C7823Ju1) c1848cS.f17486G.getValue());
            case 15:
                return new C9172du1((C8262Sg0) c1848cS.f17483D.getValue(), new C9937jt0(i4, new C7460Cv0(i3)));
            case 16:
                return new C8262Sg0(c1848cS.f17493a, "PERSISTABLE_CONFIG_CACHE_DIR");
            case 17:
                return new C8657Zv1((C11607ww1) c1848cS.f17502j.getValue(), (C7567Ew1) c1848cS.f17503k.getValue());
            case 18:
                return new C11607ww1(new C7408Bv0(i4), (C8232Rr0) c1848cS.f17501i.getValue());
            case 19:
                return new C10519oQ0((InterfaceC11861yw1) c1848cS.f17506n.getValue());
            case 20:
                YZ1 yz13 = c1848cS.f17496d;
                boolean z3 = yz13 instanceof C8367Ug1;
                F71 f715 = c1848cS.f17504l;
                F71 f716 = c1848cS.f17505m;
                F71 f717 = c1848cS.f17507o;
                F71 f718 = c1848cS.f17518z;
                if (z3) {
                    return new C7773Iv1((C7721Hv1) f718.getValue(), (C8132Pt0) c1848cS.f17508p.getValue(), (InterfaceC10775qQ0) f717.getValue(), (C8657Zv1) f716.getValue(), (C0802Mk) f715.getValue());
                }
                boolean z4 = yz13 instanceof C8419Vg1;
                F71 f719 = c1848cS.f17500h;
                if (z4) {
                    return new C0904OM((C7721Hv1) f718.getValue(), (InterfaceC7713Hr1) f719.getValue(), (C0802Mk) f715.getValue(), (C7930Lw0) c1848cS.f17489J.getValue(), (InterfaceC10775qQ0) f717.getValue(), (C8657Zv1) f716.getValue());
                }
                if (yz13 instanceof C8471Wg1) {
                    return new C0904OM((C7721Hv1) f718.getValue(), (InterfaceC7713Hr1) f719.getValue(), (InterfaceC10775qQ0) f717.getValue(), (C11357uz0) c1848cS.f17510r.getValue(), (C0802Mk) f715.getValue(), (C8657Zv1) f716.getValue());
                }
                throw new C6838sg();
            case 21:
                X509TrustManager x509TrustManager = (X509TrustManager) c1848cS.f17491L.getValue();
                O90.m5968f(x509TrustManager, "trustManager");
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                sSLContext.init(null, new X509TrustManager[]{x509TrustManager}, null);
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                O90.m5967e(socketFactory, "getInstance(\"TLSv1.2\")\n …           .socketFactory");
                return socketFactory;
            case 22:
                OL0 ol02 = new OL0(i4);
                c1848cS.getClass();
                return new C7567Ew1(ol02, new NV1(i4), new C11370v32(i4));
            case 23:
                return new C0802Mk(new C8170Qm0(i3, new C6222jC()), new C8170Qm0(new C4151h(c1848cS.f17493a, 0), new C7460Cv0(i3)));
            default:
                return new C7878Kw0((C8210Rg0) c1848cS.f17485F.getValue(), (C9172du1) c1848cS.f17484E.getValue(), new S20(17));
        }
    }
}
