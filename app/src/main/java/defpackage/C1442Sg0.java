package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Sg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1442Sg0 {
    public final F71 a;

    public C1442Sg0(Context context, String str) {
        this.a = LB.b(new C7726w5(str, context, false, 13));
    }

    public final List a() {
        ArrayList arrayList;
        File[] fileArrListFiles = ((File) this.a.getValue()).listFiles();
        if (fileArrListFiles != null) {
            List<File> listC = J8.c(fileArrListFiles);
            arrayList = new ArrayList(AbstractC8449zu.k(listC));
            for (File file : listC) {
                O90.e(file, "it");
                arrayList.add(new C0369Em0(file));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? MN.a : arrayList;
    }
}
