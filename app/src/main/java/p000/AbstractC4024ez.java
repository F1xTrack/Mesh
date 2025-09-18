package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ez */
/* loaded from: classes.dex */
public abstract class AbstractC4024ez {

    /* renamed from: a */
    public static final Set f26983a = Collections.unmodifiableSet(EnumSet.of(EnumC6845sn.f42597d, EnumC6845sn.f42598e, EnumC6845sn.f42599f, EnumC6845sn.f42600g));

    /* renamed from: b */
    public static final Set f26984b = Collections.unmodifiableSet(EnumSet.of(EnumC6908tn.f43254d, EnumC6908tn.f43251a));

    /* renamed from: c */
    public static final Set f26985c;

    /* renamed from: d */
    public static final Set f26986d;

    static {
        EnumC6765rn enumC6765rn = EnumC6765rn.f41902e;
        EnumC6765rn enumC6765rn2 = EnumC6765rn.f41901d;
        EnumC6765rn enumC6765rn3 = EnumC6765rn.f41898a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC6765rn, enumC6765rn2, enumC6765rn3));
        f26985c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(enumC6765rn2);
        enumSetCopyOf.remove(enumC6765rn3);
        f26986d = Collections.unmodifiableSet(enumSetCopyOf);
    }
}
