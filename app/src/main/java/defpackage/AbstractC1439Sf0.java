package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: Sf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1439Sf0 {
    public static final Map a;

    static {
        HashMap map = new HashMap();
        map.put(C1361Rf0.b, new HashSet(Arrays.asList(EnumC0894Lf0.SIGN, EnumC0894Lf0.VERIFY)));
        map.put(C1361Rf0.c, new HashSet(Arrays.asList(EnumC0894Lf0.ENCRYPT, EnumC0894Lf0.DECRYPT, EnumC0894Lf0.WRAP_KEY, EnumC0894Lf0.UNWRAP_KEY)));
        a = Collections.unmodifiableMap(map);
    }
}
