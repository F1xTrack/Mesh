package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import androidx.fragment.app.o;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.android.SystemUtils;
import com.vk.push.common.HostInfoProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class VH implements InterfaceC5248j6, PZ, HostInfoProvider, YT, InterfaceC0131Bl, InterfaceC6187o11, InterfaceC1103Nx0, AB1 {
    public static final VH d = new VH(1);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ VH(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x003a A[Catch: IOException -> 0x005b, TryCatch #0 {IOException -> 0x005b, blocks: (B:42:0x0000, B:43:0x000a, B:45:0x000d, B:47:0x001e, B:49:0x0026, B:61:0x0042, B:59:0x003a, B:60:0x003d, B:63:0x0047, B:64:0x004a, B:67:0x005d), top: B:71:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.VH A(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L5b
            Ik[] r0 = new defpackage.C0674Ik[r0]     // Catch: java.io.IOException -> L5b
            nj r1 = new nj     // Catch: java.io.IOException -> L5b
            r1.<init>()     // Catch: java.io.IOException -> L5b
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L5b
            if (r3 >= r4) goto L5d
            r4 = r12[r3]     // Catch: java.io.IOException -> L5b
            java.lang.String[] r5 = defpackage.AbstractC8396zc0.e     // Catch: java.io.IOException -> L5b
            r6 = 34
            r1.r0(r6)     // Catch: java.io.IOException -> L5b
            int r7 = r4.length()     // Catch: java.io.IOException -> L5b
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L5b
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L5b
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.w0(r9, r8, r4)     // Catch: java.io.IOException -> L5b
        L3d:
            r1.x0(r10)     // Catch: java.io.IOException -> L5b
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.w0(r9, r7, r4)     // Catch: java.io.IOException -> L5b
        L4a:
            r1.r0(r6)     // Catch: java.io.IOException -> L5b
            r1.J()     // Catch: java.io.IOException -> L5b
            long r4 = r1.b     // Catch: java.io.IOException -> L5b
            Ik r4 = r1.U(r4)     // Catch: java.io.IOException -> L5b
            r0[r3] = r4     // Catch: java.io.IOException -> L5b
            int r3 = r3 + 1
            goto La
        L5b:
            r12 = move-exception
            goto L70
        L5d:
            VH r1 = new VH     // Catch: java.io.IOException -> L5b
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L5b
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L5b
            Iy0 r0 = defpackage.IJ1.b(r0)     // Catch: java.io.IOException -> L5b
            r2 = 14
            r3 = 0
            r1.<init>(r12, r0, r3, r2)     // Catch: java.io.IOException -> L5b
            return r1
        L70:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VH.A(java.lang.String[]):VH");
    }

    public void B(AbstractC6952s2 abstractC6952s2) {
        C6860rY0 c6860rY0 = (C6860rY0) this.b;
        ((ActionMode.Callback) c6860rY0.b).onDestroyActionMode(c6860rY0.w(abstractC6952s2));
        H6 h6 = (H6) this.c;
        if (h6.w != null) {
            h6.l.getDecorView().removeCallbacks(h6.x);
        }
        if (h6.v != null) {
            C6519pl1 c6519pl1 = h6.y;
            if (c6519pl1 != null) {
                c6519pl1.b();
            }
            C6519pl1 c6519pl1A = AbstractC6897rk1.a(h6.v);
            c6519pl1A.a(0.0f);
            h6.y = c6519pl1A;
            c6519pl1A.d(new C7729w6(2, this));
        }
        h6.u = null;
        ViewGroup viewGroup = h6.A;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        AbstractC3639ek1.c(viewGroup);
        h6.J();
    }

    public boolean D(AbstractC6952s2 abstractC6952s2, MenuC0225Cq0 menuC0225Cq0) {
        ViewGroup viewGroup = ((H6) this.c).A;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        AbstractC3639ek1.c(viewGroup);
        C6860rY0 c6860rY0 = (C6860rY0) this.b;
        C7541v61 c7541v61W = c6860rY0.w(abstractC6952s2);
        L01 l01 = (L01) c6860rY0.e;
        Menu menuC2403br0 = (Menu) l01.getOrDefault(menuC0225Cq0, null);
        if (menuC2403br0 == null) {
            menuC2403br0 = new MenuC2403br0((Context) c6860rY0.c, menuC0225Cq0);
            l01.put(menuC0225Cq0, menuC2403br0);
        }
        return ((ActionMode.Callback) c6860rY0.b).onPrepareActionMode(c7541v61W, menuC2403br0);
    }

    public InterfaceC1584Ub1 E(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                AbstractC6789rA1.d("Unmatched track of type: " + i);
                return new WJ();
            }
            if (i == iArr[i2]) {
                return ((C2527cV0[]) this.c)[i2];
            }
            i2++;
        }
    }

    public void F(C6860rY0 c6860rY0, C2216as1 c2216as1) {
        C2531cW1 c2531cW1 = new C2531cW1(c2216as1);
        TreeMap treeMap = (TreeMap) this.b;
        for (Integer num : treeMap.keySet()) {
            C4254hy1 c4254hy1 = (C4254hy1) ((C4254hy1) c2216as1.c).clone();
            InterfaceC0877Kz1 interfaceC0877Kz1A = ((C1344Qz1) treeMap.get(num)).a(c6860rY0, Collections.singletonList(c2531cW1));
            int iP = interfaceC0877Kz1A instanceof C1029My1 ? AbstractC6955s22.p(((C1029My1) interfaceC0877Kz1A).a.doubleValue()) : -1;
            if (iP == 2 || iP == -1) {
                c2216as1.c = c4254hy1;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.c;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC0877Kz1 interfaceC0877Kz1A2 = ((C1344Qz1) treeMap2.get((Integer) it.next())).a(c6860rY0, Collections.singletonList(c2531cW1));
            if (interfaceC0877Kz1A2 instanceof C1029My1) {
                AbstractC6955s22.p(((C1029My1) interfaceC0877Kz1A2).a.doubleValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x014f  */
    @Override // defpackage.InterfaceC0131Bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Z(defpackage.InterfaceC7089sl r20, defpackage.HS0 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VH.Z(sl, HS0):void");
    }

    @Override // defpackage.YT
    public void a(File file) {
        C8455zw c8455zwA = C4117hF.a((C4117hF) this.c, file);
        if (c8455zwA == null || c8455zwA.b != ".cnt") {
            return;
        }
        ((ArrayList) this.b).add(new C3926gF(file, c8455zwA.c));
    }

    @Override // defpackage.AB1
    public C6860rY0 d(InterfaceC0877Kz1 interfaceC0877Kz1) {
        C6860rY0 c6860rY0I = ((C6860rY0) this.b).I();
        String str = (String) this.c;
        c6860rY0I.M(str, interfaceC0877Kz1);
        ((HashMap) c6860rY0I.e).put(str, Boolean.TRUE);
        return c6860rY0I;
    }

    public C1089Ns1 e() throws JSONException {
        C0369Em0 c0369Em0A = AbstractC7528v22.a(((C1442Sg0) this.b).a());
        if (c0369Em0A == null) {
            return null;
        }
        String strH = D51.h(AbstractC5702lU.d(c0369Em0A.a));
        C6273oT0 c6273oT0 = (C6273oT0) this.c;
        c6273oT0.getClass();
        JSONObject jSONObject = new JSONObject(strH);
        JSONObject jSONObject2 = jSONObject.getJSONObject("CONFIG_KEY");
        O90.e(jSONObject2, "jsonObject.getJSONObject(CONFIG_KEY)");
        Map mapA = AbstractC7592vN1.a(jSONObject2);
        String strOptString = jSONObject.optString("SHORT_SEGMENTS_KEY");
        O90.e(strOptString, "jsonObject.optString(SHORT_SEGMENTS_KEY)");
        ((C0240Cv0) c6273oT0.a).getClass();
        String strE0 = C0240Cv0.e0(strOptString);
        long j = jSONObject.getLong("VERSION_KEY");
        String string = jSONObject.getString("HASH_KEY");
        O90.e(string, "jsonObject.getString(HASH_KEY)");
        return new C1089Ns1(mapA, new C7315tw1(j, string), strE0);
    }

    @Override // defpackage.InterfaceC6187o11
    public void e0(KK kk) {
        ((InterfaceC6187o11) this.b).e0(kk);
    }

    public void f(C1089Ns1 c1089Ns1) throws JSONException, IOException {
        C7315tw1 c7315tw1 = c1089Ns1.b;
        long j = c7315tw1.a;
        String strValueOf = String.valueOf(j);
        C1442Sg0 c1442Sg0 = (C1442Sg0) this.b;
        O90.f(strValueOf, "fileName");
        File file = new File((File) c1442Sg0.a.getValue(), strValueOf);
        file.delete();
        file.createNewFile();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("VERSION_KEY", j);
        jSONObject.put("HASH_KEY", c7315tw1.b);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : c1089Ns1.a.entrySet()) {
            jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
        }
        jSONObject.put("CONFIG_KEY", jSONObject2);
        String str = c1089Ns1.c;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("short_segments", str);
        String string = jSONObject3.toString();
        O90.e(string, "JSONObject().apply {\n   …ids)\n        }.toString()");
        jSONObject.put("SHORT_SEGMENTS_KEY", new JSONObject(string));
        String string2 = jSONObject.toString();
        O90.e(string2, "jsonObject.toString()");
        byte[] bytes = string2.getBytes(AbstractC7680vr.a);
        O90.e(bytes, "this as java.lang.String).getBytes(charset)");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            AbstractC2141aT1.a(fileOutputStream, null);
        } finally {
        }
    }

    public Size[] g(Size[] sizeArr, int i) {
        List listEmptyList;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList(Arrays.asList(sizeArr));
        if (((ExtraSupportedOutputSizeQuirk) this.b) != null) {
            Size[] sizeArr2 = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr2.length > 0) {
                arrayList3.addAll(Arrays.asList(sizeArr2));
            }
        }
        C5266jC c5266jC = (C5266jC) this.c;
        c5266jC.getClass();
        if (((ExcludedSupportedSizesQuirk) AbstractC7768wJ.a.z0(ExcludedSupportedSizesQuirk.class)) == null) {
            listEmptyList = new ArrayList();
        } else {
            String str = c5266jC.a;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList2.add(new Size(4160, 3120));
                    arrayList2.add(new Size(4000, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList2 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList2.add(new Size(4160, 3120));
                    arrayList2.add(new Size(4000, 3000));
                }
            } else {
                if (SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && (i == 34 || i == 35)) {
                        arrayList.add(new Size(720, 720));
                        arrayList.add(new Size(400, 400));
                    }
                } else if (ExcludedSupportedSizesQuirk.f()) {
                    arrayList = new ArrayList();
                    if (str.equals("0")) {
                        if (i == 34) {
                            arrayList.add(new Size(4128, 3096));
                            arrayList.add(new Size(4128, 2322));
                            arrayList.add(new Size(3088, 3088));
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        } else if (i == 35) {
                            arrayList.add(new Size(4128, 2322));
                            arrayList.add(new Size(3088, 3088));
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (str.equals("1") && (i == 34 || i == 35)) {
                        arrayList.add(new Size(3264, 2448));
                        arrayList.add(new Size(3264, 1836));
                        arrayList.add(new Size(2448, 2448));
                        arrayList.add(new Size(1920, 1920));
                        arrayList.add(new Size(2048, 1536));
                        arrayList.add(new Size(2048, 1152));
                        arrayList.add(new Size(1920, 1080));
                    }
                } else if (ExcludedSupportedSizesQuirk.e()) {
                    arrayList = new ArrayList();
                    if (str.equals("0")) {
                        if (i == 34) {
                            arrayList.add(new Size(4128, 3096));
                            arrayList.add(new Size(4128, 2322));
                            arrayList.add(new Size(3088, 3088));
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        } else if (i == 35) {
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (str.equals("1") && (i == 34 || i == 35)) {
                        arrayList.add(new Size(2576, 1932));
                        arrayList.add(new Size(2560, 1440));
                        arrayList.add(new Size(1920, 1920));
                        arrayList.add(new Size(2048, 1536));
                        arrayList.add(new Size(2048, 1152));
                        arrayList.add(new Size(1920, 1080));
                    }
                } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i == 256) {
                        arrayList.add(new Size(9280, 6944));
                    }
                } else if (ExcludedSupportedSizesQuirk.d()) {
                    arrayList = new ArrayList();
                    if (i == 35) {
                        arrayList.add(new Size(3840, 2160));
                        arrayList.add(new Size(3264, 2448));
                        arrayList.add(new Size(3200, 2400));
                        arrayList.add(new Size(2688, 1512));
                        arrayList.add(new Size(2592, 1944));
                        arrayList.add(new Size(2592, 1940));
                        arrayList.add(new Size(1920, 1440));
                    }
                } else {
                    AbstractC0759Jm0.f("ExcludedSupportedSizesQuirk");
                    listEmptyList = Collections.emptyList();
                }
                listEmptyList = arrayList;
            }
            listEmptyList = arrayList2;
        }
        if (!listEmptyList.isEmpty()) {
            arrayList3.removeAll(listEmptyList);
        }
        if (arrayList3.isEmpty()) {
            AbstractC0759Jm0.f("OutputSizesCorrector");
        }
        return (Size[]) arrayList3.toArray(new Size[0]);
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getHost() {
        return (String) this.b;
    }

    @Override // com.vk.push.common.HostInfoProvider
    public Integer getPort() {
        return HostInfoProvider.DefaultImpls.getPort(this);
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getScheme() {
        return (String) this.c;
    }

    public String h(InterfaceC0660If0 interfaceC0660If0) {
        String str;
        XU0 xu0 = (XU0) ((C1857Xo1) this.c).i();
        try {
            interfaceC0660If0.a(xu0.a);
            byte[] bArrDigest = xu0.a.digest();
            char[] cArr = AbstractC0121Bh1.b;
            synchronized (cArr) {
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b = bArrDigest[i];
                    int i2 = i * 2;
                    char[] cArr2 = AbstractC0121Bh1.a;
                    cArr[i2] = cArr2[(b & 255) >>> 4];
                    cArr[i2 + 1] = cArr2[b & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            ((C1857Xo1) this.c).d(xu0);
        }
    }

    public String i(int i, byte[] bArr) throws CharacterCodingException {
        byte[] bArr2 = (byte[]) this.c;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + i];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, ((byte[]) this.c).length, i);
            i += ((byte[]) this.c).length;
            bArr = bArr3;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        boolean z = false;
        int i2 = 0;
        CharBuffer charBufferDecode = null;
        while (!z && i2 < 4) {
            try {
                charBufferDecode = ((CharsetDecoder) this.b).decode(byteBufferWrap);
                z = true;
            } catch (CharacterCodingException unused) {
                i2++;
                byteBufferWrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if (!z || i2 <= 0) {
            this.c = null;
        } else {
            byte[] bArr4 = new byte[i2];
            this.c = bArr4;
            System.arraycopy(bArr, i - i2, bArr4, 0, i2);
        }
        if (z) {
            return new String(charBufferDecode.array(), 0, charBufferDecode.length());
        }
        AbstractC3393dS.p("ReactNative");
        return "";
    }

    @Override // defpackage.InterfaceC5248j6
    public void j(C2251b3 c2251b3) {
        O90.f(c2251b3, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((C4332iN) this.c).j(c2251b3);
    }

    public void k(Fragment fragment, Bundle bundle, boolean z) {
        o oVar = (o) this.c;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.k(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentActivityCreated(oVar, fragment, bundle);
        }
    }

    public void l(Fragment fragment, boolean z) {
        o oVar = (o) this.c;
        l lVar = oVar.t.b;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.l(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentAttached(oVar, fragment, lVar);
        }
    }

    public void m(Fragment fragment, Bundle bundle, boolean z) {
        o oVar = (o) this.c;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.m(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentCreated(oVar, fragment, bundle);
        }
    }

    public void n(Fragment fragment, boolean z) {
        o oVar = (o) this.c;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.n(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentDestroyed(oVar, fragment);
        }
    }

    public void o(Fragment fragment, boolean z) {
        o oVar = (o) this.c;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.o(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentDetached(oVar, fragment);
        }
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        C0244Cw1 c0244Cw1 = (C0244Cw1) this.b;
        S81 s81 = (S81) this.c;
        synchronized (c0244Cw1.f) {
            c0244Cw1.e.remove(s81);
        }
    }

    @Override // defpackage.InterfaceC6187o11
    public void onError(Throwable th) {
        O90.f(th, "e");
        ((InterfaceC6187o11) this.b).onError(th);
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 5:
                return;
            case 10:
                int i = ((R61) this.b).f;
                if (i == 2 && (th instanceof CancellationException)) {
                    AbstractC0759Jm0.f("DualSurfaceProcessorNode");
                    return;
                } else {
                    WT1.a(i);
                    AbstractC0759Jm0.f("DualSurfaceProcessorNode");
                    return;
                }
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [Vg0, nZ] */
    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        Object objB;
        switch (this.a) {
            case 5:
                ((C0212Cm) this.c).p.remove((InterfaceC4228hq) this.b);
                int iX = AbstractC8235ym.x(((C0212Cm) this.c).L);
                if (iX != 1 && iX != 4) {
                    if (iX == 5 || (iX == 6 && ((C0212Cm) this.c).k != 0)) {
                        ((C0212Cm) this.c).u("Camera reopen required. Checking if the current camera can be closed safely.");
                    }
                }
                if (((C0212Cm) this.c).p.isEmpty()) {
                    C0212Cm c0212Cm = (C0212Cm) this.c;
                    if (c0212Cm.j != null) {
                        c0212Cm.u("closing camera");
                        ((C0212Cm) this.c).j.close();
                        ((C0212Cm) this.c).j = null;
                        break;
                    }
                }
                break;
            case 10:
                T61 t61 = (T61) obj;
                t61.getClass();
                C5869mM c5869mM = (C5869mM) ((C6045nH) this.c).a;
                if (!c5869mM.g.get()) {
                    RunnableC3529eA runnableC3529eA = new RunnableC3529eA(c5869mM, 17, t61);
                    Objects.requireNonNull(t61);
                    c5869mM.b(runnableC3529eA, new DE(3, t61));
                    break;
                } else {
                    t61.close();
                    break;
                }
            case 21:
                try {
                    objB = ((C4265i11) this.c).c.invoke(obj);
                } catch (Throwable th) {
                    objB = RQ1.b(th);
                }
                boolean z = objB instanceof OS0;
                InterfaceC6187o11 interfaceC6187o11 = (InterfaceC6187o11) this.b;
                if (!z) {
                    interfaceC6187o11.onSuccess(objB);
                }
                Throwable thA = PS0.a(objB);
                if (thA != null) {
                    interfaceC6187o11.onError(thA);
                    break;
                }
                break;
            default:
                AbstractC3377dM1.i(((C1045Ne) obj).a != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                AbstractC0759Jm0.f("TextureViewImpl");
                ((SurfaceTexture) this.b).release();
                Q91 q91 = ((P91) this.c).a;
                if (q91.j != null) {
                    q91.j = null;
                    break;
                }
                break;
        }
    }

    public void p(Fragment fragment, boolean z) {
        o oVar = (o) this.c;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.p(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentPaused(oVar, fragment);
        }
    }

    public void q(Fragment fragment, boolean z) {
        o oVar = (o) this.c;
        l lVar = oVar.t.b;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.q(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentPreAttached(oVar, fragment, lVar);
        }
    }

    public void r(Fragment fragment, Bundle bundle, boolean z) {
        o oVar = (o) this.c;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.r(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentPreCreated(oVar, fragment, bundle);
        }
    }

    public void s(Fragment fragment, boolean z) {
        o oVar = (o) this.c;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.s(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentResumed(oVar, fragment);
        }
    }

    public void t(Fragment fragment, Bundle bundle, boolean z) {
        o oVar = (o) this.c;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.t(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentSaveInstanceState(oVar, fragment, bundle);
        }
    }

    public String toString() {
        switch (this.a) {
            case 13:
                return "OutputFileOptions{mFile=" + ((File) this.b) + ", mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=null, mMetadata=" + ((C1135Oi) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(Fragment fragment, boolean z) {
        o oVar = (o) this.c;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.u(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentStarted(oVar, fragment);
        }
    }

    public void v(Fragment fragment, boolean z) {
        o oVar = (o) this.c;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.v(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentStopped(oVar, fragment);
        }
    }

    public void w(Fragment fragment, View view, Bundle bundle, boolean z) {
        o oVar = (o) this.c;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.w(fragment, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentViewCreated(oVar, fragment, view, bundle);
        }
    }

    @Override // defpackage.InterfaceC0131Bl
    public void w0(InterfaceC7089sl interfaceC7089sl, IOException iOException) {
        switch (this.a) {
            case 11:
                O90.f(interfaceC7089sl, "call");
                String str = XT.a;
                iOException.getMessage();
                ((InterfaceC7754wE0) this.b).reject(str, iOException.getMessage(), iOException);
                break;
            default:
                O90.f(interfaceC7089sl, "call");
                ((MN0) this.b).c(iOException, null);
                break;
        }
    }

    public void x(Fragment fragment, boolean z) {
        o oVar = (o) this.c;
        Fragment fragment2 = oVar.v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().l.x(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            C2154aY c2154aY = (C2154aY) it.next();
            if (z) {
                c2154aY.getClass();
            }
            c2154aY.a.onFragmentViewDestroyed(oVar, fragment);
        }
    }

    public ArrayList y(String str) {
        C6655qT0 c6655qT0A = C6655qT0.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            c6655qT0A.V(1);
        } else {
            c6655qT0A.d(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        workDatabase_Impl.b();
        Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
        try {
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(cursorC.isNull(0) ? null : cursorC.getString(0));
            }
            return arrayList;
        } finally {
            cursorC.close();
            c6655qT0A.release();
        }
    }

    public String z(InterfaceC0660If0 interfaceC0660If0) {
        String strH;
        synchronized (((C8425zm) this.b)) {
            strH = (String) ((C8425zm) this.b).a(interfaceC0660If0);
        }
        if (strH == null) {
            strH = h(interfaceC0660If0);
        }
        synchronized (((C8425zm) this.b)) {
            ((C8425zm) this.b).f(interfaceC0660If0, strH);
        }
        return strH;
    }

    public /* synthetic */ VH(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public VH(String str, int i) {
        this.a = i;
        switch (i) {
            case 17:
                this.b = (ExtraSupportedOutputSizeQuirk) AbstractC7768wJ.a.z0(ExtraSupportedOutputSizeQuirk.class);
                this.c = new C5266jC(str, false);
                break;
            default:
                this.b = String.format("chepub.%s.rustore.devmail.ru", Arrays.copyOf(new Object[]{str}, 1));
                this.c = "https";
                break;
        }
    }

    public VH(int i) {
        this.a = i;
        switch (i) {
            case 20:
                this.b = new C8425zm(1000L);
                this.c = AbstractC1254Pv1.b(10, new C0474Fv0(20));
                break;
            case 22:
                this.b = (ImageCaptureFailedForSpecificCombinationQuirk) AbstractC7005sJ.a.z0(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.c = (PreviewGreenTintQuirk) AbstractC7005sJ.a.z0(PreviewGreenTintQuirk.class);
                break;
            case 27:
                this.b = new TreeMap();
                this.c = new TreeMap();
                break;
        }
    }

    public VH(C7 c7) {
        this.a = 2;
        O90.f(c7, "currentActivityProvider");
        O90.f(c7, "currentActivityProvider");
        D7 d7 = new D7();
        d7.b = new Random();
        d7.c = new HashMap();
        d7.d = new HashMap();
        d7.e = new HashMap();
        d7.a = new ArrayList();
        d7.f = new HashMap();
        d7.g = new HashMap();
        d7.h = new Bundle();
        this.b = d7;
        new AtomicInteger();
        this.c = new C4332iN(4, (byte) 0);
        AbstractC3767fP1.b(J10.a, null, new C2441c3(this, null), 3);
    }

    private final void C(Throwable th) {
    }

    @Override // defpackage.YT
    public void b(File file) {
    }

    @Override // defpackage.YT
    public void c(File file) {
    }

    public VH(AbstractC6914rq0 abstractC6914rq0, C1204Pf c1204Pf) {
        this.a = 15;
        O90.f(c1204Pf, "pooledByteStreams");
        this.b = abstractC6914rq0;
        this.c = c1204Pf;
    }

    public VH(WorkDatabase_Impl workDatabase_Impl) {
        this.a = 0;
        this.b = workDatabase_Impl;
        this.c = new UH(workDatabase_Impl, 0);
    }

    public VH(ExecutorC5715lY0 executorC5715lY0) {
        this.a = 24;
        this.b = executorC5715lY0;
        this.c = new AtomicInteger(0);
    }

    public VH(Charset charset) {
        this.a = 18;
        this.c = null;
        this.b = charset.newDecoder();
    }

    public VH(o oVar) {
        this.a = 12;
        this.b = new CopyOnWriteArrayList();
        this.c = oVar;
    }

    public VH(C4117hF c4117hF) {
        this.a = 9;
        this.c = c4117hF;
        this.b = new ArrayList();
    }
}
