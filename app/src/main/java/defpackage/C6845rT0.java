package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.RectF;
import android.location.Location;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.bridge.Callback;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.Task;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yandex.varioqub.config.FetchError;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: rT0 */
/* loaded from: classes2.dex */
public final class C6845rT0 implements InterfaceC5369jk0, InterfaceC2315bO, K30, OnFetchCompleteListener, InterfaceC1863Xq1, InterfaceC1651Uy {
    public final Object a;

    public /* synthetic */ C6845rT0(Object obj) {
        this.a = obj;
    }

    public static boolean a(String str) {
        String[] strArr = AbstractC0759Jm0.d;
        boolean z = false;
        for (int i = 0; i < 14; i++) {
            String str2 = strArr[i];
            String strI = AbstractC8235ym.i(str2, str);
            if (new File(str2, str).exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append(strI);
                sb.append(" binary detected!");
                AbstractC8352zN1.c();
                z = true;
            }
        }
        return z;
    }

    public static C6845rT0 k(String str) {
        return new C6845rT0((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC3582eR1.UNINITIALIZED : XQ1.f(str.charAt(0)));
    }

    public static String s(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return AbstractC1705Vq.h(str, " : ", str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    @Override // defpackage.InterfaceC1863Xq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r5, defpackage.AbstractC1963Yy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C8448zt1
            if (r0 == 0) goto L13
            r0 = r6
            zt1 r0 = (defpackage.C8448zt1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zt1 r0 = new zt1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.RQ1.d(r6)
            PS0 r6 = (defpackage.PS0) r6
            java.lang.Object r5 = r6.a
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.RQ1.d(r6)
            r0.c = r3
            java.lang.Object r6 = r4.a
            lu1 r6 = (defpackage.C5782lu1) r6
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6845rT0.b(java.lang.String, Yy):java.lang.Object");
    }

    public boolean c(ArrayList arrayList) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = ((Context) this.a).getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                AbstractC8352zN1.a(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x021a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d() {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6845rT0.d():boolean");
    }

    public void e() {
        if (!((N81) this.a).i()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    @Override // defpackage.K30
    public void f() {
        ((UCropActivity) this.a).s.setImageToWrapCropBounds(true);
    }

    public void g(Exception exc) {
        N81 n81 = (N81) this.a;
        synchronized (n81.a) {
            try {
                if (n81.b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                n81.b = true;
                n81.e = exc;
                n81.a.notifyAll();
                n81.h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.K30
    public void h(float f) {
        UCropActivity uCropActivity = (UCropActivity) this.a;
        if (f > 0.0f) {
            GestureCropImageView gestureCropImageView = uCropActivity.s;
            float maxScale = (((uCropActivity.s.getMaxScale() - uCropActivity.s.getMinScale()) / 15000.0f) * f) + gestureCropImageView.getCurrentScale();
            RectF rectF = gestureCropImageView.s;
            gestureCropImageView.i(maxScale, rectF.centerX(), rectF.centerY());
            return;
        }
        GestureCropImageView gestureCropImageView2 = uCropActivity.s;
        float maxScale2 = (((uCropActivity.s.getMaxScale() - uCropActivity.s.getMinScale()) / 15000.0f) * f) + gestureCropImageView2.getCurrentScale();
        RectF rectF2 = gestureCropImageView2.s;
        float fCenterX = rectF2.centerX();
        float fCenterY = rectF2.centerY();
        if (maxScale2 >= gestureCropImageView2.getMinScale()) {
            gestureCropImageView2.h(maxScale2 / gestureCropImageView2.getCurrentScale(), fCenterX, fCenterY);
        }
    }

    public void i(Object obj) {
        if (!((N81) this.a).j(obj)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    @Override // defpackage.K30
    public void j() {
        ((UCropActivity) this.a).s.f();
    }

    public void l() {
        WW1 ww1 = (WW1) this.a;
        ww1.v1();
        UM1 um1T1 = ww1.t1();
        C3386dP1 c3386dP1 = (C3386dP1) ww1.b;
        if (um1T1.z1(c3386dP1.n.currentTimeMillis())) {
            ww1.t1().n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                ww1.n().o.d("Detected application was in foreground");
                p(c3386dP1.n.currentTimeMillis());
            }
        }
    }

    @Override // defpackage.InterfaceC2315bO
    public boolean n(Object obj, File file, C0795Jy0 c0795Jy0) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C8426zm0 c8426zm0 = (C8426zm0) this.a;
        byte[] bArr = (byte[]) c8426zm0.d(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    c8426zm0.h(bArr);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    c8426zm0.h(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            c8426zm0.h(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void o(long j, boolean z) {
        WW1 ww1 = (WW1) this.a;
        ww1.v1();
        ww1.C1();
        if (ww1.t1().z1(j)) {
            ww1.t1().n.a(true);
            ((C3386dP1) ww1.b).j().E1();
        }
        ww1.t1().r.h(j);
        if (ww1.t1().n.b()) {
            p(j);
        }
    }

    @Override // defpackage.InterfaceC5369jk0
    public C3829fk0 o0(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, IOException iOException, int i) {
        ((C7937xC) ((C1304Qm0) this.a).b).y(iOException);
        return C1857Xo1.h;
    }

    @Override // com.yandex.varioqub.config.OnFetchCompleteListener
    public void onError(String str, FetchError fetchError) {
        int i = AbstractC4396ii1.a[fetchError.ordinal()];
        Callback callback = (Callback) this.a;
        switch (i) {
            case 1:
                callback.invoke(null, 1);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                callback.invoke(fetchError.toString(), 2);
                break;
            default:
                fetchError.toString();
                break;
        }
    }

    @Override // com.yandex.varioqub.config.OnFetchCompleteListener
    public void onSuccess() {
        ((Callback) this.a).invoke(null, 0);
    }

    public void p(long j) {
        WW1 ww1 = (WW1) this.a;
        ww1.v1();
        C3386dP1 c3386dP1 = (C3386dP1) ww1.b;
        if (c3386dP1.f()) {
            ww1.t1().r.h(j);
            long jElapsedRealtime = c3386dP1.n.elapsedRealtime();
            OL1 ol1N = ww1.n();
            ol1N.o.c(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j2 = j / 1000;
            ww1.w1().D1(j, Long.valueOf(j2), "auto", "_sid");
            ww1.t1().s.h(j2);
            ww1.t1().n.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            ww1.w1().C1(j, bundle, "auto", "_s");
            String strO = ww1.t1().x.o();
            if (TextUtils.isEmpty(strO)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strO);
            ww1.w1().C1(j, bundle2, "auto", "_ssr");
        }
    }

    public void q(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            s((String) this.a, str, objArr);
        }
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        Api.ClientKey clientKey = RB1.a;
        boolean zK = task.k();
        S81 s81 = (S81) this.a;
        if (zK) {
            s81.d((Location) task.i());
            return null;
        }
        Exception excH = task.h();
        excH.getClass();
        s81.c(excH);
        return null;
    }

    @Override // defpackage.InterfaceC5369jk0
    public void v(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2) {
        boolean z;
        C1304Qm0 c1304Qm0 = (C1304Qm0) this.a;
        synchronized (II1.b) {
            z = II1.c;
        }
        if (z) {
            c1304Qm0.w();
        } else {
            ((C7937xC) c1304Qm0.b).y(new IOException(new ConcurrentModificationException()));
        }
    }

    public C6845rT0(C0936Lt1 c0936Lt1) {
        O90.f(c0936Lt1, "clientSdkModeRepository");
        this.a = c0936Lt1;
    }

    public C6845rT0(String str) {
        this.a = AbstractC8235ym.j("UID: [", "]  PID: [", Process.myUid(), Process.myPid(), "] ").concat(str);
    }

    public C6845rT0() {
        this.a = new N81();
    }

    @Override // defpackage.InterfaceC5369jk0
    public void m(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, boolean z) {
    }
}
