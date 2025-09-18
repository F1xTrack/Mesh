package p000;

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
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.C1719a;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import com.bumptech.glide.manager.C1876a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class NR0 implements Handler.Callback {

    /* renamed from: l */
    public static final C9937jt0 f7777l = new C9937jt0(20);

    /* renamed from: a */
    public volatile JR0 f7778a;

    /* renamed from: d */
    public final Handler f7781d;

    /* renamed from: e */
    public final MR0 f7782e;

    /* renamed from: f */
    public final C7978Mu0 f7783f;

    /* renamed from: j */
    public final InterfaceC1104RY f7787j;

    /* renamed from: k */
    public final C1876a f7788k;

    /* renamed from: b */
    public final HashMap f7779b = new HashMap();

    /* renamed from: c */
    public final HashMap f7780c = new HashMap();

    /* renamed from: g */
    public final C7119x8 f7784g = new C7119x8();

    /* renamed from: h */
    public final C7119x8 f7785h = new C7119x8();

    /* renamed from: i */
    public final Bundle f7786i = new Bundle();

    public NR0(MR0 mr0, C7978Mu0 c7978Mu0) {
        mr0 = mr0 == null ? f7777l : mr0;
        this.f7782e = mr0;
        this.f7783f = c7978Mu0;
        this.f7781d = new Handler(Looper.getMainLooper(), this);
        this.f7788k = new C1876a(mr0);
        this.f7787j = (F20.f3027h && F20.f3026g) ? ((Map) c7978Mu0.f7393b).containsKey(AbstractC11362v10.class) ? new ComponentCallbacks2C0473HV() : new C7408Bv0(14) : new C10212m12(12);
    }

    /* renamed from: a */
    public static Activity m5676a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m5676a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: c */
    public static void m5677c(List list, C7119x8 c7119x8) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                c7119x8.put(fragment.getView(), fragment);
                m5677c(fragment.getChildFragmentManager().f16215c.m10112f(), c7119x8);
            }
        }
    }

    /* renamed from: b */
    public final void m5678b(FragmentManager fragmentManager, C7119x8 c7119x8) {
        android.app.Fragment fragment;
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment2 : fragmentManager.getFragments()) {
                if (fragment2.getView() != null) {
                    c7119x8.put(fragment2.getView(), fragment2);
                    m5678b(fragment2.getChildFragmentManager(), c7119x8);
                }
            }
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Bundle bundle = this.f7786i;
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
                c7119x8.put(fragment.getView(), fragment);
                m5678b(fragment.getChildFragmentManager(), c7119x8);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    public final JR0 m5679d(Activity activity, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        KR0 kr0M5685j = m5685j(fragmentManager, fragment);
        JR0 jr0Mo5369d = kr0M5685j.f6108d;
        if (jr0Mo5369d == null) {
            jr0Mo5369d = this.f7782e.mo5369d(ComponentCallbacks2C1874a.m10883a(activity), kr0M5685j.f6105a, kr0M5685j.f6106b, activity);
            if (z) {
                jr0Mo5369d.onStart();
            }
            kr0M5685j.f6108d = jr0Mo5369d;
        }
        return jr0Mo5369d;
    }

    /* renamed from: e */
    public final JR0 m5680e(Activity activity) {
        if (AbstractC7381Bh1.m810i()) {
            return m5682g(activity.getApplicationContext());
        }
        if (activity instanceof AbstractActivityC1730l) {
            return m5684i((AbstractActivityC1730l) activity);
        }
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f7787j.getClass();
        FragmentManager fragmentManager = activity.getFragmentManager();
        Activity activityM5676a = m5676a(activity);
        return m5679d(activity, fragmentManager, null, activityM5676a == null || !activityM5676a.isFinishing());
    }

    /* renamed from: f */
    public final JR0 m5681f(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (AbstractC7381Bh1.m810i()) {
            return m5682g(fragment.getActivity().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            fragment.getActivity();
            this.f7787j.getClass();
        }
        return m5679d(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    /* renamed from: g */
    public final JR0 m5682g(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = AbstractC7381Bh1.f976a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC1730l) {
                return m5684i((AbstractActivityC1730l) context);
            }
            if (context instanceof Activity) {
                return m5680e((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m5682g(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f7778a == null) {
            synchronized (this) {
                try {
                    if (this.f7778a == null) {
                        this.f7778a = this.f7782e.mo5369d(ComponentCallbacks2C1874a.m10883a(context.getApplicationContext()), new C11370v32(7), new C8326Tm0(13), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f7778a;
    }

    /* renamed from: h */
    public final JR0 m5683h(Fragment fragment) {
        IL1.m3830d(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (AbstractC7381Bh1.m810i()) {
            return m5682g(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            fragment.getActivity();
            this.f7787j.getClass();
        }
        AbstractC1733o childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        if (!((Map) this.f7783f.f7393b).containsKey(AbstractC11234u10.class)) {
            return m5687l(context, childFragmentManager, fragment, fragment.isVisible());
        }
        return this.f7788k.m10892a(context, ComponentCallbacks2C1874a.m10883a(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
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
        Handler handler = this.f7781d;
        if (i == 1) {
            FragmentManager fragmentManager3 = (FragmentManager) message.obj;
            HashMap map = this.f7779b;
            KR0 kr0 = (KR0) map.get(fragmentManager3);
            KR0 kr02 = (KR0) fragmentManager3.findFragmentByTag("com.bumptech.glide.manager");
            if (kr02 != kr0) {
                if (kr02 != null && kr02.f6108d != null) {
                    throw new IllegalStateException("We've added two fragments with requests! Old: " + kr02 + " New: " + kr0);
                }
                if (z3 || fragmentManager3.isDestroyed()) {
                    if (Log.isLoggable("RMRetriever", 5)) {
                        fragmentManager3.isDestroyed();
                    }
                    kr0.f6105a.m1986a();
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
            AbstractC1733o abstractC1733o = (AbstractC1733o) message.obj;
            HashMap map2 = this.f7780c;
            B61 b61 = (B61) map2.get(abstractC1733o);
            B61 b612 = (B61) abstractC1733o.m10039B("com.bumptech.glide.manager");
            if (b612 != b61) {
                if (b612 != null && b612.f576e != null) {
                    throw new IllegalStateException("We've added two fragments with requests! Old: " + b612 + " New: " + b61);
                }
                if (z3 || abstractC1733o.f16206G) {
                    b61.f572a.m1986a();
                } else {
                    C1719a c1719a = new C1719a(abstractC1733o);
                    c1719a.mo10013c(0, b61, "com.bumptech.glide.manager", 1);
                    if (b612 != null) {
                        c1719a.m10018i(b612);
                    }
                    c1719a.m10016g();
                    handler.obtainMessage(2, 1, 0, abstractC1733o).sendToTarget();
                    fragmentManager2 = null;
                    objRemove = null;
                    z2 = true;
                    z = false;
                }
            }
            objRemove = map2.remove(abstractC1733o);
            fragmentManager = abstractC1733o;
            z2 = true;
            fragmentManager2 = fragmentManager;
        }
        if (Log.isLoggable("RMRetriever", 5) && z && objRemove == null) {
            Objects.toString(fragmentManager2);
        }
        return z2;
    }

    /* renamed from: i */
    public final JR0 m5684i(AbstractActivityC1730l abstractActivityC1730l) {
        if (AbstractC7381Bh1.m810i()) {
            return m5682g(abstractActivityC1730l.getApplicationContext());
        }
        if (abstractActivityC1730l.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f7787j.getClass();
        C6244jY c6244jYM10034e = abstractActivityC1730l.m10034e();
        Activity activityM5676a = m5676a(abstractActivityC1730l);
        boolean z = activityM5676a == null || !activityM5676a.isFinishing();
        if (!((Map) this.f7783f.f7393b).containsKey(AbstractC11234u10.class)) {
            return m5687l(abstractActivityC1730l, c6244jYM10034e, null, z);
        }
        Context applicationContext = abstractActivityC1730l.getApplicationContext();
        return this.f7788k.m10892a(applicationContext, ComponentCallbacks2C1874a.m10883a(applicationContext), abstractActivityC1730l.getLifecycle(), abstractActivityC1730l.m10034e(), z);
    }

    /* renamed from: j */
    public final KR0 m5685j(FragmentManager fragmentManager, android.app.Fragment fragment) {
        HashMap map = this.f7779b;
        KR0 kr0 = (KR0) map.get(fragmentManager);
        if (kr0 != null) {
            return kr0;
        }
        KR0 kr02 = (KR0) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kr02 == null) {
            kr02 = new KR0();
            kr02.f6110f = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                kr02.m4644b(fragment.getActivity());
            }
            map.put(fragmentManager, kr02);
            fragmentManager.beginTransaction().add(kr02, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f7781d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kr02;
    }

    /* renamed from: k */
    public final B61 m5686k(AbstractC1733o abstractC1733o, Fragment fragment) {
        HashMap map = this.f7780c;
        B61 b61 = (B61) map.get(abstractC1733o);
        if (b61 != null) {
            return b61;
        }
        B61 b612 = (B61) abstractC1733o.m10039B("com.bumptech.glide.manager");
        if (b612 == null) {
            b612 = new B61();
            b612.f577f = fragment;
            if (fragment != null && fragment.getContext() != null) {
                Fragment parentFragment = fragment;
                while (parentFragment.getParentFragment() != null) {
                    parentFragment = parentFragment.getParentFragment();
                }
                AbstractC1733o fragmentManager = parentFragment.getFragmentManager();
                if (fragmentManager != null) {
                    b612.m498s(fragment.getContext(), fragmentManager);
                }
            }
            map.put(abstractC1733o, b612);
            C1719a c1719a = new C1719a(abstractC1733o);
            c1719a.mo10013c(0, b612, "com.bumptech.glide.manager", 1);
            c1719a.m10015f(true);
            this.f7781d.obtainMessage(2, abstractC1733o).sendToTarget();
        }
        return b612;
    }

    /* renamed from: l */
    public final JR0 m5687l(Context context, AbstractC1733o abstractC1733o, Fragment fragment, boolean z) {
        B61 b61M5686k = m5686k(abstractC1733o, fragment);
        JR0 jr0Mo5369d = b61M5686k.f576e;
        if (jr0Mo5369d == null) {
            jr0Mo5369d = this.f7782e.mo5369d(ComponentCallbacks2C1874a.m10883a(context), b61M5686k.f572a, b61M5686k.f573b, context);
            if (z) {
                jr0Mo5369d.onStart();
            }
            b61M5686k.f576e = jr0Mo5369d;
        }
        return jr0Mo5369d;
    }
}
