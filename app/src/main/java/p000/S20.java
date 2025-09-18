package p000;

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
import com.huawei.hms.adapter.internal.AvailableCode;
import com.p019vk.push.core.remote.config.omicron.OmicronEnvironment;
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
public final class S20 implements InterfaceC1845cP, InterfaceC9248eU1, InterfaceC8294Sw0, InterfaceC7266zT, OmicronEnvironment, Y31, InterfaceC9875jO0, InterfaceC8088Ox0, InterfaceC0750Lv, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static final C0447H5 f10539b = new C0447H5();

    /* renamed from: c */
    public static final S20 f10540c = new S20(2);

    /* renamed from: d */
    public static final /* synthetic */ S20 f10541d = new S20(4);

    /* renamed from: e */
    public static final S20 f10542e = new S20(5);

    /* renamed from: f */
    public static final S20 f10543f = new S20(6);

    /* renamed from: g */
    public static final S20 f10544g = new S20(7);

    /* renamed from: a */
    public final /* synthetic */ int f10545a;

    public /* synthetic */ S20(int i) {
        this.f10545a = i;
    }

    /* renamed from: i */
    public static final String m7153i(int i) {
        F71 f71 = C0739Lk.f6823c;
        return i == Integer.MAX_VALUE ? "" : String.valueOf(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.facebook.react.bridge.WritableArray] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.react.bridge.WritableArray] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.facebook.react.bridge.WritableMap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.facebook.react.bridge.WritableArray] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    /* renamed from: l */
    public static Object m7154l(Object obj, C4049fN c4049fN) throws SecurityException {
        Object objM18227l;
        Object next;
        WritableArray writableArrayM18227l;
        O90.m5968f(c4049fN, "containerProvider");
        Object obj2 = null;
        if (obj == null ? true : obj instanceof C8313Tf1) {
            return null;
        }
        if (obj instanceof Bundle) {
            return AbstractC11622x22.m25739c((Bundle) obj, c4049fN);
        }
        int i = 0;
        if (!(obj instanceof Object[])) {
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                O90.m5968f(iArr, "<this>");
                writableArrayM18227l = c4049fN.m18227l();
                int length = iArr.length;
                while (i < length) {
                    writableArrayM18227l.pushInt(iArr[i]);
                    i++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                O90.m5968f(fArr, "<this>");
                writableArrayM18227l = c4049fN.m18227l();
                int length2 = fArr.length;
                while (i < length2) {
                    writableArrayM18227l.pushDouble(fArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                O90.m5968f(dArr, "<this>");
                writableArrayM18227l = c4049fN.m18227l();
                int length3 = dArr.length;
                while (i < length3) {
                    writableArrayM18227l.pushDouble(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                O90.m5968f(zArr, "<this>");
                writableArrayM18227l = c4049fN.m18227l();
                int length4 = zArr.length;
                while (i < length4) {
                    writableArrayM18227l.pushBoolean(zArr[i]);
                    i++;
                }
            } else {
                if (obj instanceof byte[]) {
                    return FollyDynamicExtensionConverter.f26965a.put(obj);
                }
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    O90.m5968f(map, "<this>");
                    objM18227l = Arguments.createMap();
                    O90.m5967e(objM18227l, "createMap(...)");
                    for (Map.Entry entry : map.entrySet()) {
                        AbstractC11622x22.m25738b(objM18227l, String.valueOf(entry.getKey()), m7154l(entry.getValue(), c4049fN));
                    }
                } else {
                    if (obj instanceof Enum) {
                        Enum r9 = (Enum) obj;
                        O90.m5968f(r9, "<this>");
                        Class<?> cls = r9.getClass();
                        IP0 ip0 = BP0.f799a;
                        InterfaceC10931re0 interfaceC10931re0M7867b = U22.m7867b(ip0.mo3846b(cls));
                        if (interfaceC10931re0M7867b == null) {
                            throw new IllegalArgumentException("Cannot convert enum without the primary constructor to js value");
                        }
                        if (interfaceC10931re0M7867b.getParameters().isEmpty()) {
                            return r9.name();
                        }
                        if (interfaceC10931re0M7867b.getParameters().size() != 1) {
                            throw new IllegalStateException("Enum '" + r9.getClass() + "' cannot be used as return type (incompatible with JS)");
                        }
                        String name = ((C8310Te0) ((InterfaceC8154Qe0) AbstractC7167xu.m25955A(interfaceC10931re0M7867b.getParameters()))).getName();
                        O90.m5965c(name);
                        Collection collectionM9559a = ((C8620Zd0) ((C9139de0) ip0.mo3846b(r9.getClass())).f26179c.getValue()).m9559a();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : collectionM9559a) {
                            AbstractC8360Ud0 abstractC8360Ud0 = (AbstractC8360Ud0) obj3;
                            if (!(abstractC8360Ud0.mo8094p().mo121t0() != null) && (abstractC8360Ud0 instanceof InterfaceC9141df0)) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next2 = it.next();
                            if (O90.m5963a(((InterfaceC9141df0) next2).getName(), name)) {
                                obj2 = next2;
                                break;
                            }
                        }
                        O90.m5966d(obj2, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Enum<*>, *>");
                        return ((InterfaceC9141df0) obj2).get(r9);
                    }
                    if (obj instanceof RN0) {
                        RN0 rn0 = (RN0) obj;
                        O90.m5968f(rn0, "<this>");
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        O90.m5967e(writableMapCreateMap, "createMap(...)");
                        ArrayList arrayListM7866a = U22.m7866a(P22.m6216e(rn0.getClass()));
                        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayListM7866a));
                        Iterator it2 = arrayListM7866a.iterator();
                        while (it2.hasNext()) {
                            InterfaceC9141df0 interfaceC9141df0 = (InterfaceC9141df0) it2.next();
                            Iterator it3 = interfaceC9141df0.getAnnotations().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                if (((Annotation) next) instanceof InterfaceC1787bT) {
                                    break;
                                }
                            }
                            InterfaceC1787bT interfaceC1787bT = (InterfaceC1787bT) next;
                            if (interfaceC1787bT != null) {
                                String strKey = interfaceC1787bT.key();
                                if (O90.m5963a(strKey, "")) {
                                    strKey = null;
                                }
                                if (strKey == null) {
                                    strKey = interfaceC9141df0.getName();
                                }
                                if (interfaceC9141df0 instanceof InterfaceC7686He0) {
                                    Field fieldM23392b = AbstractC10518oP1.m23392b(interfaceC9141df0);
                                    if (fieldM23392b != null) {
                                        fieldM23392b.setAccessible(true);
                                    }
                                    Method methodM23393c = AbstractC10518oP1.m23393c(interfaceC9141df0.mo3001c());
                                    if (methodM23393c != null) {
                                        methodM23393c.setAccessible(true);
                                    }
                                    Method methodM23393c2 = AbstractC10518oP1.m23393c(((InterfaceC7686He0) interfaceC9141df0).mo247d());
                                    if (methodM23393c2 != null) {
                                        methodM23393c2.setAccessible(true);
                                    }
                                } else {
                                    Field fieldM23392b2 = AbstractC10518oP1.m23392b(interfaceC9141df0);
                                    if (fieldM23392b2 != null) {
                                        fieldM23392b2.setAccessible(true);
                                    }
                                    Method methodM23393c3 = AbstractC10518oP1.m23393c(interfaceC9141df0.mo3001c());
                                    if (methodM23393c3 != null) {
                                        methodM23393c3.setAccessible(true);
                                    }
                                }
                                AbstractC11622x22.m25738b(writableMapCreateMap, strKey, m7154l(interfaceC9141df0.get(rn0), c4049fN));
                            }
                            arrayList2.add(C8313Tf1.f11463a);
                        }
                        return writableMapCreateMap;
                    }
                    if (obj instanceof URI) {
                        URI uri = (URI) obj;
                        O90.m5968f(uri, "<this>");
                        String string = uri.toString();
                        O90.m5967e(string, "toString(...)");
                        return string;
                    }
                    if (obj instanceof URL) {
                        URL url = (URL) obj;
                        O90.m5968f(url, "<this>");
                        String string2 = url.toString();
                        O90.m5967e(string2, "toString(...)");
                        return string2;
                    }
                    if (obj instanceof Uri) {
                        Uri uri2 = (Uri) obj;
                        O90.m5968f(uri2, "<this>");
                        String string3 = uri2.toString();
                        O90.m5967e(string3, "toString(...)");
                        return string3;
                    }
                    if (obj instanceof File) {
                        File file = (File) obj;
                        O90.m5968f(file, "<this>");
                        String absolutePath = file.getAbsolutePath();
                        O90.m5967e(absolutePath, "getAbsolutePath(...)");
                        return absolutePath;
                    }
                    if (obj instanceof Pair) {
                        Pair pair = (Pair) obj;
                        O90.m5968f(pair, "<this>");
                        objM18227l = c4049fN.m18227l();
                        Object objM7154l = m7154l(pair.f36702a, c4049fN);
                        Object objM7154l2 = m7154l(pair.f36703b, c4049fN);
                        AbstractC11622x22.m25737a(objM18227l, objM7154l);
                        AbstractC11622x22.m25737a(objM18227l, objM7154l2);
                    } else {
                        if (obj instanceof Long) {
                            return Double.valueOf(((Number) obj).longValue());
                        }
                        if (obj instanceof InterfaceC10761qJ0) {
                            return ((InterfaceC10761qJ0) obj).mo3962b();
                        }
                        if (!(obj instanceof Iterable)) {
                            return obj;
                        }
                        Iterable iterable = (Iterable) obj;
                        O90.m5968f(iterable, "<this>");
                        objM18227l = c4049fN.m18227l();
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            AbstractC11622x22.m25737a(objM18227l, m7154l(it4.next(), c4049fN));
                        }
                    }
                }
            }
            return writableArrayM18227l;
        }
        Object[] objArr = (Object[]) obj;
        O90.m5968f(objArr, "<this>");
        objM18227l = c4049fN.m18227l();
        int length5 = objArr.length;
        while (i < length5) {
            AbstractC11622x22.m25737a(objM18227l, m7154l(objArr[i], c4049fN));
            i++;
        }
        return objM18227l;
    }

    /* renamed from: s */
    public static C0739Lk m7155s(String str) throws NumberFormatException {
        if (str == null) {
            return null;
        }
        try {
            Object value = C0739Lk.f6823c.getValue();
            O90.m5967e(value, "<get-headerParsingRegEx>(...)");
            String[] strArrSplit = ((Pattern) value).split(str);
            if (!(strArrSplit.length == 4)) {
                throw new IllegalArgumentException();
            }
            if (!O90.m5963a(strArrSplit[0], "bytes")) {
                throw new IllegalArgumentException();
            }
            String str2 = strArrSplit[1];
            O90.m5967e(str2, "headerParts[1]");
            int i = Integer.parseInt(str2);
            String str3 = strArrSplit[2];
            O90.m5967e(str3, "headerParts[2]");
            int i2 = Integer.parseInt(str3);
            String str4 = strArrSplit[3];
            O90.m5967e(str4, "headerParts[3]");
            int i3 = Integer.parseInt(str4);
            if (!(i2 > i)) {
                throw new IllegalArgumentException();
            }
            if (i3 > i2) {
                return i2 < i3 - 1 ? new C0739Lk(i, i2) : new C0739Lk(i, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{str}, 1)), e);
        }
    }

    /* renamed from: t */
    public static Path m7156t(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x004f  */
    @Override // p000.Y31
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] mo1462E(java.lang.StackTraceElement[] r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: p000.S20.mo1462E(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // p000.InterfaceC7266zT
    /* renamed from: a */
    public Class mo7157a() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC9248eU1
    /* renamed from: b */
    public boolean mo3057b(Class cls) {
        return AbstractC10908rS1.class.isAssignableFrom(cls);
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        return new TreeSet();
    }

    @Override // p000.InterfaceC9248eU1
    /* renamed from: d */
    public YU1 mo3059d(Class cls) {
        if (!AbstractC10908rS1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (YU1) AbstractC10908rS1.m24343f(cls.asSubclass(AbstractC10908rS1.class)).mo644d(3);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // p000.InterfaceC7266zT
    /* renamed from: e */
    public Object mo7158e(File file) {
        return new FileInputStream(file);
    }

    @Override // p000.InterfaceC1845cP
    /* renamed from: f */
    public void mo1939f(InterfaceC7158xl interfaceC7158xl) {
        O90.m5968f(interfaceC7158xl, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + interfaceC7158xl);
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(c8128Pr0);
    }

    @Override // p000.InterfaceC1845cP
    /* renamed from: h */
    public void mo1940h(InterfaceC6976us interfaceC6976us, ArrayList arrayList) {
        O90.m5968f(interfaceC6976us, "descriptor");
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC6976us.getName() + ", unresolved classes " + arrayList);
    }

    @Override // p000.InterfaceC7266zT
    /* renamed from: j */
    public void mo7159j(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [vn] */
    /* renamed from: k */
    public Object m7160k(Object obj) throws C11502w60 {
        C6299kQ c6299kQ;
        C6439me c6439me = (C6439me) obj;
        InterfaceC9457g70 interfaceC9457g70 = c6439me.f37810b;
        OD0 od0 = c6439me.f37809a;
        if (AbstractC9831j22.m21967b(interfaceC9457g70.mo18405j0())) {
            try {
                C6809sD c6809sD = C6299kQ.f36489b;
                ByteBuffer byteBufferM2886C = interfaceC9457g70.mo18406u()[0].m2886C();
                byteBufferM2886C.rewind();
                byte[] bArr = new byte[byteBufferM2886C.capacity()];
                byteBufferM2886C.get(bArr);
                c6299kQ = new C6299kQ(new C7137xQ(new ByteArrayInputStream(bArr)));
                interfaceC9457g70.mo18406u()[0].m2886C().rewind();
            } catch (IOException e) {
                throw new C11502w60("Failed to extract EXIF data.", e);
            }
        } else {
            c6299kQ = null;
        }
        if (((ImageCaptureRotationOptionQuirk) AbstractC6815sJ.f42362a.m17864z0(ImageCaptureRotationOptionQuirk.class)) != null) {
            C0480Hc c0480Hc = C1373Vp.f12775i;
        } else if (AbstractC9831j22.m21967b(interfaceC9457g70.mo18405j0())) {
            AbstractC9104dM1.m17549h(c6299kQ, "JPEG image must have exif.");
            Size size = new Size(interfaceC9457g70.getWidth(), interfaceC9457g70.getHeight());
            int iM22203c = od0.f8308e - c6299kQ.m22203c();
            Size size2 = AbstractC11184tc1.m24949c(AbstractC11184tc1.m24954h(iM22203c)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixM24947a = AbstractC11184tc1.m24947a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iM22203c, false);
            RectF rectF = new RectF(od0.f8307d);
            matrixM24947a.mapRect(rectF);
            rectF.sort();
            Rect rect = new Rect();
            rectF.round(rect);
            int iM22203c2 = c6299kQ.m22203c();
            Matrix matrix = new Matrix(od0.f8310g);
            matrix.postConcat(matrixM24947a);
            InterfaceC7034vn c7356Av0 = interfaceC9457g70.mo18403P() instanceof C7097wn ? ((C7097wn) interfaceC9457g70.mo18403P()).f45097a : new C7356Av0(9);
            interfaceC9457g70.mo18405j0();
            return new C4192he(interfaceC9457g70, c6299kQ, interfaceC9457g70.mo18405j0(), size2, rect, iM22203c2, matrix, c7356Av0);
        }
        Rect rect2 = od0.f8307d;
        C7356Av0 c7356Av02 = interfaceC9457g70.mo18403P() instanceof C7097wn ? ((C7097wn) interfaceC9457g70.mo18403P()).f45097a : new C7356Av0(9);
        int i = od0.f8308e;
        Matrix matrix2 = od0.f8310g;
        Size size3 = new Size(interfaceC9457g70.getWidth(), interfaceC9457g70.getHeight());
        if (AbstractC9831j22.m21967b(interfaceC9457g70.mo18405j0())) {
            AbstractC9104dM1.m17549h(c6299kQ, "JPEG image must have Exif.");
        }
        return new C4192he(interfaceC9457g70, c6299kQ, interfaceC9457g70.mo18405j0(), size3, rect2, i, matrix2, c7356Av02);
    }

    /* renamed from: m */
    public void m7161m(File file) throws IOException {
        O90.m5968f(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException(AbstractC1374Vq.m8588g(file, "failed to delete "));
        }
    }

    /* renamed from: n */
    public void m7162n(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(AbstractC1374Vq.m8588g(file, "not a readable directory: "));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m7162n(file2);
            }
            if (!file2.delete()) {
                throw new IOException(AbstractC1374Vq.m8588g(file2, "failed to delete "));
            }
        }
    }

    @Override // com.p019vk.push.core.remote.config.omicron.OmicronEnvironment
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
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.AbstractC7742Ig0 m7163o(p000.C6404m5 r24, p000.AbstractC7742Ig0 r25, java.util.List r26, p000.C8751ae1 r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.S20.m7163o(m5, Ig0, java.util.List, ae1, boolean):Ig0");
    }

    /* renamed from: p */
    public AbstractC7742Ig0 m7164p(InterfaceC8406Va0 interfaceC8406Va0, InterfaceC7032vl interfaceC7032vl, boolean z, C6479nH c6479nH, EnumC0069B5 enumC0069B5, C8751ae1 c8751ae1, boolean z2, InterfaceC6497nZ interfaceC6497nZ) {
        C6404m5 c6404m5 = new C6404m5((InterfaceC0266ED) interfaceC7032vl, z, c6479nH, enumC0069B5, false);
        AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) interfaceC6497nZ.invoke(interfaceC8406Va0);
        Collection collectionMo1222j = interfaceC8406Va0.mo1222j();
        O90.m5967e(collectionMo1222j, "getOverriddenDescriptors(...)");
        Collection<InterfaceC7158xl> collection = collectionMo1222j;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(collection));
        for (InterfaceC7158xl interfaceC7158xl : collection) {
            O90.m5965c(interfaceC7158xl);
            arrayList.add((AbstractC7742Ig0) interfaceC6497nZ.invoke(interfaceC7158xl));
        }
        return m7163o(c6404m5, abstractC7742Ig0, arrayList, c8751ae1, z2);
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
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList m7165q(p000.C6479nH r28, java.util.Collection r29) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.S20.m7165q(nH, java.util.Collection):java.util.ArrayList");
    }

    /* renamed from: r */
    public boolean m7166r(File file) {
        O90.m5968f(file, "file");
        return file.exists();
    }

    public String toString() {
        switch (this.f10545a) {
            case 2:
                return "FileSystem.SYSTEM";
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m7167u(File file, File file2) throws IOException {
        O90.m5968f(file, "from");
        O90.m5968f(file2, "to");
        m7161m(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    @Override // p000.InterfaceC9875jO0
    /* renamed from: v */
    public boolean mo1475v(UnsatisfiedLinkError unsatisfiedLinkError, H21[] h21Arr) {
        String str = unsatisfiedLinkError instanceof G21 ? ((G21) unsatisfiedLinkError).f3550a : null;
        Objects.toString(unsatisfiedLinkError);
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (H21 h21 : h21Arr) {
            if (h21 instanceof AbstractC11064sg1) {
                AbstractC11064sg1 abstractC11064sg1 = (AbstractC11064sg1) h21;
                h21.mo3242b();
                abstractC11064sg1.getClass();
                File file = abstractC11064sg1.f11729a;
                try {
                    J71.m4169d(file, new File(file, "dso_lock")).close();
                } catch (Exception unused) {
                    Objects.toString(file);
                }
            }
        }
        return true;
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f10545a) {
            case 27:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11866d0.m8754a()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C10406nX1.f38362b.get();
                Boolean bool = (Boolean) C11046sX1.f42479a.m8754a();
                bool.getClass();
                return bool;
            default:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11867e.m8754a();
                l.getClass();
                return l;
        }
    }

    public /* synthetic */ S20(int i, Object obj) {
        this.f10545a = i;
    }

    @Override // p000.InterfaceC8088Ox0
    public void onComplete(Throwable th) {
    }
}
