package p000;

import android.app.Application;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.p019vk.push.common.AppInfo;
import com.p019vk.push.common.Logger;
import com.p019vk.push.common.ads.PushAdsProvider;
import com.p019vk.push.common.clientid.ClientIdCallback;
import com.p019vk.push.core.ipc.RuStore;
import com.p019vk.push.core.remote.config.omicron.OmicronEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fN */
/* loaded from: classes.dex */
public class C4049fN implements InterfaceC0935Or, InterfaceC0236Dk, InterfaceC8398Uw0, InterfaceC7266zT, OmicronEnvironment, InterfaceC9129dZ0, GZ0, InterfaceC8088Ox0, InterfaceC10378nJ1 {

    /* renamed from: f */
    public static volatile boolean f27161f;

    /* renamed from: a */
    public final /* synthetic */ int f27164a;

    /* renamed from: b */
    public static final C4049fN f27157b = new C4049fN(1);

    /* renamed from: c */
    public static final C4049fN f27158c = new C4049fN(2);

    /* renamed from: d */
    public static final C4049fN f27159d = new C4049fN(3);

    /* renamed from: e */
    public static final C4049fN f27160e = new C4049fN(4);

    /* renamed from: g */
    public static final C4049fN f27162g = new C4049fN(6);

    /* renamed from: h */
    public static final C4049fN f27163h = new C4049fN(7);

    public /* synthetic */ C4049fN(int i) {
        this.f27164a = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: m */
    public static EnumC8373Uj1 m18223m(String str) throws C6640po {
        if (str != null) {
            switch (str.hashCode()) {
                case -1348796151:
                    if (str.equals("cinematic-extended")) {
                        return EnumC8373Uj1.f12011f;
                    }
                    break;
                case 109935:
                    if (str.equals("off")) {
                        return EnumC8373Uj1.f12008c;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return EnumC8373Uj1.f12008c;
                    }
                    break;
                case 1312628413:
                    if (str.equals("standard")) {
                        return EnumC8373Uj1.f12009d;
                    }
                    break;
                case 1598495741:
                    if (str.equals("cinematic")) {
                        return EnumC8373Uj1.f12010e;
                    }
                    break;
            }
        }
        throw new C6640po("videoStabilizationMode", str);
    }

    /* renamed from: n */
    public static void m18224n(Application application, String str, C4042fG c4042fG, Map map, List list, boolean z, ClientIdCallback clientIdCallback, PushAdsProvider pushAdsProvider) {
        O90.m5968f(c4042fG, "logger");
        if (f27161f && !z) {
            Logger.DefaultImpls.warn$default(c4042fG, "RuStorePushClient already initialized", null, 2, null);
            return;
        }
        if (AbstractC11374v51.m25328C(str)) {
            throw new IllegalStateException("projectId can't be empty");
        }
        C7981Mv1 c7981Mv1 = new C7981Mv1(application, str, clientIdCallback, c4042fG, null, null, RuStore.INSTANCE.getAppInfo(), list == null ? C0779MN.f7117a : list, z, AbstractC11153tN0.m24906r(AbstractC8725aR1.m9741a(map).f26623b), pushAdsProvider);
        Object obj = map != null ? map.get("defaultProvider") : null;
        AppInfo appInfo = obj instanceof AppInfo ? (AppInfo) obj : null;
        Object obj2 = map != null ? map.get("stand") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (appInfo != null) {
            Logger.DefaultImpls.info$default(c4042fG, "Init RuStorePushClient with defaultProvider = " + appInfo, null, 2, null);
            c7981Mv1 = C7981Mv1.m5478a(C7981Mv1.m5478a(c7981Mv1, null, null, appInfo, null, 7935), null, null, null, AbstractC7230yu.m26274e(appInfo), 7679);
        }
        C7981Mv1 c7981Mv1M5478a = c7981Mv1;
        if (!O90.m5963a(str2, "prod") && str2 != null) {
            Logger.DefaultImpls.info$default(c7981Mv1M5478a.f7398d, "Init RuStorePushClient with stand = ".concat(str2), null, 2, null);
            c7981Mv1M5478a = C7981Mv1.m5478a(C7981Mv1.m5478a(c7981Mv1M5478a, new C7295zw(str2), null, null, null, 8127), null, new C1339VH(str2, 7), null, null, 8063);
        }
        synchronized (C7821Jt1.f5774u) {
            try {
                if (!C7353At1.m368c() || c7981Mv1M5478a.f7403i) {
                    if (C7353At1.m368c()) {
                        C7821Jt1 c7821Jt1M367b = C7353At1.m367b();
                        AbstractC11432vY1.m25445b(c7821Jt1M367b.f5794s, null);
                        M22.m5247a(c7821Jt1M367b.f5794s.f9874a);
                    }
                    C7821Jt1.f5775v = new C7821Jt1(c7981Mv1M5478a);
                    C7821Jt1 c7821Jt1M367b2 = C7353At1.m367b();
                    Logger logger = c7821Jt1M367b2.f5777b;
                    C6396ly c6396ly = ((C10070kv1) c7821Jt1M367b2.f5784i.getValue()).f36762a;
                    Logger.DefaultImpls.info$default(logger, "Client SDK is initialized. Version: 6.9.1", null, 2, null);
                    C10454nv1 c10454nv1 = (C10454nv1) c7821Jt1M367b2.f5781f.getValue();
                    ((Application) c10454nv1.f38607a.f7369a.f39025a).registerActivityLifecycleCallbacks(new C0533IS(1, new C11603wu1(2, c10454nv1, C10454nv1.class, "onActivityCreated", "onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V", 0)));
                    c7821Jt1M367b2.f5795t = AbstractC9366fP1.m18230b(c7821Jt1M367b2.f5794s, null, new C0711LH(c7821Jt1M367b2, null, 2), 3);
                } else {
                    Logger.DefaultImpls.warn$default(c7981Mv1M5478a.f7398d, "Client SDK has been already initialized", null, 2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f27161f = true;
    }

    /* renamed from: p */
    public static boolean m18225p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // p000.InterfaceC7266zT
    /* renamed from: a */
    public Class mo7157a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p000.InterfaceC0236Dk
    /* renamed from: b */
    public byte[] mo1864b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        return new C10301mj0(true, 1);
    }

    @Override // p000.InterfaceC7266zT
    /* renamed from: e */
    public Object mo7158e(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    /* renamed from: h */
    public void m18226h(InterfaceC4050fO interfaceC4050fO) {
        interfaceC4050fO.mo884a(C9496gQ1.class, C10886rH1.f41455a);
        interfaceC4050fO.mo884a(C11549wT1.class, C10000kM1.f36443a);
        interfaceC4050fO.mo884a(AbstractC9752iQ1.class, C11525wH1.f44759a);
        interfaceC4050fO.mo884a(AbstractC11797yQ1.class, EH1.f2594a);
        interfaceC4050fO.mo884a(AbstractC11032sQ1.class, AH1.f156a);
        interfaceC4050fO.mo884a(AbstractC11416vQ1.class, HH1.f4203a);
        interfaceC4050fO.mo884a(EO1.class, C11902zF1.f46760a);
        interfaceC4050fO.mo884a(CO1.class, C11394vF1.f44305a);
        interfaceC4050fO.mo884a(CP1.class, RG1.f10103a);
        interfaceC4050fO.mo884a(AbstractC9502gT1.class, GL1.f3698a);
        interfaceC4050fO.mo884a(AbstractC11920zO1.class, C11010sF1.f42341a);
        interfaceC4050fO.mo884a(AbstractC11284uO1.class, C10498oF1.f38914a);
        interfaceC4050fO.mo884a(AbstractC8725aR1.class, C10504oI1.f38941a);
        interfaceC4050fO.mo884a(AbstractC11805yU1.class, C10884rG1.f41408a);
        interfaceC4050fO.mo884a(AbstractC11286uP1.class, EG1.f2589a);
        interfaceC4050fO.mo884a(AbstractC10134lP1.class, C10372nG1.f38225a);
        interfaceC4050fO.mo884a(AbstractC9114dR1.class, C11016sI1.f42361a);
        interfaceC4050fO.mo884a(AbstractC8729aT1.class, C11533wL1.f44830a);
        interfaceC4050fO.mo884a(AbstractC8985cT1.class, C11914zL1.f46798a);
        interfaceC4050fO.mo884a(WS1.class, C11022sL1.f42373a);
        interfaceC4050fO.mo884a(KQ1.class, WH1.f13125a);
        interfaceC4050fO.mo884a(AbstractC11551wU1.class, C9600hE1.f28329a);
        interfaceC4050fO.mo884a(NQ1.class, YH1.f14225a);
        interfaceC4050fO.mo884a(ER1.class, HI1.f4223a);
        interfaceC4050fO.mo884a(LR1.class, UI1.f11728a);
        interfaceC4050fO.mo884a(AbstractC9767iY0.class, OI1.f8349a);
        interfaceC4050fO.mo884a(HR1.class, LI1.f6603a);
        interfaceC4050fO.mo884a(AbstractC10780qS1.class, JJ1.f5447a);
        interfaceC4050fO.mo884a(AbstractC11164tS1.class, LJ1.f6612a);
        interfaceC4050fO.mo884a(AbstractC11928zS1.class, ZJ1.f14852a);
        interfaceC4050fO.mo884a(AbstractC11674xS1.class, VJ1.f12520a);
        interfaceC4050fO.mo884a(IQ1.class, TH1.f11289a);
        interfaceC4050fO.mo884a(DS1.class, C10892rK1.f41600a);
        interfaceC4050fO.mo884a(HS1.class, C11531wK1.f44821a);
        interfaceC4050fO.mo884a(KS1.class, C11912zK1.f46792a);
        interfaceC4050fO.mo884a(NS1.class, C9102dL1.f25975a);
        interfaceC4050fO.mo884a(US1.class, C9614hL1.f28394a);
        interfaceC4050fO.mo884a(QS1.class, C10254mL1.f37638a);
        interfaceC4050fO.mo884a(AbstractC10268mS1.class, C9610hJ1.f28376a);
        interfaceC4050fO.mo884a(TP1.class, C9990kH1.f36415a);
        interfaceC4050fO.mo884a(AbstractC9500gS1.class, AJ1.f168a);
        interfaceC4050fO.mo884a(AbstractC9244eS1.class, C10122lJ1.f37007a);
        interfaceC4050fO.mo884a(AbstractC10012kS1.class, FJ1.f3155a);
        interfaceC4050fO.mo884a(AbstractC9246eT1.class, CL1.f1327a);
        interfaceC4050fO.mo884a(MT1.class, SM1.f10704a);
        interfaceC4050fO.mo884a(EN1.class, DE1.f1915a);
        interfaceC4050fO.mo884a(AbstractC11410vN1.class, AE1.f120a);
        interfaceC4050fO.mo884a(AbstractC11154tN1.class, C11773yE1.f46148a);
        interfaceC4050fO.mo884a(AbstractC11918zN1.class, CE1.f1264a);
        interfaceC4050fO.mo884a(MN1.class, KE1.f5956a);
        interfaceC4050fO.mo884a(HN1.class, HE1.f4191a);
        interfaceC4050fO.mo884a(PN1.class, ME1.f7060a);
        interfaceC4050fO.mo884a(UN1.class, NE1.f7669a);
        interfaceC4050fO.mo884a(YN1.class, RE1.f10091a);
        interfaceC4050fO.mo884a(AbstractC8847bO1.class, TE1.f11254a);
        interfaceC4050fO.mo884a(AbstractC9236eO1.class, XE1.f13632a);
        interfaceC4050fO.mo884a(TB1.class, SD1.f10642a);
        interfaceC4050fO.mo884a(AbstractC8695aC1.class, ZD1.f14803a);
        interfaceC4050fO.mo884a(WB1.class, VD1.f12440a);
        interfaceC4050fO.mo884a(NP1.class, C9094dH1.f25931a);
        interfaceC4050fO.mo884a(HO1.class, EF1.f2582a);
        interfaceC4050fO.mo884a(AbstractC8301Sz1.class, C9468gC1.f27609a);
        interfaceC4050fO.mo884a(AbstractC8041Nz1.class, C10108lC1.f36959a);
        interfaceC4050fO.mo884a(AbstractC9494gP1.class, WF1.f13098a);
        interfaceC4050fO.mo884a(AbstractC9080dA1.class, C10620pC1.f39910a);
        interfaceC4050fO.mo884a(AbstractC8613Yz1.class, C11004sC1.f42302a);
        interfaceC4050fO.mo884a(AbstractC11765yA1.class, XC1.f13621a);
        interfaceC4050fO.mo884a(AbstractC11511wA1.class, C8825bD1.f16868a);
        interfaceC4050fO.mo884a(AbstractC10360nA1.class, C11260uC1.f43589a);
        interfaceC4050fO.mo884a(AbstractC9720iA1.class, C11642xC1.f45478a);
        interfaceC4050fO.mo884a(AbstractC9594hB1.class, C10110lD1.f36977a);
        interfaceC4050fO.mo884a(AbstractC9210eB1.class, C10366nD1.f38185a);
        interfaceC4050fO.mo884a(AbstractC11130tB1.class, C11134tD1.f42957a);
        interfaceC4050fO.mo884a(AbstractC10874rB1.class, C11390vD1.f44277a);
        interfaceC4050fO.mo884a(QB1.class, MD1.f7041a);
        interfaceC4050fO.mo884a(LB1.class, QD1.f9537a);
        interfaceC4050fO.mo884a(AbstractC11767yB1.class, C11898zD1.f46730a);
        interfaceC4050fO.mo884a(AbstractC11386vB1.class, AD1.f111a);
        interfaceC4050fO.mo884a(GB1.class, ED1.f2541a);
        interfaceC4050fO.mo884a(CB1.class, HD1.f4178a);
        interfaceC4050fO.mo884a(AbstractC9376fU1.class, PL1.f9000a);
        interfaceC4050fO.mo884a(OT1.class, IF1.f4872a);
        interfaceC4050fO.mo884a(XT1.class, RH1.f10111a);
        interfaceC4050fO.mo884a(WT1.class, OH1.f8343a);
        interfaceC4050fO.mo884a(RT1.class, C11396vG1.f44313a);
        interfaceC4050fO.mo884a(AbstractC9120dU1.class, NL1.f7731a);
        interfaceC4050fO.mo884a(AbstractC8731aU1.class, JL1.f5491a);
        interfaceC4050fO.mo884a(AbstractC9760iU1.class, SL1.f10700a);
        interfaceC4050fO.mo884a(TT1.class, VG1.f12483a);
        interfaceC4050fO.mo884a(AbstractC11168tU1.class, ZM1.f14869a);
        interfaceC4050fO.mo884a(AbstractC10784qU1.class, C8973cN1.f17464a);
        interfaceC4050fO.mo884a(AbstractC10272mU1.class, VM1.f12534a);
        interfaceC4050fO.mo884a(AbstractC7230yu.class, ZL1.f14862a);
        interfaceC4050fO.mo884a(KP1.class, C8705aH1.f15449a);
        interfaceC4050fO.mo884a(YP1.class, C10502oH1.f38940a);
        interfaceC4050fO.mo884a(AbstractC10642pN1.class, C10112lE1.f36981a);
        interfaceC4050fO.mo884a(AbstractC11668xP1.class, IG1.f4875a);
        interfaceC4050fO.mo884a(QP1.class, C9478gH1.f27663a);
        interfaceC4050fO.mo884a(AbstractC9878jP1.class, C8703aG1.f15412a);
        interfaceC4050fO.mo884a(YO1.class, MF1.f7073a);
        interfaceC4050fO.mo884a(AbstractC8977cP1.class, PF1.f8950a);
        interfaceC4050fO.mo884a(UO1.class, KF1.f5975a);
        interfaceC4050fO.mo884a(AbstractC9366fP1.class, TF1.f11261a);
        interfaceC4050fO.mo884a(EQ1.class, MH1.f7081a);
        interfaceC4050fO.mo884a(BQ1.class, KH1.f5982a);
        interfaceC4050fO.mo884a(AbstractC7677Gz1.class, C9212eC1.f26594a);
        interfaceC4050fO.mo884a(GT1.class, BM1.f772a);
        interfaceC4050fO.mo884a(KT1.class, IM1.f4907a);
        interfaceC4050fO.mo884a(HT1.class, CM1.f1341a);
        interfaceC4050fO.mo884a(AbstractC10130lN1.class, C8955cE1.f17383a);
        interfaceC4050fO.mo884a(AbstractC10900rO1.class, C9986kF1.f36396a);
        interfaceC4050fO.mo884a(AbstractC10516oO1.class, C9474gF1.f27647a);
        interfaceC4050fO.mo884a(AbstractC9620hO1.class, C8957cF1.f17397a);
        interfaceC4050fO.mo884a(RQ1.class, C9864jI1.f35050a);
        interfaceC4050fO.mo884a(YQ1.class, C10376nI1.f38258a);
        interfaceC4050fO.mo884a(WQ1.class, C10120lI1.f36999a);
        interfaceC4050fO.mo884a(AbstractC11256uA1.class, RC1.f10061a);
        interfaceC4050fO.mo884a(AbstractC10872rA1.class, TC1.f11197a);
        interfaceC4050fO.mo884a(AbstractC9754iR1.class, C11144tI1.f42991a);
        interfaceC4050fO.mo884a(AbstractC10650pR1.class, C11908zI1.f46776a);
        interfaceC4050fO.mo884a(AbstractC10010kR1.class, C11527wI1.f44775a);
        interfaceC4050fO.mo884a(AbstractC10522oR1.class, C11654xI1.f45538a);
        interfaceC4050fO.mo884a(TA1.class, C9086dD1.f25888a);
        interfaceC4050fO.mo884a(SA1.class, C9342fD1.f27110a);
        interfaceC4050fO.mo884a(AbstractC11501w51.class, C9616hM1.f28397a);
        interfaceC4050fO.mo884a(AbstractC9886jT1.class, C9232eM1.f26679a);
        interfaceC4050fO.mo884a(AT1.class, C10640pM1.f40034a);
        interfaceC4050fO.mo884a(DT1.class, C11408vM1.f44346a);
        interfaceC4050fO.mo884a(NR1.class, XI1.f13668a);
        interfaceC4050fO.mo884a(C10043ki0.class, C9226eJ1.f26657a);
        interfaceC4050fO.mo884a(QR1.class, YI1.f14238a);
        interfaceC4050fO.mo884a(AbstractC11433vZ0.class, C8709aJ1.f15462a);
        interfaceC4050fO.mo884a(AbstractC10490oB1.class, C10750qD1.f40672a);
        interfaceC4050fO.mo884a(AbstractC10106lB1.class, C10878rD1.f41388a);
        interfaceC4050fO.mo884a(AP1.class, MG1.f7077a);
        interfaceC4050fO.mo884a(AbstractC10518oP1.class, AG1.f151a);
        interfaceC4050fO.mo884a(AbstractC10906rR1.class, AI1.f162a);
        interfaceC4050fO.mo884a(AbstractC11926zR1.class, FI1.f3147a);
        interfaceC4050fO.mo884a(AbstractC11418vR1.class, CI1.f1310a);
        interfaceC4050fO.mo884a(AbstractC8821bB1.class, C9598hD1.f28323a);
        interfaceC4050fO.mo884a(XA1.class, C9726iD1.f28968a);
    }

    @Override // p000.InterfaceC7266zT
    /* renamed from: j */
    public void mo7159j(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    @Override // p000.GZ0
    /* renamed from: k */
    public BZ0 mo3083k(OJ1 oj1, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        C3979eG c3979eG = jSONObject.has("session") ? new C3979eG(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 6) : new C3979eG(new JSONObject().optInt("max_custom_exception_events", 8), 6);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new BZ0(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (iOptInt * 1000) + System.currentTimeMillis(), c3979eG, new C6435ma(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }

    /* renamed from: l */
    public WritableArray m18227l() {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        O90.m5967e(writableArrayCreateArray, "createArray(...)");
        return writableArrayCreateArray;
    }

    @Override // com.p019vk.push.core.remote.config.omicron.OmicronEnvironment
    public String name() {
        return "DEV";
    }

    /* renamed from: o */
    public boolean m18228o(int i) {
        return 5 <= i;
    }

    @Override // p000.InterfaceC9129dZ0
    public /* synthetic */ void onCaptureProcessProgressed(int i) {
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f27164a) {
            case 27:
                QY1.f9666b.get();
                Boolean bool = (Boolean) VY1.f12619a.m8754a();
                bool.getClass();
                return bool;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11842J.m8754a();
                l.getClass();
                return l;
            default:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11880k0.m8754a()).longValue());
        }
    }

    public C4049fN(C1068Qy c1068Qy) {
        this.f27164a = 25;
    }

    @Override // p000.InterfaceC9129dZ0
    /* renamed from: d */
    public void mo8492d() {
    }

    @Override // p000.InterfaceC9129dZ0
    /* renamed from: g */
    public void mo8496g() {
    }

    @Override // p000.InterfaceC9129dZ0
    /* renamed from: i */
    public void mo8499i() {
    }

    @Override // p000.InterfaceC9129dZ0
    /* renamed from: f */
    public void mo8494f(InterfaceC7034vn interfaceC7034vn) {
    }

    @Override // p000.InterfaceC8088Ox0
    public void onComplete(Throwable th) {
    }
}
