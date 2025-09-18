package p000;

import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* renamed from: Vd1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8413Vd1 {

    /* renamed from: a */
    public static final C8413Vd1 f12669a = new C8413Vd1();

    /* renamed from: b */
    public static final Object f12670b = m8523a(false);

    /* renamed from: c */
    public static final Object f12671c = m8523a(true);

    /* renamed from: d */
    public static final LinkedHashMap f12672d = new LinkedHashMap();

    /* renamed from: a */
    public static Map m8523a(boolean z) {
        EnumC1635Zz enumC1635Zz = EnumC1635Zz.f15246d;
        C8361Ud1 c8361Ud1 = new C8361Ud1(z, new ExpectedType(enumC1635Zz), 3);
        C8361Ud1 c8361Ud12 = new C8361Ud1(z, new ExpectedType(EnumC1635Zz.f15247e), 4);
        EnumC1635Zz enumC1635Zz2 = EnumC1635Zz.f15245c;
        C8361Ud1 c8361Ud13 = new C8361Ud1(z, new ExpectedType(enumC1635Zz2), 5);
        EnumC1635Zz enumC1635Zz3 = EnumC1635Zz.f15248f;
        C8361Ud1 c8361Ud14 = new C8361Ud1(z, new ExpectedType(enumC1635Zz3), 6);
        EnumC1635Zz enumC1635Zz4 = EnumC1635Zz.f15249g;
        C8361Ud1 c8361Ud15 = new C8361Ud1(z, new ExpectedType(enumC1635Zz4), 7);
        Class cls = Integer.TYPE;
        IP0 ip0 = BP0.f799a;
        Map mapM24780h = AbstractC11077sn0.m24780h(new Pair(ip0.mo3846b(cls), c8361Ud1), new Pair(ip0.mo3846b(Integer.class), c8361Ud1), new Pair(ip0.mo3846b(Long.TYPE), c8361Ud12), new Pair(ip0.mo3846b(Long.class), c8361Ud12), new Pair(ip0.mo3846b(Double.TYPE), c8361Ud13), new Pair(ip0.mo3846b(Double.class), c8361Ud13), new Pair(ip0.mo3846b(Float.TYPE), c8361Ud14), new Pair(ip0.mo3846b(Float.class), c8361Ud14), new Pair(ip0.mo3846b(Boolean.TYPE), c8361Ud15), new Pair(ip0.mo3846b(Boolean.class), c8361Ud15), new Pair(ip0.mo3846b(String.class), new C8361Ud1(z, new ExpectedType(EnumC1635Zz.f15250h), 8)), new Pair(ip0.mo3846b(ReadableArray.class), new C8361Ud1(z, new ExpectedType(EnumC1635Zz.f15253k), 9)), new Pair(ip0.mo3846b(ReadableMap.class), new C8361Ud1(z, new ExpectedType(EnumC1635Zz.f15254l), 10)), new Pair(ip0.mo3846b(int[].class), new C8361Ud1(z, R02.m6873a(enumC1635Zz), 11)), new Pair(ip0.mo3846b(double[].class), new C8361Ud1(z, R02.m6873a(enumC1635Zz2), 0)), new Pair(ip0.mo3846b(float[].class), new C8361Ud1(z, R02.m6873a(enumC1635Zz3), 1)), new Pair(ip0.mo3846b(boolean[].class), new C8361Ud1(z, R02.m6873a(enumC1635Zz4), 2)), new Pair(ip0.mo3846b(byte[].class), new C6445mk(z)), new Pair(ip0.mo3846b(JavaScriptValue.class), new C8361Ud1(z, new ExpectedType(EnumC1635Zz.f15252j), 12)), new Pair(ip0.mo3846b(JavaScriptObject.class), new C8361Ud1(z, new ExpectedType(EnumC1635Zz.f15251i), 13)), new Pair(ip0.mo3846b(C8688a90.class), new C4132gh(z, 6)), new Pair(ip0.mo3846b(Y80.class), new C4132gh(z, 4)), new Pair(ip0.mo3846b(Z80.class), new C4132gh(z, 5)), new Pair(ip0.mo3846b(C7845Kf1.class), new C4132gh(z, 9)), new Pair(ip0.mo3846b(C7897Lf1.class), new C4132gh(z, 10)), new Pair(ip0.mo3846b(C7741If1.class), new C4132gh(z, 7)), new Pair(ip0.mo3846b(C7793Jf1.class), new C4132gh(z, 8)), new Pair(ip0.mo3846b(C6305kW.class), new C4132gh(z, 2)), new Pair(ip0.mo3846b(C6368lW.class), new C4132gh(z, 3)), new Pair(ip0.mo3846b(C4069fh.class), new C4132gh(z, 0)), new Pair(ip0.mo3846b(C4258ih.class), new C4132gh(z, 1)), new Pair(ip0.mo3846b(InterfaceC7635Ge1.class), new C7739Ie1(z, 0)), new Pair(ip0.mo3846b(URL.class), new C1013Q5(z, 7)), new Pair(ip0.mo3846b(Uri.class), new C1013Q5(z, 8)), new Pair(ip0.mo3846b(URI.class), new C1013Q5(z, 4)), new Pair(ip0.mo3846b(File.class), new C1013Q5(z, 3)), new Pair(ip0.mo3846b(Object.class), new C1013Q5(z, 0)), new Pair(ip0.mo3846b(C8313Tf1.class), new C8521Xf1()), new Pair(ip0.mo3846b(C8326Tm0.class), new C1013Q5(z, 6)));
        return Build.VERSION.SDK_INT >= 26 ? AbstractC11077sn0.m24782j(mapM24780h, AbstractC11077sn0.m24780h(new Pair(ip0.mo3846b(LR0.m4985k()), new C1013Q5(z, 5)), new Pair(ip0.mo3846b(Color.class), new C1013Q5(z, 1)), new Pair(ip0.mo3846b(LR0.m4971A()), new C1013Q5(z, 2)))) : mapM24780h;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Map] */
    /* renamed from: b */
    public final AbstractC8309Td1 m8524b(InterfaceC11317uf0 interfaceC11317uf0) {
        O90.m5968f(interfaceC11317uf0, "type");
        AbstractC8309Td1 abstractC8309Td1 = interfaceC11317uf0.mo8537e() ? (AbstractC8309Td1) f12671c.get(interfaceC11317uf0.mo8539i()) : (AbstractC8309Td1) f12670b.get(interfaceC11317uf0.mo8539i());
        if (abstractC8309Td1 != null) {
            return abstractC8309Td1;
        }
        InterfaceC9779ie0 interfaceC9779ie0Mo8539i = interfaceC11317uf0.mo8539i();
        InterfaceC8412Vd0 interfaceC8412Vd0 = interfaceC9779ie0Mo8539i instanceof InterfaceC8412Vd0 ? (InterfaceC8412Vd0) interfaceC9779ie0Mo8539i : null;
        if (interfaceC8412Vd0 == null) {
            throw new C8180Qr0(interfaceC11317uf0);
        }
        Class clsM6213b = P22.m6213b(interfaceC8412Vd0);
        if (clsM6213b.isArray() || Object[].class.isAssignableFrom(clsM6213b)) {
            return new C0450H8(this, interfaceC11317uf0, 0);
        }
        if (List.class.isAssignableFrom(clsM6213b)) {
            return new C0450H8(this, interfaceC11317uf0, 1);
        }
        if (Map.class.isAssignableFrom(clsM6213b)) {
            return new C0450H8(this, interfaceC11317uf0, 2);
        }
        if (Pair.class.isAssignableFrom(clsM6213b)) {
            return new C0450H8(this, interfaceC11317uf0, 4);
        }
        if (Set.class.isAssignableFrom(clsM6213b)) {
            return new C0450H8(this, interfaceC11317uf0, 3);
        }
        if (clsM6213b.isEnum()) {
            return new C1157SO(interfaceC8412Vd0, interfaceC11317uf0.mo8537e());
        }
        LinkedHashMap linkedHashMap = f12672d;
        AbstractC8309Td1 abstractC8309Td12 = (AbstractC8309Td1) linkedHashMap.get(interfaceC11317uf0);
        if (abstractC8309Td12 != null) {
            return abstractC8309Td12;
        }
        if (RN0.class.isAssignableFrom(clsM6213b)) {
            TN0 tn0 = new TN0(this, interfaceC11317uf0);
            linkedHashMap.put(interfaceC11317uf0, tn0);
            return tn0;
        }
        if (View.class.isAssignableFrom(clsM6213b)) {
            return new C11585wl1(interfaceC11317uf0);
        }
        if (SharedObject.class.isAssignableFrom(clsM6213b)) {
            return new C10029kb0(interfaceC11317uf0, 1);
        }
        if (JavaScriptFunction.class.isAssignableFrom(clsM6213b)) {
            return new C10029kb0(interfaceC11317uf0, 0);
        }
        AbstractC8309Td1 c6296kN = C4238iN.class.isAssignableFrom(clsM6213b) ? C6233jN.class.isAssignableFrom(clsM6213b) ? new C6296kN(this, interfaceC11317uf0) : C6359lN.class.isAssignableFrom(clsM6213b) ? new C6422mN(this, interfaceC11317uf0) : new C6485nN(this, interfaceC11317uf0) : null;
        if (c6296kN != null) {
            return c6296kN;
        }
        throw new C8180Qr0(interfaceC11317uf0);
    }
}
