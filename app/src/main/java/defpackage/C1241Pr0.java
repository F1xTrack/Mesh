package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.yandex.metrica.impl.ob.InterfaceC3013q;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import org.json.JSONObject;
import ru.mes.dnevnik.R;

/* renamed from: Pr0 */
/* loaded from: classes.dex */
public final class C1241Pr0 implements InterfaceC0707Iv, SkuDetailsResponseListener {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public static void A(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = J6.b;
        }
        drawableMutate.setColorFilter(J6.c(i, mode));
    }

    public static YE g(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(AbstractC7209tN0.u(i3, "Invalid value size: "));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = AbstractC0277Dh1.f;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new YE(map);
    }

    public static void i(YE ye, DataOutputStream dataOutputStream) {
        Set<Map.Entry> setEntrySet = ye.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static boolean k(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList m(Context context, int i) {
        int iC = R91.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{R91.b, R91.d, R91.c, R91.f}, new int[]{R91.b(context, R.attr.colorButtonNormal), AbstractC0937Lu.d(iC, i), AbstractC0937Lu.d(iC, i), i});
    }

    public static C0456Fp0 p(IB0 ib0, P70 p70, C0456Fp0 c0456Fp0, C0022Aa1 c0022Aa1) {
        int iB;
        XQ xq = (XQ) ib0;
        AbstractC0178Ca1 abstractC0178Ca1G1 = xq.G1();
        xq.g2();
        if (xq.u1.a.p()) {
            iB = 0;
        } else {
            BB0 bb0 = xq.u1;
            iB = bb0.a.b(bb0.b.a);
        }
        Object objL = abstractC0178Ca1G1.p() ? null : abstractC0178Ca1G1.l(iB);
        int iB2 = (xq.M1() || abstractC0178Ca1G1.p()) ? -1 : abstractC0178Ca1G1.f(iB, c0022Aa1, false).b(AbstractC0277Dh1.Q(xq.E1()) - c0022Aa1.e);
        for (int i = 0; i < p70.size(); i++) {
            C0456Fp0 c0456Fp02 = (C0456Fp0) p70.get(i);
            if (w(c0456Fp02, objL, xq.M1(), xq.B1(), xq.C1(), iB2)) {
                return c0456Fp02;
            }
        }
        if (p70.isEmpty() && c0456Fp0 != null) {
            if (w(c0456Fp0, objL, xq.M1(), xq.B1(), xq.C1(), iB2)) {
                return c0456Fp0;
            }
        }
        return null;
    }

    public static LayerDrawable t(C7796wS0 c7796wS0, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableF = c7796wS0.f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableF2 = c7796wS0.f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean w(C0456Fp0 c0456Fp0, Object obj, boolean z, int i, int i2, int i3) {
        if (!c0456Fp0.a.equals(obj)) {
            return false;
        }
        int i4 = c0456Fp0.b;
        return (z && i4 == i && c0456Fp0.c == i2) || (!z && i4 == -1 && c0456Fp0.e == i3);
    }

    public C3892g32 B(String str, String str2, Bundle bundle) {
        int i;
        try {
            y(str, str2, bundle);
            QT0 qt0 = (QT0) this.c;
            C5217ix0 c5217ix0 = qt0.c;
            int iF = c5217ix0.f();
            TJ tj = TJ.f;
            if (iF >= 12000000) {
                C22 c22E = C22.e(qt0.b);
                synchronized (c22E) {
                    i = c22E.a;
                    c22E.a = i + 1;
                }
                return c22E.f(new C5802m02(i, 1, bundle, 1)).f(tj, C5396jt0.g);
            }
            if (c5217ix0.g() == 0) {
                return AbstractC3782fU1.d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            C3892g32 c3892g32A = qt0.a(bundle);
            V32 v32 = new V32();
            v32.a = qt0;
            v32.b = bundle;
            return c3892g32A.g(tj, v32);
        } catch (InterruptedException | ExecutionException e) {
            return AbstractC3782fU1.d(e);
        }
    }

    public void C() {
        ((InterfaceC5944ml) this.e).f((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public void D(AbstractC0178Ca1 abstractC0178Ca1) {
        VY vyA = C5500kQ0.a();
        if (((P70) this.b).isEmpty()) {
            j(vyA, (C0456Fp0) this.e, abstractC0178Ca1);
            if (!AbstractC5465kE1.a((C0456Fp0) this.f, (C0456Fp0) this.e)) {
                j(vyA, (C0456Fp0) this.f, abstractC0178Ca1);
            }
            if (!AbstractC5465kE1.a((C0456Fp0) this.d, (C0456Fp0) this.e) && !AbstractC5465kE1.a((C0456Fp0) this.d, (C0456Fp0) this.f)) {
                j(vyA, (C0456Fp0) this.d, abstractC0178Ca1);
            }
        } else {
            for (int i = 0; i < ((P70) this.b).size(); i++) {
                j(vyA, (C0456Fp0) ((P70) this.b).get(i), abstractC0178Ca1);
            }
            if (!((P70) this.b).contains((C0456Fp0) this.d)) {
                j(vyA, (C0456Fp0) this.d, abstractC0178Ca1);
            }
        }
        this.c = vyA.p();
    }

    @Override // defpackage.InterfaceC0707Iv
    public Object a(Class cls) {
        if (((Set) this.a).contains(C6997sG0.a(cls))) {
            Object objA = ((InterfaceC0707Iv) this.f).a(cls);
            return !cls.equals(InterfaceC5279jG0.class) ? objA : new LS0((Set) this.e, (InterfaceC5279jG0) objA);
        }
        throw new C7074sg("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // defpackage.InterfaceC0707Iv
    public Set b(C6997sG0 c6997sG0) {
        if (((Set) this.d).contains(c6997sG0)) {
            return ((InterfaceC0707Iv) this.f).b(c6997sG0);
        }
        throw new C7074sg("Attempting to request an undeclared dependency Set<" + c6997sG0 + ">.");
    }

    @Override // defpackage.InterfaceC0707Iv
    public InterfaceC3739fG0 c(Class cls) {
        return f(C6997sG0.a(cls));
    }

    public String d(C7315tw1 c7315tw1, String str) {
        String str2;
        C0788Jw c0788JwP = ((InterfaceC0866Kw) this.c).p();
        Pair pair = new Pair("app_id", (String) this.a);
        C4271i3 c4271i3 = (C4271i3) this.b;
        Pair pair2 = new Pair(AnalyticsBaseParamsConstantsKt.DEVICE_ID, (String) c4271i3.b);
        Pair pair3 = new Pair("cond_s", c7315tw1 != null ? c7315tw1.b : null);
        Pair pair4 = new Pair("config_v", c7315tw1 != null ? Long.valueOf(c7315tw1.a).toString() : null);
        String str3 = (String) c4271i3.d;
        if (str3 == null) {
            str3 = null;
        }
        Pair pair5 = new Pair("app_build", str3);
        String str4 = (String) c4271i3.c;
        if (str4 == null) {
            str4 = null;
        }
        Pair pair6 = new Pair("os_version", str4);
        String str5 = (String) c4271i3.e;
        if (str5 == null) {
            str5 = null;
        }
        Pair pair7 = new Pair("app_version", str5);
        String str6 = (String) c4271i3.f;
        if (str6 == null) {
            str6 = null;
        }
        Pair pair8 = new Pair(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, str6);
        int i = c4271i3.a;
        if (i == 0) {
            str2 = null;
        } else if (i == 1) {
            str2 = "ALPHA";
        } else if (i == 2) {
            str2 = "BETA";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "RELEASE";
        }
        Pair pair9 = new Pair("app_env", str2);
        String str7 = c0788JwP.c;
        if (str7 == null) {
            str7 = null;
        }
        Pair pair10 = new Pair("account", str7);
        String str8 = c0788JwP.b;
        if (str8 == null) {
            str8 = null;
        }
        Map mapH = AbstractC7096sn0.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair("lang", str8), new Pair("short_segments", str == null ? null : str));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapH.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String string = new JSONObject(linkedHashMap).toString();
        O90.e(string, "mapOf(\n            APP_I…Map).toString()\n        }");
        return string;
    }

    @Override // defpackage.InterfaceC0707Iv
    public C0249Cy0 e(C6997sG0 c6997sG0) {
        if (((Set) this.c).contains(c6997sG0)) {
            return ((InterfaceC0707Iv) this.f).e(c6997sG0);
        }
        throw new C7074sg("Attempting to request an undeclared dependency Deferred<" + c6997sG0 + ">.");
    }

    @Override // defpackage.InterfaceC0707Iv
    public InterfaceC3739fG0 f(C6997sG0 c6997sG0) {
        if (((Set) this.b).contains(c6997sG0)) {
            return ((InterfaceC0707Iv) this.f).f(c6997sG0);
        }
        throw new C7074sg("Attempting to request an undeclared dependency Provider<" + c6997sG0 + ">.");
    }

    @Override // defpackage.InterfaceC0707Iv
    public Object h(C6997sG0 c6997sG0) {
        if (((Set) this.a).contains(c6997sG0)) {
            return ((InterfaceC0707Iv) this.f).h(c6997sG0);
        }
        throw new C7074sg("Attempting to request an undeclared dependency " + c6997sG0 + ".");
    }

    public void j(VY vy, C0456Fp0 c0456Fp0, AbstractC0178Ca1 abstractC0178Ca1) {
        if (c0456Fp0 == null) {
            return;
        }
        if (abstractC0178Ca1.b(c0456Fp0.a) != -1) {
            vy.Y(c0456Fp0, abstractC0178Ca1);
            return;
        }
        AbstractC0178Ca1 abstractC0178Ca12 = (AbstractC0178Ca1) ((C5500kQ0) this.c).get(c0456Fp0);
        if (abstractC0178Ca12 != null) {
            vy.Y(c0456Fp0, abstractC0178Ca12);
        }
    }

    public C8211ye l() {
        String strI = ((AbstractC4314iH) this.a) == null ? " surface" : "";
        if (((List) this.b) == null) {
            strI = strI.concat(" sharedSurfaces");
        }
        if (((Integer) this.d) == null) {
            strI = AbstractC8235ym.i(strI, " mirrorMode");
        }
        if (((Integer) this.e) == null) {
            strI = AbstractC8235ym.i(strI, " surfaceGroupId");
        }
        if (((CM) this.f) == null) {
            strI = AbstractC8235ym.i(strI, " dynamicRange");
        }
        if (strI.isEmpty()) {
            return new C8211ye((AbstractC4314iH) this.a, (List) this.b, (String) this.c, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), (CM) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public C8194yY0 n() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C7433uY0 c7433uY0E = C7433uY0.e((C1163Or0) this.c, size);
        c7433uY0E.b.a = 1;
        G70 g70 = new G70(surface);
        this.a = g70;
        AbstractC1500Sz1.a(AbstractC1500Sz1.l(g70.e), new C4332iN(surface, 20, surfaceTexture), QR1.a());
        c7433uY0E.c((G70) this.a, CM.d, -1);
        C7624vY0 c7624vY0 = (C7624vY0) this.f;
        if (c7624vY0 != null) {
            c7624vY0.b();
        }
        C7624vY0 c7624vY02 = new C7624vY0(new C2452c60(2, this));
        this.f = c7624vY02;
        c7433uY0E.f = c7624vY02;
        return c7433uY0E.d();
    }

    public C3892g32 o(C3892g32 c3892g32) {
        return c3892g32.f(new ExecutorC4096h8(2), new EE(16, this));
    }

    @Override // com.android.billingclient.api.SkuDetailsResponseListener
    public void onSkuDetailsResponse(BillingResult billingResult, List list) {
        O90.f(billingResult, "billingResult");
        ((InterfaceC3013q) this.c).a().execute(new C5741lh(this, billingResult, list, 7));
    }

    public C5753ll q(String str) {
        return (C5753ll) ((HashMap) this.a).get(str);
    }

    public C0249Cy0 r(Class cls) {
        return e(C6997sG0.a(cls));
    }

    public C5753ll s(String str) {
        HashMap map = (HashMap) this.a;
        C5753ll c5753ll = (C5753ll) map.get(str);
        if (c5753ll != null) {
            return c5753ll;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        C5753ll c5753ll2 = new C5753ll(iKeyAt, str, YE.c);
        map.put(str, c5753ll2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.d).put(iKeyAt, true);
        ((InterfaceC5944ml) this.e).d(c5753ll2);
        return c5753ll2;
    }

    public ColorStateList u(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC3556eJ.b(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC3556eJ.b(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m(context, R91.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m(context, R91.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC3556eJ.b(context, R.color.abc_tint_spinner);
            }
            if (k(i, (int[]) this.b)) {
                return R91.d(context, R.attr.colorControlNormal);
            }
            if (k(i, (int[]) this.e)) {
                return AbstractC3556eJ.b(context, R.color.abc_tint_default);
            }
            if (k(i, (int[]) this.f)) {
                return AbstractC3556eJ.b(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC3556eJ.b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = R91.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = R91.b;
            iArr2[0] = R91.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = R91.e;
            iArr2[1] = R91.c(context, R.attr.colorControlActivated);
            iArr[2] = R91.f;
            iArr2[2] = R91.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = R91.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = R91.e;
            iArr2[1] = R91.c(context, R.attr.colorControlActivated);
            iArr[2] = R91.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void v(long j) {
        InterfaceC5944ml interfaceC5944ml;
        InterfaceC5944ml interfaceC5944ml2 = (InterfaceC5944ml) this.e;
        interfaceC5944ml2.g(j);
        InterfaceC5944ml interfaceC5944ml3 = (InterfaceC5944ml) this.f;
        if (interfaceC5944ml3 != null) {
            interfaceC5944ml3.g(j);
        }
        boolean zE = interfaceC5944ml2.e();
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap map = (HashMap) this.a;
        if (zE || (interfaceC5944ml = (InterfaceC5944ml) this.f) == null || !interfaceC5944ml.e()) {
            interfaceC5944ml2.h(map, sparseArray);
        } else {
            ((InterfaceC5944ml) this.f).h(map, sparseArray);
            interfaceC5944ml2.b(map);
        }
        InterfaceC5944ml interfaceC5944ml4 = (InterfaceC5944ml) this.f;
        if (interfaceC5944ml4 != null) {
            interfaceC5944ml4.delete();
            this.f = null;
        }
    }

    public void x(String str) {
        HashMap map = (HashMap) this.a;
        C5753ll c5753ll = (C5753ll) map.get(str);
        if (c5753ll != null && c5753ll.c.isEmpty() && c5753ll.d.isEmpty()) {
            map.remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
            int i = c5753ll.a;
            boolean z = sparseBooleanArray.get(i);
            ((InterfaceC5944ml) this.e).c(c5753ll, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.c).put(i, true);
            }
        }
    }

    public void y(String str, String str2, Bundle bundle) {
        int i;
        String strEncodeToString;
        int iA;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        MU mu = (MU) this.a;
        mu.a();
        bundle.putString("gmp_app_id", mu.c.b);
        C0462Fr0 c0462Fr0 = (C0462Fr0) this.b;
        synchronized (c0462Fr0) {
            try {
                if (c0462Fr0.a == 0) {
                    try {
                        packageInfo = ((Context) c0462Fr0.c).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        c0462Fr0.a = packageInfo.versionCode;
                    }
                }
                i = c0462Fr0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C0462Fr0) this.b).a());
        bundle.putString("app_ver_name", ((C0462Fr0) this.b).b());
        MU mu2 = (MU) this.a;
        mu2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(mu2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str3 = ((C1432Sd) AbstractC3782fU1.a(((WU) ((XU) this.f)).e())).a;
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_APPID, (String) AbstractC3782fU1.a(((WU) ((XU) this.f)).d()));
        bundle.putString("cliv", "fcm-24.1.0");
        U20 u20 = (U20) ((InterfaceC3739fG0) this.e).get();
        C3550eH c3550eH = (C3550eH) ((InterfaceC3739fG0) this.d).get();
        if (u20 == null || c3550eH == null || (iA = ((BF) u20).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(AbstractC8235ym.x(iA)));
        bundle.putString("Firebase-Client", c3550eH.a());
    }

    public Set z(Class cls) {
        return b(C6997sG0.a(cls));
    }
}
