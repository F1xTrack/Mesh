package p000;

import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Trace;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.huawei.hms.framework.common.ContainerUtils;
import com.p019vk.push.common.AppInfo;
import com.statstracker.data.MessageDatabase_Impl;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.Serializable;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import ru.mes.dnevnik.R;

/* renamed from: lr0 */
/* loaded from: classes2.dex */
public final class C10189lr0 implements InterfaceC1397WC, InterfaceC9585h70, D80, InterfaceC0980PZ, QA0, InterfaceC1538YR, InterfaceC7758Io0 {

    /* renamed from: e */
    public static volatile C10189lr0 f37318e;

    /* renamed from: f */
    public static final Object f37319f = new Object();

    /* renamed from: g */
    public static final Object f37320g = new Object();

    /* renamed from: h */
    public static C10189lr0 f37321h;

    /* renamed from: a */
    public final /* synthetic */ int f37322a;

    /* renamed from: b */
    public Object f37323b;

    /* renamed from: c */
    public Object f37324c;

    /* renamed from: d */
    public Object f37325d;

    public /* synthetic */ C10189lr0(int i) {
        this.f37322a = i;
    }

    /* renamed from: F */
    public static String m22541F(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append(ContainerUtils.FIELD_DELIMITER);
            sb.append((String) entry2.getKey());
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return AbstractC1374Vq.m8589h(str, "?", string);
        }
        if (!str.endsWith(ContainerUtils.FIELD_DELIMITER)) {
            string = ContainerUtils.FIELD_DELIMITER.concat(string);
        }
        return AbstractC7222ym.m26232i(str, string);
    }

    /* renamed from: P */
    public static C10189lr0 m22542P(Context context) {
        if (f37318e == null) {
            synchronized (f37319f) {
                try {
                    if (f37318e == null) {
                        f37318e = new C10189lr0(context);
                    }
                } finally {
                }
            }
        }
        return f37318e;
    }

    /* renamed from: z */
    public static final URL m22543z(C10189lr0 c10189lr0) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority((String) c10189lr0.f37325d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(ConstantDeviceInfo.APP_PLATFORM).appendPath("gmp");
        C1766b8 c1766b8 = (C1766b8) c10189lr0.f37323b;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c1766b8.f16817a).appendPath("settings");
        C4030f4 c4030f4 = c1766b8.f16820d;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c4030f4.f27033c).appendQueryParameter("display_version", c4030f4.f27032b).build().toString());
    }

    /* renamed from: A */
    public void m22544A(int i, View view, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((C9196e41) this.f37323b).f26532b;
        int childCount = i < 0 ? recyclerView.getChildCount() : m22558Q(i);
        ((C0495Hr) this.f37324c).m3633y(childCount, z);
        if (z) {
            m22563V(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m10226M(view);
        ArrayList arrayList = recyclerView.f16464C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C9154dl1) recyclerView.f16464C.get(size)).getClass();
                AO0 ao0 = (AO0) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) ao0).width != -1 || ((ViewGroup.MarginLayoutParams) ao0).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    /* renamed from: B */
    public boolean m22545B(String str) {
        AbstractC0752Lx abstractC0752Lx;
        boolean z;
        O90.m5968f(str, "workSpecId");
        synchronized (this.f37325d) {
            try {
                AbstractC0752Lx[] abstractC0752LxArr = (AbstractC0752Lx[]) this.f37324c;
                int length = abstractC0752LxArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        abstractC0752Lx = null;
                        break;
                    }
                    abstractC0752Lx = abstractC0752LxArr[i];
                    abstractC0752Lx.getClass();
                    Object obj = abstractC0752Lx.f6940d;
                    if (obj != null && abstractC0752Lx.mo5158b(obj) && abstractC0752Lx.f6939c.contains(str)) {
                        break;
                    }
                    i++;
                }
                if (abstractC0752Lx != null) {
                    C1210TE c1210teM7634G = C1210TE.m7634G();
                    int i2 = AbstractC11718xo1.f45799a;
                    c1210teM7634G.getClass();
                }
                z = abstractC0752Lx == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* renamed from: C */
    public void m22546C(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((C9196e41) this.f37323b).f26532b;
        int childCount = i < 0 ? recyclerView.getChildCount() : m22558Q(i);
        ((C0495Hr) this.f37324c).m3633y(childCount, z);
        if (z) {
            m22563V(view);
        }
        OO0 oo0M10226M = RecyclerView.m10226M(view);
        if (oo0M10226M != null) {
            if (!oo0M10226M.m6054k() && !oo0M10226M.m6059p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(oo0M10226M);
                throw new IllegalArgumentException(AbstractC1374Vq.m8587f(recyclerView, sb));
            }
            if (RecyclerView.f16451M1) {
                oo0M10226M.toString();
            }
            oo0M10226M.f8417j &= -257;
        } else if (RecyclerView.f16450L1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(AbstractC1374Vq.m8587f(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x00e1  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m22547D(int r10) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10189lr0.m22547D(int):int");
    }

    /* renamed from: E */
    public int m22548E() {
        C7621Fx1 c7621Fx1 = (C7621Fx1) this.f37325d;
        if (c7621Fx1 == null) {
            return 1;
        }
        Context context = (Context) c7621Fx1.f3494a;
        FingerprintManager fingerprintManagerM2309c = AbstractC0283EU.m2309c(context);
        if (fingerprintManagerM2309c == null || !AbstractC0283EU.m2311e(fingerprintManagerM2309c)) {
            return 12;
        }
        FingerprintManager fingerprintManagerM2309c2 = AbstractC0283EU.m2309c(context);
        return (fingerprintManagerM2309c2 == null || !AbstractC0283EU.m2310d(fingerprintManagerM2309c2)) ? 11 : 0;
    }

    /* renamed from: G */
    public void m22549G(String str) {
        MessageDatabase_Impl messageDatabase_Impl = (MessageDatabase_Impl) this.f37323b;
        messageDatabase_Impl.m23792b();
        C10061kr0 c10061kr0 = (C10061kr0) this.f37325d;
        C3936dZ c3936dZM2771a = c10061kr0.m2771a();
        if (str == null) {
            c3936dZM2771a.mo2032V(1);
        } else {
            c3936dZM2771a.mo2033d(1, str);
        }
        messageDatabase_Impl.m23793c();
        try {
            c3936dZM2771a.m17710m();
            messageDatabase_Impl.m23799n();
        } finally {
            messageDatabase_Impl.m23795j();
            c10061kr0.m2776f(c3936dZM2771a);
        }
    }

    /* renamed from: H */
    public void m22550H(int i) {
        int iM22558Q = m22558Q(i);
        ((C0495Hr) this.f37324c).m3634z(iM22558Q);
        RecyclerView recyclerView = (RecyclerView) ((C9196e41) this.f37323b).f26532b;
        View childAt = recyclerView.getChildAt(iM22558Q);
        if (childAt != null) {
            OO0 oo0M10226M = RecyclerView.m10226M(childAt);
            if (oo0M10226M != null) {
                if (oo0M10226M.m6054k() && !oo0M10226M.m6059p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(oo0M10226M);
                    throw new IllegalArgumentException(AbstractC1374Vq.m8587f(recyclerView, sb));
                }
                if (RecyclerView.f16451M1) {
                    oo0M10226M.toString();
                }
                oo0M10226M.m6044a(256);
            }
        } else if (RecyclerView.f16450L1) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iM22558Q);
            throw new IllegalArgumentException(AbstractC1374Vq.m8587f(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iM22558Q);
    }

    /* renamed from: I */
    public void m22551I(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = ((Context) this.f37325d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = (HashSet) this.f37324c;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC10867r80.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m22552J((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C6838sg((Throwable) e);
            }
        }
    }

    /* renamed from: J */
    public Object m22552J(Class cls, HashSet hashSet) {
        Object objCreate;
        if (OY1.m6086d()) {
            try {
                Trace.beginSection(OY1.m6088f(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = (HashMap) this.f37323b;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC10867r80 interfaceC10867r80 = (InterfaceC10867r80) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = interfaceC10867r80.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            m22552J(cls2, hashSet);
                        }
                    }
                }
                objCreate = interfaceC10867r80.create((Context) this.f37325d);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new C6838sg(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a7  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.C0986Pf m22553K() throws java.lang.Throwable {
        /*
            r8 = this;
            p000.C10910rT1.m24367r()
            r0 = 0
            java.lang.Object r1 = r8.f37323b     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r8.f37324c     // Catch: java.lang.Throwable -> L9d
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = m22541F(r1, r2)     // Catch: java.lang.Throwable -> L9a
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L9a
            java.net.URLConnection r1 = r2.openConnection()     // Catch: java.lang.Throwable -> L9a
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch: java.lang.Throwable -> L9a
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L50
            r1.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r2 = r8.f37325d     // Catch: java.lang.Throwable -> L50
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L50
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L50
        L34:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L52
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L50
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L50
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L50
            r1.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L50
            goto L34
        L50:
            r2 = move-exception
            goto La0
        L52:
            r1.connect()     // Catch: java.lang.Throwable -> L50
            int r2 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L50
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L8b
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L87
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L87
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L87
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r5.<init>()     // Catch: java.lang.Throwable -> L87
        L74:
            int r6 = r0.read(r4)     // Catch: java.lang.Throwable -> L87
            r7 = -1
            if (r6 == r7) goto L80
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> L87
            goto L74
        L80:
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L85:
            r2 = r0
            goto L89
        L87:
            r0 = move-exception
            goto L85
        L89:
            r0 = r3
            goto La0
        L8b:
            if (r3 == 0) goto L90
            r3.close()
        L90:
            r1.disconnect()
            Pf r1 = new Pf
            r3 = 7
            r1.<init>(r2, r0, r3)
            return r1
        L9a:
            r2 = move-exception
        L9b:
            r1 = r0
            goto La0
        L9d:
            r1 = move-exception
            r2 = r1
            goto L9b
        La0:
            if (r0 == 0) goto La5
            r0.close()
        La5:
            if (r1 == 0) goto Laa
            r1.disconnect()
        Laa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10189lr0.m22553K():Pf");
    }

    /* renamed from: L */
    public AbstractC8375Uk1 m22554L(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m22555M(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: M */
    public AbstractC8375Uk1 m22555M(Class cls, String str) {
        AbstractC8375Uk1 abstractC8375Uk1Mo8847a;
        O90.m5968f(str, "key");
        C8583Yk1 c8583Yk1 = (C8583Yk1) this.f37323b;
        c8583Yk1.getClass();
        LinkedHashMap linkedHashMap = c8583Yk1.f14501a;
        AbstractC8375Uk1 abstractC8375Uk1 = (AbstractC8375Uk1) linkedHashMap.get(str);
        boolean zIsInstance = cls.isInstance(abstractC8375Uk1);
        InterfaceC8531Xk1 interfaceC8531Xk1 = (InterfaceC8531Xk1) this.f37324c;
        if (!zIsInstance) {
            C7508Dt0 c7508Dt0 = new C7508Dt0((AbstractC4100gB) this.f37325d);
            c7508Dt0.f27599a.put(S20.f10543f, str);
            try {
                abstractC8375Uk1Mo8847a = interfaceC8531Xk1.mo8848b(cls, c7508Dt0);
            } catch (AbstractMethodError unused) {
                abstractC8375Uk1Mo8847a = interfaceC8531Xk1.mo8847a(cls);
            }
            O90.m5968f(abstractC8375Uk1Mo8847a, "viewModel");
            AbstractC8375Uk1 abstractC8375Uk12 = (AbstractC8375Uk1) linkedHashMap.put(str, abstractC8375Uk1Mo8847a);
            if (abstractC8375Uk12 != null) {
                abstractC8375Uk12.mo8138b();
            }
            return abstractC8375Uk1Mo8847a;
        }
        C10529oV0 c10529oV0 = interfaceC8531Xk1 instanceof C10529oV0 ? (C10529oV0) interfaceC8531Xk1 : null;
        if (c10529oV0 != null) {
            O90.m5965c(abstractC8375Uk1);
            AbstractC7538Ei0 abstractC7538Ei0 = c10529oV0.f39042d;
            if (abstractC7538Ei0 != null) {
                C10145lV0 c10145lV0 = c10529oV0.f39043e;
                O90.m5965c(c10145lV0);
                AbstractC7187yD.m26095a(abstractC8375Uk1, c10145lV0, abstractC7538Ei0);
            }
        }
        O90.m5966d(abstractC8375Uk1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return abstractC8375Uk1;
    }

    /* renamed from: N */
    public View m22556N(int i) {
        return ((RecyclerView) ((C9196e41) this.f37323b).f26532b).getChildAt(m22558Q(i));
    }

    /* renamed from: O */
    public int m22557O() {
        return ((RecyclerView) ((C9196e41) this.f37323b).f26532b).getChildCount() - ((ArrayList) this.f37325d).size();
    }

    /* renamed from: Q */
    public int m22558Q(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((C9196e41) this.f37323b).f26532b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0495Hr c0495Hr = (C0495Hr) this.f37324c;
            int iM3630t = i - (i2 - c0495Hr.m3630t(i2));
            if (iM3630t == 0) {
                while (c0495Hr.m3632v(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM3630t;
        }
        return -1;
    }

    /* renamed from: R */
    public EditText m22559R() {
        View viewFindViewById = ((C0830NB) this.f37323b).findViewById(R.id.search_src_text);
        if (viewFindViewById instanceof EditText) {
            return (EditText) viewFindViewById;
        }
        return null;
    }

    /* renamed from: S */
    public View m22560S(int i) {
        return ((RecyclerView) ((C9196e41) this.f37323b).f26532b).getChildAt(i);
    }

    /* renamed from: T */
    public int m22561T() {
        return ((RecyclerView) ((C9196e41) this.f37323b).f26532b).getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00ca  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m22562U() throws org.json.JSONException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10189lr0.m22562U():boolean");
    }

    /* renamed from: V */
    public void m22563V(View view) {
        ((ArrayList) this.f37325d).add(view);
        C9196e41 c9196e41 = (C9196e41) this.f37323b;
        OO0 oo0M10226M = RecyclerView.m10226M(view);
        if (oo0M10226M != null) {
            int i = oo0M10226M.f8424q;
            View view2 = oo0M10226M.f8408a;
            if (i != -1) {
                oo0M10226M.f8423p = i;
            } else {
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                oo0M10226M.f8423p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = (RecyclerView) c9196e41.f26532b;
            if (recyclerView.m10248P()) {
                oo0M10226M.f8424q = 4;
                recyclerView.f16471F1.add(oo0M10226M);
            } else {
                WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* renamed from: W */
    public void m22564W(C9933jr0 c9933jr0) {
        MessageDatabase_Impl messageDatabase_Impl = (MessageDatabase_Impl) this.f37323b;
        messageDatabase_Impl.m23792b();
        messageDatabase_Impl.m23793c();
        try {
            ((C1276UH) this.f37324c).m7954h(c9933jr0);
            messageDatabase_Impl.m23799n();
        } finally {
            messageDatabase_Impl.m23795j();
        }
    }

    /* renamed from: X */
    public void m22565X(ArrayList arrayList) {
        O90.m5968f(arrayList, "workSpecs");
        synchronized (this.f37325d) {
            InterfaceC11591wo1 interfaceC11591wo1 = (InterfaceC11591wo1) this.f37323b;
            if (interfaceC11591wo1 != null) {
                interfaceC11591wo1.mo5550d(arrayList);
            }
        }
    }

    /* renamed from: Y */
    public void m22566Y(String str, Bitmap bitmap) {
        synchronized (f37320g) {
            ((C10691pm0) ((Map) this.f37325d).get(str)).f40391f = bitmap;
        }
    }

    /* renamed from: Z */
    public void m22567Z(Iterable iterable) {
        O90.m5968f(iterable, "workSpecs");
        synchronized (this.f37325d) {
            try {
                for (AbstractC0752Lx abstractC0752Lx : (AbstractC0752Lx[]) this.f37324c) {
                    if (abstractC0752Lx.f6941e != null) {
                        abstractC0752Lx.f6941e = null;
                        abstractC0752Lx.m5160d(null, abstractC0752Lx.f6940d);
                    }
                }
                for (AbstractC0752Lx abstractC0752Lx2 : (AbstractC0752Lx[]) this.f37324c) {
                    abstractC0752Lx2.m5159c(iterable);
                }
                for (AbstractC0752Lx abstractC0752Lx3 : (AbstractC0752Lx[]) this.f37324c) {
                    if (abstractC0752Lx3.f6941e != this) {
                        abstractC0752Lx3.f6941e = this;
                        abstractC0752Lx3.m5160d(this, abstractC0752Lx3.f6940d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: a */
    public void mo4007a(Bundle bundle) {
        ((MediaCodec) this.f37323b).setParameters(bundle);
    }

    /* renamed from: a0 */
    public void m22568a0() {
        synchronized (this.f37325d) {
            for (AbstractC0752Lx abstractC0752Lx : (AbstractC0752Lx[]) this.f37324c) {
                ArrayList arrayList = abstractC0752Lx.f6938b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    abstractC0752Lx.f6937a.m9648h(abstractC0752Lx);
                }
            }
        }
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: b */
    public void mo4008b(int i, C6536oB c6536oB, long j, int i2) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f37323b).queueSecureInputBuffer(i, 0, c6536oB.f38861i, j, i2);
    }

    /* renamed from: b0 */
    public void m22569b0(View view) {
        if (((ArrayList) this.f37325d).remove(view)) {
            C9196e41 c9196e41 = (C9196e41) this.f37323b;
            OO0 oo0M10226M = RecyclerView.m10226M(view);
            if (oo0M10226M != null) {
                int i = oo0M10226M.f8423p;
                RecyclerView recyclerView = (RecyclerView) c9196e41.f26532b;
                if (recyclerView.m10248P()) {
                    oo0M10226M.f8424q = i;
                    recyclerView.f16471F1.add(oo0M10226M);
                } else {
                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                    oo0M10226M.f8408a.setImportantForAccessibility(i);
                }
                oo0M10226M.f8423p = 0;
            }
        }
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: c */
    public void mo4009c(int i, int i2, int i3, long j) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f37323b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: d */
    public /* synthetic */ boolean mo4010d(C8278So0 c8278So0) {
        return false;
    }

    @Override // p000.D80
    /* renamed from: e */
    public Uri mo993e() {
        return (Uri) this.f37323b;
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: f */
    public MediaFormat mo4011f() {
        return ((MediaCodec) this.f37323b).getOutputFormat();
    }

    @Override // p000.InterfaceC7758Io0
    public void flush() {
        ((MediaCodec) this.f37323b).flush();
    }

    @Override // p000.InterfaceC9585h70
    /* renamed from: g */
    public int mo9141g() {
        ByteBuffer byteBufferM25480c = AbstractC7031vk.m25480c((ByteBuffer) this.f37323b);
        C11967zm0 c11967zm0 = (C11967zm0) this.f37325d;
        if (byteBufferM25480c == null) {
            return -1;
        }
        ArrayList arrayList = (ArrayList) this.f37324c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                int iMo3298b = ((H60) arrayList.get(i)).mo3298b(byteBufferM25480c, c11967zm0);
                if (iMo3298b != -1) {
                    return iMo3298b;
                }
            } finally {
            }
        }
        return -1;
    }

    @Override // p000.D80
    public ClipDescription getDescription() {
        return (ClipDescription) this.f37324c;
    }

    @Override // p000.D80
    /* renamed from: i */
    public Uri mo995i() {
        return (Uri) this.f37325d;
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: j */
    public void mo4012j(int i, long j) {
        ((MediaCodec) this.f37323b).releaseOutputBuffer(i, j);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: k */
    public int mo4013k() {
        return ((MediaCodec) this.f37323b).dequeueInputBuffer(0L);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: l */
    public void mo4014l(C9033cp0 c9033cp0, Handler handler) {
        ((MediaCodec) this.f37323b).setOnFrameRenderedListener(new C7120x9(this, c9033cp0, 1), handler);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: m */
    public int mo4015m(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.f37323b;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && AbstractC7485Dh1.f2166a < 21) {
                this.f37325d = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p000.InterfaceC9585h70
    /* renamed from: n */
    public Bitmap mo9145n(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(new C6968uk(AbstractC7031vk.m25480c((ByteBuffer) this.f37323b)), null, options);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: o */
    public void mo4016o(int i, boolean z) {
        ((MediaCodec) this.f37323b).releaseOutputBuffer(i, z);
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        ((C9597hD0) this.f37325d).f28321e = null;
        ArrayList arrayList = (ArrayList) this.f37323b;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC6766ro) this.f37324c).mo2414z((AbstractC6511nn) it.next());
        }
        arrayList.clear();
    }

    @Override // p000.QA0
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1) {
            return false;
        }
        int length = iArr.length;
        C10885rH0 c10885rH0 = (C10885rH0) this.f37325d;
        if (length <= 0 || iArr[0] != 0) {
            Toast.makeText(c10885rH0.f41410a, (String) this.f37324c, 1).show();
        } else if (c10885rH0.f41411b != null) {
            c10885rH0.m24248b((String) this.f37323b);
        }
        return true;
    }

    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        ((C9597hD0) this.f37325d).f28321e = null;
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: p */
    public void mo2003p() {
        ((InterfaceC1538YR) this.f37323b).mo2003p();
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: q */
    public void mo4017q(int i) {
        ((MediaCodec) this.f37323b).setVideoScalingMode(i);
    }

    @Override // p000.D80
    /* renamed from: r */
    public Object mo996r() {
        return null;
    }

    @Override // p000.InterfaceC7758Io0
    public void release() {
        MediaCodec mediaCodec = (MediaCodec) this.f37323b;
        this.f37324c = null;
        this.f37325d = null;
        try {
            int i = AbstractC7485Dh1.f2166a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    @Override // p000.InterfaceC1397WC
    /* renamed from: s0 */
    public InterfaceC1586ZC mo506s0() {
        C10919rY0 c10919rY0 = (C10919rY0) this.f37325d;
        InterfaceC1586ZC interfaceC1586ZCMo506s0 = c10919rY0 != null ? c10919rY0.mo506s0() : null;
        N01 n01 = (N01) this.f37323b;
        n01.getClass();
        return new C3948dl(n01, interfaceC1586ZCMo506s0, ((C1210TE) this.f37324c).mo506s0(), interfaceC1586ZCMo506s0 != null ? new C1867cl(n01) : null);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: t */
    public ByteBuffer mo4018t(int i) {
        return AbstractC7485Dh1.f2166a >= 21 ? ((MediaCodec) this.f37323b).getInputBuffer(i) : ((ByteBuffer[]) this.f37324c)[i];
    }

    public String toString() {
        switch (this.f37322a) {
            case 8:
                return ((C0495Hr) this.f37324c).toString() + ", hidden list:" + ((ArrayList) this.f37325d).size();
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: u */
    public void mo4019u(Surface surface) {
        ((MediaCodec) this.f37323b).setOutputSurface(surface);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: v */
    public ByteBuffer mo4020v(int i) {
        return AbstractC7485Dh1.f2166a >= 21 ? ((MediaCodec) this.f37323b).getOutputBuffer(i) : ((ByteBuffer[]) this.f37325d)[i];
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: w */
    public InterfaceC8357Ub1 mo2005w(int i, int i2) {
        InterfaceC1538YR interfaceC1538YR = (InterfaceC1538YR) this.f37323b;
        if (i2 != 3) {
            return interfaceC1538YR.mo2005w(i, i2);
        }
        SparseArray sparseArray = (SparseArray) this.f37325d;
        C9584h61 c9584h61 = (C9584h61) sparseArray.get(i);
        if (c9584h61 != null) {
            return c9584h61;
        }
        C9584h61 c9584h612 = new C9584h61(interfaceC1538YR.mo2005w(i, i2), (InterfaceC8939c61) this.f37324c);
        sparseArray.put(i, c9584h612);
        return c9584h612;
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: x */
    public void mo2006x(CX0 cx0) {
        ((InterfaceC1538YR) this.f37323b).mo2006x(cx0);
    }

    @Override // p000.InterfaceC9585h70
    /* renamed from: y */
    public ImageHeaderParser$ImageType mo9155y() {
        return AbstractC9063d22.m17479c((ArrayList) this.f37324c, AbstractC7031vk.m25480c((ByteBuffer) this.f37323b));
    }

    public /* synthetic */ C10189lr0(Object obj, Serializable serializable, Object obj2, int i) {
        this.f37322a = i;
        this.f37325d = obj;
        this.f37323b = serializable;
        this.f37324c = obj2;
    }

    public /* synthetic */ C10189lr0(Object obj, Object obj2, Object obj3, int i) {
        this.f37322a = i;
        this.f37323b = obj;
        this.f37324c = obj2;
        this.f37325d = obj3;
    }

    public C10189lr0(C4140gp c4140gp) {
        this.f37322a = 13;
        this.f37323b = c4140gp;
        this.f37324c = new ArrayList();
    }

    public C10189lr0(C0712LI c0712li, C8342Tu0 c8342Tu0) {
        this.f37322a = 20;
        this.f37323b = c0712li;
        this.f37324c = c8342Tu0;
        this.f37325d = new ConcurrentHashMap();
    }

    public C10189lr0(Drawable.Callback callback, String str, Map map) {
        this.f37322a = 2;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f37324c = str.concat("/");
        } else {
            this.f37324c = str;
        }
        this.f37325d = map;
        if (!(callback instanceof View)) {
            this.f37323b = null;
        } else {
            this.f37323b = ((View) callback).getContext().getApplicationContext();
        }
    }

    public C10189lr0(MessageDatabase_Impl messageDatabase_Impl) {
        this.f37322a = 0;
        this.f37323b = messageDatabase_Impl;
        this.f37324c = new C1276UH(messageDatabase_Impl, 1);
        new C10061kr0(messageDatabase_Impl, 0);
        this.f37325d = new C10061kr0(messageDatabase_Impl, 1);
    }

    public C10189lr0(C1766b8 c1766b8, InterfaceC0125Bz interfaceC0125Bz) {
        this.f37322a = 23;
        this.f37323b = c1766b8;
        this.f37324c = interfaceC0125Bz;
        this.f37325d = "firebase-settings.crashlytics.com";
    }

    @Override // p000.D80
    /* renamed from: h */
    public void mo994h() {
    }

    @Override // p000.InterfaceC9585h70
    /* renamed from: s */
    public void mo9150s() {
    }

    public C10189lr0(String str, HashMap map) {
        this.f37322a = 14;
        this.f37323b = str;
        this.f37324c = map;
        this.f37325d = new HashMap();
    }

    public C10189lr0(C8583Yk1 c8583Yk1, InterfaceC8531Xk1 interfaceC8531Xk1, AbstractC4100gB abstractC4100gB) {
        this.f37322a = 28;
        O90.m5968f(c8583Yk1, "store");
        O90.m5968f(interfaceC8531Xk1, "factory");
        O90.m5968f(abstractC4100gB, "defaultCreationExtras");
        this.f37323b = c8583Yk1;
        this.f37324c = interfaceC8531Xk1;
        this.f37325d = abstractC4100gB;
    }

    public C10189lr0(C9196e41 c9196e41) {
        this.f37322a = 8;
        this.f37323b = c9196e41;
        this.f37324c = new C0495Hr();
        this.f37325d = new ArrayList();
    }

    public C10189lr0(InterfaceC1538YR interfaceC1538YR, InterfaceC8939c61 interfaceC8939c61) {
        this.f37322a = 25;
        this.f37323b = interfaceC1538YR;
        this.f37324c = interfaceC8939c61;
        this.f37325d = new SparseArray();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10189lr0(C8583Yk1 c8583Yk1, InterfaceC8531Xk1 interfaceC8531Xk1) {
        this(c8583Yk1, interfaceC8531Xk1, C4037fB.f27104b);
        this.f37322a = 28;
        O90.m5968f(c8583Yk1, "store");
    }

    public C10189lr0(FirebaseMessagingService firebaseMessagingService, C9196e41 c9196e41, ExecutorService executorService) {
        this.f37322a = 11;
        this.f37323b = executorService;
        this.f37324c = firebaseMessagingService;
        this.f37325d = c9196e41;
    }

    public C10189lr0(Context context, LocationManager locationManager) {
        this.f37322a = 27;
        this.f37325d = new C9072d61();
        this.f37323b = context;
        this.f37324c = locationManager;
    }

    public C10189lr0(T71 t71, InterfaceC11591wo1 interfaceC11591wo1) {
        this.f37322a = 29;
        O90.m5968f(t71, "trackers");
        AbstractC1633Zx abstractC1633Zx = (AbstractC1633Zx) t71.f11173a;
        O90.m5968f(abstractC1633Zx, "tracker");
        C1427Wg c1427Wg = new C1427Wg(abstractC1633Zx, 0);
        C1490Xg c1490Xg = (C1490Xg) t71.f11174b;
        O90.m5968f(c1490Xg, "tracker");
        C1427Wg c1427Wg2 = new C1427Wg(c1490Xg, 1);
        AbstractC1633Zx abstractC1633Zx2 = (AbstractC1633Zx) t71.f11176d;
        O90.m5968f(abstractC1633Zx2, "tracker");
        C1427Wg c1427Wg3 = new C1427Wg(abstractC1633Zx2, 4);
        AbstractC1633Zx abstractC1633Zx3 = (AbstractC1633Zx) t71.f11175c;
        O90.m5968f(abstractC1633Zx3, "tracker");
        C1427Wg c1427Wg4 = new C1427Wg(abstractC1633Zx3, 2);
        O90.m5968f(abstractC1633Zx3, "tracker");
        C1427Wg c1427Wg5 = new C1427Wg(abstractC1633Zx3, 3);
        O90.m5968f(abstractC1633Zx3, "tracker");
        C8446Vu0 c8446Vu0 = new C8446Vu0(abstractC1633Zx3);
        O90.m5968f(abstractC1633Zx3, "tracker");
        AbstractC0752Lx[] abstractC0752LxArr = {c1427Wg, c1427Wg2, c1427Wg3, c1427Wg4, c1427Wg5, c8446Vu0, new C8394Uu0(abstractC1633Zx3)};
        this.f37323b = interfaceC11591wo1;
        this.f37324c = abstractC0752LxArr;
        this.f37325d = new Object();
    }

    public C10189lr0(Context context) {
        this.f37322a = 1;
        this.f37325d = context.getApplicationContext();
        this.f37324c = new HashSet();
        this.f37323b = new HashMap();
    }

    public C10189lr0(MediaCodec mediaCodec) {
        this.f37322a = 26;
        this.f37323b = mediaCodec;
        if (AbstractC7485Dh1.f2166a < 21) {
            this.f37324c = mediaCodec.getInputBuffers();
            this.f37325d = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10189lr0(AbstractActivityC1730l abstractActivityC1730l) {
        this(abstractActivityC1730l.getViewModelStore(), abstractActivityC1730l.getDefaultViewModelProviderFactory(), abstractActivityC1730l.getDefaultViewModelCreationExtras());
        this.f37322a = 28;
        O90.m5968f(abstractActivityC1730l, "owner");
    }

    public C10189lr0(InterfaceC6832sa[] interfaceC6832saArr) {
        this.f37322a = 10;
        I01 i01 = new I01();
        S21 s21 = new S21();
        s21.f10547c = 1.0f;
        s21.f10548d = 1.0f;
        C6689qa c6689qa = C6689qa.f41025e;
        s21.f10549e = c6689qa;
        s21.f10550f = c6689qa;
        s21.f10551g = c6689qa;
        s21.f10552h = c6689qa;
        ByteBuffer byteBuffer = InterfaceC6832sa.f42484a;
        s21.f10555k = byteBuffer;
        s21.f10556l = byteBuffer.asShortBuffer();
        s21.f10557m = byteBuffer;
        s21.f10546b = -1;
        InterfaceC6832sa[] interfaceC6832saArr2 = new InterfaceC6832sa[interfaceC6832saArr.length + 2];
        this.f37323b = interfaceC6832saArr2;
        System.arraycopy(interfaceC6832saArr, 0, interfaceC6832saArr2, 0, interfaceC6832saArr.length);
        this.f37324c = i01;
        this.f37325d = s21;
        interfaceC6832saArr2[interfaceC6832saArr.length] = i01;
        interfaceC6832saArr2[interfaceC6832saArr.length + 1] = s21;
    }

    public C10189lr0(C8342Tu0 c8342Tu0) {
        this.f37322a = 3;
        this.f37322a = 3;
        this.f37323b = c8342Tu0;
        this.f37324c = Choreographer.getInstance();
        this.f37325d = new ChoreographerFrameCallbackC4220i5(0, this);
    }

    public C10189lr0(C4151h c4151h) {
        this.f37322a = 6;
        this.f37323b = c4151h;
        int i = Build.VERSION.SDK_INT;
        Context context = c4151h.f28143a;
        this.f37324c = i >= 29 ? AbstractC0422Gh.m3122b(context) : null;
        this.f37325d = i <= 29 ? new C7621Fx1(context) : null;
    }

    public C10189lr0(AppInfo appInfo, ComponentName componentName, IInterface iInterface) {
        this.f37322a = 5;
        O90.m5968f(componentName, "componentName");
        this.f37323b = appInfo;
        this.f37324c = componentName;
        this.f37325d = iInterface;
    }

    public C10189lr0(C0277EO c0277eo, J11 j11, C0466HO c0466ho) {
        this.f37322a = 12;
        this.f37325d = c0277eo;
        this.f37324c = j11;
        this.f37323b = c0466ho;
    }
}
