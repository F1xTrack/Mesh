package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: Sf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8260Sf0 {

    /* renamed from: a */
    public static final Map f10891a;

    static {
        HashMap map = new HashMap();
        map.put(C8208Rf0.f10369b, new HashSet(Arrays.asList(EnumC7896Lf0.SIGN, EnumC7896Lf0.VERIFY)));
        map.put(C8208Rf0.f10370c, new HashSet(Arrays.asList(EnumC7896Lf0.ENCRYPT, EnumC7896Lf0.DECRYPT, EnumC7896Lf0.WRAP_KEY, EnumC7896Lf0.UNWRAP_KEY)));
        f10891a = Collections.unmodifiableMap(map);
    }
}
