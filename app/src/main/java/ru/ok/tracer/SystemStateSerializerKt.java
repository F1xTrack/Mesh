package ru.ok.tracer;

import defpackage.O90;
import defpackage.PS0;
import defpackage.RQ1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"getImpliedPackageName", "", "tracer-commons_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SystemStateSerializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getImpliedPackageName() {
        Object objB;
        try {
            objB = Tracer.INSTANCE.getContext().getPackageName();
            O90.c(objB);
        } catch (Throwable th) {
            objB = RQ1.b(th);
        }
        if (PS0.a(objB) != null) {
            objB = "NA";
        }
        return (String) objB;
    }
}
