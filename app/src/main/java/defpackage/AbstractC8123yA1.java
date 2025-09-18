package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: yA1 */
/* loaded from: classes.dex */
public abstract class AbstractC8123yA1 {
    public static final C5772lr0 a = new C5772lr0((Object) null, (Object) null, (Object) null, 18);
    public static C5772lr0 b;

    public static final HashSet a(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setD = ((InterfaceC5578kq0) it.next()).d();
            if (setD == null) {
                return null;
            }
            AbstractC0314Du.m(hashSet, setD);
        }
        return hashSet;
    }
}
