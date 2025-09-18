package defpackage;

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
import androidx.fragment.app.l;
import com.facebook.imagepipeline.image.EncodedImage;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.ComponentActions;
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
public class ES1 implements InterfaceC6582q5, InterfaceC5303jO0, PZ, Y31, InterfaceC8140yG0, InterfaceC5441k61, InterfaceC6780r71, InterfaceC3663es1, InterfaceC3660er1, RemoteCall {
    public static final C7320ty0 d = new C7320ty0();
    public static final C7129sy0 e = new C7129sy0();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ ES1(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public static String o(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    public static int x(int i, int i2) {
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

    public void A(C5541ke c5541ke) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c5541ke.a);
            jSONObject.put("Status", AbstractC8235ym.x(c5541ke.b));
            jSONObject.put("AuthToken", c5541ke.c);
            jSONObject.put("RefreshToken", c5541ke.d);
            jSONObject.put("TokenCreationEpochInSecs", c5541ke.f);
            jSONObject.put("ExpiresInSecs", c5541ke.e);
            jSONObject.put("FisError", c5541ke.g);
            MU mu = (MU) this.c;
            mu.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", mu.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(t())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void B() {
        ((SparseIntArray) this.b).clear();
    }

    public void C(SI1 si1) {
        ((C0390Et0) this.b).k(si1);
        boolean z = si1 instanceof C7320ty0;
        C8007xZ0 c8007xZ0 = (C8007xZ0) this.c;
        if (z) {
            c8007xZ0.j((C7320ty0) si1);
        } else if (si1 instanceof C6938ry0) {
            c8007xZ0.k(((C6938ry0) si1).b);
        }
    }

    public void D(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        r(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2257b41 c2257b41 = (C2257b41) ((ArrayList) this.c).get(size);
            int i4 = c2257b41.a;
            if (i4 >= i) {
                c2257b41.a = i4 + i2;
            }
        }
    }

    @Override // defpackage.Y31
    public StackTraceElement[] E(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        Y31[] y31Arr = (Y31[]) this.b;
        StackTraceElement[] stackTraceElementArrE = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            Y31 y31 = y31Arr[i];
            if (stackTraceElementArrE.length <= 1024) {
                break;
            }
            stackTraceElementArrE = y31.E(stackTraceElementArr);
        }
        return stackTraceElementArrE.length > 1024 ? ((C0240Cv0) this.c).E(stackTraceElementArrE) : stackTraceElementArrE;
    }

    public void F(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        r(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2257b41 c2257b41 = (C2257b41) ((ArrayList) this.c).get(size);
            int i4 = c2257b41.a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.c).remove(size);
                } else {
                    c2257b41.a = i4 - i2;
                }
            }
        }
    }

    public void G(Exception exc) {
        ((C1484Su0) this.c).getClass();
        AbstractC2139aT abstractC2139aT = (AbstractC2139aT) this.b;
        E90 e90 = (E90) abstractC2139aT.a();
        RD0 rd0 = abstractC2139aT.b;
        e90.e(rd0, "NetworkFetchProducer", exc, null);
        ((E90) abstractC2139aT.a()).f(rd0, "NetworkFetchProducer", false);
        ((C7647vg) rd0).k("network", "default");
        abstractC2139aT.a.e(exc);
    }

    public void H(InputStream inputStream, int i) {
        C7678vq0 c7678vq0;
        AbstractC4368iZ.b();
        C1484Su0 c1484Su0 = (C1484Su0) this.c;
        VH vh = (VH) c1484Su0.b;
        if (i > 0) {
            vh.getClass();
            c7678vq0 = new C7678vq0((AbstractC6914rq0) vh.b, i);
        } else {
            vh.getClass();
            AbstractC6914rq0 abstractC6914rq0 = (AbstractC6914rq0) vh.b;
            c7678vq0 = new C7678vq0(abstractC6914rq0, abstractC6914rq0.j[0]);
        }
        E00 e00 = (E00) c1484Su0.c;
        byte[] bArr = (byte[]) e00.get(16384);
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                AbstractC2139aT abstractC2139aT = (AbstractC2139aT) this.b;
                if (i2 < 0) {
                    ((AbstractC8355zO1) c1484Su0.d).e(abstractC2139aT);
                    c1484Su0.c(c7678vq0, abstractC2139aT);
                    e00.d(bArr);
                    c7678vq0.close();
                    AbstractC4368iZ.b();
                    return;
                }
                if (i2 > 0) {
                    c7678vq0.write(bArr, 0, i2);
                    c1484Su0.d(c7678vq0, abstractC2139aT);
                    abstractC2139aT.a.i(i > 0 ? c7678vq0.c / i : 1.0f - ((float) Math.exp((-r5) / 50000.0d)));
                }
            } catch (Throwable th) {
                e00.d(bArr);
                c7678vq0.close();
                throw th;
            }
        }
    }

    public C5541ke I() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(t());
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
        int i2 = AbstractC8235ym.C(5)[iOptInt];
        if (i2 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i2 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C5541ke(strOptString, i2, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public int J(CaptureRequest captureRequest, ExecutorC5715lY0 executorC5715lY0, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.b).setRepeatingRequest(captureRequest, new C5947mm(executorC5715lY0, captureCallback), (Handler) ((C1304Qm0) this.c).b);
    }

    public M9 K() throws IOException {
        File file = (File) this.b;
        if (file.exists()) {
            File file2 = (File) this.c;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                AbstractC6789rA1.h("Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new M9(file);
        } catch (FileNotFoundException e2) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException(AbstractC1705Vq.g(file, "Couldn't create "), e2);
            }
            try {
                return new M9(file);
            } catch (FileNotFoundException e3) {
                throw new IOException(AbstractC1705Vq.g(file, "Couldn't create "), e3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.C6482pZ0 L(defpackage.C7833we1 r17, java.util.List r18, defpackage.C8203yb0 r19) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ES1.L(we1, java.util.List, yb0):pZ0");
    }

    public void M() throws JSONException {
        FR1 fr1 = (FR1) this.c;
        SparseArray sparseArrayD1 = fr1.t1().D1();
        C8382zX1 c8382zX1 = (C8382zX1) this.b;
        sparseArrayD1.put(c8382zX1.c, Long.valueOf(c8382zX1.b));
        UM1 um1T1 = fr1.t1();
        int[] iArr = new int[sparseArrayD1.size()];
        long[] jArr = new long[sparseArrayD1.size()];
        for (int i = 0; i < sparseArrayD1.size(); i++) {
            iArr[i] = sparseArrayD1.keyAt(i);
            jArr[i] = ((Long) sparseArrayD1.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        um1T1.p.V(bundle);
    }

    @Override // defpackage.InterfaceC4042gr1
    public Object a() {
        return new C8077xw1(((C3851fr1) this.b).a, (C0085Av1) ((InterfaceC4042gr1) this.c).a());
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Api.ClientKey clientKey = RB1.a;
        ((C8325zE1) obj).m((PendingIntent) this.b, (LocationRequest) this.c, (S81) obj2);
    }

    @Override // defpackage.A5
    public List b(AbstractC0447Fm0 abstractC0447Fm0, C6613qF0 c6613qF0) {
        O90.f(c6613qF0, "proto");
        ((C1372Rj) this.b).getClass();
        MN mn = MN.a;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(mn));
        Iterator<E> it = mn.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3383dO1) this.c).s((QE0) it.next(), (InterfaceC1637Ut0) abstractC0447Fm0.b));
        }
        return arrayList;
    }

    @Override // defpackage.A5
    public List c(AbstractC0447Fm0 abstractC0447Fm0, AbstractC7709w00 abstractC7709w00, int i, int i2, IF0 if0) {
        O90.f(abstractC7709w00, "callableProto");
        NX.m(i, "kind");
        Iterable iterable = (List) if0.k(((C1372Rj) this.b).j);
        if (iterable == null) {
            iterable = MN.a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(iterable2));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3383dO1) this.c).s((QE0) it.next(), (InterfaceC1637Ut0) abstractC0447Fm0.b));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC8140yG0
    public void d(C4300iC0 c4300iC0, int i) throws IOException {
        int[] iArr = (int[]) this.c;
        try {
            c4300iC0.read((byte[]) this.b, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            c4300iC0.close();
        }
    }

    @Override // defpackage.InterfaceC6582q5
    public Object e(AbstractC0447Fm0 abstractC0447Fm0, C6613qF0 c6613qF0, AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(c6613qF0, "proto");
        return null;
    }

    @Override // defpackage.A5
    public ArrayList f(AF0 af0, InterfaceC1637Ut0 interfaceC1637Ut0) {
        O90.f(af0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        Iterable iterable = (List) af0.k(((C1372Rj) this.b).k);
        if (iterable == null) {
            iterable = MN.a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(iterable2));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3383dO1) this.c).s((QE0) it.next(), interfaceC1637Ut0));
        }
        return arrayList;
    }

    @Override // defpackage.A5
    public ArrayList g(FF0 ff0, InterfaceC1637Ut0 interfaceC1637Ut0) {
        O90.f(ff0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        Iterable iterable = (List) ff0.k(((C1372Rj) this.b).l);
        if (iterable == null) {
            iterable = MN.a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(iterable2));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3383dO1) this.c).s((QE0) it.next(), interfaceC1637Ut0));
        }
        return arrayList;
    }

    @Override // defpackage.A5
    public List h(AbstractC0447Fm0 abstractC0447Fm0, AbstractC7709w00 abstractC7709w00, int i) {
        List list;
        O90.f(abstractC7709w00, "proto");
        NX.m(i, "kind");
        boolean z = abstractC7709w00 instanceof VE0;
        C1372Rj c1372Rj = (C1372Rj) this.b;
        if (z) {
            list = (List) ((VE0) abstractC7709w00).k(c1372Rj.b);
        } else if (abstractC7709w00 instanceof C4309iF0) {
            list = (List) ((C4309iF0) abstractC7709w00).k(c1372Rj.d);
        } else {
            if (!(abstractC7709w00 instanceof C6613qF0)) {
                throw new IllegalStateException(("Unknown message: " + abstractC7709w00).toString());
            }
            int iX = AbstractC8235ym.x(i);
            if (iX == 1) {
                list = (List) ((C6613qF0) abstractC7709w00).k(c1372Rj.e);
            } else if (iX == 2) {
                list = (List) ((C6613qF0) abstractC7709w00).k(c1372Rj.f);
            } else {
                if (iX != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((C6613qF0) abstractC7709w00).k(c1372Rj.g);
            }
        }
        if (list == null) {
            list = MN.a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3383dO1) this.c).s((QE0) it.next(), (InterfaceC1637Ut0) abstractC0447Fm0.b));
        }
        return arrayList;
    }

    @Override // defpackage.A5
    public List i(AbstractC0447Fm0 abstractC0447Fm0, C6613qF0 c6613qF0) {
        O90.f(c6613qF0, "proto");
        ((C1372Rj) this.b).getClass();
        MN mn = MN.a;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(mn));
        Iterator<E> it = mn.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3383dO1) this.c).s((QE0) it.next(), (InterfaceC1637Ut0) abstractC0447Fm0.b));
        }
        return arrayList;
    }

    @Override // defpackage.A5
    public ArrayList j(PF0 pf0) {
        O90.f(pf0, "container");
        Iterable iterable = (List) pf0.e.k(((C1372Rj) this.b).c);
        if (iterable == null) {
            iterable = MN.a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(iterable2));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3383dO1) this.c).s((QE0) it.next(), (InterfaceC1637Ut0) pf0.b));
        }
        return arrayList;
    }

    @Override // defpackage.A5
    public List k(PF0 pf0, C3355dF0 c3355dF0) {
        O90.f(pf0, "container");
        Iterable iterable = (List) c3355dF0.k(((C1372Rj) this.b).h);
        if (iterable == null) {
            iterable = MN.a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(iterable2));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3383dO1) this.c).s((QE0) it.next(), (InterfaceC1637Ut0) pf0.b));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC6582q5
    public Object l(AbstractC0447Fm0 abstractC0447Fm0, C6613qF0 c6613qF0, AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(c6613qF0, "proto");
        NE0 ne0 = (NE0) XM1.a(c6613qF0, ((C1372Rj) this.b).i);
        if (ne0 == null) {
            return null;
        }
        return ((C3383dO1) this.c).F(abstractC0663Ig0, ne0, (InterfaceC1637Ut0) abstractC0447Fm0.b);
    }

    public void m() {
        Logger logger = (Logger) this.c;
        Logger.DefaultImpls.info$default(logger, "Trying to start the client app service", null, 2, null);
        int i = XT0.j;
        Intent intent = new Intent(ComponentActions.CLIENT_MESSAGING_SERVICE_ACTION);
        Context context = (Context) this.b;
        intent.setPackage(context.getPackageName());
        try {
            context.startService(intent);
        } catch (IllegalStateException e2) {
            Logger.DefaultImpls.warn$default(logger, "Unable to start service, possible background limitations: " + e2.getMessage(), null, 2, null);
        } catch (Exception e3) {
            logger.warn("Unable to start service", e3);
        }
    }

    public int n(ArrayList arrayList, ExecutorC5715lY0 executorC5715lY0, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.b).captureBurst(arrayList, new C5947mm(executorC5715lY0, captureCallback), (Handler) ((C1304Qm0) this.c).b);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0089  */
    @Override // defpackage.PZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFailure(java.lang.Throwable r9) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ES1.onFailure(java.lang.Throwable):void");
    }

    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        ((C6639qO) this.c).l.n.remove((WN) this.b);
    }

    public void p() {
        int[] iArr = (int[]) this.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.c = null;
    }

    public VE q(EncodedImage encodedImage, C8110y60 c8110y60) {
        AbstractC8446zt abstractC8446ztA = ((InterfaceC7173tB0) this.b).a(encodedImage, c8110y60.a);
        try {
            abstractC8446ztA.getClass();
            T70 t70 = T70.d;
            int rotationAngle = encodedImage.getRotationAngle();
            int exifOrientation = encodedImage.getExifOrientation();
            int i = VE.i;
            VE ve = new VE(abstractC8446ztA, t70, rotationAngle, exifOrientation);
            Boolean bool = Boolean.FALSE;
            if (VE.h.contains("is_rounded")) {
                ve.a.put("is_rounded", bool);
            }
            return ve;
        } finally {
            AbstractC8446zt.p(abstractC8446ztA);
        }
    }

    public void r(int i) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.InterfaceC1646Uw0 s(defpackage.C8213ye1 r11) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ES1.s(ye1):Uw0");
    }

    @Override // defpackage.InterfaceC3663es1
    public void subscribe(Activity activity) {
        if (activity instanceof l) {
            if (((FragmentLifecycleCallback) this.c) == null) {
                this.c = new FragmentLifecycleCallback((InterfaceC3276cq1) this.b, activity);
            }
            C5332jY c5332jYE = ((l) activity).e();
            c5332jYE.c0((FragmentLifecycleCallback) this.c);
            c5332jYE.R((FragmentLifecycleCallback) this.c);
        }
    }

    public File t() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        MU mu = (MU) this.c;
                        mu.a();
                        this.b = new File(mu.a.getFilesDir(), "PersistedInstallation." + ((MU) this.c).f() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    @Override // defpackage.InterfaceC5441k61
    public Task then(Object obj) throws Throwable {
        FileWriter fileWriter;
        JSONObject jSONObject = (JSONObject) ((ZA) ((C6846rT1) this.b).d).a.submit(new CallableC0437Fj(8, this)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            C1666Vd c1666Vd = (C1666Vd) this.c;
            C6845rT0 c6845rT0 = (C6845rT0) c1666Vd.e;
            c6845rT0.getClass();
            BZ0 bz0K = (jSONObject.getInt("settings_version") != 3 ? new C5396jt0(12) : new C3759fN(21)).k((OJ1) c6845rT0.a, jSONObject);
            long j = bz0K.c;
            C0136Bm1 c0136Bm1 = (C0136Bm1) c1666Vd.f;
            c0136Bm1.getClass();
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) c0136Bm1.b);
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
                AbstractC1717Vu.d(fileWriter2);
                throw th;
            }
            AbstractC1717Vu.d(fileWriter);
            jSONObject.toString();
            String str = ((IZ0) c1666Vd.d).f;
            SharedPreferences.Editor editorEdit = ((Context) c1666Vd.c).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            ((AtomicReference) c1666Vd.h).set(bz0K);
            ((S81) ((AtomicReference) c1666Vd.i).get()).d(bz0K);
        }
        return AbstractC3782fU1.e(null);
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return ((Map) this.b).toString();
            default:
                return super.toString();
        }
    }

    public AbstractC1521Tg1 u(C8203yb0 c8203yb0) {
        AbstractC1521Tg1 abstractC1521Tg1L;
        X01 x01 = c8203yb0.f;
        return (x01 == null || (abstractC1521Tg1L = CZ1.l(x01)) == null) ? (C4147hP) ((F71) this.b).getValue() : abstractC1521Tg1L;
    }

    @Override // defpackage.InterfaceC3663es1
    public void unsubscribe(Activity activity) {
        if (!(activity instanceof l) || ((FragmentLifecycleCallback) this.c) == null) {
            return;
        }
        ((l) activity).e().c0((FragmentLifecycleCallback) this.c);
    }

    @Override // defpackage.InterfaceC5303jO0
    public boolean v(UnsatisfiedLinkError unsatisfiedLinkError, H21[] h21Arr) {
        String str = ((Context) this.b).getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            return false;
        }
        StringBuilder sbQ = AbstractC8235ym.q("Base apk does not exist: ", str, ". ");
        ((C1204Pf) this.c).u(sbQ);
        throw new C8263yv0(sbQ.toString(), unsatisfiedLinkError);
    }

    public AbstractC0663Ig0 w(InterfaceC5925me1 interfaceC5925me1, C8203yb0 c8203yb0) {
        O90.f(interfaceC5925me1, "typeParameter");
        O90.f(c8203yb0, "typeAttr");
        return (AbstractC0663Ig0) ((C1454Sk0) this.c).invoke(new C6498pe1(interfaceC5925me1, c8203yb0));
    }

    public Object y(C6330om0 c6330om0) {
        return (Q01) this.c;
    }

    public Object z(float f, float f2, Object obj, Object obj2, float f3, float f4, float f5) {
        C6330om0 c6330om0 = (C6330om0) this.b;
        c6330om0.a = f;
        c6330om0.b = f2;
        c6330om0.f = obj;
        c6330om0.g = obj2;
        c6330om0.c = f3;
        c6330om0.d = f4;
        c6330om0.e = f5;
        return y(c6330om0);
    }

    public /* synthetic */ ES1(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ ES1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public /* synthetic */ ES1(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public ES1(InterfaceC3276cq1 interfaceC3276cq1) {
        this.a = 24;
        this.b = interfaceC3276cq1;
    }

    @Override // defpackage.A5
    public List a(AbstractC0447Fm0 abstractC0447Fm0, AbstractC7709w00 abstractC7709w00, int i) {
        String str;
        O90.f(abstractC7709w00, "proto");
        NX.m(i, "kind");
        boolean z = abstractC7709w00 instanceof C4309iF0;
        C1372Rj c1372Rj = (C1372Rj) this.b;
        if (z) {
            c1372Rj.getClass();
        } else {
            if (!(abstractC7709w00 instanceof C6613qF0)) {
                throw new IllegalStateException(("Unknown message: " + abstractC7709w00).toString());
            }
            int iX = AbstractC8235ym.x(i);
            if (iX != 1 && iX != 2 && iX != 3) {
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
            c1372Rj.getClass();
        }
        MN mn = MN.a;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(mn));
        Iterator<E> it = mn.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3383dO1) this.c).s((QE0) it.next(), (InterfaceC1637Ut0) abstractC0447Fm0.b));
        }
        return arrayList;
    }

    public ES1(Context context, Logger logger) {
        this.a = 25;
        O90.f(logger, "logger");
        this.b = context;
        this.c = logger.createLogger("ClientServiceStarter");
    }

    public ES1(NV1 nv1) {
        this.a = 23;
        C1922Yk0 c1922Yk0 = new C1922Yk0("Type parameter upper bound erasure results");
        this.b = LB.b(new S51(1, this));
        this.c = c1922Yk0.b(new C5661lG0(11, this));
    }

    public ES1(Y31[] y31Arr) {
        this.a = 15;
        this.b = y31Arr;
        this.c = new C0240Cv0(17);
    }

    public ES1(InterfaceC0153Bs0 interfaceC0153Bs0, T71 t71, C1372Rj c1372Rj) {
        this.a = 2;
        O90.f(interfaceC0153Bs0, "module");
        O90.f(c1372Rj, "protocol");
        this.b = c1372Rj;
        this.c = new C3383dO1(interfaceC0153Bs0, t71);
    }

    public ES1(Q01 q01) {
        this.a = 14;
        this.b = new C6330om0();
        this.c = q01;
    }

    public ES1(CameraCaptureSession cameraCaptureSession, C1304Qm0 c1304Qm0) {
        this.a = 5;
        cameraCaptureSession.getClass();
        this.b = cameraCaptureSession;
        this.c = c1304Qm0;
    }

    public ES1(int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.b = new SparseIntArray();
                this.c = new SparseIntArray();
                break;
            case 13:
            default:
                this.b = new C0390Et0();
                this.c = new C8007xZ0();
                C(e);
                break;
            case 14:
                this.b = new C6330om0();
                this.c = null;
                break;
        }
    }

    public ES1(ExecutorService executorService) {
        this.a = 19;
        this.c = new C7925x8();
        this.b = executorService;
    }

    public ES1(File file) {
        this.a = 3;
        this.b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    public ES1(InterfaceC7173tB0 interfaceC7173tB0) {
        this.a = 9;
        this.c = new C3866fw1(11, this);
        this.b = interfaceC7173tB0;
    }
}
