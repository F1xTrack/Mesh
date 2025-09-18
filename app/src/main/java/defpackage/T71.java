package defpackage;

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
import ru.ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes.dex */
public final class T71 implements InterfaceC0273Dg0, InterfaceC0846Kp0, PL, InterfaceC0131Bl, E50 {
    public static final C0396Ev0 e = new C0396Ev0(17);
    public static final C1674Vf1 f = new C1674Vf1(2);
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ T71(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public static void F(String str) throws NoSuchAlgorithmException, IOException {
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
        } catch (IOException | SecurityException | NoSuchAlgorithmException e2) {
            e2.toString();
        }
    }

    public static boolean I(Context context) {
        O90.f(context, "context");
        if ((context.getApplicationInfo().flags & 4194304) != 0) {
            return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) || (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1);
        }
        return false;
    }

    public static void Q(long j, HashMap map) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String h(defpackage.T71 r43) throws android.content.res.Resources.NotFoundException, java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T71.h(T71):java.lang.String");
    }

    public synchronized ArrayList A(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.a).iterator();
            while (it.hasNext()) {
                C6351ot0 c6351ot0 = (C6351ot0) it.next();
                if (!((HashSet) this.c).contains(c6351ot0) && c6351ot0.a.isAssignableFrom(cls)) {
                    ((HashSet) this.c).add(c6351ot0);
                    arrayList.add(c6351ot0.c.a(this));
                    ((HashSet) this.c).remove(c6351ot0);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public InterfaceC7492us B(C0074As c0074As, List list) {
        O90.f(c0074As, "classId");
        return (InterfaceC7492us) ((C1454Sk0) this.d).invoke(new C1097Nv0(c0074As, list));
    }

    public synchronized ArrayList C(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.a).iterator();
        while (it.hasNext()) {
            C6351ot0 c6351ot0 = (C6351ot0) it.next();
            if (!arrayList.contains(c6351ot0.b) && c6351ot0.a.isAssignableFrom(cls)) {
                arrayList.add(c6351ot0.b);
            }
        }
        return arrayList;
    }

    public C7080si D() {
        if (((ReactHostImpl) ((AtomicReference) this.b).get()) == null) {
            return null;
        }
        return C7080si.a;
    }

    @Override // defpackage.InterfaceC0846Kp0
    public void E(int i, C0456Fp0 c0456Fp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0) {
        if (M(i, c0456Fp0)) {
            ((VY) this.b).N(c4020gk0, O(c7102sp0, c0456Fp0));
        }
    }

    public S71 G(C0376Eo1 c0376Eo1) {
        C6655qT0 c6655qT0A = C6655qT0.a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = c0376Eo1.a;
        if (str == null) {
            c6655qT0A.V(1);
        } else {
            c6655qT0A.d(1, str);
        }
        c6655qT0A.E(2, c0376Eo1.b);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
        try {
            int iC = MY1.c(cursorC, "work_spec_id");
            int iC2 = MY1.c(cursorC, "generation");
            int iC3 = MY1.c(cursorC, "system_id");
            S71 s71 = null;
            String string = null;
            if (cursorC.moveToFirst()) {
                if (!cursorC.isNull(iC)) {
                    string = cursorC.getString(iC);
                }
                s71 = new S71(string, cursorC.getInt(iC2), cursorC.getInt(iC3));
            }
            return s71;
        } finally {
            cursorC.close();
            c6655qT0A.release();
        }
    }

    public void H(S71 s71) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((UH) this.b).h(s71);
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
        }
    }

    public boolean J(InterfaceC0499Gd1 interfaceC0499Gd1) {
        O90.f(interfaceC0499Gd1, "descriptor");
        if (!O90.a((InterfaceC0499Gd1) this.b, interfaceC0499Gd1)) {
            T71 t71 = (T71) this.a;
            if (!(t71 != null ? t71.J(interfaceC0499Gd1) : false)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC0846Kp0
    public void K(int i, C0456Fp0 c0456Fp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0, IOException iOException, boolean z) {
        if (M(i, c0456Fp0)) {
            ((VY) this.b).Q(c4020gk0, O(c7102sp0, c0456Fp0), iOException, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0041, code lost:
    
        if (r9 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0043, code lost:
    
        F(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0046, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L(int r9, java.lang.String r10) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "nativeLoad() returned error for "
            java.lang.Object r1 = r8.b
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto Lc
            java.lang.System.load(r10)
            return
        Lc:
            r1 = 4
            r9 = r9 & r1
            if (r9 != r1) goto L15
            java.lang.Object r9 = r8.c
        L12:
            java.lang.String r9 = (java.lang.String) r9
            goto L18
        L15:
            java.lang.Object r9 = r8.d
            goto L12
        L18:
            r1 = 0
            java.lang.Object r2 = r8.a     // Catch: java.lang.Throwable -> L6c java.lang.Throwable -> L6e
            java.lang.Runtime r2 = (java.lang.Runtime) r2     // Catch: java.lang.Throwable -> L6c java.lang.Throwable -> L6e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Throwable -> L6e
            java.lang.Object r3 = r8.b     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r4 = r8.a     // Catch: java.lang.Throwable -> L68
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
            F(r10)
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
            F(r10)
        L92:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T71.L(int, java.lang.String):void");
    }

    public boolean M(int i, C0456Fp0 c0456Fp0) {
        C0456Fp0 c0456Fp0U;
        Object obj = this.a;
        AbstractC1720Vv abstractC1720Vv = (AbstractC1720Vv) this.d;
        if (c0456Fp0 != null) {
            c0456Fp0U = abstractC1720Vv.u(obj, c0456Fp0);
            if (c0456Fp0U == null) {
                return false;
            }
        } else {
            c0456Fp0U = null;
        }
        int iX = abstractC1720Vv.x(i, obj);
        VY vy = (VY) this.b;
        if (vy.b != iX || !AbstractC0277Dh1.a((C0456Fp0) vy.c, c0456Fp0U)) {
            this.b = new VY((CopyOnWriteArrayList) abstractC1720Vv.c.d, iX, c0456Fp0U);
        }
        OL ol = (OL) this.c;
        if (ol.a == iX && AbstractC0277Dh1.a(ol.b, c0456Fp0U)) {
            return true;
        }
        this.c = new OL(abstractC1720Vv.d.c, iX, c0456Fp0U);
        return true;
    }

    @Override // defpackage.PL
    public void N(int i, C0456Fp0 c0456Fp0) {
        if (M(i, c0456Fp0)) {
            ((OL) this.c).b();
        }
    }

    public C7102sp0 O(C7102sp0 c7102sp0, C0456Fp0 c0456Fp0) {
        AbstractC1720Vv abstractC1720Vv = (AbstractC1720Vv) this.d;
        Object obj = this.a;
        long j = c7102sp0.f;
        long jW = abstractC1720Vv.w(j, obj);
        long j2 = c7102sp0.g;
        long jW2 = abstractC1720Vv.w(j2, obj);
        if (jW == j && jW2 == j2) {
            return c7102sp0;
        }
        return new C7102sp0(c7102sp0.a, c7102sp0.b, c7102sp0.c, c7102sp0.d, c7102sp0.e, jW, jW2);
    }

    public synchronized ArrayList P() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.a).iterator();
        while (it.hasNext()) {
            C6351ot0 c6351ot0 = (C6351ot0) it.next();
            if (c6351ot0.a.isAssignableFrom(E10.class) && c6351ot0.b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(c6351ot0.c);
            }
        }
        return arrayList;
    }

    public synchronized ArrayList R(C7699vx0 c7699vx0) {
        ArrayList arrayListP;
        arrayListP = P();
        w(E10.class, InputStream.class, c7699vx0);
        return arrayListP;
    }

    public C0896Lg S(List list) {
        ArrayList arrayListX = x(list);
        if (arrayListX.size() < 2) {
            return (C0896Lg) AbstractC7337u22.a(null, arrayListX);
        }
        Collections.sort(arrayListX, new C0350Eg(1));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((C0896Lg) arrayListX.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListX.size()) {
                break;
            }
            C0896Lg c0896Lg = (C0896Lg) arrayListX.get(i3);
            if (i2 == c0896Lg.c) {
                arrayList.add(new Pair(c0896Lg.b, Integer.valueOf(c0896Lg.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (C0896Lg) arrayListX.get(0);
            }
        }
        HashMap map = (HashMap) this.c;
        C0896Lg c0896Lg2 = (C0896Lg) map.get(arrayList);
        if (c0896Lg2 == null) {
            List listSubList = arrayListX.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < listSubList.size(); i5++) {
                i4 += ((C0896Lg) listSubList.get(i5)).d;
            }
            int iNextInt = ((Random) this.d).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i >= listSubList.size()) {
                    c0896Lg2 = (C0896Lg) AbstractC7337u22.b(listSubList);
                    break;
                }
                C0896Lg c0896Lg3 = (C0896Lg) listSubList.get(i);
                i6 += c0896Lg3.d;
                if (iNextInt < i6) {
                    c0896Lg2 = c0896Lg3;
                    break;
                }
                i++;
            }
            map.put(arrayList, c0896Lg2);
        }
        return c0896Lg2;
    }

    public synchronized void T(int i, int i2, int i3, int i4) {
        SurfaceHandlerBinding surfaceHandlerBinding = (SurfaceHandlerBinding) this.c;
        Context context = (Context) this.d;
        O90.f(context, "context");
        surfaceHandlerBinding.setLayoutConstraints(i, i2, i3, i4, context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true), I((Context) this.d), ((Context) this.d).getResources().getDisplayMetrics().density);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0118 A[Catch: NumberFormatException | JSONException -> 0x0120, NumberFormatException | JSONException -> 0x0120, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0120, blocks: (B:95:0x002b, B:129:0x009b, B:129:0x009b, B:130:0x00a8, B:130:0x00a8, B:132:0x00b5, B:132:0x00b5, B:134:0x00c7, B:134:0x00c7, B:135:0x00d0, B:135:0x00d0, B:136:0x00d4, B:136:0x00d4, B:138:0x00e1, B:138:0x00e1, B:140:0x00f3, B:140:0x00f3, B:141:0x00fc, B:141:0x00fc, B:142:0x0100, B:142:0x0100, B:143:0x010c, B:143:0x010c, B:144:0x0118, B:144:0x0118, B:106:0x0058, B:109:0x0062, B:112:0x006c, B:115:0x0076, B:118:0x0080), top: B:158:0x002b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle U() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T71.U():android.os.Bundle");
    }

    @Override // defpackage.InterfaceC0273Dg0
    public void U0(C0230Cs c0230Cs) {
        ((ArrayList) this.a).add(new C4193he0(new C3811fe0(c0230Cs)));
    }

    public void V(Bundle bundle) throws JSONException {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        UM1 um1 = (UM1) this.d;
        SharedPreferences.Editor editorEdit = um1.C1().edit();
        int size = bundle2.size();
        String str = (String) this.a;
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
                        C7434uY1.a();
                        if (((C3386dP1) um1.b).g.E1(null, IB1.R0)) {
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
                                um1.n().g.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
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
                                um1.n().g.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e2) {
                        um1.n().g.c(e2, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.c = bundle2;
    }

    @Override // defpackage.InterfaceC0131Bl
    public void Z(InterfaceC7089sl interfaceC7089sl, HS0 hs0) {
        O90.f(interfaceC7089sl, "call");
        Uri uri = (Uri) this.c;
        WT wt = (WT) this.b;
        wt.getClass();
        File fileT = WT.t(uri);
        fileT.delete();
        C8161yN0 c8161yN0A = JI1.a(JI1.f(fileT));
        IS0 is0 = hs0.g;
        O90.c(is0);
        c8161yN0A.i(is0.w());
        c8161yN0A.close();
        Bundle bundle = new Bundle();
        bundle.putString("uri", Uri.fromFile(fileT).toString());
        bundle.putInt("status", hs0.d);
        bundle.putBundle("headers", WT.k(wt, hs0.f));
        if (((DownloadOptions) this.d).getMd5()) {
            bundle.putString("md5", WT.i(wt, fileT));
        }
        hs0.close();
        ((InterfaceC7754wE0) this.a).resolve(bundle);
    }

    @Override // defpackage.E50
    public E50 a(int i, int i2, int i3) {
        if (i == 2) {
            if (i2 >= 0) {
                ((DecimalFormat) this.b).setMinimumFractionDigits(i2);
            }
            if (i3 >= 0) {
                ((DecimalFormat) this.b).setMaximumFractionDigits(i3);
            }
        }
        return this;
    }

    @Override // defpackage.E50
    public AttributedCharacterIterator b(double d) {
        return ((DecimalFormat) this.a).formatToCharacterIterator(Double.valueOf(d));
    }

    @Override // defpackage.PL
    public void b0(int i, C0456Fp0 c0456Fp0) {
        if (M(i, c0456Fp0)) {
            ((OL) this.c).a();
        }
    }

    @Override // defpackage.PL
    public void c(int i, C0456Fp0 c0456Fp0, Exception exc) {
        if (M(i, c0456Fp0)) {
            ((OL) this.c).d(exc);
        }
    }

    @Override // defpackage.InterfaceC0846Kp0
    public void d(int i, C0456Fp0 c0456Fp0, C7102sp0 c7102sp0) {
        if (M(i, c0456Fp0)) {
            ((VY) this.b).z(O(c7102sp0, c0456Fp0));
        }
    }

    @Override // defpackage.E50
    public String e(double d) {
        return ((DecimalFormat) this.a).format(Double.valueOf(d));
    }

    @Override // defpackage.InterfaceC0273Dg0
    public void e0(Object obj) {
        ((ArrayList) this.a).add(U41.n((U41) this.b, (C1559Tt0) this.c, obj));
    }

    @Override // defpackage.InterfaceC0846Kp0
    public void f(int i, C0456Fp0 c0456Fp0, C7102sp0 c7102sp0) {
        if (M(i, c0456Fp0)) {
            ((VY) this.b).h0(O(c7102sp0, c0456Fp0));
        }
    }

    @Override // defpackage.E50
    public String g(Y40 y40) {
        return "latn";
    }

    @Override // defpackage.E50
    public E50 i(B50 b50) {
        if (b50 == B50.b) {
            ((DecimalFormat) this.b).setPositivePrefix("");
            ((DecimalFormat) this.b).setPositiveSuffix("");
            ((DecimalFormat) this.b).setNegativePrefix("");
            ((DecimalFormat) this.b).setNegativeSuffix("");
        }
        return this;
    }

    @Override // defpackage.InterfaceC0273Dg0
    public void i0(C0074As c0074As, C1559Tt0 c1559Tt0) {
        ((ArrayList) this.a).add(new TO(c0074As, c1559Tt0));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(java.lang.String r10, defpackage.AbstractC1963Yy r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.C1956Yv1
            if (r0 == 0) goto L13
            r0 = r11
            Yv1 r0 = (defpackage.C1956Yv1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Yv1 r0 = new Yv1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            Tf1 r3 = defpackage.C1518Tf1.a
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 == r6) goto L39
            if (r2 != r4) goto L31
            defpackage.RQ1.d(r11)
            goto L9a
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            T71 r10 = r0.a
            defpackage.RQ1.d(r11)
            goto L8b
        L3f:
            java.lang.String r10 = r0.b
            T71 r2 = r0.a
            defpackage.RQ1.d(r11)
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r8
            goto L62
        L4b:
            defpackage.RQ1.d(r11)
            r0.a = r9
            r0.b = r10
            r0.e = r5
            java.lang.Object r11 = r9.b
            Ir1 r11 = (defpackage.C0697Ir1) r11
            java.lang.Object r11 = r11.g(r0)
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
            java.lang.Object r2 = r10.d
            com.vk.push.common.Logger r2 = (com.vk.push.common.Logger) r2
            java.lang.String r5 = "Sending new push token to the client app"
            com.vk.push.common.Logger.DefaultImpls.info$default(r2, r5, r7, r6, r7)
            java.lang.Object r2 = r10.c
            Kq1 r2 = (defpackage.C0850Kq1) r2
            r2.onNewPushToken(r11)
            r0.a = r10
            r0.b = r7
            r0.e = r6
            java.lang.Object r2 = r10.a
            Uq1 r2 = (defpackage.C1629Uq1) r2
            java.lang.Object r11 = r2.c(r11, r0)
            if (r11 != r1) goto L8b
            return r1
        L8b:
            java.lang.Object r10 = r10.b
            Ir1 r10 = (defpackage.C0697Ir1) r10
            r0.a = r7
            r0.e = r4
            java.lang.Object r10 = r10.b(r0)
            if (r10 != r1) goto L9a
            return r1
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T71.j(java.lang.String, Yy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0273Dg0
    public void k() {
        ArrayList arrayList = (ArrayList) this.a;
        C5534kb1 c5534kb1 = (C5534kb1) this.d;
        c5534kb1.getClass();
        O90.f(arrayList, "elements");
        C1559Tt0 c1559Tt0 = (C1559Tt0) this.c;
        if (c1559Tt0 == null) {
            return;
        }
        C1758Wh1 c1758Wh1G = GZ1.g(c1559Tt0, (InterfaceC7492us) c5534kb1.d);
        if (c1758Wh1G != null) {
            HashMap map = (HashMap) c5534kb1.b;
            List listB = AbstractC3970gT1.b(arrayList);
            AbstractC0663Ig0 type = c1758Wh1G.getType();
            O90.e(type, "getType(...)");
            map.put(c1559Tt0, new C0736Je1(listB, type));
            return;
        }
        if (((U41) c5534kb1.c).x((C0074As) c5534kb1.e) && O90.a(c1559Tt0.b(), "value")) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof G5) {
                    arrayList2.add(next);
                }
            }
            List list = (List) c5534kb1.f;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                list.add((InterfaceC7916x5) ((G5) it2.next()).a);
            }
        }
    }

    @Override // defpackage.PL
    public void k0(int i, C0456Fp0 c0456Fp0) {
        if (M(i, c0456Fp0)) {
            ((OL) this.c).e();
        }
    }

    @Override // defpackage.PL
    public void l(int i, C0456Fp0 c0456Fp0, int i2) {
        if (M(i, c0456Fp0)) {
            ((OL) this.c).c(i2);
        }
    }

    @Override // defpackage.E50
    public String m(AttributedCharacterIterator.Attribute attribute, double d) {
        return "literal";
    }

    @Override // defpackage.E50
    public E50 n(String str, EnumC8107y50 enumC8107y50) {
        if (((C50) this.d) == C50.c) {
            Currency currency = Currency.getInstance(str);
            ((DecimalFormat) this.b).setCurrency(currency);
            int iOrdinal = enumC8107y50.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C1064Nk0 c1064Nk0 = (C1064Nk0) this.c;
                    c1064Nk0.h();
                    str = currency.getSymbol(c1064Nk0.a);
                } else {
                    C1064Nk0 c1064Nk02 = (C1064Nk0) this.c;
                    c1064Nk02.h();
                    str = currency.getDisplayName(c1064Nk02.a);
                }
            }
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) this.b).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(str);
            ((DecimalFormat) this.b).setDecimalFormatSymbols(decimalFormatSymbols);
            ((DecimalFormat) this.b).getDecimalFormatSymbols().setCurrencySymbol(str);
        }
        return this;
    }

    @Override // defpackage.InterfaceC0846Kp0
    public void o(int i, C0456Fp0 c0456Fp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0) {
        if (M(i, c0456Fp0)) {
            ((VY) this.b).T(c4020gk0, O(c7102sp0, c0456Fp0));
        }
    }

    @Override // defpackage.E50
    public E50 q(int i) {
        if (i != -1) {
            ((DecimalFormat) this.b).setMinimumIntegerDigits(i);
        }
        return this;
    }

    @Override // defpackage.InterfaceC0273Dg0
    public InterfaceC0195Cg0 r(C0074As c0074As) {
        ArrayList arrayList = new ArrayList();
        return new C6860rY0(((U41) this.b).z(c0074As, W21.O0, arrayList), this, arrayList);
    }

    @Override // defpackage.E50
    public E50 t(Y40 y40, String str, C50 c50, EnumC8297z50 enumC8297z50, A50 a50, EnumC7917x50 enumC7917x50) {
        NumberFormat numberFormat = NumberFormat.getInstance((Locale) y40.g());
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        this.b = decimalFormat;
        this.a = decimalFormat;
        this.c = (C1064Nk0) y40;
        this.d = c50;
        return this;
    }

    @Override // defpackage.E50
    public E50 u(boolean z) {
        ((DecimalFormat) this.b).setGroupingUsed(z);
        return this;
    }

    @Override // defpackage.InterfaceC0846Kp0
    public void v(int i, C0456Fp0 c0456Fp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0) {
        if (M(i, c0456Fp0)) {
            ((VY) this.b).K(c4020gk0, O(c7102sp0, c0456Fp0));
        }
    }

    public synchronized void w(Class cls, Class cls2, InterfaceC7493us0 interfaceC7493us0) {
        C6351ot0 c6351ot0 = new C6351ot0(cls, cls2, interfaceC7493us0);
        ArrayList arrayList = (ArrayList) this.a;
        arrayList.add(arrayList.size(), c6351ot0);
    }

    @Override // defpackage.InterfaceC0131Bl
    public void w0(InterfaceC7089sl interfaceC7089sl, IOException iOException) {
        O90.f(interfaceC7089sl, "call");
        String str = XT.a;
        iOException.getMessage();
        ((InterfaceC7754wE0) this.a).reject(str, iOException.getMessage(), iOException);
    }

    public ArrayList x(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.a;
        Q(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.b;
        Q(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C0896Lg c0896Lg = (C0896Lg) list.get(i);
            if (!map.containsKey(c0896Lg.b) && !map2.containsKey(Integer.valueOf(c0896Lg.c))) {
                arrayList.add(c0896Lg);
            }
        }
        return arrayList;
    }

    public C7062sc y() {
        String strI = ((Integer) this.a) == null ? " audioSource" : "";
        if (((Integer) this.b) == null) {
            strI = strI.concat(" sampleRate");
        }
        if (((Integer) this.c) == null) {
            strI = AbstractC8235ym.i(strI, " channelCount");
        }
        if (((Integer) this.d) == null) {
            strI = AbstractC8235ym.i(strI, " audioFormat");
        }
        if (!strI.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }
        int iIntValue = ((Integer) this.a).intValue();
        int iIntValue2 = ((Integer) this.b).intValue();
        int iIntValue3 = ((Integer) this.c).intValue();
        int iIntValue4 = ((Integer) this.d).intValue();
        C7062sc c7062sc = new C7062sc(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        String strI2 = iIntValue == -1 ? " audioSource" : "";
        if (iIntValue2 <= 0) {
            strI2 = strI2.concat(" sampleRate");
        }
        if (iIntValue3 <= 0) {
            strI2 = AbstractC8235ym.i(strI2, " channelCount");
        }
        if (iIntValue4 == -1) {
            strI2 = AbstractC8235ym.i(strI2, " audioFormat");
        }
        if (strI2.isEmpty()) {
            return c7062sc;
        }
        throw new IllegalArgumentException("Required settings missing or non-positive:".concat(strI2));
    }

    public synchronized InterfaceC7302ts0 z(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.a).iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                C6351ot0 c6351ot0 = (C6351ot0) it.next();
                if (((HashSet) this.c).contains(c6351ot0)) {
                    z = true;
                } else {
                    if (!c6351ot0.a.isAssignableFrom(cls) || !c6351ot0.b.isAssignableFrom(cls2)) {
                        z2 = false;
                    }
                    if (z2) {
                        ((HashSet) this.c).add(c6351ot0);
                        arrayList.add(c6351ot0.c.a(this));
                        ((HashSet) this.c).remove(c6351ot0);
                    }
                }
            }
            if (arrayList.size() > 1) {
                C0396Ev0 c0396Ev0 = (C0396Ev0) this.b;
                C1857Xo1 c1857Xo1 = (C1857Xo1) this.d;
                c0396Ev0.getClass();
                return new C3908g9(arrayList, 1, c1857Xo1);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC7302ts0) arrayList.get(0);
            }
            if (z) {
                return f;
            }
            throw new C3388dQ0("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.c).clear();
            throw th;
        }
    }

    public T71(Z41 z41, InterfaceC0153Bs0 interfaceC0153Bs0) {
        O90.f(z41, "storageManager");
        O90.f(interfaceC0153Bs0, "module");
        this.a = z41;
        this.b = interfaceC0153Bs0;
        C1922Yk0 c1922Yk0 = (C1922Yk0) z41;
        this.c = c1922Yk0.b(new C1253Pv0(this, 1));
        this.d = c1922Yk0.b(new C1253Pv0(this, 0));
    }

    public T71(int i) {
        switch (i) {
            case 14:
                this.a = Runtime.getRuntime();
                Method nativeLoadRuntimeMethod = J71.getNativeLoadRuntimeMethod();
                this.b = nativeLoadRuntimeMethod;
                String strJoin = null;
                String classLoaderLdLoadLibrary = nativeLoadRuntimeMethod != null ? J71.getClassLoaderLdLoadLibrary() : null;
                this.c = classLoaderLdLoadLibrary;
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
                this.d = strJoin;
                break;
            default:
                Random random = new Random();
                this.c = new HashMap();
                this.d = random;
                this.a = new HashMap();
                this.b = new HashMap();
                break;
        }
    }

    public T71(UM1 um1, String str) {
        this.d = um1;
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = new Bundle();
    }

    @Override // defpackage.E50
    public E50 s(String str, D50 d50) {
        return this;
    }

    @Override // defpackage.E50
    public E50 p(int i, int i2, int i3) {
        return this;
    }
}
