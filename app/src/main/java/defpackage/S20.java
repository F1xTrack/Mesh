package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.regex.Pattern;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class S20 implements InterfaceC2508cP, InterfaceC3591eU1, InterfaceC1490Sw0, InterfaceC8368zT, OmicronEnvironment, Y31, InterfaceC5303jO0, InterfaceC1181Ox0, InterfaceC0940Lv, InterfaceC6053nJ1 {
    public static final H5 b = new H5();
    public static final S20 c = new S20(2);
    public static final /* synthetic */ S20 d = new S20(4);
    public static final S20 e = new S20(5);
    public static final S20 f = new S20(6);
    public static final S20 g = new S20(7);
    public final /* synthetic */ int a;

    public /* synthetic */ S20(int i) {
        this.a = i;
    }

    public static final String i(int i) {
        F71 f71 = C0908Lk.c;
        return i == Integer.MAX_VALUE ? "" : String.valueOf(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.facebook.react.bridge.WritableArray] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.react.bridge.WritableArray] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.facebook.react.bridge.WritableMap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.facebook.react.bridge.WritableArray] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    public static Object l(Object obj, C3759fN c3759fN) throws SecurityException {
        Object objL;
        Object next;
        WritableArray writableArrayL;
        O90.f(c3759fN, "containerProvider");
        Object obj2 = null;
        if (obj == null ? true : obj instanceof C1518Tf1) {
            return null;
        }
        if (obj instanceof Bundle) {
            return AbstractC7909x22.c((Bundle) obj, c3759fN);
        }
        int i = 0;
        if (!(obj instanceof Object[])) {
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                O90.f(iArr, "<this>");
                writableArrayL = c3759fN.l();
                int length = iArr.length;
                while (i < length) {
                    writableArrayL.pushInt(iArr[i]);
                    i++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                O90.f(fArr, "<this>");
                writableArrayL = c3759fN.l();
                int length2 = fArr.length;
                while (i < length2) {
                    writableArrayL.pushDouble(fArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                O90.f(dArr, "<this>");
                writableArrayL = c3759fN.l();
                int length3 = dArr.length;
                while (i < length3) {
                    writableArrayL.pushDouble(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                O90.f(zArr, "<this>");
                writableArrayL = c3759fN.l();
                int length4 = zArr.length;
                while (i < length4) {
                    writableArrayL.pushBoolean(zArr[i]);
                    i++;
                }
            } else {
                if (obj instanceof byte[]) {
                    return FollyDynamicExtensionConverter.a.put(obj);
                }
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    O90.f(map, "<this>");
                    objL = Arguments.createMap();
                    O90.e(objL, "createMap(...)");
                    for (Map.Entry entry : map.entrySet()) {
                        AbstractC7909x22.b(objL, String.valueOf(entry.getKey()), l(entry.getValue(), c3759fN));
                    }
                } else {
                    if (obj instanceof Enum) {
                        Enum r9 = (Enum) obj;
                        O90.f(r9, "<this>");
                        Class<?> cls = r9.getClass();
                        IP0 ip0 = BP0.a;
                        InterfaceC6878re0 interfaceC6878re0B = U22.b(ip0.b(cls));
                        if (interfaceC6878re0B == null) {
                            throw new IllegalArgumentException("Cannot convert enum without the primary constructor to js value");
                        }
                        if (interfaceC6878re0B.getParameters().isEmpty()) {
                            return r9.name();
                        }
                        if (interfaceC6878re0B.getParameters().size() != 1) {
                            throw new IllegalStateException("Enum '" + r9.getClass() + "' cannot be used as return type (incompatible with JS)");
                        }
                        String name = ((C1514Te0) ((InterfaceC1280Qe0) AbstractC8069xu.A(interfaceC6878re0B.getParameters()))).getName();
                        O90.c(name);
                        Collection collectionA = ((C1979Zd0) ((C3430de0) ip0.b(r9.getClass())).c.getValue()).a();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : collectionA) {
                            AbstractC1589Ud0 abstractC1589Ud0 = (AbstractC1589Ud0) obj3;
                            if (!(abstractC1589Ud0.p().t0() != null) && (abstractC1589Ud0 instanceof InterfaceC3433df0)) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next2 = it.next();
                            if (O90.a(((InterfaceC3433df0) next2).getName(), name)) {
                                obj2 = next2;
                                break;
                            }
                        }
                        O90.d(obj2, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Enum<*>, *>");
                        return ((InterfaceC3433df0) obj2).get(r9);
                    }
                    if (obj instanceof RN0) {
                        RN0 rn0 = (RN0) obj;
                        O90.f(rn0, "<this>");
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        O90.e(writableMapCreateMap, "createMap(...)");
                        ArrayList arrayListA = U22.a(P22.e(rn0.getClass()));
                        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayListA));
                        Iterator it2 = arrayListA.iterator();
                        while (it2.hasNext()) {
                            InterfaceC3433df0 interfaceC3433df0 = (InterfaceC3433df0) it2.next();
                            Iterator it3 = interfaceC3433df0.getAnnotations().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                if (((Annotation) next) instanceof InterfaceC2330bT) {
                                    break;
                                }
                            }
                            InterfaceC2330bT interfaceC2330bT = (InterfaceC2330bT) next;
                            if (interfaceC2330bT != null) {
                                String strKey = interfaceC2330bT.key();
                                if (O90.a(strKey, "")) {
                                    strKey = null;
                                }
                                if (strKey == null) {
                                    strKey = interfaceC3433df0.getName();
                                }
                                if (interfaceC3433df0 instanceof InterfaceC0579He0) {
                                    Field fieldB = AbstractC6262oP1.b(interfaceC3433df0);
                                    if (fieldB != null) {
                                        fieldB.setAccessible(true);
                                    }
                                    Method methodC = AbstractC6262oP1.c(interfaceC3433df0.c());
                                    if (methodC != null) {
                                        methodC.setAccessible(true);
                                    }
                                    Method methodC2 = AbstractC6262oP1.c(((InterfaceC0579He0) interfaceC3433df0).d());
                                    if (methodC2 != null) {
                                        methodC2.setAccessible(true);
                                    }
                                } else {
                                    Field fieldB2 = AbstractC6262oP1.b(interfaceC3433df0);
                                    if (fieldB2 != null) {
                                        fieldB2.setAccessible(true);
                                    }
                                    Method methodC3 = AbstractC6262oP1.c(interfaceC3433df0.c());
                                    if (methodC3 != null) {
                                        methodC3.setAccessible(true);
                                    }
                                }
                                AbstractC7909x22.b(writableMapCreateMap, strKey, l(interfaceC3433df0.get(rn0), c3759fN));
                            }
                            arrayList2.add(C1518Tf1.a);
                        }
                        return writableMapCreateMap;
                    }
                    if (obj instanceof URI) {
                        URI uri = (URI) obj;
                        O90.f(uri, "<this>");
                        String string = uri.toString();
                        O90.e(string, "toString(...)");
                        return string;
                    }
                    if (obj instanceof URL) {
                        URL url = (URL) obj;
                        O90.f(url, "<this>");
                        String string2 = url.toString();
                        O90.e(string2, "toString(...)");
                        return string2;
                    }
                    if (obj instanceof Uri) {
                        Uri uri2 = (Uri) obj;
                        O90.f(uri2, "<this>");
                        String string3 = uri2.toString();
                        O90.e(string3, "toString(...)");
                        return string3;
                    }
                    if (obj instanceof File) {
                        File file = (File) obj;
                        O90.f(file, "<this>");
                        String absolutePath = file.getAbsolutePath();
                        O90.e(absolutePath, "getAbsolutePath(...)");
                        return absolutePath;
                    }
                    if (obj instanceof Pair) {
                        Pair pair = (Pair) obj;
                        O90.f(pair, "<this>");
                        objL = c3759fN.l();
                        Object objL2 = l(pair.a, c3759fN);
                        Object objL3 = l(pair.b, c3759fN);
                        AbstractC7909x22.a(objL, objL2);
                        AbstractC7909x22.a(objL, objL3);
                    } else {
                        if (obj instanceof Long) {
                            return Double.valueOf(((Number) obj).longValue());
                        }
                        if (obj instanceof InterfaceC6625qJ0) {
                            return ((InterfaceC6625qJ0) obj).b();
                        }
                        if (!(obj instanceof Iterable)) {
                            return obj;
                        }
                        Iterable iterable = (Iterable) obj;
                        O90.f(iterable, "<this>");
                        objL = c3759fN.l();
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            AbstractC7909x22.a(objL, l(it4.next(), c3759fN));
                        }
                    }
                }
            }
            return writableArrayL;
        }
        Object[] objArr = (Object[]) obj;
        O90.f(objArr, "<this>");
        objL = c3759fN.l();
        int length5 = objArr.length;
        while (i < length5) {
            AbstractC7909x22.a(objL, l(objArr[i], c3759fN));
            i++;
        }
        return objL;
    }

    public static C0908Lk s(String str) throws NumberFormatException {
        if (str == null) {
            return null;
        }
        try {
            Object value = C0908Lk.c.getValue();
            O90.e(value, "<get-headerParsingRegEx>(...)");
            String[] strArrSplit = ((Pattern) value).split(str);
            if (!(strArrSplit.length == 4)) {
                throw new IllegalArgumentException();
            }
            if (!O90.a(strArrSplit[0], "bytes")) {
                throw new IllegalArgumentException();
            }
            String str2 = strArrSplit[1];
            O90.e(str2, "headerParts[1]");
            int i = Integer.parseInt(str2);
            String str3 = strArrSplit[2];
            O90.e(str3, "headerParts[2]");
            int i2 = Integer.parseInt(str3);
            String str4 = strArrSplit[3];
            O90.e(str4, "headerParts[3]");
            int i3 = Integer.parseInt(str4);
            if (!(i2 > i)) {
                throw new IllegalArgumentException();
            }
            if (i3 > i2) {
                return i2 < i3 - 1 ? new C0908Lk(i, i2) : new C0908Lk(i, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{str}, 1)), e2);
        }
    }

    public static Path t(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x004f  */
    @Override // defpackage.Y31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] E(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 1
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L61
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L4f
        L26:
            r11 = r3
        L27:
            if (r11 >= r10) goto L3b
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L38
            goto L4f
        L38:
            int r11 = r11 + 1
            goto L27
        L3b:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L4b
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L4b:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L57
        L4f:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r2
            r8 = r4
        L57:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r3, r0, r3, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6a
            return r0
        L6a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S20.E(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // defpackage.InterfaceC8368zT
    public Class a() {
        return InputStream.class;
    }

    @Override // defpackage.InterfaceC3591eU1
    public boolean b(Class cls) {
        return AbstractC6843rS1.class.isAssignableFrom(cls);
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        return new TreeSet();
    }

    @Override // defpackage.InterfaceC3591eU1
    public YU1 d(Class cls) {
        if (!AbstractC6843rS1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (YU1) AbstractC6843rS1.f(cls.asSubclass(AbstractC6843rS1.class)).d(3);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
        }
    }

    @Override // defpackage.InterfaceC8368zT
    public Object e(File file) {
        return new FileInputStream(file);
    }

    @Override // defpackage.InterfaceC2508cP
    public void f(InterfaceC8042xl interfaceC8042xl) {
        O90.f(interfaceC8042xl, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + interfaceC8042xl);
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(c1241Pr0);
    }

    @Override // defpackage.InterfaceC2508cP
    public void h(InterfaceC7492us interfaceC7492us, ArrayList arrayList) {
        O90.f(interfaceC7492us, "descriptor");
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC7492us.getName() + ", unresolved classes " + arrayList);
    }

    @Override // defpackage.InterfaceC8368zT
    public void j(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [vn] */
    public Object k(Object obj) throws C7730w60 {
        C5499kQ c5499kQ;
        C5923me c5923me = (C5923me) obj;
        InterfaceC3903g70 interfaceC3903g70 = c5923me.b;
        OD0 od0 = c5923me.a;
        if (AbstractC5237j22.b(interfaceC3903g70.j0())) {
            try {
                C6987sD c6987sD = C5499kQ.b;
                ByteBuffer byteBufferC = interfaceC3903g70.u()[0].C();
                byteBufferC.rewind();
                byte[] bArr = new byte[byteBufferC.capacity()];
                byteBufferC.get(bArr);
                c5499kQ = new C5499kQ(new C7979xQ(new ByteArrayInputStream(bArr)));
                interfaceC3903g70.u()[0].C().rewind();
            } catch (IOException e2) {
                throw new C7730w60("Failed to extract EXIF data.", e2);
            }
        } else {
            c5499kQ = null;
        }
        if (((ImageCaptureRotationOptionQuirk) AbstractC7005sJ.a.z0(ImageCaptureRotationOptionQuirk.class)) != null) {
            C0572Hc c0572Hc = C1702Vp.i;
        } else if (AbstractC5237j22.b(interfaceC3903g70.j0())) {
            AbstractC3377dM1.h(c5499kQ, "JPEG image must have exif.");
            Size size = new Size(interfaceC3903g70.getWidth(), interfaceC3903g70.getHeight());
            int iC = od0.e - c5499kQ.c();
            Size size2 = AbstractC7255tc1.c(AbstractC7255tc1.h(iC)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixA = AbstractC7255tc1.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iC, false);
            RectF rectF = new RectF(od0.d);
            matrixA.mapRect(rectF);
            rectF.sort();
            Rect rect = new Rect();
            rectF.round(rect);
            int iC2 = c5499kQ.c();
            Matrix matrix = new Matrix(od0.g);
            matrix.postConcat(matrixA);
            InterfaceC7668vn c0084Av0 = interfaceC3903g70.P() instanceof C7858wn ? ((C7858wn) interfaceC3903g70.P()).a : new C0084Av0(9);
            interfaceC3903g70.j0();
            return new C4192he(interfaceC3903g70, c5499kQ, interfaceC3903g70.j0(), size2, rect, iC2, matrix, c0084Av0);
        }
        Rect rect2 = od0.d;
        C0084Av0 c0084Av02 = interfaceC3903g70.P() instanceof C7858wn ? ((C7858wn) interfaceC3903g70.P()).a : new C0084Av0(9);
        int i = od0.e;
        Matrix matrix2 = od0.g;
        Size size3 = new Size(interfaceC3903g70.getWidth(), interfaceC3903g70.getHeight());
        if (AbstractC5237j22.b(interfaceC3903g70.j0())) {
            AbstractC3377dM1.h(c5499kQ, "JPEG image must have Exif.");
        }
        return new C4192he(interfaceC3903g70, c5499kQ, interfaceC3903g70.j0(), size3, rect2, i, matrix2, c0084Av02);
    }

    public void m(File file) throws IOException {
        O90.f(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException(AbstractC1705Vq.g(file, "failed to delete "));
        }
    }

    public void n(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(AbstractC1705Vq.g(file, "not a readable directory: "));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                n(file2);
            }
            if (!file2.delete()) {
                throw new IOException(AbstractC1705Vq.g(file2, "failed to delete "));
            }
        }
    }

    @Override // com.vk.push.core.remote.config.omicron.OmicronEnvironment
    public String name() {
        return "ALPHA";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:368:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0346  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [Dw0] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [Ya0] */
    /* JADX WARN: Type inference failed for: r14v10, types: [Dw0] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51, types: [Dw0] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [Bt0] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.AbstractC0663Ig0 o(defpackage.C5818m5 r24, defpackage.AbstractC0663Ig0 r25, java.util.List r26, defpackage.C2174ae1 r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S20.o(m5, Ig0, java.util.List, ae1, boolean):Ig0");
    }

    public AbstractC0663Ig0 p(InterfaceC1658Va0 interfaceC1658Va0, InterfaceC7662vl interfaceC7662vl, boolean z, C6045nH c6045nH, B5 b5, C2174ae1 c2174ae1, boolean z2, InterfaceC6099nZ interfaceC6099nZ) {
        C5818m5 c5818m5 = new C5818m5((ED) interfaceC7662vl, z, c6045nH, b5, false);
        AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) interfaceC6099nZ.invoke(interfaceC1658Va0);
        Collection collectionJ = interfaceC1658Va0.j();
        O90.e(collectionJ, "getOverriddenDescriptors(...)");
        Collection<InterfaceC8042xl> collection = collectionJ;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(collection));
        for (InterfaceC8042xl interfaceC8042xl : collection) {
            O90.c(interfaceC8042xl);
            arrayList.add((AbstractC0663Ig0) interfaceC6099nZ.invoke(interfaceC8042xl));
        }
        return o(c5818m5, abstractC0663Ig0, arrayList, c2174ae1, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:256:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x029a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x030c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r27v0, types: [S20] */
    /* JADX WARN: Type inference failed for: r3v3, types: [CD, vl, xl] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [Va0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList q(defpackage.C6045nH r28, java.util.Collection r29) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S20.q(nH, java.util.Collection):java.util.ArrayList");
    }

    public boolean r(File file) {
        O90.f(file, "file");
        return file.exists();
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "FileSystem.SYSTEM";
            default:
                return super.toString();
        }
    }

    public void u(File file, File file2) throws IOException {
        O90.f(file, "from");
        O90.f(file2, "to");
        m(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    @Override // defpackage.InterfaceC5303jO0
    public boolean v(UnsatisfiedLinkError unsatisfiedLinkError, H21[] h21Arr) {
        String str = unsatisfiedLinkError instanceof G21 ? ((G21) unsatisfiedLinkError).a : null;
        Objects.toString(unsatisfiedLinkError);
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (H21 h21 : h21Arr) {
            if (h21 instanceof AbstractC7076sg1) {
                AbstractC7076sg1 abstractC7076sg1 = (AbstractC7076sg1) h21;
                h21.b();
                abstractC7076sg1.getClass();
                File file = abstractC7076sg1.a;
                try {
                    J71.d(file, new File(file, "dso_lock")).close();
                } catch (Exception unused) {
                    Objects.toString(file);
                }
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 27:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.d0.a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C6095nX1.b.get();
                Boolean bool = (Boolean) C7049sX1.a.a();
                bool.getClass();
                return bool;
            default:
                PW1.b.get();
                Long l = (Long) UW1.e.a();
                l.getClass();
                return l;
        }
    }

    public /* synthetic */ S20(int i, Object obj) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC1181Ox0
    public void onComplete(Throwable th) {
    }
}
