package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurementReceiver;
import com.google.android.gms.tasks.Task;
import com.vk.push.common.Logger;
import com.yalantis.ucrop.UCropActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class GQ0 implements InterfaceC3790fX0, PZ, InterfaceC2546cb1, InterfaceC6683qc1, InterfaceC3680ey0, InterfaceC1103Nx0, InterfaceC3591eU1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ GQ0(int i) {
        this.a = i;
    }

    public synchronized InterfaceC6842rS0 a(Class cls) {
        int size = ((ArrayList) this.b).size();
        for (int i = 0; i < size; i++) {
            C7033sS0 c7033sS0 = (C7033sS0) ((ArrayList) this.b).get(i);
            if (c7033sS0.a.isAssignableFrom(cls)) {
                return c7033sS0.b;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC3591eU1
    public boolean b(Class cls) {
        for (InterfaceC3591eU1 interfaceC3591eU1 : (InterfaceC3591eU1[]) this.b) {
            if (interfaceC3591eU1.b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(float f) {
        TextView textView = ((UCropActivity) this.b).C;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f * 100.0f))));
        }
    }

    @Override // defpackage.InterfaceC3591eU1
    public YU1 d(Class cls) {
        for (InterfaceC3591eU1 interfaceC3591eU1 : (InterfaceC3591eU1[]) this.b) {
            if (interfaceC3591eU1.b(cls)) {
                return interfaceC3591eU1.d(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e() {
        /*
            r5 = this;
            r0 = 0
            java.lang.Object r1 = r5.b
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
            Gn r1 = r1.a
            r2 = 5
            int r1 = defpackage.C6329om.e(r1, r2)
            if (r1 != r2) goto L11
            r1 = r4
        L1d:
            if (r1 != 0) goto L20
            r0 = r4
        L20:
            java.lang.String r1 = "UseFlashModeTorchFor3aUpdate"
            defpackage.AbstractC0759Jm0.f(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GQ0.e():boolean");
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        if (task.k()) {
            return;
        }
        Exception excH = task.h();
        excH.getClass();
        ((S81) this.b).c(excH);
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        E71 e71;
        E71 e712 = (E71) this.b;
        e712.r();
        e712.u.c();
        U41 u41 = e712.b;
        Iterator it = u41.u().iterator();
        while (it.hasNext() && (e71 = (E71) it.next()) != e712) {
            e71.r();
            e71.u.c();
        }
        synchronized (u41.a) {
            ((LinkedHashSet) u41.e).remove(e712);
        }
    }

    @Override // defpackage.PZ
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.a) {
            case 3:
                break;
            default:
                ((InterfaceC3871fy0) this.b).b();
                break;
        }
    }

    public /* synthetic */ GQ0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public GQ0(N8 n8, C3738fG c3738fG) {
        this.a = 8;
        this.b = Logger.DefaultImpls.createLogger(c3738fG, this);
    }

    public GQ0(Context context) {
        this.a = 9;
        this.b = C1179Ow1.b(new L21(5, C1179Ow1.b(new ES1(new C3851fr1(context), C1179Ow1.b(AbstractC7963xK1.a), false, 26))));
    }

    public GQ0(AppMeasurementReceiver appMeasurementReceiver) {
        this.a = 13;
        Preconditions.checkNotNull(appMeasurementReceiver);
        this.b = appMeasurementReceiver;
    }

    public GQ0() {
        this.a = 1;
        this.b = new ArrayList();
    }

    public GQ0(C3513e41 c3513e41) {
        this.a = 6;
        this.b = (TorchFlashRequiredFor3aUpdateQuirk) c3513e41.z0(TorchFlashRequiredFor3aUpdateQuirk.class);
    }
}
