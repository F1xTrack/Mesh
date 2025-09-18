package p000;

import android.content.Context;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurementReceiver;
import com.google.android.gms.tasks.Task;
import com.p019vk.push.common.Logger;
import com.yalantis.ucrop.UCropActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class GQ0 implements InterfaceC9381fX0, InterfaceC0980PZ, InterfaceC9001cb1, InterfaceC10800qc1, InterfaceC9307ey0, InterfaceC8036Nx0, InterfaceC9248eU1 {

    /* renamed from: a */
    public final /* synthetic */ int f3734a;

    /* renamed from: b */
    public Object f3735b;

    public /* synthetic */ GQ0(int i) {
        this.f3734a = i;
    }

    /* renamed from: a */
    public synchronized InterfaceC10907rS0 m3056a(Class cls) {
        int size = ((ArrayList) this.f3735b).size();
        for (int i = 0; i < size; i++) {
            C11035sS0 c11035sS0 = (C11035sS0) ((ArrayList) this.f3735b).get(i);
            if (c11035sS0.f42439a.isAssignableFrom(cls)) {
                return c11035sS0.f42440b;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC9248eU1
    /* renamed from: b */
    public boolean mo3057b(Class cls) {
        for (InterfaceC9248eU1 interfaceC9248eU1 : (InterfaceC9248eU1[]) this.f3735b) {
            if (interfaceC9248eU1.mo3057b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m3058c(float f) {
        TextView textView = ((UCropActivity) this.f3735b).f20611C;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f * 100.0f))));
        }
    }

    @Override // p000.InterfaceC9248eU1
    /* renamed from: d */
    public YU1 mo3059d(Class cls) {
        for (InterfaceC9248eU1 interfaceC9248eU1 : (InterfaceC9248eU1[]) this.f3735b) {
            if (interfaceC9248eU1.mo3057b(cls)) {
                return interfaceC9248eU1.mo3059d(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x001f  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m3060e() {
        /*
            r5 = this;
            r0 = 0
            java.lang.Object r1 = r5.f3735b
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r1 = (androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk) r1
            if (r1 == 0) goto L20
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            r4 = 1
            if (r2 >= r3) goto L13
            r1.getClass()
        L11:
            r1 = r0
            goto L1d
        L13:
            Gn r1 = r1.f15951a
            r2 = 5
            int r1 = p000.C6573om.m23540e(r1, r2)
            if (r1 != r2) goto L11
            r1 = r4
        L1d:
            if (r1 != 0) goto L20
            r0 = r4
        L20:
            java.lang.String r1 = "UseFlashModeTorchFor3aUpdate"
            p000.AbstractC7806Jm0.m4412f(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.GQ0.m3060e():boolean");
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        if (task.mo11144k()) {
            return;
        }
        Exception excMo11141h = task.mo11141h();
        excMo11141h.getClass();
        ((S81) this.f3735b).m7185c(excMo11141h);
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        E71 e71;
        E71 e712 = (E71) this.f3735b;
        e712.m2044r();
        e712.f2499u.m5816c();
        U41 u41 = e712.f2480b;
        Iterator it = u41.m7886u().iterator();
        while (it.hasNext() && (e71 = (E71) it.next()) != e712) {
            e71.m2044r();
            e71.f2499u.m5816c();
        }
        synchronized (u41.f11644a) {
            ((LinkedHashSet) u41.f11648e).remove(e712);
        }
    }

    @Override // p000.InterfaceC0980PZ
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.f3734a) {
            case 3:
                break;
            default:
                ((InterfaceC9435fy0) this.f3735b).mo8196b();
                break;
        }
    }

    public /* synthetic */ GQ0(int i, Object obj) {
        this.f3734a = i;
        this.f3735b = obj;
    }

    public GQ0(C0827N8 c0827n8, C4042fG c4042fG) {
        this.f3734a = 8;
        this.f3735b = Logger.DefaultImpls.createLogger(c4042fG, this);
    }

    public GQ0(Context context) {
        this.f3734a = 9;
        this.f3735b = C8087Ow1.m6187b(new L21(5, C8087Ow1.m6187b(new ES1(new C9422fr1(context), C8087Ow1.m6187b(AbstractC11658xK1.f45551a), false, 26))));
    }

    public GQ0(AppMeasurementReceiver appMeasurementReceiver) {
        this.f3734a = 13;
        Preconditions.checkNotNull(appMeasurementReceiver);
        this.f3735b = appMeasurementReceiver;
    }

    public GQ0() {
        this.f3734a = 1;
        this.f3735b = new ArrayList();
    }

    public GQ0(C9196e41 c9196e41) {
        this.f3734a = 6;
        this.f3735b = (TorchFlashRequiredFor3aUpdateQuirk) c9196e41.m17864z0(TorchFlashRequiredFor3aUpdateQuirk.class);
    }
}
