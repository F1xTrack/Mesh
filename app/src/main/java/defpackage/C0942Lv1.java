package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.impl.ob.InterfaceExecutorC3086sn;
import com.yandex.metrica.rtm.service.EventToReporterProxy;

/* renamed from: Lv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0942Lv1 implements InterfaceC5400ju1 {
    public final EventToReporterProxy a;

    public C0942Lv1(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this.a = new EventToReporterProxy(new C3279cr1(), context, interfaceExecutorC3086sn, new C8255ys1());
    }

    @Override // defpackage.InterfaceC5400ju1
    public final void reportData(Bundle bundle) {
        try {
            this.a.reportData(bundle);
        } catch (Throwable unused) {
        }
    }
}
