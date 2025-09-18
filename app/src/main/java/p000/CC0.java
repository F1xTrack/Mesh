package p000;

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
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.Fragment;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.manager.C1876a;
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
public class CC0 implements InterfaceC0980PZ, InterfaceC1397WC, InterfaceC0111Bl, InterfaceC10443nq0, OR0, InterfaceC7864Kp0, InterfaceC0966PL, InterfaceC0810Ms, InterfaceC6839sh, InterfaceC10467o11 {

    /* renamed from: d */
    public static final int[] f1245d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: e */
    public static final String[] f1246e = {"", "_bold", "_italic", "_bold_italic"};

    /* renamed from: f */
    public static final String[] f1247f = {".ttf", ".otf"};

    /* renamed from: g */
    public static CC0 f1248g;

    /* renamed from: a */
    public final /* synthetic */ int f1249a;

    /* renamed from: b */
    public Object f1250b;

    /* renamed from: c */
    public Object f1251c;

    public /* synthetic */ CC0(int i, boolean z) {
        this.f1249a = i;
    }

    /* renamed from: H0 */
    public static CC0 m1004H0(Context context) throws IOException {
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

    /* renamed from: J0 */
    public static C7789Jd1 m1005J0(List list) {
        return list.isEmpty() ? C7789Jd1.f5653c : new C7789Jd1(list);
    }

    /* renamed from: K0 */
    public static C4031f5 m1006K0(ImageDecoder.Source source, int i, int i2, C7830Jy0 c7830Jy0) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C6732rG(i, i2, c7830Jy0));
        if (AbstractC0443H1.m3235v(drawableDecodeDrawable)) {
            return new C4031f5(0, AbstractC0443H1.m3219f(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + drawableDecodeDrawable);
    }

    /* renamed from: b1 */
    public static boolean m1007b1(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            AbstractC3929dS.m17688u("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        AbstractC3929dS.m17688u("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: A */
    public boolean mo1008A(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8063w(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: A0 */
    public AbstractC10804qe1 mo1009A0(InterfaceC7950Mg0 interfaceC7950Mg0, int i) {
        return US1.m8052l(interfaceC7950Mg0, i);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: B */
    public X01 mo1010B(AbstractC3933dW abstractC3933dW) {
        return US1.m8026J(abstractC3933dW);
    }

    @Override // p000.InterfaceC6839sh
    /* renamed from: B0 */
    public void mo1011B0() {
        byte[] bArr = AbstractC7485Dh1.f2171f;
        C9591hA0 c9591hA0 = (C9591hA0) this.f1251c;
        c9591hA0.getClass();
        c9591hA0.m18739E(bArr.length, bArr);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: C */
    public Set mo1012C(Z01 z01) {
        return US1.m8032P(this, z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: D */
    public boolean mo1014D(Z01 z01) {
        return US1.m8064x(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: D0 */
    public AbstractC8315Tg1 mo1015D0(Z01 z01, Z01 z012) {
        return US1.m8051k(this, z01, z012);
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: E */
    public void mo1016E(int i, C7604Fp0 c7604Fp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0) {
        Pair pairM1046V0 = m1046V0(i, c7604Fp0);
        if (pairM1046V0 != null) {
            ((R71) ((C8332Tp0) this.f1251c).f11545j).m6905c(new RunnableC8124Pp0(this, pairM1046V0, c9535gk0, c11081sp0, 2));
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: E0 */
    public InterfaceC7950Mg0 mo1017E0(InterfaceC7950Mg0 interfaceC7950Mg0) {
        return US1.m8039W(this, interfaceC7950Mg0);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: F */
    public EnumC6262jq mo1018F(InterfaceC6642pq interfaceC6642pq) {
        return US1.m8050j(interfaceC6642pq);
    }

    @Override // p000.OR0
    /* renamed from: F0 */
    public Set mo53F0() {
        HashSet hashSet = new HashSet();
        m1041S0((AbstractC1733o) this.f1250b, hashSet);
        return hashSet;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: G */
    public X01 mo1019G(C6670qH c6670qH) {
        return US1.m8029M(c6670qH);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: G0 */
    public C6670qH mo1020G0(Z01 z01) {
        return US1.m8045e(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: H */
    public boolean mo1021H(InterfaceC7950Mg0 interfaceC7950Mg0) {
        O90.m5968f(interfaceC7950Mg0, "<this>");
        X01 x01M8047g = US1.m8047g(interfaceC7950Mg0);
        return (x01M8047g != null ? US1.m8045e(x01M8047g) : null) != null;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: I */
    public void mo1022I(Z01 z01) {
        US1.m8024H(z01);
    }

    /* renamed from: I0 */
    public CC0 m1023I0(Object obj, String str) {
        O90.m5968f(obj, "value");
        String string = obj.toString();
        ((ArrayList) this.f1251c).add(str + ": " + string);
        return this;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: J */
    public C0747Ls mo1024J(Z01 z01) {
        return US1.m8034R(this, z01);
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: K */
    public void mo1025K(int i, C7604Fp0 c7604Fp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0, IOException iOException, boolean z) {
        Pair pairM1046V0 = m1046V0(i, c7604Fp0);
        if (pairM1046V0 != null) {
            ((R71) ((C8332Tp0) this.f1251c).f11545j).m6905c(new RunnableC7760Ip0(this, pairM1046V0, c9535gk0, c11081sp0, iOException, z, 1));
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: L */
    public X01 mo1026L(Z01 z01, boolean z) {
        return US1.m8040X(z01, z);
    }

    /* renamed from: L0 */
    public void m1027L0(C1398WD c1398wd) {
        synchronized (c1398wd) {
        }
        Handler handler = (Handler) this.f1250b;
        if (handler != null) {
            handler.post(new RunnableC6895ta(this, c1398wd, 1));
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: M */
    public EnumC7531Ee1 mo1028M(AbstractC10804qe1 abstractC10804qe1) {
        return US1.m8056p(abstractC10804qe1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* renamed from: M0 */
    public ArrayList m1029M0() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        C7391Bm1 c7391Bm1 = (C7391Bm1) this.f1251c;
        Context context = (Context) this.f1250b;
        Class cls = (Class) c7391Bm1.f1022b;
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
            arrayList2.add(new C0688Kv(0, (String) it.next()));
        }
        return arrayList2;
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: N */
    public void mo1030N(int i, C7604Fp0 c7604Fp0) {
        Pair pairM1046V0 = m1046V0(i, c7604Fp0);
        if (pairM1046V0 != null) {
            ((R71) ((C8332Tp0) this.f1251c).f11545j).m6905c(new RunnableC8072Op0(this, pairM1046V0, 2));
        }
    }

    /* renamed from: N0 */
    public C0986Pf m1031N0() {
        S20 s20 = new S20(23);
        Context context = (Context) this.f1250b;
        C0986Pf c0986Pf = (C0986Pf) this.f1251c;
        return new C0986Pf(4, new InterfaceC9875jO0[]{s20, new C1356VY(context, c0986Pf), new C7460Cv0(20), new C7512Dv0(20), new S20(23), new ES1(context, c0986Pf, false, 6)});
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: O */
    public boolean mo1032O(Z01 z01) {
        O90.m5968f(z01, "<this>");
        return US1.m8066z(US1.m8037U(z01));
    }

    /* renamed from: O0 */
    public C7818Js0 m1033O0(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        C9615hM0 c9615hM0 = new C9615hM0();
        c9615hM0.f28396a = new ArrayList();
        List<InterfaceC11866yz0> list = (List) this.f1250b;
        for (InterfaceC11866yz0 interfaceC11866yz0 : list) {
            arrayList.addAll(interfaceC11866yz0.mo18082e(reactApplicationContext));
            if (interfaceC11866yz0 instanceof ZL0) {
                c9615hM0.f28396a.add((ZL0) interfaceC11866yz0);
            }
        }
        arrayList.add(c9615hM0);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((InterfaceC11866yz0) it.next()).mo18085c());
        }
        return new C7818Js0(arrayList, arrayList2);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: P */
    public AbstractC8315Tg1 mo1034P(InterfaceC7950Mg0 interfaceC7950Mg0) {
        return US1.m8028L(interfaceC7950Mg0);
    }

    /* renamed from: P0 */
    public Bitmap m1035P0(int i) {
        Object objPollFirst;
        C8539Xo1 c8539Xo1 = (C8539Xo1) this.f1251c;
        synchronized (c8539Xo1) {
            C4260ij c4260ij = (C4260ij) ((SparseArray) c8539Xo1.f13981b).get(i);
            if (c4260ij == null) {
                objPollFirst = null;
            } else {
                objPollFirst = c4260ij.f29420c.pollFirst();
                if (((C4260ij) c8539Xo1.f13982c) != c4260ij) {
                    c8539Xo1.m9129L(c4260ij);
                    C4260ij c4260ij2 = (C4260ij) c8539Xo1.f13982c;
                    if (c4260ij2 == null) {
                        c8539Xo1.f13982c = c4260ij;
                        c8539Xo1.f13983d = c4260ij;
                    } else {
                        c4260ij.f29421d = c4260ij2;
                        c4260ij2.f29418a = c4260ij;
                        c8539Xo1.f13982c = c4260ij;
                    }
                }
            }
        }
        m1064d1(objPollFirst);
        Bitmap bitmap = (Bitmap) objPollFirst;
        if (bitmap == null || !m1007b1(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: Q */
    public X01 mo1036Q(Z01 z01) {
        EnumC6262jq enumC6262jq = EnumC6262jq.f35417a;
        return US1.m8049i(z01);
    }

    /* renamed from: Q0 */
    public Object m1037Q0(InterfaceC9467gC0 interfaceC9467gC0) {
        HashMap map = (HashMap) this.f1251c;
        C8800b20 c8800b20 = (C8800b20) map.get(interfaceC9467gC0);
        if (c8800b20 == null) {
            c8800b20 = new C8800b20(interfaceC9467gC0);
            map.put(interfaceC9467gC0, c8800b20);
        } else {
            interfaceC9467gC0.mo10572a();
        }
        C8800b20 c8800b202 = c8800b20.f16718d;
        c8800b202.f16717c = c8800b20.f16717c;
        c8800b20.f16717c.f16718d = c8800b202;
        C8800b20 c8800b203 = (C8800b20) this.f1250b;
        c8800b20.f16718d = c8800b203;
        C8800b20 c8800b204 = c8800b203.f16717c;
        c8800b20.f16717c = c8800b204;
        c8800b204.f16718d = c8800b20;
        c8800b20.f16718d.f16717c = c8800b20;
        ArrayList arrayList = c8800b20.f16716b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c8800b20.f16716b.remove(size - 1);
        }
        return null;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: R */
    public AbstractC8315Tg1 mo1038R(AbstractC10804qe1 abstractC10804qe1) {
        return US1.m8054n(abstractC10804qe1);
    }

    /* renamed from: R0 */
    public CameraCharacteristics mo1039R0(String str) throws C6448mn {
        try {
            return ((CameraManager) this.f1250b).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new C6448mn(e);
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: S */
    public int mo1040S(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8030N(interfaceC8153Qd1);
    }

    /* renamed from: S0 */
    public void m1041S0(AbstractC1733o abstractC1733o, HashSet hashSet) {
        List listM10112f = abstractC1733o.f16215c.m10112f();
        int size = listM10112f.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) listM10112f.get(i);
            m1041S0(fragment.getChildFragmentManager(), hashSet);
            AbstractC7538Ei0 lifecycle = fragment.getLifecycle();
            C1876a c1876a = (C1876a) this.f1251c;
            c1876a.getClass();
            AbstractC7381Bh1.m802a();
            JR0 jr0 = (JR0) c1876a.f17790a.get(lifecycle);
            if (jr0 != null) {
                hashSet.add(jr0);
            }
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: T */
    public boolean mo1042T(InterfaceC10292me1 interfaceC10292me1, InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8058r(interfaceC10292me1, interfaceC8153Qd1);
    }

    /* renamed from: T0 */
    public Set mo323T0() {
        return Collections.emptySet();
    }

    @Override // p000.InterfaceC10443nq0
    /* renamed from: U */
    public AbstractC7292zt mo1043U(InterfaceC4199hl interfaceC4199hl) {
        AbstractC7292zt abstractC7292ztMo1043U = ((InterfaceC10443nq0) this.f1250b).mo1043U(interfaceC4199hl);
        InterfaceC10699pq0 interfaceC10699pq0 = (InterfaceC10699pq0) this.f1251c;
        if (abstractC7292ztMo1043U == null) {
            interfaceC10699pq0.mo868m(interfaceC4199hl);
        } else {
            interfaceC10699pq0.mo861d(interfaceC4199hl);
        }
        return abstractC7292ztMo1043U;
    }

    /* renamed from: U0 */
    public synchronized ArrayList m1044U0(Class cls) {
        return ((T71) this.f1250b).m7557C(cls);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: V */
    public X01 mo1045V(InterfaceC7950Mg0 interfaceC7950Mg0) {
        X01 x01M8038V;
        O90.m5968f(interfaceC7950Mg0, "<this>");
        AbstractC3933dW abstractC3933dWM8046f = US1.m8046f(interfaceC7950Mg0);
        if (abstractC3933dWM8046f != null && (x01M8038V = US1.m8038V(abstractC3933dWM8046f)) != null) {
            return x01M8038V;
        }
        X01 x01M8047g = US1.m8047g(interfaceC7950Mg0);
        O90.m5965c(x01M8047g);
        return x01M8047g;
    }

    /* renamed from: V0 */
    public Pair m1046V0(int i, C7604Fp0 c7604Fp0) {
        C7604Fp0 c7604Fp0M2790a;
        C8280Sp0 c8280Sp0 = (C8280Sp0) this.f1250b;
        C7604Fp0 c7604Fp02 = null;
        if (c7604Fp0 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= c8280Sp0.f10998c.size()) {
                    c7604Fp0M2790a = null;
                    break;
                }
                if (((C7604Fp0) c8280Sp0.f10998c.get(i2)).f3433d == c7604Fp0.f3433d) {
                    Object obj = c8280Sp0.f10997b;
                    int i3 = SB0.f10610k;
                    c7604Fp0M2790a = c7604Fp0.m2790a(Pair.create(obj, c7604Fp0.f3430a));
                    break;
                }
                i2++;
            }
            if (c7604Fp0M2790a == null) {
                return null;
            }
            c7604Fp02 = c7604Fp0M2790a;
        }
        return Pair.create(Integer.valueOf(i + c8280Sp0.f10999d), c7604Fp02);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: W */
    public InterfaceC8101Pd1 mo1047W(Z01 z01) {
        return US1.m8037U(z01);
    }

    /* renamed from: W0 */
    public int m1048W0(String str) {
        int iIntValue;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f1250b;
        C10115lG0 c10115lG0 = new C10115lG0(13, this);
        O90.m5968f(concurrentHashMap, "<this>");
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 == null) {
                    Object objInvoke = c10115lG0.invoke(str);
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

    @Override // p000.InterfaceC0810Ms
    /* renamed from: X */
    public boolean mo1049X(Z01 z01) {
        O90.m5968f(z01, "<this>");
        X01 x01M8047g = US1.m8047g(z01);
        return (x01M8047g != null ? US1.m8044d(this, x01M8047g) : null) != null;
    }

    /* renamed from: X0 */
    public KeyListener m1050X0(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C4238iN) ((QQ0) this.f1251c).f9619a).getClass();
        if (keyListener instanceof C7197yN) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C7197yN(keyListener);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: Y */
    public InterfaceC6642pq mo1051Y(Z01 z01) {
        return US1.m8044d(this, z01);
    }

    /* renamed from: Y0 */
    public Long m1052Y0(String str) {
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT long_value FROM Preference where `key`=?");
        c10781qT0M24005a.mo2033d(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1250b;
        workDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            Long lValueOf = null;
            if (cursorM7035c.moveToFirst() && !cursorM7035c.isNull(0)) {
                lValueOf = Long.valueOf(cursorM7035c.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM7035c.close();
            c10781qT0M24005a.release();
        }
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: Z */
    public void mo851Z(InterfaceC6843sl interfaceC6843sl, HS0 hs0) {
        O90.m5968f(interfaceC6843sl, "call");
        Bundle bundle = new Bundle();
        IS0 is0 = hs0.f4301g;
        bundle.putString("body", is0 != null ? is0.m3878x() : null);
        bundle.putInt("status", hs0.f4298d);
        bundle.putBundle("headers", C1414WT.m8771k((C1414WT) this.f1251c, hs0.f4300f));
        hs0.close();
        ((InterfaceC11518wE0) this.f1250b).resolve(bundle);
    }

    /* renamed from: Z0 */
    public Typeface m1053Z0(String str, C11403vK0 c11403vK0, AssetManager assetManager) {
        int i;
        Typeface typefaceCreate;
        HashMap map = (HashMap) this.f1251c;
        boolean zContainsKey = map.containsKey(str);
        int i2 = 0;
        int i3 = c11403vK0.f44332b;
        boolean z = c11403vK0.f44331a;
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
        HashMap map2 = (HashMap) this.f1250b;
        C11275uK0 c11275uK0 = (C11275uK0) map2.get(str);
        if (c11275uK0 == null) {
            c11275uK0 = new C11275uK0();
            map2.put(str, c11275uK0);
        }
        if (i3 < 700) {
            i = z ? 2 : 0;
        } else {
            i = z ? 3 : 1;
        }
        Typeface typeface2 = (Typeface) c11275uK0.f43652a.get(i);
        if (typeface2 == null) {
            String str2 = f1246e[i];
            String[] strArr = f1247f;
            while (true) {
                if (i2 >= 2) {
                    typefaceCreate = Typeface.create(str, i);
                    break;
                }
                try {
                    typefaceCreate = Typeface.createFromAsset(assetManager, AbstractC1374Vq.m8590i("fonts/", str, str2, strArr[i2]));
                    break;
                } catch (RuntimeException unused) {
                    i2++;
                }
            }
            typeface2 = typefaceCreate;
            c11275uK0.f43652a.put(i, typeface2);
        }
        return typeface2;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: a */
    public int mo1054a(InterfaceC7950Mg0 interfaceC7950Mg0) {
        return US1.m8042b(interfaceC7950Mg0);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: a0 */
    public boolean mo1055a0(Z01 z01) {
        O90.m5968f(z01, "<this>");
        return US1.m8019C(mo1101q0(z01)) && !US1.m8020D(z01);
    }

    /* renamed from: a1 */
    public void m1056a1(BC0 bc0) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1250b;
        workDatabase_Impl.m23792b();
        workDatabase_Impl.m23793c();
        try {
            ((C1276UH) this.f1251c).m7954h(bc0);
            workDatabase_Impl.m23799n();
        } finally {
            workDatabase_Impl.m23795j();
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: b */
    public boolean mo1057b(InterfaceC6642pq interfaceC6642pq) {
        O90.m5968f(interfaceC6642pq, "$receiver");
        return interfaceC6642pq instanceof C6325kq;
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: b0 */
    public void mo1058b0(int i, C7604Fp0 c7604Fp0) {
        Pair pairM1046V0 = m1046V0(i, c7604Fp0);
        if (pairM1046V0 != null) {
            ((R71) ((C8332Tp0) this.f1251c).f11545j).m6905c(new RunnableC8072Op0(this, pairM1046V0, 0));
        }
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: c */
    public void mo1059c(int i, C7604Fp0 c7604Fp0, Exception exc) {
        Pair pairM1046V0 = m1046V0(i, c7604Fp0);
        if (pairM1046V0 != null) {
            ((R71) ((C8332Tp0) this.f1251c).f11545j).m6905c(new RunnableC8176Qp0(this, pairM1046V0, exc, 0));
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: c0 */
    public AbstractC8315Tg1 mo1060c0(ArrayList arrayList) {
        X01 x01;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (AbstractC8315Tg1) AbstractC7167xu.m25972R(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC8315Tg1 abstractC8315Tg1 = (AbstractC8315Tg1) it.next();
            z = z || AbstractC1141S8.m7182b(abstractC8315Tg1);
            if (abstractC8315Tg1 instanceof X01) {
                x01 = (X01) abstractC8315Tg1;
            } else {
                if (!(abstractC8315Tg1 instanceof AbstractC3933dW)) {
                    throw new C6838sg();
                }
                O90.m5968f(abstractC8315Tg1, "<this>");
                x01 = ((AbstractC3933dW) abstractC8315Tg1).f26126b;
                z2 = true;
            }
            arrayList2.add(x01);
        }
        if (z) {
            return C6298kP.m22197c(EnumC6235jP.f35139x, arrayList.toString());
        }
        C9908je1 c9908je1 = C9908je1.f35304a;
        if (!z2) {
            return c9908je1.m22085b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC9572h12.m18698j((AbstractC8315Tg1) it2.next()));
        }
        return NV1.m5738t(c9908je1.m22085b(arrayList2), c9908je1.m22085b(arrayList3));
    }

    /* renamed from: c1 */
    public void mo1061c1(AttributeSet attributeSet, int i) {
        switch (this.f1249a) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f1250b;
                C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(absSeekBar.getContext(), attributeSet, f1245d, i);
                Drawable drawableM9122D = c8539Xo1M9117J.m9122D(0);
                if (drawableM9122D != null) {
                    if (drawableM9122D instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM9122D;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM1094n1 = m1094n1(animationDrawable.getFrame(i2), true);
                            drawableM1094n1.setLevel(10000);
                            animationDrawable2.addFrame(drawableM1094n1, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM9122D = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM9122D);
                }
                Drawable drawableM9122D2 = c8539Xo1M9117J.m9122D(1);
                if (drawableM9122D2 != null) {
                    absSeekBar.setProgressDrawable(m1094n1(drawableM9122D2, false));
                }
                c8539Xo1M9117J.m9130M();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f1250b).getContext().obtainStyledAttributes(attributeSet, AbstractC8704aH0.f15431i, i, 0);
                try {
                    boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    m1091m1(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: d */
    public void mo1062d(int i, C7604Fp0 c7604Fp0, C11081sp0 c11081sp0) {
        Pair pairM1046V0 = m1046V0(i, c7604Fp0);
        if (pairM1046V0 != null) {
            ((R71) ((C8332Tp0) this.f1251c).f11545j).m6905c(new RunnableC8020Np0(this, pairM1046V0, c11081sp0, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x011c A[EDGE_INSN: B:141:0x011c->B:123:0x011c BREAK  A[LOOP:1: B:109:0x00e3->B:122:0x010b], SYNTHETIC] */
    @Override // p000.InterfaceC6839sh
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.C6759rh mo1063d0(p000.C7000vF r17, long r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.CC0.mo1063d0(vF, long):rh");
    }

    /* renamed from: d1 */
    public void m1064d1(Object obj) {
        if (obj != null) {
            synchronized (this) {
                ((HashSet) this.f1250b).remove(obj);
            }
        }
    }

    @Override // p000.InterfaceC10443nq0
    /* renamed from: e */
    public boolean mo1065e(C0267EE c0267ee) {
        return ((InterfaceC10443nq0) this.f1250b).mo1065e(c0267ee);
    }

    @Override // p000.InterfaceC10467o11
    /* renamed from: e0 */
    public void mo1066e0(InterfaceC0651KK interfaceC0651KK) {
        ((InterfaceC10467o11) this.f1250b).mo1066e0(interfaceC0651KK);
    }

    /* renamed from: e1 */
    public C7008vN m1067e1(InputConnection inputConnection, EditorInfo editorInfo) {
        QQ0 qq0 = (QQ0) this.f1251c;
        if (inputConnection == null) {
            qq0.getClass();
            inputConnection = null;
        } else {
            C4238iN c4238iN = (C4238iN) qq0.f9619a;
            c4238iN.getClass();
            if (!(inputConnection instanceof C7008vN)) {
                inputConnection = new C7008vN((EditText) c4238iN.f29113b, inputConnection, editorInfo);
            }
        }
        return (C7008vN) inputConnection;
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: f */
    public void mo1068f(int i, C7604Fp0 c7604Fp0, C11081sp0 c11081sp0) {
        Pair pairM1046V0 = m1046V0(i, c7604Fp0);
        if (pairM1046V0 != null) {
            ((R71) ((C8332Tp0) this.f1251c).f11545j).m6905c(new RunnableC8020Np0(this, pairM1046V0, c11081sp0, 0));
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: f0 */
    public C10988s41 mo1069f0(InterfaceC7950Mg0 interfaceC7950Mg0) {
        return US1.m8048h(interfaceC7950Mg0);
    }

    /* renamed from: f1 */
    public void mo1070f1(String str, ExecutorC10151lY0 executorC10151lY0, CameraDevice.StateCallback stateCallback) {
        executorC10151lY0.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.f1250b).openCamera(str, new C7033vm(executorC10151lY0, stateCallback), (Handler) ((C0827N8) this.f1251c).f7524c);
        } catch (CameraAccessException e) {
            throw new C6448mn(e);
        }
    }

    @Override // p000.InterfaceC10443nq0
    /* renamed from: g */
    public int mo1071g(C0912OU c0912ou) {
        return ((InterfaceC10443nq0) this.f1250b).mo1071g(c0912ou);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: g0 */
    public InterfaceC10292me1 mo1072g0(InterfaceC8153Qd1 interfaceC8153Qd1, int i) {
        return US1.m8053m(interfaceC8153Qd1, i);
    }

    /* renamed from: g1 */
    public Object m1073g1() {
        Object obj;
        C8539Xo1 c8539Xo1 = (C8539Xo1) this.f1251c;
        synchronized (c8539Xo1) {
            C4260ij c4260ij = (C4260ij) c8539Xo1.f13983d;
            if (c4260ij == null) {
                obj = null;
            } else {
                Object objPollLast = c4260ij.f29420c.pollLast();
                if (c4260ij.f29420c.isEmpty()) {
                    c8539Xo1.m9129L(c4260ij);
                    ((SparseArray) c8539Xo1.f13981b).remove(c4260ij.f29419b);
                }
                obj = objPollLast;
            }
        }
        m1064d1(obj);
        return obj;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: h */
    public int mo1074h(InterfaceC7737Id1 interfaceC7737Id1) {
        O90.m5968f(interfaceC7737Id1, "<this>");
        if (interfaceC7737Id1 instanceof Z01) {
            return US1.m8042b((InterfaceC7950Mg0) interfaceC7737Id1);
        }
        if (interfaceC7737Id1 instanceof C6344l8) {
            return ((C6344l8) interfaceC7737Id1).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC7737Id1 + ", " + BP0.f799a.mo3846b(interfaceC7737Id1.getClass())).toString());
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: h0 */
    public boolean mo1075h0(InterfaceC8153Qd1 interfaceC8153Qd1, InterfaceC8153Qd1 interfaceC8153Qd12) {
        O90.m5968f(interfaceC8153Qd1, "c1");
        O90.m5968f(interfaceC8153Qd12, "c2");
        if (!(interfaceC8153Qd1 instanceof InterfaceC8101Pd1)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(interfaceC8153Qd12 instanceof InterfaceC8101Pd1)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!US1.m8041a(interfaceC8153Qd1, interfaceC8153Qd12)) {
            InterfaceC8101Pd1 interfaceC8101Pd1 = (InterfaceC8101Pd1) interfaceC8153Qd1;
            InterfaceC8101Pd1 interfaceC8101Pd12 = (InterfaceC8101Pd1) interfaceC8153Qd12;
            if (!((InterfaceC7794Jg0) this.f1251c).mo1464K(interfaceC8101Pd1, interfaceC8101Pd12)) {
                HashMap map = (HashMap) this.f1250b;
                if (map != null) {
                    InterfaceC8101Pd1 interfaceC8101Pd13 = (InterfaceC8101Pd1) map.get(interfaceC8101Pd1);
                    InterfaceC8101Pd1 interfaceC8101Pd14 = (InterfaceC8101Pd1) map.get(interfaceC8101Pd12);
                    if ((interfaceC8101Pd13 == null || !interfaceC8101Pd13.equals(interfaceC8101Pd12)) && (interfaceC8101Pd14 == null || !interfaceC8101Pd14.equals(interfaceC8101Pd1))) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: h1 */
    public void m1076h1(InterfaceC9467gC0 interfaceC9467gC0, Object obj) {
        HashMap map = (HashMap) this.f1251c;
        C8800b20 c8800b20 = (C8800b20) map.get(interfaceC9467gC0);
        if (c8800b20 == null) {
            c8800b20 = new C8800b20(interfaceC9467gC0);
            c8800b20.f16718d = c8800b20;
            C8800b20 c8800b202 = (C8800b20) this.f1250b;
            c8800b20.f16718d = c8800b202.f16718d;
            c8800b20.f16717c = c8800b202;
            c8800b202.f16718d = c8800b20;
            c8800b20.f16718d.f16717c = c8800b20;
            map.put(interfaceC9467gC0, c8800b20);
        } else {
            interfaceC9467gC0.mo10572a();
        }
        if (c8800b20.f16716b == null) {
            c8800b20.f16716b = new ArrayList();
        }
        c8800b20.f16716b.add(obj);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: i */
    public InterfaceC7737Id1 mo1077i(Z01 z01) {
        return US1.m8043c(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: i0 */
    public boolean mo1078i0(Z01 z01, Z01 z012) {
        return US1.m8059s(z01, z012);
    }

    /* renamed from: i1 */
    public void m1079i1(Object obj) {
        boolean zAdd;
        Bitmap bitmap = (Bitmap) obj;
        O90.m5968f(bitmap, "bitmap");
        if (m1007b1(bitmap)) {
            synchronized (this) {
                zAdd = ((HashSet) this.f1250b).add(bitmap);
            }
            if (zAdd) {
                ((C8539Xo1) this.f1251c).m9132O(AbstractC6697qi.m24051d(bitmap), bitmap);
            }
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: j */
    public void mo1080j(InterfaceC7950Mg0 interfaceC7950Mg0) {
        O90.m5968f(interfaceC7950Mg0, "<this>");
        US1.m8046f(interfaceC7950Mg0);
    }

    @Override // p000.InterfaceC10443nq0
    /* renamed from: j0 */
    public AbstractC7292zt mo1081j0(InterfaceC4199hl interfaceC4199hl, AbstractC7292zt abstractC7292zt) {
        ((InterfaceC10699pq0) this.f1251c).mo877v(interfaceC4199hl);
        return ((InterfaceC10443nq0) this.f1250b).mo1081j0(interfaceC4199hl, abstractC7292zt);
    }

    /* renamed from: j1 */
    public void mo1082j1(ExecutorC10151lY0 executorC10151lY0, C7096wm c7096wm) {
        C7098wo c7098wo;
        C0827N8 c0827n8 = (C0827N8) this.f1251c;
        synchronized (((HashMap) c0827n8.f7523b)) {
            try {
                c7098wo = (C7098wo) ((HashMap) c0827n8.f7523b).get(c7096wm);
                if (c7098wo == null) {
                    c7098wo = new C7098wo(executorC10151lY0, c7096wm);
                    ((HashMap) c0827n8.f7523b).put(c7096wm, c7098wo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((CameraManager) this.f1250b).registerAvailabilityCallback(c7098wo, (Handler) c0827n8.f7524c);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: k */
    public boolean mo1083k(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8017A(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: k0 */
    public void mo1084k0(int i, C7604Fp0 c7604Fp0) {
        Pair pairM1046V0 = m1046V0(i, c7604Fp0);
        if (pairM1046V0 != null) {
            ((R71) ((C8332Tp0) this.f1251c).f11545j).m6905c(new RunnableC8072Op0(this, pairM1046V0, 1));
        }
    }

    /* renamed from: k1 */
    public void m1085k1() throws IOException {
        try {
            ((FileLock) this.f1251c).release();
            ((FileChannel) this.f1250b).close();
        } catch (IOException unused) {
        }
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: l */
    public void mo1086l(int i, C7604Fp0 c7604Fp0, int i2) {
        Pair pairM1046V0 = m1046V0(i, c7604Fp0);
        if (pairM1046V0 != null) {
            ((R71) ((C8332Tp0) this.f1251c).f11545j).m6905c(new RunnableC6694qf(this, pairM1046V0, i2, 11));
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: l0 */
    public boolean mo1087l0(InterfaceC7950Mg0 interfaceC7950Mg0) {
        O90.m5968f(interfaceC7950Mg0, "$receiver");
        return interfaceC7950Mg0 instanceof C8292Sv0;
    }

    /* renamed from: l1 */
    public Object m1088l1() {
        C8800b20 c8800b20 = (C8800b20) this.f1250b;
        C8800b20 c8800b202 = c8800b20.f16718d;
        while (true) {
            if (c8800b202.equals(c8800b20)) {
                return null;
            }
            ArrayList arrayList = c8800b202.f16716b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c8800b202.f16716b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C8800b20 c8800b203 = c8800b202.f16718d;
            c8800b203.f16717c = c8800b202.f16717c;
            c8800b202.f16717c.f16718d = c8800b203;
            HashMap map = (HashMap) this.f1251c;
            InterfaceC9467gC0 interfaceC9467gC0 = c8800b202.f16715a;
            map.remove(interfaceC9467gC0);
            interfaceC9467gC0.mo10572a();
            c8800b202 = c8800b202.f16718d;
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: m */
    public void mo1089m(Z01 z01) {
        US1.m8025I(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: m0 */
    public boolean mo1090m0(Z01 z01) {
        return US1.m8018B(z01);
    }

    /* renamed from: m1 */
    public void m1091m1(boolean z) {
        C0150CN c0150cn = (C0150CN) ((C4238iN) ((QQ0) this.f1251c).f9619a).f29114c;
        if (c0150cn.f1344c != z) {
            if (c0150cn.f1343b != null) {
                EmojiCompat.get().unregisterInitCallback(c0150cn.f1343b);
            }
            c0150cn.f1344c = z;
            if (z) {
                C0150CN.m1158a(c0150cn.f1342a, EmojiCompat.get().getLoadState());
            }
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: n */
    public C10709pv0 mo1092n(InterfaceC6642pq interfaceC6642pq) {
        return US1.m8036T(interfaceC6642pq);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: n0 */
    public AbstractC10804qe1 mo1093n0(Z01 z01, int i) {
        O90.m5968f(z01, "<this>");
        if (i < 0 || i >= US1.m8042b(z01)) {
            return null;
        }
        return US1.m8052l(z01, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n1 */
    public Drawable m1094n1(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC9418fp1) {
            ((AbstractC9546gp1) ((InterfaceC9418fp1) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m1094n1(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
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
                if (((Bitmap) this.f1251c) == null) {
                    this.f1251c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: o */
    public void mo1095o(int i, C7604Fp0 c7604Fp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0) {
        Pair pairM1046V0 = m1046V0(i, c7604Fp0);
        if (pairM1046V0 != null) {
            ((R71) ((C8332Tp0) this.f1251c).f11545j).m6905c(new RunnableC8124Pp0(this, pairM1046V0, c9535gk0, c11081sp0, 1));
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: o0 */
    public boolean mo1096o0(AbstractC10804qe1 abstractC10804qe1) {
        return US1.m8023G(abstractC10804qe1);
    }

    /* renamed from: o1 */
    public void mo1097o1(CameraManager.AvailabilityCallback availabilityCallback) {
        C7098wo c7098wo;
        if (availabilityCallback != null) {
            C0827N8 c0827n8 = (C0827N8) this.f1251c;
            synchronized (((HashMap) c0827n8.f7523b)) {
                c7098wo = (C7098wo) ((HashMap) c0827n8.f7523b).remove(availabilityCallback);
            }
        } else {
            c7098wo = null;
        }
        if (c7098wo != null) {
            c7098wo.m25703a();
        }
        ((CameraManager) this.f1250b).unregisterAvailabilityCallback(c7098wo);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [Vg0, nZ] */
    @Override // p000.InterfaceC10467o11
    public void onError(Throwable th) {
        Throwable c0226Da;
        O90.m5968f(th, "e");
        try {
            c0226Da = (Throwable) ((C9699i11) this.f1251c).f28761c.invoke(th);
        } catch (Throwable th2) {
            c0226Da = new C0226Da(3, I02.m3691e(th2), (Throwable) AbstractC0576J8.m4188o(new Throwable[]{th}));
        }
        ((InterfaceC10467o11) this.f1250b).onError(c0226Da);
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        C11812yY0 c11812yY0;
        if (!(th instanceof C4169hH)) {
            if (th instanceof CancellationException) {
                ((C0175Cm) this.f1251c).m1347u("Unable to configure camera cancelled");
                return;
            }
            if (((C0175Cm) this.f1251c).f1621L == 9) {
                ((C0175Cm) this.f1251c).m1320G(9, new C0039Ac(4, th), true);
            }
            Objects.toString((C0175Cm) this.f1251c);
            AbstractC7806Jm0.m4412f("Camera2CameraImpl");
            C0175Cm c0175Cm = (C0175Cm) this.f1251c;
            if (c0175Cm.f1633l == ((InterfaceC4204hq) this.f1250b)) {
                c0175Cm.m1318E();
                return;
            }
            return;
        }
        C0175Cm c0175Cm2 = (C0175Cm) this.f1251c;
        AbstractC4232iH abstractC4232iH = ((C4169hH) th).f28366a;
        Iterator it = c0175Cm2.f1622a.m25188e().iterator();
        while (true) {
            if (!it.hasNext()) {
                c11812yY0 = null;
                break;
            } else {
                c11812yY0 = (C11812yY0) it.next();
                if (c11812yY0.m26164b().contains(abstractC4232iH)) {
                    break;
                }
            }
        }
        if (c11812yY0 != null) {
            C0175Cm c0175Cm3 = (C0175Cm) this.f1251c;
            c0175Cm3.getClass();
            C20 c20M6710h = QR1.m6710h();
            InterfaceC11558wY0 interfaceC11558wY0 = c11812yY0.f46303f;
            if (interfaceC11558wY0 != null) {
                new Throwable();
                c0175Cm3.m1347u("Posting surface closed");
                c20M6710h.execute(new RunnableC6720r4(interfaceC11558wY0, 20, c11812yY0));
            }
        }
    }

    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        switch (this.f1249a) {
            case 7:
                C0175Cm c0175Cm = (C0175Cm) this.f1251c;
                if (c0175Cm.f1640s.f17088a == 2 && c0175Cm.f1621L == 9) {
                    ((C0175Cm) this.f1251c).m1319F(10);
                    break;
                }
                break;
            default:
                ((InterfaceC10467o11) this.f1250b).onSuccess(obj);
                break;
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: p */
    public EnumC7531Ee1 mo1098p(InterfaceC10292me1 interfaceC10292me1) {
        O90.m5968f(interfaceC10292me1, "$receiver");
        EnumC9532gi1 enumC9532gi1Mo22918O = interfaceC10292me1.mo22918O();
        O90.m5967e(enumC9532gi1Mo22918O, "getVariance(...)");
        return AZ1.m233a(enumC9532gi1Mo22918O);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: p0 */
    public AbstractC3933dW mo1099p0(InterfaceC7950Mg0 interfaceC7950Mg0) {
        return US1.m8046f(interfaceC7950Mg0);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: q */
    public boolean mo1100q(Z01 z01) {
        O90.m5968f(z01, "<this>");
        return US1.m8061u(US1.m8037U(z01));
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: q0 */
    public InterfaceC8101Pd1 mo1101q0(InterfaceC7950Mg0 interfaceC7950Mg0) {
        O90.m5968f(interfaceC7950Mg0, "<this>");
        X01 x01M8047g = US1.m8047g(interfaceC7950Mg0);
        if (x01M8047g == null) {
            x01M8047g = mo1112x(interfaceC7950Mg0);
        }
        return US1.m8037U(x01M8047g);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: r */
    public X01 mo1102r(InterfaceC7950Mg0 interfaceC7950Mg0) {
        return US1.m8047g(interfaceC7950Mg0);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: r0 */
    public boolean mo1103r0(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8066z(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: s */
    public AbstractC10804qe1 mo1104s(InterfaceC6451mq interfaceC6451mq) {
        return US1.m8033Q(interfaceC6451mq);
    }

    @Override // p000.InterfaceC1397WC
    /* renamed from: s0 */
    public InterfaceC1586ZC mo506s0() {
        return new C1835cF((Context) this.f1250b, ((InterfaceC10859r40) this.f1251c).mo506s0());
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: t */
    public boolean mo1105t(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8061u(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: t0 */
    public boolean mo1106t0(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8060t(interfaceC8153Qd1);
    }

    public String toString() {
        switch (this.f1249a) {
            case 16:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C8800b20 c8800b20 = (C8800b20) this.f1250b;
                C8800b20 c8800b202 = c8800b20.f16717c;
                boolean z = false;
                while (!c8800b202.equals(c8800b20)) {
                    sb.append('{');
                    sb.append(c8800b202.f16715a);
                    sb.append(':');
                    ArrayList arrayList = c8800b202.f16716b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c8800b202 = c8800b202.f16717c;
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

    @Override // p000.InterfaceC0810Ms
    /* renamed from: u */
    public boolean mo1107u(AbstractC8315Tg1 abstractC8315Tg1) {
        O90.m5968f(abstractC8315Tg1, "<this>");
        return US1.m8018B(mo1112x(abstractC8315Tg1)) != US1.m8018B(mo1045V(abstractC8315Tg1));
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: u0 */
    public boolean mo1108u0(InterfaceC6642pq interfaceC6642pq) {
        return US1.m8022F(interfaceC6642pq);
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: v */
    public void mo1109v(int i, C7604Fp0 c7604Fp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0) {
        Pair pairM1046V0 = m1046V0(i, c7604Fp0);
        if (pairM1046V0 != null) {
            ((R71) ((C8332Tp0) this.f1251c).f11545j).m6905c(new RunnableC8124Pp0(this, pairM1046V0, c9535gk0, c11081sp0, 0));
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: v0 */
    public boolean mo1110v0(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8019C(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: w */
    public X01 mo1111w(AbstractC3933dW abstractC3933dW) {
        return US1.m8038V(abstractC3933dW);
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: w0 */
    public void mo852w0(InterfaceC6843sl interfaceC6843sl, IOException iOException) {
        O90.m5968f(interfaceC6843sl, "call");
        if (((DN0) interfaceC6843sl).f1994o) {
            ((InterfaceC11518wE0) this.f1250b).resolve(null);
            return;
        }
        String str = AbstractC1477XT.f13800a;
        iOException.getMessage();
        ((InterfaceC11518wE0) this.f1250b).reject(str, iOException.getMessage(), iOException);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: x */
    public X01 mo1112x(InterfaceC7950Mg0 interfaceC7950Mg0) {
        X01 x01M8026J;
        O90.m5968f(interfaceC7950Mg0, "<this>");
        AbstractC3933dW abstractC3933dWM8046f = US1.m8046f(interfaceC7950Mg0);
        if (abstractC3933dWM8046f != null && (x01M8026J = US1.m8026J(abstractC3933dWM8046f)) != null) {
            return x01M8026J;
        }
        X01 x01M8047g = US1.m8047g(interfaceC7950Mg0);
        O90.m5965c(x01M8047g);
        return x01M8047g;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: x0 */
    public AbstractC10804qe1 mo1113x0(InterfaceC7737Id1 interfaceC7737Id1, int i) {
        O90.m5968f(interfaceC7737Id1, "<this>");
        if (interfaceC7737Id1 instanceof Z01) {
            return US1.m8052l((InterfaceC7950Mg0) interfaceC7737Id1, i);
        }
        if (interfaceC7737Id1 instanceof C6344l8) {
            Object obj = ((C6344l8) interfaceC7737Id1).get(i);
            O90.m5967e(obj, "get(...)");
            return (AbstractC10804qe1) obj;
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC7737Id1 + ", " + BP0.f799a.mo3846b(interfaceC7737Id1.getClass())).toString());
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: y */
    public AbstractC8315Tg1 mo1114y(InterfaceC6642pq interfaceC6642pq) {
        return US1.m8027K(interfaceC6642pq);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: y0 */
    public boolean mo1115y0(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8062v(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: z */
    public Collection mo1116z(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8035S(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: z0 */
    public Z01 mo1117z0(Z01 z01) {
        X01 x01M8029M;
        O90.m5968f(z01, "<this>");
        C6670qH c6670qHM8045e = US1.m8045e(z01);
        return (c6670qHM8045e == null || (x01M8029M = US1.m8029M(c6670qHM8045e)) == null) ? z01 : x01M8029M;
    }

    public /* synthetic */ CC0(Object obj, int i, Object obj2) {
        this.f1249a = i;
        this.f1250b = obj;
        this.f1251c = obj2;
    }

    public /* synthetic */ CC0(Object obj, Object obj2, boolean z, int i) {
        this.f1249a = i;
        this.f1251c = obj;
        this.f1250b = obj2;
    }

    public CC0(HashMap map, InterfaceC7794Jg0 interfaceC7794Jg0) {
        this.f1249a = 22;
        O90.m5968f(interfaceC7794Jg0, "equalityAxioms");
        this.f1250b = map;
        this.f1251c = interfaceC7794Jg0;
    }

    public CC0(String str) {
        this.f1249a = 28;
        this.f1250b = str;
        this.f1251c = new ArrayList();
    }

    public CC0(BridgeReactContext bridgeReactContext) {
        this.f1249a = 21;
        this.f1251c = new HashMap();
        this.f1250b = bridgeReactContext;
    }

    public CC0(Context context) {
        this.f1249a = 12;
        this.f1250b = context;
        C0986Pf c0986Pf = new C0986Pf(0, (byte) 0);
        this.f1251c = c0986Pf;
        c0986Pf.m6404r(context.getApplicationInfo().sourceDir);
    }

    public CC0(C8539Xo1 c8539Xo1) {
        this.f1249a = 20;
        C7564Ev0 c7564Ev0 = T71.f11171e;
        T71 t71 = new T71();
        t71.f11173a = new ArrayList();
        t71.f11175c = new HashSet();
        t71.f11176d = c8539Xo1;
        t71.f11174b = c7564Ev0;
        C0893OB c0893ob = new C0893OB();
        c0893ob.f8267a = new HashMap();
        this.f1251c = c0893ob;
        this.f1250b = t71;
    }

    public CC0(WorkDatabase_Impl workDatabase_Impl) {
        this.f1249a = 0;
        this.f1250b = workDatabase_Impl;
        this.f1251c = new C1276UH(workDatabase_Impl, 2);
    }

    public CC0(Context context, C0827N8 c0827n8) {
        this.f1249a = 8;
        this.f1250b = (CameraManager) context.getSystemService("camera");
        this.f1251c = c0827n8;
    }

    public CC0(int i) {
        this.f1249a = i;
        switch (i) {
            case 6:
                this.f1250b = new HashSet();
                this.f1251c = new C8539Xo1(6);
                break;
            case 16:
                this.f1250b = new C8800b20(null);
                this.f1251c = new HashMap();
                break;
            case 29:
                this.f1250b = new ConcurrentHashMap();
                this.f1251c = new AtomicInteger(0);
                break;
            default:
                this.f1250b = new HashMap();
                this.f1251c = new HashMap();
                break;
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: C0 */
    public void mo1013C0(Z01 z01, InterfaceC8153Qd1 interfaceC8153Qd1) {
    }

    public CC0(AbsSeekBar absSeekBar) {
        this.f1249a = 1;
        this.f1250b = absSeekBar;
    }

    public CC0(EditText editText) {
        this.f1249a = 4;
        this.f1250b = editText;
        QQ0 qq0 = new QQ0();
        qq0.f9619a = new C4238iN(editText);
        this.f1251c = qq0;
    }

    public CC0(C7783Ja1 c7783Ja1) {
        this.f1249a = 23;
        this.f1250b = c7783Ja1;
        this.f1251c = new C9591hA0();
    }

    public CC0(Context context, InterfaceC10859r40 interfaceC10859r40) {
        this.f1249a = 11;
        this.f1250b = context.getApplicationContext();
        this.f1251c = interfaceC10859r40;
    }

    public CC0(Animation animation) {
        this.f1249a = 15;
        this.f1250b = animation;
        this.f1251c = null;
    }

    public CC0(Animator animator) {
        this.f1249a = 15;
        this.f1250b = null;
        this.f1251c = animator;
    }
}
