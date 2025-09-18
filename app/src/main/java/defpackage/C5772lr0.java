package defpackage;

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
import androidx.fragment.app.l;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.huawei.hms.framework.common.ContainerUtils;
import com.statstracker.data.MessageDatabase_Impl;
import com.vk.push.common.AppInfo;
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
public final class C5772lr0 implements WC, InterfaceC4094h70, D80, PZ, QA0, YR, InterfaceC0687Io0 {
    public static volatile C5772lr0 e;
    public static final Object f = new Object();
    public static final Object g = new Object();
    public static C5772lr0 h;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ C5772lr0(int i) {
        this.a = i;
    }

    public static String F(String str, HashMap map) {
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
            return AbstractC1705Vq.h(str, "?", string);
        }
        if (!str.endsWith(ContainerUtils.FIELD_DELIMITER)) {
            string = ContainerUtils.FIELD_DELIMITER.concat(string);
        }
        return AbstractC8235ym.i(str, string);
    }

    public static C5772lr0 P(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new C5772lr0(context);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static final URL z(C5772lr0 c5772lr0) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority((String) c5772lr0.d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(ConstantDeviceInfo.APP_PLATFORM).appendPath("gmp");
        C2267b8 c2267b8 = (C2267b8) c5772lr0.b;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c2267b8.a).appendPath("settings");
        C3702f4 c3702f4 = c2267b8.d;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c3702f4.c).appendQueryParameter("display_version", c3702f4.b).build().toString());
    }

    public void A(int i, View view, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((C3513e41) this.b).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : Q(i);
        ((C0617Hr) this.c).y(childCount, z);
        if (z) {
            V(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.M(view);
        ArrayList arrayList = recyclerView.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C3452dl1) recyclerView.C.get(size)).getClass();
                AO0 ao0 = (AO0) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) ao0).width != -1 || ((ViewGroup.MarginLayoutParams) ao0).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public boolean B(String str) {
        AbstractC0946Lx abstractC0946Lx;
        boolean z;
        O90.f(str, "workSpecId");
        synchronized (this.d) {
            try {
                AbstractC0946Lx[] abstractC0946LxArr = (AbstractC0946Lx[]) this.c;
                int length = abstractC0946LxArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        abstractC0946Lx = null;
                        break;
                    }
                    abstractC0946Lx = abstractC0946LxArr[i];
                    abstractC0946Lx.getClass();
                    Object obj = abstractC0946Lx.d;
                    if (obj != null && abstractC0946Lx.b(obj) && abstractC0946Lx.c.contains(str)) {
                        break;
                    }
                    i++;
                }
                if (abstractC0946Lx != null) {
                    TE teG = TE.G();
                    int i2 = AbstractC8053xo1.a;
                    teG.getClass();
                }
                z = abstractC0946Lx == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void C(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((C3513e41) this.b).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : Q(i);
        ((C0617Hr) this.c).y(childCount, z);
        if (z) {
            V(view);
        }
        OO0 oo0M = RecyclerView.M(view);
        if (oo0M != null) {
            if (!oo0M.k() && !oo0M.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(oo0M);
                throw new IllegalArgumentException(AbstractC1705Vq.f(recyclerView, sb));
            }
            if (RecyclerView.M1) {
                oo0M.toString();
            }
            oo0M.j &= -257;
        } else if (RecyclerView.L1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(AbstractC1705Vq.f(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int D(int r10) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5772lr0.D(int):int");
    }

    public int E() {
        C0481Fx1 c0481Fx1 = (C0481Fx1) this.d;
        if (c0481Fx1 == null) {
            return 1;
        }
        Context context = (Context) c0481Fx1.a;
        FingerprintManager fingerprintManagerC = EU.c(context);
        if (fingerprintManagerC == null || !EU.e(fingerprintManagerC)) {
            return 12;
        }
        FingerprintManager fingerprintManagerC2 = EU.c(context);
        return (fingerprintManagerC2 == null || !EU.d(fingerprintManagerC2)) ? 11 : 0;
    }

    public void G(String str) {
        MessageDatabase_Impl messageDatabase_Impl = (MessageDatabase_Impl) this.b;
        messageDatabase_Impl.b();
        C5581kr0 c5581kr0 = (C5581kr0) this.d;
        C3414dZ c3414dZA = c5581kr0.a();
        if (str == null) {
            c3414dZA.V(1);
        } else {
            c3414dZA.d(1, str);
        }
        messageDatabase_Impl.c();
        try {
            c3414dZA.m();
            messageDatabase_Impl.n();
        } finally {
            messageDatabase_Impl.j();
            c5581kr0.f(c3414dZA);
        }
    }

    public void H(int i) {
        int iQ = Q(i);
        ((C0617Hr) this.c).z(iQ);
        RecyclerView recyclerView = (RecyclerView) ((C3513e41) this.b).b;
        View childAt = recyclerView.getChildAt(iQ);
        if (childAt != null) {
            OO0 oo0M = RecyclerView.M(childAt);
            if (oo0M != null) {
                if (oo0M.k() && !oo0M.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(oo0M);
                    throw new IllegalArgumentException(AbstractC1705Vq.f(recyclerView, sb));
                }
                if (RecyclerView.M1) {
                    oo0M.toString();
                }
                oo0M.a(256);
            }
        } else if (RecyclerView.L1) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iQ);
            throw new IllegalArgumentException(AbstractC1705Vq.f(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iQ);
    }

    public void I(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = (HashSet) this.c;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC6782r80.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    J((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new C7074sg((Throwable) e2);
            }
        }
    }

    public Object J(Class cls, HashSet hashSet) {
        Object objCreate;
        if (OY1.d()) {
            try {
                Trace.beginSection(OY1.f(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = (HashMap) this.b;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC6782r80 interfaceC6782r80 = (InterfaceC6782r80) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = interfaceC6782r80.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            J(cls2, hashSet);
                        }
                    }
                }
                objCreate = interfaceC6782r80.create((Context) this.d);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new C7074sg(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.C1204Pf K() throws java.lang.Throwable {
        /*
            r8 = this;
            defpackage.C6846rT1.r()
            r0 = 0
            java.lang.Object r1 = r8.b     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r8.c     // Catch: java.lang.Throwable -> L9d
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = F(r1, r2)     // Catch: java.lang.Throwable -> L9a
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L9a
            java.net.URLConnection r1 = r2.openConnection()     // Catch: java.lang.Throwable -> L9a
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch: java.lang.Throwable -> L9a
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L50
            r1.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r2 = r8.d     // Catch: java.lang.Throwable -> L50
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5772lr0.K():Pf");
    }

    public AbstractC1611Uk1 L(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return M(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public AbstractC1611Uk1 M(Class cls, String str) {
        AbstractC1611Uk1 abstractC1611Uk1A;
        O90.f(str, "key");
        C1923Yk1 c1923Yk1 = (C1923Yk1) this.b;
        c1923Yk1.getClass();
        LinkedHashMap linkedHashMap = c1923Yk1.a;
        AbstractC1611Uk1 abstractC1611Uk1 = (AbstractC1611Uk1) linkedHashMap.get(str);
        boolean zIsInstance = cls.isInstance(abstractC1611Uk1);
        InterfaceC1845Xk1 interfaceC1845Xk1 = (InterfaceC1845Xk1) this.c;
        if (!zIsInstance) {
            C0312Dt0 c0312Dt0 = new C0312Dt0((AbstractC3914gB) this.d);
            c0312Dt0.a.put(S20.f, str);
            try {
                abstractC1611Uk1A = interfaceC1845Xk1.b(cls, c0312Dt0);
            } catch (AbstractMethodError unused) {
                abstractC1611Uk1A = interfaceC1845Xk1.a(cls);
            }
            O90.f(abstractC1611Uk1A, "viewModel");
            AbstractC1611Uk1 abstractC1611Uk12 = (AbstractC1611Uk1) linkedHashMap.put(str, abstractC1611Uk1A);
            if (abstractC1611Uk12 != null) {
                abstractC1611Uk12.b();
            }
            return abstractC1611Uk1A;
        }
        C6279oV0 c6279oV0 = interfaceC1845Xk1 instanceof C6279oV0 ? (C6279oV0) interfaceC1845Xk1 : null;
        if (c6279oV0 != null) {
            O90.c(abstractC1611Uk1);
            AbstractC0357Ei0 abstractC0357Ei0 = c6279oV0.d;
            if (abstractC0357Ei0 != null) {
                C5706lV0 c5706lV0 = c6279oV0.e;
                O90.c(c5706lV0);
                AbstractC8130yD.a(abstractC1611Uk1, c5706lV0, abstractC0357Ei0);
            }
        }
        O90.d(abstractC1611Uk1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return abstractC1611Uk1;
    }

    public View N(int i) {
        return ((RecyclerView) ((C3513e41) this.b).b).getChildAt(Q(i));
    }

    public int O() {
        return ((RecyclerView) ((C3513e41) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public int Q(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((C3513e41) this.b).b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0617Hr c0617Hr = (C0617Hr) this.c;
            int iT = i - (i2 - c0617Hr.t(i2));
            if (iT == 0) {
                while (c0617Hr.v(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iT;
        }
        return -1;
    }

    public EditText R() {
        View viewFindViewById = ((NB) this.b).findViewById(R.id.search_src_text);
        if (viewFindViewById instanceof EditText) {
            return (EditText) viewFindViewById;
        }
        return null;
    }

    public View S(int i) {
        return ((RecyclerView) ((C3513e41) this.b).b).getChildAt(i);
    }

    public int T() {
        return ((RecyclerView) ((C3513e41) this.b).b).getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean U() throws org.json.JSONException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5772lr0.U():boolean");
    }

    public void V(View view) {
        ((ArrayList) this.d).add(view);
        C3513e41 c3513e41 = (C3513e41) this.b;
        OO0 oo0M = RecyclerView.M(view);
        if (oo0M != null) {
            int i = oo0M.q;
            View view2 = oo0M.a;
            if (i != -1) {
                oo0M.p = i;
            } else {
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                oo0M.p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = (RecyclerView) c3513e41.b;
            if (recyclerView.P()) {
                oo0M.q = 4;
                recyclerView.F1.add(oo0M);
            } else {
                WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void W(C5390jr0 c5390jr0) {
        MessageDatabase_Impl messageDatabase_Impl = (MessageDatabase_Impl) this.b;
        messageDatabase_Impl.b();
        messageDatabase_Impl.c();
        try {
            ((UH) this.c).h(c5390jr0);
            messageDatabase_Impl.n();
        } finally {
            messageDatabase_Impl.j();
        }
    }

    public void X(ArrayList arrayList) {
        O90.f(arrayList, "workSpecs");
        synchronized (this.d) {
            InterfaceC7863wo1 interfaceC7863wo1 = (InterfaceC7863wo1) this.b;
            if (interfaceC7863wo1 != null) {
                interfaceC7863wo1.d(arrayList);
            }
        }
    }

    public void Y(String str, Bitmap bitmap) {
        synchronized (g) {
            ((C6521pm0) ((Map) this.d).get(str)).f = bitmap;
        }
    }

    public void Z(Iterable iterable) {
        O90.f(iterable, "workSpecs");
        synchronized (this.d) {
            try {
                for (AbstractC0946Lx abstractC0946Lx : (AbstractC0946Lx[]) this.c) {
                    if (abstractC0946Lx.e != null) {
                        abstractC0946Lx.e = null;
                        abstractC0946Lx.d(null, abstractC0946Lx.d);
                    }
                }
                for (AbstractC0946Lx abstractC0946Lx2 : (AbstractC0946Lx[]) this.c) {
                    abstractC0946Lx2.c(iterable);
                }
                for (AbstractC0946Lx abstractC0946Lx3 : (AbstractC0946Lx[]) this.c) {
                    if (abstractC0946Lx3.e != this) {
                        abstractC0946Lx3.e = this;
                        abstractC0946Lx3.d(this, abstractC0946Lx3.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC0687Io0
    public void a(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    public void a0() {
        synchronized (this.d) {
            for (AbstractC0946Lx abstractC0946Lx : (AbstractC0946Lx[]) this.c) {
                ArrayList arrayList = abstractC0946Lx.b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    abstractC0946Lx.a.h(abstractC0946Lx);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC0687Io0
    public void b(int i, C6218oB c6218oB, long j, int i2) throws MediaCodec.CryptoException {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, c6218oB.i, j, i2);
    }

    public void b0(View view) {
        if (((ArrayList) this.d).remove(view)) {
            C3513e41 c3513e41 = (C3513e41) this.b;
            OO0 oo0M = RecyclerView.M(view);
            if (oo0M != null) {
                int i = oo0M.p;
                RecyclerView recyclerView = (RecyclerView) c3513e41.b;
                if (recyclerView.P()) {
                    oo0M.q = i;
                    recyclerView.F1.add(oo0M);
                } else {
                    WeakHashMap weakHashMap = AbstractC6897rk1.a;
                    oo0M.a.setImportantForAccessibility(i);
                }
                oo0M.p = 0;
            }
        }
    }

    @Override // defpackage.InterfaceC0687Io0
    public void c(int i, int i2, int i3, long j) throws MediaCodec.CryptoException {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.InterfaceC0687Io0
    public /* synthetic */ boolean d(C1466So0 c1466So0) {
        return false;
    }

    @Override // defpackage.D80
    public Uri e() {
        return (Uri) this.b;
    }

    @Override // defpackage.InterfaceC0687Io0
    public MediaFormat f() {
        return ((MediaCodec) this.b).getOutputFormat();
    }

    @Override // defpackage.InterfaceC0687Io0
    public void flush() {
        ((MediaCodec) this.b).flush();
    }

    @Override // defpackage.InterfaceC4094h70
    public int g() {
        ByteBuffer byteBufferC = AbstractC7659vk.c((ByteBuffer) this.b);
        C8426zm0 c8426zm0 = (C8426zm0) this.d;
        if (byteBufferC == null) {
            return -1;
        }
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                int iB = ((H60) arrayList.get(i)).b(byteBufferC, c8426zm0);
                if (iB != -1) {
                    return iB;
                }
            } finally {
            }
        }
        return -1;
    }

    @Override // defpackage.D80
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override // defpackage.D80
    public Uri i() {
        return (Uri) this.d;
    }

    @Override // defpackage.InterfaceC0687Io0
    public void j(int i, long j) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.InterfaceC0687Io0
    public int k() {
        return ((MediaCodec) this.b).dequeueInputBuffer(0L);
    }

    @Override // defpackage.InterfaceC0687Io0
    public void l(C3272cp0 c3272cp0, Handler handler) {
        ((MediaCodec) this.b).setOnFrameRenderedListener(new C7928x9(this, c3272cp0, 1), handler);
    }

    @Override // defpackage.InterfaceC0687Io0
    public int m(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.b;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && AbstractC0277Dh1.a < 21) {
                this.d = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.InterfaceC4094h70
    public Bitmap n(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(new C7468uk(AbstractC7659vk.c((ByteBuffer) this.b)), null, options);
    }

    @Override // defpackage.InterfaceC0687Io0
    public void o(int i, boolean z) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, z);
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        ((C4112hD0) this.d).e = null;
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC6907ro) this.c).z((AbstractC6141nn) it.next());
        }
        arrayList.clear();
    }

    @Override // defpackage.QA0
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1) {
            return false;
        }
        int length = iArr.length;
        C6809rH0 c6809rH0 = (C6809rH0) this.d;
        if (length <= 0 || iArr[0] != 0) {
            Toast.makeText(c6809rH0.a, (String) this.c, 1).show();
        } else if (c6809rH0.b != null) {
            c6809rH0.b((String) this.b);
        }
        return true;
    }

    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        ((C4112hD0) this.d).e = null;
    }

    @Override // defpackage.YR
    public void p() {
        ((YR) this.b).p();
    }

    @Override // defpackage.InterfaceC0687Io0
    public void q(int i) {
        ((MediaCodec) this.b).setVideoScalingMode(i);
    }

    @Override // defpackage.D80
    public Object r() {
        return null;
    }

    @Override // defpackage.InterfaceC0687Io0
    public void release() {
        MediaCodec mediaCodec = (MediaCodec) this.b;
        this.c = null;
        this.d = null;
        try {
            int i = AbstractC0277Dh1.a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    @Override // defpackage.WC
    public ZC s0() {
        C6860rY0 c6860rY0 = (C6860rY0) this.d;
        ZC zcS0 = c6860rY0 != null ? c6860rY0.s0() : null;
        N01 n01 = (N01) this.b;
        n01.getClass();
        return new C3450dl(n01, zcS0, ((TE) this.c).s0(), zcS0 != null ? new C2574cl(n01) : null);
    }

    @Override // defpackage.InterfaceC0687Io0
    public ByteBuffer t(int i) {
        return AbstractC0277Dh1.a >= 21 ? ((MediaCodec) this.b).getInputBuffer(i) : ((ByteBuffer[]) this.c)[i];
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return ((C0617Hr) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC0687Io0
    public void u(Surface surface) {
        ((MediaCodec) this.b).setOutputSurface(surface);
    }

    @Override // defpackage.InterfaceC0687Io0
    public ByteBuffer v(int i) {
        return AbstractC0277Dh1.a >= 21 ? ((MediaCodec) this.b).getOutputBuffer(i) : ((ByteBuffer[]) this.d)[i];
    }

    @Override // defpackage.YR
    public InterfaceC1584Ub1 w(int i, int i2) {
        YR yr = (YR) this.b;
        if (i2 != 3) {
            return yr.w(i, i2);
        }
        SparseArray sparseArray = (SparseArray) this.d;
        C4092h61 c4092h61 = (C4092h61) sparseArray.get(i);
        if (c4092h61 != null) {
            return c4092h61;
        }
        C4092h61 c4092h612 = new C4092h61(yr.w(i, i2), (InterfaceC2453c61) this.c);
        sparseArray.put(i, c4092h612);
        return c4092h612;
    }

    @Override // defpackage.YR
    public void x(CX0 cx0) {
        ((YR) this.b).x(cx0);
    }

    @Override // defpackage.InterfaceC4094h70
    public ImageHeaderParser$ImageType y() {
        return AbstractC3316d22.c((ArrayList) this.c, AbstractC7659vk.c((ByteBuffer) this.b));
    }

    public /* synthetic */ C5772lr0(Object obj, Serializable serializable, Object obj2, int i) {
        this.a = i;
        this.d = obj;
        this.b = serializable;
        this.c = obj2;
    }

    public /* synthetic */ C5772lr0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public C5772lr0(C4034gp c4034gp) {
        this.a = 13;
        this.b = c4034gp;
        this.c = new ArrayList();
    }

    public C5772lr0(LI li, C1562Tu0 c1562Tu0) {
        this.a = 20;
        this.b = li;
        this.c = c1562Tu0;
        this.d = new ConcurrentHashMap();
    }

    public C5772lr0(Drawable.Callback callback, String str, Map map) {
        this.a = 2;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.c = str.concat("/");
        } else {
            this.c = str;
        }
        this.d = map;
        if (!(callback instanceof View)) {
            this.b = null;
        } else {
            this.b = ((View) callback).getContext().getApplicationContext();
        }
    }

    public C5772lr0(MessageDatabase_Impl messageDatabase_Impl) {
        this.a = 0;
        this.b = messageDatabase_Impl;
        this.c = new UH(messageDatabase_Impl, 1);
        new C5581kr0(messageDatabase_Impl, 0);
        this.d = new C5581kr0(messageDatabase_Impl, 1);
    }

    public C5772lr0(C2267b8 c2267b8, InterfaceC0173Bz interfaceC0173Bz) {
        this.a = 23;
        this.b = c2267b8;
        this.c = interfaceC0173Bz;
        this.d = "firebase-settings.crashlytics.com";
    }

    @Override // defpackage.D80
    public void h() {
    }

    @Override // defpackage.InterfaceC4094h70
    public void s() {
    }

    public C5772lr0(String str, HashMap map) {
        this.a = 14;
        this.b = str;
        this.c = map;
        this.d = new HashMap();
    }

    public C5772lr0(C1923Yk1 c1923Yk1, InterfaceC1845Xk1 interfaceC1845Xk1, AbstractC3914gB abstractC3914gB) {
        this.a = 28;
        O90.f(c1923Yk1, "store");
        O90.f(interfaceC1845Xk1, "factory");
        O90.f(abstractC3914gB, "defaultCreationExtras");
        this.b = c1923Yk1;
        this.c = interfaceC1845Xk1;
        this.d = abstractC3914gB;
    }

    public C5772lr0(C3513e41 c3513e41) {
        this.a = 8;
        this.b = c3513e41;
        this.c = new C0617Hr();
        this.d = new ArrayList();
    }

    public C5772lr0(YR yr, InterfaceC2453c61 interfaceC2453c61) {
        this.a = 25;
        this.b = yr;
        this.c = interfaceC2453c61;
        this.d = new SparseArray();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5772lr0(C1923Yk1 c1923Yk1, InterfaceC1845Xk1 interfaceC1845Xk1) {
        this(c1923Yk1, interfaceC1845Xk1, C3723fB.b);
        this.a = 28;
        O90.f(c1923Yk1, "store");
    }

    public C5772lr0(FirebaseMessagingService firebaseMessagingService, C3513e41 c3513e41, ExecutorService executorService) {
        this.a = 11;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = c3513e41;
    }

    public C5772lr0(Context context, LocationManager locationManager) {
        this.a = 27;
        this.d = new C3329d61();
        this.b = context;
        this.c = locationManager;
    }

    public C5772lr0(T71 t71, InterfaceC7863wo1 interfaceC7863wo1) {
        this.a = 29;
        O90.f(t71, "trackers");
        AbstractC2038Zx abstractC2038Zx = (AbstractC2038Zx) t71.a;
        O90.f(abstractC2038Zx, "tracker");
        C1753Wg c1753Wg = new C1753Wg(abstractC2038Zx, 0);
        C1831Xg c1831Xg = (C1831Xg) t71.b;
        O90.f(c1831Xg, "tracker");
        C1753Wg c1753Wg2 = new C1753Wg(c1831Xg, 1);
        AbstractC2038Zx abstractC2038Zx2 = (AbstractC2038Zx) t71.d;
        O90.f(abstractC2038Zx2, "tracker");
        C1753Wg c1753Wg3 = new C1753Wg(abstractC2038Zx2, 4);
        AbstractC2038Zx abstractC2038Zx3 = (AbstractC2038Zx) t71.c;
        O90.f(abstractC2038Zx3, "tracker");
        C1753Wg c1753Wg4 = new C1753Wg(abstractC2038Zx3, 2);
        O90.f(abstractC2038Zx3, "tracker");
        C1753Wg c1753Wg5 = new C1753Wg(abstractC2038Zx3, 3);
        O90.f(abstractC2038Zx3, "tracker");
        C1718Vu0 c1718Vu0 = new C1718Vu0(abstractC2038Zx3);
        O90.f(abstractC2038Zx3, "tracker");
        AbstractC0946Lx[] abstractC0946LxArr = {c1753Wg, c1753Wg2, c1753Wg3, c1753Wg4, c1753Wg5, c1718Vu0, new C1640Uu0(abstractC2038Zx3)};
        this.b = interfaceC7863wo1;
        this.c = abstractC0946LxArr;
        this.d = new Object();
    }

    public C5772lr0(Context context) {
        this.a = 1;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public C5772lr0(MediaCodec mediaCodec) {
        this.a = 26;
        this.b = mediaCodec;
        if (AbstractC0277Dh1.a < 21) {
            this.c = mediaCodec.getInputBuffers();
            this.d = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5772lr0(l lVar) {
        this(lVar.getViewModelStore(), lVar.getDefaultViewModelProviderFactory(), lVar.getDefaultViewModelCreationExtras());
        this.a = 28;
        O90.f(lVar, "owner");
    }

    public C5772lr0(InterfaceC7056sa[] interfaceC7056saArr) {
        this.a = 10;
        I01 i01 = new I01();
        S21 s21 = new S21();
        s21.c = 1.0f;
        s21.d = 1.0f;
        C6675qa c6675qa = C6675qa.e;
        s21.e = c6675qa;
        s21.f = c6675qa;
        s21.g = c6675qa;
        s21.h = c6675qa;
        ByteBuffer byteBuffer = InterfaceC7056sa.a;
        s21.k = byteBuffer;
        s21.l = byteBuffer.asShortBuffer();
        s21.m = byteBuffer;
        s21.b = -1;
        InterfaceC7056sa[] interfaceC7056saArr2 = new InterfaceC7056sa[interfaceC7056saArr.length + 2];
        this.b = interfaceC7056saArr2;
        System.arraycopy(interfaceC7056saArr, 0, interfaceC7056saArr2, 0, interfaceC7056saArr.length);
        this.c = i01;
        this.d = s21;
        interfaceC7056saArr2[interfaceC7056saArr.length] = i01;
        interfaceC7056saArr2[interfaceC7056saArr.length + 1] = s21;
    }

    public C5772lr0(C1562Tu0 c1562Tu0) {
        this.a = 3;
        this.a = 3;
        this.b = c1562Tu0;
        this.c = Choreographer.getInstance();
        this.d = new ChoreographerFrameCallbackC4278i5(0, this);
    }

    public C5772lr0(C4067h c4067h) {
        this.a = 6;
        this.b = c4067h;
        int i = Build.VERSION.SDK_INT;
        Context context = c4067h.a;
        this.c = i >= 29 ? AbstractC0509Gh.b(context) : null;
        this.d = i <= 29 ? new C0481Fx1(context) : null;
    }

    public C5772lr0(AppInfo appInfo, ComponentName componentName, IInterface iInterface) {
        this.a = 5;
        O90.f(componentName, "componentName");
        this.b = appInfo;
        this.c = componentName;
        this.d = iInterface;
    }

    public C5772lr0(EO eo, J11 j11, HO ho) {
        this.a = 12;
        this.d = eo;
        this.c = j11;
        this.b = ho;
    }
}
