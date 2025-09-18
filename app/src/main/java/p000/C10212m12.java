package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.p019vk.push.core.filedatastore.JsonDeserializer;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.json.JSONObject;

/* renamed from: m12 */
/* loaded from: classes.dex */
public final class C10212m12 implements InterfaceC6411mC, InterfaceC1782bO, InterfaceC0813Mv, InterfaceC8398Uw0, InterfaceC1104RY, InterfaceC6364lS, InterfaceC11800yS0, InterfaceC6238jS, InterfaceC1257Tz, JsonDeserializer, InterfaceC0689Kw, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static C10212m12 f37412b;

    /* renamed from: c */
    public static final C10212m12 f37413c = new C10212m12(1);

    /* renamed from: d */
    public static final C10212m12 f37414d = new C10212m12(3);

    /* renamed from: e */
    public static final C10212m12 f37415e = new C10212m12(4);

    /* renamed from: f */
    public static final C10212m12 f37416f = new C10212m12(5);

    /* renamed from: a */
    public final /* synthetic */ int f37417a;

    public /* synthetic */ C10212m12(int i) {
        this.f37417a = i;
    }

    /* renamed from: a */
    public static final Bitmap m22627a(Context context, String str) throws IOException {
        if (!AbstractC11374v51.m25351p(str, "http://", false) && !AbstractC11374v51.m25351p(str, "https://", false)) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier(str, "drawable", context.getPackageName()));
            O90.m5967e(bitmapDecodeResource, "decodeResource(...)");
            return bitmapDecodeResource;
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        uRLConnection.connect();
        InputStream inputStream = uRLConnection.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStream);
        bufferedInputStream.close();
        inputStream.close();
        O90.m5965c(bitmapDecodeStream);
        return bitmapDecodeStream;
    }

    /* renamed from: e */
    public static ByteArrayInputStream m22628e(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    /* renamed from: h */
    public static long m22629h() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    /* renamed from: j */
    public static void m22630j(Object obj) {
        ((AbstractC11904zG1) obj).zzb.m7203d();
    }

    /* renamed from: l */
    public static void m22631l(L21 l21, Map.Entry entry) {
        DG1 dg1 = (DG1) entry.getKey();
        EnumC10002kN1 enumC10002kN1 = EnumC10002kN1.f36470b;
        dg1.getClass();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0082 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0, types: [XU] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m22632b(p000.InterfaceC1478XU r8, p000.AbstractC1571Yy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p000.Q80
            if (r0 == 0) goto L13
            r0 = r9
            Q80 r0 = (p000.Q80) r0
            int r1 = r0.f9493d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9493d = r1
            goto L18
        L13:
            Q80 r0 = new Q80
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f9491b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f9493d
            java.lang.String r3 = ""
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.f9490a
            java.lang.String r8 = (java.lang.String) r8
            p000.RQ1.m7017d(r9)     // Catch: java.lang.Exception -> L8b
            goto L83
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f9490a
            XU r8 = (p000.InterfaceC1478XU) r8
            p000.RQ1.m7017d(r9)     // Catch: java.lang.Exception -> L6b
            goto L5d
        L40:
            p000.RQ1.m7017d(r9)
            r9 = r8
            WU r9 = (p000.C1415WU) r9     // Catch: java.lang.Exception -> L6b
            g32 r8 = r9.m8790e()     // Catch: java.lang.Exception -> L6b
            java.lang.String r2 = "firebaseInstallations.getToken(false)"
            p000.O90.m5967e(r8, r2)     // Catch: java.lang.Exception -> L6a
            r0.f9490a = r9     // Catch: java.lang.Exception -> L6a
            r0.f9493d = r5     // Catch: java.lang.Exception -> L6a
            java.lang.Object r8 = p000.AbstractC9760iU1.m19049a(r8, r0)     // Catch: java.lang.Exception -> L6a
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r6 = r9
            r9 = r8
            r8 = r6
        L5d:
            Sd r9 = (p000.C1172Sd) r9     // Catch: java.lang.Exception -> L6b
            java.lang.String r9 = r9.f10878a     // Catch: java.lang.Exception -> L6b
            java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
            p000.O90.m5967e(r9, r2)     // Catch: java.lang.Exception -> L6b
            r6 = r9
            r9 = r8
            r8 = r6
            goto L6d
        L6a:
            r8 = r9
        L6b:
            r9 = r8
            r8 = r3
        L6d:
            WU r9 = (p000.C1415WU) r9     // Catch: java.lang.Exception -> L8b
            g32 r9 = r9.m8789d()     // Catch: java.lang.Exception -> L8b
            java.lang.String r2 = "firebaseInstallations.id"
            p000.O90.m5967e(r9, r2)     // Catch: java.lang.Exception -> L8b
            r0.f9490a = r8     // Catch: java.lang.Exception -> L8b
            r0.f9493d = r4     // Catch: java.lang.Exception -> L8b
            java.lang.Object r9 = p000.AbstractC9760iU1.m19049a(r9, r0)     // Catch: java.lang.Exception -> L8b
            if (r9 != r1) goto L83
            return r1
        L83:
            java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
            p000.O90.m5967e(r9, r0)     // Catch: java.lang.Exception -> L8b
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L8b
            r3 = r9
        L8b:
            R80 r9 = new R80
            r9.<init>(r3, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10212m12.m22632b(XU, Yy):java.lang.Object");
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        return new TreeMap();
    }

    @Override // p000.InterfaceC6238jS
    public Object create() {
        return new C9281el0();
    }

    @Override // p000.InterfaceC0813Mv
    /* renamed from: d */
    public List mo5477d(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C6853sv c6853sv : componentRegistrar.getComponents()) {
            String str = c6853sv.f42719a;
            if (str != null) {
                C0424Gj c0424Gj = new C0424Gj(str, 6, c6853sv);
                c6853sv = new C6853sv(str, c6853sv.f42720b, c6853sv.f42721c, c6853sv.f42722d, c6853sv.f42723e, c0424Gj, c6853sv.f42725g);
            }
            arrayList.add(c6853sv);
        }
        return arrayList;
    }

    @Override // com.p019vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) {
        O90.m5968f(jSONObject, "<this>");
        return new C10708pu1(jSONObject.optBoolean("test_mode_enabled"));
    }

    /* renamed from: g */
    public C7664Gt0 m22633g(FileInputStream fileInputStream) throws C1194Sz {
        try {
            QC0 qc0M6613l = QC0.m6613l(fileInputStream);
            C7664Gt0 c7664Gt0M22812a = AbstractC10256mM1.m22812a(new MC0[0]);
            Map mapM6614j = qc0M6613l.m6614j();
            O90.m5967e(mapM6614j, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapM6614j.entrySet()) {
                String str = (String) entry.getKey();
                UC0 uc0 = (UC0) entry.getValue();
                O90.m5967e(str, "name");
                O90.m5967e(uc0, "value");
                int iM7944x = uc0.m7944x();
                switch (iM7944x == 0 ? -1 : VC0.f12413a[AbstractC7222ym.m26247x(iM7944x)]) {
                    case -1:
                        throw new C1194Sz("Value case is null.", null);
                    case 0:
                    default:
                        throw new C6838sg();
                    case 1:
                        c7664Gt0M22812a.m3188d(new LC0(str), Boolean.valueOf(uc0.m7937p()));
                        break;
                    case 2:
                        c7664Gt0M22812a.m3188d(new LC0(str), Float.valueOf(uc0.m7939s()));
                        break;
                    case 3:
                        c7664Gt0M22812a.m3188d(new LC0(str), Double.valueOf(uc0.m7938r()));
                        break;
                    case 4:
                        c7664Gt0M22812a.m3188d(new LC0(str), Integer.valueOf(uc0.m7940t()));
                        break;
                    case 5:
                        c7664Gt0M22812a.m3188d(new LC0(str), Long.valueOf(uc0.m7941u()));
                        break;
                    case 6:
                        LC0 lc0 = new LC0(str);
                        String strM7942v = uc0.m7942v();
                        O90.m5967e(strM7942v, "value.string");
                        c7664Gt0M22812a.m3188d(lc0, strM7942v);
                        break;
                    case 7:
                        LC0 lc02 = new LC0(str);
                        InterfaceC11508w90 interfaceC11508w90M7195k = uc0.m7943w().m7195k();
                        O90.m5967e(interfaceC11508w90M7195k, "value.stringSet.stringsList");
                        c7664Gt0M22812a.m3188d(lc02, AbstractC7167xu.m25987g0(interfaceC11508w90M7195k));
                        break;
                    case 8:
                        throw new C1194Sz("Value not set.", null);
                }
            }
            return new C7664Gt0(AbstractC11077sn0.m24789q(c7664Gt0M22812a.m3185a()), true);
        } catch (Z90 e) {
            throw new C1194Sz("Unable to parse preferences proto.", e);
        }
    }

    /* renamed from: i */
    public void m22634i(Object obj, C6444mj c6444mj) {
        B00 b00M24567a;
        Map mapM3185a = ((C7664Gt0) obj).m3185a();
        OC0 oc0M6612k = QC0.m6612k();
        for (Map.Entry entry : mapM3185a.entrySet()) {
            LC0 lc0 = (LC0) entry.getKey();
            Object value = entry.getValue();
            String str = lc0.f6547a;
            if (value instanceof Boolean) {
                TC0 tc0M7936y = UC0.m7936y();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                tc0M7936y.m24569h();
                UC0.m7932m((UC0) tc0M7936y.f42194b, zBooleanValue);
                b00M24567a = tc0M7936y.m24567a();
            } else if (value instanceof Float) {
                TC0 tc0M7936y2 = UC0.m7936y();
                float fFloatValue = ((Number) value).floatValue();
                tc0M7936y2.m24569h();
                UC0.m7933n((UC0) tc0M7936y2.f42194b, fFloatValue);
                b00M24567a = tc0M7936y2.m24567a();
            } else if (value instanceof Double) {
                TC0 tc0M7936y3 = UC0.m7936y();
                double dDoubleValue = ((Number) value).doubleValue();
                tc0M7936y3.m24569h();
                UC0.m7931l((UC0) tc0M7936y3.f42194b, dDoubleValue);
                b00M24567a = tc0M7936y3.m24567a();
            } else if (value instanceof Integer) {
                TC0 tc0M7936y4 = UC0.m7936y();
                int iIntValue = ((Number) value).intValue();
                tc0M7936y4.m24569h();
                UC0.m7934o((UC0) tc0M7936y4.f42194b, iIntValue);
                b00M24567a = tc0M7936y4.m24567a();
            } else if (value instanceof Long) {
                TC0 tc0M7936y5 = UC0.m7936y();
                long jLongValue = ((Number) value).longValue();
                tc0M7936y5.m24569h();
                UC0.m7928i((UC0) tc0M7936y5.f42194b, jLongValue);
                b00M24567a = tc0M7936y5.m24567a();
            } else if (value instanceof String) {
                TC0 tc0M7936y6 = UC0.m7936y();
                tc0M7936y6.m24569h();
                UC0.m7929j((UC0) tc0M7936y6.f42194b, (String) value);
                b00M24567a = tc0M7936y6.m24567a();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(O90.m5976n(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                TC0 tc0M7936y7 = UC0.m7936y();
                RC0 rc0M7194l = SC0.m7194l();
                rc0M7194l.m24569h();
                SC0.m7192i((SC0) rc0M7194l.f42194b, (Set) value);
                tc0M7936y7.m24569h();
                UC0.m7930k((UC0) tc0M7936y7.f42194b, rc0M7194l);
                b00M24567a = tc0M7936y7.m24567a();
            }
            oc0M6612k.getClass();
            oc0M6612k.m24569h();
            QC0.m6611i((QC0) oc0M6612k.f42194b).put(str, (UC0) b00M24567a);
        }
        QC0 qc0 = (QC0) oc0M6612k.m24567a();
        int iMo430a = qc0.mo430a();
        Logger logger = C6709qu.f41238f;
        if (iMo430a > 4096) {
            iMo430a = 4096;
        }
        C6709qu c6709qu = new C6709qu(c6444mj, iMo430a);
        qc0.mo431c(c6709qu);
        if (c6709qu.f41243d > 0) {
            c6709qu.m24102E();
        }
    }

    @Override // p000.InterfaceC6411mC
    /* renamed from: k */
    public Iterable mo2553k(Object obj) {
        int i = C8264Sh0.f10909p;
        Collection collectionMo5276b = ((InterfaceC6976us) obj).mo1439v().mo5276b();
        O90.m5967e(collectionMo5276b, "getSupertypes(...)");
        return new C0702L8(2, AbstractC9639hY0.m18834m(AbstractC7167xu.m25992t(collectionMo5276b), C9393fd0.f27288n));
    }

    @Override // p000.InterfaceC1782bO
    /* renamed from: n */
    public boolean mo397n(Object obj, File file, C7830Jy0 c7830Jy0) throws Throwable {
        try {
            AbstractC7031vk.m25481d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p000.InterfaceC0689Kw
    /* renamed from: p */
    public C0626Jw mo4780p() {
        return new C0626Jw(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    @Override // p000.InterfaceC11800yS0
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.InterfaceC10011kS0 mo875t(p000.InterfaceC10011kS0 r5, p000.C7830Jy0 r6) {
        /*
            r4 = this;
            java.lang.Object r5 = r5.get()
            e10 r5 = (p000.C9186e10) r5
            c5 r5 = r5.f26481a
            java.lang.Object r5 = r5.f17293b
            l10 r5 = (p000.C10082l10) r5
            n41 r5 = r5.f36805a
            java.nio.ByteBuffer r5 = r5.f38073d
            java.nio.ByteBuffer r5 = r5.asReadOnlyBuffer()
            f5 r6 = new f5
            java.util.concurrent.atomic.AtomicReference r0 = p000.AbstractC7031vk.f44510a
            boolean r0 = r5.isReadOnly()
            if (r0 != 0) goto L36
            boolean r0 = r5.hasArray()
            if (r0 == 0) goto L36
            hi1 r0 = new hi1
            byte[] r1 = r5.array()
            int r2 = r5.arrayOffset()
            int r3 = r5.limit()
            r0.<init>(r1, r2, r3)
            goto L37
        L36:
            r0 = 0
        L37:
            if (r0 == 0) goto L49
            int r1 = r0.f28542a
            if (r1 != 0) goto L49
            byte[] r1 = r0.f28544c
            int r1 = r1.length
            int r0 = r0.f28543b
            if (r0 != r1) goto L49
            byte[] r5 = r5.array()
            goto L5e
        L49:
            java.nio.ByteBuffer r5 = r5.asReadOnlyBuffer()
            int r0 = r5.limit()
            byte[] r0 = new byte[r0]
            r1 = 0
            java.nio.Buffer r1 = r5.position(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r5.get(r0)
            r5 = r0
        L5e:
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10212m12.mo875t(kS0, Jy0):kS0");
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f37417a) {
            case 26:
                C9386fZ1.f27238b.get();
                Boolean bool = (Boolean) C10026kZ1.f36543a.m8754a();
                bool.getClass();
                return bool;
            case 27:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11845M.m8754a();
                l.getClass();
                return l;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l2 = (Long) UW1.f11836D.m8754a();
                l2.getClass();
                return l2;
            default:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11890q.m8754a()).longValue());
        }
    }

    @Override // p000.InterfaceC1257Tz
    /* renamed from: R */
    public Object mo7832R(C1194Sz c1194Sz) throws C1194Sz {
        throw c1194Sz;
    }

    @Override // p000.InterfaceC6364lS
    /* renamed from: f */
    public void mo22428f(Object obj) {
    }
}
