package defpackage;

import android.R;
import android.animation.Animator;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ImageDecoder;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.manager.a;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class CC0 implements PZ, WC, InterfaceC0131Bl, InterfaceC6151nq0, OR0, InterfaceC0846Kp0, PL, InterfaceC1009Ms, InterfaceC7077sh, InterfaceC6187o11 {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final String[] e = {"", "_bold", "_italic", "_bold_italic"};
    public static final String[] f = {".ttf", ".otf"};
    public static CC0 g;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ CC0(int i, boolean z) {
        this.a = i;
    }

    public static CC0 H0(Context context) throws IOException {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
            } catch (IOException | Error | OverlappingFileLockException unused) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused2) {
            channel = null;
            fileLockLock = null;
        }
        try {
            return new CC0(channel, 10, fileLockLock);
        } catch (IOException | Error | OverlappingFileLockException unused3) {
            if (fileLockLock != null) {
                try {
                    fileLockLock.release();
                } catch (IOException unused4) {
                }
            }
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException unused5) {
                }
            }
            return null;
        }
    }

    public static C0733Jd1 J0(List list) {
        return list.isEmpty() ? C0733Jd1.c : new C0733Jd1(list);
    }

    public static C3705f5 K0(ImageDecoder.Source source, int i, int i2, C0795Jy0 c0795Jy0) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C6805rG(i, i2, c0795Jy0));
        if (H1.v(drawableDecodeDrawable)) {
            return new C3705f5(0, H1.f(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + drawableDecodeDrawable);
    }

    public static boolean b1(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            AbstractC3393dS.u("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        AbstractC3393dS.u("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean A(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.w(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC6689qe1 A0(InterfaceC0974Mg0 interfaceC0974Mg0, int i) {
        return US1.l(interfaceC0974Mg0, i);
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 B(AbstractC3405dW abstractC3405dW) {
        return US1.J(abstractC3405dW);
    }

    @Override // defpackage.InterfaceC7077sh
    public void B0() {
        byte[] bArr = AbstractC0277Dh1.f;
        C4103hA0 c4103hA0 = (C4103hA0) this.c;
        c4103hA0.getClass();
        c4103hA0.E(bArr.length, bArr);
    }

    @Override // defpackage.InterfaceC1009Ms
    public Set C(Z01 z01) {
        return US1.P(this, z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean D(Z01 z01) {
        return US1.x(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC1521Tg1 D0(Z01 z01, Z01 z012) {
        return US1.k(this, z01, z012);
    }

    @Override // defpackage.InterfaceC0846Kp0
    public void E(int i, C0456Fp0 c0456Fp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0) {
        Pair pairV0 = V0(i, c0456Fp0);
        if (pairV0 != null) {
            ((R71) ((C1547Tp0) this.c).j).c(new RunnableC1235Pp0(this, pairV0, c4020gk0, c7102sp0, 2));
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public InterfaceC0974Mg0 E0(InterfaceC0974Mg0 interfaceC0974Mg0) {
        return US1.W(this, interfaceC0974Mg0);
    }

    @Override // defpackage.InterfaceC1009Ms
    public EnumC5386jq F(InterfaceC6532pq interfaceC6532pq) {
        return US1.j(interfaceC6532pq);
    }

    @Override // defpackage.OR0
    public Set F0() {
        HashSet hashSet = new HashSet();
        S0((o) this.b, hashSet);
        return hashSet;
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 G(C6618qH c6618qH) {
        return US1.M(c6618qH);
    }

    @Override // defpackage.InterfaceC1009Ms
    public C6618qH G0(Z01 z01) {
        return US1.e(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean H(InterfaceC0974Mg0 interfaceC0974Mg0) {
        O90.f(interfaceC0974Mg0, "<this>");
        X01 x01G = US1.g(interfaceC0974Mg0);
        return (x01G != null ? US1.e(x01G) : null) != null;
    }

    @Override // defpackage.InterfaceC1009Ms
    public void I(Z01 z01) {
        US1.H(z01);
    }

    public CC0 I0(Object obj, String str) {
        O90.f(obj, "value");
        String string = obj.toString();
        ((ArrayList) this.c).add(str + ": " + string);
        return this;
    }

    @Override // defpackage.InterfaceC1009Ms
    public C0931Ls J(Z01 z01) {
        return US1.R(this, z01);
    }

    @Override // defpackage.InterfaceC0846Kp0
    public void K(int i, C0456Fp0 c0456Fp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0, IOException iOException, boolean z) {
        Pair pairV0 = V0(i, c0456Fp0);
        if (pairV0 != null) {
            ((R71) ((C1547Tp0) this.c).j).c(new RunnableC0690Ip0(this, pairV0, c4020gk0, c7102sp0, iOException, z, 1));
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 L(Z01 z01, boolean z) {
        return US1.X(z01, z);
    }

    public void L0(WD wd) {
        synchronized (wd) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new RunnableC7247ta(this, wd, 1));
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public EnumC0346Ee1 M(AbstractC6689qe1 abstractC6689qe1) {
        return US1.p(abstractC6689qe1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public ArrayList M0() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        C0136Bm1 c0136Bm1 = (C0136Bm1) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) c0136Bm1.b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Objects.toString(cls);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C0863Kv(0, (String) it.next()));
        }
        return arrayList2;
    }

    @Override // defpackage.PL
    public void N(int i, C0456Fp0 c0456Fp0) {
        Pair pairV0 = V0(i, c0456Fp0);
        if (pairV0 != null) {
            ((R71) ((C1547Tp0) this.c).j).c(new RunnableC1157Op0(this, pairV0, 2));
        }
    }

    public C1204Pf N0() {
        S20 s20 = new S20(23);
        Context context = (Context) this.b;
        C1204Pf c1204Pf = (C1204Pf) this.c;
        return new C1204Pf(4, new InterfaceC5303jO0[]{s20, new VY(context, c1204Pf), new C0240Cv0(20), new C0318Dv0(20), new S20(23), new ES1(context, c1204Pf, false, 6)});
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean O(Z01 z01) {
        O90.f(z01, "<this>");
        return US1.z(US1.U(z01));
    }

    public C0777Js0 O0(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        C4139hM0 c4139hM0 = new C4139hM0();
        c4139hM0.a = new ArrayList();
        List<InterfaceC8275yz0> list = (List) this.b;
        for (InterfaceC8275yz0 interfaceC8275yz0 : list) {
            arrayList.addAll(interfaceC8275yz0.e(reactApplicationContext));
            if (interfaceC8275yz0 instanceof ZL0) {
                c4139hM0.a.add((ZL0) interfaceC8275yz0);
            }
        }
        arrayList.add(c4139hM0);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((InterfaceC8275yz0) it.next()).c());
        }
        return new C0777Js0(arrayList, arrayList2);
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC1521Tg1 P(InterfaceC0974Mg0 interfaceC0974Mg0) {
        return US1.L(interfaceC0974Mg0);
    }

    public Bitmap P0(int i) {
        Object objPollFirst;
        C1857Xo1 c1857Xo1 = (C1857Xo1) this.c;
        synchronized (c1857Xo1) {
            C4397ij c4397ij = (C4397ij) ((SparseArray) c1857Xo1.b).get(i);
            if (c4397ij == null) {
                objPollFirst = null;
            } else {
                objPollFirst = c4397ij.c.pollFirst();
                if (((C4397ij) c1857Xo1.c) != c4397ij) {
                    c1857Xo1.L(c4397ij);
                    C4397ij c4397ij2 = (C4397ij) c1857Xo1.c;
                    if (c4397ij2 == null) {
                        c1857Xo1.c = c4397ij;
                        c1857Xo1.d = c4397ij;
                    } else {
                        c4397ij.d = c4397ij2;
                        c4397ij2.a = c4397ij;
                        c1857Xo1.c = c4397ij;
                    }
                }
            }
        }
        d1(objPollFirst);
        Bitmap bitmap = (Bitmap) objPollFirst;
        if (bitmap == null || !b1(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 Q(Z01 z01) {
        EnumC5386jq enumC5386jq = EnumC5386jq.a;
        return US1.i(z01);
    }

    public Object Q0(InterfaceC3918gC0 interfaceC3918gC0) {
        HashMap map = (HashMap) this.c;
        C2248b20 c2248b20 = (C2248b20) map.get(interfaceC3918gC0);
        if (c2248b20 == null) {
            c2248b20 = new C2248b20(interfaceC3918gC0);
            map.put(interfaceC3918gC0, c2248b20);
        } else {
            interfaceC3918gC0.a();
        }
        C2248b20 c2248b202 = c2248b20.d;
        c2248b202.c = c2248b20.c;
        c2248b20.c.d = c2248b202;
        C2248b20 c2248b203 = (C2248b20) this.b;
        c2248b20.d = c2248b203;
        C2248b20 c2248b204 = c2248b203.c;
        c2248b20.c = c2248b204;
        c2248b204.d = c2248b20;
        c2248b20.d.c = c2248b20;
        ArrayList arrayList = c2248b20.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c2248b20.b.remove(size - 1);
        }
        return null;
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC1521Tg1 R(AbstractC6689qe1 abstractC6689qe1) {
        return US1.n(abstractC6689qe1);
    }

    public CameraCharacteristics R0(String str) throws C5950mn {
        try {
            return ((CameraManager) this.b).getCameraCharacteristics(str);
        } catch (CameraAccessException e2) {
            throw new C5950mn(e2);
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public int S(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.N(interfaceC1278Qd1);
    }

    public void S0(o oVar, HashSet hashSet) {
        List listF = oVar.c.f();
        int size = listF.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) listF.get(i);
            S0(fragment.getChildFragmentManager(), hashSet);
            AbstractC0357Ei0 lifecycle = fragment.getLifecycle();
            a aVar = (a) this.c;
            aVar.getClass();
            AbstractC0121Bh1.a();
            JR0 jr0 = (JR0) aVar.a.get(lifecycle);
            if (jr0 != null) {
                hashSet.add(jr0);
            }
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean T(InterfaceC5925me1 interfaceC5925me1, InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.r(interfaceC5925me1, interfaceC1278Qd1);
    }

    public Set T0() {
        return Collections.emptySet();
    }

    @Override // defpackage.InterfaceC6151nq0
    public AbstractC8446zt U(InterfaceC4213hl interfaceC4213hl) {
        AbstractC8446zt abstractC8446ztU = ((InterfaceC6151nq0) this.b).U(interfaceC4213hl);
        InterfaceC6533pq0 interfaceC6533pq0 = (InterfaceC6533pq0) this.c;
        if (abstractC8446ztU == null) {
            interfaceC6533pq0.m(interfaceC4213hl);
        } else {
            interfaceC6533pq0.d(interfaceC4213hl);
        }
        return abstractC8446ztU;
    }

    public synchronized ArrayList U0(Class cls) {
        return ((T71) this.b).C(cls);
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 V(InterfaceC0974Mg0 interfaceC0974Mg0) {
        X01 x01V;
        O90.f(interfaceC0974Mg0, "<this>");
        AbstractC3405dW abstractC3405dWF = US1.f(interfaceC0974Mg0);
        if (abstractC3405dWF != null && (x01V = US1.V(abstractC3405dWF)) != null) {
            return x01V;
        }
        X01 x01G = US1.g(interfaceC0974Mg0);
        O90.c(x01G);
        return x01G;
    }

    public Pair V0(int i, C0456Fp0 c0456Fp0) {
        C0456Fp0 c0456Fp0A;
        C1469Sp0 c1469Sp0 = (C1469Sp0) this.b;
        C0456Fp0 c0456Fp02 = null;
        if (c0456Fp0 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= c1469Sp0.c.size()) {
                    c0456Fp0A = null;
                    break;
                }
                if (((C0456Fp0) c1469Sp0.c.get(i2)).d == c0456Fp0.d) {
                    Object obj = c1469Sp0.b;
                    int i3 = SB0.k;
                    c0456Fp0A = c0456Fp0.a(Pair.create(obj, c0456Fp0.a));
                    break;
                }
                i2++;
            }
            if (c0456Fp0A == null) {
                return null;
            }
            c0456Fp02 = c0456Fp0A;
        }
        return Pair.create(Integer.valueOf(i + c1469Sp0.d), c0456Fp02);
    }

    @Override // defpackage.InterfaceC1009Ms
    public InterfaceC1200Pd1 W(Z01 z01) {
        return US1.U(z01);
    }

    public int W0(String str) {
        int iIntValue;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        C5661lG0 c5661lG0 = new C5661lG0(13, this);
        O90.f(concurrentHashMap, "<this>");
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 == null) {
                    Object objInvoke = c5661lG0.invoke(str);
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) objInvoke).intValue()));
                    num2 = (Integer) objInvoke;
                }
                iIntValue = num2.intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean X(Z01 z01) {
        O90.f(z01, "<this>");
        X01 x01G = US1.g(z01);
        return (x01G != null ? US1.d(this, x01G) : null) != null;
    }

    public KeyListener X0(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C4332iN) ((QQ0) this.c).a).getClass();
        if (keyListener instanceof C8160yN) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C8160yN(keyListener);
    }

    @Override // defpackage.InterfaceC1009Ms
    public InterfaceC6532pq Y(Z01 z01) {
        return US1.d(this, z01);
    }

    public Long Y0(String str) {
        C6655qT0 c6655qT0A = C6655qT0.a(1, "SELECT long_value FROM Preference where `key`=?");
        c6655qT0A.d(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        workDatabase_Impl.b();
        Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
        try {
            Long lValueOf = null;
            if (cursorC.moveToFirst() && !cursorC.isNull(0)) {
                lValueOf = Long.valueOf(cursorC.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorC.close();
            c6655qT0A.release();
        }
    }

    @Override // defpackage.InterfaceC0131Bl
    public void Z(InterfaceC7089sl interfaceC7089sl, HS0 hs0) {
        O90.f(interfaceC7089sl, "call");
        Bundle bundle = new Bundle();
        IS0 is0 = hs0.g;
        bundle.putString("body", is0 != null ? is0.x() : null);
        bundle.putInt("status", hs0.d);
        bundle.putBundle("headers", WT.k((WT) this.c, hs0.f));
        hs0.close();
        ((InterfaceC7754wE0) this.b).resolve(bundle);
    }

    public Typeface Z0(String str, C7582vK0 c7582vK0, AssetManager assetManager) {
        int i;
        Typeface typefaceCreate;
        HashMap map = (HashMap) this.c;
        boolean zContainsKey = map.containsKey(str);
        int i2 = 0;
        int i3 = c7582vK0.b;
        boolean z = c7582vK0.a;
        if (zContainsKey) {
            Typeface typeface = (Typeface) map.get(str);
            if (Build.VERSION.SDK_INT >= 28) {
                return Typeface.create(typeface, i3, z);
            }
            if (i3 >= 700) {
                i2 = z ? 3 : 1;
            } else if (z) {
                i2 = 2;
            }
            return Typeface.create(typeface, i2);
        }
        HashMap map2 = (HashMap) this.b;
        C7391uK0 c7391uK0 = (C7391uK0) map2.get(str);
        if (c7391uK0 == null) {
            c7391uK0 = new C7391uK0();
            map2.put(str, c7391uK0);
        }
        if (i3 < 700) {
            i = z ? 2 : 0;
        } else {
            i = z ? 3 : 1;
        }
        Typeface typeface2 = (Typeface) c7391uK0.a.get(i);
        if (typeface2 == null) {
            String str2 = e[i];
            String[] strArr = f;
            while (true) {
                if (i2 >= 2) {
                    typefaceCreate = Typeface.create(str, i);
                    break;
                }
                try {
                    typefaceCreate = Typeface.createFromAsset(assetManager, AbstractC1705Vq.i("fonts/", str, str2, strArr[i2]));
                    break;
                } catch (RuntimeException unused) {
                    i2++;
                }
            }
            typeface2 = typefaceCreate;
            c7391uK0.a.put(i, typeface2);
        }
        return typeface2;
    }

    @Override // defpackage.InterfaceC1009Ms
    public int a(InterfaceC0974Mg0 interfaceC0974Mg0) {
        return US1.b(interfaceC0974Mg0);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean a0(Z01 z01) {
        O90.f(z01, "<this>");
        return US1.C(q0(z01)) && !US1.D(z01);
    }

    public void a1(BC0 bc0) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((UH) this.c).h(bc0);
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean b(InterfaceC6532pq interfaceC6532pq) {
        O90.f(interfaceC6532pq, "$receiver");
        return interfaceC6532pq instanceof C5577kq;
    }

    @Override // defpackage.PL
    public void b0(int i, C0456Fp0 c0456Fp0) {
        Pair pairV0 = V0(i, c0456Fp0);
        if (pairV0 != null) {
            ((R71) ((C1547Tp0) this.c).j).c(new RunnableC1157Op0(this, pairV0, 0));
        }
    }

    @Override // defpackage.PL
    public void c(int i, C0456Fp0 c0456Fp0, Exception exc) {
        Pair pairV0 = V0(i, c0456Fp0);
        if (pairV0 != null) {
            ((R71) ((C1547Tp0) this.c).j).c(new RunnableC1313Qp0(this, pairV0, exc, 0));
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC1521Tg1 c0(ArrayList arrayList) {
        X01 x01;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (AbstractC1521Tg1) AbstractC8069xu.R(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC1521Tg1 abstractC1521Tg1 = (AbstractC1521Tg1) it.next();
            z = z || S8.b(abstractC1521Tg1);
            if (abstractC1521Tg1 instanceof X01) {
                x01 = (X01) abstractC1521Tg1;
            } else {
                if (!(abstractC1521Tg1 instanceof AbstractC3405dW)) {
                    throw new C7074sg();
                }
                O90.f(abstractC1521Tg1, "<this>");
                x01 = ((AbstractC3405dW) abstractC1521Tg1).b;
                z2 = true;
            }
            arrayList2.add(x01);
        }
        if (z) {
            return C5496kP.c(EnumC5305jP.x, arrayList.toString());
        }
        C5352je1 c5352je1 = C5352je1.a;
        if (!z2) {
            return c5352je1.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC4075h12.j((AbstractC1521Tg1) it2.next()));
        }
        return NV1.t(c5352je1.b(arrayList2), c5352je1.b(arrayList3));
    }

    public void c1(AttributeSet attributeSet, int i) {
        switch (this.a) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
                C1857Xo1 c1857Xo1J = C1857Xo1.J(absSeekBar.getContext(), attributeSet, d, i);
                Drawable drawableD = c1857Xo1J.D(0);
                if (drawableD != null) {
                    if (drawableD instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableD;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableN1 = n1(animationDrawable.getFrame(i2), true);
                            drawableN1.setLevel(10000);
                            animationDrawable2.addFrame(drawableN1, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableD = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableD);
                }
                Drawable drawableD2 = c1857Xo1J.D(1);
                if (drawableD2 != null) {
                    absSeekBar.setProgressDrawable(n1(drawableD2, false));
                }
                c1857Xo1J.M();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, AbstractC2104aH0.i, i, 0);
                try {
                    boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    m1(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    @Override // defpackage.InterfaceC0846Kp0
    public void d(int i, C0456Fp0 c0456Fp0, C7102sp0 c7102sp0) {
        Pair pairV0 = V0(i, c0456Fp0);
        if (pairV0 != null) {
            ((R71) ((C1547Tp0) this.c).j).c(new RunnableC1079Np0(this, pairV0, c7102sp0, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x011c A[EDGE_INSN: B:141:0x011c->B:123:0x011c BREAK  A[LOOP:1: B:109:0x00e3->B:122:0x010b], SYNTHETIC] */
    @Override // defpackage.InterfaceC7077sh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.C6886rh d0(defpackage.C7566vF r17, long r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CC0.d0(vF, long):rh");
    }

    public void d1(Object obj) {
        if (obj != null) {
            synchronized (this) {
                ((HashSet) this.b).remove(obj);
            }
        }
    }

    @Override // defpackage.InterfaceC6151nq0
    public boolean e(EE ee) {
        return ((InterfaceC6151nq0) this.b).e(ee);
    }

    @Override // defpackage.InterfaceC6187o11
    public void e0(KK kk) {
        ((InterfaceC6187o11) this.b).e0(kk);
    }

    public C7590vN e1(InputConnection inputConnection, EditorInfo editorInfo) {
        QQ0 qq0 = (QQ0) this.c;
        if (inputConnection == null) {
            qq0.getClass();
            inputConnection = null;
        } else {
            C4332iN c4332iN = (C4332iN) qq0.a;
            c4332iN.getClass();
            if (!(inputConnection instanceof C7590vN)) {
                inputConnection = new C7590vN((EditText) c4332iN.b, inputConnection, editorInfo);
            }
        }
        return (C7590vN) inputConnection;
    }

    @Override // defpackage.InterfaceC0846Kp0
    public void f(int i, C0456Fp0 c0456Fp0, C7102sp0 c7102sp0) {
        Pair pairV0 = V0(i, c0456Fp0);
        if (pairV0 != null) {
            ((R71) ((C1547Tp0) this.c).j).c(new RunnableC1079Np0(this, pairV0, c7102sp0, 0));
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public C6962s41 f0(InterfaceC0974Mg0 interfaceC0974Mg0) {
        return US1.h(interfaceC0974Mg0);
    }

    public void f1(String str, ExecutorC5715lY0 executorC5715lY0, CameraDevice.StateCallback stateCallback) {
        executorC5715lY0.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.b).openCamera(str, new C7665vm(executorC5715lY0, stateCallback), (Handler) ((N8) this.c).c);
        } catch (CameraAccessException e2) {
            throw new C5950mn(e2);
        }
    }

    @Override // defpackage.InterfaceC6151nq0
    public int g(OU ou) {
        return ((InterfaceC6151nq0) this.b).g(ou);
    }

    @Override // defpackage.InterfaceC1009Ms
    public InterfaceC5925me1 g0(InterfaceC1278Qd1 interfaceC1278Qd1, int i) {
        return US1.m(interfaceC1278Qd1, i);
    }

    public Object g1() {
        Object obj;
        C1857Xo1 c1857Xo1 = (C1857Xo1) this.c;
        synchronized (c1857Xo1) {
            C4397ij c4397ij = (C4397ij) c1857Xo1.d;
            if (c4397ij == null) {
                obj = null;
            } else {
                Object objPollLast = c4397ij.c.pollLast();
                if (c4397ij.c.isEmpty()) {
                    c1857Xo1.L(c4397ij);
                    ((SparseArray) c1857Xo1.b).remove(c4397ij.b);
                }
                obj = objPollLast;
            }
        }
        d1(obj);
        return obj;
    }

    @Override // defpackage.InterfaceC1009Ms
    public int h(InterfaceC0655Id1 interfaceC0655Id1) {
        O90.f(interfaceC0655Id1, "<this>");
        if (interfaceC0655Id1 instanceof Z01) {
            return US1.b((InterfaceC0974Mg0) interfaceC0655Id1);
        }
        if (interfaceC0655Id1 instanceof C5636l8) {
            return ((C5636l8) interfaceC0655Id1).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC0655Id1 + ", " + BP0.a.b(interfaceC0655Id1.getClass())).toString());
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean h0(InterfaceC1278Qd1 interfaceC1278Qd1, InterfaceC1278Qd1 interfaceC1278Qd12) {
        O90.f(interfaceC1278Qd1, "c1");
        O90.f(interfaceC1278Qd12, "c2");
        if (!(interfaceC1278Qd1 instanceof InterfaceC1200Pd1)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(interfaceC1278Qd12 instanceof InterfaceC1200Pd1)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!US1.a(interfaceC1278Qd1, interfaceC1278Qd12)) {
            InterfaceC1200Pd1 interfaceC1200Pd1 = (InterfaceC1200Pd1) interfaceC1278Qd1;
            InterfaceC1200Pd1 interfaceC1200Pd12 = (InterfaceC1200Pd1) interfaceC1278Qd12;
            if (!((InterfaceC0741Jg0) this.c).K(interfaceC1200Pd1, interfaceC1200Pd12)) {
                HashMap map = (HashMap) this.b;
                if (map != null) {
                    InterfaceC1200Pd1 interfaceC1200Pd13 = (InterfaceC1200Pd1) map.get(interfaceC1200Pd1);
                    InterfaceC1200Pd1 interfaceC1200Pd14 = (InterfaceC1200Pd1) map.get(interfaceC1200Pd12);
                    if ((interfaceC1200Pd13 == null || !interfaceC1200Pd13.equals(interfaceC1200Pd12)) && (interfaceC1200Pd14 == null || !interfaceC1200Pd14.equals(interfaceC1200Pd1))) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public void h1(InterfaceC3918gC0 interfaceC3918gC0, Object obj) {
        HashMap map = (HashMap) this.c;
        C2248b20 c2248b20 = (C2248b20) map.get(interfaceC3918gC0);
        if (c2248b20 == null) {
            c2248b20 = new C2248b20(interfaceC3918gC0);
            c2248b20.d = c2248b20;
            C2248b20 c2248b202 = (C2248b20) this.b;
            c2248b20.d = c2248b202.d;
            c2248b20.c = c2248b202;
            c2248b202.d = c2248b20;
            c2248b20.d.c = c2248b20;
            map.put(interfaceC3918gC0, c2248b20);
        } else {
            interfaceC3918gC0.a();
        }
        if (c2248b20.b == null) {
            c2248b20.b = new ArrayList();
        }
        c2248b20.b.add(obj);
    }

    @Override // defpackage.InterfaceC1009Ms
    public InterfaceC0655Id1 i(Z01 z01) {
        return US1.c(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean i0(Z01 z01, Z01 z012) {
        return US1.s(z01, z012);
    }

    public void i1(Object obj) {
        boolean zAdd;
        Bitmap bitmap = (Bitmap) obj;
        O90.f(bitmap, "bitmap");
        if (b1(bitmap)) {
            synchronized (this) {
                zAdd = ((HashSet) this.b).add(bitmap);
            }
            if (zAdd) {
                ((C1857Xo1) this.c).O(AbstractC6699qi.d(bitmap), bitmap);
            }
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public void j(InterfaceC0974Mg0 interfaceC0974Mg0) {
        O90.f(interfaceC0974Mg0, "<this>");
        US1.f(interfaceC0974Mg0);
    }

    @Override // defpackage.InterfaceC6151nq0
    public AbstractC8446zt j0(InterfaceC4213hl interfaceC4213hl, AbstractC8446zt abstractC8446zt) {
        ((InterfaceC6533pq0) this.c).v(interfaceC4213hl);
        return ((InterfaceC6151nq0) this.b).j0(interfaceC4213hl, abstractC8446zt);
    }

    public void j1(ExecutorC5715lY0 executorC5715lY0, C7855wm c7855wm) {
        C7861wo c7861wo;
        N8 n8 = (N8) this.c;
        synchronized (((HashMap) n8.b)) {
            try {
                c7861wo = (C7861wo) ((HashMap) n8.b).get(c7855wm);
                if (c7861wo == null) {
                    c7861wo = new C7861wo(executorC5715lY0, c7855wm);
                    ((HashMap) n8.b).put(c7855wm, c7861wo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((CameraManager) this.b).registerAvailabilityCallback(c7861wo, (Handler) n8.c);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean k(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.A(interfaceC1278Qd1);
    }

    @Override // defpackage.PL
    public void k0(int i, C0456Fp0 c0456Fp0) {
        Pair pairV0 = V0(i, c0456Fp0);
        if (pairV0 != null) {
            ((R71) ((C1547Tp0) this.c).j).c(new RunnableC1157Op0(this, pairV0, 1));
        }
    }

    public void k1() throws IOException {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.PL
    public void l(int i, C0456Fp0 c0456Fp0, int i2) {
        Pair pairV0 = V0(i, c0456Fp0);
        if (pairV0 != null) {
            ((R71) ((C1547Tp0) this.c).j).c(new RunnableC6690qf(this, pairV0, i2, 11));
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean l0(InterfaceC0974Mg0 interfaceC0974Mg0) {
        O90.f(interfaceC0974Mg0, "$receiver");
        return interfaceC0974Mg0 instanceof C1487Sv0;
    }

    public Object l1() {
        C2248b20 c2248b20 = (C2248b20) this.b;
        C2248b20 c2248b202 = c2248b20.d;
        while (true) {
            if (c2248b202.equals(c2248b20)) {
                return null;
            }
            ArrayList arrayList = c2248b202.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c2248b202.b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C2248b20 c2248b203 = c2248b202.d;
            c2248b203.c = c2248b202.c;
            c2248b202.c.d = c2248b203;
            HashMap map = (HashMap) this.c;
            InterfaceC3918gC0 interfaceC3918gC0 = c2248b202.a;
            map.remove(interfaceC3918gC0);
            interfaceC3918gC0.a();
            c2248b202 = c2248b202.d;
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public void m(Z01 z01) {
        US1.I(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean m0(Z01 z01) {
        return US1.B(z01);
    }

    public void m1(boolean z) {
        CN cn = (CN) ((C4332iN) ((QQ0) this.c).a).c;
        if (cn.c != z) {
            if (cn.b != null) {
                EmojiCompat.get().unregisterInitCallback(cn.b);
            }
            cn.c = z;
            if (z) {
                CN.a(cn.a, EmojiCompat.get().getLoadState());
            }
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public C6548pv0 n(InterfaceC6532pq interfaceC6532pq) {
        return US1.T(interfaceC6532pq);
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC6689qe1 n0(Z01 z01, int i) {
        O90.f(z01, "<this>");
        if (i < 0 || i >= US1.b(z01)) {
            return null;
        }
        return US1.l(z01, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable n1(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC3845fp1) {
            ((AbstractC4036gp1) ((InterfaceC3845fp1) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = n1(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.c) == null) {
                    this.c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    @Override // defpackage.InterfaceC0846Kp0
    public void o(int i, C0456Fp0 c0456Fp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0) {
        Pair pairV0 = V0(i, c0456Fp0);
        if (pairV0 != null) {
            ((R71) ((C1547Tp0) this.c).j).c(new RunnableC1235Pp0(this, pairV0, c4020gk0, c7102sp0, 1));
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean o0(AbstractC6689qe1 abstractC6689qe1) {
        return US1.G(abstractC6689qe1);
    }

    public void o1(CameraManager.AvailabilityCallback availabilityCallback) {
        C7861wo c7861wo;
        if (availabilityCallback != null) {
            N8 n8 = (N8) this.c;
            synchronized (((HashMap) n8.b)) {
                c7861wo = (C7861wo) ((HashMap) n8.b).remove(availabilityCallback);
            }
        } else {
            c7861wo = null;
        }
        if (c7861wo != null) {
            c7861wo.a();
        }
        ((CameraManager) this.b).unregisterAvailabilityCallback(c7861wo);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [Vg0, nZ] */
    @Override // defpackage.InterfaceC6187o11
    public void onError(Throwable th) {
        Throwable c0254Da;
        O90.f(th, "e");
        try {
            c0254Da = (Throwable) ((C4265i11) this.c).c.invoke(th);
        } catch (Throwable th2) {
            c0254Da = new C0254Da(3, I02.e(th2), (Throwable) J8.o(new Throwable[]{th}));
        }
        ((InterfaceC6187o11) this.b).onError(c0254Da);
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        C8194yY0 c8194yY0;
        if (!(th instanceof C4123hH)) {
            if (th instanceof CancellationException) {
                ((C0212Cm) this.c).u("Unable to configure camera cancelled");
                return;
            }
            if (((C0212Cm) this.c).L == 9) {
                ((C0212Cm) this.c).G(9, new C0026Ac(4, th), true);
            }
            Objects.toString((C0212Cm) this.c);
            AbstractC0759Jm0.f("Camera2CameraImpl");
            C0212Cm c0212Cm = (C0212Cm) this.c;
            if (c0212Cm.l == ((InterfaceC4228hq) this.b)) {
                c0212Cm.E();
                return;
            }
            return;
        }
        C0212Cm c0212Cm2 = (C0212Cm) this.c;
        AbstractC4314iH abstractC4314iH = ((C4123hH) th).a;
        Iterator it = c0212Cm2.a.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                c8194yY0 = null;
                break;
            } else {
                c8194yY0 = (C8194yY0) it.next();
                if (c8194yY0.b().contains(abstractC4314iH)) {
                    break;
                }
            }
        }
        if (c8194yY0 != null) {
            C0212Cm c0212Cm3 = (C0212Cm) this.c;
            c0212Cm3.getClass();
            C20 c20H = QR1.h();
            InterfaceC7814wY0 interfaceC7814wY0 = c8194yY0.f;
            if (interfaceC7814wY0 != null) {
                new Throwable();
                c0212Cm3.u("Posting surface closed");
                c20H.execute(new RunnableC6769r4(interfaceC7814wY0, 20, c8194yY0));
            }
        }
    }

    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 7:
                C0212Cm c0212Cm = (C0212Cm) this.c;
                if (c0212Cm.s.a == 2 && c0212Cm.L == 9) {
                    ((C0212Cm) this.c).F(10);
                    break;
                }
                break;
            default:
                ((InterfaceC6187o11) this.b).onSuccess(obj);
                break;
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public EnumC0346Ee1 p(InterfaceC5925me1 interfaceC5925me1) {
        O90.f(interfaceC5925me1, "$receiver");
        EnumC4015gi1 enumC4015gi1O = interfaceC5925me1.O();
        O90.e(enumC4015gi1O, "getVariance(...)");
        return AZ1.a(enumC4015gi1O);
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC3405dW p0(InterfaceC0974Mg0 interfaceC0974Mg0) {
        return US1.f(interfaceC0974Mg0);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean q(Z01 z01) {
        O90.f(z01, "<this>");
        return US1.u(US1.U(z01));
    }

    @Override // defpackage.InterfaceC1009Ms
    public InterfaceC1200Pd1 q0(InterfaceC0974Mg0 interfaceC0974Mg0) {
        O90.f(interfaceC0974Mg0, "<this>");
        X01 x01G = US1.g(interfaceC0974Mg0);
        if (x01G == null) {
            x01G = x(interfaceC0974Mg0);
        }
        return US1.U(x01G);
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 r(InterfaceC0974Mg0 interfaceC0974Mg0) {
        return US1.g(interfaceC0974Mg0);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean r0(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.z(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC6689qe1 s(InterfaceC5959mq interfaceC5959mq) {
        return US1.Q(interfaceC5959mq);
    }

    @Override // defpackage.WC
    public ZC s0() {
        return new C2478cF((Context) this.b, ((InterfaceC6770r40) this.c).s0());
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean t(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.u(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean t0(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.t(interfaceC1278Qd1);
    }

    public String toString() {
        switch (this.a) {
            case 16:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C2248b20 c2248b20 = (C2248b20) this.b;
                C2248b20 c2248b202 = c2248b20.c;
                boolean z = false;
                while (!c2248b202.equals(c2248b20)) {
                    sb.append('{');
                    sb.append(c2248b202.a);
                    sb.append(':');
                    ArrayList arrayList = c2248b202.b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c2248b202 = c2248b202.c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean u(AbstractC1521Tg1 abstractC1521Tg1) {
        O90.f(abstractC1521Tg1, "<this>");
        return US1.B(x(abstractC1521Tg1)) != US1.B(V(abstractC1521Tg1));
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean u0(InterfaceC6532pq interfaceC6532pq) {
        return US1.F(interfaceC6532pq);
    }

    @Override // defpackage.InterfaceC0846Kp0
    public void v(int i, C0456Fp0 c0456Fp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0) {
        Pair pairV0 = V0(i, c0456Fp0);
        if (pairV0 != null) {
            ((R71) ((C1547Tp0) this.c).j).c(new RunnableC1235Pp0(this, pairV0, c4020gk0, c7102sp0, 0));
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean v0(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.C(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 w(AbstractC3405dW abstractC3405dW) {
        return US1.V(abstractC3405dW);
    }

    @Override // defpackage.InterfaceC0131Bl
    public void w0(InterfaceC7089sl interfaceC7089sl, IOException iOException) {
        O90.f(interfaceC7089sl, "call");
        if (((DN0) interfaceC7089sl).o) {
            ((InterfaceC7754wE0) this.b).resolve(null);
            return;
        }
        String str = XT.a;
        iOException.getMessage();
        ((InterfaceC7754wE0) this.b).reject(str, iOException.getMessage(), iOException);
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 x(InterfaceC0974Mg0 interfaceC0974Mg0) {
        X01 x01J;
        O90.f(interfaceC0974Mg0, "<this>");
        AbstractC3405dW abstractC3405dWF = US1.f(interfaceC0974Mg0);
        if (abstractC3405dWF != null && (x01J = US1.J(abstractC3405dWF)) != null) {
            return x01J;
        }
        X01 x01G = US1.g(interfaceC0974Mg0);
        O90.c(x01G);
        return x01G;
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC6689qe1 x0(InterfaceC0655Id1 interfaceC0655Id1, int i) {
        O90.f(interfaceC0655Id1, "<this>");
        if (interfaceC0655Id1 instanceof Z01) {
            return US1.l((InterfaceC0974Mg0) interfaceC0655Id1, i);
        }
        if (interfaceC0655Id1 instanceof C5636l8) {
            Object obj = ((C5636l8) interfaceC0655Id1).get(i);
            O90.e(obj, "get(...)");
            return (AbstractC6689qe1) obj;
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC0655Id1 + ", " + BP0.a.b(interfaceC0655Id1.getClass())).toString());
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC1521Tg1 y(InterfaceC6532pq interfaceC6532pq) {
        return US1.K(interfaceC6532pq);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean y0(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.v(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public Collection z(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.S(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public Z01 z0(Z01 z01) {
        X01 x01M;
        O90.f(z01, "<this>");
        C6618qH c6618qHE = US1.e(z01);
        return (c6618qHE == null || (x01M = US1.M(c6618qHE)) == null) ? z01 : x01M;
    }

    public /* synthetic */ CC0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ CC0(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public CC0(HashMap map, InterfaceC0741Jg0 interfaceC0741Jg0) {
        this.a = 22;
        O90.f(interfaceC0741Jg0, "equalityAxioms");
        this.b = map;
        this.c = interfaceC0741Jg0;
    }

    public CC0(String str) {
        this.a = 28;
        this.b = str;
        this.c = new ArrayList();
    }

    public CC0(BridgeReactContext bridgeReactContext) {
        this.a = 21;
        this.c = new HashMap();
        this.b = bridgeReactContext;
    }

    public CC0(Context context) {
        this.a = 12;
        this.b = context;
        C1204Pf c1204Pf = new C1204Pf(0, (byte) 0);
        this.c = c1204Pf;
        c1204Pf.r(context.getApplicationInfo().sourceDir);
    }

    public CC0(C1857Xo1 c1857Xo1) {
        this.a = 20;
        C0396Ev0 c0396Ev0 = T71.e;
        T71 t71 = new T71();
        t71.a = new ArrayList();
        t71.c = new HashSet();
        t71.d = c1857Xo1;
        t71.b = c0396Ev0;
        OB ob = new OB();
        ob.a = new HashMap();
        this.c = ob;
        this.b = t71;
    }

    public CC0(WorkDatabase_Impl workDatabase_Impl) {
        this.a = 0;
        this.b = workDatabase_Impl;
        this.c = new UH(workDatabase_Impl, 2);
    }

    public CC0(Context context, N8 n8) {
        this.a = 8;
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = n8;
    }

    public CC0(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = new HashSet();
                this.c = new C1857Xo1(6);
                break;
            case 16:
                this.b = new C2248b20(null);
                this.c = new HashMap();
                break;
            case 29:
                this.b = new ConcurrentHashMap();
                this.c = new AtomicInteger(0);
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public void C0(Z01 z01, InterfaceC1278Qd1 interfaceC1278Qd1) {
    }

    public CC0(AbsSeekBar absSeekBar) {
        this.a = 1;
        this.b = absSeekBar;
    }

    public CC0(EditText editText) {
        this.a = 4;
        this.b = editText;
        QQ0 qq0 = new QQ0();
        qq0.a = new C4332iN(editText);
        this.c = qq0;
    }

    public CC0(C0724Ja1 c0724Ja1) {
        this.a = 23;
        this.b = c0724Ja1;
        this.c = new C4103hA0();
    }

    public CC0(Context context, InterfaceC6770r40 interfaceC6770r40) {
        this.a = 11;
        this.b = context.getApplicationContext();
        this.c = interfaceC6770r40;
    }

    public CC0(Animation animation) {
        this.a = 15;
        this.b = animation;
        this.c = null;
    }

    public CC0(Animator animator) {
        this.a = 15;
        this.b = null;
        this.c = animator;
    }
}
