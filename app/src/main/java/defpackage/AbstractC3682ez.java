package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ez, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3682ez {
    public static final Set a = Collections.unmodifiableSet(EnumSet.of(EnumC7095sn.d, EnumC7095sn.e, EnumC7095sn.f, EnumC7095sn.g));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(EnumC7286tn.d, EnumC7286tn.a));
    public static final Set c;
    public static final Set d;

    static {
        EnumC6904rn enumC6904rn = EnumC6904rn.e;
        EnumC6904rn enumC6904rn2 = EnumC6904rn.d;
        EnumC6904rn enumC6904rn3 = EnumC6904rn.a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC6904rn, enumC6904rn2, enumC6904rn3));
        c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(enumC6904rn2);
        enumSetCopyOf.remove(enumC6904rn3);
        d = Collections.unmodifiableSet(enumSetCopyOf);
    }
}
