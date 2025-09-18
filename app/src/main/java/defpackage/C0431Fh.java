package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.l;
import androidx.fragment.app.o;
import java.util.concurrent.Executor;
import ru.mes.dnevnik.R;

/* renamed from: Fh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0431Fh extends Fragment {
    public final Handler a = new Handler(Looper.getMainLooper());
    public C1210Ph b;

    public final void dismiss() {
        this.b.m = false;
        s();
        if (!this.b.o && isAdded()) {
            o parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            a aVar = new a(parentFragmentManager);
            aVar.i(this);
            aVar.f(true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : context.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        C1210Ph c1210Ph = this.b;
                        c1210Ph.p = true;
                        this.a.postDelayed(new RunnableC0353Eh(c1210Ph, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            C1210Ph c1210Ph = this.b;
            c1210Ph.o = false;
            if (i2 != -1) {
                w(10, getString(R.string.generic_error_user_canceled));
                return;
            }
            C0665Ih c0665Ih = new C0665Ih(null, 1);
            if (c1210Ph.n) {
                c1210Ph.n = false;
                Executor executorC1054Nh = c1210Ph.d;
                if (executorC1054Nh == null) {
                    executorC1054Nh = new ExecutorC1054Nh(0);
                }
                executorC1054Nh.execute(new WZ(this, c0665Ih, false, 4));
            }
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        C1210Ph c1210Ph = (C1210Ph) new C5772lr0(getActivity()).L(C1210Ph.class);
        this.b = c1210Ph;
        if (c1210Ph.r == null) {
            c1210Ph.r = new C0390Et0();
        }
        c1210Ph.r.e(this, new C3513e41(4, this));
        C1210Ph c1210Ph2 = this.b;
        if (c1210Ph2.s == null) {
            c1210Ph2.s = new C0390Et0();
        }
        c1210Ph2.s.e(this, new C0136Bm1(4, this));
        C1210Ph c1210Ph3 = this.b;
        if (c1210Ph3.t == null) {
            c1210Ph3.t = new C0390Et0();
        }
        c1210Ph3.t.e(this, new C3866fw1(3, this));
        C1210Ph c1210Ph4 = this.b;
        if (c1210Ph4.u == null) {
            c1210Ph4.u = new C0390Et0();
        }
        c1210Ph4.u.e(this, new C0481Fx1(this));
        C1210Ph c1210Ph5 = this.b;
        if (c1210Ph5.v == null) {
            c1210Ph5.v = new C0390Et0();
        }
        c1210Ph5.v.e(this, new G10(4, this));
        C1210Ph c1210Ph6 = this.b;
        if (c1210Ph6.x == null) {
            c1210Ph6.x = new C0390Et0();
        }
        c1210Ph6.x.e(this, new C1016Mu0(5, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && AbstractC5686lO1.e(this.b.c())) {
            C1210Ph c1210Ph = this.b;
            c1210Ph.q = true;
            this.a.postDelayed(new RunnableC0353Eh(c1210Ph, 2), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.b.o) {
            return;
        }
        l activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            r(0);
        }
    }

    public final void r(int i) {
        if (i == 3 || !this.b.q) {
            if (u()) {
                this.b.l = i;
                if (i == 1) {
                    x(10, G02.a(getContext(), 10));
                }
            }
            C1210Ph c1210Ph = this.b;
            if (c1210Ph.i == null) {
                c1210Ph.i = new C0999Mo1(6);
            }
            C0999Mo1 c0999Mo1 = c1210Ph.i;
            CancellationSignal cancellationSignal = (CancellationSignal) c0999Mo1.a;
            if (cancellationSignal != null) {
                try {
                    AbstractC1000Mp.a(cancellationSignal);
                } catch (NullPointerException unused) {
                }
                c0999Mo1.a = null;
            }
            C0923Lp c0923Lp = (C0923Lp) c0999Mo1.b;
            if (c0923Lp != null) {
                try {
                    c0923Lp.a();
                } catch (NullPointerException unused2) {
                }
                c0999Mo1.b = null;
            }
        }
    }

    public final void s() {
        this.b.m = false;
        if (isAdded()) {
            o parentFragmentManager = getParentFragmentManager();
            CU cu = (CU) parentFragmentManager.B("androidx.biometric.FingerprintDialogFragment");
            if (cu != null) {
                if (cu.isAdded()) {
                    cu.dismissAllowingStateLoss();
                    return;
                }
                a aVar = new a(parentFragmentManager);
                aVar.i(cu);
                aVar.f(true);
            }
        }
    }

    public final boolean t() {
        return Build.VERSION.SDK_INT <= 28 && AbstractC5686lO1.e(this.b.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u() {
        /*
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L71
            androidx.fragment.app.l r2 = r9.getActivity()
            r3 = 0
            if (r2 == 0) goto L56
            Ph r4 = r9.b
            Oo1 r4 = r4.g
            if (r4 == 0) goto L56
            java.lang.String r4 = android.os.Build.MANUFACTURER
            java.lang.String r5 = android.os.Build.MODEL
            if (r0 == r1) goto L1a
            goto L56
        L1a:
            if (r4 != 0) goto L1d
            goto L38
        L1d:
            android.content.res.Resources r0 = r2.getResources()
            r6 = 2130903042(0x7f030002, float:1.741289E38)
            java.lang.String[] r0 = r0.getStringArray(r6)
            int r6 = r0.length
            r7 = r3
        L2a:
            if (r7 >= r6) goto L38
            r8 = r0[r7]
            boolean r8 = r4.equalsIgnoreCase(r8)
            if (r8 == 0) goto L35
            goto L71
        L35:
            int r7 = r7 + 1
            goto L2a
        L38:
            if (r5 != 0) goto L3b
            goto L56
        L3b:
            android.content.res.Resources r0 = r2.getResources()
            r2 = 2130903041(0x7f030001, float:1.7412889E38)
            java.lang.String[] r0 = r0.getStringArray(r2)
            int r2 = r0.length
            r4 = r3
        L48:
            if (r4 >= r2) goto L56
            r6 = r0[r4]
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L53
            goto L71
        L53:
            int r4 = r4 + 1
            goto L48
        L56:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r1) goto L72
            android.content.Context r0 = r9.getContext()
            if (r0 == 0) goto L71
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            if (r1 == 0) goto L71
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r0 = defpackage.AbstractC0642Hz0.a(r0)
            if (r0 == 0) goto L71
            goto L72
        L71:
            r3 = 1
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0431Fh.u():boolean");
    }

    public final void v() {
        l activity = getActivity();
        if (activity == null) {
            return;
        }
        KeyguardManager keyguardManagerA = AbstractC7075sg0.a(activity);
        if (keyguardManagerA == null) {
            w(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        C0821Kh c0821Kh = this.b.f;
        String str = c0821Kh != null ? c0821Kh.a : null;
        String str2 = c0821Kh != null ? c0821Kh.b : null;
        String str3 = c0821Kh != null ? c0821Kh.c : null;
        if (str2 == null) {
            str2 = str3;
        }
        Intent intentA = AbstractC8410zh.a(keyguardManagerA, str, str2);
        if (intentA == null) {
            w(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.b.o = true;
        if (u()) {
            s();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    public final void w(int i, CharSequence charSequence) {
        x(i, charSequence);
        dismiss();
    }

    public final void x(int i, CharSequence charSequence) {
        C1210Ph c1210Ph = this.b;
        if (!c1210Ph.o && c1210Ph.n) {
            c1210Ph.n = false;
            Executor executorC1054Nh = c1210Ph.d;
            if (executorC1054Nh == null) {
                executorC1054Nh = new ExecutorC1054Nh(0);
            }
            executorC1054Nh.execute(new RunnableC8030xh(this, i, charSequence, 0));
        }
    }

    public final void y(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        this.b.g(2);
        this.b.f(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0431Fh.z():void");
    }
}
