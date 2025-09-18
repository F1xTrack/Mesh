package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: j31, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5240j31 {
    public static final LinkedHashSet a;
    public static final C0074As b;

    static {
        List listF = AbstractC8259yu.f(AbstractC1118Oc0.a, AbstractC1118Oc0.h, AbstractC1118Oc0.i, AbstractC1118Oc0.c, AbstractC1118Oc0.d, AbstractC1118Oc0.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C0074As.j((KX) it.next()));
        }
        a = linkedHashSet;
        b = C0074As.j(AbstractC1118Oc0.g);
    }
}
