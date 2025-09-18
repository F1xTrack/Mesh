package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.C1719a;
import androidx.fragment.app.Fragment;
import java.util.concurrent.Executor;
import ru.mes.dnevnik.R;

/* renamed from: Fh */
/* loaded from: classes.dex */
public class C0359Fh extends Fragment {

    /* renamed from: a */
    public final Handler f3388a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public C0988Ph f3389b;

    public final void dismiss() {
        this.f3389b.f9236m = false;
        m2740s();
        if (!this.f3389b.f9238o && isAdded()) {
            AbstractC1733o parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C1719a c1719a = new C1719a(parentFragmentManager);
            c1719a.m10018i(this);
            c1719a.m10015f(true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : context.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        C0988Ph c0988Ph = this.f3389b;
                        c0988Ph.f9239p = true;
                        this.f3388a.postDelayed(new RunnableC0296Eh(c0988Ph, 1), 600L);
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
            C0988Ph c0988Ph = this.f3389b;
            c0988Ph.f9238o = false;
            if (i2 != -1) {
                m2744w(10, getString(R.string.generic_error_user_canceled));
                return;
            }
            C0548Ih c0548Ih = new C0548Ih(null, 1);
            if (c0988Ph.f9237n) {
                c0988Ph.f9237n = false;
                Executor executorC0862Nh = c0988Ph.f9227d;
                if (executorC0862Nh == null) {
                    executorC0862Nh = new ExecutorC0862Nh(0);
                }
                executorC0862Nh.execute(new RunnableC1420WZ(this, c0548Ih, false, 4));
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
        C0988Ph c0988Ph = (C0988Ph) new C10189lr0(getActivity()).m22554L(C0988Ph.class);
        this.f3389b = c0988Ph;
        if (c0988Ph.f9241r == null) {
            c0988Ph.f9241r = new C7560Et0();
        }
        c0988Ph.f9241r.m10133e(this, new C9196e41(4, this));
        C0988Ph c0988Ph2 = this.f3389b;
        if (c0988Ph2.f9242s == null) {
            c0988Ph2.f9242s = new C7560Et0();
        }
        c0988Ph2.f9242s.m10133e(this, new C7391Bm1(4, this));
        C0988Ph c0988Ph3 = this.f3389b;
        if (c0988Ph3.f9243t == null) {
            c0988Ph3.f9243t = new C7560Et0();
        }
        c0988Ph3.f9243t.m10133e(this, new C9432fw1(3, this));
        C0988Ph c0988Ph4 = this.f3389b;
        if (c0988Ph4.f9244u == null) {
            c0988Ph4.f9244u = new C7560Et0();
        }
        c0988Ph4.f9244u.m10133e(this, new C7621Fx1(this));
        C0988Ph c0988Ph5 = this.f3389b;
        if (c0988Ph5.f9245v == null) {
            c0988Ph5.f9245v = new C7560Et0();
        }
        c0988Ph5.f9245v.m10133e(this, new G10(4, this));
        C0988Ph c0988Ph6 = this.f3389b;
        if (c0988Ph6.f9247x == null) {
            c0988Ph6.f9247x = new C7560Et0();
        }
        c0988Ph6.f9247x.m10133e(this, new C7978Mu0(5, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && AbstractC10132lO1.m22420e(this.f3389b.m6412c())) {
            C0988Ph c0988Ph = this.f3389b;
            c0988Ph.f9240q = true;
            this.f3388a.postDelayed(new RunnableC0296Eh(c0988Ph, 2), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.f3389b.f9238o) {
            return;
        }
        AbstractActivityC1730l activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            m2739r(0);
        }
    }

    /* renamed from: r */
    public final void m2739r(int i) {
        if (i == 3 || !this.f3389b.f9240q) {
            if (m2742u()) {
                this.f3389b.f9235l = i;
                if (i == 1) {
                    m2745x(10, G02.m2879a(getContext(), 10));
                }
            }
            C0988Ph c0988Ph = this.f3389b;
            if (c0988Ph.f9232i == null) {
                c0988Ph.f9232i = new C7967Mo1(6);
            }
            C7967Mo1 c7967Mo1 = c0988Ph.f9232i;
            CancellationSignal cancellationSignal = (CancellationSignal) c7967Mo1.f7362a;
            if (cancellationSignal != null) {
                try {
                    AbstractC0807Mp.m5458a(cancellationSignal);
                } catch (NullPointerException unused) {
                }
                c7967Mo1.f7362a = null;
            }
            C0744Lp c0744Lp = (C0744Lp) c7967Mo1.f7363b;
            if (c0744Lp != null) {
                try {
                    c0744Lp.m5109a();
                } catch (NullPointerException unused2) {
                }
                c7967Mo1.f7363b = null;
            }
        }
    }

    /* renamed from: s */
    public final void m2740s() {
        this.f3389b.f9236m = false;
        if (isAdded()) {
            AbstractC1733o parentFragmentManager = getParentFragmentManager();
            C0157CU c0157cu = (C0157CU) parentFragmentManager.m10039B("androidx.biometric.FingerprintDialogFragment");
            if (c0157cu != null) {
                if (c0157cu.isAdded()) {
                    c0157cu.dismissAllowingStateLoss();
                    return;
                }
                C1719a c1719a = new C1719a(parentFragmentManager);
                c1719a.m10018i(c0157cu);
                c1719a.m10015f(true);
            }
        }
    }

    /* renamed from: t */
    public final boolean m2741t() {
        return Build.VERSION.SDK_INT <= 28 && AbstractC10132lO1.m22420e(this.f3389b.m6412c());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2742u() {
        /*
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L71
            androidx.fragment.app.l r2 = r9.getActivity()
            r3 = 0
            if (r2 == 0) goto L56
            Ph r4 = r9.f3389b
            Oo1 r4 = r4.f9230g
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
            boolean r0 = p000.AbstractC7728Hz0.m3656a(r0)
            if (r0 == 0) goto L71
            goto L72
        L71:
            r3 = 1
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0359Fh.m2742u():boolean");
    }

    /* renamed from: v */
    public final void m2743v() {
        AbstractActivityC1730l activity = getActivity();
        if (activity == null) {
            return;
        }
        KeyguardManager keyguardManagerM24763a = AbstractC11063sg0.m24763a(activity);
        if (keyguardManagerM24763a == null) {
            m2744w(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        C0674Kh c0674Kh = this.f3389b.f9229f;
        String str = c0674Kh != null ? c0674Kh.f6252a : null;
        String str2 = c0674Kh != null ? c0674Kh.f6253b : null;
        String str3 = c0674Kh != null ? c0674Kh.f6254c : null;
        if (str2 == null) {
            str2 = str3;
        }
        Intent intentM26513a = AbstractC7280zh.m26513a(keyguardManagerM24763a, str, str2);
        if (intentM26513a == null) {
            m2744w(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.f3389b.f9238o = true;
        if (m2742u()) {
            m2740s();
        }
        intentM26513a.setFlags(134742016);
        startActivityForResult(intentM26513a, 1);
    }

    /* renamed from: w */
    public final void m2744w(int i, CharSequence charSequence) {
        m2745x(i, charSequence);
        dismiss();
    }

    /* renamed from: x */
    public final void m2745x(int i, CharSequence charSequence) {
        C0988Ph c0988Ph = this.f3389b;
        if (!c0988Ph.f9238o && c0988Ph.f9237n) {
            c0988Ph.f9237n = false;
            Executor executorC0862Nh = c0988Ph.f9227d;
            if (executorC0862Nh == null) {
                executorC0862Nh = new ExecutorC0862Nh(0);
            }
            executorC0862Nh.execute(new RunnableC7154xh(this, i, charSequence, 0));
        }
    }

    /* renamed from: y */
    public final void m2746y(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        this.f3389b.m6416g(2);
        this.f3389b.m6415f(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2747z() {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0359Fh.m2747z():void");
    }
}
