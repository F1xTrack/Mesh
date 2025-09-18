package p000;

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
public final class C10909rT0 implements InterfaceC9919jk0, InterfaceC1782bO, K30, OnFetchCompleteListener, InterfaceC8543Xq1, InterfaceC1319Uy {

    /* renamed from: a */
    public final Object f41672a;

    public /* synthetic */ C10909rT0(Object obj) {
        this.f41672a = obj;
    }

    /* renamed from: a */
    public static boolean m24350a(String str) {
        String[] strArr = AbstractC7806Jm0.f5690d;
        boolean z = false;
        for (int i = 0; i < 14; i++) {
            String str2 = strArr[i];
            String strM26232i = AbstractC7222ym.m26232i(str2, str);
            if (new File(str2, str).exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append(strM26232i);
                sb.append(" binary detected!");
                AbstractC11918zN1.m26395c();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: k */
    public static C10909rT0 m24351k(String str) {
        return new C10909rT0((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC9242eR1.UNINITIALIZED : XQ1.m9044f(str.charAt(0)));
    }

    /* renamed from: s */
    public static String m24352s(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return AbstractC1374Vq.m8589h(str, " : ", str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    @Override // p000.InterfaceC8543Xq1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo9157b(java.lang.String r5, p000.AbstractC1571Yy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000.C11982zt1
            if (r0 == 0) goto L13
            r0 = r6
            zt1 r0 = (p000.C11982zt1) r0
            int r1 = r0.f47087c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47087c = r1
            goto L18
        L13:
            zt1 r0 = new zt1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f47085a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f47087c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p000.RQ1.m7017d(r6)
            PS0 r6 = (p000.PS0) r6
            java.lang.Object r5 = r6.f9075a
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p000.RQ1.m7017d(r6)
            r0.f47087c = r3
            java.lang.Object r6 = r4.f41672a
            lu1 r6 = (p000.C10196lu1) r6
            java.lang.Object r5 = r6.m22596b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10909rT0.mo9157b(java.lang.String, Yy):java.lang.Object");
    }

    /* renamed from: c */
    public boolean m24353c(ArrayList arrayList) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = ((Context) this.f41672a).getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                AbstractC11918zN1.m26393a(str + " ROOT management app detected!");
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
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m24354d() {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10909rT0.m24354d():boolean");
    }

    /* renamed from: e */
    public void m24355e() {
        if (!((N81) this.f41672a).m5576i()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    @Override // p000.K30
    /* renamed from: f */
    public void mo4538f() {
        ((UCropActivity) this.f41672a).f20631s.setImageToWrapCropBounds(true);
    }

    /* renamed from: g */
    public void m24356g(Exception exc) {
        N81 n81 = (N81) this.f41672a;
        synchronized (n81.f7527a) {
            try {
                if (n81.f7528b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                n81.f7528b = true;
                n81.f7531e = exc;
                n81.f7527a.notifyAll();
                n81.m5575h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.K30
    /* renamed from: h */
    public void mo4539h(float f) {
        UCropActivity uCropActivity = (UCropActivity) this.f41672a;
        if (f > 0.0f) {
            GestureCropImageView gestureCropImageView = uCropActivity.f20631s;
            float maxScale = (((uCropActivity.f20631s.getMaxScale() - uCropActivity.f20631s.getMinScale()) / 15000.0f) * f) + gestureCropImageView.getCurrentScale();
            RectF rectF = gestureCropImageView.f36338s;
            gestureCropImageView.m22164i(maxScale, rectF.centerX(), rectF.centerY());
            return;
        }
        GestureCropImageView gestureCropImageView2 = uCropActivity.f20631s;
        float maxScale2 = (((uCropActivity.f20631s.getMaxScale() - uCropActivity.f20631s.getMinScale()) / 15000.0f) * f) + gestureCropImageView2.getCurrentScale();
        RectF rectF2 = gestureCropImageView2.f36338s;
        float fCenterX = rectF2.centerX();
        float fCenterY = rectF2.centerY();
        if (maxScale2 >= gestureCropImageView2.getMinScale()) {
            gestureCropImageView2.m22163h(maxScale2 / gestureCropImageView2.getCurrentScale(), fCenterX, fCenterY);
        }
    }

    /* renamed from: i */
    public void m24357i(Object obj) {
        if (!((N81) this.f41672a).m5577j(obj)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    @Override // p000.K30
    /* renamed from: j */
    public void mo4540j() {
        ((UCropActivity) this.f41672a).f20631s.m22161f();
    }

    /* renamed from: l */
    public void m24358l() {
        WW1 ww1 = (WW1) this.f41672a;
        ww1.mo7681v1();
        UM1 um1M7851t1 = ww1.m7851t1();
        C9110dP1 c9110dP1 = (C9110dP1) ww1.f11615b;
        if (um1M7851t1.m7996z1(c9110dP1.f26044n.currentTimeMillis())) {
            ww1.m7851t1().f11753n.m17920a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                ww1.mo6070n().f8386o.m24555d("Detected application was in foreground");
                m24360p(c9110dP1.f26044n.currentTimeMillis());
            }
        }
    }

    @Override // p000.InterfaceC1782bO
    /* renamed from: n */
    public boolean mo397n(Object obj, File file, C7830Jy0 c7830Jy0) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C11967zm0 c11967zm0 = (C11967zm0) this.f41672a;
        byte[] bArr = (byte[]) c11967zm0.m26542d(65536, byte[].class);
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
                    c11967zm0.m26546h(bArr);
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
                    c11967zm0.m26546h(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            c11967zm0.m26546h(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: o */
    public void m24359o(long j, boolean z) {
        WW1 ww1 = (WW1) this.f41672a;
        ww1.mo7681v1();
        ww1.m8803C1();
        if (ww1.m7851t1().m7996z1(j)) {
            ww1.m7851t1().f11753n.m17920a(true);
            ((C9110dP1) ww1.f11615b).m17597j().m22027E1();
        }
        ww1.m7851t1().f11757r.m18963h(j);
        if (ww1.m7851t1().f11753n.m17921b()) {
            m24360p(j);
        }
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: o0 */
    public C9407fk0 mo2002o0(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, IOException iOException, int i) {
        ((C7123xC) ((C8170Qm0) this.f41672a).f9780b).m25812y(iOException);
        return C8539Xo1.f13978h;
    }

    @Override // com.yandex.varioqub.config.OnFetchCompleteListener
    public void onError(String str, FetchError fetchError) {
        int i = AbstractC9788ii1.f29417a[fetchError.ordinal()];
        Callback callback = (Callback) this.f41672a;
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
        ((Callback) this.f41672a).invoke(null, 0);
    }

    /* renamed from: p */
    public void m24360p(long j) {
        WW1 ww1 = (WW1) this.f41672a;
        ww1.mo7681v1();
        C9110dP1 c9110dP1 = (C9110dP1) ww1.f11615b;
        if (c9110dP1.m17593f()) {
            ww1.m7851t1().f11757r.m18963h(j);
            long jElapsedRealtime = c9110dP1.f26044n.elapsedRealtime();
            OL1 ol1Mo6070n = ww1.mo6070n();
            ol1Mo6070n.f8386o.m24554c(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j2 = j / 1000;
            ww1.m7682w1().m2634D1(j, Long.valueOf(j2), "auto", "_sid");
            ww1.m7851t1().f11758s.m18963h(j2);
            ww1.m7851t1().f11753n.m17920a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            ww1.m7682w1().m2633C1(j, bundle, "auto", "_s");
            String strM8350o = ww1.m7851t1().f11763x.m8350o();
            if (TextUtils.isEmpty(strM8350o)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strM8350o);
            ww1.m7682w1().m2633C1(j, bundle2, "auto", "_ssr");
        }
    }

    /* renamed from: q */
    public void m24361q(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            m24352s((String) this.f41672a, str, objArr);
        }
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        Api.ClientKey clientKey = RB1.f10059a;
        boolean zMo11144k = task.mo11144k();
        S81 s81 = (S81) this.f41672a;
        if (zMo11144k) {
            s81.m7186d((Location) task.mo11142i());
            return null;
        }
        Exception excMo11141h = task.mo11141h();
        excMo11141h.getClass();
        s81.m7185c(excMo11141h);
        return null;
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: v */
    public void mo2004v(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2) {
        boolean z;
        C8170Qm0 c8170Qm0 = (C8170Qm0) this.f41672a;
        synchronized (II1.f4885b) {
            z = II1.f4886c;
        }
        if (z) {
            c8170Qm0.m6780w();
        } else {
            ((C7123xC) c8170Qm0.f9780b).m25812y(new IOException(new ConcurrentModificationException()));
        }
    }

    public C10909rT0(C7925Lt1 c7925Lt1) {
        O90.m5968f(c7925Lt1, "clientSdkModeRepository");
        this.f41672a = c7925Lt1;
    }

    public C10909rT0(String str) {
        this.f41672a = AbstractC7222ym.m26233j("UID: [", "]  PID: [", Process.myUid(), Process.myPid(), "] ").concat(str);
    }

    public C10909rT0() {
        this.f41672a = new N81();
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: m */
    public void mo2001m(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, boolean z) {
    }
}
