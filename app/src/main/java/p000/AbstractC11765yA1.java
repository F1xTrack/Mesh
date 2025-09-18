package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: yA1 */
/* loaded from: classes.dex */
public abstract class AbstractC11765yA1 {

    /* renamed from: a */
    public static final C10189lr0 f46130a = new C10189lr0((Object) null, (Object) null, (Object) null, 18);

    /* renamed from: b */
    public static C10189lr0 f46131b;

    /* renamed from: a */
    public static final HashSet m26060a(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setMo4153d = ((InterfaceC10059kq0) it.next()).mo4153d();
            if (setMo4153d == null) {
                return null;
            }
            AbstractC0246Du.m1920m(hashSet, setMo4153d);
        }
        return hashSet;
    }
}
