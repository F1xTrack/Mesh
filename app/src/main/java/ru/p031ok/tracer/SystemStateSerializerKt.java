package ru.p031ok.tracer;

import kotlin.Metadata;
import p000.O90;
import p000.PS0;
import p000.RQ1;

@Metadata(m22266d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002¨\u0006\u0002"}, m22267d2 = {"getImpliedPackageName", "", "tracer-commons_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SystemStateSerializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getImpliedPackageName() {
        Object objM7015b;
        try {
            objM7015b = Tracer.INSTANCE.getContext().getPackageName();
            O90.m5965c(objM7015b);
        } catch (Throwable th) {
            objM7015b = RQ1.m7015b(th);
        }
        if (PS0.m6365a(objM7015b) != null) {
            objM7015b = "NA";
        }
        return (String) objM7015b;
    }
}
