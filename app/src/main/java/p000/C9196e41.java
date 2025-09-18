package p000;

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
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: e41 */
/* loaded from: classes.dex */
public final class C9196e41 implements InterfaceC8490Wq0, InterfaceC9305ex0, InterfaceC11673xS0, InterfaceC0491Hn, InterfaceC8398Uw0, InterfaceC7171xy, InterfaceC9919jk0, InterfaceC8253Sb1, InterfaceC6424mP, InterfaceC11289uR0, InterfaceC1670aX, InterfaceC0363Fl, InterfaceC7792Jf0, InterfaceC11500w50, InterfaceC7761Ip1, InterfaceC1257Tz {

    /* renamed from: c */
    public static final Object f26528c = new Object();

    /* renamed from: d */
    public static C9196e41 f26529d;

    /* renamed from: e */
    public static int f26530e;

    /* renamed from: a */
    public final /* synthetic */ int f26531a;

    /* renamed from: b */
    public Object f26532b;

    public /* synthetic */ C9196e41(int i, Object obj) {
        this.f26531a = i;
        this.f26532b = obj;
    }

    /* renamed from: L0 */
    public static boolean m17829L0(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /* renamed from: O0 */
    public static C9196e41 m17830O0() {
        synchronized (f26528c) {
            try {
                C9196e41 c9196e41 = f26529d;
                if (c9196e41 == null) {
                    return new C9196e41(1, false);
                }
                f26529d = (C9196e41) c9196e41.f26532b;
                c9196e41.f26532b = null;
                f26530e--;
                return c9196e41;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: T0 */
    public static void m17831T0(StringBuilder sb, char[] cArr, char c) {
        for (int i = 0; i < sb.length(); i++) {
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (sb.charAt(i) == cArr[i2]) {
                        sb.setCharAt(i, c);
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    /* renamed from: U0 */
    public static int m17832U0(EnumC9837j50 enumC9837j50) throws C0226Da {
        int iOrdinal = enumC9837j50.ordinal();
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
                throw new C0226Da("Invalid DateStyle: ".concat(enumC9837j50.toString()), 10);
            }
        }
        return i;
    }

    /* renamed from: V0 */
    public static int m17833V0(EnumC10989s50 enumC10989s50) throws C0226Da {
        int iOrdinal = enumC10989s50.ordinal();
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
                throw new C0226Da("Invalid DateStyle: ".concat(enumC10989s50.toString()), 10);
            }
        }
        return i;
    }

    /* renamed from: W0 */
    public static void m17834W0(C9196e41 c9196e41) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) c9196e41.f26532b).iterator();
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

    /* renamed from: X0 */
    public static void m17835X0(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    /* renamed from: t0 */
    public static void m17836t0(C9432fw1 c9432fw1, String str, List list) {
        String str2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str3 = (String) pair.f36702a;
            Object obj = pair.f36703b;
            if (obj instanceof String) {
                str2 = str3 + "=\"" + obj + "\"";
            } else {
                if (!(obj instanceof Number)) {
                    throw new IllegalArgumentException(AbstractC11153tN0.m24910v(obj.getClass(), "Unsupported value type: "));
                }
                str2 = str3 + ContainerUtils.KEY_VALUE_DELIMITER + obj;
            }
            AbstractC9246eT1.m17996a(str, str2);
            C1752av c1752av = (C1752av) c9432fw1.f27505b;
            Collection arrayList = (Collection) c1752av.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1752av.put(str, arrayList);
            }
            arrayList.add(str2);
        }
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: A */
    public /* synthetic */ Set mo4787A(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24892d(this, c0480Hc);
    }

    /* renamed from: A0 */
    public synchronized EncodedImage m17837A0(O01 o01) {
        EncodedImage encodedImageCloneOrNull = (EncodedImage) ((HashMap) this.f26532b).get(o01);
        if (encodedImageCloneOrNull != null) {
            synchronized (encodedImageCloneOrNull) {
                if (!EncodedImage.isValid(encodedImageCloneOrNull)) {
                    ((HashMap) this.f26532b).remove(o01);
                    AbstractC3929dS.m17682o(C9196e41.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(encodedImageCloneOrNull)), o01.f8165a, Integer.valueOf(System.identityHashCode(o01)));
                    return null;
                }
                encodedImageCloneOrNull = EncodedImage.cloneOrNull(encodedImageCloneOrNull);
            }
        }
        return encodedImageCloneOrNull;
    }

    @Override // p000.InterfaceC0491Hn
    /* renamed from: B */
    public boolean mo3590B() {
        return ((Boolean) mo4792q(InterfaceC0491Hn.f4503k0, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: B0 */
    public ArrayList m17838B0(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f26532b).iterator();
        while (it.hasNext()) {
            CG0 cg0 = (CG0) it.next();
            if (cls.isAssignableFrom(cg0.getClass())) {
                arrayList.add(cg0);
            }
        }
        return arrayList;
    }

    /* renamed from: C0 */
    public boolean m17839C0(String str) {
        String strM17848J0 = m17848J0(str);
        return "1".equals(strM17848J0) || Boolean.parseBoolean(strM17848J0);
    }

    /* renamed from: D0 */
    public Integer m17840D0(String str) {
        String strM17848J0 = m17848J0(str);
        if (TextUtils.isEmpty(strM17848J0)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM17848J0));
        } catch (NumberFormatException unused) {
            m17835X0(str);
            return null;
        }
    }

    /* renamed from: E0 */
    public JSONArray m17841E0(String str) {
        String strM17848J0 = m17848J0(str);
        if (TextUtils.isEmpty(strM17848J0)) {
            return null;
        }
        try {
            return new JSONArray(strM17848J0);
        } catch (JSONException unused) {
            m17835X0(str);
            return null;
        }
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: F */
    public /* synthetic */ Object mo4788F(C0480Hc c0480Hc, EnumC6791rw enumC6791rw) {
        return AbstractC11153tN0.m24899k(this, c0480Hc, enumC6791rw);
    }

    /* renamed from: F0 */
    public int[] m17842F0() throws JSONException {
        JSONArray jSONArrayM17841E0 = m17841E0("gcm.n.light_settings");
        if (jSONArrayM17841E0 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM17841E0.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayM17841E0.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayM17841E0.optInt(1);
            iArr[2] = jSONArrayM17841E0.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            jSONArrayM17841E0.toString();
            e.getMessage();
            return null;
        } catch (JSONException unused) {
            jSONArrayM17841E0.toString();
            return null;
        }
    }

    @Override // p000.InterfaceC11289uR0
    /* renamed from: G */
    public AbstractC11161tR0 mo17843G(C1509Xz c1509Xz) {
        return new C1509Xz(c1509Xz, 0, (C0848NT) this.f26532b);
    }

    /* renamed from: G0 */
    public Object[] m17844G0(String str) {
        JSONArray jSONArrayM17841E0 = m17841E0(str.concat("_loc_args"));
        if (jSONArrayM17841E0 == null) {
            return null;
        }
        int length = jSONArrayM17841E0.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayM17841E0.optString(i);
        }
        return strArr;
    }

    /* renamed from: H0 */
    public String m17845H0(String str) {
        return m17848J0(str.concat("_loc_key"));
    }

    @Override // p000.InterfaceC7792Jf0
    /* renamed from: I */
    public KeyStore.Entry mo1934I(KeyStore keyStore, SecureStoreOptions secureStoreOptions) throws C6861t2 {
        O90.m5968f(keyStore, "keyStore");
        O90.m5968f(secureStoreOptions, "options");
        throw new C6861t2("Tried to initialize HybridAESEncryptor key store entry on Android SDK >= 23. This shouldn't happen. If you see this message report an issue at https://github.com/expo/expo.", 29);
    }

    /* renamed from: I0 */
    public String m17846I0(Resources resources, String str, String str2) {
        String strM17848J0 = m17848J0(str2);
        if (!TextUtils.isEmpty(strM17848J0)) {
            return strM17848J0;
        }
        String strM17845H0 = m17845H0(str2);
        if (TextUtils.isEmpty(strM17845H0)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM17845H0, "string", str);
        if (identifier == 0) {
            m17835X0(str2.concat("_loc_key"));
            return null;
        }
        Object[] objArrM17844G0 = m17844G0(str2);
        if (objArrM17844G0 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrM17844G0);
        } catch (MissingFormatArgumentException unused) {
            m17835X0(str2);
            Arrays.toString(objArrM17844G0);
            return null;
        }
    }

    @Override // p000.InterfaceC7171xy
    /* renamed from: J */
    public void mo17847J(Uri uri) {
        ((ContentInfo.Builder) this.f26532b).setLinkUri(uri);
    }

    /* renamed from: J0 */
    public String m17848J0(String str) {
        Bundle bundle = (Bundle) this.f26532b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    /* renamed from: K0 */
    public long[] m17849K0() throws JSONException {
        JSONArray jSONArrayM17841E0 = m17841E0("gcm.n.vibrate_timings");
        if (jSONArrayM17841E0 == null) {
            return null;
        }
        try {
            if (jSONArrayM17841E0.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM17841E0.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayM17841E0.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            jSONArrayM17841E0.toString();
            return null;
        }
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: L */
    public /* synthetic */ void mo4789L(InterfaceC6711qw interfaceC6711qw) {
        AbstractC11153tN0.m24890b(this, interfaceC6711qw);
    }

    /* renamed from: M0 */
    public String m17850M0(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.f26532b).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // p000.InterfaceC0491Hn
    /* renamed from: N */
    public int mo3591N() {
        return ((Integer) mo4792q(InterfaceC0491Hn.f4500h0, 0)).intValue();
    }

    /* renamed from: N0 */
    public synchronized void m17851N0() {
        AbstractC3929dS.m17680m("Count = %d", Integer.valueOf(((HashMap) this.f26532b).size()), C9196e41.class);
    }

    @Override // p000.InterfaceC7792Jf0
    /* renamed from: O */
    public String mo1935O(SecureStoreOptions secureStoreOptions, boolean z) {
        O90.m5968f(secureStoreOptions, "options");
        return AbstractC1374Vq.m8589h(mo1941i(secureStoreOptions), StringUtils.PROCESS_POSTFIX_DELIMITER, z ? "keystoreAuthenticated" : "keystoreUnauthenticated");
    }

    @Override // p000.InterfaceC7171xy
    /* renamed from: P */
    public void mo17852P(int i) {
        ((ContentInfo.Builder) this.f26532b).setFlags(i);
    }

    /* renamed from: P0 */
    public Bundle m17853P0() {
        Bundle bundle = (Bundle) this.f26532b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: Q */
    public /* synthetic */ boolean mo4790Q(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24889a(this, c0480Hc);
    }

    /* renamed from: Q0 */
    public void m17854Q0() {
        synchronized (f26528c) {
            try {
                int i = f26530e;
                if (i < 5) {
                    f26530e = i + 1;
                    C9196e41 c9196e41 = f26529d;
                    if (c9196e41 != null) {
                        this.f26532b = c9196e41;
                    }
                    f26529d = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Vg0, nZ] */
    @Override // p000.InterfaceC1257Tz
    /* renamed from: R */
    public Object mo7832R(C1194Sz c1194Sz) {
        return ((AbstractC8418Vg0) this.f26532b).invoke(c1194Sz);
    }

    /* renamed from: R0 */
    public synchronized void m17855R0(O01 o01, EncodedImage encodedImage) {
        o01.getClass();
        encodedImage.getClass();
        if (!EncodedImage.isValid(encodedImage)) {
            throw new IllegalArgumentException();
        }
        EncodedImage encodedImage2 = (EncodedImage) ((HashMap) this.f26532b).get(o01);
        if (encodedImage2 == null) {
            return;
        }
        AbstractC7292zt byteBufferRef = encodedImage2.getByteBufferRef();
        AbstractC7292zt byteBufferRef2 = encodedImage.getByteBufferRef();
        if (byteBufferRef != null && byteBufferRef2 != null) {
            try {
                if (byteBufferRef.m26572w() == byteBufferRef2.m26572w()) {
                    ((HashMap) this.f26532b).remove(o01);
                    AbstractC7292zt.m26569p(byteBufferRef2);
                    AbstractC7292zt.m26569p(byteBufferRef);
                    EncodedImage.closeSafely(encodedImage2);
                    m17851N0();
                }
            } finally {
                AbstractC7292zt.m26569p(byteBufferRef2);
                AbstractC7292zt.m26569p(byteBufferRef);
                EncodedImage.closeSafely(encodedImage2);
            }
        }
    }

    /* renamed from: S0 */
    public void m17856S0(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f26532b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.m10279r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // p000.InterfaceC0491Hn
    /* renamed from: V */
    public AbstractC9513gZ0 mo3592V() {
        return (AbstractC9513gZ0) mo4792q(InterfaceC0491Hn.f4501i0, null);
    }

    @Override // p000.InterfaceC1670aX
    /* renamed from: W */
    public Cursor mo6693W(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f26532b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // p000.InterfaceC6424mP
    /* renamed from: X */
    public boolean mo17857X(int i, String str) {
        AbstractC6550oP abstractC6550oP = (AbstractC6550oP) this.f26532b;
        return i == abstractC6550oP.getViewTag() && str.equals(abstractC6550oP.getEventName());
    }

    @Override // p000.InterfaceC7171xy
    /* renamed from: a */
    public C0061Ay mo17858a() {
        return new C0061Ay(new C7391Bm1(((ContentInfo.Builder) this.f26532b).build()));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x014e  */
    @Override // p000.InterfaceC7761Ip1
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo4023a0(com.facebook.yoga.YogaNodeJNIBase r18, float r19, p000.EnumC7813Jp1 r20, float r21, p000.EnumC7813Jp1 r22) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9196e41.mo4023a0(com.facebook.yoga.YogaNodeJNIBase, float, Jp1, float, Jp1):long");
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: b */
    public AttributedCharacterIterator mo6694b(double d) {
        return ((DateFormat) this.f26532b).formatToCharacterIterator(Double.valueOf(d));
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        throw new C6838sg((String) this.f26532b);
    }

    @Override // p000.InterfaceC1670aX
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f26532b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // p000.InterfaceC11673xS0
    /* renamed from: d */
    public void mo2828d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            ((C1365Vh) this.f26532b).m8531a(bitmap);
        } finally {
            bitmap.recycle();
        }
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: d0 */
    public /* synthetic */ EnumC6791rw mo4791d0(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24891c(this, c0480Hc);
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: e */
    public String mo6695e(double d) {
        return ((DateFormat) this.f26532b).format(new Date((long) d));
    }

    @Override // p000.InterfaceC8490Wq0
    /* renamed from: f */
    public void mo1906f(MenuC7450Cq0 menuC7450Cq0, boolean z) {
        C0385G6 c0385g6;
        switch (this.f26531a) {
            case 2:
                if (menuC7450Cq0 instanceof I51) {
                    ((I51) menuC7450Cq0).f4696z.mo1412k().m1404c(false);
                }
                InterfaceC8490Wq0 interfaceC8490Wq0 = ((C6527o2) this.f26532b).f38694e;
                if (interfaceC8490Wq0 != null) {
                    interfaceC8490Wq0.mo1906f(menuC7450Cq0, z);
                    break;
                }
                break;
            default:
                MenuC7450Cq0 menuC7450Cq0Mo1412k = menuC7450Cq0.mo1412k();
                int i = 0;
                boolean z2 = menuC7450Cq0Mo1412k != menuC7450Cq0;
                if (z2) {
                    menuC7450Cq0 = menuC7450Cq0Mo1412k;
                }
                LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) this.f26532b;
                C0385G6[] c0385g6Arr = layoutInflaterFactory2C0448H6.f4070L;
                int length = c0385g6Arr != null ? c0385g6Arr.length : 0;
                while (true) {
                    if (i >= length) {
                        c0385g6 = null;
                    } else {
                        c0385g6 = c0385g6Arr[i];
                        if (c0385g6 == null || c0385g6.f3576h != menuC7450Cq0) {
                            i++;
                        }
                    }
                }
                if (c0385g6 != null) {
                    if (!z2) {
                        layoutInflaterFactory2C0448H6.m3291s(c0385g6, z);
                        break;
                    } else {
                        layoutInflaterFactory2C0448H6.m3289q(c0385g6.f3569a, c0385g6, menuC7450Cq0Mo1412k);
                        layoutInflaterFactory2C0448H6.m3291s(c0385g6, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: f0 */
    public String mo6696f0(Y40 y40) {
        return Calendar.getInstance(L10.m4845i(y40.mo5826g())).getTimeZone().getID();
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: g */
    public String mo6697g(Y40 y40) {
        return NumberingSystem.getInstance(L10.m4845i(y40.mo5826g())).getName();
    }

    @Override // p000.InterfaceC11281uN0
    public InterfaceC6854sw getConfig() {
        return C7882Ky0.f6403c;
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: h */
    public String mo6698h(Y40 y40) {
        String type = DateFormat.getDateInstance(3, L10.m4845i(y40.mo5826g())).getCalendar().getType();
        C1380Vw c1380Vw = AbstractC8261Sf1.f10895d;
        return !c1380Vw.containsKey(type) ? type : (String) c1380Vw.get(type);
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        C1043QZ c1043qz = (C1043QZ) this.f26532b;
        AbstractC9104dM1.m17550i(c1043qz.f9669b == null, "The result can only set once!");
        c1043qz.f9669b = c0300El;
        return "FutureChain[" + c1043qz + "]";
    }

    @Override // p000.InterfaceC7792Jf0
    /* renamed from: i */
    public String mo1941i(SecureStoreOptions secureStoreOptions) {
        O90.m5968f(secureStoreOptions, "options");
        return AbstractC7222ym.m26245v("RSA/None/PKCS1Padding:", secureStoreOptions.getKeychainService());
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: i0 */
    public String mo6700i0(AttributedCharacterIterator.Attribute attribute, String str) throws NumberFormatException {
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

    @Override // p000.InterfaceC0491Hn
    /* renamed from: j */
    public InterfaceC10298mh1 mo3593j() {
        return (InterfaceC10298mh1) mo4792q(InterfaceC0491Hn.f4498f0, InterfaceC10298mh1.f37843a);
    }

    @Override // p000.InterfaceC0491Hn
    /* renamed from: j0 */
    public C0732Ld mo3594j0() {
        return (C0732Ld) this.f26532b;
    }

    @Override // p000.InterfaceC0491Hn
    /* renamed from: k0 */
    public boolean mo3595k0() {
        return ((Boolean) mo4792q(InterfaceC0491Hn.f4504l0, Boolean.FALSE)).booleanValue();
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: l */
    public EnumC10477o50 mo6701l(Y40 y40) {
        EnumC10477o50 enumC10477o50 = EnumC10477o50.f38793d;
        try {
            String pattern = AbstractC11001sB0.m24665k(DateFormat.getTimeInstance(0, L10.m4845i(y40.mo5826g()))).toPattern();
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
            return string.contains(String.valueOf('h')) ? EnumC10477o50.f38791b : string.contains(String.valueOf('K')) ? EnumC10477o50.f38790a : string.contains(String.valueOf('H')) ? EnumC10477o50.f38792c : enumC10477o50;
        } catch (ClassCastException unused) {
            return enumC10477o50;
        }
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: m */
    public void mo2001m(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, boolean z) {
        ((C7123xC) this.f26532b).m25811x((C10359nA0) interfaceC10175lk0, j, j2);
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: o0 */
    public C9407fk0 mo2002o0(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, IOException iOException, int i) {
        C10359nA0 c10359nA0 = (C10359nA0) interfaceC10175lk0;
        C7123xC c7123xC = (C7123xC) this.f26532b;
        c7123xC.getClass();
        long j3 = c10359nA0.f38158a;
        Uri uri = c10359nA0.f38161d.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        long jMo17892e = c7123xC.f45461n.mo17892e(new C0986Pf(iOException, i, 9));
        C9407fk0 c9407fk0 = jMo17892e == -9223372036854775807L ? C8539Xo1.f13979i : new C9407fk0(0, jMo17892e, false);
        c7123xC.f45465r.m8478P(c9535gk0, c10359nA0.f38160c, iOException, !c9407fk0.m18291a());
        return c9407fk0;
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: q */
    public /* synthetic */ Object mo4792q(C0480Hc c0480Hc, Object obj) {
        return AbstractC11153tN0.m24898j(this, c0480Hc, obj);
    }

    @Override // p000.InterfaceC8490Wq0
    /* renamed from: q0 */
    public boolean mo1907q0(MenuC7450Cq0 menuC7450Cq0) {
        Window.Callback callback;
        switch (this.f26531a) {
            case 2:
                C6527o2 c6527o2 = (C6527o2) this.f26532b;
                if (menuC7450Cq0 == c6527o2.f38692c) {
                    return false;
                }
                ((I51) menuC7450Cq0).f4695A.getClass();
                c6527o2.getClass();
                InterfaceC8490Wq0 interfaceC8490Wq0 = c6527o2.f38694e;
                if (interfaceC8490Wq0 != null) {
                    return interfaceC8490Wq0.mo1907q0(menuC7450Cq0);
                }
                return false;
            default:
                if (menuC7450Cq0 != menuC7450Cq0.mo1412k()) {
                    return true;
                }
                LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) this.f26532b;
                if (!layoutInflaterFactory2C0448H6.f4064F || (callback = layoutInflaterFactory2C0448H6.f4092l.getCallback()) == null || layoutInflaterFactory2C0448H6.f4075Q) {
                    return true;
                }
                callback.onMenuOpened(108, menuC7450Cq0);
                return true;
        }
    }

    @Override // p000.InterfaceC9305ex0
    /* renamed from: r0 */
    public void mo505r0(Object obj) {
        C0548Ih c0548Ih = (C0548Ih) obj;
        if (c0548Ih != null) {
            C0359Fh c0359Fh = (C0359Fh) this.f26532b;
            C0988Ph c0988Ph = c0359Fh.f3389b;
            if (c0988Ph.f9237n) {
                c0988Ph.f9237n = false;
                Executor executorC0862Nh = c0988Ph.f9227d;
                if (executorC0862Nh == null) {
                    executorC0862Nh = new ExecutorC0862Nh(0);
                }
                executorC0862Nh.execute(new RunnableC1420WZ(c0359Fh, c0548Ih, false, 4));
            }
            c0359Fh.dismiss();
            C0988Ph c0988Ph2 = c0359Fh.f3389b;
            if (c0988Ph2.f9241r == null) {
                c0988Ph2.f9241r = new C7560Et0();
            }
            C0988Ph.m6411i(c0988Ph2.f9241r, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.InterfaceC11500w50
    /* renamed from: s0 */
    public void mo6702s0(Y40 y40, String str, String str2, EnumC11245u50 enumC11245u50, EnumC10093l50 enumC10093l50, EnumC11373v50 enumC11373v50, EnumC10733q50 enumC10733q50, EnumC9965k50 enumC9965k50, EnumC10349n50 enumC10349n50, EnumC10605p50 enumC10605p50, EnumC10861r50 enumC10861r50, EnumC11117t50 enumC11117t50, EnumC10477o50 enumC10477o50, String str3, EnumC9837j50 enumC9837j50, EnumC10989s50 enumC10989s50, Object obj) throws C0226Da {
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
        EnumC9837j50 enumC9837j502 = EnumC9837j50.f34909a;
        EnumC10477o50 enumC10477o502 = EnumC10477o50.f38791b;
        EnumC10477o50 enumC10477o503 = EnumC10477o50.f38790a;
        EnumC10989s50 enumC10989s502 = EnumC10989s50.f42252a;
        if (enumC9837j50 == enumC9837j502 && enumC10989s50 == enumC10989s502) {
            int iOrdinal = enumC11245u50.ordinal();
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
            int iOrdinal2 = enumC10093l50.ordinal();
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
            int iOrdinal3 = enumC11373v50.ordinal();
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
            int iOrdinal4 = enumC10733q50.ordinal();
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
            int iOrdinal5 = enumC9965k50.ordinal();
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
            if (enumC10477o50 == enumC10477o503 || enumC10477o50 == enumC10477o502) {
                int iOrdinal6 = enumC10349n50.ordinal();
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
                int iOrdinal7 = enumC10349n50.ordinal();
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
            int iOrdinal8 = enumC10605p50.ordinal();
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
            int iOrdinal9 = enumC10861r50.ordinal();
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
            switch (enumC11117t50.ordinal()) {
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
            sb.append(enumC9837j50 == enumC9837j502 ? AbstractC11001sB0.m24665k(DateFormat.getTimeInstance(m17833V0(enumC10989s50), L10.m4845i(y40.mo5826g()))).toLocalizedPattern() : enumC10989s50 == enumC10989s502 ? AbstractC11001sB0.m24665k(DateFormat.getDateInstance(m17832U0(enumC9837j50), L10.m4845i(y40.mo5826g()))).toLocalizedPattern() : AbstractC11001sB0.m24665k(DateFormat.getDateTimeInstance(m17832U0(enumC9837j50), m17833V0(enumC10989s50), L10.m4845i(y40.mo5826g()))).toLocalizedPattern());
            HashMap mapMo5820a = y40.mo5820a();
            if (mapMo5820a.containsKey("hc")) {
                String str14 = (String) mapMo5820a.get("hc");
                if (str14 == "h11" || str14 == "h12") {
                    m17831T0(sb, new char[]{'H', 'K', 'k'}, 'h');
                } else if (str14 == "h23" || str14 == "h24") {
                    m17831T0(sb, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
            if (enumC10477o50 == enumC10477o503 || enumC10477o50 == enumC10477o502) {
                m17831T0(sb, new char[]{'H', 'K', 'k'}, 'h');
            } else if (enumC10477o50 == EnumC10477o50.f38792c || enumC10477o50 == EnumC10477o50.f38793d) {
                m17831T0(sb, new char[]{'h', 'H', 'K'}, 'k');
            }
            if (!(obj instanceof C7366Ba0) && !(obj instanceof C7314Aa0)) {
                if (((Boolean) obj).booleanValue()) {
                    m17831T0(sb, new char[]{'H', 'K', 'k'}, 'h');
                } else {
                    m17831T0(sb, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
        }
        String string = sb.toString();
        if (str.isEmpty()) {
            calendar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            Y40 y40Mo5823d = y40.mo5823d();
            y40Mo5823d.mo5825f("ca", arrayList);
            calendar = Calendar.getInstance(L10.m4845i(y40Mo5823d.mo5826g()));
        }
        if (!str2.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(str2) == null) {
                    throw new C0226Da("Invalid numbering system: ".concat(str2), 10);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str2);
                y40.mo5825f("nu", arrayList2);
            } catch (RuntimeException unused) {
                throw new C0226Da("Invalid numbering system: ".concat(str2), 10);
            }
        }
        if (calendar != null) {
            this.f26532b = DateFormat.getPatternInstance(calendar, string, L10.m4845i(y40.mo5826g()));
        } else {
            this.f26532b = DateFormat.getPatternInstance(string, L10.m4845i(y40.mo5826g()));
        }
        ((DateFormat) this.f26532b).setTimeZone(TimeZone.getTimeZone(str3));
    }

    @Override // p000.InterfaceC7171xy
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f26532b).setExtras(bundle);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: u */
    public /* synthetic */ Set mo4793u() {
        return AbstractC11153tN0.m24895g(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x003f  */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m17859u0(p000.C6686qX r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f40965d
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = ""
            if (r1 != 0) goto L3f
            java.lang.String r1 = "und"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13
            goto L3f
        L13:
            int r1 = p000.AbstractC7485Dh1.f2166a
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
            java.util.Locale$Category r1 = p000.AbstractC8209Rf1.m7071l()
            java.util.Locale r1 = p000.AbstractC8209Rf1.m7072m(r1)
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
            java.lang.String r1 = r6.m17860v0(r7)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = r6.m17850M0(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L7f
            java.lang.String r7 = r7.f40963b
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C9196e41.m17859u0(qX):java.lang.String");
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: v */
    public void mo2004v(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2) {
        C10359nA0 c10359nA0 = (C10359nA0) interfaceC10175lk0;
        C7123xC c7123xC = (C7123xC) this.f26532b;
        c7123xC.getClass();
        long j3 = c10359nA0.f38158a;
        Uri uri = c10359nA0.f38161d.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        c7123xC.f45461n.getClass();
        c7123xC.f45465r.m8474L(c9535gk0, c10359nA0.f38160c);
        C6602pC c6602pC = (C6602pC) c10359nA0.f38163f;
        C6602pC c6602pC2 = c7123xC.f45446I;
        int size = c6602pC2 == null ? 0 : c6602pC2.f39909m.size();
        long j4 = c6602pC.m23640b(0).f7014b;
        int i = 0;
        while (i < size && c7123xC.f45446I.m23640b(i).f7014b < j4) {
            i++;
        }
        if (c6602pC.f39900d) {
            if (size - i > c6602pC.f39909m.size()) {
                AbstractC10872rA1.m24175h("Loaded out of sync manifest");
            } else {
                long j5 = c7123xC.f45452O;
                if (j5 == -9223372036854775807L || c6602pC.f39904h * 1000 > j5) {
                    c7123xC.f45451N = 0;
                } else {
                    AbstractC10872rA1.m24175h("Loaded stale dynamic manifest: " + c6602pC.f39904h + ", " + c7123xC.f45452O);
                }
            }
            int i2 = c7123xC.f45451N;
            c7123xC.f45451N = i2 + 1;
            if (i2 < c7123xC.f45461n.mo17891d(c10359nA0.f38160c)) {
                c7123xC.f45442E.postDelayed(c7123xC.f45470w, Math.min((c7123xC.f45451N - 1) * 1000, 5000));
                return;
            } else {
                c7123xC.f45441D = new C6583ou();
                return;
            }
        }
        c7123xC.f45446I = c6602pC;
        c7123xC.f45447J = c6602pC.f39900d & c7123xC.f45447J;
        c7123xC.f45448K = j - j2;
        c7123xC.f45449L = j;
        c7123xC.f45453P += i;
        synchronized (c7123xC.f45468u) {
            try {
                if (c10359nA0.f38159b.f26595a == c7123xC.f45444G) {
                    Uri uri2 = c7123xC.f45446I.f39907k;
                    if (uri2 == null) {
                        uri2 = c10359nA0.f38161d.f6987c;
                    }
                    c7123xC.f45444G = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6602pC c6602pC3 = c7123xC.f45446I;
        if (!c6602pC3.f39900d || c7123xC.f45450M != -9223372036854775807L) {
            c7123xC.m25813z(true);
            return;
        }
        C0827N8 c0827n8 = c6602pC3.f39905i;
        if (c0827n8 == null) {
            c7123xC.m25810w();
            return;
        }
        String str = (String) c0827n8.f7523b;
        if (AbstractC7485Dh1.m1812a(str, "urn:mpeg:dash:utc:direct:2014") || AbstractC7485Dh1.m1812a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                c7123xC.f45450M = AbstractC7485Dh1.m1805T((String) c0827n8.f7524c) - c7123xC.f45449L;
                c7123xC.m25813z(true);
                return;
            } catch (C10103lA0 e) {
                c7123xC.m25812y(e);
                return;
            }
        }
        if (AbstractC7485Dh1.m1812a(str, "urn:mpeg:dash:utc:http-iso:2014") || AbstractC7485Dh1.m1812a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            C10359nA0 c10359nA02 = new C10359nA0(c7123xC.f45438A, Uri.parse((String) c0827n8.f7524c), 5, new C7060wC());
            c7123xC.f45465r.m8481S(new C9535gk0(c10359nA02.f38158a, c10359nA02.f38159b, c7123xC.f45439B.m9136S(c10359nA02, new C9432fw1(10, c7123xC), 1)), c10359nA02.f38160c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (AbstractC7485Dh1.m1812a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || AbstractC7485Dh1.m1812a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            C10359nA0 c10359nA03 = new C10359nA0(c7123xC.f45438A, Uri.parse((String) c0827n8.f7524c), 5, new NV1(11));
            c7123xC.f45465r.m8481S(new C9535gk0(c10359nA03.f38158a, c10359nA03.f38159b, c7123xC.f45439B.m9136S(c10359nA03, new C9432fw1(10, c7123xC), 1)), c10359nA03.f38160c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (AbstractC7485Dh1.m1812a(str, "urn:mpeg:dash:utc:ntp:2014") || AbstractC7485Dh1.m1812a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            c7123xC.m25810w();
        } else {
            c7123xC.m25812y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    /* renamed from: v0 */
    public String m17860v0(C6686qX c6686qX) {
        int i = c6686qX.f40967f;
        int i2 = i & 2;
        Resources resources = (Resources) this.f26532b;
        String string = i2 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i & 4) != 0) {
            string = m17850M0(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string = m17850M0(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? m17850M0(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: w */
    public /* synthetic */ Object mo4794w(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24897i(this, c0480Hc);
    }

    /* renamed from: w0 */
    public void m17861w0() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(((HashMap) this.f26532b).values());
            ((HashMap) this.f26532b).clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            EncodedImage encodedImage = (EncodedImage) arrayList.get(i);
            if (encodedImage != null) {
                encodedImage.close();
            }
        }
    }

    /* renamed from: x0 */
    public boolean m17862x0(Class cls) {
        Iterator it = ((ArrayList) this.f26532b).iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((CG0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y0 */
    public Object m17863y0(String str, JSONObject jSONObject, KeyStore.PrivateKeyEntry privateKeyEntry, SecureStoreOptions secureStoreOptions, X11 x11, C11173tX0 c11173tX0) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArrDecode = Base64.decode(jSONObject.getString("esk"), 0);
        Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
        O90.m5967e(cipher, "getInstance(...)");
        cipher.init(2, privateKeyEntry.getPrivateKey());
        return ((C7512Dv0) this.f26532b).m1945r(str, jSONObject, new KeyStore.SecretKeyEntry(new SecretKeySpec(cipher.doFinal(bArrDecode), "AES")), secureStoreOptions, x11, c11173tX0);
    }

    /* renamed from: z0 */
    public CG0 m17864z0(Class cls) {
        Iterator it = ((ArrayList) this.f26532b).iterator();
        while (it.hasNext()) {
            CG0 cg0 = (CG0) it.next();
            if (cg0.getClass() == cls) {
                return cg0;
            }
        }
        return null;
    }

    public /* synthetic */ C9196e41(int i, boolean z) {
        this.f26531a = i;
    }

    public C9196e41(C1116Rk c1116Rk) {
        this.f26531a = 6;
        O90.m5968f(c1116Rk, "props");
        this.f26532b = c1116Rk;
    }

    public C9196e41(int i) {
        this.f26531a = i;
        switch (i) {
            case 13:
                this.f26532b = (SmallDisplaySizeQuirk) AbstractC7067wJ.f44776a.m17864z0(SmallDisplaySizeQuirk.class);
                break;
            case 23:
                this.f26532b = new C10703ps0(500L);
                break;
            default:
                this.f26532b = new C0732Ld(new Object());
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9196e41(InterfaceC6497nZ interfaceC6497nZ) {
        this.f26531a = 29;
        this.f26532b = (AbstractC8418Vg0) interfaceC6497nZ;
    }

    public C9196e41(List list) {
        this.f26531a = 26;
        this.f26532b = new ArrayList(list);
    }

    public C9196e41(Resources resources) {
        this.f26531a = 12;
        resources.getClass();
        this.f26532b = resources;
    }

    public C9196e41(Context context, C7512Dv0 c7512Dv0) {
        this.f26531a = 19;
        O90.m5968f(c7512Dv0, "mAESEncryptor");
        this.f26532b = c7512Dv0;
        new SecureRandom();
    }

    public C9196e41(Bundle bundle) {
        this.f26531a = 24;
        if (bundle != null) {
            this.f26532b = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public C9196e41(TextView textView) {
        this.f26531a = 14;
        this.f26532b = new C0024AN(textView);
    }

    public C9196e41(Context context, Uri uri) {
        this.f26531a = 17;
        this.f26532b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public C9196e41(ClipData clipData, int i) {
        this.f26531a = 9;
        this.f26532b = AbstractC1205T9.m7593l(clipData, i);
    }
}
