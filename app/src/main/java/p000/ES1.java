package p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.fragment.app.AbstractActivityC1730l;
import com.facebook.imagepipeline.image.EncodedImage;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.domain.ComponentActions;
import com.yandex.metrica.uiaccessor.FragmentLifecycleCallback;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ES1 implements InterfaceC6658q5, InterfaceC9875jO0, InterfaceC0980PZ, Y31, InterfaceC11776yG0, InterfaceC9968k61, InterfaceC10866r71, InterfaceC9296es1, InterfaceC9294er1, RemoteCall {

    /* renamed from: d */
    public static final C11227ty0 f2705d = new C11227ty0();

    /* renamed from: e */
    public static final C11099sy0 f2706e = new C11099sy0();

    /* renamed from: a */
    public final /* synthetic */ int f2707a;

    /* renamed from: b */
    public Object f2708b;

    /* renamed from: c */
    public Object f2709c;

    public /* synthetic */ ES1(int i, Object obj) {
        this.f2707a = i;
        this.f2709c = obj;
    }

    /* renamed from: o */
    public static String m2278o(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* renamed from: x */
    public static int m2279x(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    /* renamed from: A */
    public void m2280A(C6313ke c6313ke) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c6313ke.f36582a);
            jSONObject.put("Status", AbstractC7222ym.m26247x(c6313ke.f36583b));
            jSONObject.put("AuthToken", c6313ke.f36584c);
            jSONObject.put("RefreshToken", c6313ke.f36585d);
            jSONObject.put("TokenCreationEpochInSecs", c6313ke.f36587f);
            jSONObject.put("ExpiresInSecs", c6313ke.f36586e);
            jSONObject.put("FisError", c6313ke.f36588g);
            C0786MU c0786mu = (C0786MU) this.f2709c;
            c0786mu.m5379a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", c0786mu.f7174a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(m2299t())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: B */
    public void m2281B() {
        ((SparseIntArray) this.f2708b).clear();
    }

    /* renamed from: C */
    public void m2282C(SI1 si1) {
        ((C7560Et0) this.f2708b).m2440k(si1);
        boolean z = si1 instanceof C11227ty0;
        C11687xZ0 c11687xZ0 = (C11687xZ0) this.f2709c;
        if (z) {
            c11687xZ0.m25921j((C11227ty0) si1);
        } else if (si1 instanceof C10971ry0) {
            c11687xZ0.m25922k(((C10971ry0) si1).f42178b);
        }
    }

    /* renamed from: D */
    public void m2283D(int i, int i2) {
        int[] iArr = (int[]) this.f2708b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m2297r(i3);
        int[] iArr2 = (int[]) this.f2708b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f2708b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f2709c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C8807b41 c8807b41 = (C8807b41) ((ArrayList) this.f2709c).get(size);
            int i4 = c8807b41.f16733a;
            if (i4 >= i) {
                c8807b41.f16733a = i4 + i2;
            }
        }
    }

    @Override // p000.Y31
    /* renamed from: E */
    public StackTraceElement[] mo1462E(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        Y31[] y31Arr = (Y31[]) this.f2708b;
        StackTraceElement[] stackTraceElementArrMo1462E = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            Y31 y31 = y31Arr[i];
            if (stackTraceElementArrMo1462E.length <= 1024) {
                break;
            }
            stackTraceElementArrMo1462E = y31.mo1462E(stackTraceElementArr);
        }
        return stackTraceElementArrMo1462E.length > 1024 ? ((C7460Cv0) this.f2709c).mo1462E(stackTraceElementArrMo1462E) : stackTraceElementArrMo1462E;
    }

    /* renamed from: F */
    public void m2284F(int i, int i2) {
        int[] iArr = (int[]) this.f2708b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m2297r(i3);
        int[] iArr2 = (int[]) this.f2708b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f2708b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f2709c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C8807b41 c8807b41 = (C8807b41) ((ArrayList) this.f2709c).get(size);
            int i4 = c8807b41.f16733a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f2709c).remove(size);
                } else {
                    c8807b41.f16733a = i4 - i2;
                }
            }
        }
    }

    /* renamed from: G */
    public void m2285G(Exception exc) {
        ((C8290Su0) this.f2709c).getClass();
        AbstractC1666aT abstractC1666aT = (AbstractC1666aT) this.f2708b;
        E90 e90 = (E90) abstractC1666aT.m9748a();
        RD0 rd0 = abstractC1666aT.f15523b;
        e90.mo747e(rd0, "NetworkFetchProducer", exc, null);
        ((E90) abstractC1666aT.m9748a()).mo748f(rd0, "NetworkFetchProducer", false);
        ((C7027vg) rd0).m25469k("network", "default");
        abstractC1666aT.f15522a.m7718e(exc);
    }

    /* renamed from: H */
    public void m2286H(InputStream inputStream, int i) {
        C11467vq0 c11467vq0;
        AbstractC4250iZ.m19063b();
        C8290Su0 c8290Su0 = (C8290Su0) this.f2709c;
        C1339VH c1339vh = (C1339VH) c8290Su0.f11064b;
        if (i > 0) {
            c1339vh.getClass();
            c11467vq0 = new C11467vq0((AbstractC10955rq0) c1339vh.f12486b, i);
        } else {
            c1339vh.getClass();
            AbstractC10955rq0 abstractC10955rq0 = (AbstractC10955rq0) c1339vh.f12486b;
            c11467vq0 = new C11467vq0(abstractC10955rq0, abstractC10955rq0.f41927j[0]);
        }
        E00 e00 = (E00) c8290Su0.f11065c;
        byte[] bArr = (byte[]) e00.get(16384);
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                AbstractC1666aT abstractC1666aT = (AbstractC1666aT) this.f2708b;
                if (i2 < 0) {
                    ((AbstractC11920zO1) c8290Su0.f11066d).mo2923e(abstractC1666aT);
                    c8290Su0.m7462c(c11467vq0, abstractC1666aT);
                    e00.mo2828d(bArr);
                    c11467vq0.close();
                    AbstractC4250iZ.m19063b();
                    return;
                }
                if (i2 > 0) {
                    c11467vq0.write(bArr, 0, i2);
                    c8290Su0.m7463d(c11467vq0, abstractC1666aT);
                    abstractC1666aT.f15522a.m7720i(i > 0 ? c11467vq0.f44555c / i : 1.0f - ((float) Math.exp((-r5) / 50000.0d)));
                }
            } catch (Throwable th) {
                e00.mo2828d(bArr);
                c11467vq0.close();
                throw th;
            }
        }
    }

    /* renamed from: I */
    public C6313ke m2287I() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m2299t());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = AbstractC7222ym.m26223C(5)[iOptInt];
        if (i2 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i2 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C6313ke(strOptString, i2, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* renamed from: J */
    public int mo1364J(CaptureRequest captureRequest, ExecutorC10151lY0 executorC10151lY0, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f2708b).setRepeatingRequest(captureRequest, new C6447mm(executorC10151lY0, captureCallback), (Handler) ((C8170Qm0) this.f2709c).f9780b);
    }

    /* renamed from: K */
    public C0765M9 m2288K() throws IOException {
        File file = (File) this.f2708b;
        if (file.exists()) {
            File file2 = (File) this.f2709c;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                AbstractC10872rA1.m24175h("Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new C0765M9(file);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException(AbstractC1374Vq.m8588g(file, "Couldn't create "), e);
            }
            try {
                return new C0765M9(file);
            } catch (FileNotFoundException e2) {
                throw new IOException(AbstractC1374Vq.m8588g(file, "Couldn't create "), e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ae  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.C10665pZ0 m2289L(p000.C11571we1 r17, java.util.List r18, p000.C11818yb0 r19) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ES1.m2289L(we1, java.util.List, yb0):pZ0");
    }

    /* renamed from: M */
    public void m2290M() throws JSONException {
        FR1 fr1 = (FR1) this.f2709c;
        SparseArray sparseArrayM7994D1 = fr1.m7851t1().m7994D1();
        C11938zX1 c11938zX1 = (C11938zX1) this.f2708b;
        sparseArrayM7994D1.put(c11938zX1.f46863c, Long.valueOf(c11938zX1.f46862b));
        UM1 um1M7851t1 = fr1.m7851t1();
        int[] iArr = new int[sparseArrayM7994D1.size()];
        long[] jArr = new long[sparseArrayM7994D1.size()];
        for (int i = 0; i < sparseArrayM7994D1.size(); i++) {
            iArr[i] = sparseArrayM7994D1.keyAt(i);
            jArr[i] = ((Long) sparseArrayM7994D1.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        um1M7851t1.f11755p.m7570V(bundle);
    }

    @Override // p000.InterfaceC9550gr1
    /* renamed from: a */
    public Object mo1468a() {
        return new C11734xw1(((C9422fr1) this.f2708b).f27419a, (C7357Av1) ((InterfaceC9550gr1) this.f2709c).mo1468a());
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.f10059a;
        ((C11900zE1) obj).m26346m((PendingIntent) this.f2708b, (LocationRequest) this.f2709c, (S81) obj2);
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: b */
    public List mo42b(AbstractC7598Fm0 abstractC7598Fm0, C10753qF0 c10753qF0) {
        O90.m5968f(c10753qF0, "proto");
        ((C1115Rj) this.f2708b).getClass();
        C0779MN c0779mn = C0779MN.f7117a;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(c0779mn));
        Iterator<E> it = c0779mn.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9108dO1) this.f2709c).m17575s((QE0) it.next(), (InterfaceC8392Ut0) abstractC7598Fm0.f3414b));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: c */
    public List mo43c(AbstractC7598Fm0 abstractC7598Fm0, AbstractC11487w00 abstractC11487w00, int i, int i2, IF0 if0) {
        O90.m5968f(abstractC11487w00, "callableProto");
        AbstractC0852NX.m5764m(i, "kind");
        Iterable iterable = (List) if0.m25537k(((C1115Rj) this.f2708b).f40199j);
        if (iterable == null) {
            iterable = C0779MN.f7117a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(iterable2));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9108dO1) this.f2709c).m17575s((QE0) it.next(), (InterfaceC8392Ut0) abstractC7598Fm0.f3414b));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC11776yG0
    /* renamed from: d */
    public void mo2291d(C9723iC0 c9723iC0, int i) throws IOException {
        int[] iArr = (int[]) this.f2709c;
        try {
            c9723iC0.read((byte[]) this.f2708b, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            c9723iC0.close();
        }
    }

    @Override // p000.InterfaceC6658q5
    /* renamed from: e */
    public Object mo2292e(AbstractC7598Fm0 abstractC7598Fm0, C10753qF0 c10753qF0, AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(c10753qF0, "proto");
        return null;
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: f */
    public ArrayList mo44f(AF0 af0, InterfaceC8392Ut0 interfaceC8392Ut0) {
        O90.m5968f(af0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        Iterable iterable = (List) af0.m25537k(((C1115Rj) this.f2708b).f40200k);
        if (iterable == null) {
            iterable = C0779MN.f7117a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(iterable2));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9108dO1) this.f2709c).m17575s((QE0) it.next(), interfaceC8392Ut0));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: g */
    public ArrayList mo45g(FF0 ff0, InterfaceC8392Ut0 interfaceC8392Ut0) {
        O90.m5968f(ff0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        Iterable iterable = (List) ff0.m25537k(((C1115Rj) this.f2708b).f40201l);
        if (iterable == null) {
            iterable = C0779MN.f7117a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(iterable2));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9108dO1) this.f2709c).m17575s((QE0) it.next(), interfaceC8392Ut0));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: h */
    public List mo46h(AbstractC7598Fm0 abstractC7598Fm0, AbstractC11487w00 abstractC11487w00, int i) {
        List list;
        O90.m5968f(abstractC11487w00, "proto");
        AbstractC0852NX.m5764m(i, "kind");
        boolean z = abstractC11487w00 instanceof VE0;
        C1115Rj c1115Rj = (C1115Rj) this.f2708b;
        if (z) {
            list = (List) ((VE0) abstractC11487w00).m25537k(c1115Rj.f40191b);
        } else if (abstractC11487w00 instanceof C9729iF0) {
            list = (List) ((C9729iF0) abstractC11487w00).m25537k(c1115Rj.f40193d);
        } else {
            if (!(abstractC11487w00 instanceof C10753qF0)) {
                throw new IllegalStateException(("Unknown message: " + abstractC11487w00).toString());
            }
            int iM26247x = AbstractC7222ym.m26247x(i);
            if (iM26247x == 1) {
                list = (List) ((C10753qF0) abstractC11487w00).m25537k(c1115Rj.f40194e);
            } else if (iM26247x == 2) {
                list = (List) ((C10753qF0) abstractC11487w00).m25537k(c1115Rj.f40195f);
            } else {
                if (iM26247x != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((C10753qF0) abstractC11487w00).m25537k(c1115Rj.f40196g);
            }
        }
        if (list == null) {
            list = C0779MN.f7117a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9108dO1) this.f2709c).m17575s((QE0) it.next(), (InterfaceC8392Ut0) abstractC7598Fm0.f3414b));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: i */
    public List mo47i(AbstractC7598Fm0 abstractC7598Fm0, C10753qF0 c10753qF0) {
        O90.m5968f(c10753qF0, "proto");
        ((C1115Rj) this.f2708b).getClass();
        C0779MN c0779mn = C0779MN.f7117a;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(c0779mn));
        Iterator<E> it = c0779mn.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9108dO1) this.f2709c).m17575s((QE0) it.next(), (InterfaceC8392Ut0) abstractC7598Fm0.f3414b));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: j */
    public ArrayList mo48j(PF0 pf0) {
        O90.m5968f(pf0, "container");
        Iterable iterable = (List) pf0.f8945e.m25537k(((C1115Rj) this.f2708b).f40192c);
        if (iterable == null) {
            iterable = C0779MN.f7117a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(iterable2));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9108dO1) this.f2709c).m17575s((QE0) it.next(), (InterfaceC8392Ut0) pf0.f3414b));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: k */
    public List mo49k(PF0 pf0, C9089dF0 c9089dF0) {
        O90.m5968f(pf0, "container");
        Iterable iterable = (List) c9089dF0.m25537k(((C1115Rj) this.f2708b).f40197h);
        if (iterable == null) {
            iterable = C0779MN.f7117a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(iterable2));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9108dO1) this.f2709c).m17575s((QE0) it.next(), (InterfaceC8392Ut0) pf0.f3414b));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC6658q5
    /* renamed from: l */
    public Object mo2293l(AbstractC7598Fm0 abstractC7598Fm0, C10753qF0 c10753qF0, AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(c10753qF0, "proto");
        NE0 ne0 = (NE0) XM1.m8993a(c10753qF0, ((C1115Rj) this.f2708b).f40198i);
        if (ne0 == null) {
            return null;
        }
        return ((C9108dO1) this.f2709c).m17566F(abstractC7742Ig0, ne0, (InterfaceC8392Ut0) abstractC7598Fm0.f3414b);
    }

    /* renamed from: m */
    public void m2294m() {
        Logger logger = (Logger) this.f2709c;
        Logger.DefaultImpls.info$default(logger, "Trying to start the client app service", null, 2, null);
        int i = XT0.f13801j;
        Intent intent = new Intent(ComponentActions.CLIENT_MESSAGING_SERVICE_ACTION);
        Context context = (Context) this.f2708b;
        intent.setPackage(context.getPackageName());
        try {
            context.startService(intent);
        } catch (IllegalStateException e) {
            Logger.DefaultImpls.warn$default(logger, "Unable to start service, possible background limitations: " + e.getMessage(), null, 2, null);
        } catch (Exception e2) {
            logger.warn("Unable to start service", e2);
        }
    }

    /* renamed from: n */
    public int mo1365n(ArrayList arrayList, ExecutorC10151lY0 executorC10151lY0, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f2708b).captureBurst(arrayList, new C6447mm(executorC10151lY0, captureCallback), (Handler) ((C8170Qm0) this.f2709c).f9780b);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0089  */
    @Override // p000.InterfaceC0980PZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFailure(java.lang.Throwable r9) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ES1.onFailure(java.lang.Throwable):void");
    }

    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        ((C6677qO) this.f2709c).f40854l.f42404n.remove((C1408WN) this.f2708b);
    }

    /* renamed from: p */
    public void m2295p() {
        int[] iArr = (int[]) this.f2708b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f2709c = null;
    }

    /* renamed from: q */
    public C1336VE m2296q(EncodedImage encodedImage, C11756y60 c11756y60) {
        AbstractC7292zt abstractC7292ztMo5957a = ((InterfaceC11129tB0) this.f2708b).mo5957a(encodedImage, c11756y60.f46088a);
        try {
            abstractC7292ztMo5957a.getClass();
            T70 t70 = T70.f11167d;
            int rotationAngle = encodedImage.getRotationAngle();
            int exifOrientation = encodedImage.getExifOrientation();
            int i = C1336VE.f12442i;
            C1336VE c1336ve = new C1336VE(abstractC7292ztMo5957a, t70, rotationAngle, exifOrientation);
            Boolean bool = Boolean.FALSE;
            if (C1336VE.f12441h.contains("is_rounded")) {
                c1336ve.f12443a.put("is_rounded", bool);
            }
            return c1336ve;
        } finally {
            AbstractC7292zt.m26569p(abstractC7292ztMo5957a);
        }
    }

    /* renamed from: r */
    public void m2297r(int i) {
        int[] iArr = (int[]) this.f2708b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f2708b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f2708b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f2708b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x011f  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.InterfaceC8398Uw0 m2298s(p000.C11825ye1 r11) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ES1.m2298s(ye1):Uw0");
    }

    @Override // p000.InterfaceC9296es1
    public void subscribe(Activity activity) {
        if (activity instanceof AbstractActivityC1730l) {
            if (((FragmentLifecycleCallback) this.f2709c) == null) {
                this.f2709c = new FragmentLifecycleCallback((InterfaceC9036cq1) this.f2708b, activity);
            }
            C6244jY c6244jYM10034e = ((AbstractActivityC1730l) activity).m10034e();
            c6244jYM10034e.m10066c0((FragmentLifecycleCallback) this.f2709c);
            c6244jYM10034e.m10052R((FragmentLifecycleCallback) this.f2709c);
        }
    }

    /* renamed from: t */
    public File m2299t() {
        if (((File) this.f2708b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f2708b) == null) {
                        C0786MU c0786mu = (C0786MU) this.f2709c;
                        c0786mu.m5379a();
                        this.f2708b = new File(c0786mu.f7174a.getFilesDir(), "PersistedInstallation." + ((C0786MU) this.f2709c).m5381f() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f2708b;
    }

    @Override // p000.InterfaceC9968k61
    public Task then(Object obj) throws Throwable {
        FileWriter fileWriter;
        JSONObject jSONObject = (JSONObject) ((ExecutorC1584ZA) ((C10910rT1) this.f2708b).f41680d).f14763a.submit(new CallableC0361Fj(8, this)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            C1361Vd c1361Vd = (C1361Vd) this.f2709c;
            C10909rT0 c10909rT0 = (C10909rT0) c1361Vd.f12664e;
            c10909rT0.getClass();
            BZ0 bz0Mo3083k = (jSONObject.getInt("settings_version") != 3 ? new C9937jt0(12) : new C4049fN(21)).mo3083k((OJ1) c10909rT0.f41672a, jSONObject);
            long j = bz0Mo3083k.f906c;
            C7391Bm1 c7391Bm1 = (C7391Bm1) c1361Vd.f12665f;
            c7391Bm1.getClass();
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) c7391Bm1.f1022b);
            } catch (Exception unused) {
                fileWriter = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                AbstractC1378Vu.m8619d(fileWriter2);
                throw th;
            }
            AbstractC1378Vu.m8619d(fileWriter);
            jSONObject.toString();
            String str = ((IZ0) c1361Vd.f12663d).f4989f;
            SharedPreferences.Editor editorEdit = ((Context) c1361Vd.f12662c).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            ((AtomicReference) c1361Vd.f12667h).set(bz0Mo3083k);
            ((S81) ((AtomicReference) c1361Vd.f12668i).get()).m7186d(bz0Mo3083k);
        }
        return AbstractC9376fU1.m18244e(null);
    }

    public String toString() {
        switch (this.f2707a) {
            case 7:
                return ((Map) this.f2708b).toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public AbstractC8315Tg1 m2300u(C11818yb0 c11818yb0) {
        AbstractC8315Tg1 abstractC8315Tg1M1236l;
        X01 x01 = c11818yb0.f46331f;
        return (x01 == null || (abstractC8315Tg1M1236l = CZ1.m1236l(x01)) == null) ? (C4177hP) ((F71) this.f2708b).getValue() : abstractC8315Tg1M1236l;
    }

    @Override // p000.InterfaceC9296es1
    public void unsubscribe(Activity activity) {
        if (!(activity instanceof AbstractActivityC1730l) || ((FragmentLifecycleCallback) this.f2709c) == null) {
            return;
        }
        ((AbstractActivityC1730l) activity).m10034e().m10066c0((FragmentLifecycleCallback) this.f2709c);
    }

    @Override // p000.InterfaceC9875jO0
    /* renamed from: v */
    public boolean mo1475v(UnsatisfiedLinkError unsatisfiedLinkError, H21[] h21Arr) {
        String str = ((Context) this.f2708b).getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            return false;
        }
        StringBuilder sbM26240q = AbstractC7222ym.m26240q("Base apk does not exist: ", str, ". ");
        ((C0986Pf) this.f2709c).m6406u(sbM26240q);
        throw new C11858yv0(sbM26240q.toString(), unsatisfiedLinkError);
    }

    /* renamed from: w */
    public AbstractC7742Ig0 m2301w(InterfaceC10292me1 interfaceC10292me1, C11818yb0 c11818yb0) {
        O90.m5968f(interfaceC10292me1, "typeParameter");
        O90.m5968f(c11818yb0, "typeAttr");
        return (AbstractC7742Ig0) ((C8270Sk0) this.f2709c).invoke(new C10676pe1(interfaceC10292me1, c11818yb0));
    }

    /* renamed from: y */
    public Object mo2302y(C10563om0 c10563om0) {
        return (Q01) this.f2709c;
    }

    /* renamed from: z */
    public Object m2303z(float f, float f2, Object obj, Object obj2, float f3, float f4, float f5) {
        C10563om0 c10563om0 = (C10563om0) this.f2708b;
        c10563om0.f39253a = f;
        c10563om0.f39254b = f2;
        c10563om0.f39258f = obj;
        c10563om0.f39259g = obj2;
        c10563om0.f39255c = f3;
        c10563om0.f39256d = f4;
        c10563om0.f39257e = f5;
        return mo2302y(c10563om0);
    }

    public /* synthetic */ ES1(int i, boolean z) {
        this.f2707a = i;
    }

    public /* synthetic */ ES1(Object obj, int i, Object obj2) {
        this.f2707a = i;
        this.f2708b = obj2;
        this.f2709c = obj;
    }

    public /* synthetic */ ES1(Object obj, Object obj2, boolean z, int i) {
        this.f2707a = i;
        this.f2708b = obj;
        this.f2709c = obj2;
    }

    public ES1(InterfaceC9036cq1 interfaceC9036cq1) {
        this.f2707a = 24;
        this.f2708b = interfaceC9036cq1;
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: a */
    public List mo41a(AbstractC7598Fm0 abstractC7598Fm0, AbstractC11487w00 abstractC11487w00, int i) {
        String str;
        O90.m5968f(abstractC11487w00, "proto");
        AbstractC0852NX.m5764m(i, "kind");
        boolean z = abstractC11487w00 instanceof C9729iF0;
        C1115Rj c1115Rj = (C1115Rj) this.f2708b;
        if (z) {
            c1115Rj.getClass();
        } else {
            if (!(abstractC11487w00 instanceof C10753qF0)) {
                throw new IllegalStateException(("Unknown message: " + abstractC11487w00).toString());
            }
            int iM26247x = AbstractC7222ym.m26247x(i);
            if (iM26247x != 1 && iM26247x != 2 && iM26247x != 3) {
                if (i == 1) {
                    str = "FUNCTION";
                } else if (i == 2) {
                    str = "PROPERTY";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "PROPERTY_SETTER";
                } else {
                    str = "PROPERTY_GETTER";
                }
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(str).toString());
            }
            c1115Rj.getClass();
        }
        C0779MN c0779mn = C0779MN.f7117a;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(c0779mn));
        Iterator<E> it = c0779mn.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9108dO1) this.f2709c).m17575s((QE0) it.next(), (InterfaceC8392Ut0) abstractC7598Fm0.f3414b));
        }
        return arrayList;
    }

    public ES1(Context context, Logger logger) {
        this.f2707a = 25;
        O90.m5968f(logger, "logger");
        this.f2708b = context;
        this.f2709c = logger.createLogger("ClientServiceStarter");
    }

    public ES1(NV1 nv1) {
        this.f2707a = 23;
        C8582Yk0 c8582Yk0 = new C8582Yk0("Type parameter upper bound erasure results");
        this.f2708b = AbstractC0705LB.m4915b(new S51(1, this));
        this.f2709c = c8582Yk0.m9350b(new C10115lG0(11, this));
    }

    public ES1(Y31[] y31Arr) {
        this.f2707a = 15;
        this.f2708b = y31Arr;
        this.f2709c = new C7460Cv0(17);
    }

    public ES1(InterfaceC7402Bs0 interfaceC7402Bs0, T71 t71, C1115Rj c1115Rj) {
        this.f2707a = 2;
        O90.m5968f(interfaceC7402Bs0, "module");
        O90.m5968f(c1115Rj, "protocol");
        this.f2708b = c1115Rj;
        this.f2709c = new C9108dO1(interfaceC7402Bs0, t71);
    }

    public ES1(Q01 q01) {
        this.f2707a = 14;
        this.f2708b = new C10563om0();
        this.f2709c = q01;
    }

    public ES1(CameraCaptureSession cameraCaptureSession, C8170Qm0 c8170Qm0) {
        this.f2707a = 5;
        cameraCaptureSession.getClass();
        this.f2708b = cameraCaptureSession;
        this.f2709c = c8170Qm0;
    }

    public ES1(int i) {
        this.f2707a = i;
        switch (i) {
            case 12:
                this.f2708b = new SparseIntArray();
                this.f2709c = new SparseIntArray();
                break;
            case 13:
            default:
                this.f2708b = new C7560Et0();
                this.f2709c = new C11687xZ0();
                m2282C(f2706e);
                break;
            case 14:
                this.f2708b = new C10563om0();
                this.f2709c = null;
                break;
        }
    }

    public ES1(ExecutorService executorService) {
        this.f2707a = 19;
        this.f2709c = new C7119x8();
        this.f2708b = executorService;
    }

    public ES1(File file) {
        this.f2707a = 3;
        this.f2708b = file;
        this.f2709c = new File(file.getPath() + ".bak");
    }

    public ES1(InterfaceC11129tB0 interfaceC11129tB0) {
        this.f2707a = 9;
        this.f2709c = new C9432fw1(11, this);
        this.f2708b = interfaceC11129tB0;
    }
}
