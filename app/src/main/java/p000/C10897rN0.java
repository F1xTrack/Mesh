package p000;

import java.security.AccessControlException;
import java.util.HashMap;

/* renamed from: rN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10897rN0 {

    /* renamed from: i */
    public static final boolean f41623i;

    /* renamed from: j */
    public static final HashMap f41624j;

    /* renamed from: a */
    public int[] f41625a;

    /* renamed from: b */
    public String f41626b;

    /* renamed from: c */
    public int f41627c;

    /* renamed from: d */
    public String[] f41628d;

    /* renamed from: e */
    public String[] f41629e;

    /* renamed from: f */
    public String[] f41630f;

    /* renamed from: g */
    public EnumC7326Ag0 f41631g;

    /* renamed from: h */
    public String[] f41632h;

    static {
        try {
            f41623i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f41623i = false;
        }
        HashMap map = new HashMap();
        f41624j = map;
        map.put(C0055As.m358j(new C0664KX("kotlin.jvm.internal.KotlinClass")), EnumC7326Ag0.f326e);
        map.put(C0055As.m358j(new C0664KX("kotlin.jvm.internal.KotlinFileFacade")), EnumC7326Ag0.f327f);
        map.put(C0055As.m358j(new C0664KX("kotlin.jvm.internal.KotlinMultifileClass")), EnumC7326Ag0.f329h);
        map.put(C0055As.m358j(new C0664KX("kotlin.jvm.internal.KotlinMultifileClassPart")), EnumC7326Ag0.f330i);
        map.put(C0055As.m358j(new C0664KX("kotlin.jvm.internal.KotlinSyntheticClass")), EnumC7326Ag0.f328g);
    }
}
