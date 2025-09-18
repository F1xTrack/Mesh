package p000;

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
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.yandex.metrica.impl.p022ob.InterfaceC3531q;
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
public final class C8128Pr0 implements InterfaceC0562Iv, SkuDetailsResponseListener {

    /* renamed from: a */
    public Object f9303a;

    /* renamed from: b */
    public Object f9304b;

    /* renamed from: c */
    public Object f9305c;

    /* renamed from: d */
    public Object f9306d;

    /* renamed from: e */
    public Object f9307e;

    /* renamed from: f */
    public Object f9308f;

    /* renamed from: A */
    public static void m6437A(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0574J6.f5336b;
        }
        drawableMutate.setColorFilter(C0574J6.m4155c(i, mode));
    }

    /* renamed from: g */
    public static C1525YE m6438g(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(AbstractC11153tN0.m24909u(i3, "Invalid value size: "));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = AbstractC7485Dh1.f2171f;
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
        return new C1525YE(map);
    }

    /* renamed from: i */
    public static void m6439i(C1525YE c1525ye, DataOutputStream dataOutputStream) {
        Set<Map.Entry> setEntrySet = c1525ye.f14206b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    /* renamed from: k */
    public static boolean m6440k(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static ColorStateList m6441m(Context context, int i) {
        int iM6919c = R91.m6919c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{R91.f10041b, R91.f10043d, R91.f10042c, R91.f10045f}, new int[]{R91.m6918b(context, R.attr.colorButtonNormal), AbstractC0749Lu.m5131d(iM6919c, i), AbstractC0749Lu.m5131d(iM6919c, i), i});
    }

    /* renamed from: p */
    public static C7604Fp0 m6442p(IB0 ib0, P70 p70, C7604Fp0 c7604Fp0, C7315Aa1 c7315Aa1) {
        int iMo1245b;
        C1474XQ c1474xq = (C1474XQ) ib0;
        AbstractC7419Ca1 abstractC7419Ca1M9010G1 = c1474xq.m9010G1();
        c1474xq.m9035g2();
        if (c1474xq.f13743u1.f623a.m1259p()) {
            iMo1245b = 0;
        } else {
            BB0 bb0 = c1474xq.f13743u1;
            iMo1245b = bb0.f623a.mo1245b(bb0.f624b.f3430a);
        }
        Object objMo1255l = abstractC7419Ca1M9010G1.m1259p() ? null : abstractC7419Ca1M9010G1.mo1255l(iMo1245b);
        int iM237b = (c1474xq.m9015M1() || abstractC7419Ca1M9010G1.m1259p()) ? -1 : abstractC7419Ca1M9010G1.mo1249f(iMo1245b, c7315Aa1, false).m237b(AbstractC7485Dh1.m1802Q(c1474xq.m9008E1()) - c7315Aa1.f260e);
        for (int i = 0; i < p70.size(); i++) {
            C7604Fp0 c7604Fp02 = (C7604Fp0) p70.get(i);
            if (m6444w(c7604Fp02, objMo1255l, c1474xq.m9015M1(), c1474xq.m9005B1(), c1474xq.m9006C1(), iM237b)) {
                return c7604Fp02;
            }
        }
        if (p70.isEmpty() && c7604Fp0 != null) {
            if (m6444w(c7604Fp0, objMo1255l, c1474xq.m9015M1(), c1474xq.m9005B1(), c1474xq.m9006C1(), iM237b)) {
                return c7604Fp0;
            }
        }
        return null;
    }

    /* renamed from: t */
    public static LayerDrawable m6443t(C11546wS0 c11546wS0, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM25625f = c11546wS0.m25625f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM25625f2 = c11546wS0.m25625f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM25625f instanceof BitmapDrawable) && drawableM25625f.getIntrinsicWidth() == dimensionPixelSize && drawableM25625f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM25625f;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM25625f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM25625f.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM25625f2 instanceof BitmapDrawable) && drawableM25625f2.getIntrinsicWidth() == dimensionPixelSize && drawableM25625f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM25625f2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM25625f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM25625f2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* renamed from: w */
    public static boolean m6444w(C7604Fp0 c7604Fp0, Object obj, boolean z, int i, int i2, int i3) {
        if (!c7604Fp0.f3430a.equals(obj)) {
            return false;
        }
        int i4 = c7604Fp0.f3431b;
        return (z && i4 == i && c7604Fp0.f3432c == i2) || (!z && i4 == -1 && c7604Fp0.f3434e == i3);
    }

    /* renamed from: B */
    public C9450g32 m6445B(String str, String str2, Bundle bundle) {
        int i;
        try {
            m6459y(str, str2, bundle);
            QT0 qt0 = (QT0) this.f9305c;
            C9817ix0 c9817ix0 = qt0.f9638c;
            int iM21948f = c9817ix0.m21948f();
            ExecutorC1215TJ executorC1215TJ = ExecutorC1215TJ.f11320f;
            if (iM21948f >= 12000000) {
                C22 c22M952e = C22.m952e(qt0.f9637b);
                synchronized (c22M952e) {
                    i = c22M952e.f1149a;
                    c22M952e.f1149a = i + 1;
                }
                return c22M952e.m957f(new C10209m02(i, 1, bundle, 1)).mo11139f(executorC1215TJ, C9937jt0.f35442g);
            }
            if (c9817ix0.m21949g() == 0) {
                return AbstractC9376fU1.m18243d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            C9450g32 c9450g32M6721a = qt0.m6721a(bundle);
            V32 v32 = new V32();
            v32.f12341a = qt0;
            v32.f12342b = bundle;
            return c9450g32M6721a.mo11140g(executorC1215TJ, v32);
        } catch (InterruptedException | ExecutionException e) {
            return AbstractC9376fU1.m18243d(e);
        }
    }

    /* renamed from: C */
    public void m6446C() {
        ((InterfaceC6446ml) this.f9307e).mo18858f((HashMap) this.f9303a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f9305c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.f9304b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.f9306d).clear();
    }

    /* renamed from: D */
    public void m6447D(AbstractC7419Ca1 abstractC7419Ca1) {
        C1356VY c1356vyM22205a = C10007kQ0.m22205a();
        if (((P70) this.f9304b).isEmpty()) {
            m6449j(c1356vyM22205a, (C7604Fp0) this.f9307e, abstractC7419Ca1);
            if (!AbstractC9984kE1.m22173a((C7604Fp0) this.f9308f, (C7604Fp0) this.f9307e)) {
                m6449j(c1356vyM22205a, (C7604Fp0) this.f9308f, abstractC7419Ca1);
            }
            if (!AbstractC9984kE1.m22173a((C7604Fp0) this.f9306d, (C7604Fp0) this.f9307e) && !AbstractC9984kE1.m22173a((C7604Fp0) this.f9306d, (C7604Fp0) this.f9308f)) {
                m6449j(c1356vyM22205a, (C7604Fp0) this.f9306d, abstractC7419Ca1);
            }
        } else {
            for (int i = 0; i < ((P70) this.f9304b).size(); i++) {
                m6449j(c1356vyM22205a, (C7604Fp0) ((P70) this.f9304b).get(i), abstractC7419Ca1);
            }
            if (!((P70) this.f9304b).contains((C7604Fp0) this.f9306d)) {
                m6449j(c1356vyM22205a, (C7604Fp0) this.f9306d, abstractC7419Ca1);
            }
        }
        this.f9305c = c1356vyM22205a.m8503p();
    }

    @Override // p000.InterfaceC0562Iv
    /* renamed from: a */
    public Object mo4066a(Class cls) {
        if (((Set) this.f9303a).contains(C11011sG0.m24687a(cls))) {
            Object objMo4066a = ((InterfaceC0562Iv) this.f9308f).mo4066a(cls);
            return !cls.equals(InterfaceC9859jG0.class) ? objMo4066a : new LS0((Set) this.f9307e, (InterfaceC9859jG0) objMo4066a);
        }
        throw new C6838sg("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // p000.InterfaceC0562Iv
    /* renamed from: b */
    public Set mo4067b(C11011sG0 c11011sG0) {
        if (((Set) this.f9306d).contains(c11011sG0)) {
            return ((InterfaceC0562Iv) this.f9308f).mo4067b(c11011sG0);
        }
        throw new C6838sg("Attempting to request an undeclared dependency Set<" + c11011sG0 + ">.");
    }

    @Override // p000.InterfaceC0562Iv
    /* renamed from: c */
    public InterfaceC9347fG0 mo4068c(Class cls) {
        return mo4070f(C11011sG0.m24687a(cls));
    }

    /* renamed from: d */
    public String m6448d(C11224tw1 c11224tw1, String str) {
        String str2;
        C0626Jw c0626JwMo4780p = ((InterfaceC0689Kw) this.f9305c).mo4780p();
        Pair pair = new Pair("app_id", (String) this.f9303a);
        C4218i3 c4218i3 = (C4218i3) this.f9304b;
        Pair pair2 = new Pair(AnalyticsBaseParamsConstantsKt.DEVICE_ID, (String) c4218i3.f28782b);
        Pair pair3 = new Pair("cond_s", c11224tw1 != null ? c11224tw1.f43428b : null);
        Pair pair4 = new Pair("config_v", c11224tw1 != null ? Long.valueOf(c11224tw1.f43427a).toString() : null);
        String str3 = (String) c4218i3.f28784d;
        if (str3 == null) {
            str3 = null;
        }
        Pair pair5 = new Pair("app_build", str3);
        String str4 = (String) c4218i3.f28783c;
        if (str4 == null) {
            str4 = null;
        }
        Pair pair6 = new Pair("os_version", str4);
        String str5 = (String) c4218i3.f28785e;
        if (str5 == null) {
            str5 = null;
        }
        Pair pair7 = new Pair("app_version", str5);
        String str6 = (String) c4218i3.f28786f;
        if (str6 == null) {
            str6 = null;
        }
        Pair pair8 = new Pair(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, str6);
        int i = c4218i3.f28781a;
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
        String str7 = c0626JwMo4780p.f5804c;
        if (str7 == null) {
            str7 = null;
        }
        Pair pair10 = new Pair("account", str7);
        String str8 = c0626JwMo4780p.f5803b;
        if (str8 == null) {
            str8 = null;
        }
        Map mapM24780h = AbstractC11077sn0.m24780h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair("lang", str8), new Pair("short_segments", str == null ? null : str));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM24780h.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String string = new JSONObject(linkedHashMap).toString();
        O90.m5967e(string, "mapOf(\n            APP_I…Map).toString()\n        }");
        return string;
    }

    @Override // p000.InterfaceC0562Iv
    /* renamed from: e */
    public C7466Cy0 mo4069e(C11011sG0 c11011sG0) {
        if (((Set) this.f9305c).contains(c11011sG0)) {
            return ((InterfaceC0562Iv) this.f9308f).mo4069e(c11011sG0);
        }
        throw new C6838sg("Attempting to request an undeclared dependency Deferred<" + c11011sG0 + ">.");
    }

    @Override // p000.InterfaceC0562Iv
    /* renamed from: f */
    public InterfaceC9347fG0 mo4070f(C11011sG0 c11011sG0) {
        if (((Set) this.f9304b).contains(c11011sG0)) {
            return ((InterfaceC0562Iv) this.f9308f).mo4070f(c11011sG0);
        }
        throw new C6838sg("Attempting to request an undeclared dependency Provider<" + c11011sG0 + ">.");
    }

    @Override // p000.InterfaceC0562Iv
    /* renamed from: h */
    public Object mo4071h(C11011sG0 c11011sG0) {
        if (((Set) this.f9303a).contains(c11011sG0)) {
            return ((InterfaceC0562Iv) this.f9308f).mo4071h(c11011sG0);
        }
        throw new C6838sg("Attempting to request an undeclared dependency " + c11011sG0 + ".");
    }

    /* renamed from: j */
    public void m6449j(C1356VY c1356vy, C7604Fp0 c7604Fp0, AbstractC7419Ca1 abstractC7419Ca1) {
        if (c7604Fp0 == null) {
            return;
        }
        if (abstractC7419Ca1.mo1245b(c7604Fp0.f3430a) != -1) {
            c1356vy.m8486Y(c7604Fp0, abstractC7419Ca1);
            return;
        }
        AbstractC7419Ca1 abstractC7419Ca12 = (AbstractC7419Ca1) ((C10007kQ0) this.f9305c).get(c7604Fp0);
        if (abstractC7419Ca12 != null) {
            c1356vy.m8486Y(c7604Fp0, abstractC7419Ca12);
        }
    }

    /* renamed from: l */
    public C7214ye m6450l() {
        String strM26232i = ((AbstractC4232iH) this.f9303a) == null ? " surface" : "";
        if (((List) this.f9304b) == null) {
            strM26232i = strM26232i.concat(" sharedSurfaces");
        }
        if (((Integer) this.f9306d) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " mirrorMode");
        }
        if (((Integer) this.f9307e) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " surfaceGroupId");
        }
        if (((C0149CM) this.f9308f) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " dynamicRange");
        }
        if (strM26232i.isEmpty()) {
            return new C7214ye((AbstractC4232iH) this.f9303a, (List) this.f9304b, (String) this.f9305c, ((Integer) this.f9306d).intValue(), ((Integer) this.f9307e).intValue(), (C0149CM) this.f9308f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strM26232i));
    }

    /* renamed from: n */
    public C11812yY0 m6451n() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.f9306d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C11303uY0 c11303uY0M25202e = C11303uY0.m25202e((C8076Or0) this.f9305c, size);
        c11303uY0M25202e.f43134b.f15113a = 1;
        G70 g70 = new G70(surface);
        this.f9303a = g70;
        AbstractC8301Sz1.m7478a(AbstractC8301Sz1.m7489l(g70.f29023e), new C4238iN(surface, 20, surfaceTexture), QR1.m6703a());
        c11303uY0M25202e.m25205c((G70) this.f9303a, C0149CM.f1329d, -1);
        C11431vY0 c11431vY0 = (C11431vY0) this.f9308f;
        if (c11431vY0 != null) {
            c11431vY0.m25443b();
        }
        C11431vY0 c11431vY02 = new C11431vY0(new C8938c60(2, this));
        this.f9308f = c11431vY02;
        c11303uY0M25202e.f43138f = c11431vY02;
        return c11303uY0M25202e.m25206d();
    }

    /* renamed from: o */
    public C9450g32 m6452o(C9450g32 c9450g32) {
        return c9450g32.mo11139f(new ExecutorC4160h8(2), new C0267EE(16, this));
    }

    @Override // com.android.billingclient.api.SkuDetailsResponseListener
    public void onSkuDetailsResponse(BillingResult billingResult, List list) {
        O90.m5968f(billingResult, "billingResult");
        ((InterfaceC3531q) this.f9305c).mo3440a().execute(new C6379lh(this, billingResult, list, 7));
    }

    /* renamed from: q */
    public C6383ll m6453q(String str) {
        return (C6383ll) ((HashMap) this.f9303a).get(str);
    }

    /* renamed from: r */
    public C7466Cy0 m6454r(Class cls) {
        return mo4069e(C11011sG0.m24687a(cls));
    }

    /* renamed from: s */
    public C6383ll m6455s(String str) {
        HashMap map = (HashMap) this.f9303a;
        C6383ll c6383ll = (C6383ll) map.get(str);
        if (c6383ll != null) {
            return c6383ll;
        }
        SparseArray sparseArray = (SparseArray) this.f9304b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        C6383ll c6383ll2 = new C6383ll(iKeyAt, str, C1525YE.f14204c);
        map.put(str, c6383ll2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.f9306d).put(iKeyAt, true);
        ((InterfaceC6446ml) this.f9307e).mo18856d(c6383ll2);
        return c6383ll2;
    }

    /* renamed from: u */
    public ColorStateList m6456u(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC3982eJ.m17900b(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC3982eJ.m17900b(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m6441m(context, R91.m6919c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m6441m(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m6441m(context, R91.m6919c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC3982eJ.m17900b(context, R.color.abc_tint_spinner);
            }
            if (m6440k(i, (int[]) this.f9304b)) {
                return R91.m6920d(context, R.attr.colorControlNormal);
            }
            if (m6440k(i, (int[]) this.f9307e)) {
                return AbstractC3982eJ.m17900b(context, R.color.abc_tint_default);
            }
            if (m6440k(i, (int[]) this.f9308f)) {
                return AbstractC3982eJ.m17900b(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC3982eJ.m17900b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM6920d = R91.m6920d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM6920d == null || !colorStateListM6920d.isStateful()) {
            iArr[0] = R91.f10041b;
            iArr2[0] = R91.m6918b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = R91.f10044e;
            iArr2[1] = R91.m6919c(context, R.attr.colorControlActivated);
            iArr[2] = R91.f10045f;
            iArr2[2] = R91.m6919c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = R91.f10041b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM6920d.getColorForState(iArr3, 0);
            iArr[1] = R91.f10044e;
            iArr2[1] = R91.m6919c(context, R.attr.colorControlActivated);
            iArr[2] = R91.f10045f;
            iArr2[2] = colorStateListM6920d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: v */
    public void m6457v(long j) {
        InterfaceC6446ml interfaceC6446ml;
        InterfaceC6446ml interfaceC6446ml2 = (InterfaceC6446ml) this.f9307e;
        interfaceC6446ml2.mo18859g(j);
        InterfaceC6446ml interfaceC6446ml3 = (InterfaceC6446ml) this.f9308f;
        if (interfaceC6446ml3 != null) {
            interfaceC6446ml3.mo18859g(j);
        }
        boolean zMo18857e = interfaceC6446ml2.mo18857e();
        SparseArray sparseArray = (SparseArray) this.f9304b;
        HashMap map = (HashMap) this.f9303a;
        if (zMo18857e || (interfaceC6446ml = (InterfaceC6446ml) this.f9308f) == null || !interfaceC6446ml.mo18857e()) {
            interfaceC6446ml2.mo18860h(map, sparseArray);
        } else {
            ((InterfaceC6446ml) this.f9308f).mo18860h(map, sparseArray);
            interfaceC6446ml2.mo18854b(map);
        }
        InterfaceC6446ml interfaceC6446ml4 = (InterfaceC6446ml) this.f9308f;
        if (interfaceC6446ml4 != null) {
            interfaceC6446ml4.delete();
            this.f9308f = null;
        }
    }

    /* renamed from: x */
    public void m6458x(String str) {
        HashMap map = (HashMap) this.f9303a;
        C6383ll c6383ll = (C6383ll) map.get(str);
        if (c6383ll != null && c6383ll.f37280c.isEmpty() && c6383ll.f37281d.isEmpty()) {
            map.remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f9306d;
            int i = c6383ll.f37278a;
            boolean z = sparseBooleanArray.get(i);
            ((InterfaceC6446ml) this.f9307e).mo18855c(c6383ll, z);
            SparseArray sparseArray = (SparseArray) this.f9304b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.f9305c).put(i, true);
            }
        }
    }

    /* renamed from: y */
    public void m6459y(String str, String str2, Bundle bundle) {
        int i;
        String strEncodeToString;
        int iM562a;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        C0786MU c0786mu = (C0786MU) this.f9303a;
        c0786mu.m5379a();
        bundle.putString("gmp_app_id", c0786mu.f7176c.f27219b);
        C7608Fr0 c7608Fr0 = (C7608Fr0) this.f9304b;
        synchronized (c7608Fr0) {
            try {
                if (c7608Fr0.f3444a == 0) {
                    try {
                        packageInfo = ((Context) c7608Fr0.f3446c).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        c7608Fr0.f3444a = packageInfo.versionCode;
                    }
                }
                i = c7608Fr0.f3444a;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C7608Fr0) this.f9304b).m2801a());
        bundle.putString("app_ver_name", ((C7608Fr0) this.f9304b).m2802b());
        C0786MU c0786mu2 = (C0786MU) this.f9303a;
        c0786mu2.m5379a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(c0786mu2.f7175b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str3 = ((C1172Sd) AbstractC9376fU1.m18240a(((C1415WU) ((InterfaceC1478XU) this.f9308f)).m8790e())).f10878a;
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_APPID, (String) AbstractC9376fU1.m18240a(((C1415WU) ((InterfaceC1478XU) this.f9308f)).m8789d()));
        bundle.putString("cliv", "fcm-24.1.0");
        U20 u20 = (U20) ((InterfaceC9347fG0) this.f9307e).get();
        C3980eH c3980eH = (C3980eH) ((InterfaceC9347fG0) this.f9306d).get();
        if (u20 == null || c3980eH == null || (iM562a = ((C0079BF) u20).m562a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(AbstractC7222ym.m26247x(iM562a)));
        bundle.putString("Firebase-Client", c3980eH.m17894a());
    }

    /* renamed from: z */
    public Set m6460z(Class cls) {
        return mo4067b(C11011sG0.m24687a(cls));
    }
}
