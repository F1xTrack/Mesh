package defpackage;

import kotlin.KotlinVersion;
import kotlin.Pair;

/* renamed from: fb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3802fb0 {
    public static final KX a;
    public static final KX[] b;
    public static final N8 c;
    public static final C3993gb0 d;

    static {
        KX kx = new KX("org.jspecify.nullness");
        KX kx2 = new KX("org.jspecify.annotations");
        a = kx2;
        KX kx3 = new KX("io.reactivex.rxjava3.annotations");
        KX kx4 = new KX("org.checkerframework.checker.nullness.compatqual");
        String strB = kx3.b();
        b = new KX[]{new KX(strB.concat(".Nullable")), new KX(strB.concat(".NonNull"))};
        KX kx5 = new KX("org.jetbrains.annotations");
        C3993gb0 c3993gb0 = C3993gb0.d;
        Pair pair = new Pair(kx5, c3993gb0);
        Pair pair2 = new Pair(new KX("androidx.annotation"), c3993gb0);
        Pair pair3 = new Pair(new KX("android.support.annotation"), c3993gb0);
        Pair pair4 = new Pair(new KX("android.annotation"), c3993gb0);
        Pair pair5 = new Pair(new KX("com.android.annotations"), c3993gb0);
        Pair pair6 = new Pair(new KX("org.eclipse.jdt.annotation"), c3993gb0);
        Pair pair7 = new Pair(new KX("org.checkerframework.checker.nullness.qual"), c3993gb0);
        Pair pair8 = new Pair(kx4, c3993gb0);
        Pair pair9 = new Pair(new KX("javax.annotation"), c3993gb0);
        Pair pair10 = new Pair(new KX("edu.umd.cs.findbugs.annotations"), c3993gb0);
        Pair pair11 = new Pair(new KX("io.reactivex.annotations"), c3993gb0);
        KX kx6 = new KX("androidx.annotation.RecentlyNullable");
        EnumC5694lR0 enumC5694lR0 = EnumC5694lR0.c;
        Pair pair12 = new Pair(kx6, new C3993gb0(enumC5694lR0, 4));
        Pair pair13 = new Pair(new KX("androidx.annotation.RecentlyNonNull"), new C3993gb0(enumC5694lR0, 4));
        Pair pair14 = new Pair(new KX("lombok"), c3993gb0);
        KotlinVersion kotlinVersion = new KotlinVersion(2, 0);
        EnumC5694lR0 enumC5694lR02 = EnumC5694lR0.d;
        c = new N8(AbstractC7096sn0.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair(kx, new C3993gb0(enumC5694lR0, kotlinVersion, enumC5694lR02)), new Pair(kx2, new C3993gb0(enumC5694lR0, new KotlinVersion(2, 0), enumC5694lR02)), new Pair(kx3, new C3993gb0(enumC5694lR0, new KotlinVersion(1, 8), enumC5694lR02))));
        d = new C3993gb0(enumC5694lR0, 4);
    }
}
