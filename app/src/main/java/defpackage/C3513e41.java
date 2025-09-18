package defpackage;

import android.content.ClipData;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ContentInfo;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.imagepipeline.image.EncodedImage;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.rn.push.constants.LocalNotification;
import expo.modules.securestore.SecureStoreOptions;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.mes.dnevnik.R;
import ru.ok.tracer.base.ucum.UcumUtils;

/* renamed from: e41 */
/* loaded from: classes.dex */
public final class C3513e41 implements InterfaceC1784Wq0, InterfaceC3677ex0, InterfaceC7986xS0, InterfaceC0605Hn, InterfaceC1646Uw0, InterfaceC8081xy, InterfaceC5369jk0, InterfaceC1428Sb1, InterfaceC5878mP, InterfaceC7412uR0, InterfaceC2151aX, InterfaceC0443Fl, InterfaceC0738Jf0, InterfaceC7727w50, InterfaceC0691Ip1, InterfaceC1576Tz {
    public static final Object c = new Object();
    public static C3513e41 d;
    public static int e;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C3513e41(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static boolean L0(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static C3513e41 O0() {
        synchronized (c) {
            try {
                C3513e41 c3513e41 = d;
                if (c3513e41 == null) {
                    return new C3513e41(1, false);
                }
                d = (C3513e41) c3513e41.b;
                c3513e41.b = null;
                e--;
                return c3513e41;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void T0(StringBuilder sb, char[] cArr, char c2) {
        for (int i = 0; i < sb.length(); i++) {
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (sb.charAt(i) == cArr[i2]) {
                        sb.setCharAt(i, c2);
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    public static int U0(EnumC5246j50 enumC5246j50) throws C0254Da {
        int iOrdinal = enumC5246j50.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                throw new C0254Da("Invalid DateStyle: ".concat(enumC5246j50.toString()), 10);
            }
        }
        return i;
    }

    public static int V0(EnumC6964s50 enumC6964s50) throws C0254Da {
        int iOrdinal = enumC6964s50.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                throw new C0254Da("Invalid DateStyle: ".concat(enumC6964s50.toString()), 10);
            }
        }
        return i;
    }

    public static void W0(C3513e41 c3513e41) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) c3513e41.b).iterator();
        while (it.hasNext()) {
            arrayList.add(((CG0) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            return;
        }
        while (true) {
            sb.append((CharSequence) it2.next());
            if (!it2.hasNext()) {
                return;
            } else {
                sb.append((CharSequence) " | ");
            }
        }
    }

    public static void X0(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public static void t0(C3866fw1 c3866fw1, String str, List list) {
        String str2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str3 = (String) pair.a;
            Object obj = pair.b;
            if (obj instanceof String) {
                str2 = str3 + "=\"" + obj + "\"";
            } else {
                if (!(obj instanceof Number)) {
                    throw new IllegalArgumentException(AbstractC7209tN0.v(obj.getClass(), "Unsupported value type: "));
                }
                str2 = str3 + ContainerUtils.KEY_VALUE_DELIMITER + obj;
            }
            AbstractC3588eT1.a(str, str2);
            C2223av c2223av = (C2223av) c3866fw1.b;
            Collection arrayList = (Collection) c2223av.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c2223av.put(str, arrayList);
            }
            arrayList.add(str2);
        }
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Set A(C0572Hc c0572Hc) {
        return AbstractC7209tN0.d(this, c0572Hc);
    }

    public synchronized EncodedImage A0(O01 o01) {
        EncodedImage encodedImageCloneOrNull = (EncodedImage) ((HashMap) this.b).get(o01);
        if (encodedImageCloneOrNull != null) {
            synchronized (encodedImageCloneOrNull) {
                if (!EncodedImage.isValid(encodedImageCloneOrNull)) {
                    ((HashMap) this.b).remove(o01);
                    AbstractC3393dS.o(C3513e41.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(encodedImageCloneOrNull)), o01.a, Integer.valueOf(System.identityHashCode(o01)));
                    return null;
                }
                encodedImageCloneOrNull = EncodedImage.cloneOrNull(encodedImageCloneOrNull);
            }
        }
        return encodedImageCloneOrNull;
    }

    @Override // defpackage.InterfaceC0605Hn
    public boolean B() {
        return ((Boolean) q(InterfaceC0605Hn.k0, Boolean.FALSE)).booleanValue();
    }

    public ArrayList B0(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            CG0 cg0 = (CG0) it.next();
            if (cls.isAssignableFrom(cg0.getClass())) {
                arrayList.add(cg0);
            }
        }
        return arrayList;
    }

    public boolean C0(String str) {
        String strJ0 = J0(str);
        return "1".equals(strJ0) || Boolean.parseBoolean(strJ0);
    }

    public Integer D0(String str) {
        String strJ0 = J0(str);
        if (TextUtils.isEmpty(strJ0)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strJ0));
        } catch (NumberFormatException unused) {
            X0(str);
            return null;
        }
    }

    public JSONArray E0(String str) {
        String strJ0 = J0(str);
        if (TextUtils.isEmpty(strJ0)) {
            return null;
        }
        try {
            return new JSONArray(strJ0);
        } catch (JSONException unused) {
            X0(str);
            return null;
        }
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Object F(C0572Hc c0572Hc, EnumC6931rw enumC6931rw) {
        return AbstractC7209tN0.k(this, c0572Hc, enumC6931rw);
    }

    public int[] F0() throws JSONException {
        JSONArray jSONArrayE0 = E0("gcm.n.light_settings");
        if (jSONArrayE0 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayE0.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayE0.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayE0.optInt(1);
            iArr[2] = jSONArrayE0.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e2) {
            jSONArrayE0.toString();
            e2.getMessage();
            return null;
        } catch (JSONException unused) {
            jSONArrayE0.toString();
            return null;
        }
    }

    @Override // defpackage.InterfaceC7412uR0
    public AbstractC7221tR0 G(C1888Xz c1888Xz) {
        return new C1888Xz(c1888Xz, 0, (NT) this.b);
    }

    public Object[] G0(String str) {
        JSONArray jSONArrayE0 = E0(str.concat("_loc_args"));
        if (jSONArrayE0 == null) {
            return null;
        }
        int length = jSONArrayE0.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayE0.optString(i);
        }
        return strArr;
    }

    public String H0(String str) {
        return J0(str.concat("_loc_key"));
    }

    @Override // defpackage.InterfaceC0738Jf0
    public KeyStore.Entry I(KeyStore keyStore, SecureStoreOptions secureStoreOptions) throws C7143t2 {
        O90.f(keyStore, "keyStore");
        O90.f(secureStoreOptions, "options");
        throw new C7143t2("Tried to initialize HybridAESEncryptor key store entry on Android SDK >= 23. This shouldn't happen. If you see this message report an issue at https://github.com/expo/expo.", 29);
    }

    public String I0(Resources resources, String str, String str2) {
        String strJ0 = J0(str2);
        if (!TextUtils.isEmpty(strJ0)) {
            return strJ0;
        }
        String strH0 = H0(str2);
        if (TextUtils.isEmpty(strH0)) {
            return null;
        }
        int identifier = resources.getIdentifier(strH0, "string", str);
        if (identifier == 0) {
            X0(str2.concat("_loc_key"));
            return null;
        }
        Object[] objArrG0 = G0(str2);
        if (objArrG0 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrG0);
        } catch (MissingFormatArgumentException unused) {
            X0(str2);
            Arrays.toString(objArrG0);
            return null;
        }
    }

    @Override // defpackage.InterfaceC8081xy
    public void J(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    public String J0(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] K0() throws JSONException {
        JSONArray jSONArrayE0 = E0("gcm.n.vibrate_timings");
        if (jSONArrayE0 == null) {
            return null;
        }
        try {
            if (jSONArrayE0.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayE0.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayE0.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            jSONArrayE0.toString();
            return null;
        }
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ void L(InterfaceC6741qw interfaceC6741qw) {
        AbstractC7209tN0.b(this, interfaceC6741qw);
    }

    public String M0(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.b).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // defpackage.InterfaceC0605Hn
    public int N() {
        return ((Integer) q(InterfaceC0605Hn.h0, 0)).intValue();
    }

    public synchronized void N0() {
        AbstractC3393dS.m("Count = %d", Integer.valueOf(((HashMap) this.b).size()), C3513e41.class);
    }

    @Override // defpackage.InterfaceC0738Jf0
    public String O(SecureStoreOptions secureStoreOptions, boolean z) {
        O90.f(secureStoreOptions, "options");
        return AbstractC1705Vq.h(i(secureStoreOptions), StringUtils.PROCESS_POSTFIX_DELIMITER, z ? "keystoreAuthenticated" : "keystoreUnauthenticated");
    }

    @Override // defpackage.InterfaceC8081xy
    public void P(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    public Bundle P0() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ boolean Q(C0572Hc c0572Hc) {
        return AbstractC7209tN0.a(this, c0572Hc);
    }

    public void Q0() {
        synchronized (c) {
            try {
                int i = e;
                if (i < 5) {
                    e = i + 1;
                    C3513e41 c3513e41 = d;
                    if (c3513e41 != null) {
                        this.b = c3513e41;
                    }
                    d = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Vg0, nZ] */
    @Override // defpackage.InterfaceC1576Tz
    public Object R(C1498Sz c1498Sz) {
        return ((AbstractC1676Vg0) this.b).invoke(c1498Sz);
    }

    public synchronized void R0(O01 o01, EncodedImage encodedImage) {
        o01.getClass();
        encodedImage.getClass();
        if (!EncodedImage.isValid(encodedImage)) {
            throw new IllegalArgumentException();
        }
        EncodedImage encodedImage2 = (EncodedImage) ((HashMap) this.b).get(o01);
        if (encodedImage2 == null) {
            return;
        }
        AbstractC8446zt byteBufferRef = encodedImage2.getByteBufferRef();
        AbstractC8446zt byteBufferRef2 = encodedImage.getByteBufferRef();
        if (byteBufferRef != null && byteBufferRef2 != null) {
            try {
                if (byteBufferRef.w() == byteBufferRef2.w()) {
                    ((HashMap) this.b).remove(o01);
                    AbstractC8446zt.p(byteBufferRef2);
                    AbstractC8446zt.p(byteBufferRef);
                    EncodedImage.closeSafely(encodedImage2);
                    N0();
                }
            } finally {
                AbstractC8446zt.p(byteBufferRef2);
                AbstractC8446zt.p(byteBufferRef);
                EncodedImage.closeSafely(encodedImage2);
            }
        }
    }

    public void S0(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // defpackage.InterfaceC0605Hn
    public AbstractC3987gZ0 V() {
        return (AbstractC3987gZ0) q(InterfaceC0605Hn.i0, null);
    }

    @Override // defpackage.InterfaceC2151aX
    public Cursor W(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // defpackage.InterfaceC5878mP
    public boolean X(int i, String str) {
        AbstractC6260oP abstractC6260oP = (AbstractC6260oP) this.b;
        return i == abstractC6260oP.getViewTag() && str.equals(abstractC6260oP.getEventName());
    }

    @Override // defpackage.InterfaceC8081xy
    public C0092Ay a() {
        return new C0092Ay(new C0136Bm1(((ContentInfo.Builder) this.b).build()));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x014e  */
    @Override // defpackage.InterfaceC0691Ip1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a0(com.facebook.yoga.YogaNodeJNIBase r18, float r19, defpackage.EnumC0769Jp1 r20, float r21, defpackage.EnumC0769Jp1 r22) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3513e41.a0(com.facebook.yoga.YogaNodeJNIBase, float, Jp1, float, Jp1):long");
    }

    @Override // defpackage.InterfaceC7727w50
    public AttributedCharacterIterator b(double d2) {
        return ((DateFormat) this.b).formatToCharacterIterator(Double.valueOf(d2));
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        throw new C7074sg((String) this.b);
    }

    @Override // defpackage.InterfaceC2151aX
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // defpackage.InterfaceC7986xS0
    public void d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            ((C1678Vh) this.b).a(bitmap);
        } finally {
            bitmap.recycle();
        }
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ EnumC6931rw d0(C0572Hc c0572Hc) {
        return AbstractC7209tN0.c(this, c0572Hc);
    }

    @Override // defpackage.InterfaceC7727w50
    public String e(double d2) {
        return ((DateFormat) this.b).format(new Date((long) d2));
    }

    @Override // defpackage.InterfaceC1784Wq0
    public void f(MenuC0225Cq0 menuC0225Cq0, boolean z) {
        G6 g6;
        switch (this.a) {
            case 2:
                if (menuC0225Cq0 instanceof I51) {
                    ((I51) menuC0225Cq0).z.k().c(false);
                }
                InterfaceC1784Wq0 interfaceC1784Wq0 = ((C6189o2) this.b).e;
                if (interfaceC1784Wq0 != null) {
                    interfaceC1784Wq0.f(menuC0225Cq0, z);
                    break;
                }
                break;
            default:
                MenuC0225Cq0 menuC0225Cq0K = menuC0225Cq0.k();
                int i = 0;
                boolean z2 = menuC0225Cq0K != menuC0225Cq0;
                if (z2) {
                    menuC0225Cq0 = menuC0225Cq0K;
                }
                H6 h6 = (H6) this.b;
                G6[] g6Arr = h6.L;
                int length = g6Arr != null ? g6Arr.length : 0;
                while (true) {
                    if (i >= length) {
                        g6 = null;
                    } else {
                        g6 = g6Arr[i];
                        if (g6 == null || g6.h != menuC0225Cq0) {
                            i++;
                        }
                    }
                }
                if (g6 != null) {
                    if (!z2) {
                        h6.s(g6, z);
                        break;
                    } else {
                        h6.q(g6.a, g6, menuC0225Cq0K);
                        h6.s(g6, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC7727w50
    public String f0(Y40 y40) {
        return Calendar.getInstance(L10.i(y40.g())).getTimeZone().getID();
    }

    @Override // defpackage.InterfaceC7727w50
    public String g(Y40 y40) {
        return NumberingSystem.getInstance(L10.i(y40.g())).getName();
    }

    @Override // defpackage.InterfaceC7400uN0
    public InterfaceC7122sw getConfig() {
        return C0873Ky0.c;
    }

    @Override // defpackage.InterfaceC7727w50
    public String h(Y40 y40) {
        String type = DateFormat.getDateInstance(3, L10.i(y40.g())).getCalendar().getType();
        C1723Vw c1723Vw = AbstractC1440Sf1.d;
        return !c1723Vw.containsKey(type) ? type : (String) c1723Vw.get(type);
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        QZ qz = (QZ) this.b;
        AbstractC3377dM1.i(qz.b == null, "The result can only set once!");
        qz.b = c0365El;
        return "FutureChain[" + qz + "]";
    }

    @Override // defpackage.InterfaceC0738Jf0
    public String i(SecureStoreOptions secureStoreOptions) {
        O90.f(secureStoreOptions, "options");
        return AbstractC8235ym.v("RSA/None/PKCS1Padding:", secureStoreOptions.getKeychainService());
    }

    @Override // defpackage.InterfaceC7727w50
    public String i0(AttributedCharacterIterator.Attribute attribute, String str) throws NumberFormatException {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute != DateFormat.Field.YEAR) {
            return attribute == DateFormat.Field.MONTH ? "month" : attribute == DateFormat.Field.DAY_OF_MONTH ? LocalNotification.Repeat.Type.DAY : (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) ? LocalNotification.Repeat.Type.HOUR : attribute == DateFormat.Field.MINUTE ? LocalNotification.Repeat.Type.MINUTE : attribute == DateFormat.Field.SECOND ? "second" : attribute == DateFormat.Field.TIME_ZONE ? "timeZoneName" : attribute == DateFormat.Field.AM_PM ? "dayPeriod" : attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
        }
        try {
            Double.parseDouble(str);
            return "year";
        } catch (NumberFormatException unused) {
            return "yearName";
        }
    }

    @Override // defpackage.InterfaceC0605Hn
    public InterfaceC5934mh1 j() {
        return (InterfaceC5934mh1) q(InterfaceC0605Hn.f0, InterfaceC5934mh1.a);
    }

    @Override // defpackage.InterfaceC0605Hn
    public C0887Ld j0() {
        return (C0887Ld) this.b;
    }

    @Override // defpackage.InterfaceC0605Hn
    public boolean k0() {
        return ((Boolean) q(InterfaceC0605Hn.l0, Boolean.FALSE)).booleanValue();
    }

    @Override // defpackage.InterfaceC7727w50
    public EnumC6201o50 l(Y40 y40) {
        EnumC6201o50 enumC6201o50 = EnumC6201o50.d;
        try {
            String pattern = AbstractC6982sB0.k(DateFormat.getTimeInstance(0, L10.i(y40.g()))).toPattern();
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (int i = 0; i < pattern.length(); i++) {
                char cCharAt = pattern.charAt(i);
                if (cCharAt == '\'') {
                    z = !z;
                } else if (!z && ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    sb.append(pattern.charAt(i));
                }
            }
            String string = sb.toString();
            return string.contains(String.valueOf('h')) ? EnumC6201o50.b : string.contains(String.valueOf('K')) ? EnumC6201o50.a : string.contains(String.valueOf('H')) ? EnumC6201o50.c : enumC6201o50;
        } catch (ClassCastException unused) {
            return enumC6201o50;
        }
    }

    @Override // defpackage.InterfaceC5369jk0
    public void m(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, boolean z) {
        ((C7937xC) this.b).x((C6025nA0) interfaceC5751lk0, j, j2);
    }

    @Override // defpackage.InterfaceC5369jk0
    public C3829fk0 o0(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, IOException iOException, int i) {
        C6025nA0 c6025nA0 = (C6025nA0) interfaceC5751lk0;
        C7937xC c7937xC = (C7937xC) this.b;
        c7937xC.getClass();
        long j3 = c6025nA0.a;
        Uri uri = c6025nA0.d.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        long jE = c7937xC.n.e(new C1204Pf(iOException, i, 9));
        C3829fk0 c3829fk0 = jE == -9223372036854775807L ? C1857Xo1.i : new C3829fk0(0, jE, false);
        c7937xC.r.P(c4020gk0, c6025nA0.c, iOException, !c3829fk0.a());
        return c3829fk0;
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Object q(C0572Hc c0572Hc, Object obj) {
        return AbstractC7209tN0.j(this, c0572Hc, obj);
    }

    @Override // defpackage.InterfaceC1784Wq0
    public boolean q0(MenuC0225Cq0 menuC0225Cq0) {
        Window.Callback callback;
        switch (this.a) {
            case 2:
                C6189o2 c6189o2 = (C6189o2) this.b;
                if (menuC0225Cq0 == c6189o2.c) {
                    return false;
                }
                ((I51) menuC0225Cq0).A.getClass();
                c6189o2.getClass();
                InterfaceC1784Wq0 interfaceC1784Wq0 = c6189o2.e;
                if (interfaceC1784Wq0 != null) {
                    return interfaceC1784Wq0.q0(menuC0225Cq0);
                }
                return false;
            default:
                if (menuC0225Cq0 != menuC0225Cq0.k()) {
                    return true;
                }
                H6 h6 = (H6) this.b;
                if (!h6.F || (callback = h6.l.getCallback()) == null || h6.Q) {
                    return true;
                }
                callback.onMenuOpened(108, menuC0225Cq0);
                return true;
        }
    }

    @Override // defpackage.InterfaceC3677ex0
    public void r0(Object obj) {
        C0665Ih c0665Ih = (C0665Ih) obj;
        if (c0665Ih != null) {
            C0431Fh c0431Fh = (C0431Fh) this.b;
            C1210Ph c1210Ph = c0431Fh.b;
            if (c1210Ph.n) {
                c1210Ph.n = false;
                Executor executorC1054Nh = c1210Ph.d;
                if (executorC1054Nh == null) {
                    executorC1054Nh = new ExecutorC1054Nh(0);
                }
                executorC1054Nh.execute(new WZ(c0431Fh, c0665Ih, false, 4));
            }
            c0431Fh.dismiss();
            C1210Ph c1210Ph2 = c0431Fh.b;
            if (c1210Ph2.r == null) {
                c1210Ph2.r = new C0390Et0();
            }
            C1210Ph.i(c1210Ph2.r, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.InterfaceC7727w50
    public void s0(Y40 y40, String str, String str2, EnumC7346u50 enumC7346u50, EnumC5628l50 enumC5628l50, EnumC7537v50 enumC7537v50, EnumC6583q50 enumC6583q50, EnumC5437k50 enumC5437k50, EnumC6010n50 enumC6010n50, EnumC6392p50 enumC6392p50, EnumC6773r50 enumC6773r50, EnumC7155t50 enumC7155t50, EnumC6201o50 enumC6201o50, String str3, EnumC5246j50 enumC5246j50, EnumC6964s50 enumC6964s50, Object obj) throws C0254Da {
        Calendar calendar;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        StringBuilder sb = new StringBuilder();
        EnumC5246j50 enumC5246j502 = EnumC5246j50.a;
        EnumC6201o50 enumC6201o502 = EnumC6201o50.b;
        EnumC6201o50 enumC6201o503 = EnumC6201o50.a;
        EnumC6964s50 enumC6964s502 = EnumC6964s50.a;
        if (enumC5246j50 == enumC5246j502 && enumC6964s50 == enumC6964s502) {
            int iOrdinal = enumC7346u50.ordinal();
            String str13 = "";
            if (iOrdinal == 0) {
                str4 = "EEEE";
            } else if (iOrdinal == 1) {
                str4 = "EEE";
            } else if (iOrdinal == 2) {
                str4 = "EEEEE";
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException();
                }
                str4 = "";
            }
            sb.append(str4);
            int iOrdinal2 = enumC5628l50.ordinal();
            if (iOrdinal2 == 0) {
                str5 = "GGGG";
            } else if (iOrdinal2 == 1) {
                str5 = "GGG";
            } else if (iOrdinal2 == 2) {
                str5 = "G5";
            } else {
                if (iOrdinal2 != 3) {
                    throw new IllegalArgumentException();
                }
                str5 = "";
            }
            sb.append(str5);
            int iOrdinal3 = enumC7537v50.ordinal();
            if (iOrdinal3 == 0) {
                str6 = "yyyy";
            } else if (iOrdinal3 == 1) {
                str6 = "yy";
            } else {
                if (iOrdinal3 != 2) {
                    throw new IllegalArgumentException();
                }
                str6 = "";
            }
            sb.append(str6);
            int iOrdinal4 = enumC6583q50.ordinal();
            if (iOrdinal4 == 0) {
                str7 = "M";
            } else if (iOrdinal4 == 1) {
                str7 = "MM";
            } else if (iOrdinal4 == 2) {
                str7 = "MMMM";
            } else if (iOrdinal4 == 3) {
                str7 = "MMM";
            } else if (iOrdinal4 == 4) {
                str7 = "MMMMM";
            } else {
                if (iOrdinal4 != 5) {
                    throw new IllegalArgumentException();
                }
                str7 = "";
            }
            sb.append(str7);
            int iOrdinal5 = enumC5437k50.ordinal();
            if (iOrdinal5 == 0) {
                str8 = UcumUtils.UCUM_DAYS;
            } else if (iOrdinal5 == 1) {
                str8 = "dd";
            } else {
                if (iOrdinal5 != 2) {
                    throw new IllegalArgumentException();
                }
                str8 = "";
            }
            sb.append(str8);
            if (enumC6201o50 == enumC6201o503 || enumC6201o50 == enumC6201o502) {
                int iOrdinal6 = enumC6010n50.ordinal();
                if (iOrdinal6 == 0) {
                    str9 = UcumUtils.UCUM_HOURS;
                } else if (iOrdinal6 == 1) {
                    str9 = "hh";
                } else {
                    if (iOrdinal6 != 2) {
                        throw new IllegalArgumentException();
                    }
                    str9 = "";
                }
                sb.append(str9);
            } else {
                int iOrdinal7 = enumC6010n50.ordinal();
                if (iOrdinal7 == 0) {
                    str12 = "k";
                } else if (iOrdinal7 == 1) {
                    str12 = "kk";
                } else {
                    if (iOrdinal7 != 2) {
                        throw new IllegalArgumentException();
                    }
                    str12 = "";
                }
                sb.append(str12);
            }
            int iOrdinal8 = enumC6392p50.ordinal();
            if (iOrdinal8 == 0) {
                str10 = "m";
            } else if (iOrdinal8 == 1) {
                str10 = "mm";
            } else {
                if (iOrdinal8 != 2) {
                    throw new IllegalArgumentException();
                }
                str10 = "";
            }
            sb.append(str10);
            int iOrdinal9 = enumC6773r50.ordinal();
            if (iOrdinal9 == 0) {
                str11 = UcumUtils.UCUM_SECONDS;
            } else if (iOrdinal9 == 1) {
                str11 = "ss";
            } else {
                if (iOrdinal9 != 2) {
                    throw new IllegalArgumentException();
                }
                str11 = "";
            }
            sb.append(str11);
            switch (enumC7155t50.ordinal()) {
                case 0:
                    str13 = "zzzz";
                    sb.append(str13);
                    break;
                case 1:
                    str13 = "OOOO";
                    sb.append(str13);
                    break;
                case 2:
                    str13 = "vvvv";
                    sb.append(str13);
                    break;
                case 3:
                    str13 = "z";
                    sb.append(str13);
                    break;
                case 4:
                    str13 = "O";
                    sb.append(str13);
                    break;
                case 5:
                    str13 = "v";
                    sb.append(str13);
                    break;
                case 6:
                    sb.append(str13);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            sb.append(enumC5246j50 == enumC5246j502 ? AbstractC6982sB0.k(DateFormat.getTimeInstance(V0(enumC6964s50), L10.i(y40.g()))).toLocalizedPattern() : enumC6964s50 == enumC6964s502 ? AbstractC6982sB0.k(DateFormat.getDateInstance(U0(enumC5246j50), L10.i(y40.g()))).toLocalizedPattern() : AbstractC6982sB0.k(DateFormat.getDateTimeInstance(U0(enumC5246j50), V0(enumC6964s50), L10.i(y40.g()))).toLocalizedPattern());
            HashMap mapMo2a = y40.mo2a();
            if (mapMo2a.containsKey("hc")) {
                String str14 = (String) mapMo2a.get("hc");
                if (str14 == "h11" || str14 == "h12") {
                    T0(sb, new char[]{'H', 'K', 'k'}, 'h');
                } else if (str14 == "h23" || str14 == "h24") {
                    T0(sb, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
            if (enumC6201o50 == enumC6201o503 || enumC6201o50 == enumC6201o502) {
                T0(sb, new char[]{'H', 'K', 'k'}, 'h');
            } else if (enumC6201o50 == EnumC6201o50.c || enumC6201o50 == EnumC6201o50.d) {
                T0(sb, new char[]{'h', 'H', 'K'}, 'k');
            }
            if (!(obj instanceof C0099Ba0) && !(obj instanceof C0021Aa0)) {
                if (((Boolean) obj).booleanValue()) {
                    T0(sb, new char[]{'H', 'K', 'k'}, 'h');
                } else {
                    T0(sb, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
        }
        String string = sb.toString();
        if (str.isEmpty()) {
            calendar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            Y40 y40D = y40.d();
            y40D.f("ca", arrayList);
            calendar = Calendar.getInstance(L10.i(y40D.g()));
        }
        if (!str2.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(str2) == null) {
                    throw new C0254Da("Invalid numbering system: ".concat(str2), 10);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str2);
                y40.f("nu", arrayList2);
            } catch (RuntimeException unused) {
                throw new C0254Da("Invalid numbering system: ".concat(str2), 10);
            }
        }
        if (calendar != null) {
            this.b = DateFormat.getPatternInstance(calendar, string, L10.i(y40.g()));
        } else {
            this.b = DateFormat.getPatternInstance(string, L10.i(y40.g()));
        }
        ((DateFormat) this.b).setTimeZone(TimeZone.getTimeZone(str3));
    }

    @Override // defpackage.InterfaceC8081xy
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Set u() {
        return AbstractC7209tN0.g(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String u0(defpackage.C6666qX r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.d
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = ""
            if (r1 != 0) goto L3f
            java.lang.String r1 = "und"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13
            goto L3f
        L13:
            int r1 = defpackage.AbstractC0277Dh1.a
            r3 = 21
            if (r1 < r3) goto L1e
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            goto L24
        L1e:
            java.util.Locale r3 = new java.util.Locale
            r3.<init>(r0)
            r0 = r3
        L24:
            r3 = 24
            if (r1 < r3) goto L31
            java.util.Locale$Category r1 = defpackage.AbstractC1362Rf1.l()
            java.util.Locale r1 = defpackage.AbstractC1362Rf1.m(r1)
            goto L35
        L31:
            java.util.Locale r1 = java.util.Locale.getDefault()
        L35:
            java.lang.String r0 = r0.getDisplayName(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L41
        L3f:
            r0 = r2
            goto L62
        L41:
            r3 = 1
            r4 = 0
            int r3 = r0.offsetByCodePoints(r4, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L62
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L62
            r5.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L62
            java.lang.String r4 = r0.substring(r4, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L62
            java.lang.String r1 = r4.toUpperCase(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L62
            r5.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L62
            java.lang.String r1 = r0.substring(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L62
            r5.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L62
            java.lang.String r0 = r5.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L62
        L62:
            java.lang.String r1 = r6.v0(r7)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = r6.M0(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L7f
            java.lang.String r7 = r7.b
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7d
            goto L7e
        L7d:
            r2 = r7
        L7e:
            r0 = r2
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3513e41.u0(qX):java.lang.String");
    }

    @Override // defpackage.InterfaceC5369jk0
    public void v(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2) {
        C6025nA0 c6025nA0 = (C6025nA0) interfaceC5751lk0;
        C7937xC c7937xC = (C7937xC) this.b;
        c7937xC.getClass();
        long j3 = c6025nA0.a;
        Uri uri = c6025nA0.d.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        c7937xC.n.getClass();
        c7937xC.r.L(c4020gk0, c6025nA0.c);
        C6412pC c6412pC = (C6412pC) c6025nA0.f;
        C6412pC c6412pC2 = c7937xC.I;
        int size = c6412pC2 == null ? 0 : c6412pC2.m.size();
        long j4 = c6412pC.b(0).b;
        int i = 0;
        while (i < size && c7937xC.I.b(i).b < j4) {
            i++;
        }
        if (c6412pC.d) {
            if (size - i > c6412pC.m.size()) {
                AbstractC6789rA1.h("Loaded out of sync manifest");
            } else {
                long j5 = c7937xC.O;
                if (j5 == -9223372036854775807L || c6412pC.h * 1000 > j5) {
                    c7937xC.N = 0;
                } else {
                    AbstractC6789rA1.h("Loaded stale dynamic manifest: " + c6412pC.h + ", " + c7937xC.O);
                }
            }
            int i2 = c7937xC.N;
            c7937xC.N = i2 + 1;
            if (i2 < c7937xC.n.d(c6025nA0.c)) {
                c7937xC.E.postDelayed(c7937xC.w, Math.min((c7937xC.N - 1) * 1000, 5000));
                return;
            } else {
                c7937xC.D = new C6353ou();
                return;
            }
        }
        c7937xC.I = c6412pC;
        c7937xC.J = c6412pC.d & c7937xC.J;
        c7937xC.K = j - j2;
        c7937xC.L = j;
        c7937xC.P += i;
        synchronized (c7937xC.u) {
            try {
                if (c6025nA0.b.a == c7937xC.G) {
                    Uri uri2 = c7937xC.I.k;
                    if (uri2 == null) {
                        uri2 = c6025nA0.d.c;
                    }
                    c7937xC.G = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6412pC c6412pC3 = c7937xC.I;
        if (!c6412pC3.d || c7937xC.M != -9223372036854775807L) {
            c7937xC.z(true);
            return;
        }
        N8 n8 = c6412pC3.i;
        if (n8 == null) {
            c7937xC.w();
            return;
        }
        String str = (String) n8.b;
        if (AbstractC0277Dh1.a(str, "urn:mpeg:dash:utc:direct:2014") || AbstractC0277Dh1.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                c7937xC.M = AbstractC0277Dh1.T((String) n8.c) - c7937xC.L;
                c7937xC.z(true);
                return;
            } catch (C5643lA0 e2) {
                c7937xC.y(e2);
                return;
            }
        }
        if (AbstractC0277Dh1.a(str, "urn:mpeg:dash:utc:http-iso:2014") || AbstractC0277Dh1.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            C6025nA0 c6025nA02 = new C6025nA0(c7937xC.A, Uri.parse((String) n8.c), 5, new C7747wC());
            c7937xC.r.S(new C4020gk0(c6025nA02.a, c6025nA02.b, c7937xC.B.S(c6025nA02, new C3866fw1(10, c7937xC), 1)), c6025nA02.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (AbstractC0277Dh1.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || AbstractC0277Dh1.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            C6025nA0 c6025nA03 = new C6025nA0(c7937xC.A, Uri.parse((String) n8.c), 5, new NV1(11));
            c7937xC.r.S(new C4020gk0(c6025nA03.a, c6025nA03.b, c7937xC.B.S(c6025nA03, new C3866fw1(10, c7937xC), 1)), c6025nA03.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (AbstractC0277Dh1.a(str, "urn:mpeg:dash:utc:ntp:2014") || AbstractC0277Dh1.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            c7937xC.w();
        } else {
            c7937xC.y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    public String v0(C6666qX c6666qX) {
        int i = c6666qX.f;
        int i2 = i & 2;
        Resources resources = (Resources) this.b;
        String string = i2 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i & 4) != 0) {
            string = M0(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string = M0(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? M0(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    @Override // defpackage.InterfaceC7122sw
    public /* synthetic */ Object w(C0572Hc c0572Hc) {
        return AbstractC7209tN0.i(this, c0572Hc);
    }

    public void w0() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(((HashMap) this.b).values());
            ((HashMap) this.b).clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            EncodedImage encodedImage = (EncodedImage) arrayList.get(i);
            if (encodedImage != null) {
                encodedImage.close();
            }
        }
    }

    public boolean x0(Class cls) {
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((CG0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public Object y0(String str, JSONObject jSONObject, KeyStore.PrivateKeyEntry privateKeyEntry, SecureStoreOptions secureStoreOptions, X11 x11, C7239tX0 c7239tX0) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArrDecode = Base64.decode(jSONObject.getString("esk"), 0);
        Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
        O90.e(cipher, "getInstance(...)");
        cipher.init(2, privateKeyEntry.getPrivateKey());
        return ((C0318Dv0) this.b).r(str, jSONObject, new KeyStore.SecretKeyEntry(new SecretKeySpec(cipher.doFinal(bArrDecode), "AES")), secureStoreOptions, x11, c7239tX0);
    }

    public CG0 z0(Class cls) {
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            CG0 cg0 = (CG0) it.next();
            if (cg0.getClass() == cls) {
                return cg0;
            }
        }
        return null;
    }

    public /* synthetic */ C3513e41(int i, boolean z) {
        this.a = i;
    }

    public C3513e41(C1375Rk c1375Rk) {
        this.a = 6;
        O90.f(c1375Rk, "props");
        this.b = c1375Rk;
    }

    public C3513e41(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = (SmallDisplaySizeQuirk) AbstractC7768wJ.a.z0(SmallDisplaySizeQuirk.class);
                break;
            case 23:
                this.b = new C6539ps0(500L);
                break;
            default:
                this.b = new C0887Ld(new Object());
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3513e41(InterfaceC6099nZ interfaceC6099nZ) {
        this.a = 29;
        this.b = (AbstractC1676Vg0) interfaceC6099nZ;
    }

    public C3513e41(List list) {
        this.a = 26;
        this.b = new ArrayList(list);
    }

    public C3513e41(Resources resources) {
        this.a = 12;
        resources.getClass();
        this.b = resources;
    }

    public C3513e41(Context context, C0318Dv0 c0318Dv0) {
        this.a = 19;
        O90.f(c0318Dv0, "mAESEncryptor");
        this.b = c0318Dv0;
        new SecureRandom();
    }

    public C3513e41(Bundle bundle) {
        this.a = 24;
        if (bundle != null) {
            this.b = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public C3513e41(TextView textView) {
        this.a = 14;
        this.b = new AN(textView);
    }

    public C3513e41(Context context, Uri uri) {
        this.a = 17;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public C3513e41(ClipData clipData, int i) {
        this.a = 9;
        this.b = T9.l(clipData, i);
    }
}
