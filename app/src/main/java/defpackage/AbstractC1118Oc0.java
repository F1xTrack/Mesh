package defpackage;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: Oc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1118Oc0 {
    public static final KX a;
    public static final C1559Tt0 b;
    public static final KX c;
    public static final KX d;
    public static final KX e;
    public static final KX f;
    public static final KX g;
    public static final KX h;
    public static final KX i;
    public static final KX j;
    public static final KX k;
    public static final KX l;
    public static final KX m;
    public static final KX n;
    public static final KX o;
    public static final KX p;
    public static final KX q;

    static {
        KX kx = new KX("kotlin.Metadata");
        a = kx;
        C3427dd0.c(kx).e();
        b = C1559Tt0.e("value");
        c = new KX(Target.class.getName());
        new KX(ElementType.class.getName());
        d = new KX(Retention.class.getName());
        new KX(RetentionPolicy.class.getName());
        e = new KX(Deprecated.class.getName());
        f = new KX(Documented.class.getName());
        g = new KX("java.lang.annotation.Repeatable");
        new KX(Override.class.getName());
        h = new KX("org.jetbrains.annotations.NotNull");
        i = new KX("org.jetbrains.annotations.Nullable");
        j = new KX("org.jetbrains.annotations.Mutable");
        k = new KX("org.jetbrains.annotations.ReadOnly");
        l = new KX("kotlin.annotations.jvm.ReadOnly");
        m = new KX("kotlin.annotations.jvm.Mutable");
        n = new KX("kotlin.jvm.PurelyImplements");
        new KX("kotlin.jvm.internal");
        KX kx2 = new KX("kotlin.jvm.internal.SerializedIr");
        o = kx2;
        C3427dd0.c(kx2).e();
        p = new KX("kotlin.jvm.internal.EnhancedNullability");
        q = new KX("kotlin.jvm.internal.EnhancedMutability");
    }
}
