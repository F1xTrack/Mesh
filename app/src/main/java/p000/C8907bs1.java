package p000;

import android.os.Handler;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.Task;
import com.p019vk.push.core.domain.repository.PackagesRepository;
import com.p019vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/* renamed from: bs1 */
/* loaded from: classes2.dex */
public final class C8907bs1 implements InterfaceC8036Nx0, InterfaceC10128lM1 {

    /* renamed from: a */
    public Object f17202a;

    /* renamed from: b */
    public Object f17203b;

    /* renamed from: c */
    public Object f17204c;

    public /* synthetic */ C8907bs1(Object obj, String str, Comparable comparable) {
        this.f17202a = obj;
        this.f17203b = str;
        this.f17204c = comparable;
    }

    @Override // p000.InterfaceC10128lM1
    /* renamed from: a */
    public void mo4870a(String str, int i, IOException iOException, byte[] bArr, Map map) {
        ((C10152lY1) this.f17204c).m22503y(true, i, iOException, bArr, (String) this.f17202a, (ArrayList) this.f17203b);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0019  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m10534b(com.p019vk.push.core.domain.model.CallingAppIds r9, p000.AbstractC1571Yy r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8907bs1.m10534b(com.vk.push.core.domain.model.CallingAppIds, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:58:0x0029, B:76:0x00ca, B:78:0x00d2, B:79:0x00e3, B:80:0x00e8, B:82:0x00ee, B:83:0x00f1, B:64:0x0039, B:73:0x00b2, B:70:0x00a9), top: B:87:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:58:0x0029, B:76:0x00ca, B:78:0x00d2, B:79:0x00e3, B:80:0x00e8, B:82:0x00ee, B:83:0x00f1, B:64:0x0039, B:73:0x00b2, B:70:0x00a9), top: B:87:0x0021 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m10535c(java.lang.String r8, p000.AbstractC1571Yy r9) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8907bs1.m10535c(java.lang.String, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f9 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:68:0x002b, B:96:0x00f1, B:98:0x00f9, B:99:0x010f, B:101:0x0115, B:102:0x012f, B:75:0x003d, B:93:0x00d8, B:89:0x00cc), top: B:106:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:68:0x002b, B:96:0x00f1, B:98:0x00f9, B:99:0x010f, B:101:0x0115, B:102:0x012f, B:75:0x003d, B:93:0x00d8, B:89:0x00cc), top: B:106:0x0021 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m10536d(java.lang.String r8, com.p019vk.push.common.clientid.ClientId r9, p000.AbstractC1571Yy r10) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8907bs1.m10536d(java.lang.String, com.vk.push.common.clientid.ClientId, Yy):java.lang.Object");
    }

    /* renamed from: e */
    public void m10537e(Object obj) {
        O90.m5968f(obj, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f17202a;
        linkedHashSet.remove(obj);
        if (linkedHashSet.size() == 0) {
            ((Handler) this.f17204c).post(new C6316kh(6, this));
        }
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        QT0 qt0 = (QT0) this.f17202a;
        String str = (String) this.f17203b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f17204c;
        synchronized (qt0.f9636a) {
            qt0.f9636a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public C8907bs1(GetCallingAppInfoUseCase getCallingAppInfoUseCase, PackagesRepository packagesRepository, C8181Qr1 c8181Qr1) {
        O90.m5968f(packagesRepository, "packagesRepository");
        O90.m5968f(c8181Qr1, "arbiterRepository");
        this.f17202a = getCallingAppInfoUseCase;
        this.f17203b = packagesRepository;
        this.f17204c = c8181Qr1;
    }
}
