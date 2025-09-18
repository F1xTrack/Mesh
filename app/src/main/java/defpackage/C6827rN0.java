package defpackage;

import java.security.AccessControlException;
import java.util.HashMap;

/* renamed from: rN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6827rN0 {
    public static final boolean i;
    public static final HashMap j;
    public int[] a;
    public String b;
    public int c;
    public String[] d;
    public String[] e;
    public String[] f;
    public EnumC0039Ag0 g;
    public String[] h;

    static {
        try {
            i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            i = false;
        }
        HashMap map = new HashMap();
        j = map;
        map.put(C0074As.j(new KX("kotlin.jvm.internal.KotlinClass")), EnumC0039Ag0.e);
        map.put(C0074As.j(new KX("kotlin.jvm.internal.KotlinFileFacade")), EnumC0039Ag0.f);
        map.put(C0074As.j(new KX("kotlin.jvm.internal.KotlinMultifileClass")), EnumC0039Ag0.h);
        map.put(C0074As.j(new KX("kotlin.jvm.internal.KotlinMultifileClassPart")), EnumC0039Ag0.i);
        map.put(C0074As.j(new KX("kotlin.jvm.internal.KotlinSyntheticClass")), EnumC0039Ag0.g);
    }
}
