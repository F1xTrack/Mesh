package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class LF1 extends XF1 {

    /* renamed from: c */
    public static final Class f6580c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // p000.XF1
    /* renamed from: a */
    public final void mo4937a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) BJ1.m589i(j, obj);
        if (list instanceof FF1) {
            objUnmodifiableList = ((FF1) list).zze();
        } else {
            if (f6580c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof FH1) && (list instanceof YE1)) {
                HB1 hb1 = (HB1) ((YE1) list);
                boolean z = hb1.f4162a;
                if (z && z) {
                    hb1.f4162a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        BJ1.m596p(j, obj, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.XF1
    /* renamed from: b */
    public final void mo4938b(long j, Object obj, Object obj2) {
        AF1 af1;
        List list = (List) BJ1.m589i(j, obj2);
        int size = list.size();
        List listMo137c = (List) BJ1.m589i(j, obj);
        if (listMo137c.isEmpty()) {
            listMo137c = listMo137c instanceof FF1 ? new AF1(size) : ((listMo137c instanceof FH1) && (listMo137c instanceof YE1)) ? ((YE1) listMo137c).mo137c(size) : new ArrayList(size);
            BJ1.m596p(j, obj, listMo137c);
        } else {
            if (f6580c.isAssignableFrom(listMo137c.getClass())) {
                ArrayList arrayList = new ArrayList(listMo137c.size() + size);
                arrayList.addAll(listMo137c);
                BJ1.m596p(j, obj, arrayList);
                af1 = arrayList;
            } else if (listMo137c instanceof ZI1) {
                AF1 af12 = new AF1(listMo137c.size() + size);
                af12.addAll(af12.f143b.size(), (ZI1) listMo137c);
                BJ1.m596p(j, obj, af12);
                af1 = af12;
            } else if ((listMo137c instanceof FH1) && (listMo137c instanceof YE1)) {
                YE1 ye1 = (YE1) listMo137c;
                if (!((HB1) ye1).f4162a) {
                    listMo137c = ye1.mo137c(listMo137c.size() + size);
                    BJ1.m596p(j, obj, listMo137c);
                }
            }
            listMo137c = af1;
        }
        int size2 = listMo137c.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listMo137c.addAll(list);
        }
        if (size2 > 0) {
            list = listMo137c;
        }
        BJ1.m596p(j, obj, list);
    }
}
