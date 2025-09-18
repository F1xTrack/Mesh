package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class LF1 extends XF1 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // defpackage.XF1
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) BJ1.i(j, obj);
        if (list instanceof FF1) {
            objUnmodifiableList = ((FF1) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof FH1) && (list instanceof YE1)) {
                HB1 hb1 = (HB1) ((YE1) list);
                boolean z = hb1.a;
                if (z && z) {
                    hb1.a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        BJ1.p(j, obj, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.XF1
    public final void b(long j, Object obj, Object obj2) {
        AF1 af1;
        List list = (List) BJ1.i(j, obj2);
        int size = list.size();
        List listC = (List) BJ1.i(j, obj);
        if (listC.isEmpty()) {
            listC = listC instanceof FF1 ? new AF1(size) : ((listC instanceof FH1) && (listC instanceof YE1)) ? ((YE1) listC).c(size) : new ArrayList(size);
            BJ1.p(j, obj, listC);
        } else {
            if (c.isAssignableFrom(listC.getClass())) {
                ArrayList arrayList = new ArrayList(listC.size() + size);
                arrayList.addAll(listC);
                BJ1.p(j, obj, arrayList);
                af1 = arrayList;
            } else if (listC instanceof ZI1) {
                AF1 af12 = new AF1(listC.size() + size);
                af12.addAll(af12.b.size(), (ZI1) listC);
                BJ1.p(j, obj, af12);
                af1 = af12;
            } else if ((listC instanceof FH1) && (listC instanceof YE1)) {
                YE1 ye1 = (YE1) listC;
                if (!((HB1) ye1).a) {
                    listC = ye1.c(listC.size() + size);
                    BJ1.p(j, obj, listC);
                }
            }
            listC = af1;
        }
        int size2 = listC.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listC.addAll(list);
        }
        if (size2 > 0) {
            list = listC;
        }
        BJ1.p(j, obj, list);
    }
}
