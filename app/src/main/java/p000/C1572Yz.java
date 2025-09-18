package p000;

import android.os.Bundle;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: Yz */
/* loaded from: classes2.dex */
public final class C1572Yz extends AbstractC0286EX {

    /* renamed from: b */
    public final C1509Xz f14628b;

    /* renamed from: c */
    public final C0848NT f14629c;

    /* renamed from: d */
    public long f14630d;

    public C1572Yz(InterfaceC0613Jj interfaceC0613Jj, C1509Xz c1509Xz, C0848NT c0848nt) {
        super(interfaceC0613Jj);
        this.f14628b = c1509Xz;
        this.f14629c = c0848nt;
    }

    @Override // p000.AbstractC0286EX, p000.Z11
    /* renamed from: c0 */
    public final void mo2328c0(C6507nj c6507nj, long j) {
        O90.m5968f(c6507nj, "source");
        super.mo2328c0(c6507nj, j);
        long j2 = this.f14630d + j;
        this.f14630d = j2;
        long jMo9186a = this.f14628b.mo9186a();
        C0848NT c0848nt = this.f14629c;
        c0848nt.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis > c0848nt.f7796b + 100 || j2 == jMo9186a) {
            c0848nt.f7796b = jCurrentTimeMillis;
            bundle2.putDouble("totalBytesSent", j2);
            bundle2.putDouble("totalBytesExpectedToSend", jMo9186a);
            bundle.putString(CommonUrlParts.UUID, (String) c0848nt.f7797c);
            bundle.putBundle("data", bundle2);
            ((C1414WT) c0848nt.f7798d).m25722c(bundle, "expo-file-system.uploadProgress");
        }
    }
}
