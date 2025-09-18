package p000;

import kotlin.KotlinVersion;
import kotlin.Pair;

/* renamed from: fb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9389fb0 {

    /* renamed from: a */
    public static final C0664KX f27250a;

    /* renamed from: b */
    public static final C0664KX[] f27251b;

    /* renamed from: c */
    public static final C0827N8 f27252c;

    /* renamed from: d */
    public static final C9517gb0 f27253d;

    static {
        C0664KX c0664kx = new C0664KX("org.jspecify.nullness");
        C0664KX c0664kx2 = new C0664KX("org.jspecify.annotations");
        f27250a = c0664kx2;
        C0664KX c0664kx3 = new C0664KX("io.reactivex.rxjava3.annotations");
        C0664KX c0664kx4 = new C0664KX("org.checkerframework.checker.nullness.compatqual");
        String strM4654b = c0664kx3.m4654b();
        f27251b = new C0664KX[]{new C0664KX(strM4654b.concat(".Nullable")), new C0664KX(strM4654b.concat(".NonNull"))};
        C0664KX c0664kx5 = new C0664KX("org.jetbrains.annotations");
        C9517gb0 c9517gb0 = C9517gb0.f27858d;
        Pair pair = new Pair(c0664kx5, c9517gb0);
        Pair pair2 = new Pair(new C0664KX("androidx.annotation"), c9517gb0);
        Pair pair3 = new Pair(new C0664KX("android.support.annotation"), c9517gb0);
        Pair pair4 = new Pair(new C0664KX("android.annotation"), c9517gb0);
        Pair pair5 = new Pair(new C0664KX("com.android.annotations"), c9517gb0);
        Pair pair6 = new Pair(new C0664KX("org.eclipse.jdt.annotation"), c9517gb0);
        Pair pair7 = new Pair(new C0664KX("org.checkerframework.checker.nullness.qual"), c9517gb0);
        Pair pair8 = new Pair(c0664kx4, c9517gb0);
        Pair pair9 = new Pair(new C0664KX("javax.annotation"), c9517gb0);
        Pair pair10 = new Pair(new C0664KX("edu.umd.cs.findbugs.annotations"), c9517gb0);
        Pair pair11 = new Pair(new C0664KX("io.reactivex.annotations"), c9517gb0);
        C0664KX c0664kx6 = new C0664KX("androidx.annotation.RecentlyNullable");
        EnumC10137lR0 enumC10137lR0 = EnumC10137lR0.f37059c;
        Pair pair12 = new Pair(c0664kx6, new C9517gb0(enumC10137lR0, 4));
        Pair pair13 = new Pair(new C0664KX("androidx.annotation.RecentlyNonNull"), new C9517gb0(enumC10137lR0, 4));
        Pair pair14 = new Pair(new C0664KX("lombok"), c9517gb0);
        KotlinVersion kotlinVersion = new KotlinVersion(2, 0);
        EnumC10137lR0 enumC10137lR02 = EnumC10137lR0.f37060d;
        f27252c = new C0827N8(AbstractC11077sn0.m24780h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair(c0664kx, new C9517gb0(enumC10137lR0, kotlinVersion, enumC10137lR02)), new Pair(c0664kx2, new C9517gb0(enumC10137lR0, new KotlinVersion(2, 0), enumC10137lR02)), new Pair(c0664kx3, new C9517gb0(enumC10137lR0, new KotlinVersion(1, 8), enumC10137lR02))));
        f27253d = new C9517gb0(enumC10137lR0, 4);
    }
}
