package defpackage;

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
public final class C1668Vd1 {
    public static final C1668Vd1 a = new C1668Vd1();
    public static final Object b = a(false);
    public static final Object c = a(true);
    public static final LinkedHashMap d = new LinkedHashMap();

    public static Map a(boolean z) {
        EnumC2044Zz enumC2044Zz = EnumC2044Zz.d;
        C1590Ud1 c1590Ud1 = new C1590Ud1(z, new ExpectedType(enumC2044Zz), 3);
        C1590Ud1 c1590Ud12 = new C1590Ud1(z, new ExpectedType(EnumC2044Zz.e), 4);
        EnumC2044Zz enumC2044Zz2 = EnumC2044Zz.c;
        C1590Ud1 c1590Ud13 = new C1590Ud1(z, new ExpectedType(enumC2044Zz2), 5);
        EnumC2044Zz enumC2044Zz3 = EnumC2044Zz.f;
        C1590Ud1 c1590Ud14 = new C1590Ud1(z, new ExpectedType(enumC2044Zz3), 6);
        EnumC2044Zz enumC2044Zz4 = EnumC2044Zz.g;
        C1590Ud1 c1590Ud15 = new C1590Ud1(z, new ExpectedType(enumC2044Zz4), 7);
        Class cls = Integer.TYPE;
        IP0 ip0 = BP0.a;
        Map mapH = AbstractC7096sn0.h(new Pair(ip0.b(cls), c1590Ud1), new Pair(ip0.b(Integer.class), c1590Ud1), new Pair(ip0.b(Long.TYPE), c1590Ud12), new Pair(ip0.b(Long.class), c1590Ud12), new Pair(ip0.b(Double.TYPE), c1590Ud13), new Pair(ip0.b(Double.class), c1590Ud13), new Pair(ip0.b(Float.TYPE), c1590Ud14), new Pair(ip0.b(Float.class), c1590Ud14), new Pair(ip0.b(Boolean.TYPE), c1590Ud15), new Pair(ip0.b(Boolean.class), c1590Ud15), new Pair(ip0.b(String.class), new C1590Ud1(z, new ExpectedType(EnumC2044Zz.h), 8)), new Pair(ip0.b(ReadableArray.class), new C1590Ud1(z, new ExpectedType(EnumC2044Zz.k), 9)), new Pair(ip0.b(ReadableMap.class), new C1590Ud1(z, new ExpectedType(EnumC2044Zz.l), 10)), new Pair(ip0.b(int[].class), new C1590Ud1(z, R02.a(enumC2044Zz), 11)), new Pair(ip0.b(double[].class), new C1590Ud1(z, R02.a(enumC2044Zz2), 0)), new Pair(ip0.b(float[].class), new C1590Ud1(z, R02.a(enumC2044Zz3), 1)), new Pair(ip0.b(boolean[].class), new C1590Ud1(z, R02.a(enumC2044Zz4), 2)), new Pair(ip0.b(byte[].class), new C5941mk(z)), new Pair(ip0.b(JavaScriptValue.class), new C1590Ud1(z, new ExpectedType(EnumC2044Zz.j), 12)), new Pair(ip0.b(JavaScriptObject.class), new C1590Ud1(z, new ExpectedType(EnumC2044Zz.i), 13)), new Pair(ip0.b(C2080a90.class), new C4010gh(z, 6)), new Pair(ip0.b(Y80.class), new C4010gh(z, 4)), new Pair(ip0.b(Z80.class), new C4010gh(z, 5)), new Pair(ip0.b(C0817Kf1.class), new C4010gh(z, 9)), new Pair(ip0.b(C0895Lf1.class), new C4010gh(z, 10)), new Pair(ip0.b(C0661If1.class), new C4010gh(z, 7)), new Pair(ip0.b(C0739Jf1.class), new C4010gh(z, 8)), new Pair(ip0.b(C5517kW.class), new C4010gh(z, 2)), new Pair(ip0.b(C5708lW.class), new C4010gh(z, 3)), new Pair(ip0.b(C3819fh.class), new C4010gh(z, 0)), new Pair(ip0.b(C4391ih.class), new C4010gh(z, 1)), new Pair(ip0.b(InterfaceC0502Ge1.class), new C0658Ie1(z, 0)), new Pair(ip0.b(URL.class), new Q5(z, 7)), new Pair(ip0.b(Uri.class), new Q5(z, 8)), new Pair(ip0.b(URI.class), new Q5(z, 4)), new Pair(ip0.b(File.class), new Q5(z, 3)), new Pair(ip0.b(Object.class), new Q5(z, 0)), new Pair(ip0.b(C1518Tf1.class), new C1830Xf1()), new Pair(ip0.b(C1538Tm0.class), new Q5(z, 6)));
        return Build.VERSION.SDK_INT >= 26 ? AbstractC7096sn0.j(mapH, AbstractC7096sn0.h(new Pair(ip0.b(LR0.k()), new Q5(z, 5)), new Pair(ip0.b(Color.class), new Q5(z, 1)), new Pair(ip0.b(LR0.A()), new Q5(z, 2)))) : mapH;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Map] */
    public final AbstractC1512Td1 b(InterfaceC7454uf0 interfaceC7454uf0) {
        O90.f(interfaceC7454uf0, "type");
        AbstractC1512Td1 abstractC1512Td1 = interfaceC7454uf0.e() ? (AbstractC1512Td1) c.get(interfaceC7454uf0.i()) : (AbstractC1512Td1) b.get(interfaceC7454uf0.i());
        if (abstractC1512Td1 != null) {
            return abstractC1512Td1;
        }
        InterfaceC4384ie0 interfaceC4384ie0I = interfaceC7454uf0.i();
        InterfaceC1667Vd0 interfaceC1667Vd0 = interfaceC4384ie0I instanceof InterfaceC1667Vd0 ? (InterfaceC1667Vd0) interfaceC4384ie0I : null;
        if (interfaceC1667Vd0 == null) {
            throw new C1319Qr0(interfaceC7454uf0);
        }
        Class clsB = P22.b(interfaceC1667Vd0);
        if (clsB.isArray() || Object[].class.isAssignableFrom(clsB)) {
            return new H8(this, interfaceC7454uf0, 0);
        }
        if (List.class.isAssignableFrom(clsB)) {
            return new H8(this, interfaceC7454uf0, 1);
        }
        if (Map.class.isAssignableFrom(clsB)) {
            return new H8(this, interfaceC7454uf0, 2);
        }
        if (Pair.class.isAssignableFrom(clsB)) {
            return new H8(this, interfaceC7454uf0, 4);
        }
        if (Set.class.isAssignableFrom(clsB)) {
            return new H8(this, interfaceC7454uf0, 3);
        }
        if (clsB.isEnum()) {
            return new SO(interfaceC1667Vd0, interfaceC7454uf0.e());
        }
        LinkedHashMap linkedHashMap = d;
        AbstractC1512Td1 abstractC1512Td12 = (AbstractC1512Td1) linkedHashMap.get(interfaceC7454uf0);
        if (abstractC1512Td12 != null) {
            return abstractC1512Td12;
        }
        if (RN0.class.isAssignableFrom(clsB)) {
            TN0 tn0 = new TN0(this, interfaceC7454uf0);
            linkedHashMap.put(interfaceC7454uf0, tn0);
            return tn0;
        }
        if (View.class.isAssignableFrom(clsB)) {
            return new C7854wl1(interfaceC7454uf0);
        }
        if (SharedObject.class.isAssignableFrom(clsB)) {
            return new C5533kb0(interfaceC7454uf0, 1);
        }
        if (JavaScriptFunction.class.isAssignableFrom(clsB)) {
            return new C5533kb0(interfaceC7454uf0, 0);
        }
        AbstractC1512Td1 c5490kN = C4332iN.class.isAssignableFrom(clsB) ? C5299jN.class.isAssignableFrom(clsB) ? new C5490kN(this, interfaceC7454uf0) : C5681lN.class.isAssignableFrom(clsB) ? new C5872mN(this, interfaceC7454uf0) : new C6063nN(this, interfaceC7454uf0) : null;
        if (c5490kN != null) {
            return c5490kN;
        }
        throw new C1319Qr0(interfaceC7454uf0);
    }
}
