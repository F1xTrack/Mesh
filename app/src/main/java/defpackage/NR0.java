package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import androidx.fragment.app.o;
import com.bumptech.glide.manager.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class NR0 implements Handler.Callback {
    public static final C5396jt0 l = new C5396jt0(20);
    public volatile JR0 a;
    public final Handler d;
    public final MR0 e;
    public final C1016Mu0 f;
    public final RY j;
    public final a k;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final C7925x8 g = new C7925x8();
    public final C7925x8 h = new C7925x8();
    public final Bundle i = new Bundle();

    public NR0(MR0 mr0, C1016Mu0 c1016Mu0) {
        mr0 = mr0 == null ? l : mr0;
        this.e = mr0;
        this.f = c1016Mu0;
        this.d = new Handler(Looper.getMainLooper(), this);
        this.k = new a(mr0);
        this.j = (F20.h && F20.g) ? ((Map) c1016Mu0.b).containsKey(AbstractC7522v10.class) ? new HV() : new C0162Bv0(14) : new C5806m12(12);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(List list, C7925x8 c7925x8) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                c7925x8.put(fragment.getView(), fragment);
                c(fragment.getChildFragmentManager().c.f(), c7925x8);
            }
        }
    }

    public final void b(FragmentManager fragmentManager, C7925x8 c7925x8) {
        android.app.Fragment fragment;
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment2 : fragmentManager.getFragments()) {
                if (fragment2.getView() != null) {
                    c7925x8.put(fragment2.getView(), fragment2);
                    b(fragment2.getChildFragmentManager(), c7925x8);
                }
            }
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Bundle bundle = this.i;
            bundle.putInt("key", i);
            try {
                fragment = fragmentManager.getFragment(bundle, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                c7925x8.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager(), c7925x8);
            }
            i = i2;
        }
    }

    public final JR0 d(Activity activity, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        KR0 kr0J = j(fragmentManager, fragment);
        JR0 jr0D = kr0J.d;
        if (jr0D == null) {
            jr0D = this.e.d(com.bumptech.glide.a.a(activity), kr0J.a, kr0J.b, activity);
            if (z) {
                jr0D.onStart();
            }
            kr0J.d = jr0D;
        }
        return jr0D;
    }

    public final JR0 e(Activity activity) {
        if (AbstractC0121Bh1.i()) {
            return g(activity.getApplicationContext());
        }
        if (activity instanceof l) {
            return i((l) activity);
        }
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.j.getClass();
        FragmentManager fragmentManager = activity.getFragmentManager();
        Activity activityA = a(activity);
        return d(activity, fragmentManager, null, activityA == null || !activityA.isFinishing());
    }

    public final JR0 f(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (AbstractC0121Bh1.i()) {
            return g(fragment.getActivity().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            fragment.getActivity();
            this.j.getClass();
        }
        return d(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    public final JR0 g(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = AbstractC0121Bh1.a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof l) {
                return i((l) context);
            }
            if (context instanceof Activity) {
                return e((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return g(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = this.e.d(com.bumptech.glide.a.a(context.getApplicationContext()), new C7532v32(7), new C1538Tm0(13), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public final JR0 h(Fragment fragment) {
        IL1.d(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (AbstractC0121Bh1.i()) {
            return g(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            fragment.getActivity();
            this.j.getClass();
        }
        o childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        if (!((Map) this.f.b).containsKey(AbstractC7331u10.class)) {
            return l(context, childFragmentManager, fragment, fragment.isVisible());
        }
        return this.k.a(context, com.bumptech.glide.a.a(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object objRemove;
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = message.arg1 == 1;
        int i = message.what;
        Handler handler = this.d;
        if (i == 1) {
            FragmentManager fragmentManager3 = (FragmentManager) message.obj;
            HashMap map = this.b;
            KR0 kr0 = (KR0) map.get(fragmentManager3);
            KR0 kr02 = (KR0) fragmentManager3.findFragmentByTag("com.bumptech.glide.manager");
            if (kr02 != kr0) {
                if (kr02 != null && kr02.d != null) {
                    throw new IllegalStateException("We've added two fragments with requests! Old: " + kr02 + " New: " + kr0);
                }
                if (z3 || fragmentManager3.isDestroyed()) {
                    if (Log.isLoggable("RMRetriever", 5)) {
                        fragmentManager3.isDestroyed();
                    }
                    kr0.a.a();
                } else {
                    FragmentTransaction fragmentTransactionAdd = fragmentManager3.beginTransaction().add(kr0, "com.bumptech.glide.manager");
                    if (kr02 != null) {
                        fragmentTransactionAdd.remove(kr02);
                    }
                    fragmentTransactionAdd.commitAllowingStateLoss();
                    handler.obtainMessage(1, 1, 0, fragmentManager3).sendToTarget();
                    fragmentManager2 = null;
                    objRemove = null;
                    z2 = true;
                    z = false;
                }
            }
            objRemove = map.remove(fragmentManager3);
            fragmentManager = fragmentManager3;
            z2 = true;
            fragmentManager2 = fragmentManager;
        } else if (i != 2) {
            z = false;
            fragmentManager2 = null;
            objRemove = null;
        } else {
            o oVar = (o) message.obj;
            HashMap map2 = this.c;
            B61 b61 = (B61) map2.get(oVar);
            B61 b612 = (B61) oVar.B("com.bumptech.glide.manager");
            if (b612 != b61) {
                if (b612 != null && b612.e != null) {
                    throw new IllegalStateException("We've added two fragments with requests! Old: " + b612 + " New: " + b61);
                }
                if (z3 || oVar.G) {
                    b61.a.a();
                } else {
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(oVar);
                    aVar.c(0, b61, "com.bumptech.glide.manager", 1);
                    if (b612 != null) {
                        aVar.i(b612);
                    }
                    aVar.g();
                    handler.obtainMessage(2, 1, 0, oVar).sendToTarget();
                    fragmentManager2 = null;
                    objRemove = null;
                    z2 = true;
                    z = false;
                }
            }
            objRemove = map2.remove(oVar);
            fragmentManager = oVar;
            z2 = true;
            fragmentManager2 = fragmentManager;
        }
        if (Log.isLoggable("RMRetriever", 5) && z && objRemove == null) {
            Objects.toString(fragmentManager2);
        }
        return z2;
    }

    public final JR0 i(l lVar) {
        if (AbstractC0121Bh1.i()) {
            return g(lVar.getApplicationContext());
        }
        if (lVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.j.getClass();
        C5332jY c5332jYE = lVar.e();
        Activity activityA = a(lVar);
        boolean z = activityA == null || !activityA.isFinishing();
        if (!((Map) this.f.b).containsKey(AbstractC7331u10.class)) {
            return l(lVar, c5332jYE, null, z);
        }
        Context applicationContext = lVar.getApplicationContext();
        return this.k.a(applicationContext, com.bumptech.glide.a.a(applicationContext), lVar.getLifecycle(), lVar.e(), z);
    }

    public final KR0 j(FragmentManager fragmentManager, android.app.Fragment fragment) {
        HashMap map = this.b;
        KR0 kr0 = (KR0) map.get(fragmentManager);
        if (kr0 != null) {
            return kr0;
        }
        KR0 kr02 = (KR0) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kr02 == null) {
            kr02 = new KR0();
            kr02.f = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                kr02.b(fragment.getActivity());
            }
            map.put(fragmentManager, kr02);
            fragmentManager.beginTransaction().add(kr02, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kr02;
    }

    public final B61 k(o oVar, Fragment fragment) {
        HashMap map = this.c;
        B61 b61 = (B61) map.get(oVar);
        if (b61 != null) {
            return b61;
        }
        B61 b612 = (B61) oVar.B("com.bumptech.glide.manager");
        if (b612 == null) {
            b612 = new B61();
            b612.f = fragment;
            if (fragment != null && fragment.getContext() != null) {
                Fragment parentFragment = fragment;
                while (parentFragment.getParentFragment() != null) {
                    parentFragment = parentFragment.getParentFragment();
                }
                o fragmentManager = parentFragment.getFragmentManager();
                if (fragmentManager != null) {
                    b612.s(fragment.getContext(), fragmentManager);
                }
            }
            map.put(oVar, b612);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(oVar);
            aVar.c(0, b612, "com.bumptech.glide.manager", 1);
            aVar.f(true);
            this.d.obtainMessage(2, oVar).sendToTarget();
        }
        return b612;
    }

    public final JR0 l(Context context, o oVar, Fragment fragment, boolean z) {
        B61 b61K = k(oVar, fragment);
        JR0 jr0D = b61K.e;
        if (jr0D == null) {
            jr0D = this.e.d(com.bumptech.glide.a.a(context), b61K.a, b61K.b, context);
            if (z) {
                jr0D.onStart();
            }
            b61K.e = jr0D;
        }
        return jr0D;
    }
}
