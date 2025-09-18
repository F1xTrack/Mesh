package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.runtime.ReactHostImpl;
import com.google.android.gms.common.internal.Preconditions;
import expo.modules.filesystem.DownloadOptions;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes.dex */
public final class T71 implements InterfaceC7482Dg0, InterfaceC7864Kp0, InterfaceC0966PL, InterfaceC0111Bl, E50 {

    /* renamed from: e */
    public static final C7564Ev0 f11171e = new C7564Ev0(17);

    /* renamed from: f */
    public static final C8417Vf1 f11172f = new C8417Vf1(2);

    /* renamed from: a */
    public Object f11173a;

    /* renamed from: b */
    public Object f11174b;

    /* renamed from: c */
    public Object f11175c;

    /* renamed from: d */
    public Object f11176d;

    public /* synthetic */ T71(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f11173a = obj;
        this.f11174b = obj2;
        this.f11175c = obj3;
        this.f11176d = obj4;
    }

    /* renamed from: F */
    public static void m7551F(String str) throws NoSuchAlgorithmException, IOException {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return;
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
            e.toString();
        }
    }

    /* renamed from: I */
    public static boolean m7552I(Context context) {
        O90.m5968f(context, "context");
        if ((context.getApplicationInfo().flags & 4194304) != 0) {
            return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) || (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1);
        }
        return false;
    }

    /* renamed from: Q */
    public static void m7553Q(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x028a A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #2 {, blocks: (B:112:0x0048, B:123:0x0081, B:127:0x0088, B:143:0x00bc, B:180:0x0285, B:182:0x028a, B:183:0x028d, B:140:0x00b4, B:142:0x00b9), top: B:191:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0285 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[Catch: all -> 0x0085, SYNTHETIC, TryCatch #2 {, blocks: (B:112:0x0048, B:123:0x0081, B:127:0x0088, B:143:0x00bc, B:180:0x0285, B:182:0x028a, B:183:0x028d, B:140:0x00b4, B:142:0x00b9), top: B:191:0x0048 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m7554h(p000.T71 r43) throws android.content.res.Resources.NotFoundException, java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.T71.m7554h(T71):java.lang.String");
    }

    /* renamed from: A */
    public synchronized ArrayList m7555A(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.f11173a).iterator();
            while (it.hasNext()) {
                C10577ot0 c10577ot0 = (C10577ot0) it.next();
                if (!((HashSet) this.f11175c).contains(c10577ot0) && c10577ot0.f39339a.isAssignableFrom(cls)) {
                    ((HashSet) this.f11175c).add(c10577ot0);
                    arrayList.add(c10577ot0.f39341c.mo8114a(this));
                    ((HashSet) this.f11175c).remove(c10577ot0);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* renamed from: B */
    public InterfaceC6976us m7556B(C0055As c0055As, List list) {
        O90.m5968f(c0055As, "classId");
        return (InterfaceC6976us) ((C8270Sk0) this.f11176d).invoke(new C8032Nv0(c0055As, list));
    }

    /* renamed from: C */
    public synchronized ArrayList m7557C(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f11173a).iterator();
        while (it.hasNext()) {
            C10577ot0 c10577ot0 = (C10577ot0) it.next();
            if (!arrayList.contains(c10577ot0.f39340b) && c10577ot0.f39339a.isAssignableFrom(cls)) {
                arrayList.add(c10577ot0.f39340b);
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    public C6840si m7558D() {
        if (((ReactHostImpl) ((AtomicReference) this.f11174b).get()) == null) {
            return null;
        }
        return C6840si.f42553a;
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: E */
    public void mo1016E(int i, C7604Fp0 c7604Fp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0) {
        if (m7563M(i, c7604Fp0)) {
            ((C1356VY) this.f11174b).m8476N(c9535gk0, m7564O(c11081sp0, c7604Fp0));
        }
    }

    /* renamed from: G */
    public S71 m7559G(C7551Eo1 c7551Eo1) {
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = c7551Eo1.f2911a;
        if (str == null) {
            c10781qT0M24005a.mo2032V(1);
        } else {
            c10781qT0M24005a.mo2033d(1, str);
        }
        c10781qT0M24005a.mo2030E(2, c7551Eo1.f2912b);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11173a;
        workDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            int iM5396c = MY1.m5396c(cursorM7035c, "work_spec_id");
            int iM5396c2 = MY1.m5396c(cursorM7035c, "generation");
            int iM5396c3 = MY1.m5396c(cursorM7035c, "system_id");
            S71 s71 = null;
            String string = null;
            if (cursorM7035c.moveToFirst()) {
                if (!cursorM7035c.isNull(iM5396c)) {
                    string = cursorM7035c.getString(iM5396c);
                }
                s71 = new S71(string, cursorM7035c.getInt(iM5396c2), cursorM7035c.getInt(iM5396c3));
            }
            return s71;
        } finally {
            cursorM7035c.close();
            c10781qT0M24005a.release();
        }
    }

    /* renamed from: H */
    public void m7560H(S71 s71) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11173a;
        workDatabase_Impl.m23792b();
        workDatabase_Impl.m23793c();
        try {
            ((C1276UH) this.f11174b).m7954h(s71);
            workDatabase_Impl.m23799n();
        } finally {
            workDatabase_Impl.m23795j();
        }
    }

    /* renamed from: J */
    public boolean m7561J(InterfaceC7633Gd1 interfaceC7633Gd1) {
        O90.m5968f(interfaceC7633Gd1, "descriptor");
        if (!O90.m5963a((InterfaceC7633Gd1) this.f11174b, interfaceC7633Gd1)) {
            T71 t71 = (T71) this.f11173a;
            if (!(t71 != null ? t71.m7561J(interfaceC7633Gd1) : false)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: K */
    public void mo1025K(int i, C7604Fp0 c7604Fp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0, IOException iOException, boolean z) {
        if (m7563M(i, c7604Fp0)) {
            ((C1356VY) this.f11174b).m8479Q(c9535gk0, m7564O(c11081sp0, c7604Fp0), iOException, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0041, code lost:
    
        if (r9 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0043, code lost:
    
        m7551F(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0046, code lost:
    
        return;
     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m7562L(int r9, java.lang.String r10) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "nativeLoad() returned error for "
            java.lang.Object r1 = r8.f11174b
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto Lc
            java.lang.System.load(r10)
            return
        Lc:
            r1 = 4
            r9 = r9 & r1
            if (r9 != r1) goto L15
            java.lang.Object r9 = r8.f11175c
        L12:
            java.lang.String r9 = (java.lang.String) r9
            goto L18
        L15:
            java.lang.Object r9 = r8.f11176d
            goto L12
        L18:
            r1 = 0
            java.lang.Object r2 = r8.f11173a     // Catch: java.lang.Throwable -> L6c java.lang.Throwable -> L6e
            java.lang.Runtime r2 = (java.lang.Runtime) r2     // Catch: java.lang.Throwable -> L6c java.lang.Throwable -> L6e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Throwable -> L6e
            java.lang.Object r3 = r8.f11174b     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r4 = r8.f11173a     // Catch: java.lang.Throwable -> L68
            java.lang.Runtime r4 = (java.lang.Runtime) r4     // Catch: java.lang.Throwable -> L68
            java.lang.Class<com.facebook.soloader.SoLoader> r5 = com.facebook.soloader.SoLoader.class
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L64
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L68
            r7 = 0
            r6[r7] = r10     // Catch: java.lang.Throwable -> L68
            r7 = 1
            r6[r7] = r5     // Catch: java.lang.Throwable -> L68
            r5 = 2
            r6[r5] = r9     // Catch: java.lang.Throwable -> L68
            java.lang.Object r9 = r3.invoke(r4, r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L64
            if (r9 != 0) goto L4a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47
            if (r9 == 0) goto L46
            m7551F(r10)
        L46:
            return
        L47:
            r0 = move-exception
            r1 = r9
            goto L6a
        L4a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L47
            r1.append(r10)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch: java.lang.Throwable -> L47
            r1.append(r9)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L47
            G21 r9 = new G21     // Catch: java.lang.Throwable -> L64
            r9.<init>(r10, r1)     // Catch: java.lang.Throwable -> L64
            throw r9     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = move-exception
            goto L6a
        L66:
            r0 = r9
            goto L6a
        L68:
            r9 = move-exception
            goto L66
        L6a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            throw r0     // Catch: java.lang.Throwable -> L6c java.lang.Throwable -> L6e java.lang.Throwable -> L6e java.lang.Throwable -> L6e
        L6c:
            r9 = move-exception
            goto L8d
        L6e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r9.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "nativeLoad() error during invocation for "
            r9.append(r0)     // Catch: java.lang.Throwable -> L6c
            r9.append(r10)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = ": "
            r9.append(r0)     // Catch: java.lang.Throwable -> L6c
            r9.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Throwable -> L6c
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L6c
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            throw r9     // Catch: java.lang.Throwable -> L6c
        L8d:
            if (r1 == 0) goto L92
            m7551F(r10)
        L92:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.T71.m7562L(int, java.lang.String):void");
    }

    /* renamed from: M */
    public boolean m7563M(int i, C7604Fp0 c7604Fp0) {
        C7604Fp0 c7604Fp0Mo8635u;
        Object obj = this.f11173a;
        AbstractC1379Vv abstractC1379Vv = (AbstractC1379Vv) this.f11176d;
        if (c7604Fp0 != null) {
            c7604Fp0Mo8635u = abstractC1379Vv.mo8635u(obj, c7604Fp0);
            if (c7604Fp0Mo8635u == null) {
                return false;
            }
        } else {
            c7604Fp0Mo8635u = null;
        }
        int iMo8637x = abstractC1379Vv.mo8637x(i, obj);
        C1356VY c1356vy = (C1356VY) this.f11174b;
        if (c1356vy.f12611b != iMo8637x || !AbstractC7485Dh1.m1812a((C7604Fp0) c1356vy.f12612c, c7604Fp0Mo8635u)) {
            this.f11174b = new C1356VY((CopyOnWriteArrayList) abstractC1379Vv.f41799c.f12613d, iMo8637x, c7604Fp0Mo8635u);
        }
        C0903OL c0903ol = (C0903OL) this.f11175c;
        if (c0903ol.f8364a == iMo8637x && AbstractC7485Dh1.m1812a(c0903ol.f8365b, c7604Fp0Mo8635u)) {
            return true;
        }
        this.f11175c = new C0903OL(abstractC1379Vv.f41800d.f8366c, iMo8637x, c7604Fp0Mo8635u);
        return true;
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: N */
    public void mo1030N(int i, C7604Fp0 c7604Fp0) {
        if (m7563M(i, c7604Fp0)) {
            ((C0903OL) this.f11175c).m6016b();
        }
    }

    /* renamed from: O */
    public C11081sp0 m7564O(C11081sp0 c11081sp0, C7604Fp0 c7604Fp0) {
        AbstractC1379Vv abstractC1379Vv = (AbstractC1379Vv) this.f11176d;
        Object obj = this.f11173a;
        long j = c11081sp0.f42627f;
        long jMo8636w = abstractC1379Vv.mo8636w(j, obj);
        long j2 = c11081sp0.f42628g;
        long jMo8636w2 = abstractC1379Vv.mo8636w(j2, obj);
        if (jMo8636w == j && jMo8636w2 == j2) {
            return c11081sp0;
        }
        return new C11081sp0(c11081sp0.f42622a, c11081sp0.f42623b, c11081sp0.f42624c, c11081sp0.f42625d, c11081sp0.f42626e, jMo8636w, jMo8636w2);
    }

    /* renamed from: P */
    public synchronized ArrayList m7565P() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f11173a).iterator();
        while (it.hasNext()) {
            C10577ot0 c10577ot0 = (C10577ot0) it.next();
            if (c10577ot0.f39339a.isAssignableFrom(E10.class) && c10577ot0.f39340b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(c10577ot0.f39341c);
            }
        }
        return arrayList;
    }

    /* renamed from: R */
    public synchronized ArrayList m7566R(C11481vx0 c11481vx0) {
        ArrayList arrayListM7565P;
        arrayListM7565P = m7565P();
        m7572w(E10.class, InputStream.class, c11481vx0);
        return arrayListM7565P;
    }

    /* renamed from: S */
    public C0735Lg m7567S(List list) {
        ArrayList arrayListM7573x = m7573x(list);
        if (arrayListM7573x.size() < 2) {
            return (C0735Lg) AbstractC11239u22.m25078a(null, arrayListM7573x);
        }
        Collections.sort(arrayListM7573x, new C0295Eg(1));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((C0735Lg) arrayListM7573x.get(0)).f6794c;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListM7573x.size()) {
                break;
            }
            C0735Lg c0735Lg = (C0735Lg) arrayListM7573x.get(i3);
            if (i2 == c0735Lg.f6794c) {
                arrayList.add(new Pair(c0735Lg.f6793b, Integer.valueOf(c0735Lg.f6795d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (C0735Lg) arrayListM7573x.get(0);
            }
        }
        HashMap map = (HashMap) this.f11175c;
        C0735Lg c0735Lg2 = (C0735Lg) map.get(arrayList);
        if (c0735Lg2 == null) {
            List listSubList = arrayListM7573x.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < listSubList.size(); i5++) {
                i4 += ((C0735Lg) listSubList.get(i5)).f6795d;
            }
            int iNextInt = ((Random) this.f11176d).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i >= listSubList.size()) {
                    c0735Lg2 = (C0735Lg) AbstractC11239u22.m25079b(listSubList);
                    break;
                }
                C0735Lg c0735Lg3 = (C0735Lg) listSubList.get(i);
                i6 += c0735Lg3.f6795d;
                if (iNextInt < i6) {
                    c0735Lg2 = c0735Lg3;
                    break;
                }
                i++;
            }
            map.put(arrayList, c0735Lg2);
        }
        return c0735Lg2;
    }

    /* renamed from: T */
    public synchronized void m7568T(int i, int i2, int i3, int i4) {
        SurfaceHandlerBinding surfaceHandlerBinding = (SurfaceHandlerBinding) this.f11175c;
        Context context = (Context) this.f11176d;
        O90.m5968f(context, "context");
        surfaceHandlerBinding.setLayoutConstraints(i, i2, i3, i4, context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true), m7552I((Context) this.f11176d), ((Context) this.f11176d).getResources().getDisplayMetrics().density);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0118 A[Catch: NumberFormatException | JSONException -> 0x0120, NumberFormatException | JSONException -> 0x0120, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0120, blocks: (B:95:0x002b, B:129:0x009b, B:129:0x009b, B:130:0x00a8, B:130:0x00a8, B:132:0x00b5, B:132:0x00b5, B:134:0x00c7, B:134:0x00c7, B:135:0x00d0, B:135:0x00d0, B:136:0x00d4, B:136:0x00d4, B:138:0x00e1, B:138:0x00e1, B:140:0x00f3, B:140:0x00f3, B:141:0x00fc, B:141:0x00fc, B:142:0x0100, B:142:0x0100, B:143:0x010c, B:143:0x010c, B:144:0x0118, B:144:0x0118, B:106:0x0058, B:109:0x0062, B:112:0x006c, B:115:0x0076, B:118:0x0080), top: B:158:0x002b, outer: #0 }] */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle m7569U() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.T71.m7569U():android.os.Bundle");
    }

    @Override // p000.InterfaceC7482Dg0
    /* renamed from: U0 */
    public void mo1747U0(C0181Cs c0181Cs) {
        ((ArrayList) this.f11173a).add(new C9651he0(new C9395fe0(c0181Cs)));
    }

    /* renamed from: V */
    public void m7570V(Bundle bundle) throws JSONException {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        UM1 um1 = (UM1) this.f11176d;
        SharedPreferences.Editor editorEdit = um1.m7993C1().edit();
        int size = bundle2.size();
        String str = (String) this.f11173a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        C11304uY1.m25207a();
                        if (((C9110dP1) um1.f11615b).f26037g.m6511E1(null, IB1.f4763R0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", UcumUtils.UCUM_SECONDS);
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", UcumUtils.UCUM_DAYS);
                            } else {
                                um1.mo6070n().f8378g.m24554c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", String.valueOf(obj));
                            if (obj instanceof String) {
                                jSONObject.put("t", UcumUtils.UCUM_SECONDS);
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", UcumUtils.UCUM_DAYS);
                            } else {
                                um1.mo6070n().f8378g.m24554c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        um1.mo6070n().f8378g.m24554c(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f11175c = bundle2;
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: Z */
    public void mo851Z(InterfaceC6843sl interfaceC6843sl, HS0 hs0) {
        O90.m5968f(interfaceC6843sl, "call");
        Uri uri = (Uri) this.f11175c;
        C1414WT c1414wt = (C1414WT) this.f11174b;
        c1414wt.getClass();
        File fileM8775t = C1414WT.m8775t(uri);
        fileM8775t.delete();
        C11790yN0 c11790yN0M4273a = JI1.m4273a(JI1.m4278f(fileM8775t));
        IS0 is0 = hs0.f4301g;
        O90.m5965c(is0);
        c11790yN0M4273a.mo4396i(is0.mo3385w());
        c11790yN0M4273a.close();
        Bundle bundle = new Bundle();
        bundle.putString("uri", Uri.fromFile(fileM8775t).toString());
        bundle.putInt("status", hs0.f4298d);
        bundle.putBundle("headers", C1414WT.m8771k(c1414wt, hs0.f4300f));
        if (((DownloadOptions) this.f11176d).getMd5()) {
            bundle.putString("md5", C1414WT.m8769i(c1414wt, fileM8775t));
        }
        hs0.close();
        ((InterfaceC11518wE0) this.f11173a).resolve(bundle);
    }

    @Override // p000.E50
    /* renamed from: a */
    public E50 mo2015a(int i, int i2, int i3) {
        if (i == 2) {
            if (i2 >= 0) {
                ((DecimalFormat) this.f11174b).setMinimumFractionDigits(i2);
            }
            if (i3 >= 0) {
                ((DecimalFormat) this.f11174b).setMaximumFractionDigits(i3);
            }
        }
        return this;
    }

    @Override // p000.E50
    /* renamed from: b */
    public AttributedCharacterIterator mo2016b(double d) {
        return ((DecimalFormat) this.f11173a).formatToCharacterIterator(Double.valueOf(d));
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: b0 */
    public void mo1058b0(int i, C7604Fp0 c7604Fp0) {
        if (m7563M(i, c7604Fp0)) {
            ((C0903OL) this.f11175c).m6015a();
        }
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: c */
    public void mo1059c(int i, C7604Fp0 c7604Fp0, Exception exc) {
        if (m7563M(i, c7604Fp0)) {
            ((C0903OL) this.f11175c).m6018d(exc);
        }
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: d */
    public void mo1062d(int i, C7604Fp0 c7604Fp0, C11081sp0 c11081sp0) {
        if (m7563M(i, c7604Fp0)) {
            ((C1356VY) this.f11174b).m8505z(m7564O(c11081sp0, c7604Fp0));
        }
    }

    @Override // p000.E50
    /* renamed from: e */
    public String mo2017e(double d) {
        return ((DecimalFormat) this.f11173a).format(Double.valueOf(d));
    }

    @Override // p000.InterfaceC7482Dg0
    /* renamed from: e0 */
    public void mo1748e0(Object obj) {
        ((ArrayList) this.f11173a).add(U41.m7873n((U41) this.f11174b, (C8340Tt0) this.f11175c, obj));
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: f */
    public void mo1068f(int i, C7604Fp0 c7604Fp0, C11081sp0 c11081sp0) {
        if (m7563M(i, c7604Fp0)) {
            ((C1356VY) this.f11174b).m8498h0(m7564O(c11081sp0, c7604Fp0));
        }
    }

    @Override // p000.E50
    /* renamed from: g */
    public String mo2018g(Y40 y40) {
        return "latn";
    }

    @Override // p000.E50
    /* renamed from: i */
    public E50 mo2019i(B50 b50) {
        if (b50 == B50.f561b) {
            ((DecimalFormat) this.f11174b).setPositivePrefix("");
            ((DecimalFormat) this.f11174b).setPositiveSuffix("");
            ((DecimalFormat) this.f11174b).setNegativePrefix("");
            ((DecimalFormat) this.f11174b).setNegativeSuffix("");
        }
        return this;
    }

    @Override // p000.InterfaceC7482Dg0
    /* renamed from: i0 */
    public void mo1749i0(C0055As c0055As, C8340Tt0 c8340Tt0) {
        ((ArrayList) this.f11173a).add(new C1220TO(c0055As, c8340Tt0));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099 A[RETURN] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m7571j(java.lang.String r10, p000.AbstractC1571Yy r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p000.C8605Yv1
            if (r0 == 0) goto L13
            r0 = r11
            Yv1 r0 = (p000.C8605Yv1) r0
            int r1 = r0.f14618e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14618e = r1
            goto L18
        L13:
            Yv1 r0 = new Yv1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f14616c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f14618e
            Tf1 r3 = p000.C8313Tf1.f11463a
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 == r6) goto L39
            if (r2 != r4) goto L31
            p000.RQ1.m7017d(r11)
            goto L9a
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            T71 r10 = r0.f14614a
            p000.RQ1.m7017d(r11)
            goto L8b
        L3f:
            java.lang.String r10 = r0.f14615b
            T71 r2 = r0.f14614a
            p000.RQ1.m7017d(r11)
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r8
            goto L62
        L4b:
            p000.RQ1.m7017d(r11)
            r0.f14614a = r9
            r0.f14615b = r10
            r0.f14618e = r5
            java.lang.Object r11 = r9.f11174b
            Ir1 r11 = (p000.C7765Ir1) r11
            java.lang.Object r11 = r11.m4056g(r0)
            if (r11 != r1) goto L5f
            return r1
        L5f:
            r2 = r11
            r11 = r10
            r10 = r9
        L62:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L9a
            java.lang.Object r2 = r10.f11176d
            com.vk.push.common.Logger r2 = (com.p019vk.push.common.Logger) r2
            java.lang.String r5 = "Sending new push token to the client app"
            com.vk.push.common.Logger.DefaultImpls.info$default(r2, r5, r7, r6, r7)
            java.lang.Object r2 = r10.f11175c
            Kq1 r2 = (p000.C7867Kq1) r2
            r2.onNewPushToken(r11)
            r0.f14614a = r10
            r0.f14615b = r7
            r0.f14618e = r6
            java.lang.Object r2 = r10.f11173a
            Uq1 r2 = (p000.C8387Uq1) r2
            java.lang.Object r11 = r2.m8189c(r11, r0)
            if (r11 != r1) goto L8b
            return r1
        L8b:
            java.lang.Object r10 = r10.f11174b
            Ir1 r10 = (p000.C7765Ir1) r10
            r0.f14614a = r7
            r0.f14618e = r4
            java.lang.Object r10 = r10.m4051b(r0)
            if (r10 != r1) goto L9a
            return r1
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.T71.m7571j(java.lang.String, Yy):java.lang.Object");
    }

    @Override // p000.InterfaceC7482Dg0
    /* renamed from: k */
    public void mo1750k() {
        ArrayList arrayList = (ArrayList) this.f11173a;
        C10030kb1 c10030kb1 = (C10030kb1) this.f11176d;
        c10030kb1.getClass();
        O90.m5968f(arrayList, "elements");
        C8340Tt0 c8340Tt0 = (C8340Tt0) this.f11175c;
        if (c8340Tt0 == null) {
            return;
        }
        C8473Wh1 c8473Wh1M3085g = GZ1.m3085g(c8340Tt0, (InterfaceC6976us) c10030kb1.f36564d);
        if (c8473Wh1M3085g != null) {
            HashMap map = (HashMap) c10030kb1.f36562b;
            List listM18572b = AbstractC9502gT1.m18572b(arrayList);
            AbstractC7742Ig0 type = c8473Wh1M3085g.getType();
            O90.m5967e(type, "getType(...)");
            map.put(c8340Tt0, new C7791Je1(listM18572b, type));
            return;
        }
        if (((U41) c10030kb1.f36563c).m7889x((C0055As) c10030kb1.f36565e) && O90.m5963a(c8340Tt0.m7801b(), "value")) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C0384G5) {
                    arrayList2.add(next);
                }
            }
            List list = (List) c10030kb1.f36566f;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                list.add((InterfaceC7116x5) ((C0384G5) it2.next()).f2329a);
            }
        }
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: k0 */
    public void mo1084k0(int i, C7604Fp0 c7604Fp0) {
        if (m7563M(i, c7604Fp0)) {
            ((C0903OL) this.f11175c).m6019e();
        }
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: l */
    public void mo1086l(int i, C7604Fp0 c7604Fp0, int i2) {
        if (m7563M(i, c7604Fp0)) {
            ((C0903OL) this.f11175c).m6017c(i2);
        }
    }

    @Override // p000.E50
    /* renamed from: m */
    public String mo2020m(AttributedCharacterIterator.Attribute attribute, double d) {
        return "literal";
    }

    @Override // p000.E50
    /* renamed from: n */
    public E50 mo2021n(String str, EnumC11754y50 enumC11754y50) {
        if (((C50) this.f11176d) == C50.f1188c) {
            Currency currency = Currency.getInstance(str);
            ((DecimalFormat) this.f11174b).setCurrency(currency);
            int iOrdinal = enumC11754y50.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C8010Nk0 c8010Nk0 = (C8010Nk0) this.f11175c;
                    c8010Nk0.m5827h();
                    str = currency.getSymbol(c8010Nk0.f7982a);
                } else {
                    C8010Nk0 c8010Nk02 = (C8010Nk0) this.f11175c;
                    c8010Nk02.m5827h();
                    str = currency.getDisplayName(c8010Nk02.f7982a);
                }
            }
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) this.f11174b).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(str);
            ((DecimalFormat) this.f11174b).setDecimalFormatSymbols(decimalFormatSymbols);
            ((DecimalFormat) this.f11174b).getDecimalFormatSymbols().setCurrencySymbol(str);
        }
        return this;
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: o */
    public void mo1095o(int i, C7604Fp0 c7604Fp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0) {
        if (m7563M(i, c7604Fp0)) {
            ((C1356VY) this.f11174b).m8482T(c9535gk0, m7564O(c11081sp0, c7604Fp0));
        }
    }

    @Override // p000.E50
    /* renamed from: q */
    public E50 mo2023q(int i) {
        if (i != -1) {
            ((DecimalFormat) this.f11174b).setMinimumIntegerDigits(i);
        }
        return this;
    }

    @Override // p000.InterfaceC7482Dg0
    /* renamed from: r */
    public InterfaceC7430Cg0 mo1751r(C0055As c0055As) {
        ArrayList arrayList = new ArrayList();
        return new C10919rY0(((U41) this.f11174b).m7891z(c0055As, W21.f12940O0, arrayList), this, arrayList);
    }

    @Override // p000.E50
    /* renamed from: t */
    public E50 mo2025t(Y40 y40, String str, C50 c50, EnumC11881z50 enumC11881z50, A50 a50, EnumC11627x50 enumC11627x50) {
        NumberFormat numberFormat = NumberFormat.getInstance((Locale) y40.mo5826g());
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        this.f11174b = decimalFormat;
        this.f11173a = decimalFormat;
        this.f11175c = (C8010Nk0) y40;
        this.f11176d = c50;
        return this;
    }

    @Override // p000.E50
    /* renamed from: u */
    public E50 mo2026u(boolean z) {
        ((DecimalFormat) this.f11174b).setGroupingUsed(z);
        return this;
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: v */
    public void mo1109v(int i, C7604Fp0 c7604Fp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0) {
        if (m7563M(i, c7604Fp0)) {
            ((C1356VY) this.f11174b).m8473K(c9535gk0, m7564O(c11081sp0, c7604Fp0));
        }
    }

    /* renamed from: w */
    public synchronized void m7572w(Class cls, Class cls2, InterfaceC11343us0 interfaceC11343us0) {
        C10577ot0 c10577ot0 = new C10577ot0(cls, cls2, interfaceC11343us0);
        ArrayList arrayList = (ArrayList) this.f11173a;
        arrayList.add(arrayList.size(), c10577ot0);
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: w0 */
    public void mo852w0(InterfaceC6843sl interfaceC6843sl, IOException iOException) {
        O90.m5968f(interfaceC6843sl, "call");
        String str = AbstractC1477XT.f13800a;
        iOException.getMessage();
        ((InterfaceC11518wE0) this.f11173a).reject(str, iOException.getMessage(), iOException);
    }

    /* renamed from: x */
    public ArrayList m7573x(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.f11173a;
        m7553Q(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.f11174b;
        m7553Q(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C0735Lg c0735Lg = (C0735Lg) list.get(i);
            if (!map.containsKey(c0735Lg.f6793b) && !map2.containsKey(Integer.valueOf(c0735Lg.f6794c))) {
                arrayList.add(c0735Lg);
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public C6834sc m7574y() {
        String strM26232i = ((Integer) this.f11173a) == null ? " audioSource" : "";
        if (((Integer) this.f11174b) == null) {
            strM26232i = strM26232i.concat(" sampleRate");
        }
        if (((Integer) this.f11175c) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " channelCount");
        }
        if (((Integer) this.f11176d) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " audioFormat");
        }
        if (!strM26232i.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strM26232i));
        }
        int iIntValue = ((Integer) this.f11173a).intValue();
        int iIntValue2 = ((Integer) this.f11174b).intValue();
        int iIntValue3 = ((Integer) this.f11175c).intValue();
        int iIntValue4 = ((Integer) this.f11176d).intValue();
        C6834sc c6834sc = new C6834sc(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        String strM26232i2 = iIntValue == -1 ? " audioSource" : "";
        if (iIntValue2 <= 0) {
            strM26232i2 = strM26232i2.concat(" sampleRate");
        }
        if (iIntValue3 <= 0) {
            strM26232i2 = AbstractC7222ym.m26232i(strM26232i2, " channelCount");
        }
        if (iIntValue4 == -1) {
            strM26232i2 = AbstractC7222ym.m26232i(strM26232i2, " audioFormat");
        }
        if (strM26232i2.isEmpty()) {
            return c6834sc;
        }
        throw new IllegalArgumentException("Required settings missing or non-positive:".concat(strM26232i2));
    }

    /* renamed from: z */
    public synchronized InterfaceC11215ts0 m7575z(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.f11173a).iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                C10577ot0 c10577ot0 = (C10577ot0) it.next();
                if (((HashSet) this.f11175c).contains(c10577ot0)) {
                    z = true;
                } else {
                    if (!c10577ot0.f39339a.isAssignableFrom(cls) || !c10577ot0.f39340b.isAssignableFrom(cls2)) {
                        z2 = false;
                    }
                    if (z2) {
                        ((HashSet) this.f11175c).add(c10577ot0);
                        arrayList.add(c10577ot0.f39341c.mo8114a(this));
                        ((HashSet) this.f11175c).remove(c10577ot0);
                    }
                }
            }
            if (arrayList.size() > 1) {
                C7564Ev0 c7564Ev0 = (C7564Ev0) this.f11174b;
                C8539Xo1 c8539Xo1 = (C8539Xo1) this.f11176d;
                c7564Ev0.getClass();
                return new C4098g9(arrayList, 1, c8539Xo1);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC11215ts0) arrayList.get(0);
            }
            if (z) {
                return f11172f;
            }
            throw new C9111dQ0("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.f11175c).clear();
            throw th;
        }
    }

    public T71(Z41 z41, InterfaceC7402Bs0 interfaceC7402Bs0) {
        O90.m5968f(z41, "storageManager");
        O90.m5968f(interfaceC7402Bs0, "module");
        this.f11173a = z41;
        this.f11174b = interfaceC7402Bs0;
        C8582Yk0 c8582Yk0 = (C8582Yk0) z41;
        this.f11175c = c8582Yk0.m9350b(new C8136Pv0(this, 1));
        this.f11176d = c8582Yk0.m9350b(new C8136Pv0(this, 0));
    }

    public T71(int i) {
        switch (i) {
            case 14:
                this.f11173a = Runtime.getRuntime();
                Method nativeLoadRuntimeMethod = J71.getNativeLoadRuntimeMethod();
                this.f11174b = nativeLoadRuntimeMethod;
                String strJoin = null;
                String classLoaderLdLoadLibrary = nativeLoadRuntimeMethod != null ? J71.getClassLoaderLdLoadLibrary() : null;
                this.f11175c = classLoaderLdLoadLibrary;
                if (classLoaderLdLoadLibrary != null) {
                    String[] strArrSplit = classLoaderLdLoadLibrary.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    ArrayList arrayList = new ArrayList(strArrSplit.length);
                    for (String str : strArrSplit) {
                        if (!str.contains("!")) {
                            arrayList.add(str);
                        }
                    }
                    strJoin = TextUtils.join(StringUtils.PROCESS_POSTFIX_DELIMITER, arrayList);
                }
                this.f11176d = strJoin;
                break;
            default:
                Random random = new Random();
                this.f11175c = new HashMap();
                this.f11176d = random;
                this.f11173a = new HashMap();
                this.f11174b = new HashMap();
                break;
        }
    }

    public T71(UM1 um1, String str) {
        this.f11176d = um1;
        Preconditions.checkNotEmpty(str);
        this.f11173a = str;
        this.f11174b = new Bundle();
    }

    @Override // p000.E50
    /* renamed from: s */
    public E50 mo2024s(String str, D50 d50) {
        return this;
    }

    @Override // p000.E50
    /* renamed from: p */
    public E50 mo2022p(int i, int i2, int i3) {
        return this;
    }
}
