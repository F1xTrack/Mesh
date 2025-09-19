package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.AbstractActivityC1730l;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import p000.AbstractC10815qk0;
import p000.C0926Oi;
import p000.C10943rk0;
import p000.C11071sk0;
import p000.C11199tk0;
import p000.C11287uQ0;
import p000.C11354ux1;
import p000.C7621Fx1;
import p000.C8932c31;
import p000.Y41;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends AbstractActivityC1730l {

    /* renamed from: k */
    public static boolean f18039k = false;

    /* renamed from: f */
    public boolean f18040f = false;

    /* renamed from: g */
    public SignInConfiguration f18041g;

    /* renamed from: h */
    public boolean f18042h;

    /* renamed from: i */
    public int f18043i;

    /* renamed from: j */
    public Intent f18044j;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [Li0, java.lang.Object] */
    /* renamed from: g */
    public final void m11106g() {
        C11199tk0 c11199tk0M24054a = AbstractC10815qk0.m24054a(this);
        C11287uQ0 c11287uQ0 = new C11287uQ0(this);
        C11071sk0 c11071sk0 = c11199tk0M24054a.f43234b;
        if (c11071sk0.f42583e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C8932c31 c8932c31 = c11071sk0.f42582d;
        C10943rk0 c10943rk0 = (C10943rk0) c8932c31.m10582f(0, null);
        if (c10943rk0 == 0) {
            try {
                c11071sk0.f42583e = true;
                C11354ux1 c11354ux1 = new C11354ux1(this, GoogleApiClient.getAllClients());
                if (C11354ux1.class.isMemberClass() && !Modifier.isStatic(C11354ux1.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c11354ux1);
                }
                C10943rk0 c10943rk02 = new C10943rk0(c11354ux1);
                c8932c31.m10583g(0, c10943rk02);
                c11071sk0.f42583e = false;
                C0926Oi c0926Oi = new C0926Oi(c10943rk02.f41839l, c11287uQ0);
                c10943rk02.m10133e(r0, c0926Oi);
                C0926Oi c0926Oi2 = c10943rk02.f41841n;
                if (c0926Oi2 != null) {
                    c10943rk02.mo10135i(c0926Oi2);
                }
                c10943rk02.f41840m = r0;
                c10943rk02.f41841n = c0926Oi;
            } catch (Throwable th) {
                c11071sk0.f42583e = false;
                throw th;
            }
        } else {
            C0926Oi c0926Oi3 = new C0926Oi(c10943rk0.f41839l, c11287uQ0);
            c10943rk0.m10133e(r0, c0926Oi3);
            C0926Oi c0926Oi4 = c10943rk0.f41841n;
            if (c0926Oi4 != null) {
                c10943rk0.mo10135i(c0926Oi4);
            }
            c10943rk0.f41840m = r0;
            c10943rk0.f41841n = c0926Oi3;
        }
        f18039k = false;
    }

    /* renamed from: h */
    public final void m11107h(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f18039k = false;
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, p000.AbstractActivityC0499Hv, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f18040f) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f18035b) != null) {
                C7621Fx1 c7621Fx1M2835A = C7621Fx1.m2835A(this);
                GoogleSignInOptions googleSignInOptions = this.f18041g.f18038b;
                synchronized (c7621Fx1M2835A) {
                    ((Y41) c7621Fx1M2835A.f3494a).m9213d(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f18042h = true;
                this.f18043i = i2;
                this.f18044j = intent;
                m11106g();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m11107h(intExtra);
                return;
            }
        }
        m11107h(8);
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, p000.AbstractActivityC0499Hv, p000.AbstractActivityC0436Gv, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            m11107h(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            m11107h(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            "Unknown action: ".concat(String.valueOf(intent.getAction()));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.f18041g = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.f18042h = z;
            if (z) {
                this.f18043i = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 == null) {
                    setResult(0);
                    finish();
                    return;
                } else {
                    this.f18044j = intent2;
                    m11106g();
                    return;
                }
            }
            return;
        }
        if (f18039k) {
            setResult(0);
            m11107h(12502);
            return;
        }
        f18039k = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f18041g);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f18040f = true;
            m11107h(17);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1730l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f18039k = false;
    }

    @Override // p000.AbstractActivityC0499Hv, p000.AbstractActivityC0436Gv, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f18042h);
        if (this.f18042h) {
            bundle.putInt("signInResultCode", this.f18043i);
            bundle.putParcelable("signInResultData", this.f18044j);
        }
    }
}
