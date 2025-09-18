package p000;

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
public final class C6409mA {

    /* renamed from: s */
    public static final C4225iA f37526s = new C4225iA(1);

    /* renamed from: a */
    public final Object f37527a;

    /* renamed from: b */
    public final Object f37528b;

    /* renamed from: c */
    public final Object f37529c;

    /* renamed from: d */
    public final Object f37530d;

    /* renamed from: e */
    public final Object f37531e;

    /* renamed from: f */
    public final Object f37532f;

    /* renamed from: g */
    public final Object f37533g;

    /* renamed from: h */
    public final Object f37534h;

    /* renamed from: i */
    public final Object f37535i;

    /* renamed from: j */
    public final Object f37536j;

    /* renamed from: k */
    public final Object f37537k;

    /* renamed from: l */
    public final Object f37538l;

    /* renamed from: m */
    public final Object f37539m;

    /* renamed from: n */
    public Object f37540n;

    /* renamed from: o */
    public final Object f37541o;

    /* renamed from: p */
    public final Object f37542p;

    /* renamed from: q */
    public final Object f37543q;

    /* renamed from: r */
    public final Serializable f37544r;

    public C6409mA(Context context, Y50 y50, C0202DC c0202dc, C0471HT c0471ht, C1339VH c1339vh, C0197D7 c0197d7, C10030kb1 c10030kb1, C4238iN c4238iN, C1002Pv c1002Pv, C6806sA c6806sA, C1262U3 c1262u3, C6220jA c6220jA, C10910rT1 c10910rT1) {
        this.f37541o = new S81();
        this.f37542p = new S81();
        this.f37543q = new S81();
        this.f37544r = new AtomicBoolean(false);
        this.f37527a = context;
        this.f37532f = y50;
        this.f37528b = c0202dc;
        this.f37533g = c0471ht;
        this.f37529c = c1339vh;
        this.f37534h = c0197d7;
        this.f37530d = c10030kb1;
        this.f37535i = c4238iN;
        this.f37536j = c6806sA;
        this.f37537k = c1262u3;
        this.f37538l = c6220jA;
        this.f37539m = c1002Pv;
        this.f37531e = c10910rT1;
    }

    /* renamed from: a */
    public static C9450g32 m22692a(C6409mA c6409mA) {
        C9450g32 c9450g32M18242c;
        c6409mA.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : C0471HT.m3439m(((File) ((C0471HT) c6409mA.f37533g).f4311c).listFiles(f37526s))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    c9450g32M18242c = AbstractC9376fU1.m18244e(null);
                } catch (ClassNotFoundException unused) {
                    c9450g32M18242c = AbstractC9376fU1.m18242c(new ScheduledThreadPoolExecutor(1), new CallableC6346lA(c6409mA, j));
                }
                arrayList.add(c9450g32M18242c);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return AbstractC9376fU1.m18246g(arrayList);
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m22693b(boolean r30, p000.C1361Vd r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2106
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6409mA.m22693b(boolean, Vd, boolean):void");
    }

    /* renamed from: c */
    public void m22694c(String str, Boolean bool) {
        long j;
        String str2;
        String str3;
        int i;
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Locale locale = Locale.US;
        Y50 y50 = (Y50) this.f37532f;
        C0197D7 c0197d7 = (C0197D7) this.f37534h;
        C0167Ce c0167Ce = new C0167Ce(y50.f14153c, (String) c0197d7.f1851f, (String) c0197d7.f1852g, y50.m9219c().f9702a, AbstractC1374Vq.m8583b(((String) c0197d7.f1849d) != null ? 4 : 1), (C0827N8) c0197d7.f1853h);
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.VERSION.CODENAME;
        C0293Ee c0293Ee = new C0293Ee(str4, str5, AbstractC1378Vu.m8628m());
        Context context = (Context) this.f37527a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        EnumC1252Tu enumC1252Tu = EnumC1252Tu.f11585a;
        String str6 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str6);
        EnumC1252Tu enumC1252Tu2 = EnumC1252Tu.f11585a;
        if (!zIsEmpty) {
            EnumC1252Tu enumC1252Tu3 = (EnumC1252Tu) EnumC1252Tu.f11586b.get(str6.toLowerCase(locale));
            if (enumC1252Tu3 != null) {
                enumC1252Tu2 = enumC1252Tu3;
            }
        }
        int iOrdinal = enumC1252Tu2.ordinal();
        String str7 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jM8616a = AbstractC1378Vu.m8616a(context);
        boolean zM8627l = AbstractC1378Vu.m8627l();
        int iM8622g = AbstractC1378Vu.m8622g();
        String str8 = Build.MANUFACTURER;
        String str9 = Build.PRODUCT;
        ((C6806sA) this.f37536j).mo7025d(str, jCurrentTimeMillis, new C0104Be(c0167Ce, c0293Ee, new C0230De(iOrdinal, str7, iAvailableProcessors, jM8616a, blockCount, zM8627l, iM8622g, str8, str9)));
        if (!bool.booleanValue() || str == null) {
            j = jCurrentTimeMillis;
            str2 = str9;
            str3 = str8;
            i = 4;
        } else {
            C10030kb1 c10030kb1 = (C10030kb1) this.f37530d;
            synchronized (((String) c10030kb1.f36563c)) {
                c10030kb1.f36563c = str;
                j = jCurrentTimeMillis;
                str2 = str9;
                str3 = str8;
                i = 4;
                ((ExecutorC1584ZA) ((C10910rT1) c10030kb1.f36562b).f41679c).m9502a(new RunnableC6757rf(c10030kb1, str, ((C11447vg0) ((AtomicMarkableReference) ((C1338VG) c10030kb1.f36564d).f12475c).getReference()).m25474a(), ((C10141lT0) c10030kb1.f36566f).m22429a(), 18));
            }
        }
        C4238iN c4238iN = (C4238iN) this.f37535i;
        ((InterfaceC0030AT) c4238iN.f29114c).mo141a();
        c4238iN.f29114c = C4238iN.f29111d;
        if (str != null) {
            c4238iN.f29114c = new AG0(((C0471HT) c4238iN.f29113b).m3450j(str, "userlog"));
        }
        ((C6220jA) this.f37538l).m21981b(str);
        C1002Pv c1002Pv = (C1002Pv) this.f37539m;
        C1269UA c1269ua = (C1269UA) c1002Pv.f9351a;
        Charset charset = AbstractC1206TA.f11185a;
        C0543Ic c0543Ic = new C0543Ic();
        c0543Ic.f5029a = "19.4.0";
        C0197D7 c0197d72 = c1269ua.f11668c;
        String str10 = (String) c0197d72.f1847b;
        if (str10 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        c0543Ic.f5030b = str10;
        Y50 y502 = c1269ua.f11667b;
        String str11 = y502.m9219c().f9702a;
        if (str11 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        c0543Ic.f5032d = str11;
        c0543Ic.f5033e = y502.m9219c().f9703b;
        c0543Ic.f5034f = y502.m9219c().f9704c;
        String str12 = (String) c0197d72.f1851f;
        if (str12 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c0543Ic.f5036h = str12;
        String str13 = (String) c0197d72.f1852g;
        if (str13 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        c0543Ic.f5037i = str13;
        c0543Ic.f5031c = i;
        c0543Ic.f5041m = (byte) (c0543Ic.f5041m | 1);
        C1108Rc c1108Rc = new C1108Rc();
        c1108Rc.f10329f = false;
        byte b = (byte) (c1108Rc.f10336m | 2);
        c1108Rc.f10327d = j;
        c1108Rc.f10336m = (byte) (b | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        c1108Rc.f10325b = str;
        String str14 = C1269UA.f11665g;
        if (str14 == null) {
            throw new NullPointerException("Null generator");
        }
        c1108Rc.f10324a = str14;
        String str15 = y502.f14153c;
        if (str15 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str16 = y502.m9219c().f9702a;
        C0827N8 c0827n8 = (C0827N8) c0197d72.f1853h;
        c1108Rc.f10330g = new C1234Tc(str15, str12, str13, str16, c0827n8.m5564r().f47104b, c0827n8.m5564r().f47105c);
        C6692qd c6692qd = new C6692qd();
        c6692qd.f41063a = 3;
        c6692qd.f41067e = (byte) (c6692qd.f41067e | 1);
        c6692qd.f41064b = str4;
        c6692qd.f41065c = str5;
        c6692qd.f41066d = AbstractC1378Vu.m8628m();
        c6692qd.f41067e = (byte) (c6692qd.f41067e | 2);
        c1108Rc.f10332i = c6692qd.m24028a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str6) && (num = (Integer) C1269UA.f11664f.get(str6.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jM8616a2 = AbstractC1378Vu.m8616a(c1269ua.f11666a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean zM8627l2 = AbstractC1378Vu.m8627l();
        int iM8622g2 = AbstractC1378Vu.m8622g();
        C1360Vc c1360Vc = new C1360Vc();
        c1360Vc.f12639a = iIntValue;
        byte b2 = (byte) (c1360Vc.f12648j | 1);
        c1360Vc.f12640b = str7;
        c1360Vc.f12641c = iAvailableProcessors2;
        c1360Vc.f12642d = jM8616a2;
        c1360Vc.f12643e = blockCount2;
        c1360Vc.f12644f = zM8627l2;
        c1360Vc.f12645g = iM8622g2;
        c1360Vc.f12648j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        c1360Vc.f12646h = str3;
        c1360Vc.f12647i = str2;
        c1108Rc.f10333j = c1360Vc.m8513a();
        c1108Rc.f10335l = 3;
        c1108Rc.f10336m = (byte) (c1108Rc.f10336m | 4);
        c0543Ic.f5038j = c1108Rc.m7048a();
        C0606Jc c0606JcM3953a = c0543Ic.m3953a();
        C0471HT c0471ht = ((C1458XA) c1002Pv.f9352b).f13590b;
        C1171Sc c1171Sc = c0606JcM3953a.f5635k;
        if (c1171Sc == null) {
            return;
        }
        String str17 = c1171Sc.f10866b;
        try {
            C1458XA.f13586g.getClass();
            C1458XA.m8941f(c0471ht.m3450j(str17, "report"), C1395WA.f13016a.m6779v(c0606JcM3953a));
            File fileM3450j = c0471ht.m3450j(str17, "start-time");
            long j2 = c1171Sc.f10868d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileM3450j), C1458XA.f13584e);
            try {
                outputStreamWriter.write("");
                fileM3450j.setLastModified(j2 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: d */
    public void m22695d(long j) throws IOException {
        try {
            C0471HT c0471ht = (C0471HT) this.f37533g;
            String str = ".ae" + j;
            c0471ht.getClass();
            if (new File((File) c0471ht.f4311c, str).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: e */
    public String m22696e() {
        NavigableSet navigableSetM8943c = ((C1458XA) ((C1002Pv) this.f37539m).f9352b).m8943c();
        if (navigableSetM8943c.isEmpty()) {
            return null;
        }
        return (String) navigableSetM8943c.first();
    }

    /* renamed from: f */
    public void m22697f() throws IOException {
        InputStream resourceAsStream;
        try {
            ClassLoader classLoader = C6409mA.class.getClassLoader();
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
                    ((C1338VG) ((C10030kb1) this.f37530d).f36565e).m8348m("com.crashlytics.version-control-info", strEncodeToString);
                } catch (IllegalArgumentException e) {
                    Context context = (Context) this.f37527a;
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

    /* renamed from: g */
    public void m22698g(C9450g32 c9450g32) {
        C9450g32 c9450g322;
        C9450g32 c9450g32M21936b;
        C0471HT c0471ht = ((C1458XA) ((C1002Pv) this.f37539m).f9352b).f13590b;
        boolean zIsEmpty = C0471HT.m3439m(((File) c0471ht.f4313e).listFiles()).isEmpty();
        S81 s81 = (S81) this.f37541o;
        if (zIsEmpty && C0471HT.m3439m(((File) c0471ht.f4314f).listFiles()).isEmpty() && C0471HT.m3439m(((File) c0471ht.f4315g).listFiles()).isEmpty()) {
            s81.m7186d(Boolean.FALSE);
            return;
        }
        C0202DC c0202dc = (C0202DC) this.f37528b;
        if (c0202dc.m1590b()) {
            s81.m7186d(Boolean.FALSE);
            c9450g32M21936b = AbstractC9376fU1.m18244e(Boolean.TRUE);
        } else {
            s81.m7186d(Boolean.TRUE);
            synchronized (c0202dc.f1889c) {
                c9450g322 = c0202dc.f1890d.f10598a;
            }
            c9450g32M21936b = AbstractC9809it0.m21936b(c9450g322.mo11145l(new C7408Bv0(11)), ((S81) this.f37542p).f10598a);
        }
        c9450g32M21936b.m18387n((ExecutorC1584ZA) ((C10910rT1) this.f37531e).f41678b, new C4238iN(this, c9450g32, false, 10));
    }

    public C6409mA(C9196e41 c9196e41) throws JSONException, NumberFormatException {
        String[] strArr;
        String[] strArr2;
        this.f37527a = c9196e41.m17848J0("gcm.n.title");
        this.f37528b = c9196e41.m17845H0("gcm.n.title");
        Object[] objArrM17844G0 = c9196e41.m17844G0("gcm.n.title");
        if (objArrM17844G0 == null) {
            strArr = null;
        } else {
            strArr = new String[objArrM17844G0.length];
            for (int i = 0; i < objArrM17844G0.length; i++) {
                strArr[i] = String.valueOf(objArrM17844G0[i]);
            }
        }
        this.f37529c = strArr;
        this.f37530d = c9196e41.m17848J0("gcm.n.body");
        this.f37531e = c9196e41.m17845H0("gcm.n.body");
        Object[] objArrM17844G02 = c9196e41.m17844G0("gcm.n.body");
        if (objArrM17844G02 == null) {
            strArr2 = null;
        } else {
            strArr2 = new String[objArrM17844G02.length];
            for (int i2 = 0; i2 < objArrM17844G02.length; i2++) {
                strArr2[i2] = String.valueOf(objArrM17844G02[i2]);
            }
        }
        this.f37532f = strArr2;
        this.f37533g = c9196e41.m17848J0("gcm.n.icon");
        String strM17848J0 = c9196e41.m17848J0("gcm.n.sound2");
        this.f37535i = TextUtils.isEmpty(strM17848J0) ? c9196e41.m17848J0("gcm.n.sound") : strM17848J0;
        this.f37536j = c9196e41.m17848J0("gcm.n.tag");
        this.f37537k = c9196e41.m17848J0("gcm.n.color");
        this.f37538l = c9196e41.m17848J0("gcm.n.click_action");
        this.f37539m = c9196e41.m17848J0("gcm.n.android_channel_id");
        String strM17848J02 = c9196e41.m17848J0("gcm.n.link_android");
        strM17848J02 = TextUtils.isEmpty(strM17848J02) ? c9196e41.m17848J0("gcm.n.link") : strM17848J02;
        this.f37540n = TextUtils.isEmpty(strM17848J02) ? null : Uri.parse(strM17848J02);
        this.f37534h = c9196e41.m17848J0("gcm.n.image");
        this.f37541o = c9196e41.m17848J0("gcm.n.ticker");
        this.f37542p = c9196e41.m17840D0("gcm.n.notification_priority");
        this.f37543q = c9196e41.m17840D0("gcm.n.visibility");
        this.f37544r = c9196e41.m17840D0("gcm.n.notification_count");
        c9196e41.m17839C0("gcm.n.sticky");
        c9196e41.m17839C0("gcm.n.local_only");
        c9196e41.m17839C0("gcm.n.default_sound");
        c9196e41.m17839C0("gcm.n.default_vibrate_timings");
        c9196e41.m17839C0("gcm.n.default_light_settings");
        String strM17848J03 = c9196e41.m17848J0("gcm.n.event_time");
        if (!TextUtils.isEmpty(strM17848J03)) {
            try {
                Long.parseLong(strM17848J03);
            } catch (NumberFormatException unused) {
                C9196e41.m17835X0("gcm.n.event_time");
            }
        }
        c9196e41.m17842F0();
        c9196e41.m17849K0();
    }
}
