package p000;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Sg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8262Sg0 {

    /* renamed from: a */
    public final F71 f10906a;

    public C8262Sg0(Context context, String str) {
        this.f10906a = AbstractC0705LB.m4915b(new C7053w5(str, context, false, 13));
    }

    /* renamed from: a */
    public final List m7417a() {
        ArrayList arrayList;
        File[] fileArrListFiles = ((File) this.f10906a.getValue()).listFiles();
        if (fileArrListFiles != null) {
            List<File> listM4176c = AbstractC0576J8.m4176c(fileArrListFiles);
            arrayList = new ArrayList(AbstractC7293zu.m26586k(listM4176c));
            for (File file : listM4176c) {
                O90.m5967e(file, "it");
                arrayList.add(new C7546Em0(file));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? C0779MN.f7117a : arrayList;
    }
}
