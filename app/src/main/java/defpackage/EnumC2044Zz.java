package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import java.util.List;
import java.util.Map;

/* renamed from: Zz */
/* loaded from: classes2.dex */
public final class EnumC2044Zz extends Enum {
    public static final EnumC2044Zz c;
    public static final EnumC2044Zz d;
    public static final EnumC2044Zz e;
    public static final EnumC2044Zz f;
    public static final EnumC2044Zz g;
    public static final EnumC2044Zz h;
    public static final EnumC2044Zz i;
    public static final EnumC2044Zz j;
    public static final EnumC2044Zz k;
    public static final EnumC2044Zz l;
    public static final EnumC2044Zz m;
    public static final EnumC2044Zz n;
    public static final EnumC2044Zz o;
    public static final EnumC2044Zz p;
    public static final EnumC2044Zz q;
    public static final EnumC2044Zz r;
    public static final EnumC2044Zz s;
    public static final EnumC2044Zz t;
    public static final EnumC2044Zz u;
    public static final /* synthetic */ EnumC2044Zz[] v;
    public final InterfaceC1667Vd0 a;
    public final int b;

    static {
        IP0 ip0 = BP0.a;
        EnumC2044Zz enumC2044Zz = new EnumC2044Zz("NONE", 0, ip0.b(Void.class), 0);
        EnumC2044Zz enumC2044Zz2 = new EnumC2044Zz("DOUBLE", 1, ip0.b(Double.TYPE));
        c = enumC2044Zz2;
        Class cls = Integer.TYPE;
        EnumC2044Zz enumC2044Zz3 = new EnumC2044Zz("INT", 2, ip0.b(cls));
        d = enumC2044Zz3;
        EnumC2044Zz enumC2044Zz4 = new EnumC2044Zz("LONG", 3, ip0.b(Long.TYPE));
        e = enumC2044Zz4;
        EnumC2044Zz enumC2044Zz5 = new EnumC2044Zz("FLOAT", 4, ip0.b(Float.TYPE));
        f = enumC2044Zz5;
        EnumC2044Zz enumC2044Zz6 = new EnumC2044Zz("BOOLEAN", 5, ip0.b(Boolean.TYPE));
        g = enumC2044Zz6;
        EnumC2044Zz enumC2044Zz7 = new EnumC2044Zz("STRING", 6, ip0.b(String.class));
        h = enumC2044Zz7;
        EnumC2044Zz enumC2044Zz8 = new EnumC2044Zz("JS_OBJECT", 7, ip0.b(JavaScriptObject.class));
        i = enumC2044Zz8;
        EnumC2044Zz enumC2044Zz9 = new EnumC2044Zz("JS_VALUE", 8, ip0.b(JavaScriptValue.class));
        j = enumC2044Zz9;
        EnumC2044Zz enumC2044Zz10 = new EnumC2044Zz("READABLE_ARRAY", 9, ip0.b(ReadableArray.class));
        k = enumC2044Zz10;
        EnumC2044Zz enumC2044Zz11 = new EnumC2044Zz("READABLE_MAP", 10, ip0.b(ReadableMap.class));
        l = enumC2044Zz11;
        EnumC2044Zz enumC2044Zz12 = new EnumC2044Zz("UINT8_TYPED_ARRAY", 11, ip0.b(byte[].class));
        m = enumC2044Zz12;
        EnumC2044Zz enumC2044Zz13 = new EnumC2044Zz("TYPED_ARRAY", 12, ip0.b(InterfaceC0502Ge1.class));
        n = enumC2044Zz13;
        EnumC2044Zz enumC2044Zz14 = new EnumC2044Zz("PRIMITIVE_ARRAY", 13, ip0.b(Object[].class));
        o = enumC2044Zz14;
        EnumC2044Zz enumC2044Zz15 = new EnumC2044Zz("LIST", 14, ip0.b(List.class));
        p = enumC2044Zz15;
        EnumC2044Zz enumC2044Zz16 = new EnumC2044Zz("MAP", 15, ip0.b(Map.class));
        q = enumC2044Zz16;
        EnumC2044Zz enumC2044Zz17 = new EnumC2044Zz("VIEW_TAG", 16, ip0.b(cls));
        r = enumC2044Zz17;
        EnumC2044Zz enumC2044Zz18 = new EnumC2044Zz("SHARED_OBJECT_ID", 17, ip0.b(cls));
        s = enumC2044Zz18;
        EnumC2044Zz enumC2044Zz19 = new EnumC2044Zz("JS_FUNCTION", 18, ip0.b(JavaScriptFunction.class));
        t = enumC2044Zz19;
        EnumC2044Zz enumC2044Zz20 = new EnumC2044Zz("ANY", 19, ip0.b(Object.class));
        u = enumC2044Zz20;
        EnumC2044Zz[] enumC2044ZzArr = {enumC2044Zz, enumC2044Zz2, enumC2044Zz3, enumC2044Zz4, enumC2044Zz5, enumC2044Zz6, enumC2044Zz7, enumC2044Zz8, enumC2044Zz9, enumC2044Zz10, enumC2044Zz11, enumC2044Zz12, enumC2044Zz13, enumC2044Zz14, enumC2044Zz15, enumC2044Zz16, enumC2044Zz17, enumC2044Zz18, enumC2044Zz19, enumC2044Zz20};
        v = enumC2044ZzArr;
        F02.c(enumC2044ZzArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EnumC2044Zz(String str, int i2, InterfaceC1667Vd0 interfaceC1667Vd0) {
        int i3 = GY1.a;
        GY1.a = i3 + 1;
        this(str, i2, interfaceC1667Vd0, 1 << i3);
    }

    public static EnumC2044Zz valueOf(String str) {
        return (EnumC2044Zz) Enum.valueOf(EnumC2044Zz.class, str);
    }

    public static EnumC2044Zz[] values() {
        return (EnumC2044Zz[]) v.clone();
    }

    public EnumC2044Zz(String str, int i2, InterfaceC1667Vd0 interfaceC1667Vd0, int i3) {
        super(str, i2);
        this.a = interfaceC1667Vd0;
        this.b = i3;
    }
}
