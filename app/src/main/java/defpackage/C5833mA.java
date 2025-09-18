package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.json.JSONException;

/* renamed from: mA */
/* loaded from: classes.dex */
public final class C5833mA {
    public static final C4293iA s = new C4293iA(1);
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Serializable r;

    public C5833mA(Context context, Y50 y50, DC dc, HT ht, VH vh, D7 d7, C5534kb1 c5534kb1, C4332iN c4332iN, C1252Pv c1252Pv, C6978sA c6978sA, U3 u3, C5260jA c5260jA, C6846rT1 c6846rT1) {
        this.o = new S81();
        this.p = new S81();
        this.q = new S81();
        this.r = new AtomicBoolean(false);
        this.a = context;
        this.f = y50;
        this.b = dc;
        this.g = ht;
        this.c = vh;
        this.h = d7;
        this.d = c5534kb1;
        this.i = c4332iN;
        this.j = c6978sA;
        this.k = u3;
        this.l = c5260jA;
        this.m = c1252Pv;
        this.e = c6846rT1;
    }

    public static C3892g32 a(C5833mA c5833mA) {
        C3892g32 c3892g32C;
        c5833mA.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : HT.m(((File) ((HT) c5833mA.g).c).listFiles(s))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    c3892g32C = AbstractC3782fU1.e(null);
                } catch (ClassNotFoundException unused) {
                    c3892g32C = AbstractC3782fU1.c(new ScheduledThreadPoolExecutor(1), new CallableC5642lA(c5833mA, j));
                }
                arrayList.add(c3892g32C);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return AbstractC3782fU1.g(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x0683 A[LOOP:7: B:706:0x0683->B:708:0x0689, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:712:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x082c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:822:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:850:0x057a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:857:0x04a3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r30v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v10, types: [AG0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(boolean r30, defpackage.C1666Vd r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2106
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5833mA.b(boolean, Vd, boolean):void");
    }

    public void c(String str, Boolean bool) {
        long j;
        String str2;
        String str3;
        int i;
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Locale locale = Locale.US;
        Y50 y50 = (Y50) this.f;
        D7 d7 = (D7) this.h;
        C0188Ce c0188Ce = new C0188Ce(y50.c, (String) d7.f, (String) d7.g, y50.c().a, AbstractC1705Vq.b(((String) d7.d) != null ? 4 : 1), (N8) d7.h);
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.VERSION.CODENAME;
        C0344Ee c0344Ee = new C0344Ee(str4, str5, AbstractC1717Vu.m());
        Context context = (Context) this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        EnumC1561Tu enumC1561Tu = EnumC1561Tu.a;
        String str6 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str6);
        EnumC1561Tu enumC1561Tu2 = EnumC1561Tu.a;
        if (!zIsEmpty) {
            EnumC1561Tu enumC1561Tu3 = (EnumC1561Tu) EnumC1561Tu.b.get(str6.toLowerCase(locale));
            if (enumC1561Tu3 != null) {
                enumC1561Tu2 = enumC1561Tu3;
            }
        }
        int iOrdinal = enumC1561Tu2.ordinal();
        String str7 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = AbstractC1717Vu.a(context);
        boolean zL = AbstractC1717Vu.l();
        int iG = AbstractC1717Vu.g();
        String str8 = Build.MANUFACTURER;
        String str9 = Build.PRODUCT;
        ((C6978sA) this.j).d(str, jCurrentTimeMillis, new C0110Be(c0188Ce, c0344Ee, new C0266De(iOrdinal, str7, iAvailableProcessors, jA, blockCount, zL, iG, str8, str9)));
        if (!bool.booleanValue() || str == null) {
            j = jCurrentTimeMillis;
            str2 = str9;
            str3 = str8;
            i = 4;
        } else {
            C5534kb1 c5534kb1 = (C5534kb1) this.d;
            synchronized (((String) c5534kb1.c)) {
                c5534kb1.c = str;
                j = jCurrentTimeMillis;
                str2 = str9;
                str3 = str8;
                i = 4;
                ((ZA) ((C6846rT1) c5534kb1.b).c).a(new RunnableC6880rf(c5534kb1, str, ((C7648vg0) ((AtomicMarkableReference) ((VG) c5534kb1.d).c).getReference()).a(), ((C5700lT0) c5534kb1.f).a(), 18));
            }
        }
        C4332iN c4332iN = (C4332iN) this.i;
        ((AT) c4332iN.c).a();
        c4332iN.c = C4332iN.d;
        if (str != null) {
            c4332iN.c = new AG0(((HT) c4332iN.b).j(str, "userlog"));
        }
        ((C5260jA) this.l).b(str);
        C1252Pv c1252Pv = (C1252Pv) this.m;
        UA ua = (UA) c1252Pv.a;
        Charset charset = TA.a;
        C0650Ic c0650Ic = new C0650Ic();
        c0650Ic.a = "19.4.0";
        D7 d72 = ua.c;
        String str10 = (String) d72.b;
        if (str10 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        c0650Ic.b = str10;
        Y50 y502 = ua.b;
        String str11 = y502.c().a;
        if (str11 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        c0650Ic.d = str11;
        c0650Ic.e = y502.c().b;
        c0650Ic.f = y502.c().c;
        String str12 = (String) d72.f;
        if (str12 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c0650Ic.h = str12;
        String str13 = (String) d72.g;
        if (str13 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        c0650Ic.i = str13;
        c0650Ic.c = i;
        c0650Ic.m = (byte) (c0650Ic.m | 1);
        C1351Rc c1351Rc = new C1351Rc();
        c1351Rc.f = false;
        byte b = (byte) (c1351Rc.m | 2);
        c1351Rc.d = j;
        c1351Rc.m = (byte) (b | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        c1351Rc.b = str;
        String str14 = UA.g;
        if (str14 == null) {
            throw new NullPointerException("Null generator");
        }
        c1351Rc.a = str14;
        String str15 = y502.c;
        if (str15 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str16 = y502.c().a;
        N8 n8 = (N8) d72.h;
        c1351Rc.g = new C1507Tc(str15, str12, str13, str16, n8.r().b, n8.r().c);
        C6684qd c6684qd = new C6684qd();
        c6684qd.a = 3;
        c6684qd.e = (byte) (c6684qd.e | 1);
        c6684qd.b = str4;
        c6684qd.c = str5;
        c6684qd.d = AbstractC1717Vu.m();
        c6684qd.e = (byte) (c6684qd.e | 2);
        c1351Rc.i = c6684qd.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str6) && (num = (Integer) UA.f.get(str6.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = AbstractC1717Vu.a(ua.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean zL2 = AbstractC1717Vu.l();
        int iG2 = AbstractC1717Vu.g();
        C1663Vc c1663Vc = new C1663Vc();
        c1663Vc.a = iIntValue;
        byte b2 = (byte) (c1663Vc.j | 1);
        c1663Vc.b = str7;
        c1663Vc.c = iAvailableProcessors2;
        c1663Vc.d = jA2;
        c1663Vc.e = blockCount2;
        c1663Vc.f = zL2;
        c1663Vc.g = iG2;
        c1663Vc.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        c1663Vc.h = str3;
        c1663Vc.i = str2;
        c1351Rc.j = c1663Vc.a();
        c1351Rc.l = 3;
        c1351Rc.m = (byte) (c1351Rc.m | 4);
        c0650Ic.j = c1351Rc.a();
        C0728Jc c0728JcA = c0650Ic.a();
        HT ht = ((XA) c1252Pv.b).b;
        C1429Sc c1429Sc = c0728JcA.k;
        if (c1429Sc == null) {
            return;
        }
        String str17 = c1429Sc.b;
        try {
            XA.g.getClass();
            XA.f(ht.j(str17, "report"), WA.a.v(c0728JcA));
            File fileJ = ht.j(str17, "start-time");
            long j2 = c1429Sc.d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileJ), XA.e);
            try {
                outputStreamWriter.write("");
                fileJ.setLastModified(j2 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public void d(long j) throws IOException {
        try {
            HT ht = (HT) this.g;
            String str = ".ae" + j;
            ht.getClass();
            if (new File((File) ht.c, str).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException unused) {
        }
    }

    public String e() {
        NavigableSet navigableSetC = ((XA) ((C1252Pv) this.m).b).c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public void f() throws IOException {
        InputStream resourceAsStream;
        try {
            ClassLoader classLoader = C5833mA.class.getClassLoader();
            String strEncodeToString = null;
            if (classLoader == null || (resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto")) == null) {
                resourceAsStream = null;
            }
            if (resourceAsStream != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = resourceAsStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                }
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            if (strEncodeToString != null) {
                try {
                    ((VG) ((C5534kb1) this.d).e).m("com.crashlytics.version-control-info", strEncodeToString);
                } catch (IllegalArgumentException e) {
                    Context context = (Context) this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    public void g(C3892g32 c3892g32) {
        C3892g32 c3892g322;
        C3892g32 c3892g32B;
        HT ht = ((XA) ((C1252Pv) this.m).b).b;
        boolean zIsEmpty = HT.m(((File) ht.e).listFiles()).isEmpty();
        S81 s81 = (S81) this.o;
        if (zIsEmpty && HT.m(((File) ht.f).listFiles()).isEmpty() && HT.m(((File) ht.g).listFiles()).isEmpty()) {
            s81.d(Boolean.FALSE);
            return;
        }
        DC dc = (DC) this.b;
        if (dc.b()) {
            s81.d(Boolean.FALSE);
            c3892g32B = AbstractC3782fU1.e(Boolean.TRUE);
        } else {
            s81.d(Boolean.TRUE);
            synchronized (dc.c) {
                c3892g322 = dc.d.a;
            }
            c3892g32B = AbstractC5205it0.b(c3892g322.l(new C0162Bv0(11)), ((S81) this.p).a);
        }
        c3892g32B.n((ZA) ((C6846rT1) this.e).b, new C4332iN(this, c3892g32, false, 10));
    }

    public C5833mA(C3513e41 c3513e41) throws JSONException, NumberFormatException {
        String[] strArr;
        String[] strArr2;
        this.a = c3513e41.J0("gcm.n.title");
        this.b = c3513e41.H0("gcm.n.title");
        Object[] objArrG0 = c3513e41.G0("gcm.n.title");
        if (objArrG0 == null) {
            strArr = null;
        } else {
            strArr = new String[objArrG0.length];
            for (int i = 0; i < objArrG0.length; i++) {
                strArr[i] = String.valueOf(objArrG0[i]);
            }
        }
        this.c = strArr;
        this.d = c3513e41.J0("gcm.n.body");
        this.e = c3513e41.H0("gcm.n.body");
        Object[] objArrG02 = c3513e41.G0("gcm.n.body");
        if (objArrG02 == null) {
            strArr2 = null;
        } else {
            strArr2 = new String[objArrG02.length];
            for (int i2 = 0; i2 < objArrG02.length; i2++) {
                strArr2[i2] = String.valueOf(objArrG02[i2]);
            }
        }
        this.f = strArr2;
        this.g = c3513e41.J0("gcm.n.icon");
        String strJ0 = c3513e41.J0("gcm.n.sound2");
        this.i = TextUtils.isEmpty(strJ0) ? c3513e41.J0("gcm.n.sound") : strJ0;
        this.j = c3513e41.J0("gcm.n.tag");
        this.k = c3513e41.J0("gcm.n.color");
        this.l = c3513e41.J0("gcm.n.click_action");
        this.m = c3513e41.J0("gcm.n.android_channel_id");
        String strJ02 = c3513e41.J0("gcm.n.link_android");
        strJ02 = TextUtils.isEmpty(strJ02) ? c3513e41.J0("gcm.n.link") : strJ02;
        this.n = TextUtils.isEmpty(strJ02) ? null : Uri.parse(strJ02);
        this.h = c3513e41.J0("gcm.n.image");
        this.o = c3513e41.J0("gcm.n.ticker");
        this.p = c3513e41.D0("gcm.n.notification_priority");
        this.q = c3513e41.D0("gcm.n.visibility");
        this.r = c3513e41.D0("gcm.n.notification_count");
        c3513e41.C0("gcm.n.sticky");
        c3513e41.C0("gcm.n.local_only");
        c3513e41.C0("gcm.n.default_sound");
        c3513e41.C0("gcm.n.default_vibrate_timings");
        c3513e41.C0("gcm.n.default_light_settings");
        String strJ03 = c3513e41.J0("gcm.n.event_time");
        if (!TextUtils.isEmpty(strJ03)) {
            try {
                Long.parseLong(strJ03);
            } catch (NumberFormatException unused) {
                C3513e41.X0("gcm.n.event_time");
            }
        }
        c3513e41.F0();
        c3513e41.K0();
    }
}
