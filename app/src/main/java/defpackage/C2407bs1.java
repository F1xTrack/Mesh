package defpackage;

import android.os.Handler;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.Task;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/* renamed from: bs1 */
/* loaded from: classes2.dex */
public final class C2407bs1 implements InterfaceC1103Nx0, InterfaceC5680lM1 {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ C2407bs1(Object obj, String str, Comparable comparable) {
        this.a = obj;
        this.b = str;
        this.c = comparable;
    }

    @Override // defpackage.InterfaceC5680lM1
    public void a(String str, int i, IOException iOException, byte[] bArr, Map map) {
        ((C5716lY1) this.c).y(true, i, iOException, bArr, (String) this.a, (ArrayList) this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(com.vk.push.core.domain.model.CallingAppIds r9, defpackage.AbstractC1963Yy r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2407bs1.b(com.vk.push.core.domain.model.CallingAppIds, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:58:0x0029, B:76:0x00ca, B:78:0x00d2, B:79:0x00e3, B:80:0x00e8, B:82:0x00ee, B:83:0x00f1, B:64:0x0039, B:73:0x00b2, B:70:0x00a9), top: B:87:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:58:0x0029, B:76:0x00ca, B:78:0x00d2, B:79:0x00e3, B:80:0x00e8, B:82:0x00ee, B:83:0x00f1, B:64:0x0039, B:73:0x00b2, B:70:0x00a9), top: B:87:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r8, defpackage.AbstractC1963Yy r9) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2407bs1.c(java.lang.String, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f9 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:68:0x002b, B:96:0x00f1, B:98:0x00f9, B:99:0x010f, B:101:0x0115, B:102:0x012f, B:75:0x003d, B:93:0x00d8, B:89:0x00cc), top: B:106:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:68:0x002b, B:96:0x00f1, B:98:0x00f9, B:99:0x010f, B:101:0x0115, B:102:0x012f, B:75:0x003d, B:93:0x00d8, B:89:0x00cc), top: B:106:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.String r8, com.vk.push.common.clientid.ClientId r9, defpackage.AbstractC1963Yy r10) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2407bs1.d(java.lang.String, com.vk.push.common.clientid.ClientId, Yy):java.lang.Object");
    }

    public void e(Object obj) {
        O90.f(obj, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.a;
        linkedHashSet.remove(obj);
        if (linkedHashSet.size() == 0) {
            ((Handler) this.c).post(new C5550kh(6, this));
        }
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        QT0 qt0 = (QT0) this.a;
        String str = (String) this.b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.c;
        synchronized (qt0.a) {
            qt0.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public C2407bs1(GetCallingAppInfoUseCase getCallingAppInfoUseCase, PackagesRepository packagesRepository, C1320Qr1 c1320Qr1) {
        O90.f(packagesRepository, "packagesRepository");
        O90.f(c1320Qr1, "arbiterRepository");
        this.a = getCallingAppInfoUseCase;
        this.b = packagesRepository;
        this.c = c1320Qr1;
    }
}
