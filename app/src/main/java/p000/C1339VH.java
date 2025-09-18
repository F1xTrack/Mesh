package p000;

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
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.Fragment;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.android.SystemUtils;
import com.p019vk.push.common.HostInfoProvider;
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

/* renamed from: VH */
/* loaded from: classes.dex */
public final class C1339VH implements InterfaceC6216j6, InterfaceC0980PZ, HostInfoProvider, InterfaceC1540YT, InterfaceC0111Bl, InterfaceC10467o11, InterfaceC8036Nx0, AB1 {

    /* renamed from: d */
    public static final C1339VH f12484d = new C1339VH(1);

    /* renamed from: a */
    public final /* synthetic */ int f12485a;

    /* renamed from: b */
    public Object f12486b;

    /* renamed from: c */
    public Object f12487c;

    public /* synthetic */ C1339VH(Object obj, int i, Object obj2) {
        this.f12485a = i;
        this.f12487c = obj;
        this.f12486b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x003a A[Catch: IOException -> 0x005b, TryCatch #0 {IOException -> 0x005b, blocks: (B:42:0x0000, B:43:0x000a, B:45:0x000d, B:47:0x001e, B:49:0x0026, B:61:0x0042, B:59:0x003a, B:60:0x003d, B:63:0x0047, B:64:0x004a, B:67:0x005d), top: B:71:0x0000 }] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C1339VH m8357A(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L5b
            Ik[] r0 = new p000.C0551Ik[r0]     // Catch: java.io.IOException -> L5b
            nj r1 = new nj     // Catch: java.io.IOException -> L5b
            r1.<init>()     // Catch: java.io.IOException -> L5b
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L5b
            if (r3 >= r4) goto L5d
            r4 = r12[r3]     // Catch: java.io.IOException -> L5b
            java.lang.String[] r5 = p000.AbstractC11947zc0.f46891e     // Catch: java.io.IOException -> L5b
            r6 = 34
            r1.m23195r0(r6)     // Catch: java.io.IOException -> L5b
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
            r1.m23201w0(r9, r8, r4)     // Catch: java.io.IOException -> L5b
        L3d:
            r1.m23203x0(r10)     // Catch: java.io.IOException -> L5b
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.m23201w0(r9, r7, r4)     // Catch: java.io.IOException -> L5b
        L4a:
            r1.m23195r0(r6)     // Catch: java.io.IOException -> L5b
            r1.m23176J()     // Catch: java.io.IOException -> L5b
            long r4 = r1.f38488b     // Catch: java.io.IOException -> L5b
            Ik r4 = r1.m23178U(r4)     // Catch: java.io.IOException -> L5b
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
            Iy0 r0 = p000.IJ1.m3815b(r0)     // Catch: java.io.IOException -> L5b
            r2 = 14
            r3 = 0
            r1.<init>(r12, r0, r3, r2)     // Catch: java.io.IOException -> L5b
            return r1
        L70:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1339VH.m8357A(java.lang.String[]):VH");
    }

    /* renamed from: B */
    public void m8359B(AbstractC6798s2 abstractC6798s2) {
        C10919rY0 c10919rY0 = (C10919rY0) this.f12486b;
        ((ActionMode.Callback) c10919rY0.f41728b).onDestroyActionMode(c10919rY0.m24424w(abstractC6798s2));
        LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) this.f12487c;
        if (layoutInflaterFactory2C0448H6.f4105w != null) {
            layoutInflaterFactory2C0448H6.f4092l.getDecorView().removeCallbacks(layoutInflaterFactory2C0448H6.f4106x);
        }
        if (layoutInflaterFactory2C0448H6.f4104v != null) {
            C10690pl1 c10690pl1 = layoutInflaterFactory2C0448H6.f4107y;
            if (c10690pl1 != null) {
                c10690pl1.m23871b();
            }
            C10690pl1 c10690pl1M24469a = AbstractC10944rk1.m24469a(layoutInflaterFactory2C0448H6.f4104v);
            c10690pl1M24469a.m23870a(0.0f);
            layoutInflaterFactory2C0448H6.f4107y = c10690pl1M24469a;
            c10690pl1M24469a.m23873d(new C7054w6(2, this));
        }
        layoutInflaterFactory2C0448H6.f4103u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0448H6.f4059A;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9280ek1.m18029c(viewGroup);
        layoutInflaterFactory2C0448H6.m3278J();
    }

    /* renamed from: D */
    public boolean m8360D(AbstractC6798s2 abstractC6798s2, MenuC7450Cq0 menuC7450Cq0) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0448H6) this.f12487c).f4059A;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9280ek1.m18029c(viewGroup);
        C10919rY0 c10919rY0 = (C10919rY0) this.f12486b;
        C11376v61 c11376v61M24424w = c10919rY0.m24424w(abstractC6798s2);
        L01 l01 = (L01) c10919rY0.f41731e;
        Menu menuC8904br0 = (Menu) l01.getOrDefault(menuC7450Cq0, null);
        if (menuC8904br0 == null) {
            menuC8904br0 = new MenuC8904br0((Context) c10919rY0.f41729c, menuC7450Cq0);
            l01.put(menuC7450Cq0, menuC8904br0);
        }
        return ((ActionMode.Callback) c10919rY0.f41728b).onPrepareActionMode(c11376v61M24424w, menuC8904br0);
    }

    /* renamed from: E */
    public InterfaceC8357Ub1 m8361E(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.f12486b;
            if (i2 >= iArr.length) {
                AbstractC10872rA1.m24171d("Unmatched track of type: " + i);
                return new C1404WJ();
            }
            if (i == iArr[i2]) {
                return ((C8988cV0[]) this.f12487c)[i2];
            }
            i2++;
        }
    }

    /* renamed from: F */
    public void m8362F(C10919rY0 c10919rY0, C8779as1 c8779as1) {
        C8991cW1 c8991cW1 = new C8991cW1(c8779as1);
        TreeMap treeMap = (TreeMap) this.f12486b;
        for (Integer num : treeMap.keySet()) {
            C9692hy1 c9692hy1 = (C9692hy1) ((C9692hy1) c8779as1.f16641c).clone();
            InterfaceC7885Kz1 interfaceC7885Kz1Mo6842a = ((C8197Qz1) treeMap.get(num)).mo6842a(c10919rY0, Collections.singletonList(c8991cW1));
            int iM24594p = interfaceC7885Kz1Mo6842a instanceof C7987My1 ? AbstractC10983s22.m24594p(((C7987My1) interfaceC7885Kz1Mo6842a).f7417a.doubleValue()) : -1;
            if (iM24594p == 2 || iM24594p == -1) {
                c8779as1.f16641c = c9692hy1;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f12487c;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC7885Kz1 interfaceC7885Kz1Mo6842a2 = ((C8197Qz1) treeMap2.get((Integer) it.next())).mo6842a(c10919rY0, Collections.singletonList(c8991cW1));
            if (interfaceC7885Kz1Mo6842a2 instanceof C7987My1) {
                AbstractC10983s22.m24594p(((C7987My1) interfaceC7885Kz1Mo6842a2).f7417a.doubleValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x014f  */
    @Override // p000.InterfaceC0111Bl
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo851Z(p000.InterfaceC6843sl r20, p000.HS0 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1339VH.mo851Z(sl, HS0):void");
    }

    @Override // p000.InterfaceC1540YT
    /* renamed from: a */
    public void mo6117a(File file) {
        C7295zw c7295zwM18786a = C4167hF.m18786a((C4167hF) this.f12487c, file);
        if (c7295zwM18786a == null || c7295zwM18786a.f47104b != ".cnt") {
            return;
        }
        ((ArrayList) this.f12486b).add(new C4104gF(file, c7295zwM18786a.f47105c));
    }

    @Override // p000.AB1
    /* renamed from: d */
    public C10919rY0 mo103d(InterfaceC7885Kz1 interfaceC7885Kz1) {
        C10919rY0 c10919rY0M24410I = ((C10919rY0) this.f12486b).m24410I();
        String str = (String) this.f12487c;
        c10919rY0M24410I.m24414M(str, interfaceC7885Kz1);
        ((HashMap) c10919rY0M24410I.f41731e).put(str, Boolean.TRUE);
        return c10919rY0M24410I;
    }

    /* renamed from: e */
    public C8027Ns1 m8363e() throws JSONException {
        C7546Em0 c7546Em0M25309a = AbstractC11367v22.m25309a(((C8262Sg0) this.f12486b).m7417a());
        if (c7546Em0M25309a == null) {
            return null;
        }
        String strM1549h = D51.m1549h(AbstractC6366lU.m22434d(c7546Em0M25309a.f2897a));
        C10525oT0 c10525oT0 = (C10525oT0) this.f12487c;
        c10525oT0.getClass();
        JSONObject jSONObject = new JSONObject(strM1549h);
        JSONObject jSONObject2 = jSONObject.getJSONObject("CONFIG_KEY");
        O90.m5967e(jSONObject2, "jsonObject.getJSONObject(CONFIG_KEY)");
        Map mapM25406a = AbstractC11410vN1.m25406a(jSONObject2);
        String strOptString = jSONObject.optString("SHORT_SEGMENTS_KEY");
        O90.m5967e(strOptString, "jsonObject.optString(SHORT_SEGMENTS_KEY)");
        ((C7460Cv0) c10525oT0.f39025a).getClass();
        String strM1458e0 = C7460Cv0.m1458e0(strOptString);
        long j = jSONObject.getLong("VERSION_KEY");
        String string = jSONObject.getString("HASH_KEY");
        O90.m5967e(string, "jsonObject.getString(HASH_KEY)");
        return new C8027Ns1(mapM25406a, new C11224tw1(j, string), strM1458e0);
    }

    @Override // p000.InterfaceC10467o11
    /* renamed from: e0 */
    public void mo1066e0(InterfaceC0651KK interfaceC0651KK) {
        ((InterfaceC10467o11) this.f12486b).mo1066e0(interfaceC0651KK);
    }

    /* renamed from: f */
    public void m8364f(C8027Ns1 c8027Ns1) throws JSONException, IOException {
        C11224tw1 c11224tw1 = c8027Ns1.f8100b;
        long j = c11224tw1.f43427a;
        String strValueOf = String.valueOf(j);
        C8262Sg0 c8262Sg0 = (C8262Sg0) this.f12486b;
        O90.m5968f(strValueOf, "fileName");
        File file = new File((File) c8262Sg0.f10906a.getValue(), strValueOf);
        file.delete();
        file.createNewFile();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("VERSION_KEY", j);
        jSONObject.put("HASH_KEY", c11224tw1.f43428b);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : c8027Ns1.f8099a.entrySet()) {
            jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
        }
        jSONObject.put("CONFIG_KEY", jSONObject2);
        String str = c8027Ns1.f8101c;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("short_segments", str);
        String string = jSONObject3.toString();
        O90.m5967e(string, "JSONObject().apply {\n   …ids)\n        }.toString()");
        jSONObject.put("SHORT_SEGMENTS_KEY", new JSONObject(string));
        String string2 = jSONObject.toString();
        O90.m5967e(string2, "jsonObject.toString()");
        byte[] bytes = string2.getBytes(AbstractC7038vr.f44561a);
        O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            AbstractC8729aT1.m9749a(fileOutputStream, null);
        } finally {
        }
    }

    /* renamed from: g */
    public Size[] m8365g(Size[] sizeArr, int i) {
        List listEmptyList;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList(Arrays.asList(sizeArr));
        if (((ExtraSupportedOutputSizeQuirk) this.f12486b) != null) {
            Size[] sizeArr2 = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr2.length > 0) {
                arrayList3.addAll(Arrays.asList(sizeArr2));
            }
        }
        C6222jC c6222jC = (C6222jC) this.f12487c;
        c6222jC.getClass();
        if (((ExcludedSupportedSizesQuirk) AbstractC7067wJ.f44776a.m17864z0(ExcludedSupportedSizesQuirk.class)) == null) {
            listEmptyList = new ArrayList();
        } else {
            String str = c6222jC.f34970a;
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
                } else if (ExcludedSupportedSizesQuirk.m9876f()) {
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
                } else if (ExcludedSupportedSizesQuirk.m9875e()) {
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
                } else if (ExcludedSupportedSizesQuirk.m9874d()) {
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
                    AbstractC7806Jm0.m4412f("ExcludedSupportedSizesQuirk");
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
            AbstractC7806Jm0.m4412f("OutputSizesCorrector");
        }
        return (Size[]) arrayList3.toArray(new Size[0]);
    }

    @Override // com.p019vk.push.common.HostInfoProvider
    public String getHost() {
        return (String) this.f12486b;
    }

    @Override // com.p019vk.push.common.HostInfoProvider
    public Integer getPort() {
        return HostInfoProvider.DefaultImpls.getPort(this);
    }

    @Override // com.p019vk.push.common.HostInfoProvider
    public String getScheme() {
        return (String) this.f12487c;
    }

    /* renamed from: h */
    public String m8366h(InterfaceC7740If0 interfaceC7740If0) {
        String str;
        XU0 xu0 = (XU0) ((C8539Xo1) this.f12487c).mo4581i();
        try {
            interfaceC7740If0.mo967a(xu0.f13811a);
            byte[] bArrDigest = xu0.f13811a.digest();
            char[] cArr = AbstractC7381Bh1.f977b;
            synchronized (cArr) {
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b = bArrDigest[i];
                    int i2 = i * 2;
                    char[] cArr2 = AbstractC7381Bh1.f976a;
                    cArr[i2] = cArr2[(b & 255) >>> 4];
                    cArr[i2 + 1] = cArr2[b & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            ((C8539Xo1) this.f12487c).mo4580d(xu0);
        }
    }

    /* renamed from: i */
    public String m8367i(int i, byte[] bArr) throws CharacterCodingException {
        byte[] bArr2 = (byte[]) this.f12487c;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + i];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, ((byte[]) this.f12487c).length, i);
            i += ((byte[]) this.f12487c).length;
            bArr = bArr3;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        boolean z = false;
        int i2 = 0;
        CharBuffer charBufferDecode = null;
        while (!z && i2 < 4) {
            try {
                charBufferDecode = ((CharsetDecoder) this.f12486b).decode(byteBufferWrap);
                z = true;
            } catch (CharacterCodingException unused) {
                i2++;
                byteBufferWrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if (!z || i2 <= 0) {
            this.f12487c = null;
        } else {
            byte[] bArr4 = new byte[i2];
            this.f12487c = bArr4;
            System.arraycopy(bArr, i - i2, bArr4, 0, i2);
        }
        if (z) {
            return new String(charBufferDecode.array(), 0, charBufferDecode.length());
        }
        AbstractC3929dS.m17683p("ReactNative");
        return "";
    }

    @Override // p000.InterfaceC6216j6
    /* renamed from: j */
    public void mo8368j(C1761b3 c1761b3) {
        O90.m5968f(c1761b3, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((C4238iN) this.f12487c).mo8368j(c1761b3);
    }

    /* renamed from: k */
    public void m8369k(Fragment fragment, Bundle bundle, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8369k(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentActivityCreated(abstractC1733o, fragment, bundle);
        }
    }

    /* renamed from: l */
    public void m8370l(Fragment fragment, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        AbstractActivityC1730l abstractActivityC1730l = abstractC1733o.f16232t.f14957b;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8370l(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentAttached(abstractC1733o, fragment, abstractActivityC1730l);
        }
    }

    /* renamed from: m */
    public void m8371m(Fragment fragment, Bundle bundle, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8371m(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentCreated(abstractC1733o, fragment, bundle);
        }
    }

    /* renamed from: n */
    public void m8372n(Fragment fragment, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8372n(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentDestroyed(abstractC1733o, fragment);
        }
    }

    /* renamed from: o */
    public void m8373o(Fragment fragment, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8373o(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentDetached(abstractC1733o, fragment);
        }
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        C7463Cw1 c7463Cw1 = (C7463Cw1) this.f12486b;
        S81 s81 = (S81) this.f12487c;
        synchronized (c7463Cw1.f1772f) {
            c7463Cw1.f1771e.remove(s81);
        }
    }

    @Override // p000.InterfaceC10467o11
    public void onError(Throwable th) {
        O90.m5968f(th, "e");
        ((InterfaceC10467o11) this.f12486b).onError(th);
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        switch (this.f12485a) {
            case 5:
                return;
            case 10:
                int i = ((R61) this.f12486b).f10007f;
                if (i == 2 && (th instanceof CancellationException)) {
                    AbstractC7806Jm0.m4412f("DualSurfaceProcessorNode");
                    return;
                } else {
                    WT1.m8782a(i);
                    AbstractC7806Jm0.m4412f("DualSurfaceProcessorNode");
                    return;
                }
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [Vg0, nZ] */
    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        Object objM7015b;
        switch (this.f12485a) {
            case 5:
                ((C0175Cm) this.f12487c).f1637p.remove((InterfaceC4204hq) this.f12486b);
                int iM26247x = AbstractC7222ym.m26247x(((C0175Cm) this.f12487c).f1621L);
                if (iM26247x != 1 && iM26247x != 4) {
                    if (iM26247x == 5 || (iM26247x == 6 && ((C0175Cm) this.f12487c).f1632k != 0)) {
                        ((C0175Cm) this.f12487c).m1347u("Camera reopen required. Checking if the current camera can be closed safely.");
                    }
                }
                if (((C0175Cm) this.f12487c).f1637p.isEmpty()) {
                    C0175Cm c0175Cm = (C0175Cm) this.f12487c;
                    if (c0175Cm.f1631j != null) {
                        c0175Cm.m1347u("closing camera");
                        ((C0175Cm) this.f12487c).f1631j.close();
                        ((C0175Cm) this.f12487c).f1631j = null;
                        break;
                    }
                }
                break;
            case 10:
                T61 t61 = (T61) obj;
                t61.getClass();
                C6421mM c6421mM = (C6421mM) ((C6479nH) this.f12487c).f38227a;
                if (!c6421mM.f37645g.get()) {
                    RunnableC3973eA runnableC3973eA = new RunnableC3973eA(c6421mM, 17, t61);
                    Objects.requireNonNull(t61);
                    c6421mM.m22809b(runnableC3973eA, new RunnableC0204DE(3, t61));
                    break;
                } else {
                    t61.close();
                    break;
                }
            case 21:
                try {
                    objM7015b = ((C9699i11) this.f12487c).f28761c.invoke(obj);
                } catch (Throwable th) {
                    objM7015b = RQ1.m7015b(th);
                }
                boolean z = objM7015b instanceof OS0;
                InterfaceC10467o11 interfaceC10467o11 = (InterfaceC10467o11) this.f12486b;
                if (!z) {
                    interfaceC10467o11.onSuccess(objM7015b);
                }
                Throwable thM6365a = PS0.m6365a(objM7015b);
                if (thM6365a != null) {
                    interfaceC10467o11.onError(thM6365a);
                    break;
                }
                break;
            default:
                AbstractC9104dM1.m17550i(((C0859Ne) obj).f7932a != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                AbstractC7806Jm0.m4412f("TextureViewImpl");
                ((SurfaceTexture) this.f12486b).release();
                Q91 q91 = ((P91) this.f12487c).f8878a;
                if (q91.f9509j != null) {
                    q91.f9509j = null;
                    break;
                }
                break;
        }
    }

    /* renamed from: p */
    public void m8374p(Fragment fragment, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8374p(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentPaused(abstractC1733o, fragment);
        }
    }

    /* renamed from: q */
    public void m8375q(Fragment fragment, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        AbstractActivityC1730l abstractActivityC1730l = abstractC1733o.f16232t.f14957b;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8375q(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentPreAttached(abstractC1733o, fragment, abstractActivityC1730l);
        }
    }

    /* renamed from: r */
    public void m8376r(Fragment fragment, Bundle bundle, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8376r(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentPreCreated(abstractC1733o, fragment, bundle);
        }
    }

    /* renamed from: s */
    public void m8377s(Fragment fragment, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8377s(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentResumed(abstractC1733o, fragment);
        }
    }

    /* renamed from: t */
    public void m8378t(Fragment fragment, Bundle bundle, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8378t(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentSaveInstanceState(abstractC1733o, fragment, bundle);
        }
    }

    public String toString() {
        switch (this.f12485a) {
            case 13:
                return "OutputFileOptions{mFile=" + ((File) this.f12486b) + ", mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=null, mMetadata=" + ((C0926Oi) this.f12487c) + "}";
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m8379u(Fragment fragment, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8379u(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentStarted(abstractC1733o, fragment);
        }
    }

    /* renamed from: v */
    public void m8380v(Fragment fragment, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8380v(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentStopped(abstractC1733o, fragment);
        }
    }

    /* renamed from: w */
    public void m8381w(Fragment fragment, View view, Bundle bundle, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8381w(fragment, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentViewCreated(abstractC1733o, fragment, view, bundle);
        }
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: w0 */
    public void mo852w0(InterfaceC6843sl interfaceC6843sl, IOException iOException) {
        switch (this.f12485a) {
            case 11:
                O90.m5968f(interfaceC6843sl, "call");
                String str = AbstractC1477XT.f13800a;
                iOException.getMessage();
                ((InterfaceC11518wE0) this.f12486b).reject(str, iOException.getMessage(), iOException);
                break;
            default:
                O90.m5968f(interfaceC6843sl, "call");
                ((MN0) this.f12486b).m5351c(iOException, null);
                break;
        }
    }

    /* renamed from: x */
    public void m8382x(Fragment fragment, boolean z) {
        AbstractC1733o abstractC1733o = (AbstractC1733o) this.f12487c;
        Fragment fragment2 = abstractC1733o.f16234v;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f16224l.m8382x(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12486b).iterator();
        while (it.hasNext()) {
            C1671aY c1671aY = (C1671aY) it.next();
            if (z) {
                c1671aY.getClass();
            }
            c1671aY.f15554a.onFragmentViewDestroyed(abstractC1733o, fragment);
        }
    }

    /* renamed from: y */
    public ArrayList m8383y(String str) {
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            c10781qT0M24005a.mo2032V(1);
        } else {
            c10781qT0M24005a.mo2033d(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f12486b;
        workDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM7035c.getCount());
            while (cursorM7035c.moveToNext()) {
                arrayList.add(cursorM7035c.isNull(0) ? null : cursorM7035c.getString(0));
            }
            return arrayList;
        } finally {
            cursorM7035c.close();
            c10781qT0M24005a.release();
        }
    }

    /* renamed from: z */
    public String m8384z(InterfaceC7740If0 interfaceC7740If0) {
        String strM8366h;
        synchronized (((C7285zm) this.f12486b)) {
            strM8366h = (String) ((C7285zm) this.f12486b).m26534a(interfaceC7740If0);
        }
        if (strM8366h == null) {
            strM8366h = m8366h(interfaceC7740If0);
        }
        synchronized (((C7285zm) this.f12486b)) {
            ((C7285zm) this.f12486b).m26537f(interfaceC7740If0, strM8366h);
        }
        return strM8366h;
    }

    public /* synthetic */ C1339VH(Object obj, Object obj2, boolean z, int i) {
        this.f12485a = i;
        this.f12486b = obj;
        this.f12487c = obj2;
    }

    public C1339VH(String str, int i) {
        this.f12485a = i;
        switch (i) {
            case 17:
                this.f12486b = (ExtraSupportedOutputSizeQuirk) AbstractC7067wJ.f44776a.m17864z0(ExtraSupportedOutputSizeQuirk.class);
                this.f12487c = new C6222jC(str, false);
                break;
            default:
                this.f12486b = String.format("chepub.%s.rustore.devmail.ru", Arrays.copyOf(new Object[]{str}, 1));
                this.f12487c = "https";
                break;
        }
    }

    public C1339VH(int i) {
        this.f12485a = i;
        switch (i) {
            case 20:
                this.f12486b = new C7285zm(1000L);
                this.f12487c = AbstractC8137Pv1.m6489b(10, new C7616Fv0(20));
                break;
            case 22:
                this.f12486b = (ImageCaptureFailedForSpecificCombinationQuirk) AbstractC6815sJ.f42362a.m17864z0(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.f12487c = (PreviewGreenTintQuirk) AbstractC6815sJ.f42362a.m17864z0(PreviewGreenTintQuirk.class);
                break;
            case 27:
                this.f12486b = new TreeMap();
                this.f12487c = new TreeMap();
                break;
        }
    }

    public C1339VH(C0134C7 c0134c7) {
        this.f12485a = 2;
        O90.m5968f(c0134c7, "currentActivityProvider");
        O90.m5968f(c0134c7, "currentActivityProvider");
        C0197D7 c0197d7 = new C0197D7();
        c0197d7.f1847b = new Random();
        c0197d7.f1848c = new HashMap();
        c0197d7.f1849d = new HashMap();
        c0197d7.f1850e = new HashMap();
        c0197d7.f1846a = new ArrayList();
        c0197d7.f1851f = new HashMap();
        c0197d7.f1852g = new HashMap();
        c0197d7.f1853h = new Bundle();
        this.f12486b = c0197d7;
        new AtomicInteger();
        this.f12487c = new C4238iN(4, (byte) 0);
        AbstractC9366fP1.m18230b(J10.f5258a, null, new C1823c3(this, null), 3);
    }

    /* renamed from: C */
    private final void m8358C(Throwable th) {
    }

    @Override // p000.InterfaceC1540YT
    /* renamed from: b */
    public void mo6118b(File file) {
    }

    @Override // p000.InterfaceC1540YT
    /* renamed from: c */
    public void mo6119c(File file) {
    }

    public C1339VH(AbstractC10955rq0 abstractC10955rq0, C0986Pf c0986Pf) {
        this.f12485a = 15;
        O90.m5968f(c0986Pf, "pooledByteStreams");
        this.f12486b = abstractC10955rq0;
        this.f12487c = c0986Pf;
    }

    public C1339VH(WorkDatabase_Impl workDatabase_Impl) {
        this.f12485a = 0;
        this.f12486b = workDatabase_Impl;
        this.f12487c = new C1276UH(workDatabase_Impl, 0);
    }

    public C1339VH(ExecutorC10151lY0 executorC10151lY0) {
        this.f12485a = 24;
        this.f12486b = executorC10151lY0;
        this.f12487c = new AtomicInteger(0);
    }

    public C1339VH(Charset charset) {
        this.f12485a = 18;
        this.f12487c = null;
        this.f12486b = charset.newDecoder();
    }

    public C1339VH(AbstractC1733o abstractC1733o) {
        this.f12485a = 12;
        this.f12486b = new CopyOnWriteArrayList();
        this.f12487c = abstractC1733o;
    }

    public C1339VH(C4167hF c4167hF) {
        this.f12485a = 9;
        this.f12487c = c4167hF;
        this.f12486b = new ArrayList();
    }
}
