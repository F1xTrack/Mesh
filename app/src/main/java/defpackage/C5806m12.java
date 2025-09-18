package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.vk.push.core.filedatastore.JsonDeserializer;
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
public final class C5806m12 implements InterfaceC5839mC, InterfaceC2315bO, InterfaceC1018Mv, InterfaceC1646Uw0, RY, InterfaceC5696lS, InterfaceC8176yS0, InterfaceC5314jS, InterfaceC1576Tz, JsonDeserializer, InterfaceC0866Kw, InterfaceC6053nJ1 {
    public static C5806m12 b;
    public static final C5806m12 c = new C5806m12(1);
    public static final C5806m12 d = new C5806m12(3);
    public static final C5806m12 e = new C5806m12(4);
    public static final C5806m12 f = new C5806m12(5);
    public final /* synthetic */ int a;

    public /* synthetic */ C5806m12(int i) {
        this.a = i;
    }

    public static final Bitmap a(Context context, String str) throws IOException {
        if (!AbstractC7538v51.p(str, "http://", false) && !AbstractC7538v51.p(str, "https://", false)) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier(str, "drawable", context.getPackageName()));
            O90.e(bitmapDecodeResource, "decodeResource(...)");
            return bitmapDecodeResource;
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        uRLConnection.connect();
        InputStream inputStream = uRLConnection.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStream);
        bufferedInputStream.close();
        inputStream.close();
        O90.c(bitmapDecodeStream);
        return bitmapDecodeStream;
    }

    public static ByteArrayInputStream e(String str) {
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

    public static long h() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    public static void j(Object obj) {
        ((AbstractC8331zG1) obj).zzb.d();
    }

    public static void l(L21 l21, Map.Entry entry) {
        DG1 dg1 = (DG1) entry.getKey();
        EnumC5492kN1 enumC5492kN1 = EnumC5492kN1.b;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(defpackage.XU r8, defpackage.AbstractC1963Yy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.Q80
            if (r0 == 0) goto L13
            r0 = r9
            Q80 r0 = (defpackage.Q80) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            Q80 r0 = new Q80
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            java.lang.String r3 = ""
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.a
            java.lang.String r8 = (java.lang.String) r8
            defpackage.RQ1.d(r9)     // Catch: java.lang.Exception -> L8b
            goto L83
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.a
            XU r8 = (defpackage.XU) r8
            defpackage.RQ1.d(r9)     // Catch: java.lang.Exception -> L6b
            goto L5d
        L40:
            defpackage.RQ1.d(r9)
            r9 = r8
            WU r9 = (defpackage.WU) r9     // Catch: java.lang.Exception -> L6b
            g32 r8 = r9.e()     // Catch: java.lang.Exception -> L6b
            java.lang.String r2 = "firebaseInstallations.getToken(false)"
            defpackage.O90.e(r8, r2)     // Catch: java.lang.Exception -> L6a
            r0.a = r9     // Catch: java.lang.Exception -> L6a
            r0.d = r5     // Catch: java.lang.Exception -> L6a
            java.lang.Object r8 = defpackage.AbstractC4355iU1.a(r8, r0)     // Catch: java.lang.Exception -> L6a
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r6 = r9
            r9 = r8
            r8 = r6
        L5d:
            Sd r9 = (defpackage.C1432Sd) r9     // Catch: java.lang.Exception -> L6b
            java.lang.String r9 = r9.a     // Catch: java.lang.Exception -> L6b
            java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
            defpackage.O90.e(r9, r2)     // Catch: java.lang.Exception -> L6b
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
            WU r9 = (defpackage.WU) r9     // Catch: java.lang.Exception -> L8b
            g32 r9 = r9.d()     // Catch: java.lang.Exception -> L8b
            java.lang.String r2 = "firebaseInstallations.id"
            defpackage.O90.e(r9, r2)     // Catch: java.lang.Exception -> L8b
            r0.a = r8     // Catch: java.lang.Exception -> L8b
            r0.d = r4     // Catch: java.lang.Exception -> L8b
            java.lang.Object r9 = defpackage.AbstractC4355iU1.a(r9, r0)     // Catch: java.lang.Exception -> L8b
            if (r9 != r1) goto L83
            return r1
        L83:
            java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
            defpackage.O90.e(r9, r0)     // Catch: java.lang.Exception -> L8b
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L8b
            r3 = r9
        L8b:
            R80 r9 = new R80
            r9.<init>(r3, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5806m12.b(XU, Yy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        return new TreeMap();
    }

    @Override // defpackage.InterfaceC5314jS
    public Object create() {
        return new C3641el0();
    }

    @Override // defpackage.InterfaceC1018Mv
    public List d(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C7119sv c7119sv : componentRegistrar.getComponents()) {
            String str = c7119sv.a;
            if (str != null) {
                C0515Gj c0515Gj = new C0515Gj(str, 6, c7119sv);
                c7119sv = new C7119sv(str, c7119sv.b, c7119sv.c, c7119sv.d, c7119sv.e, c0515Gj, c7119sv.g);
            }
            arrayList.add(c7119sv);
        }
        return arrayList;
    }

    @Override // com.vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) {
        O90.f(jSONObject, "<this>");
        return new C6546pu1(jSONObject.optBoolean("test_mode_enabled"));
    }

    public C0546Gt0 g(FileInputStream fileInputStream) throws C1498Sz {
        try {
            QC0 qc0L = QC0.l(fileInputStream);
            C0546Gt0 c0546Gt0A = AbstractC5871mM1.a(new MC0[0]);
            Map mapJ = qc0L.j();
            O90.e(mapJ, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapJ.entrySet()) {
                String str = (String) entry.getKey();
                UC0 uc0 = (UC0) entry.getValue();
                O90.e(str, "name");
                O90.e(uc0, "value");
                int iX = uc0.x();
                switch (iX == 0 ? -1 : VC0.a[AbstractC8235ym.x(iX)]) {
                    case -1:
                        throw new C1498Sz("Value case is null.", null);
                    case 0:
                    default:
                        throw new C7074sg();
                    case 1:
                        c0546Gt0A.d(new LC0(str), Boolean.valueOf(uc0.p()));
                        break;
                    case 2:
                        c0546Gt0A.d(new LC0(str), Float.valueOf(uc0.s()));
                        break;
                    case 3:
                        c0546Gt0A.d(new LC0(str), Double.valueOf(uc0.r()));
                        break;
                    case 4:
                        c0546Gt0A.d(new LC0(str), Integer.valueOf(uc0.t()));
                        break;
                    case 5:
                        c0546Gt0A.d(new LC0(str), Long.valueOf(uc0.u()));
                        break;
                    case 6:
                        LC0 lc0 = new LC0(str);
                        String strV = uc0.v();
                        O90.e(strV, "value.string");
                        c0546Gt0A.d(lc0, strV);
                        break;
                    case 7:
                        LC0 lc02 = new LC0(str);
                        InterfaceC7739w90 interfaceC7739w90K = uc0.w().k();
                        O90.e(interfaceC7739w90K, "value.stringSet.stringsList");
                        c0546Gt0A.d(lc02, AbstractC8069xu.g0(interfaceC7739w90K));
                        break;
                    case 8:
                        throw new C1498Sz("Value not set.", null);
                }
            }
            return new C0546Gt0(AbstractC7096sn0.q(c0546Gt0A.a()), true);
        } catch (Z90 e2) {
            throw new C1498Sz("Unable to parse preferences proto.", e2);
        }
    }

    public void i(Object obj, C5938mj c5938mj) {
        B00 b00A;
        Map mapA = ((C0546Gt0) obj).a();
        OC0 oc0K = QC0.k();
        for (Map.Entry entry : mapA.entrySet()) {
            LC0 lc0 = (LC0) entry.getKey();
            Object value = entry.getValue();
            String str = lc0.a;
            if (value instanceof Boolean) {
                TC0 tc0Y = UC0.y();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                tc0Y.h();
                UC0.m((UC0) tc0Y.b, zBooleanValue);
                b00A = tc0Y.a();
            } else if (value instanceof Float) {
                TC0 tc0Y2 = UC0.y();
                float fFloatValue = ((Number) value).floatValue();
                tc0Y2.h();
                UC0.n((UC0) tc0Y2.b, fFloatValue);
                b00A = tc0Y2.a();
            } else if (value instanceof Double) {
                TC0 tc0Y3 = UC0.y();
                double dDoubleValue = ((Number) value).doubleValue();
                tc0Y3.h();
                UC0.l((UC0) tc0Y3.b, dDoubleValue);
                b00A = tc0Y3.a();
            } else if (value instanceof Integer) {
                TC0 tc0Y4 = UC0.y();
                int iIntValue = ((Number) value).intValue();
                tc0Y4.h();
                UC0.o((UC0) tc0Y4.b, iIntValue);
                b00A = tc0Y4.a();
            } else if (value instanceof Long) {
                TC0 tc0Y5 = UC0.y();
                long jLongValue = ((Number) value).longValue();
                tc0Y5.h();
                UC0.i((UC0) tc0Y5.b, jLongValue);
                b00A = tc0Y5.a();
            } else if (value instanceof String) {
                TC0 tc0Y6 = UC0.y();
                tc0Y6.h();
                UC0.j((UC0) tc0Y6.b, (String) value);
                b00A = tc0Y6.a();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(O90.n(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                TC0 tc0Y7 = UC0.y();
                RC0 rc0L = SC0.l();
                rc0L.h();
                SC0.i((SC0) rc0L.b, (Set) value);
                tc0Y7.h();
                UC0.k((UC0) tc0Y7.b, rc0L);
                b00A = tc0Y7.a();
            }
            oc0K.getClass();
            oc0K.h();
            QC0.i((QC0) oc0K.b).put(str, (UC0) b00A);
        }
        QC0 qc0 = (QC0) oc0K.a();
        int iA = qc0.a();
        Logger logger = C6735qu.f;
        if (iA > 4096) {
            iA = 4096;
        }
        C6735qu c6735qu = new C6735qu(c5938mj, iA);
        qc0.c(c6735qu);
        if (c6735qu.d > 0) {
            c6735qu.E();
        }
    }

    @Override // defpackage.InterfaceC5839mC
    public Iterable k(Object obj) {
        int i = C1445Sh0.p;
        Collection collectionB = ((InterfaceC7492us) obj).v().b();
        O90.e(collectionB, "getSupertypes(...)");
        return new L8(2, AbstractC4175hY0.m(AbstractC8069xu.t(collectionB), C3808fd0.n));
    }

    @Override // defpackage.InterfaceC2315bO
    public boolean n(Object obj, File file, C0795Jy0 c0795Jy0) throws Throwable {
        try {
            AbstractC7659vk.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC0866Kw
    public C0788Jw p() {
        return new C0788Jw(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    @Override // defpackage.InterfaceC8176yS0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.InterfaceC5506kS0 t(defpackage.InterfaceC5506kS0 r5, defpackage.C0795Jy0 r6) {
        /*
            r4 = this;
            java.lang.Object r5 = r5.get()
            e10 r5 = (defpackage.C3500e10) r5
            c5 r5 = r5.a
            java.lang.Object r5 = r5.b
            l10 r5 = (defpackage.C5613l10) r5
            n41 r5 = r5.a
            java.nio.ByteBuffer r5 = r5.d
            java.nio.ByteBuffer r5 = r5.asReadOnlyBuffer()
            f5 r6 = new f5
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.AbstractC7659vk.a
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
            int r1 = r0.a
            if (r1 != 0) goto L49
            byte[] r1 = r0.c
            int r1 = r1.length
            int r0 = r0.b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5806m12.t(kS0, Jy0):kS0");
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 26:
                C3797fZ1.b.get();
                Boolean bool = (Boolean) C5528kZ1.a.a();
                bool.getClass();
                return bool;
            case 27:
                PW1.b.get();
                Long l = (Long) UW1.M.a();
                l.getClass();
                return l;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l2 = (Long) UW1.D.a();
                l2.getClass();
                return l2;
            default:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.q.a()).longValue());
        }
    }

    @Override // defpackage.InterfaceC1576Tz
    public Object R(C1498Sz c1498Sz) throws C1498Sz {
        throw c1498Sz;
    }

    @Override // defpackage.InterfaceC5696lS
    public void f(Object obj) {
    }
}
