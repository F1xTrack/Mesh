package com.dylanvann.fastimage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.io.File;
import p000.AbstractC7381Bh1;
import p000.C11490w10;
import p000.C7119x8;
import p000.F20;
import p000.IL1;
import p000.JR0;
import p000.NR0;

/* loaded from: classes.dex */
public final class GlideApp {
    private GlideApp() {
    }

    @SuppressLint({"VisibleForTests"})
    public static void enableHardwareBitmaps() {
        F20 f20M2487a = F20.m2487a();
        f20M2487a.getClass();
        AbstractC7381Bh1.m802a();
        f20M2487a.f3036f.set(true);
    }

    public static ComponentCallbacks2C1874a get(Context context) {
        return ComponentCallbacks2C1874a.m10883a(context);
    }

    public static File getPhotoCacheDir(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        File file = new File(cacheDir, "image_manager_disk_cache");
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @SuppressLint({"VisibleForTests"})
    @Deprecated
    public static void init(ComponentCallbacks2C1874a componentCallbacks2C1874a) {
        synchronized (ComponentCallbacks2C1874a.class) {
            try {
                if (ComponentCallbacks2C1874a.f17771i != null) {
                    ComponentCallbacks2C1874a.m10887f();
                }
                ComponentCallbacks2C1874a.f17771i = componentCallbacks2C1874a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static void tearDown() {
        ComponentCallbacks2C1874a.m10887f();
    }

    public static GlideRequests with(Context context) {
        return (GlideRequests) ComponentCallbacks2C1874a.m10888h(context);
    }

    @Deprecated
    public static GlideRequests with(Activity activity) {
        return (GlideRequests) ComponentCallbacks2C1874a.m10885c(activity).m5680e(activity);
    }

    public static File getPhotoCacheDir(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static GlideRequests with(AbstractActivityC1730l abstractActivityC1730l) {
        return (GlideRequests) ComponentCallbacks2C1874a.m10885c(abstractActivityC1730l).m5684i(abstractActivityC1730l);
    }

    @SuppressLint({"VisibleForTests"})
    public static void init(Context context, C11490w10 c11490w10) {
        GeneratedAppGlideModule generatedAppGlideModuleM10884b = ComponentCallbacks2C1874a.m10884b(context);
        synchronized (ComponentCallbacks2C1874a.class) {
            try {
                if (ComponentCallbacks2C1874a.f17771i != null) {
                    ComponentCallbacks2C1874a.m10887f();
                }
                ComponentCallbacks2C1874a.m10886d(context, c11490w10, generatedAppGlideModuleM10884b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static GlideRequests with(Fragment fragment) {
        return (GlideRequests) ComponentCallbacks2C1874a.m10885c(fragment.getContext()).m5683h(fragment);
    }

    @Deprecated
    public static GlideRequests with(android.app.Fragment fragment) {
        return (GlideRequests) ComponentCallbacks2C1874a.m10885c(fragment.getActivity()).m5681f(fragment);
    }

    public static GlideRequests with(View view) {
        JR0 jr0M5681f;
        NR0 nr0M10885c = ComponentCallbacks2C1874a.m10885c(view.getContext());
        nr0M10885c.getClass();
        if (AbstractC7381Bh1.m810i()) {
            jr0M5681f = nr0M10885c.m5682g(view.getContext().getApplicationContext());
        } else {
            IL1.m3830d(view.getContext(), "Unable to obtain a request manager for a view without a Context");
            Activity activityM5676a = NR0.m5676a(view.getContext());
            if (activityM5676a == null) {
                jr0M5681f = nr0M10885c.m5682g(view.getContext().getApplicationContext());
            } else if (activityM5676a instanceof AbstractActivityC1730l) {
                AbstractActivityC1730l abstractActivityC1730l = (AbstractActivityC1730l) activityM5676a;
                C7119x8 c7119x8 = nr0M10885c.f7784g;
                c7119x8.clear();
                NR0.m5677c(abstractActivityC1730l.m10034e().f16215c.m10112f(), c7119x8);
                View viewFindViewById = abstractActivityC1730l.findViewById(android.R.id.content);
                Fragment fragment = null;
                while (!view.equals(viewFindViewById) && (fragment = (Fragment) c7119x8.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                c7119x8.clear();
                jr0M5681f = fragment != null ? nr0M10885c.m5683h(fragment) : nr0M10885c.m5684i(abstractActivityC1730l);
            } else {
                C7119x8 c7119x82 = nr0M10885c.f7785h;
                c7119x82.clear();
                nr0M10885c.m5678b(activityM5676a.getFragmentManager(), c7119x82);
                View viewFindViewById2 = activityM5676a.findViewById(android.R.id.content);
                android.app.Fragment fragment2 = null;
                while (!view.equals(viewFindViewById2) && (fragment2 = (android.app.Fragment) c7119x82.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                c7119x82.clear();
                if (fragment2 == null) {
                    jr0M5681f = nr0M10885c.m5680e(activityM5676a);
                } else {
                    jr0M5681f = nr0M10885c.m5681f(fragment2);
                }
            }
        }
        return (GlideRequests) jr0M5681f;
    }
}
