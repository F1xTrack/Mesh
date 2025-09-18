package p000;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.impl.p022ob.InterfaceExecutorC3607sn;
import com.yandex.metrica.rtm.service.EventToReporterProxy;

/* renamed from: Lv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7929Lv1 implements InterfaceC9940ju1 {

    /* renamed from: a */
    public final EventToReporterProxy f6929a;

    public C7929Lv1(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this.f6929a = new EventToReporterProxy(new C9038cr1(), context, interfaceExecutorC3607sn, new C11853ys1());
    }

    @Override // p000.InterfaceC9940ju1
    public final void reportData(Bundle bundle) {
        try {
            this.f6929a.reportData(bundle);
        } catch (Throwable unused) {
        }
    }
}
